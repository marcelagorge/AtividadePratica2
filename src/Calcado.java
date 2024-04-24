public class Calcado extends Produto {
    
    private int tamanho;

    public Calcado(String nome, float preco, int tamanho, int id) {
        super(nome, preco, id);
        this.tamanho = tamanho;
    }

    public Calcado() {
    
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Tamanho do Calçado: " + tamanho + "Nome do Calçado: " + getNome() + "Preço do calçado: " + getPreco();
    }

    
    
}
