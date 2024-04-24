public class Produto {
    
    private int id;
    private String nome;
    private float preco;
   
    public Produto(String nome, float preco, int id) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;
    }

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preço=" + preco + "]";
    }

    
    




    
}

