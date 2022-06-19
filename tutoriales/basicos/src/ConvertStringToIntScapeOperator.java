public class ConvertStringToIntScapeOperator {
    public static void main(String[] args){
        String txt = "Hello World";
        // This methods syntax are the same as JS
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"

        // Find the index of ocurrence of a word in a string
        String text = "Please locate where locate occurs!";
        System.out.println(text.indexOf("where"));

        // Add number and string?
        int x = 10;
        String y = "20";
        String out1 = x+y;
        int out2 = x+Integer.parseInt(y); /// Error de tipado, en este caso se debe convertir el string a número para poder realizar la suma y regrese un número
        System.out.println(out1); // Output 1020 string format
        System.out.println(out2); // 30 Int

        // Special Characters
        String test = "This is a test of phrase \" Incluyendo \" \'Testing \'  and \\BackSlash\\"; // \ scape operator 
        System.out.println(test);

   }
}