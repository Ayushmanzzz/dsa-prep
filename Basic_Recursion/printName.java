package Basic_Recursion;

public class printName {
    public void printName(String name, int count, int N) {
        if (count == N)
            return;

        System.out.println(name);

        printName(name, count + 1, N);
    }
    
}
