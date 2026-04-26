package Basic_Recursion;

public class Main {
    public static void main(String[] args) {
        printName sol = new printName();
        int N = 5;
        String name = "Kalam";

        sol.printName(name, 0, N);
    }
}

