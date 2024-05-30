import java.util.Arrays;
import java.util.Scanner;

public class page06 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0; 
        double num3 = 0 , sum1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 길이를 입력하시오");

        num1 = sc.nextInt();
        double dnum[] = new double [num1];
        System.out.println("dnum 배열의 길이"+num1);

        System.out.println("초기화 하지 않은 dnum[]의 값 : "+ Arrays.toString(dnum));

        System.out.println("각 배열의 값을 입력하십시오");
        for (int i = 0 ; i<dnum.length ; i++){

            System.out.printf("dnum[%d] 번째 데이터 입력 : ", num2);
            num3 = sc.nextDouble();
            dnum[i] = num3;
            
            sum1 += num3;
            
            num2++;
        }
        sc.close();

        System.out.printf("배열의 합은 %.1f 입니다\n",sum1);

        System.out.printf("배열값의 평균은 %.1f 입니다", sum1/num1);

    }
}
