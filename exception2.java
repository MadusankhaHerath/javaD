public class exception2{
    public static void main(String [] arg){
         System.out.println("hello" );
        try{
        String num = "123a";
        //number format exception
        
        int value = Integer.parseInt(num);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }

       
    }
}