public class exception2{
    public static void main(String [] arg){
        String num = "123a";
        //number format exception
        int value = Integer.parseInt(num);

        System.out.println("value :" +value);
    }
}