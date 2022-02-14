import java.util.Scanner;
public class A2E4
{
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {
        int edadMayor = 0;
        int edadMenor = 0;
        int i = 1;
        int n = 5;
        System.out.println("Bienvenido al sistema de edad mayor o menor");
        while(i <= n)
        {
            System.out.println("Escriba la edad #"+i);
            int edad = entrada.nextInt();
            if(i == 1)
            {
                edadMayor =edad;
                edadMenor = edad;
            }else if(edad > edadMayor){
                edadMayor = edad;
            }if(edad < edadMenor){
                edadMenor = edad;
            }
            i++;
        }
        System.out.println("La edad mayor es: "+edadMayor);
        System.out.println("La edad menor es: "+edadMenor);
    }
}