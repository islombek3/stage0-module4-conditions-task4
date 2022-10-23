package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result = first > second && second > third ? first : 
        first > third && third > second ? first : 
        second > first && first > third ? second :
        second > third && third > first ? second :
        third > first && first > second ? third :
        third > second && second > first ? third :
        first == second && first > third ? first :
        first == second && first < third ? third :
        first == third && first > second ? first :
        first == third && first < second ? second :
        second == third && first > second ? first :
        first == third && first < second ? second : null; 
        System.out.println(result);
    }
}
