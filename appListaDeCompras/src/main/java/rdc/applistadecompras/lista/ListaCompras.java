package rdc.applistadecompras.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Rafael Dana
 */
public class ListaCompras {
    ArrayList<String> listaProdutos = new ArrayList<>();
    Scanner teclado = new Scanner(System.in);
    
    public void adicionarItem(){
        System.out.print("Item: ");
        String item = teclado.next();
        if (listaProdutos.contains(item)){
            System.out.print("\nO item ja existe na lista.\n");
        }else{listaProdutos.add(item);}  
    }
    public void removerItem(String item){
        listaProdutos.remove(item);
    }
    public void removerItem(int item){
        listaProdutos.remove(item);
    }
    
    public void imprimirListaDeCompras(){
        Collections.sort(listaProdutos);
        String nome_produto;
        int index;
        int ind_final = listaProdutos.size() - 1;
        System.out.print("\nLista:\n");
        for(index = 0 ; index <= ind_final ; index ++ )
        {
            nome_produto = listaProdutos.get( index );
            System.out.print(index+" - "+nome_produto + '\n');
        } 
        System.out.print("\n----------------------------------------------------\n");
    }
}