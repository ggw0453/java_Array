public class page05 {
    public static void main(String[] args) {
    
    int arrA[][] = {{2,3,4,},{3,2,1}},
    arrB[][] = {{1,2,3},{-4,-2,1}},
    sum1 = 0;
    
    System.out.println("두 행렬의 합:");
    for(int i = 0 ; i<2 ; i++){
        for(int j = 0 ; j<3 ; j++){

            if (i==0) {
                sum1 = arrA[i][j]+arrB[i][j];
                System.out.printf("%d ",sum1);

                if (j==2) {
                    System.out.println();
                }
            }else if (i==1) {
                sum1 = arrA[i][j]+arrB[i][j];
                System.out.printf("%d ",sum1);
            }

        }
    }
    }
}
