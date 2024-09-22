import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela classe scanner os valores digitados no terminal
        //Exibir a mensagem da conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome");
        String cliente = scanner.nextLine();

        System.out.println("Digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Digite sua agencia");
        scanner.nextLine();
        String agencia = scanner.nextLine();

        System.out.println("Digite o seu saldo em conta");
        Double saldo = scanner.nextDouble();



        System.out.println("Olá "+ cliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$"+ String.format("%.2f", saldo) +" já está disponível para saque!\n");
        scanner.close();

    };
};