package views;

import classes.Cliente;
import classes.Emprestimo;
import classes.Filme;
import controllers.ClienteController;
import controllers.EmprestimoController;
import controllers.FilmeController;
import util.Console;


public class CadastrarEmprestimo {
    

    public void menu() {

        Emprestimo emprestimo = new Emprestimo();
        EmprestimoController emprestimoController = new EmprestimoController();
        ClienteController clienteController =  new ClienteController();
        FilmeController filmeController = new FilmeController();


        System.out.println(" - Cadastrar Empréstimo - ");

        String rgCliente = Console.readString("Digite o RG do cliente: ");
        Cliente cliente = clienteController.buscarPorRg(rgCliente);
        if (cliente != null) {
            emprestimo.setCliente(cliente);

            String codigoFilme = Console.readString("Digite o código do filme: ");
            Filme filme = filmeController.buscarPorCodigo(codigoFilme);
            if (filme != null) {
                emprestimo.setFilme(filme);
                emprestimoController.cadastrar(emprestimo);
                System.out.println("Empréstimo cadastrado");
            } else {
                System.out.println("Filme não encontrado");
            }

            } else {
                System.out.println("Cliente não encontrado");
            }

        }
}    