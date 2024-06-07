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
    
        //append String
        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + " " + str2;
        System.out.println(result);

        //	append(String str)
        // StringBuffer sb = new StringBuffer("Hello");
        // sb.append(" World");
        // System.out.println(sb.toString());


        //insert(int offset, String str)
        StringBuffer sb1 = new StringBuffer("Hello World");
        sb1.insert(6, "Java ");
        System.out.println(sb1.toString());
    

        // replace(int startIndex, int endIndex, String str)

        //we can use StringBuilder or StringBuffer both are same
        StringBuilder sb2 = new StringBuilder("Hello World");
        sb2.replace(6, 11, "Java");
        System.out.println(sb2.toString());

        // StringBuffer sb = new StringBuffer("Hello World");
        // sb.replace(6, 11, "Java");
        // System.out.println(sb.toString());

        // delete(int startIndex, int endIndex)

        // StringBuffer sb = new StringBuffer("Hello World");
        // sb.delete(6, 11);
        // System.out.println(sb.toString());

        // reverse()
        // StringBuffer sb = new StringBuffer("Hello World");
        // sb.reverse();
        // System.out.println(sb.toString());

    
        // capacity()
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println("Initial Capacity: " + sb.capacity()); 
        sb.append("!");
        System.out.println("Capacity after append: " + sb.capacity()); 
        sb.append(" This is a test to increase the capacity.");
        System.out.println("Capacity after increase: " + sb.capacity());

        
        // ensureCapacity(int minCapacity)

        // Print initial capacity
        System.out.println("Initial Capacity: " + sb.capacity()); 
        // Ensure minimum capacity
        sb.ensureCapacity(50);
        // Print capacity after ensuring
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity()); 
        // Append more characters to see the effect on capacity
        sb.append(" This is a test to check capacity expansion.");
        System.out.println("Capacity after appending more text: " + sb.capacity()); 
    
    
    }
    }
