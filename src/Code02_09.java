


public class Code02_09 {



    public static void main(String[] args){
        int num1 = 10, num2 = 20;
        double result;
        result = num1 + num2;
        System.out.printf("%d + %d = %.1f\n", num1, num2, result);

        //정수형 끼리 계산하면 정수만 저장
        //정수형 둘 중 하나를 실수형 변환 후 연산
        result = num1 / (double)num2;
        System.out.printf("%d / %d = %.1f\n", num1, num2, result);
    }
}
