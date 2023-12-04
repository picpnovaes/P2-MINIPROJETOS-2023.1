import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String texto;
    private Escolha[] escolhas;
    private Personagem personagem;
    private Scanner escaneador;

    
    public Capitulo(String nome, String texto, Personagem personagem, Scanner escaneador) {
        this.nome = Avatar.protagonista1;
        this.texto = texto;
        this.personagem = personagem;       
        this.escaneador = escaneador;
    }

    public void adicionarEscolhas(Escolha[] escolhas) {
        this.escolhas = escolhas;
    }
    
    private void mostrar() {
        System.out.println(nome);
        System.out.println(texto);
        
        for (int i = 0; i < escolhas.length; i++) {
            System.out.println(i + ". " + escolhas[i]);
        }
        
        

    }
    public void executar() {
        mostrar();
        int escolha = escolher();
        Escolha escolhaAtual = escolhas[escolha];
        Capitulo proximoCapitulo = escolhaAtual.proximo;
        proximoCapitulo.executar();
        personagem.setSanidade(personagem.getSanidade() + escolhaAtual.getAlteracaoSanidade());
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

