public class mymain2{
    public static void main(String[] args){
       try{
        String id ="234";
        if(!id.startsWith("IT")){
            throw new invaildStudentIdException("java.lang.invaild student id");
        }
       }
       catch(invaildStudentIdException e){
            System.out.println(e);
       }
    }
}