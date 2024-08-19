import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja Bem vindo! qual o seu nome?: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência!: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite seu número: ");
        String numero = scanner.nextLine();

        System.out.println("Quanto você deseja retirar?: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta "+ numero + " e seu saldo "+ saldo + " já está disponivel para saque" );






        scanner.close();
        
    }
}
