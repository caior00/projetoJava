package classes;

public class Emprestimo {

    private Cliente cliente;
    private Filme filme;
    
    public Cliente getCliente() {
        return cliente;
    }
    public Filme getFilme() {
        return filme;
    }
    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

    @Override
    public String toString() {
        return 
            "Cliente: " + cliente.getNome() +
            " | Filme emprestado: " + filme.getTitulo();
    }

}