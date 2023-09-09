package Set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;
    
    ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        if(convidadoSet.isEmpty()) {
            System.out.println("Ainda não foi adicionado nenhum convidado!");
        } else {
            for(Convidado convidado : convidadoSet) {
                if(convidado.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = convidado;
                    break;
                }
            }
        }

        convidadoSet.remove(convidadoParaRemover);
    }

    public void contarConvidados() {
        System.out.println("Número de convidados: " + convidadoSet.size());
    }

    public void exibirConvidados() {
        for(Convidado convidado : convidadoSet) {
            System.out.println(convidado.toString());
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidadosEvento = new ConjuntoConvidados();

        convidadosEvento.adicionarConvidado("Italo Hortiz", 12);
        convidadosEvento.adicionarConvidado("Letícia Deodato", 10);
        convidadosEvento.adicionarConvidado("Jack Ryan", 17);
        convidadosEvento.adicionarConvidado("Mariana Pires", 11);

        convidadosEvento.contarConvidados();
        convidadosEvento.exibirConvidados();

        convidadosEvento.removerConvidadoPorCodigoConvite(17);
        convidadosEvento.contarConvidados();
    }
}
