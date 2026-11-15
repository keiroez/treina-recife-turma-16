/**
 * Aula 01 · Revisão de lógica: variáveis, condicionais e laços.
 */
public class Revisao {
    public static void main(String[] args) {
        // variáveis: tipo, nome e valor
        String nome = "Ana";
        int idade = 20;
        double nota = 6.0;
        boolean matriculada = true;
        System.out.println(nome + ", " + idade + " anos, matriculada: " + matriculada);

        // condicionais
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // laços: o mesmo código serve para 3 ou 300 notas
        double[] notas = {8.5, 6.0, 9.5};
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.println("Média: " + media);
    }
}
