package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        int start = Math.min(firstBoarder, secondBoarder);
        int end = Math.max(firstBoarder, secondBoarder);

        for (int counter = start; counter<= end; counter++){
            sum += counter;
        }
        System.out.println(sum);
    }
}
