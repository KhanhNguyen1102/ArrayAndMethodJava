package FindMinInArray;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length ; i++) {
                arr[i] = (int)(Math.random() * 100);
        }
        int min = arr[0];
        System.out.println("Mảng gồm các phần tử : ");
        for (int i = 0; i < arr.length; i++) {
                System.out.printf("%-6s",arr[i]);
                if (arr[i] < min) {
                    min = arr[i];
                }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là " + min);
    }
}
