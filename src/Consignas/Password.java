package Consignas;

import java.util.Random;
import java.util.Scanner;

public class Password {
        //atributos
        private final static int DEFAULT_LONG = 8;
        private final static int SECURE_PASSWD_MAYUS = 2;
        private final static int SECURE_PASSWD_MINUS = 1;
        private final static int SECURE_PASSWD_NUM = 4;

        private int longitud;
        private String contrasenia;

        //constructores

    public Password(String contrasenia) { // este constructor genera una contraseña aleatoria con esa longitud.
        this.longitud = DEFAULT_LONG;
        this.contrasenia = contrasenia;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String generarPassword(){

        contrasenia = "";
        for(int i=0; i<longitud; i++)
        {
            switch ((int) (Math.random()*3)) {
                case 1:
                    contrasenia += (char) (Math.random() * 26 + 'A');
                    break;

                case 2:
                    contrasenia += (char) (Math.random() * 26 + 'a');
                    break;
                case 3:
                    contrasenia += (char) (Math.random() * 26 + '0');
                    break;
            }
            }
        return contrasenia;
    }

    public boolean esFuerte(){ /*devuelve un booleano si es fuerte o no, para que sea
     fuerte debe tener más de 2 mayúsculas, más de 1 minúscula y más de
        3 números.*/
        int mayusculas = 0, minusculas=0 , numeros=0;
        for(int i =0; i<this.longitud;i++){
            if(this.contrasenia.charAt(i)>='A'&& this.contrasenia.charAt(i)<='Z')///Return the first character (0) of a string:
                mayusculas++;
            if(this.contrasenia.charAt(i)>='a'&& this.contrasenia.charAt(i)<='z')
                minusculas++;
            if(this.contrasenia.charAt(i)>='0'&& this.contrasenia.charAt(i)<='9')
                numeros++;
        }
        return (mayusculas>SECURE_PASSWD_MAYUS && minusculas > SECURE_PASSWD_MINUS && numeros >SECURE_PASSWD_NUM)
                ?true : false;
    }
}






