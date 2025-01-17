package academia.kayky.maratonajava.introducao;

public class operadores {
    public static void main(String[] args) {
        // +, -, /, *,
        int numero1= 10;
        int numero2= 15;
        int resultadodivisao= numero1/numero2;
        int resultadomultiplicacao= numero1*numero2;
        System.out.println(resultadodivisao);
        System.out.println(resultadomultiplicacao);
        System.out.println("valor "+ numero1 + numero2);
        System.out.println(numero1 + numero2+" valor "+ numero1 + numero2);
    // %
        int resto= 20%2;
        System.out.println(resto);
        //< > <= >= == !=
        boolean isDezMaiorQueVinte= 10 > 20;
        boolean isDezMenorQueVinte= 10 < 20;
        boolean isDezIgualQueVinte= 10 == 10;
        boolean isDezDiferenteQueVinte= 10 != 10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte "+isDezIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte "+isDezDiferenteQueVinte);

        // && (AND) || (or)
        int idade = 29;
        float salario = 3599.3F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >=4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);


        //logica do OR
        double contacorrente= 200;
        double contapoupanca= 10000;
        float ps5= 5000;

        boolean isPlayStationCincoCompravel = contacorrente > ps5 || contapoupanca > ps5;
        System.out.println("isPlayStationCincoCompravel " +isPlayStationCincoCompravel);

        // = += -= /= %=

        double bonus = 1800;
        bonus+= 1000;

        // bonus= bonus + 1000

        System.out.println(bonus);
        // ++ , --
        int contador = 0;
        contador ++;

        System.out.println(contador);

    }

}
