package dia2;

import dia2.modelo.Modelo;

public class Main {
   

    public static void main(String args[]){
        Modelo modelo = new Modelo();
        modelo.setNome("cadernos");
        modelo.setPreco(10.0);
        modelo.setQuantidade(10);

        System.out.println("nome do produto: "+modelo.getNome()+"\npreco do produto: R$"+modelo.getPreco()+"\nquantidade disponivel: "+modelo.getQuantidade()+" unidades");

    }
}
