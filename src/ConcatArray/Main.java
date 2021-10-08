package ConcatArray;

import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr3 = new int[arr1.length + arr2.length];
        System.out.println("Mảng 1 có " + arr1.length + " phần tử");
        System.out.println("Mảng 2 có " + arr2.length + " phần tử");
        addElement(arr1);
        printArray(arr1);
        addElement(arr2);
        printArray(arr2);
        arr3=concatArray(arr1,arr2);
        printArray(arr3);
    }
    public static void addElement(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập giá trị cho phần tử thứ " + (i+1) + " của mảng :" );
            arr[i] = sc.nextInt();
        }
    }
    public static void printArray(int[] arr){
        System.out.println("Mảng gồm các phần tử : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }
        System.out.println("");
    }
    public static int[] concatArray(int[] arr1,int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i <arr1.length ; i++) {
            arr3[i]= arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr3[arr1.length+i]=arr2[i];
        }
        return arr3;
    }
}
