package views;


import util.Console;




public class Principal {
    public static void main(String[] args) {
    int opcao = 0;


        do {
            System.out.println("\n Sistema de Gerenciamento da Locadora");
            System.out.println("1 - Cadastrar Filme");
            System.out.println("2 - Listar Filmes");
            System.out.println("3 - Cadastrar Cliente");
            System.out.println("4 - Listar Clientes");
            System.out.println("5 - Cadastrar Emprestimo");
            System.out.println("6 - Listar Emprestimos");
            System.out.println("0 - Sair");
            opcao = Console.readInt("Digite uma opção: ");

            switch (opcao) {
                case 1:
                CadastrarFilme cadastrarFilme = new CadastrarFilme();
                cadastrarFilme.menu();
              
                break;

                case 2:
                ListarFilmes listarFilmes = new ListarFilmes();
                listarFilmes.menu();

                break;

                case 3: 
                CadastrarCliente cadastrarCliente = new CadastrarCliente();
                cadastrarCliente.menu();

                break;

                case 4:
                ListarClientes listarClientes = new ListarClientes();
                listarClientes.menu();

                break;

                case 5:
                CadastrarEmprestimo cadastrarEmprestimo = new CadastrarEmprestimo();
                cadastrarEmprestimo.menu();

                break;

                case 6:
                ListarEmprestimos listarEmprestimos = new ListarEmprestimos();
                listarEmprestimos.menu();
                break;

                case 0:
                    System.out.println("\n -- SAINDO -- \n");
                    break;
   

                default:
                System.out.println("\n - Opção Inválida - \n");
                break;

            }

            } while (opcao != 0);

            

        }
        
    }