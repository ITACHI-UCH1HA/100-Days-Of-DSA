package day_027_date_2025_09_27.leetcode;

import java.util.Arrays;

public class LargestTriangleArea {
    public static void main(String[] args) {
        int[][] points = {{0,0},{0,1},{1,0},{0,2},{2,0}, {2,3}, {1,3}};
        System.out.println(largestTriangleArea(points));
    }
    public static double largestTriangleArea(int[][] points) {
        int x1 = 0, y2 = 0, x2 = 0, y1 = 0, x3 = Integer.MAX_VALUE, y3 = Integer.MAX_VALUE;

        int len = points.length;

        for (int i = 0; i < len; i++) {
            if(points[i][1]!=0 && points[i][1]>y2){
                x2 = points[i][0];
                y2= points[i][1];
            }
            if(points[i][0]!=0 && points[i][0]>x1){
                y1 = points[i][1];
                x1 = points[i][0];
            }

            if(points[i][0]<= x3 || points[i][1]<=y3){

            }
        }

        System.out.println(x1+" "+y1);
        System.out.println(x2+" "+y2);
        System.out.println(x3+" "+y3);
        double area = (double) Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2;
        return area;
    }
}
