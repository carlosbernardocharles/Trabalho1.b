package carlos.TipoDaPropriedade.Flat.Test;

import carlos.Inicio.Testando;
import carlos.TipoDaPropriedade.Flat.Classes.Flat;
import carlos.localizacaoDaPropriedade.Selecao;

import java.util.Scanner;

public class FlatTest {
    public static void Flat() {
        System.out.println("Vc Selecionou Flat");
        Flat flat = new Flat();
        flat.valorDaFlat = 50.000;
        System.out.println("Flat");
        ///TEst
        Scanner input = new Scanner(System.in);

        //Menu selecao de numeros de quartos
        System.out.println("================Selecione o Numero de quartos================");
        System.out.println("==================Digite 1 para um quarto====================");
        System.out.println("==================Digite 2 para dois quartos=================");
        System.out.println("==================Digite 3 para treis quartos================");

        //atribuindo o valor true para  usar no laco while
        flat.escolha =true;
        flat.numeroDeQuartos[0] = input.nextInt();

        flat.terminoDaOperacao = true;
        //O laco segunte consiste em terminar ou contnuar o programa
        while (flat.terminoDaOperacao){

        //Laco do Menu para escolha
        while (flat.escolha){
            if(flat.numeroDeQuartos[0] == 1){
                System.out.println("Vc selecionou a Flat com um quarto");
            }else if(flat.numeroDeQuartos[0] == 2){
                System.out.println("Vc selecionou a flat com dois quartos");
            }else if(flat.numeroDeQuartos[0] == 3){
                System.out.println("Vc selecionou a Flat com treis quartos");
            }else {
                //Segundo laco para caso o cliente Faca uma escolha fora do menu
                while(flat.numeroDeQuartos[0] != 1 && flat.numeroDeQuartos[0] != 2 && flat.numeroDeQuartos[0] !=3){
                    System.out.println("por favor selecione uma opcao valida, tente novamente");
                    flat.numeroDeQuartos[0] = input.nextInt();
                    if(flat.numeroDeQuartos[0] == 1){
                        System.out.println("Vc selecionou a Flat com um quarto");
                    }if (flat.numeroDeQuartos[0] ==2){
                        System.out.println("Vc selecionou a Flat com dois quartos");
                    }if(flat.numeroDeQuartos[0] == 3){
                        System.out.println("Vc selecionou a flat com treis quartos");
                    }
                    //flat.escolha = false;
                }
            }
            //Condicao para terminar o laco
            flat.escolha = false;

        }

        //Opcao para terminar ou continuar a operacao
        System.out.println("Deseja terminar a operacao?");
        System.out.println("");
        System.out.println("digite 1 para continuar");
        System.out.println("digite 0 para terminar");
        //declarando variavel local para decisao de terminar a operacao
        flat.decisao = input.nextInt();
        if (flat.decisao == 1){
            System.out.println("inciando nova operacao...");
            // espaco resevardo para chamar outra operacao
            Selecao.Localizacao();
        }else if(flat.decisao == 0){

            System.exit(0);
        }else {
            while (flat.decisao !=1 && flat.decisao !=0){
                System.out.println("por favor digite uma opcao valida.");
                flat.decisao = input.nextInt();
            }
        }
        //vivenda.terminoDaOperacao = false;
    }



    }
}
