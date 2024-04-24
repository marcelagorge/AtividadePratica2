public class Acessorio extends Produto {
    
    private String tipo;

    public Acessorio(String nome, float preco, String tipo, int id) {
        super(nome, preco, id);
        this.tipo = tipo;
    }

    public Acessorio() {

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tipo do Acessório: " + tipo + "Nome do Acessório: " + getNome() + "Preço do Acessório: " + getPreco();
    }

    

    
}
