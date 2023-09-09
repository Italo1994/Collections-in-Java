package Set.pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numeroTelefone;

    public Contato() {

    }

    public Contato(String nome, int numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    @Override
    public String toString() {
        return "Contato{ " +
                    "nome='" + this.nome + "\', " +
                    "numeroTelefone='" + this.numeroTelefone + "\' " +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }
}
