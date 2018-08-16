public class FactorialUseRecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    private static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
