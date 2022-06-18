public class TiposDeclaraciones {
    public static void main(String[] args) throws Exception {
        String texto     = "Variable de tipo String"; /// Tipo string
        int    numero    = 1994; // Número entero
        char    letra    = 'L'; // Caracter
        boolean booleano = false; // Booleano
        double  decimal  = 1.2345; // Decimales
        
        // Multiple declarations
        int x = 23, y = 44, z = 77;
        // Multiple redeclaration
        x=y=z=50;
        System.out.print("Resultados: "+x+y+z);
    }
}
