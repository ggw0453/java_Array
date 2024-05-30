public class page17 {
    public static void main(String[] args) {
        int ran = 0 , num1 = 0;

        int arrA[]={22,57,11,32,91,68,70};

        for(int i = 0 ; i<arrA.length ; i++){
            System.out.printf("arrA[%d] = %d\n",i,arrA[i]);
        }
        System.out.println("요소를 섞었습니다");

        for(int i = 0 ; i<100 ; i++){
            ran=(int)(Math.random()*arrA.length);
            num1 = arrA[0];
            arrA[0] = arrA[ran];
            arrA[ran] = num1;
        }
        
        for(int i = 0 ; i<arrA.length ; i++){
            System.out.printf("arrA[%d] = %d\n",i,arrA[i]);
        }
    }
}
