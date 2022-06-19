public class Conditionals {

    public static void main(String[] args){
        // Conditionals 
        // basic if statement
        int x = 6, y = 5; 
        if(x<y){
            System.out.println("x < y");
        }else{
            System.out.println("x > y");
        }

        // Ternary operator 
        String answer = x<y? "x < y": "x > y";
        System.out.println("Output using the ternary: "+answer);

        // Switch 
        switch(x){
            case 4:
                System.out.println("Salida deseada");
                break;
            default:
                System.out.println("Salida por defecto");
        }

        // While  while(condition){ actions } // si la condición no se cumple no entra al ciclo
        // doWhile do{ actions }while(condition) // entra al menos una vez al ciclo antes de verificar la condición

        // for for(int i=0;i<10;i++){ actions } // desde i = 0, hasta i<10 con incrementos de 1 (clásico)

        // For Each, a diferencia del for, este itera a lo largo de los elementos de un arreglo, extrayendo elemento a elemento
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; /// Definición de arreglos
        System.out.println("Carro seleccionado: "+cars[0]);
        // El shorcut para imprimir es sysout
        for(String i: cars){
            System.out.println("Marca "+i);
        }
        

    }
    
}
