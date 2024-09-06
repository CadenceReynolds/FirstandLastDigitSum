public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    private static int getEvenDigitSum(int num) {
        if (num < 0) {
            return -1;
        }

        int sum = 0;

        while (num > 0) {
            int number = num % 10;
            if(number % 2 == 0){
                sum += number;
            }
            num /= 10;
        }
        return sum;
    }
}
