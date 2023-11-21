public class Escolha {
    String texto;
    Capitulo proximo;

    public Escolha(String texto, Capitulo proximo) {
        this.texto = texto;
        this.proximo = proximo;
    }
    public String getTexto() {
        return texto;
    }
    public Capitulo getProximo() {
        return proximo;
    }
    public String toString() {
        return texto;
    }
}