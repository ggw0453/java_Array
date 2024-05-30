import java.util.Arrays;
import java.util.Scanner;

public class page12 {
    public static void main(String[] args) {
        int arrAll[][] = new int [4][4];
        int a[][] = new int [4][3];
        int b[][] = new int [3][4];
        Scanner sc = new Scanner(System.in);

        System.out.println("행렬 a의 요소를 입력하세요");
        for(int i = 0 ; i<4 ; i++){
            for(int j = 0 ; j<3 ; j++){
                System.out.printf("a[%d][%d] : ",i,j);
                int num1 = sc.nextInt();
                a[i][j]=num1;
            }
        }
        System.out.println("행렬 b의 요소를 입력하세요");
        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<4 ; j++){
                System.out.printf("b[%d][%d] : ",i,j);
                int num2 = sc.nextInt();
                b[i][j]=num2;
            }
        }
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(b));

        System.out.println("행렬 a와 b의 곱");
        for(int i = 0 ; i<4 ; i++){
            for(int j = 0 ; j<4 ; j++){
                arrAll[i][j]=(a[i][0]*b[0][j])+(a[i][1]*b[1][j])+(a[i][2]*b[2][j]);
                System.out.printf("%4d",arrAll[i][j]);
                if (j==3) {
                    System.out.println();
                }                
            }
        }
        sc.close();
    }
}
