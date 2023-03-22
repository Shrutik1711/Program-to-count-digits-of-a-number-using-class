public class NumberDigitCounter {
    
    
    public int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    
    
    public static void main(String[] args) {
        NumberDigitCounter counter = new NumberDigitCounter();
        int number = 123456789;
        int digitCount = counter.countDigits(number);
        System.out.println("Number of digits in " + number + ": " + digitCount);
    }
}
