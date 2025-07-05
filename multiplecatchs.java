public class multiplecatchs{
    public static void main(String Args[]){
        try {
            int a = Args.length;
            System.out.println("a : " +a);
            int b = 42/a;
            int c[] = {1};
            c[42] = 99;

        }
        catch(ArithmeticException e) {
            System.out.println("devide by zero : " +e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index oob : " +e);
        }
        System.out.println("afer try catch bllkck");

        // if you run this using "java multiplecatchs" it catch "ArithmaticException" because Args.length=0
        // if you run this using "java multiplecatchs 3 3" it catch "ArrayIndexOutOfBoundry" because Args.length=2
    }
}