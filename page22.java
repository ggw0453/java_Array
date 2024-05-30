import java.util.Scanner;

public class page22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소 수:");
        int num1=sc.nextInt();
        int arrA[]=new int[num1];

        for(int i = 0 ; i<arrA.length ; i++){
            System.out.printf("arrA[%d] = ",i);
            int num2=sc.nextInt();
            arrA[i]=num2;
        }

        System.out.print("arrA ={");

        for(int i = 0 ; i<arrA.length ; i++){
            if (i<arrA.length-1) {
                System.out.printf("%d,",arrA[i]);
            }
            if (i==arrA.length-1) {
                System.out.printf("%d}",arrA[i]);
            }
        }
        sc.close();
    }
}
