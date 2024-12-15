package Day_007_Date_2024_08_13.TCS_IPA.question_3;
import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Course[] c=new Course[4];

        for(int i=0;i<4;i++){

            int courseId=sc.nextInt();
            sc.nextLine();
            String courseName=sc.nextLine();
            String courseAdmin=sc.nextLine();
            int quiz=sc.nextInt();
            int handson=sc.nextInt();
            c[i]=new Course(courseId,courseName,courseAdmin,quiz,handson);

        }
        String Admin=sc.nextLine();
        int a=sc.nextInt();

        int avg=findAvgOfQuizByAdmin(c,Admin);
        if(avg!=0){
            System.out.println(avg);

        }
        else{
            System.out.println("not found");
        }
    }
    public static int findAvgOfQuizByAdmin(Course[] c , String Admin){
        int avg=0;
        int sum=0;
        int count=0;
        for(int i=0;i<4;i++){
            sum+= c[i].getquiz();
            count++;
        }
        avg=sum/count;
        return avg;
    }
}
class Course{
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;
    Course(int courseId,String courseName,String courseAdmin,int quiz,int handson){
        this.courseId=courseId;
        this.courseName=courseName;
        this.courseAdmin=courseAdmin;
        this.quiz=quiz;
        this.handson=handson;
    }
    public void setcourseId(int courseId){
        this.courseId=courseId;
    }
    public int getcourseId(){
        return courseId;
    }
    public void setcourseName(String courseName){
        this.courseName=courseName;
    }
    public String getcourseName(){
        return courseName;
    }
    public void setcourseAdmin(String courseAdmin){
        this.courseAdmin=courseAdmin;
    }
    public String getcourseAdmin(){
        return courseAdmin;
    }
    public void setquiz(int quiz){
        this.quiz=quiz;
    }
    public int getquiz(){
        return quiz;
    }
    public void sethandson(int handson){
        this.handson=handson;
    }
    public int gethandson(){
        return handson;
    }
}
