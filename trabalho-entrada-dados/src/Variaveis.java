import java.util.Scanner;

public class Variaveis {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Bem vindo ao exercicio de entrada de dados.");

        System.out.println("Digite seu nome completo: ");
        String nome=scanner.nextLine();

       System.out.println("Digite seu cpf: ");
       String cpf=scanner.next();

       System.out.println("Digite sua idade: ");
       int idade=scanner.nextInt();

       System.out.println("Digite sua altura: ");
       double altura=scanner.nextDouble();

       System.out.println("Digite sua peso: ");
       double peso=scanner.nextDouble();

       System.out.println("Qual seu estatus civil? : ");
       String estatus=scanner.next();


       System.out.println("confirmação dos dados \nSeu nome é: "+nome+"\nPortador do cpf:"+cpf+"\nIdade: "+idade+"\nAltura: "+altura+"\nPeso: "+peso+"\nStatus civil:"+estatus);







    }
}
