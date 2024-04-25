public class ContaBancaria {
    private Double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public void depositar(Double valorDeposito) {
        saldo += valorDeposito;
    }

    public void sacar(Double valorSaque) throws SaldoInsuficienteException {
        if (valorSaque > saldo) {
            throw new SaldoInsuficienteException();
        }

        saldo -= valorSaque;
    }

    public Double getSaldo() {
        return saldo;
    }
}
