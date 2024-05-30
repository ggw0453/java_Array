import java.util.Scanner;

public class page02 {
    public static void main(String[] args) {
        String language = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("3개의 문자열을 입력하세요");
        String []arrA = new String[3];
        

        for (int i = 0; i < arrA.length; i++) {
            language = sc.nextLine();
            arrA[i]=language;
        }
        System.out.printf("%s %s %s", arrA[0],arrA[1],arrA[2]);
        sc.close();
    }
}

