package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        int b = 1;
        while (i < multiplyByAndToInclusive){
            System.out.println(b *= (i + 1));
            i++;
        }
    }
}
