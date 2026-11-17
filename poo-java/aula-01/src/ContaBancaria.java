public class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor){
        saldo +=valor;
        //saldo = saldo + valor;
    }

    void sacar(double valor){
        saldo -= valor;
        //saldo = saldo - valor;
    }

    void mostrar(){
        System.out.println(titular+" . saldo R$ "+saldo);
    }
}
