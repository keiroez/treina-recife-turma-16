/**
 * Aula 05 · Lab 2: a ContaBancaria abstrata da aula 04, trocando os boolean por exceções.
 * Antes: sacar devolvia false e quem chamava podia ignorar. Agora o erro não passa despercebido.
 */
public abstract class ContaBancaria {
    private String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial > 0) {
            this.saldo = saldoInicial;
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // IllegalArgumentException é RuntimeException: o compilador não obriga a tratar
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("valor do depósito deve ser positivo");
        }
        saldo += valor;
    }

    // SaldoInsuficienteException extends Exception: quem chama é obrigado a tratar
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("valor do saque deve ser positivo");
        }
        if (valor > saldo) {
            throw new SaldoInsuficienteException("saldo insuficiente para sacar R$ " + valor + " (saldo R$ " + saldo + ")");
        }
        saldo -= valor;
    }

    public void mostrar() {
        System.out.println(titular + " · R$ " + saldo);
    }

    public abstract void fecharMes();
}
