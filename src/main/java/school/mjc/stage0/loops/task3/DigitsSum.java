package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = calculateSum(t);
        System.out.println(sum);
    }

    private int calculateSum(int t) {
        int sum = 0;
        String numberString = String.valueOf(t);
        for (int i = 0; i <= numberString.length(); i++){
            char digitChar = numberString.charAt(i);
            int digit = digitChar - '0';
            sum += digit;
        }
        return sum;
    }
}
