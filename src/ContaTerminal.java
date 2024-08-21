import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o nome do cliente: ");
        String nomeCliente = in.nextLine();

        System.out.print("Informe o número da conta: ");
        int numero = in.nextInt();

        System.out.print("Informe a agencia: ");
        String agencia = in.nextLine();

        System.out.print("Informe o saldo: ");
        float saldo = in.nextFloat();

        System.out.print("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");
    }
}
