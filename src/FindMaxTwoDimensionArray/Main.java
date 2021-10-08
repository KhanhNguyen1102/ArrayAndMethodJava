package FindMaxTwoDimensionArray;

public class Main {
    public static void main(String[] args) {
        float[][] arr = new float[5][5];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                arr[i][j] = (float)(Math.random() * 100);
            }
        }
        float max = arr[0][0];
        System.out.println("Mảng gồm các phần tử : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%-20.2f",arr[i][j]);
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("Phần tử lớn nhất trong mảng là " + max);
    }
}
