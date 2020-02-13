package exercicio01;

public class Padaria {

    private int quantPaes;
    private String horarioDeAbertura;
    private double ValorDeVendas;

    public Padaria(int quantPaes) {
        this.quantPaes = quantPaes;
            System.out.println("A quantidade de Pães é: " +quantPaes);
    }

    public int getQuantPaes() {
        return quantPaes;
    }

    public void setQuantPaes(int quantPaes) {
        this.quantPaes = quantPaes;
    }

    public Padaria(String horarioDeAbertura) {
        this.horarioDeAbertura = horarioDeAbertura;
        System.out.println("O horário de abertura da Padaria é " +horarioDeAbertura + " hrs");
    }

    public String getHorarioDeAbertura() {
        return horarioDeAbertura;
    }

    public void setHorarioDeAbertura(String horarioDeAbertura) {
        this.horarioDeAbertura = horarioDeAbertura;
    }

    public Padaria(double valorDeVendas) {
        ValorDeVendas = valorDeVendas;

        System.out.println("O valor de vendas foi: R$ " + ValorDeVendas);
    }
}

