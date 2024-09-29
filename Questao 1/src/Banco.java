import java.util.Scanner;
public class Banco {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private double saldo;

    public double getRende() {
        return rende;
    }

    public void setRende(double rende) {
        this.rende = rende;
    }

    private double rende;

    public double getSelic() {
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }

    private double selic;

    public double getCheque_especial() {
        return Cheque_especial;
    }

    public void setCheque_especial(double cheque_especial) {
        Cheque_especial = cheque_especial;
    }

    private double Cheque_especial;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    private double depositar, sacar;

    public void cheque(){
        Cheque_especial = 1000;
        saldo += Cheque_especial;
        System.out.println("Cheque especial ativado. Saldo atual: " + saldo);
    }


    public void rendimento(){
        if (selic > 8.5){
            rende = 0.005*saldo;
        }
        else{
            rende = 0.007 *selic*saldo;
        }
        System.out.println("O rendimento é: " + rende);
    }


    public void saque(){
        if (depositar >= sacar){
            saldo -= sacar;
            System.out.println("Saque bem Sucedido" + sacar);
        } else if (sacar > depositar) {
            System.out.println("Saldo indisponivel" + sacar);

        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
    }

    public void exibir_detalhes(){
        System.out.println("Dados da Sua Conta");
        System.out.println("Nome do Titular: " + nome);
        System.out.println("Saldo em Conta: " + saldo );
        System.out.println("O Seu Rendimento é de: " + rende);
    }
}
