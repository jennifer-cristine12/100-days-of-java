package dia012.view;

import dia012.control.*;
import dia012.model.StringModel;
import java.util.Scanner;

public class StringView {
    StringModel SM = new StringModel();
    StringControl SC = new StringControl();
    Scanner scan = new Scanner(System.in);

    public void menuString() {
        System.out.print(
                "qual operação deseja realizar:\n1: Comprimento da string\n2: juntar duas Strings\n3: comparar duas Strings\n4: deixar tudo em maiusculo\n5: remover espaços desnecessarios\n6: pegar um pedaço de uma String\n7: extrair uma palavra\n8: inverter uma String\n9: verificar se existe uma palavra\n");
        SM.setStr(scan.nextLine());
        escolha(SM.getStr());
    }

    private void escolha(String escolha) {
        switch (escolha) {
            case "1" -> {
                System.out.print("escreva uma palavra\n");
                SM.setStr(scan.nextLine());
                System.out.println("a palavra possui "+SC.strLength(SM.getStr())+" caracteres");
            }
            case "2" -> {
                System.out.print("escreva a primeira frase\n");
                SM.setStr(scan.nextLine());
                System.out.print("escreva a segunda frase\n");
                SM.setStr2(scan.nextLine());
                System.out.println("as duas frases formam: "+SC.strConcat(SM.getStr(), SM.getStr2()));
                
            }
            case "3" -> {
                System.out.print("escreva a primeira frase\n");
                SM.setStr(scan.nextLine());
                System.out.print("escreva a segunda frase\n");
                SM.setStr2(scan.nextLine());
                if(SC.strEquals(SM.getStr(), SM.getStr2())){
                    System.out.println("as duas frases são iguais");
                }
                else{
                    System.out.println("As duas frases não são iguais");
                }
                
            }
            case "4" -> {
                System.out.print("escreva a frase\n");
                SM.setStr(scan.nextLine());
                System.out.println("deseja colocar a frase em maiusculo, se sim, aperte 1");
                SM.setOption(scan.nextInt());
                System.out.println("a frase convertida foi: "+SC.upLow(SM.getStr(), SM.getOption()));
                
                
            }
            case "5" -> {
                System.out.print("escreva a frase\n");
                SM.setStr(scan.nextLine());
                System.out.println("Sua frase sem espaços: "+SC.strTrim(SM.getStr()));
                
            }
            case "6" -> {
                System.out.print("escreva a frase\n");
                SM.setStr(scan.nextLine());
                System.out.println("escreva o numero da onde começa a posição da busca");
                SM.setOption(scan.nextInt());
                System.out.println("escreva o numero da onde termina a posição da busca");
                SM.setOption2(scan.nextInt());
                System.out.println("o pedaço da string "+SM.getStr()+" extraido é: "+SC.strExtract(SM.getStr(), SM.getOption(), SM.getOption2()));
            }
            case "7" -> {
                System.out.print("escreva a frase\n");
                SM.setStr(scan.nextLine());
                System.out.println("a frase dividida em subfrases é: "+SC.strSplit(SM.getStr()));
            }
            case "8" -> {
                System.out.println("escreva a frase\n");
                SM.setStr(scan.nextLine());
                System.out.println("a frase invertida é: "+SC.strReversal(SM.getStr()));
            }
            case "9" -> {
                System.out.println("escreva a frase\n");
                SM.setStr(scan.nextLine());
                System.out.println("escreva palavra que deseja buscar");
                SM.setStr2(scan.next());
                if (SC.busca(SM.getStr(), SM.getStr2())) {
                    System.out.println("a palavra foi encontrada");
                }
                else{
                    System.out.println("a palavra não foi encontrada");
                }
            }
            default -> System.err.println("opção invalida");
        }
    }
}
