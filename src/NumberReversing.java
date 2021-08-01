public class NumberReversing {

    public static void main(String[] args) {
        System.out.println(reverseNumber(12345));
    }

    public static int reverseNumber(int number) {

        int reverseNumber = 0;

        while (number !=0){
            reverseNumber = reverseNumber * 10 + number%10;
            number = number/10;
        }
        return reverseNumber;
    }
}