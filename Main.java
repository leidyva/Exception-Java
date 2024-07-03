
public class Main {
    public static void main(String[] args) {
        int num = 3;
        int den = 0;
        try{
            int division = num/den;
            System.out.println(division);
        }catch (ArithmeticException e){
            System.out.println("Can not do the division");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Program finished");
        }
    }
}