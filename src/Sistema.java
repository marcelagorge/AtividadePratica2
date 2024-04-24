public class Sistema {
    
    private static void exibirMenu(){

        System.out.println("\nLoja de Roupas MM'S");
        System.out.println("1) Cadastrar Roupa.");
        System.out.println("2) Cadastrar Calçado.");
        System.out.println("3) Cadastrar Acessório");
        System.out.println("4) Procurar Produto.");
        System.out.println("5) Listar todos os Produtos");
        System.out.println("6) Excluir um Produto.");
        System.out.println("7) Excluir todos os Produtos");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção");
    }

    private static void verificarOpcao(int op){

        String nome;
        String tipo;
        String cor;
        String tamanhoLetra;
        int id;
        int tamanho;
        float preco;
        

        switch (op) {
            case 1:
                System.out.println("\nNova Roupa:");
                System.out.println("ID da Roupa: ");
                id = Console.lerInt();

                System.out.println("Nome da roupa: ");
                nome = Console.lerString();

                System.out.println("Tamanho da roupa: ");
                tamanhoLetra = Console.lerString();

                System.out.println("Cor da roupa: ");
                cor = Console.lerString();

                System.out.println("Preço da roupa: ");
                preco = Console.lerFloat();

                Roupa r = new Roupa(nome, preco, tamanhoLetra, cor, id);

                Loja.cadastrar(r);

                break;

            case 2:
                System.out.println("\nNovo Calçado:");
                System.out.println("ID do Calçado: ");
                id = Console.lerInt();

                System.out.println("Nome do Calçado: ");
                nome = Console.lerString();

                System.out.println("Tamanho do Calçado: ");
                tamanho = Console.lerInt();

                System.out.println("Preço da roupa: ");
                preco = Console.lerFloat();

                Calcado c = new Calcado(nome, preco, tamanho, id);

                Loja.cadastrar(c);


                break;
        
            case 3:

                System.out.println("\nNovo Acessório:");
                System.out.println("ID do Acessório: ");
                id = Console.lerInt();

                System.out.println("Nome do Acessório: ");
                nome = Console.lerString();

                System.out.println("Preço do Acessório: ");
                preco = Console.lerFloat();

                System.out.println("Tipo de Acessório: ");
                tipo = Console.lerString();

                Acessorio a = new Acessorio(nome, preco, tipo, id);

                Loja.cadastrar(a);

                break;

            case 4:

                System.out.println("\nProcurar Produto:");

                    System.out.print("ID do Produto: ");
                    id = Console.lerInt();

                    Produto p = Loja.buscar(id);

                    if (p != null) {

                        System.out.println("\nProduto Localizado:");
                        System.out.println(p.toString());
                        return;

                    }

                    System.out.println("\nProduto " + id + " não foi encontrado");

                    break;
            
            case 5:

                System.out.println("\nTodos os Produtos Cadastrados:");

               
                    if (Loja.getestoqueLoja().size() == 0) {

                        System.out.println("\nNão há Produtos cadastrados...");
                        return; 

                    }

                   
                    for (Produto temp : Loja.getestoqueLoja()) {

                        System.out.println(temp.toString());

                    }

                    break;

            case 6:

                System.out.println("\nExcluir Produto:");
                System.out.print("ID do Produto: ");
                id = Console.lerInt();
                Loja.excluirProduto(id);
                break;

            case 7:

                System.out.println("\nExcluir Todos os Produtos:");
                Loja.excluirTodos();
                break;
                        
            case 0:

                System.out.println("\nO programa foi finalizado...");
                break;

            default:

                System.out.println("\nOpção inválida. Digite novamente.");
                break;
            
        }


    }

    public static void executar() {
        int op;
        do {
            exibirMenu();
            op = Console.lerInt(); 
            verificarOpcao(op);
        } while (op != 0); 
    }
}
