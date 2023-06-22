import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Integer conta;
        String agencia;
        String nome;
        Double saldo;

        System.out.println("Digite o número de sua conta: ");
        conta = scanner.nextInt();

        System.out.println("Digite o número de sua agência: ");
        agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        nome = scanner.next();

        System.out.println("Digite seu saldo: ");
        saldo = scanner.nextDouble(); //SÓ RECEBE VALOR COM VIRGULA

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque.");
    }

}
