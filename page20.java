import java.util.Scanner;

public class page20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arrA[] = {22,57,11,32,91,32,70};
        for(int i = 0 ; i<arrA.length ; i++){
            System.out.printf("arrA[%d] = %d\n",i,arrA[i]);
        }
        System.out.print("찾을 숫자 : ");
        int num1 = sc.nextInt();

        for(int i = 0 ; i<arrA.length ; i++){
            if(arrA[i]==num1){
                System.out.printf("그 값은 arrA[%d]에 있습니다",i);
            }
        }
        sc.close();
    }
}
