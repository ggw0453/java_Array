import java.util.Scanner;

public class page09 {
    public static void main(String[] args) {
        int class_room = 1 , class_student = 1;
        double sum1 = 0 , sum2 = 0;
        Scanner sc = new Scanner(System.in);
        double arrA[][]=new double[2][3];

        System.out.print("학급 수 :");
        int num1 = sc.nextInt();

        for(int i = 0 ; i < num1 ; i++){
            System.out.printf("%d 반의 학생 수 : ", class_room);
            int num2 = sc.nextInt();
            
            class_student=1;

            for(int j = 0 ; j < num2 ; j++){

                System.out.printf("%d반 %d번의 점수 : ", class_room, class_student);
                double num3 = sc.nextInt();

                arrA[i][j]=num3;

                if (i==0) {
                    sum1 += arrA[i][j];
                }
                else if (i==1) {
                    sum2 += arrA[i][j];
                }
                class_student++;
            }
            class_room++;
        }

        System.out.printf("%2s : %1s %1s\n","반","합계","평균");
        System.out.println("-----------------------");
        System.out.printf("%1s : %.0f %1.1f\n","1반",sum1,sum1/3);
        System.out.printf("%1s : %.0f %1.1f\n","2반",sum2,sum2/2);
        System.out.println("-----------------------");
        System.out.printf("%2s : %.0f %1.1f","합",sum1+sum2,(sum1+sum2)/5);

        sc.close();
    }
}
