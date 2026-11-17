/**
 * Aula 02 · Bloco 2: a ContaBancaria encapsulada (resultado do live coding).
 * O saldo é private e só muda por depositar e sacar, que conferem as regras.
 */
public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        setTitular(titular);
        if (saldoInicial > 0) {
            this.saldo = saldoInicial;
        }
    }

    // getters: só leem
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // setter com regra
    public void setTitular(String titular) {
        if (titular == null || titular.isBlank()) {
            System.out.println("Titular inválido");
            return;
        }
        this.titular = titular;
    }

    // sem setSaldo: o saldo só muda por aqui
    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }
        saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            return false;
        }
        saldo -= valor;
        return true;
    }
}
