public class firstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    private static int sumFirstAndLastDigit(int num) {
        if (num < 0) {
            return -1;
        }

        int lastNum =  num % 10;
        int firstNum = 0;

        while(num > 0){
            firstNum = num;
            num /= 10;
        }

        return lastNum + firstNum;

    }
}


