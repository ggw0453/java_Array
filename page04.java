import java.util.Scanner;

public class page04 {
    public static void main(String[] args) {
        int num1 = 0;
        double sum1 = 0, sum2 = 0;
        Scanner sc = new Scanner(System.in);
        int arrA[][] = new int[2][2];

        System.out.println("점수를 입력하시오");

        for(int i = 0 ; i<arrA.length ; i++){
            for(int j = 0 ; j<2 ; j++){
                num1=sc.nextInt();
                arrA[i][j] = num1;

                if(i==0){
                    sum1 = arrA[i][0] + arrA[i][1];
                }else if (i==1) {
                    sum2 = arrA[i][0] + arrA[i][1];
                }
            }
        }

        System.out.println("학생번호 1");
        System.out.printf("국어점수 : %d\n수학점수 : %d\n", arrA[0][0], arrA[0][1]);
        System.out.println("학생번호 2");
        System.out.printf("국어점수 : %d\n수학점수 : %d\n", arrA[1][0], arrA[1][1]);
        System.out.println("학생번호 1");
        System.out.printf("국어점수 : %d 수학점수 : %d 평균 : %.1f\n", arrA[0][0], arrA[0][1], sum1/2);
        System.out.println("학생번호 2");
        System.out.printf("국어점수 : %d 수학점수 : %d 평균 : %.1f", arrA[1][0], arrA[1][1], sum2/2);


        sc.close();

    }
}
