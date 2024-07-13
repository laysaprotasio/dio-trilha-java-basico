import java.util.Scanner;

public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        ContaTerminal contaUsuario = new ContaTerminal();

        System.out.print("Por favor, digite o número da Agência!\n");
        contaUsuario.agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da sua Conta!\n");
        contaUsuario.numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o seu nome!\n");
        contaUsuario.nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o seu saldo!\n");
        contaUsuario.saldo = scanner.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                contaUsuario.nomeCliente, contaUsuario.agencia, contaUsuario.numero, contaUsuario.saldo);

        scanner.close(); 
    }
}
