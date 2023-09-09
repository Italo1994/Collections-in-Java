package Set.operacoesBasicas;

import java.util.Stack;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado() {

    }

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    /*@Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Convidado convidado)) {
            return false;
        }
        return getCodigoConvite() == convidado.getCodigoConvite();
    }*/

    @Override
    public String toString() {
        return "Convidado{ " +
            "nome='" + this.nome + "\', " +
            "codigoConvite='" + this.codigoConvite + "\' " +
            "}";
    }
}
