package ujwal;

public class example {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        int c;

        System.out.println("Start ");
        try{
            c = a/b;
            System.out.println( "c : " + c);
        }
        catch (ArithmeticException e) {
            System.out.println(" can't divide by 0");
        }
        System.out.println("C : " + c);
        System.out.println("Exit");
    }

}
