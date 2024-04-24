import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Loja {

    private static List<Produto> estoqueLoja = new ArrayList<>();

    public static void cadastrar(Produto produto) {
        estoqueLoja.add(produto);
    }

    public static List<Produto> getestoqueLoja() {
        return estoqueLoja;
    }

    public static Produto buscar(int id) {

        
        for (Produto temp : estoqueLoja) {

            
            if (temp.getId() == id) {

               
                return temp;
            }

        }
       
        return null;

    }

    public static void excluirProduto(int id) {
        Iterator<Produto> iterator = estoqueLoja.iterator();
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            if (produto.getId() == id) {
                iterator.remove();
                System.out.println("\nProduto excluído com sucesso!");
                return;
            }
        }
        System.out.println("\nProduto não encontrado.");
    }

    public static void excluirTodos() {
        estoqueLoja.clear();
        System.out.println("\nTodos os produtos foram excluídos.");
    }
}


