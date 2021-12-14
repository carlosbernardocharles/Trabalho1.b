package carlos.TipoDaPropriedade.Vivenda.Test;

import carlos.TipoDaPropriedade.Vivenda.Classes.Vivenda;
import carlos.localizacaoDaPropriedade.Selecao;

import java.util.Scanner;

public class VivendaTest {
    public static void Vivenda() {
        System.out.println("Vc Selecionou Vivenda");
        Scanner input = new Scanner(System.in);
        //Objecto Vivenda
        Vivenda vivenda = new Vivenda();
        //Menu
        System.out.println("================Selecione o Numero de quartos===============");
        System.out.println("==================Digite 2 para dois quartos================");
        System.out.println("==================Digite 3 para treis quartos================");

        //Atribuindo o valor True para usar no laco while. (Vivenda escolha para a escolha de quartos)
        vivenda.escolha = true;
        vivenda.numeroDeQuartos[0] = input.nextInt();

        //Laco para termino da operacao, a escolha do cliente
        vivenda.terminoDaOperacao = true;
        //O laco segunte consiste em terminar ou contnuar o programa
        while (vivenda.terminoDaOperacao) {
            //Laco do Menu

            //teste metodo

            while (vivenda.escolha) {
                if (vivenda.numeroDeQuartos[0] == 2) {
                    System.out.println("vc selecionou a vivenda com 2 quartos");
                } else if (vivenda.numeroDeQuartos[0] == 3) {
                    System.out.println("vc selecionou a vivenda com 3 quartos");
                } else {
                    //Segundo Laco para caso de o cliente fizer escolha que esta fora do menu
                    while (vivenda.numeroDeQuartos[0] != 2 && vivenda.numeroDeQuartos[0] != 3) {
                        System.out.println("por favor selecione uma opcao valida, tente novamente");
                        vivenda.numeroDeQuartos[0] = input.nextInt();
                        if (vivenda.numeroDeQuartos[0] == 2) {
                            System.out.println("vc selecionou a vivenda com 2 quartos");
                        }
                        if (vivenda.numeroDeQuartos[0] == 3) {
                            System.out.println("vc selecionou a vivenda com 3 quartos");
                        }
                    }
                }
                //Terminando o Laco Main
                vivenda.escolha = false;

            }
            //Opcao para terminar ou continuar a operacao
            System.out.println("Deseja terminar a operacao?");
            System.out.println("");
            System.out.println("digite 1 para continuar");
            System.out.println("digite 0 para terminar");
            //declarando variavel local para decisao de terminar a operacao
            vivenda.decisao = input.nextInt();
            if (vivenda.decisao == 1){
                System.out.println("inciando nova operacao...");
                // espaco resevardo para chamar outra operacao
                Selecao.Localizacao();
            }else if(vivenda.decisao == 0){
                vivenda.terminoDaOperacao = false;
                System.exit(0);
            }else {
                while (vivenda.decisao !=1 && vivenda.decisao !=0){
                    System.out.println("por favor digite uma opcao valida.");
                    vivenda.decisao = input.nextInt();
                }
            }
            //vivenda.terminoDaOperacao = false;
        }
    }
}
