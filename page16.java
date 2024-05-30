import java.util.Scanner;

public class page16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0 , num2 = 11 , num3 = 0;
        System.out.print("요소 수 :");

        num1=sc.nextInt();
        int arrA[]= new int[num1];
        int arrB[]= new int[num1];

        for(int i = 0 ; i<arrA.length ; i++){
            arrA[i]=num2;
            num2++;
            System.out.printf("a[%d] = %d\n",i,arrA[i]);
        }

        System.out.println("a의 모든 요소를 역순으로 복사했습니다");

        for(int i = num1-1 ; i>=0 ; i--){
            arrB[num3]=arrA[i];
            System.out.printf("b[%d] = %d\n",num3,arrB[num3]);
            num3++;
        }
        
        sc.close();
    }
}
