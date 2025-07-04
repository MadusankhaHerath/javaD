public class trycatch{
    public static void main (String[] Arg){
        int a = 8;
        int b = 4;
        int c = 4;
        int x = 0;

        System.out.println("hello....");

        try{
        int sum = a /(b-c);}
        catch(ArithmeticException e){
            System.out.println("cannot devide by zero...");
        }

        System.out.println("bye...");

        System.out.println("x = " +x);
        int y =a / (b + c);
        System.out.println("y = " +y);



    }
}