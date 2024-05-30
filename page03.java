public class page03 {
    public static void main(String[] args) {
        double sum1=0 , num1=0;

        double []arrA = {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7};
        for(int i = 0 ; i<arrA.length ; i++){

            sum1 += arrA[i];
        }
        num1 = sum1/arrA.length;
        System.out.printf("합계: %f\n평균: %.2f", sum1, num1);
    }
}
