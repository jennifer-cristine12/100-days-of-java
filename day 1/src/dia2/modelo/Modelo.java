package dia2.modelo;

public class Modelo {
    private String nome;
    private int quantidade;
    private double preco;
    public void setNome(String nome) {
        this.nome = nome;
    }
  

    public String getNome(){
        return nome;
    }

    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
      this.preco = preco;
    }
   
    
}
