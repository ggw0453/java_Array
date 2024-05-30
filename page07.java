public class page07 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 0;
        
        int arrA[][] = new int[4][5];
        for (int i = 0; i<3 ; i++){            
            num2+=1;
            if (i>0) {
                System.out.println();
            }
            System.out.printf("%d번째 2차원 배열\n",num2);
            for (int j = 0 ; j<arrA.length ; j++){
                for (int k = 0 ; k<5 ; k++){
                        num1+=1;
                        arrA[j][k]=num1;
                        System.out.printf("%d ",arrA[j][k]);
                }
                System.out.println();
            }
        }
    }
}
