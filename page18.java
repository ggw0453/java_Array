import java.util.Scanner;

public class page18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소 수 :");
        int num1 = sc.nextInt();

        int arrA[]= new int[num1];

        for(int i = 0 ; i<arrA.length ; i++){
            int num2 = (int)(Math.random()*10)+1;
            arrA[i]=num2;
            System.out.printf("a[%d] = %d\n",i , arrA[i]);
        }
        sc.close();
    }
}
