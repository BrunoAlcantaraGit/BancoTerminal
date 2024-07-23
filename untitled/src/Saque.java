public class Saque {
    private double saldo;
    private double valorSolicitado;

    private double saldoAtual = saldo - valorSolicitado;

    public Saque() {
    }

    public double realizarOperacao(double saldo, double valorSolicitado){
    if (saldo < valorSolicitado){
        System.out.println("Saldo insuficiente");
    }else {
        System.out.println("Saque realizado com sucesso.Valor atual:" +saldoAtual);
    }
    return saldoAtual;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValorSolicitado() {
        return valorSolicitado;
    }

    public void setValorSolicitado(double valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
    }

    @Override
    public String toString() {
        return "Saque{" +
                "saldo=" + saldo +
                ", valorSolicitado=" + valorSolicitado +
                '}';
    }
}
