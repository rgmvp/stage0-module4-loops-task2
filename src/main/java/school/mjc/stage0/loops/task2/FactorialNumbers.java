package school.mjc.stage0.loops.task2;

public class FactorialNumbers {

    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        int a = 2;
        while (i < printToInclusive){
            if (i == 0){
                System.out.println(0);
            }
            else if (i == 1){
                System.out.println(1);
            }
            else {
                a *= (i+1);
                System.out.println(a);}
            i++;
        }

    }
}
