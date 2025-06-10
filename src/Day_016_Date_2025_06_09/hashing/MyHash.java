package Day_016_Date_2025_06_09.hashing;
import java.util.*;
public class MyHash {

	public static void main(String[] args) {
		MyHash mh = new MyHash();
        mh.insert(10);
        mh.insert(3);
        mh.insert(17);
        mh.display();

        mh.delete(10);
        System.out.println("After deletion:");
        mh.display();
		
	}
	
	int bucket = 7;
	
	LinkedList<Integer>[] list= new LinkedList[bucket];
	
	public MyHash() {
		for(int i=0; i<bucket; i++) {
			list[i] = new LinkedList<>();
		}
	}
	
	void insert(int num) {
		int i = num%bucket;
		
		list[i].add(num);
	}
	
	void delete(int num) {
		int i= num%bucket;
		for(int j=0; j<list[i].size(); j++) {
			if(num==list[i].get(j)) {
				list[i].remove(j);
			}
		}
	}
	
	void display() {
		for(int i=0; i<bucket; i++) {
			System.out.print(i+" : ");
			for(int val: list[i]) {
				System.out.print(val+" -> ");
			}
			System.out.println("null");
		}
	}
}
