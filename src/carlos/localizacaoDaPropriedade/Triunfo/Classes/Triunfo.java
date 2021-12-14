package carlos.localizacaoDaPropriedade.Triunfo.Classes;

import carlos.TipoDaPropriedade.Flat.Test.FlatTest;
import carlos.TipoDaPropriedade.Vivenda.Test.VivendaTest;

import java.util.Scanner;

public class Triunfo {
    public static void LocalizacaoTriunfo(){


        //FlatTest.Flat();
        System.out.println("Vc Selecionou o bairro de Triunfo ");
        System.out.println("");
        System.out.println("Selecione  o tipo da propriedade: ");
        System.out.println("");
        System.out.println("====================Selecione  1 para Vivenda====================");
        System.out.println("======================Selecione  2 para Flat=====================");
        //Declarando a variavel para o tipo de propriedade
        int tipoDaPropriedade;
        Scanner input = new Scanner(System.in);
        tipoDaPropriedade = input.nextInt();
        //Redicionando o usuario para a selecao do tipo de casa, consoate a sua escolha.
        if(tipoDaPropriedade == 1){
            VivendaTest.Vivenda();
        }else if(tipoDaPropriedade == 2){
            FlatTest.Flat();
        }else {
            // loop para Caso o utilizador digite uma opcao que nao consta no menu
            while (tipoDaPropriedade != 1 && tipoDaPropriedade !=2){
                System.out.println("Por favor digite uma opcao valida ");
                tipoDaPropriedade = input.nextInt();
            }
        }
    }
}
