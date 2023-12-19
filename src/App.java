import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class App
{
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

LeitorDeArquivos leitor = new LeitorDeArquivos();

Map<String, Personagem> personagens = leitor.carregarPersonagens("rsc/Personagens.txt");

Map<String, Capitulo> capitulos = leitor.carregarCapitulos("rsc/Capitulos.txt", (HashMap<String, Personagem>) personagens,scan);

Capitulo raiz = capitulos.get("Raiz");
raiz.executar();







    }
}