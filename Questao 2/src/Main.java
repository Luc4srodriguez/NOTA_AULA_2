import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Uber u = new Uber();

        System.out.println("Bem-Vindo ao Uber ");
        System.out.println("Digite a distancia percorrida: ");
        u.setDistancia(sc.nextDouble());
        System.out.println("Digite o tempo de espera em minutos");
        u.setTempoEspera(sc.nextInt());
        System.out.println("Horario de pico?");
        System.out.println("1- Sim");
        System.out.println("2- Não");
        int escolha = sc.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Informe o fator de demanda (ex: 1.5 para 50% a mais)");
                u.setFatorDemanda(sc.nextDouble());
                u.setTarifaBase(5.0);
                break;
            case 2:
                System.out.println("Informe a tarifa base");
                u.setTarifaBase(sc.nextDouble());
                u.setFatorDemanda(1.0);
                break;
        }

        u.calcularValorCorrida();
        u.exibirDetalhesCorrida();
    }
}