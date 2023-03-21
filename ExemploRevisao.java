package AulaRevisao1;

import java.util.Scanner;

public class ExemploRevisao {
    Scanner sc = new Scanner(System.in);
    //sc é o objeto da classe scanner
    // sc.next in é um metodo da classe scanner

    public void exemplo1() {
        System.out.println(" Informe a 1° nota do aluno!! ");
        int nota1 = sc.nextInt();
        System.out.println(" Informe a 2° nota do aluno!! ");
        int nota2 = sc.nextInt();
        double media = (nota1+nota2)/2;
        System.out.println(" A média do aluno é " + media);
        System.out.println(" Informe o total de aulas da disciplina!! ");
        int aulasDadas = sc.nextInt();
        System.out.println(" Informe a quantidade de faltas do aluno!! ");
        int totalFaltas = sc.nextInt();
        double frequencia = ((aulasDadas-totalFaltas)*100)/aulasDadas;
        System.out.println(" A frequência do aluno é " +frequencia+ "%" );
        if(media>=50 && frequencia>=75 ) {
           System.out.println(" Aluno aprovado!! ");
        } else if (media<50 && frequencia>=75){
            System.out.println(" Aluno de recuperação ");
        } else {
            System.out.println(" Aluno reprovado!! ");
        }
    }
}
