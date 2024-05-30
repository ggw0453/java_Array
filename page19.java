import java.util.Scanner;

public class page19 {
    public static void main(String[] args) {
        int num1 = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("요소 수 : ");
        num1 = sc.nextInt();

        int arrA[]=new int[num1];
        
        for(int i = 0 ; i<arrA.length ; i++){
            arrA[i]=(int)(Math.random()*10)+1;
            for(int j = 0 ; j<i ; j++){
                if (arrA[i]==arrA[j]) {
                    i--;
                }
            }
        }

        for(int i = 0 ; i<arrA.length ; i++){
            System.out.printf("arrA[%d] = %d\n",i ,arrA[i]);
        }
        sc.close();
    }
}
