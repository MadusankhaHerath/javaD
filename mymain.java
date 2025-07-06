



public class mymain{
    public static void main(String [] Args){
        try{
        mathop ex = new mathop();
        System.out.println(ex.devide(10, 2));
        System.out.println(ex.add(2, 4));}
        catch(ArithmeticException e){
            System.out.println("devide by zero");
        }
        
    }
}