package exercicios;

public class CidadeMutavel {

    private String nome;

    public CidadeMutavel(String nome) { this.nome = nome; }

    public String getNome() { return nome; }

    public void setNome(String novoNome) { this.nome = novoNome; }
}