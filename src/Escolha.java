public class Escolha {
     String texto;
     Capitulo proximo;
     private int alteracaoSanidade;


    public Escolha(String texto, Capitulo proximo, int alteracaoSanidade) {
        this.texto = texto;
        this.proximo = proximo;
        this.alteracaoSanidade =alteracaoSanidade;
    }
    public String getTexto() {
        return texto;
    }
    public Capitulo getProximo() {
        return proximo;
    }
    public String toString() {
        return texto + ( "| Sanidade alterada: " + alteracaoSanidade);
    }
    public int getAlteracaoSanidade() {
        return alteracaoSanidade;
    }
}