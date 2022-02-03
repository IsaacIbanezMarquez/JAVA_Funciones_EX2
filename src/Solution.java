




import java.util.Scanner;



public class Solution
{
    // Escribe un programa Java que pida al usuario que introduzca una password numérica, de valor comprendido
    // entre 0 y 999 (no es necesario comprobar que el valor introducido por el usuario está en dicho rango,
    // se supone que el usuario lo hace bien).
    //
    //El programa tiene almacenado el valor de la password correcta en una variable llamada key (hardcodeada).
    //
    //El objetivo del usuario es introducir la password correcta, en cuyo caso el programa debe imprimir
    // el mensaje: “acceso autorizado”.
    //
    //El usuario tiene un máximo de 3 intentos para introducir la password correcta. Si el usuario falla en sus
    // tres intentos, el programa presentará el mensaje de: “Ha excedido el número de intentos permitidos”
    // y acaba el programa.
    //
    //El máximo número de intentos permitidos lo guardamos en una variable tipo int, con su valor hardcodeado (=3).
    //
    //Puedes usar las variables adicionales que estimes oportunas.


    public static void main(String args[]) {

        int key=233;

        final int maxNumIntentos = 3;

        int intentos=0;

        boolean introduccionCorrecta = false;

        int contraseña;



        Scanner sc1= new Scanner(System.in);



        do {

            System.out.println("Por favor, introduce tu contraseña (0-999)");

            contraseña = sc1.nextInt();

            if (contraseña==key){

                System.out.println("acceso autorizado");

                introduccionCorrecta=true;

            }else {

                System.out.println("contraseña incorrecta");

                intentos++;

            }



        }while (!introduccionCorrecta && intentos<maxNumIntentos);

        if (intentos>=maxNumIntentos){

            System.out.println("Ha excedido el número de intentos permitidos");

        }

        sc1.close();

    }

}