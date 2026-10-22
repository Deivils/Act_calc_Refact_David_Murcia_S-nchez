import java.util.Scanner;

public class Calculator{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int Options;
        
        while (true) {

            System.out.println("---------------------------");
            System.out.println("---------BIENVENIDO--------");
            System.out.println("---------------------------");
            System.out.println("-------------A-------------");
            System.out.println("---------------------------");
            System.out.println("---------CALCULATOR--------");
            System.out.println("---------------------------");
            System.out.println("1. Suma\n2. Resta\n3. Multiplicación\n4. División Enteros\n5. Potencias\n6. Factorizar\n0. Salir");
            
            Options = pedirNumero();


            if (Options == 0) {

                salirPrograma();

            } else if (Options == 1) {
                
                suma();
            } else if (Options == 2) {
                resta();
                

            } else if (Options == 3) {
                multiplicar();

            } else if (Options == 4) {
                divisionEntera();

            } else if (Options == 5) {
                potencia();

            } else if(Options == 6){
                pedirNumeroFactorial();
            }else{
                System.out.println("Entrada no válida, intentelo de nuevo");
            }
System.out.println("Gracias por usar CALCULATOR, hasta la próxima!!");

        }



    }// Fin del Main        
            
    // Creo las funciones de las operaciones


    public static void suma(){
        while (true){
            try {

                System.out.println("Has elegido la operación suma\n");
                System.out.print("Introduzca el primer número:");
                int num1 = scn.nextInt();
                System.out.print("Introduzca el segundo número:");
                int num2 = scn.nextInt();
                int resultado = num1 + num2;
                System.out.printf("El resultado de sumar %d y %d es: %d\n",num1, num2,  resultado);
                break;


            }catch (Exception e){
                System.out.println("Debes introducir un número, no vale texto");
                System.out.println("Vuelve a empezar....\n");
                scn.nextLine();
            }
        } 
    }

    public static void resta(){
        while (true){
            try {
                System.out.println("Has elegido la operación Resta\n");
                System.out.print("Introduzca el primer número:");
                int num1 = scn.nextInt();
                System.out.print("Introduzca el segundo número:");
                int num2 = scn.nextInt();
                int resultado = num1 -num2;
                System.out.printf("El resultado de restar %d con %d es: %d\n",num1, num2,  resultado);
                break;


            }catch (Exception e){
                System.out.println("Debes introducir un número, no vale texto\n");
                System.out.println("Vuelve a empezar....\n");
                scn.nextLine();
            }


        } 
    }

    public static void multiplicar(){
        while (true){
            try {
                System.out.println("Has elegido la operación Multiplicar\n");
                System.out.print("Introduzca el primer número:");
                int num1 = scn.nextInt();
                System.out.print("Introduzca el segundo número:");
                int num2 = scn.nextInt();
                int resultado = num1 * num2;
                System.out.printf("El resultado de multiplicar %d y %d es: %d\n",num1, num2,  resultado);
                break;


            }catch (Exception e){
                System.out.println("Debes introducir un número, no vale texto\n");
                System.out.println("Vuelve a empezar....\n");
                scn.nextLine();
            }


        } 
    }

    public static void divisionEntera(){

        while (true){
            try {
                System.out.println("Has elegido la operación División Entera\n");
                System.out.print("Introduzca el primer número:");
                int num1 = scn.nextInt();
                System.out.print("Introduzca el segundo número:");
                int num2 = scn.nextInt();
                int resultado = num1 / num2;
                System.out.printf("El resultado de la división entera entre %d y %d es: %d\n",num1, num2,  resultado);
                break;


            }catch (ArithmeticException e){
                System.out.printf("No se puede dividir entre 0\n");
                scn.nextLine();
            }catch (Exception e){
                System.out.println("Debes introducir un número, no vale texto\n");
                System.out.println("Vuelve a empezar....\n");
                scn.nextLine();
            }


        } 
    }

        public static void potencia(){
        while (true){
            try {        
                System.out.println("Has elegido la operación Potencias\n");
                System.out.print("Introduzca el primer número:");
                int num1 = scn.nextInt();
                System.out.print("Introduzca el segundo número:");
                int num2 = scn.nextInt();
                int resultado = Math.powExact(num1, num2);
                System.out.printf("El resultado de elevar %d a la potencia de %d es: %d\n",num1, num2,  resultado);
                break;

            }catch (Exception e){
                System.out.println("Debes introducir un número, no vale texto\n");
                System.out.println("Vuelve a empezar....\n");
                scn.nextLine();
            }
        } 
    }

// La función factorial la tengo que hacer sola y luego introducirla en otra funcioón aparte
    public static int factorial(int num){

            if (num == 0){
                return 1;
            } else {
                return num * factorial( num -1);
            }
    }

        public static void pedirNumeroFactorial(){
        while (true) {
            try {
                System.out.println("Has elegido la opción Factorizar\n");
                System.out.print("Por favor, introduzca un número ");
                
                int num = scn.nextInt();
                int resultado = factorial(num);

                System.out.printf("El resultado de factorizar %d es: %d\n",num,  resultado);
                break;
                
            }catch (Exception e){
                System.out.println("Debes introducir un número, no vale texto\n");
                System.out.println("Vuelve a empezar....\n");
                scn.nextLine();

            }
            
        }

    }


    public static int pedirNumero(){
        int Options = 0;
        while (true) {
            try {
                System.out.print("Por favor, introduzca un número del 0 al 6:");
                Options = scn.nextInt();
                return Options;
            }catch (Exception e){
                System.out.println("Debes introducir un número, no vale texto\n");
                System.out.println("Vuelve a empezar....\n");
                scn.nextLine();
            }
            
        }

    }

    public static void salirPrograma(){ 
            System.out.println("Has elegido Salir");
            System.out.println("\u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665");
            System.out.println("Saliendo de CALCULATOR, hasta pronto!!!!");
            System.out.println("\u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665");
            System.exit(0);
        }
    

}// FIN CLASS

