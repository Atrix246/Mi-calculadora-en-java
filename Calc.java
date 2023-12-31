import java.util.Scanner;

public class Calc{
  public static void main(String args[]){
   Scanner in = new Scanner(System.in);

   int num_1 = 0, num_2 = 0;
   float resultado = 0;

   System.out.println("Elija una operación:\nSuma: '+'\nResta:'-'\nMultiplicación: 'x'\nDivisión: '/'\n");
   String operacion = in.nextLine();

   if (operacion.equals("+")) {
     System.out.println("Elija el primer número a sumar: "); 
     num_1 = in.nextInt();

     System.out.println("Elija el segundo número a sumar: ");
     num_2 = in.nextInt();

     resultado = num_1 + num_2;

     System.out.println("El resultado es: " + resultado);

   } else if (operacion.equals("-")) {
       System.out.println("Minuendo: ");
       num_1 = in.nextInt();

       System.out.println("Sustraendo: ");
       num_2 = in.nextInt();

       resultado = num_1 - num_2;
	
       System.out.println("El resultado es: " + resultado);

     } else if (operacion.equals("x")) {
         System.out.println("Primer factor: ");
	 num_1 = in.nextInt();

	 System.out.println("Segundo factor: ");
	 num_2 = in.nextInt();

	 resultado = num_1 * num_2;

	 System.out.println("El resultado es: " + resultado);

       } else if (operacion.equals("/")) {
	   System.out.println("Numerador: ");
	   num_1 = in.nextInt();
	
	   while (num_2 == 0) {
	     System.out.println("Denominador: ");
	     num_2 = in.nextInt();
	   }

	   resultado = num_1 / num_2;

	   System.out.println("El resultado es: " + resultado);
	   
         }else{
	    System.out.println("El símbolo ingresado no coincide a ningún operador");
          }
   in.close();
 }
}
