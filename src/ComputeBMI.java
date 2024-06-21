
import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)
	{
         
           //calculando imc usando classe Math 
            
            
           Scanner in = new Scanner(System.in);
        System.out.println("Informe o peso em libras");
        double weight = in.nextDouble();
        System.out.println("Informe a altura em polegadas");
        double height = in.nextDouble();
        double bmi=(weight/Math.pow(height,2))*703;
        System.out.println(" Seu Índice de Massa Corporal é " + Math.round(bmi));
        }
}
