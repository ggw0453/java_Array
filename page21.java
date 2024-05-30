import java.util.Scanner;

public class page21 {
    public static void main(String[] args) {
        
        double sum=0,  max=0 , min=0 , num2=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("사람 수 : ");
        int people = sc.nextInt();
        double arrA[]= new double[people];
        System.out.println("점수를 입력하세요");
        for(int i = 0 ; i<arrA.length ; i++){
            System.out.printf("%d번의 점수 : ",i+1);
            double num1 = sc.nextInt();
            arrA[i]=num1;
            sum+=arrA[i];
            max=arrA[0];
            if (max<arrA[i]) {
                max=arrA[i];
            }
            min=arrA[0];
            if (min>arrA[i]){
                num2=arrA[i];
            }
            min=num2;
        }
        System.out.printf("합계는 %.0f 점 입니다.\n", sum);
        System.out.printf("평균은 %.1f 점 입니다.\n", sum/people);
        System.out.printf("최고점은 %.0f 점 입니다\n", max);
        System.out.printf("최저점은 %.0f 점 입니다", min);
        sc.close();
    }
}
