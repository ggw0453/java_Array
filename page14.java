import java.util.Scanner;

public class page14 {
    public static void main(String[] args) {
        int ran = 0 , check1=0 , check2=0 , num2 = 0;
        String anser = "";
        Scanner sc = new Scanner(System.in);
        String daykor[]= {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
        String dayeng[]= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};

        System.out.println("요일명을 영어 소문자로 입력하시오");

        while (check1==0){
            ran=(int)(Math.random()*7);
            System.out.printf("%s : ",daykor[ran]);
            anser=sc.nextLine();
            int num1 = ran;
            while (check2==0){
                if (anser.equals(dayeng[ran])) {
                    System.out.println("정답입니다. ");
                    check2=1;
                }else{
                    System.out.println("오답입니다. 어떻게 할까요? 1..재입력/2..정답보기");
                    num2 = sc.nextInt();
                    if (num2==1) {
                        anser=sc.nextLine();
                    }else if (num2==2) {
                        System.out.printf("정답은 %s입니다\n",dayeng[num1]);
                        check2=1;
                    }
                }

            }
            System.out.println("다시할까요?1..재시작/2..종료");
            num2 = sc.nextInt();
            if (num2==1) {
                check2=0;
                anser=sc.nextLine();
            }else if (num2==2) {
                check1=1;
            }
        }
        sc.close();
    }
}
