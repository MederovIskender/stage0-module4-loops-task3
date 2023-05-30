package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int num1 = 0;
        int num2 = 1;


        for (int i = 1; i <= lastFibonacci; i++) {
            System.out.println(num1);

            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
    }
}
