import java.util.Scanner;

public class page15 {
    public static void main(String[] args) {
        int check1=0, check2=0, num1=0 , num2=0;
        Scanner sc = new Scanner(System.in);
        String arrA[][] = {
            {"1월","January"},
            {"2월","February"},
            {"3월","March"},
            {"4월","April"},
            {"5월","May"},
            {"6월","June"},
            {"7월","July"},
            {"8월","August"},
            {"9월","September"},
            {"10월","October"},
            {"11월","November"},
            {"12월","December"}
        };

        System.out.println("해당 월의 영어 단어를 입력하시오.");
        System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
        while (check1==0) {
            num1 = (int)(Math.random()*12);
            System.out.printf("%s : ",arrA[num1][0]);
            String answer = sc.nextLine();

            while (check2==0) {
                if (answer.equals(arrA[num1][1])) {
                    System.out.println("정답입니다.");
                    check2=1;
                }else {
                    System.out.println("틀렸습니다");
                    check2=1;
                }
            }

            System.out.println("다시한번? 1..yes/2..no");
            num2=sc.nextInt();
            if (num2==1) {
                check2=0;
                answer=sc.nextLine();
            }else if(num2==2){
                check1=1;
            }

        }
        sc.close();
    }
}
