public class NumberDigitCounter {
    
    // method to count the number of digits in a number
    public int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    
    // main method to test the NumberDigitCounter class
    public static void main(String[] args) {
        NumberDigitCounter counter = new NumberDigitCounter();
        int number = 123456789;
        int digitCount = counter.countDigits(number);
        System.out.println("Number of digits in " + number + ": " + digitCount);
    }
}
