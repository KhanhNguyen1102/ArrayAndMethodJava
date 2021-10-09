package SumOneColumn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row ;
        int column;
//        Nhập số hàng số cột cho mảng 2 chiều
        System.out.println("Nhập vào số hàng của mảng 2 chiều : ");
        row = sc.nextInt();
        System.out.println("Nhập vào số cột của mảng 2 chiều : ");
        column = sc.nextInt();
        float[][] arr = new float[row][column];
//        Nhập giá trị cho từng phần tử trong mảng
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập vào giá trị của phần tử dòng " + (i+1) + " cột " + (j+1) + " trong mảng " );
                arr[i][j] = sc.nextFloat();
            }
        }
//        In mảng lên màn hình
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%-10.2f",arr[i][j]);
            }
            System.out.println("");
        }
//        Tính tổng cột
        System.out.println("Bạn muốn tính tổng cột thứ mấy");
        int column1 = sc.nextInt();
        float sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][column1-0];
        }
        System.out.println("Tổng các phần tử cột " + column1 + " là " + sum);
    }
}
