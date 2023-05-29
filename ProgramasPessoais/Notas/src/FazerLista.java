import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class FazerLista {
    public void fazerlista() {
        Scanner sc = new Scanner(System.in);

        //Dados
        String listanomes = "1.GUILHERME GONÇALVES GARROTE  4.WENDLER GABRIEL FERRAZ POCARLI  5.JULIANA CARDOSO ARAUJO  6.JOSE HENRIQUE VISU DE OLIVEIRA  7.ANA BEATRIZ FOGACA MEDEIROS  8.JOAO VITOR DE OLIVEIRA BERGAMINI  9.JOAO VICTOR DE OLIVEIRA  10.JOSE RENATO GONÇALVES LOURENCO DA SILVA  11.KAUA FELIPE NUNES OLIVEIRA  12.DAVI GOMES CARDOSO  13.MARCELA BIANCA DE OLIVEIRA  14.CONRADO JOSE BALADELI DOS SANTOS  15.ARTHUR VILAR BATISTA  16.MARIA FERNANDA ORMENESE GOMES  17.DANILO FILADELFO SANCHES JUNIOR  18.ISABELLI FERRAZI ENZ  19.MOISES FELIPE VIOL  20.MURILO ALVES BUROCCHI  21.MARINA MORAES BARBOSA  22.BRUNO HERNANDES DE CAMARGO  24.JOÃO GUILHERME RUBENS DE OLIVEIRA  26.GIOVANNA GABRIELA MAINARDI ALEINO  27.PEDRO HENRIQUE ELIAS DE FREITAS  28.RAFAELA MARIA DE OLIVEIRA  29.DAVID CARRIEL FREIRE  30.GUILHERME DA COSTA ISIDORO  31.JOAO PEDRO OLIVEIRA AMBROSIO  32.IAGO ORTIZ PEREIRA  33.RAFAEL JOSE MORALES GONCALVES SIIVA  34.DANIEL ZANATA JOIA GAUDENS  35.KAROL APARECIDA RODRIGUES ROSA  36.NICOLAS MIGUEL OLVEIRA DA SILVA  37.EDUARDO GOGONI BOTARO  38.LETICIA RODRIGUES VIEIRA SOUSA  39.THIAGO HENRIQUE MORAIS DE CAMPOS  40.MARIA JULIA PILEGI  41.ANA BEATRIZ LEMOS  42.MARIA VITORIA MARIANO DE SOUSA  44.NATALIA VITORIA GERALDO DE SOUZA  45.JOAO VITOR FURTUNATO DOS REIS  46.ISABELLA GOMES GARCIA";

        String listanomesalfabetica = "ANA BEATRIZ FOGACA MEDEIROS  ANA BEATRIZ LEMOS  ARTHUR VILAR BATISTA  BRUNO HERNANDES DE CAMARGO  CONRADO JOSE BALADELI DOS SANTOS  DANIEL ZANATA JOIA GAUDENS  DANILO FILADELFO SANCHES JUNIOR  DAVI GOMES CARDOSO  DAVID CARRIEL FREIRE  EDUARDO GOGONI BOTARO  GIOVANNA GABRIELA MAINARDI ALEINO  GUILHERME DA COSTA ISIDORO  GUILHERME GONÇALVES GARROTE  IAGO ORTIZ PEREIRA  ISABELLA GOMES GARCIA  ISABELLI FERRAZI ENZ  JOÃO GUILHERME RUBENS DE OLIVEIRA  JOAO PEDRO OLIVEIRA AMBROSIO  JOAO VICTOR DE OLIVEIRA  JOAO VITOR DE OLIVEIRA BERGAMINI  JOAO VITOR FURTUNATO DOS REIS  JOSE HENRIQUE VISU DE OLIVEIRA  JOSE RENATO GONÇALVES LOURENCO DA SILVA  JULIANA CARDOSO ARAUJO  KAROL APARECIDA RODRIGUES ROSA  KAUA FELIPE NUNES OLIVEIRA  LETICIA RODRIGUES VIEIRA SOUSA  MARCELA BIANCA DE OLIVEIRA  MARIA FERNANDA ORMENESE GOMES  MARIA JULIA PILEGI  MARIA VITORIA MARIANO DE SOUSA  MARINA MORAES BARBOSA  MOISES FELIPE VIOL  MURILO ALVES BUROCCHI  NATALIA VITORIA GERALDO DE SOUZA  NICOLAS MIGUEL OLVEIRA DA SILVA  PEDRO HENRIQUE ELIAS DE FREITAS  RAFAEL JOSE MORALES GONCALVES SIIVA  RAFAELA MARIA DE OLIVEIRA  THIAGO HENRIQUE MORAIS DE CAMPOS  WENDLER GABRIEL FERRAZ POCARLI";

        String listarms = "20231620082  20231620123  20231620028  20231620040  20231620095  20231620070  20231620097  20231620068  20231620063  20231620075  20231620031  20231620102  20231620019  20231620106  20231620137  20231620026  20231620089  20231620057  20231620032  20231620008  20231620131  20231620033  20231620021  20231620001  20231620065  20231620011  20231620094  20231620015  20231620105  20231620058  20231620120  20231620049  20231620010  20231620002  20231620140  20231620064  20231620112  20231620046  20231620069  20231620103  20231620079";

        String listamencoes = "MB MB MB MB B MB MB B MB B MB B MB MB  B B MB MB B MB R R B B R R B R  B B MB MB B MB R R B B B B B MB  R B MB MB B MB R R B B R MB B MB  B MB MB MB B MB R B MB B R B B MB  B B MB MB B B R B B B MB R B B  B MB MB B B B R B B B R B B B  MB B MB MB MB B B B MB B R MB B MB  B MB MB B R MB R B B R B B B MB  B B MB MB B MB R B B B R MB B B  B MB MB MB MB MB R B B B R B B MB  R B MB MB R MB B B B I I R R R  B MB MB MB B MB MB MB MB B MB B MB MB  B B MB MB R MB B B B B B B R MB  MB B MB MB MB B R R B B R B B B  MB MB MB B B B R B R B R B B B  B MB MB MB B B R R MB B B B B B  B B MB MB R MB R B R B R B R MB  B B MB B B B R B MB B B B B MB  B MB MB MB B MB B B B R MB B B MB  MB B MB MB B B R R MB B B B B MB  B MB MB MB R B B R B B B B B MB  B B B R R B I B B I I R R B  B MB MB MB B MB B MB MB B MB B B MB  B B MB MB B B R B B B R B B R  MB MB MB MB MB MB MB MB B B MB B B MB  B B MB B R MB R B B B R B B MB  D D D D D D D D D D D D D D  B MB MB MB B MB B B B B B B MB MB  R MB MB MB R MB R B MB B R B B R  B B MB MB R MB R B B B B B B B  B MB MB MB B MB B B B B MB B B MB  B MB MB MB R B R B B B R B B B  B MB MB MB B MB B MB MB MB R B B MB  B B MB MB MB MB R B MB B R B B B  B MB MB MB B MB R B MB B R B B MB  B B MB B B B B B MB B MB B B B  MB MB MB MB R B B R R B R B R MB  B B MB MB MB B B MB MB B R B B B  TE TE TE TE TE TE TE TE TE TE TE TE TE TE  B B MB B R B R R R R R B R B  MB MB MB B MB MB B B B B B R B MB";

        String listaresultados = "EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  DESISTENTE  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  EM CURSO  TRANSF. EXP. EM CURSO  EM CURSO";

        String listaaulasdadas = "286  288  286  288  286  288  286  288  286  288  286  288  286  288  288  286  288  286  288  286  288  286  288  286  288  286  288  -  286  286  288  286  288  286  288  286  288  286  288  -  288  286";

        String listafaltas = "8.00  39.00  8.00  0.00  4.00  28.00  6.00  12.00  5.00  0.00  16.00  31.00  0.00  4.00  26.00  41.00  6.00  16.00  8.00  12.00  7.00  27.00  102.00  0.00  10.00  1.00  8.00  -  5.00  0.00  6.00  0.00  18.00  4.00  0.00  6.00  18.00  23.00  6.00  -  17.00  20.00";

        String listafrequencias = "97.20  86.46  97.20  100.00  98.60  90.28  97.90  95.83  98.25  100.00  94.41  89.24  100.00  98.61  90.97  85.66  97.92  94.41  97.22  95.80  97.57  90.56  64.58  100.00  96.53  99.65  97.22  -  98.25  100.00  97.92  100.00  93.75  98.60  100.00  97.90  93.75  91.96  97.92  -  94.10  93.01";

        String[] nomes = listanomesalfabetica.split("  ");
        String[] rms = listarms.split("  ");
        String[] mencoes = listamencoes.split("  ");
        String[] resultados = listaresultados.split("  ");
        String[] aulasdadas = listaaulasdadas.split("  ");
        String[] faltas = listafaltas.split("  ");
        String[] frequencias = listafrequencias.split("  ");

        for (int i = 0; i != 41; i++) {
            String posicao = Integer.toString(i + 1);

            if (posicao.length() < 2) {
                posicao = "0".repeat(2 - posicao.length()) + posicao;
            }

            String nome = nomes[i];

            nome = nome + " ".repeat(40 - nome.length());

            String rm = rms[i];


            String mencao = mencoes[i];
            String[] materias = mencao.split(" ");
            int j = 0;

            materias[j] = materias[j] + " ".repeat(2 - materias[j].length());
            String mencaoartes = materias[j];
            j++;

            materias[j] = materias[j] + " ".repeat(2 - materias[j].length());
            String mencaoaps = materias[j];
            j++;

            materias[j] = materias[j] + " ".repeat(2 - materias[j].length());
            String mencaobd = materias[j];
            j++;

            materias[j] = materias[j] + " ".repeat(2 - materias[j].length());
            String mencaodesign = materias[j];
            j++;

            materias[j] = materias[j] + " ".repeat(2 - materias[j].length());
            String mencaoeducacaofisica = materias[j];
            j++;

            materias[j] = materias[j] + " ".repeat(2 - materias[j].length());
            String mencaofundamentos = materias[j];
            j++;

            materias[j] = materias[j] + " ".repeat(2 - materias[j].length());
            String mencaofisica = materias[j];
            j++;

            materias[j] = materias[j] + " ".repeat(2 - materias[j].length());
            String mencaohistoria = materias[j];
            j++;

            materias[j] = materias[j] + " ".repeat(2 - materias[j].length());
            String mencaoingles = materias[j];
            j++;

            materias[j] = materias[j] + " ".repeat(2 - materias[j].length());
            String mencaoportugues = materias[j];
            j++;

            materias[j] = materias[j] + " ".repeat(2 - materias[j].length());
            String mencaomatematica = materias[j];
            j++;

            materias[j] = materias[j] + " ".repeat(2 - materias[j].length());
            String mencaopweb = materias[j];
            j++;

            materias[j] = materias[j] + " ".repeat(2 - materias[j].length());
            String mencaoquimica = materias[j];
            j++;

            materias[j] = materias[j] + " ".repeat(2 - materias[j].length());
            String mencaotpa = materias[j];


            String resultado = resultados[i];

            if (resultado.length() < 21) {
                double espacofaltando = (21 - resultado.length());
                if (espacofaltando % 2 != 0){
                    int espacodireita = (int)((espacofaltando / 2) + 1);
                    int espacofaltandoesquerda = (int)(espacofaltando / 2);
                    resultado = " ".repeat(espacofaltandoesquerda) + resultado + " ".repeat(espacodireita);
                } else {
                    int espaco = (int)(espacofaltando / 2);
                    resultado = " ".repeat(espaco) + resultado + " ".repeat(espaco);
                }

            }

            String auladada = aulasdadas[i];

            if (auladada.length() < 5) {
                double espacofaltando = (5 - auladada.length());
                if (espacofaltando % 2 != 0){
                    int espacodireita = (int)((espacofaltando / 2) + 1);
                    int espacofaltandoesquerda = (int)(espacofaltando / 2);
                    auladada = " ".repeat(espacofaltandoesquerda) + auladada + " ".repeat(espacodireita);
                } else {
                    int espaco = (int)(espacofaltando / 2);
                    auladada = " ".repeat(espaco) + auladada + " ".repeat(espaco);
                }

            }

            String falta = faltas[i];

            if (falta.length() < 6) {
                double espacofaltando = (6 - falta.length());
                if (espacofaltando % 2 != 0){
                    int espacodireita = (int)((espacofaltando / 2) + 1);
                    int espacofaltandoesquerda = (int)(espacofaltando / 2);
                    falta = " ".repeat(espacofaltandoesquerda) + falta + " ".repeat(espacodireita);
                } else {
                    int espaco = (int)(espacofaltando / 2);
                    falta = " ".repeat(espaco) + falta + " ".repeat(espaco);
                }

            }

            String frequencia = frequencias[i];

            if (frequencia.length() < 6) {
                double espacofaltando = (6 - frequencia.length());
                if (espacofaltando % 2 != 0){
                    int espacodireita = (int)((espacofaltando / 2) + 1);
                    int espacofaltandoesquerda = (int)(espacofaltando / 2);
                    frequencia = " ".repeat(espacofaltandoesquerda) + frequencia + " ".repeat(espacodireita);
                } else {
                    int espaco = (int)(espacofaltando / 2);
                    frequencia = " ".repeat(espaco) + frequencia + "  ".repeat(espaco);
                }

            }

            System.out.printf("\n%s - %s%s", posicao, nome, rm);
            System.out.printf("| %2s | %2s | %2s | %2s | %2s | %2s | %2s | %2s | %2s | %2s | %2s | %2s | %2s | %2s ", mencaoartes, mencaoaps, mencaobd, mencaodesign, mencaoeducacaofisica, mencaofundamentos, mencaofisica, mencaohistoria, mencaoingles, mencaoportugues, mencaomatematica, mencaopweb, mencaoquimica, mencaotpa);
            System.out.printf("| %s | %s | %s | %s |", resultado, auladada, falta, frequencia);
        }

        sc.close();

    }
}
