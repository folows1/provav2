package br.edu.univas.vo;

public class Veiculo {
    private String cor;
    private int anoFab;
    private int anoModelo;
    private Motor motor;
    private int velocidadeAtual;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(int valor) {
        this.setVelocidadeAtual(velocidadeAtual + valor);
    }

    public void frear(int valor) {
        this.setVelocidadeAtual(velocidadeAtual - valor);
    }

}
