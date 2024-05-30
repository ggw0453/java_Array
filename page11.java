import java.util.Scanner;

public class page11 {
    public static void main(String[] args) {
        int student = 0;
        double kor = 0 , math = 0 , average = 0 , kor_sum = 0 , math_sum = 0, kor_average=0 , math_average=0;
        double arrA[][] = new double[6][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("6명의 국어, 수학 점수를 입력하세요");

        for(int i = 0 ; i<6 ; i++){
            student++;
            System.out.printf("%d번 국어: ",student);
            kor = sc.nextInt();
            System.out.printf("%6s: ","수학");
            math = sc.nextInt();
            
            average=(kor+math)/2;

            arrA[i][0]=student;
            arrA[i][1]=kor;
            arrA[i][2]=math;
            arrA[i][3]=average;
        }
        System.out.println("N0. 국어 수학 평균");

        for(int i = 0 ; i<6 ; i++){
            kor_sum+=arrA[i][1];
            math_sum+=arrA[i][2];

            kor_average=kor_sum/6;
            math_average=math_sum/6;

            System.out.printf("%2.0f %4.0f %4.0f %5.1f\n",arrA[i][0],arrA[i][1],arrA[i][2],arrA[i][3]);
        }
        System.out.printf("평균 %.1f %.1f",kor_average,math_average);
    sc.close();        
    }
}
