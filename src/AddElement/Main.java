package AddElement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {10,4,6,8,0,0,0,0,0};
        printArr(arr1);
        int choice;
        do{
            System.out.println("Menu.");
            System.out.println("1. Thêm 1 phần tử");
            System.out.println("2. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Nhập vào phần tử cần thêm : ");
                    int x = sc.nextInt();
                    System.out.println("Nhập vào vị trí muốn chèn : ");
                    int index = sc.nextInt();
                    addElement(x,index,arr1);
                    break;
                }
                case 2:{
                    System.exit(0);
                }
            }
        }while (choice!=0);

    }
    public static void addElement( int num ,int index, int[] arr){
       if (index<= -1 || index >= arr.length -1){
           System.out.println("Không chèn được phần tử vào mảng");
        }else {
           for (int i = arr.length -1; i > index ; i--) {
               arr[i] = arr[i - 1];
           }
           arr[index] = num;
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
