package classes;

public class Filme {

    private String titulo;
    private String genero;
    private String anoLancamento;
    private String duracaoMinutos;
    private String codigo;

    public String getTitulo() {
        return titulo;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDuracaoMinutos() {
        return duracaoMinutos;
    }
    public void setDuracaoMinutos(String duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
    public String getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public String toString() {
        return 
            "Nome: " + titulo + 
            " | Gênero: " + genero + 
            " | Ano de Lançamento: " + anoLancamento +
            " | Duração em Minutos: " + duracaoMinutos +
            " | Código do Flme: \n" + codigo;

    }


    
}