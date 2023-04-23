public class TestaStrings {

    public static void main(String[] args){
        String s = new String("Caelum");
        // s.toUpperCase(); // nao funciona
        s= s.toUpperCase(); // jeito correto
        System.out.println(s);
        System.out.println(s.charAt(0)); //Pegando o caracter que se encontra na posicao 0 da palavra CAELUM 'C'
        System.out.println(s.charAt(3));// RETORNA L
        System.out.println(s.length()); // retorna o tamanho da minha String - 6

        //isEmpty - se o valor de uma string for vazia, ou seja, igual a 0, ela retorna true, senao retorna false
        System.out.println("".isEmpty()); // retorna true, nao tem nada nas minhas aspas""
        System.out.println(" ".isEmpty()); // retorna false, embora nao tenha nada, há espaços nas minhas aspas, entao conta como caracter
        System.out.println("leandro".isEmpty()); // retorna false

        //trim - remove os espacos da direita e da esquerda da minha string
        System.out.println("     leandro       "); // printa leandro com espacos
        System.out.println("       leandro               ".trim()); // remove os espacos 

        //replace - troca os caracter por outro caracter de uma string
        System.out.println(s.replace('C', 'D')); // A palavra era CAELUM, entao troquei o caracter C pelo D - DAELUM
        System.out.println(s.replace("CAE", "ALU")); //CAELUM PARA ALULUM

        //substring - comeca a ler a string a partir da posicao do caracter que informarmos no metodo
        System.out.println("Leandro".substring(2)); // retorna 'andro'
        System.out.println("Leandro".substring(0, 5)); // retorna 'leand'

        //equals e equalsIgnoreCase
        System.out.println("Java".equals("java")); // retorna false, o equals nao considera comparavel letras maiuscula com minusculas
        //equalsIgnoreCase
        System.out.println("Java".equalsIgnoreCase("java")); // retorna true, o equalsIgnoreCase compara maiusculas e minusculas

        //compareTO - esse retorna positivo, 0 ou negativo dependendo de qual String estou comparando com a outra
        System.out.println("Certificacao".compareTo("Ana")); // retorna um numero positivo, pois ana vem antes de "Certificacao" alfabeticamente
        System.out.println("Certificacao".compareTo("Janaina")); // return um numero negativo, Janaina vem depois de Certificacao
        System.out.println("Certificacao".compareTo("Certificacao")); // return 0; as Strings sao iguais

        //CompareToIgnoreCase
        System.out.println("Certificacao".compareTo("certificacao")); // negativo, Maiscula "C" vem antes de minuscula "c"
        System.out.println("Certificacao".compareToIgnoreCase("certificacao")); // retorna 0, ignorou o maisculo e comparou normalmente


        //Metodos de buscas nas strings
        String texto = new String("Pretendo fazer a prova de certificacao de JAVA");
        //indexOF - retorna a posicao de determinada palavra na String
        System.out.println(texto.indexOf("Pretendo")); // retorna posicao 0
        System.out.println(texto.indexOf("prova")); // retorna posicao 17
        System.out.println(texto.indexOf("Leandro")); // retorna -1, pois nao existe a palavra "Leandro" na string texto
        System.out.println(texto.indexOf("e", 23)); // retorna a posicao do caracter e contando a partir da posicao 23 da string
        //lastIndexOF - retorna a posicao de determinada palavra na string DE TRÁS PRA FRENTE
        System.out.println(texto.lastIndexOf("de")); // retorna 39
        System.out.println(texto.lastIndexOf("a", 42)); // retorna 36 - retornou a posicao do primeiro caracter a a partir da posicao 42

        //StartsWith - retorna true se a string começar do jeito que eu especifiquei ou false se nao começar daquele jeito
        System.out.println(texto.startsWith("Pretendo")); //retorna true, pois realmente começa com a palavra Pretendo
        System.out.println(texto.startsWith("leandro")); // retorna false, minha String nao comeca desse jeito
        //endsWith - retorna true ou false se a String terminar do jeito que eu especificar
        System.out.println(texto.endsWith("JAVA")); //retorna True
        System.out.println(texto.endsWith("C#")); //retorna false





        // String nomeDireto = "JAVA";
        // String nomedireto = new String("JAVA");
        // char [] nome = new char[]{'J', 'a', 'v', 'a'};
        // String nome1 = new String(nome);


        // StringBuilder sb1 = new StringBuilder("Java");
        // String nome2 = new String(sb1);

        // String nomeNulo = null;

        // String nomeDaProva = "Certificação" + " " + "Java";
        // String nomeDaProvaCNull = nomeDaProva + " " + nomeNulo;

        // System.out.println(nomeDaProvaCNull);
        // // System.out.println(nomeNulo.toString()); NAO FUNCIONA - POIS ARMAZENA UM VALOR NULL

        // System.out.println("Certificacao " + 1500);
        // System.out.println(1500 + " Certificacao");
        // System.out.println(1 + 500 + " Certificacao"); // aqui ele nao concatena, ele soma 500 + 1 CUIDADO
        // System.out.println(1 + (500 + " Certificacao")); // JEITO CERTO DE FAZER - "("" <- Parenteses quando for caoncatenar int com int



    }
}
