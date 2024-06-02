public class Javastring {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String text = "Hello World";
        System.out.println(text.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(text.toLowerCase());   // Outputs "hello world"
    
        String Txt = "Please locate where 'locate' occurs!";
        System.out.println(Txt.indexOf("locate")); // Outputs 7
    }
}