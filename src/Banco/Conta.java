package Banco;

public abstract class Conta {
    private int nrConta;
    private int nrAgencia;
    private String nmBanco;
    protected double vlSaldo;

    public Conta(int nrConta, int nrAgencia, String nmBanco, double vlSaldo) {
        this.nrConta = nrConta;
        this.nrAgencia = nrAgencia;
        this.nmBanco = nmBanco;
        this.vlSaldo = vlSaldo;
    }

    public int getNrConta() {
        return nrConta;
    }
    public void setNrConta(int nrConta) {
        this.nrConta = nrConta;
    }
    public int getNrAgencia() {
        return nrAgencia;
    }
    public void setNrAgencia(int nrAgencia) {
        this.nrAgencia = nrAgencia;
    }
    public String getNmBanco() {
        return nmBanco;
    }
    public void setNmBanco(String nmBanco) {
        this.nmBanco = nmBanco;
    }

    public abstract double getVlSaldo();

    public void setVlSaldo(double vlSaldo) {
        this.vlSaldo = vlSaldo;
    }
    @Override
    public String toString() {
        return "Conta [Numero da Conta=" + nrConta + ", Numero da Agencia=" + nrAgencia + "" +
                ", Nome do Banco=" + nmBanco + ", Saldo= " + vlSaldo +"]";
    }
}
