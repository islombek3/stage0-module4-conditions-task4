package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if (first > second && second > third){
            System.out.println(first);
        } else if (first > third && third > second){
            System.out.println(first);
        } else if (second > first && first > third){
            System.out.println(second);
        } else if (second > third && third > first){
            System.out.println(second);
        } else if (third > first && first > second){
            System.out.println(third);
        } else if (third > second && second > first){
            System.out.println(third);
        } else if (first == second && first > third){
            System.out.println(first);
        } else if (first == second && first < third){
            System.out.println(third);
        } else if (first == third && first > second){
            System.out.println(first);
        } else if (first == third && first < second){
            System.out.println(second);
        } else if (second == third && first > second){
            System.out.println(first);
        } else if (first == third && first < second){
            System.out.println(second);
        }
    }
}
