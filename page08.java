import java.util.Arrays;
import java.util.Scanner;

public class page08 {
    public static void main(String[] args) {
        int num1 = 0 , num2 =0, max = 10 , random = 0 , count = 0;

        System.out.print("요소 수 : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        String arrA[][] = new String[10][num1];
        int arrB[] = new int[num1];

        for(int i = 0 ; i<num1 ; i++){
            random=(int)(Math.random()*10)+1;
            arrB[i]=random;
        }

        System.out.println(Arrays.toString(arrB));

        for(int i = 0 ; i<num1 ; i++){
            count=max-arrB[i];

            for(int j = 0 ; j<10 ; j++){
                if (j<count) {
                    arrA[j][i]="";
                }
                else if (j>=count){
                    arrA[j][i]="*";
                }
            }
        }

        for(int i = 0 ; i<10 ; i++){
            for(int j = 0 ; j<num1 ; j++){
                if (j==0) {
                    System.out.printf("\n%s ",arrA[i][j]);
                }else if(j>0) {
                    System.out.printf("%3s ",arrA[i][j]);
                }
            }
        }


        System.out.println();


        for(int i = 0 ; i<num1 ; i++){
            System.out.print("-----");
        }

        System.out.println();

        for(int i = 0 ; i<num1 ; i++){
            if (num2==0) {
                System.out.printf("%d", num2);
            }
            if(num2>0){
                System.out.printf("%4d", num2%10);
            }
            num2++;
        }
        sc.close();
    }
}
