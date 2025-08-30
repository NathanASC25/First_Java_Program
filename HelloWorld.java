public class HelloWorld{
    public static void main(String[] args){
        String message = "Hello World!";
        double num = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println("\n" + num);
        
        String firstWord = giveFirstWord(message);
        System.out.println(firstWord);
    }
    public static String giveFirstWord(String msg){
        return msg.substring(0, msg.indexOf(" "));
    }
}