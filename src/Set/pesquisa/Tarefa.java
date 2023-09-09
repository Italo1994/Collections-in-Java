package Set.pesquisa;

public class Tarefa {
    private String descricao;
    private boolean concluido;

    public Tarefa() {
        this.concluido = false;
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluido = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    @Override
    public String toString() {
        return "Tarefa{ " +
                "descricao='" + this.descricao + "\', " +
                "concluido=" + this.concluido + "\' " +
                "}";
    }
}
