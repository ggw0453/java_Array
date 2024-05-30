import java.util.Scanner;

public class page13 {
    public static void main(String[] args) {
        int ran = 0 , num1 = 90 , check=0;
        Scanner sc = new Scanner(System.in);
        String day[][] = {
            {"일요일","sunday"},
            {"월요일","monday"},
            {"화요일","tuesday"},
            {"수요일","wednesday"},
            {"목요일","thursday"},
            {"금요일","friday"},
            {"토요일","saturday"}
        };

        System.out.println("요일명을 영어 소문자로 입력하시오");

        ran = (int)(Math.random()*7);
        while (check==0) {
            while (ran==num1){
                ran = (int)(Math.random()*7);
            }
            num1 = ran;
            System.out.printf("%s :",day[num1][0]);

            String eng = sc.nextLine();

            if (eng.equals(day[num1][1])) {
                System.out.println("정답입니다. 다시한번?1..yes/2..no");
                int num2 = sc.nextInt();
                if (num2==1) {
                    eng = sc.nextLine();
                }else if (num2==2) {
                    check=1;
                }
            }else {
                System.out.println("오답입니다. 다시한번?1..yes/2..no");
                int num2 = sc.nextInt();
                if (num2==1) {
                    eng = sc.nextLine();
                }else if (num2==2) {
                    check=1;
                }
            }
        }
        sc.close();
    }
}
