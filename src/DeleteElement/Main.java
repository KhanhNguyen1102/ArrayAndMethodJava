package DeleteElement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        printArr(arr);
        int choice;
        do{
            System.out.println("Menu.");
            System.out.println("1. Xóa 1 phần tử");
            System.out.println("2. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Nhập vào phần tử cần xóa : ");
                    int x = sc.nextInt();
                    deleteElement(x,arr);
                    break;
                }
                case 2:{
                    System.exit(0);
                }
            }
        }while (choice!=0);

    }
    public static void deleteElement( int num , int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                for (int j = i; j < arr.length -1 ; j++) {
                    arr[j] = arr[j+1];
                }
                arr[arr.length-1] = 0;
                i--;
            }
        }
        printArr(arr);
    }
    public static void printArr(int[] arr){
        System.out.println("Các phần tử trong dãy : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
    }



}
