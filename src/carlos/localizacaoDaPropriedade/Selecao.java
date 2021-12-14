package carlos.localizacaoDaPropriedade;

import carlos.Inicio.Inicio;
import carlos.localizacaoDaPropriedade.Sommerchield.Classes.Sommerchield;
import carlos.localizacaoDaPropriedade.Triunfo.Classes.Triunfo;

import java.util.Scanner;

public class Selecao {
    public static void Localizacao(){
        //Inicializando a variavel de preco base da regiao

        System.out.println("Bem Vindo");
        System.out.println("Escolha uma localizacao");
        //Menu Escolha da Localizacao
        System.out.println("==================Digite 1 para Sommerchild================");
        System.out.println("==================Digite 2 para Triunfo================");
        Scanner input = new  Scanner(System.in);
        //Recebendo a localizacao
        int localizacao = input.nextInt();
        if(localizacao == 1) {
            //Antes de chamar a classe abaixo eu gostaria de fazer uma operacao nessa linha.
            //chamando a classe da localizacao
            Sommerchield.LocalizacaoSommerchield();

        }else if(localizacao == 2){


            Triunfo.LocalizacaoTriunfo();
        }else {
            //Laco para caso o usuario digite um valor fora do menu
            while (localizacao != 1 && localizacao != 2){
                System.out.println("Opcao invalida, por favor digite uma opca valida.");
                localizacao = input.nextInt();
            }
        }
    }
}
