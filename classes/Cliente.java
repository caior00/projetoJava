package classes;

public class Cliente{

    private String nome;
    private String sexo;
    private String rg;
    private String cpf;
    private String idade;


    
    public String getIdade() {
        return idade;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }

    

    @Override
    public String toString() {
        return 
            "Nome do cliente : " + nome + 
            " | RG: " + rg +
            " | CPF: " + cpf;

    }





}