public class HelloWorld{
    public static void main(String[] args){
        String message = "Hello World!";
        String secondChar = giveSecondChar(message);
        System.out.println(secondChar);
    }
    public static String giveSecondChar(String msg){
        return msg.substring(1,2);
    }
}