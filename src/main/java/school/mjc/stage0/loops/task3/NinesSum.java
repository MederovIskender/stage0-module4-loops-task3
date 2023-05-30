package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for (int i = 1; i<=lengthOfLastNumber; i++){
            int currentNine = (int) Math.pow(10,i)-1;
            sum +=currentNine;
        }
        System.out.println(sum);
    }
}
