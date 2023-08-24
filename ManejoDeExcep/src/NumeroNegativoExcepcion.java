import java.util.Scanner;
public class NumeroNegativoExcepcion extends Exception{
    public NumeroNegativoExcepcion() {
        super();
    }
    public NumeroNegativoExcepcion(String texto) {
        super(texto);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Ingrese un numero que desee obtener su raiz cuadrada");
            float nummer = scan.nextFloat();
            if (nummer <= 0){
                throw new NumeroNegativoExcepcion("Error: No existen raices de numeros negativos");
            }else {
                float nummerzwei = (float) Math.sqrt(nummer);
                System.out.println("Su raiz cuadrada es " + nummerzwei);
            }
        } catch (NumeroNegativoExcepcion negative) {
            System.out.println(negative.getMessage());
        } catch (Exception eggs) {
            System.out.println("Hubo un error" + eggs.getMessage());
        } finally {
            scan.close();
        }
    }
}