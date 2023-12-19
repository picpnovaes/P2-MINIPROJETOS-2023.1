import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeitorDeArquivos
{
    HashMap<String, Personagem> carregarPersonagens(String caminho)
    {
        HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();
        File arquivo = new File(caminho);

        try
        {
           Scanner scan = new Scanner(arquivo);
           System.out.println("Carregando personagens...");
            int i = 0;
            while (scan.hasNextLine())
            {
                i++;                               
                String id = scan.nextLine();
                String nome = scan.nextLine();
                int energia = Integer.parseInt(scan.nextLine());                 
                
                scan.nextLine();              

                System.out.println("Personagem " + i);
                personagens.put(id, new Personagem(nome, energia));
            }
            scan.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return personagens;
    }
     HashMap<String, Capitulo> carregarCapitulos(String caminho, HashMap<String, Personagem> personagens, Scanner scanCap)
     {
         HashMap<String, Capitulo> capitulos = new HashMap<String, Capitulo>();
          
        File arquivo = new File(caminho);

         try
        {
           Scanner scan = new Scanner(arquivo);
           System.out.println("Carregando capitulos...");
            int i = 0;
            while (scan.hasNextLine())
            {
                i++;
                scan.nextLine();
                
                String id = scan.nextLine();
                String nome = scan.nextLine();
                
                
                scan.nextLine();
                
                String idPersonagem = scan.nextLine(); 
                
                Personagem protagonista = personagens.get(idPersonagem);
                
                scan.nextLine();
                
                String linha = scan.nextLine();
                String texto = "";

                while (!linha.equals("VARIACOES"))
                {
                    
                    if (linha.equals(idPersonagem))
                    {
                        texto = texto + nome;

                    }
                    else
                    {
                        texto = texto + linha;
                    }
                    linha = scan.nextLine();
                }

                

                System.out.println("Capitulo " + i);
                capitulos.put(id, new Capitulo(nome, texto, protagonista, scan));
                scan.nextLine();
            }
            
            scan.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return capitulos;
     }
}

   

   

    
    
        
            
               
       

        
    
    

        
              
        
    
                

                
            
            

        

    








        

       
    


