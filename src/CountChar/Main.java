package CountChar;

public class Main {
    public static void main(String[] args) {
        String str = "Don't worry be happy";
        char a = 'r';
        int count = 0 ;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a){
                count++;
            }
        }
        System.out.println("Kí tự "+a+" xuất hiện " + count + " lần trong chuỗi");
    }
}
