public class Operadores {
    public static void main(String[] args) {

        // Uso de soma em texto resultando em concatenação (juntar)
        // String nomeCompleto = "Rodrigo " + "Santos " + "Gaspar";
        // System.out.println(nomeCompleto);

        // // qual o resultado das expressoes abaixo?
        // String concatenacao = "?";
        // System.out.println(concatenacao); // variável concatenacao recebeu a
        // interrogação "?"

        // concatenacao = 1 + 1 + 1 + "1"; // no início foi realizado operação de adição
        // 1+1+1
        // System.out.println(concatenacao); // porém na ultima foi identificado string
        // "1" e por isso o resultado foi 3 +
        // // "1" = "31"

        // concatenacao = 1 + "1" + 1 + 1; // identificao string no início "1", sendo
        // assim as operações seguintes de soma
        // // são anuladas
        // System.out.println(concatenacao); // resultando em "1111"

        // concatenacao = 1 + "1" + 1 + "1"; // mais um vez identificado "string" no
        // caminha da operação de adição 1 + "1"
        // System.out.println(concatenacao); // resultando em concatenação anulando
        // operação matemática de soma

        // concatenacao = "1" + 1 + 1 + 1; // mesma situação! primeiro foi identificado
        // soma de uma string "1"
        // System.out.println(concatenacao); // logo a soma dos demais não será em
        // operação matemática e sim na
        // // concatenação

        // concatenacao = "1" + (1 + 1 + 1); // Neste caso há uma situação de evidência
        // (1+1+1)
        // System.out.println(concatenacao); // Identificado string no início "1" porém
        // a próxima adição mostra que precisa
        // // primeiro somar o que está entre ()
        // // ficando "1" + (3) = "13"

        // UNÁRIOS

        // // classe Operadores.java
        // int numero = 5;

        // // Imprimindo o numero negativo
        // System.out.println(-numero);

        // // incrementando numero em mais 1 numero, imprime 6
        // numero++;
        // System.out.println(numero);

        // // incrementando numero em mais 1 numero, imprime 7
        // System.out.println(numero++);// ops algo de errado não está certo

        // System.out.println(numero);// agora sim, numero virou 7

        // // ordem de precedencia conta aqui
        // System.out.println(++numero);

        // boolean verdadeiro = true;

        // System.out.println("Inverteu " + !verdadeiro);

        // // TERNÁRIO

        // // classe Operadores.java
        // int a, b;

        // a = 6;
        // b = 6;

        // /*
        // * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        // * if(a==b)
        // * resultado = "verdadeiro";
        // * else
        // * resultado = "falso";
        // */

        // // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL
        // TERNÁRIO
        // String resultado = (a == b) ? "verdadeiro" : "false";

        // System.out.println(resultado);

        // // RELACIONAIS
        // int numero1 = 1;
        // int numero2 = 2;

        // if (numero1 > numero2)
        // System.out.print("Numero 1 maior que numero 2\n");

        // if (numero1 < numero2)
        // System.out.print("Numero 1 menor que numero 2\n");

        // if (numero1 >= numero2)
        // System.out.print("Numero 1 maior ou igual que numero 2\n");

        // if (numero1 <= numero2)
        // System.out.print("Numero 1 menor ou igual que numero 2\n");

        // if (numero1 != numero2)
        // System.out.print("Numero 1 é diferente de numero 2\n");

        // String nome1 = "JAVA";
        // String nome2 = "JAVA";

        // System.out.println(nome1 == nome2); // true

        // String nome3 = new String("JAVA");

        // System.out.println(nome1 == nome3); // false

        // String nome4 = nome3;

        // System.out.println(nome3 == nome4); // true

        // // equals na parada
        // System.out.println(nome1.equals(nome2)); // ??
        // System.out.println(nome2.equals(nome3)); // ??
        // System.out.println(nome3.equals(nome4)); // ??


        // // LÓGICOS

        // boolean condicao1 = true;
        // boolean condicao2 = false;

        // /*
        //  * Aqui estamos utilizando o operador lógico E para fazer a união de duas
        //  * expressões.
        //  * É como se estivesse escrito:
        //  * "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        //  */

        // if (condicao1 && condicao2)
        //     System.out.print("Os dois valores precisam ser verdadeiros");
        // ;

        // // Se condicao1 OU condicao2 for verdadeira, executar código.
        // if (condicao1 || condicao2)
        //     System.out.print("Um dos valores precisa ser verdadeiro");

        // // Comparacao Avancada
        // int numero1 = 1;
        // int numero2 = 1;

        // if (numero1 == 2 & numero2++ == 2)
        //     System.out.println("As 2 condições são verdadeiras");

        // System.out.println("O numero 1 agora é " + numero1);
        // System.out.println("O numero 2 agora é " + numero2);

        // // Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2
        // // )

    }
}