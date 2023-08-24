import java.util.Scanner;
public class FindCaracterEn {
   public static char characterEn(String txt, int place) throws Exception {
       int Stringlength = txt.length();
       if (place >= 0 && place < Stringlength) {
           return txt.charAt(place);
       }
       else{
           throw new Exception();
       }
   }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una palabra con al menos 7 caracteres, para encontrar su septimo caracter:");
        String lectTeclado = scan.nextLine();
        try {
            int posicion = 7;
            char resultado = characterEn(lectTeclado, posicion);
            System.out.println("El carácter en la posición " + posicion + " es: " + resultado);
        } catch (Exception e) {
            System.out.println("Has intentado recuperar una posicioon de la cadena de caracteres que no existehoho");
        }
    }
}