package SumDiagonalOfSquareArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

//        Nhập số hàng ,cột cho mảng 2 chiều vuông
        System.out.println("Nhập vào số hàng và cột của mảng 2 chiều : ");
        size = sc.nextInt();
        float[][] arr = new float[size][size];
//        Nhập giá trị cho từng phần tử trong mảng
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập vào giá trị của phần tử dòng " + (i + 1) + " cột " + (j + 1) + " trong mảng ");
                arr[i][j] = sc.nextFloat();
            }
        }
//        In mảng lên màn hình
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%-10.2f", arr[i][j]);
            }
            System.out.println("");
        }
//        Tính tổng chéo
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
                sum += arr[i][i];
        }
        System.out.println("Tổng các phần tử đường chéo chính là " + sum);
    }
}
