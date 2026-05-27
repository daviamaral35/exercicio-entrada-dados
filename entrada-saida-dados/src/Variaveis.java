import java.util.Scanner;


//exemplo calculadora

public class Variaveis {
    public static void main(String[] args) {

        //para receber uma informação imputada no console usamos o comando Scanner
        Scanner scanner =  new Scanner(System.in);




        System.out.println("Digite o primeiro valor: ");

        // escaneia um numero real e guarda a informação
        double n1 =scanner.nextDouble();

        //recebe um sinal
        System.out.println("Digite o sinal (+, -, *, /)");
        char sinal = scanner.next().charAt(0);

        System.out.println("Digite segundo valor: ");
        double n2 =scanner.nextDouble();


        double resultado = 0; // Armazena o valor final do cálculo (suporta decimais).
        boolean resultadoInvalido = true; // Flag para controlar se o cálculo foi bem-sucedido ou se houve erro.

        //verificação do sinal
        switch (sinal) {
            case '+':
                resultado = n1 + n2;
                break;

            case '-':
                resultado = n1 - n2;
                break;

            case '*':
                resultado = n1 * n2;
                break;

            case '/':
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    System.out.println("Erro: Divisão por zero!"); // erro ao dividir por zero
                    resultadoInvalido = false;
                }
                break;
            default:
                System.out.println("Sinal Invalido!");
                resultadoInvalido = false;
        }

        if (resultadoInvalido) {
            System.out.println("Resultado: " + resultado);
        }



       scanner.close();

    }
}
