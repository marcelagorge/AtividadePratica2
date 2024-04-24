public class Roupa extends Produto {
    
    private String tamanhoLetra;
    private String cor;
    
    
    public Roupa(String nome, float preco, String tamanhoLetra, String cor, int id) {
        super(nome, preco, id);
        this.tamanhoLetra = tamanhoLetra;
        this.cor = cor;
    }

    public Roupa() {
        
    }

    public String getTamanhoLetra() {
        return tamanhoLetra;
    }

    public void setTamanhoLetra(String tamanhoLetra) {
        this.tamanhoLetra = tamanhoLetra;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override
    public String toString() {
        return "Tamanho da Roupa: " + tamanhoLetra + "Cor da Roupa: " + cor + "Nome da Roupa: " + getNome() + "Preço da roupa: " + getPreco();
    }


    
    
}
