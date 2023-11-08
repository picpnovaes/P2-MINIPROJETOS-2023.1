import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String texto;
    private String escolha1;
    private String escolha2;
    private Personagem personagem;
    private int alteracaoEnergia;
    private Scanner escaneador;

    
    public Capitulo(String nome, String texto, String escolha1, String escolha2, Personagem personagem, int alteracaoEnergia, Scanner escaneador) {
        this.nome = Avatar.protagonista1;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem = personagem;
        this.alteracaoEnergia = alteracaoEnergia;
        this.escaneador = escaneador;
    }

    
    public void mostrar() {
        System.out.println(nome);
        System.out.println(texto);
        System.out.println("Escolha 1: " + escolha1);
        System.out.println("Escolha 2: " + escolha2);

        
        personagem.alterarEnergia(alteracaoEnergia);
    }

    
    public int escolher() {
        int escolha;
        while (true) {
            System.out.print("Escolha: ");
            String escolhaUsuario = escaneador.nextLine();
            if (escolhaUsuario.equals("1")) {
                escolha = 1;
                break;
            } else if (escolhaUsuario.equals("2")) {
                escolha = 2;
                break;
            } else {
                System.out.println("Escolha inválida. Digite '1' ou '2'.");
            }
        }
        return escolha;
    }
}
