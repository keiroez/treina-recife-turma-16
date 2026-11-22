/**
 * Aula 03 · A ContaBancaria da aula 02, agora pronta para ter subclasses.
 * Única mudança: saldo virou protected, para as subclasses poderem usá-lo.
 */
public class ContaBancaria {
    private String titular;
    protected double saldo; // protected: a própria classe e as subclasses enxergam

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
