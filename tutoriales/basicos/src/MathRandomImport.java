import java.util.Random; // Importado de la clase necesaria para agregar el Random seed

public class MathRandomImport {
    public static void main(String[] args){
        // Math in Java
        // The Math method allow a variety of options
        Math.max(2, 7); // Find the maximun beetwen two numbers
        Math.min(2, 7); // Find the minimun
        Math.sqrt(27); // Find the square root
        Math.abs(-37); // Find the absolute value
        
        System.out.println(Math.random()); // Random numbers generator beetwen 0 and 1
        int randomNumber = (int) (Math.random()*101); // Random integer from 0 to 100
        System.out.println(randomNumber); // Random numbers generator beetwen 0 and 1
        
        // Para replicar valores, se necesita establecer semillas en los número aleatórios, para ello, se puede utilizar el siguiente método, inicialmente sin reproducibilidad
        // solo garantizando un rango sin ninguna distribución específica
        int min = 5,max = 100; /// Mínimo, máximo y la semilla
        int rango = max-min; // Rango de valores que se pueden obtener
        int randomNumberInRange =  (int) (rango*Math.random()+min);
        System.out.println("Número aleatorio entre "+min+ " y "+ max +", Random: "+randomNumberInRange);
 
        // Para efectuar reproducibilidad se necesita la clase Random específica para añadir un seed (una forma)
        int semilla = 5000;
        // Para utilizar esta situación se debe importar la clase Random alojada en java.util
        Random randomObject = new Random(semilla); 
        System.out.println("Número aleatório reproducible : "+ randomObject.nextInt()); // El número aleatório siempre será el mismo en este caso 
    }
    
}
