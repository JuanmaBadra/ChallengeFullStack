

import Consignas.Password;

import javax.swing.*;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
             /*Pide un número por teclado e indica si es un número primo o no. Un número primo es
aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que
25 es divisible entre 5, sin embargo, 17 si es primo.*/

        Scanner lector = new Scanner(System.in);

        /*ejercicio de password */

       Password pass = new Password("");
        System.out.println("Ingrese la contraseña "+pass);


        /*int a= 0, number;
        System.out.println("Ingrese un numero:");
        number = lector.nextInt();
        for(int i=1;i<=number;i++){
            if(number % i ==0){
                a++;
            }
        }
        if(a!=2){
            System.out.println("No es primo");
        }else{
            System.out.println("Si es primo");
        }*/

        /*2. Escribe una aplicación que solicite al usuario que ingrese una contraseña cualquiera.
Después se le pedirá que ingrese nuevamente la contraseña, con 3 intentos. Cuando
acierte ya no pedirá más la contraseña y mostrará un mensaje diciendo “Felicitaciones,
recordás tu contraseña”. Si falla luego de 3 intentos se mostrará el mensaje “Tenes que
ejercitar la memoria”. Los mensajes quedarán en pantalla a la espera que el usuario
presione una tecla, luego de esto se cerrará el programa.*/
        /*String contraseña = "Hola", intent="";
        int cont=0, flag=0;

        do {
            System.out.println("Ingrese la contraseña");
            intent = lector.nextLine();
            if (contraseña.equals(intent)) {
                System.out.println("Felicitaciones, recordas tu contraseña");
                flag=1;
            } else {
                    System.out.println("Tenes que ejercitar la memoria");
                    cont++;
                    if(cont==3){
                        System.out.println("Acceso restringido");
                        System.out.println("Cerrando programa");
                    }
                }
        }while ((cont!= 3) && flag==0);

    }*/

    /*3. Por teclado se ingresa el valor hora de un empleado. Posteriormente se ingresa el
nombre del empleado, la antigüedad y la cantidad de horas trabajadas en el mes. Se
pide calcular el importe a cobrar teniendo en cuenta que al total que resulta de
multiplicar el valor hora por la cantidad de horas trabajadas. Además, si el empleado
tiene más de 10 años de antigüedad hay que sumarle la cantidad de años trabajados
multiplicados por $30. Imprimir en pantalla el nombre, la antigüedad y el total a cobrar*/

    /*Float valorHora, anosAntiguedad,horasPorMes, totalHotas, totalAntiguedad, totalBruto,totalNeto;
    String nombreEmpleado;

    // Mensajes
        System.out.println("Cálculo de sueldo" +
                    "-----------------");

    // Ingreso de datos
        System.out.println("Ingrese nombre del empleado: ");
        nombreEmpleado = lector.nextLine();
        System.out.println("Ingrese antiguedad: ");
        anosAntiguedad = Float.parseFloat(lector.nextLine());
        System.out.println("Ingrese el valor de la hora del empleado: ");
    valorHora = Float.parseFloat(lector.nextLine());
        System.out.println("Ingrese la cantidad de horas trabajadas en el mes: ");
    horasPorMes = Float.parseFloat(lector.nextLine());

    // Calculo
    totalHotas = valorHora * horasPorMes;
    totalAntiguedad = anosAntiguedad * 30;
    totalBruto = totalHotas + totalAntiguedad;
    totalNeto = totalBruto;

    //Mostrar en pantalla
            System.out.flush();
        System.out.println("   Recibo de sueldo:" + "\n" +
                    "   -----------------" + "\n" +
                    "             Nombre: " + nombreEmpleado + "\n" +
            "         Antiguedad: " + anosAntiguedad + "\n" +
            "     Valor por hora: " + valorHora + "\n" +
            " Total sueldo bruto: " + totalBruto + "\n" +
            "Valor neto a cobrar: "+ totalNeto + "\n");*/


        /*4. Generar un número aleatorio comprendido entre 0 y 1000. Pedir, a continuación, al
usuario adivinar el número escogido por el ordenador. Para ello, debe introducir un
número comprendido entre 0 y 1000. Se compara el número introducido con el
calculado por el ordenador y se muestra en la consola "es mayor" o "es menor" en
función del caso. Se repite la operación hasta que el usuario encuentra el número.
5. Pedir al usuario que ingrese un número repetidamente hasta que ingrese un -1 y en ese
caso se terminará el programa.
Al terminar, mostrará lo siguiente:
a. – mayor número introducido
b. – menor número introducido
c. – suma de todos los números
d. – suma de los números*/

        /*int number, aleatorio, contador = 0;

        aleatorio = (int) (Math.random() * 100);

        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            if (aleatorio > number) {
                System.out.println("Digite un numero mayor");
            } else {
                System.out.println("Digite un numero menor");
            }
            contador++;
        } while (number != aleatorio);
        System.out.println("Adivinaste el numero en: " + contador + "intentos");*/

        /*------------------------"ESTRUCTURA DE DATOS"---------------------------


    /*2)Escribir una función Reemplazar que tenga como argumentos una pila con tipo de elemento
int y dos valores int: nuevo y viejo de forma que si el segundo valor aparece en algún lugar de
la pila,sea reemplazado por el segundo.
3)Construir una función que sume los elementos de una lista de enteros recursivamente.*/




        /*Arboles. General.
1)Responder a las siguientes preguntas sobre el árbol siguiente:

    ¿Qué nodo es la raíz? A  , NIVEL 0
2. ¿Cuántos caminos diferentes de longitud tres hay? B - C - E - F - I - J - N - G - K - P - Q
3. ¿Es un camino la sucesión de nodos HGFBACI? no, ya que "C" no comparte la sucesion de B.
4. ¿Qué nodos son los ancestros de K? J - C
5. ¿Qué nodos son los ancestros propios de N? solo E
6. ¿Qué nodos son los descendientes propios de M? No tiene
7. ¿Qué nodos son las hojas? H - L - M
8. ¿Cuál es la altura del nodo C?  1
9. ¿Cuál es la altura del árbol?  3
10. ¿Cuál es la profundidad del nodo C?
11. ¿Cuál es el hermano a la derecha de D?
12. ¿Es I hermano a la derecha de F?
13. ¿Está F a la izquierda de J?
14. ¿Está L a la derecha de J?
15. ¿Qué nodos están a la izquierda y a la derecha de J?
16. ¿Cuántos hijos tiene A?
17. Listar los nodos del árbol en preorden,postorden e inorden.*/



          /*1)Implementar una función que recibe una lista de enteros L y un número entero n de forma
que modifique la lista mediante el borrado de todos los elementos de la lista que tengan este
valor*/
        /*String[] colors = {"Red", "Yellow", "Green"};
        ArrayList<String> listaEnteros = new ArrayList<>();


        for (String color : colors) {
            listaEnteros.add(color); /// agrego cada valor del array a la lista.
        }
        System.out.println("ArrayList"+colors);
        System.out.println("ArrayList remove");*/


    }
}




