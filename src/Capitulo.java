import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String texto;
    private String[] escolhas;
    private Personagem personagem;
    private int alteracaoEnergia;
    private Scanner escaneador;

    
    public Capitulo(String nome, String texto, String[] escolhas, Personagem personagem, int alteracaoEnergia, Scanner escaneador) {
        this.nome = Avatar.protagonista1;
        this.texto = texto;
        this.escolhas = escolhas;
        this.personagem = personagem;
        this.alteracaoEnergia = alteracaoEnergia;
        this.escaneador = escaneador;
    }

    
    public void mostrar() {
        System.out.println(nome);
        System.out.println(texto);
        
        for (int i = 0; i < escolhas.length; i++) {
            System.out.println(i + ". " + escolhas[i]);
        }
        
        personagem.alterarEnergia(alteracaoEnergia);
    }

    
    public int escolher() {
        while (true) {
            System.out.print("Escolha (1 ou 2): ");
            String scan = escaneador.nextLine().trim();

            if (scan.equals("1")) {
                return 0; 
            } else if (scan.equals("2")) {
                return 1; 
            } else {
                System.out.println("Escolha inválida. Digite 1 ou 2.");
            }
        }
        
            
    }
}

