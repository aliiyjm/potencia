import java.util.Scanner;

public class Main {

    static int potencia (int base, int exponente){
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        int num1 = input.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int num2 = input.nextInt();

        for (int i = 0; i<= num2; i++){
            int resultado = potencia(num1, i);
            System.out.println(num1 + " ^ " + num2 + " = " + resultado);
        }

    }
}

