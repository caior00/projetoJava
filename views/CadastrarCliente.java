package views;

import classes.Cliente;
import controllers.ClienteController;
import util.Console;

public class CadastrarCliente {

    public void menu(){
        Cliente cliente = new Cliente();        
        ClienteController clienteController = new ClienteController();
        System.out.println("\n -- CADASTRO DE CLIENTES -- \n");
        cliente.setNome(Console.readString("Digite o nome do cliente: "));
        cliente.setSexo(Console.readString("Digite o sexo do cliente:"));
        cliente.setRg(Console.readString("Digite o RG do cliente: "));
        cliente.setCpf(Console.readString("Digite o CPF do cliente: "));   
        cliente.setIdade(Console.readString("Digite a Idade do cliente: "));     
        clienteController.cadastrar(cliente);
        System.out.println("\nCliente cadastrado !!!");
    }
    
}