import java.util.Arrays;
import java.util.Scanner;

public class page10 {
    public static void main(String[] args) {
        int num3 = 0 , max = 0 , num4 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("불규칙한 2차원 배열을 생성합니다");
        System.out.print("행 수 : ");
        
        int num1 = sc.nextInt();
        
        for(int i = 0 ; i < num1 ; i++){
            System.out.printf("%d행째의 열 수 : ", i);
            int num2 = sc.nextInt();
            num3=num2;
            if (max<num3) {
                max=num3;
            }
        }
        int arrA[][] = new int [num1][max];
        System.out.println("각 요소의 값을 입력하세요");

        System.out.println(Arrays.deepToString(arrA));

        for(int i = 0 ; i<1 ; i++){
            for(int j = 0 ; j<5 ; j++){
                System.out.printf("c[%d][%d] : ",i,j);
                num4 = sc.nextInt();
                arrA[i][j]=num4;
            }
        }
        for(int i = 1 ; i<2 ; i++){
            for(int j = 0 ; j<3 ; j++){
                System.out.printf("c[%d][%d] : ",i,j);
                num4 = sc.nextInt();
                arrA[i][j]=num4;
            }
        }
        for(int i = 2 ; i<3 ; i++){
            for(int j = 0 ; j<4 ; j++){
                System.out.printf("c[%d][%d] : ",i,j);
                num4 = sc.nextInt();
                arrA[i][j]=num4;
            }
        }

        for(int i = 0 ; i<num1 ; i++){
            for(int j = 0 ; j<max ; j++){
                if (j==0 && arrA[i][j]!=0) {
                    System.out.printf("%d",arrA[i][j]);
                }else if (j>0 && arrA[i][j]!=0) {
                    System.out.printf("%4d",arrA[i][j]);
                }
                if (j==4) {
                    System.out.println();
                }
            }
        }

        System.out.println(Arrays.deepToString(arrA));
        sc.close();
    }
}
