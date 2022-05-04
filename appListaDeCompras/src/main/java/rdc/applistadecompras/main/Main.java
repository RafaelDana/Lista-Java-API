package rdc.applistadecompras.main;

import rdc.applistadecompras.lista.ListaCompras;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Rafael Dana
 */
public class Main {  
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        ListaCompras lista = new ListaCompras();
        while(true){
             System.out.print("\nSelecione:\n1 - Adicionar item na lista\n2 - remover item\n3 - Exibir a lista\n4 - Encerrar programa\n ->");
            switch(teclado.nextInt()){
                case 1 -> {
                    lista.adicionarItem();
                }
                case 2 -> {
                    System.out.print("Elemento a ser removido: ");
                    String item = teclado.next();
                    if (item.contains("1")||item.contains("2")||item.contains("3")||item.contains("4")||item.contains("5")||item.contains("6")||item.contains("7")||item.contains("8")||item.contains("9")||item.contains("0")){
                        int itemN = Integer.parseInt(item);
                        lista.removerItem(itemN);
                    }else{
                    lista.removerItem(item);
                    }
                }
                case 3 -> {
                    lista.imprimirListaDeCompras();
                }
                case 4 -> {
                    System.exit(0);
                }
            }
        }    
    }
}
