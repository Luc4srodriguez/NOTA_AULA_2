import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Banco b = new Banco();
        Scanner sc = new Scanner(System.in);
        String Continuar;

        System.out.println("Digite o nome do Titular");
        b.setNome(sc.nextLine());
        do {
            System.out.println("Escolha Uma Opção");
            System.out.println("1- Conta Corrente");
            System.out.println("2- Conta Poupança");
            int escolha = sc.nextInt();


            switch (escolha) {
                case 1:
                    System.out.println("Escolha Uma opção");
                    System.out.println("1- Depositar");
                    System.out.println("2- Sacar");
                    System.out.println("3- Usar cheque especial");
                    System.out.println("4- Exibir dados da conta");
                    int corrente = sc.nextInt();
                    switch (corrente) {
                        case 1:
                            System.out.println("Digite o Valor do deposito");
                            b.depositar(sc.nextDouble());
                            break;
                        case 2:
                            System.out.println("Digite o valor do saque");
                            b.setSacar(sc.nextDouble());
                            b.saque();
                            break;
                        case 3:
                            System.out.println("Cheque especial de 1.000");
                            b.cheque();
                            break;
                        case 4:
                            b.exibir_detalhes();
                    }
                    break;

                case 2:
                    System.out.println("Escolha uma opção");
                    System.out.println("1- Depositar");
                    System.out.println("2- Sacar");
                    System.out.println("3- Calcular rendimento");
                    System.out.println("4- Exibir dados da conta");
                    int poupanca = sc.nextInt();
                    switch (poupanca) {
                        case 1:
                            System.out.println("Digite o Valor do deposito");
                            b.depositar(sc.nextDouble());
                            break;
                        case 2:
                            System.out.println("Digite o valor do saque");
                            b.setSacar(sc.nextDouble());
                            b.saque();
                            break;
                        case 3:
                            System.out.println("Qual o Selic?");
                            b.setSelic(sc.nextDouble());
                            b.rendimento();
                            break;
                        case 4:
                            b.exibir_detalhes();
                    }
                    break;
            }
            System.out.println("Deseja Continuar? (S/N): ");
            Continuar = sc.next();
        }while (Continuar.equalsIgnoreCase("S"));
        System.out.println("Programa Finalizado");
    }
}