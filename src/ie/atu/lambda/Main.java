package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {
        StringOperation ChangeToUpperCase = new ToUpperCase();
        System.out.println(ChangeToUpperCase.apply("hello world"));
    }
}
