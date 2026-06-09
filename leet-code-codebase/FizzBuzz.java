import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    static public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int num = 1; num <= n; num++) {
            if (num % 5 == 0 && num % 3 == 0) list.add("FizzBuzz");
            else if (num % 5 == 0) list.add("Buzz");
            else if (num %3 == 0) list.add("Fizz"); 
            else list.add(String.valueOf(num));
        }
        return list;

    }
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
