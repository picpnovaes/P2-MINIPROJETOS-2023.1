import java.util.Scanner;

public class Textos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Personagem protagonista1 = new Personagem(30);


    /////Capítulo 1//////////////////////////////////////
    
   
       
      Capitulo inicio = new Capitulo( Avatar.protagonista1 , ", boa noite. O seu quarto encontra-se a direita do primeiro corredor. Pedimos coerentemente que ignore o barulho do quarto 1412, só está em reforma." +
     "Você segue em direção ao primeiro corredor, porém não lembra em direção deve ir, qual você escolhe?"
     , protagonista1, scan) ;
        
    
   
    //Direita
    Capitulo capitulo1 = new Capitulo(Avatar.protagonista1,"Você acaba observando que o quarto 1412 é ao lado do seu, e um desconhecido o chama para ver o que haverá de novidade nesse quarto. " +
    "Aceita ir conhecer ou irá seguir para seu quarto?",protagonista1,scan );
    
    
    Capitulo capitulo11 = new Capitulo(Avatar.protagonista1,"Você anda em direção ao seu quarto e o abre. " + 
    "Assim que entra, se deita e percebe que o barulho do quarto 1412, ao lado do seu, parou. Ao olhar para cima, percebe que há uma marca antiga na parede de seu quarto. "+
    "Como se houvesse um quadro que ali estava, porém deveria ter sido retirado.Após isso, você se deita e descansa pelo resto da noite."+
    "Fim!",protagonista1,null);
    
    
    //Esquerda
    Capitulo capitulo12 = new Capitulo(null,"Você acaba se perdendo no meio do caminho, porém o recepcionista do hotel lhe encontra e o guia até a porta de seu quarto. " + 
    "Assim que entra, se deita e percebe que o barulho do quarto 1412, ao lado do seu, parou. Após isso, você se deita e descansa pelo resto da noite."+ "Fim!", protagonista1, null );
    
    
    
    Capitulo capitulo13 = new Capitulo(null,"Assim que você entra no quarto, algo muito estranho acontece..." + "De repente o barulho de obras param, o desconhecido que o chamou pede para que você observe o quadro na parede e lhe diz-" +
    "Desconhecido - Esse quadro vale milhões, é como voltar no tempo(O quadro era uma pintura antiga do século passado) " + 
    "Enquanto você observa o quadro, algo de estranho acontece ao redor... O seu arredor começa a escurecer..." + "De repente você acorda ,aparentemente você desmaiou durante a apreciação do quadro, porém o quarto está estranho...Cores e mobílias diferentes, até mesmo a porta está com uma coloração nova. " +
     " Você pensa que está em seu quarto, porém ao sair dele percebe que não chegou a sair do quarto 1412 e até mesmo o corredor está diferente." + 
     " Ainda no corredor, o recepcionista lhe encontra, porém ele está com uma roupa totalmente diferente e fora de época.Ele diz- " +
     " Recepcionista- Por que você entrou aí?Ainda está em reforma, não há nada para ver.Este quarto só ficará pronto quando o dono do hotel autorizar o orçamento. "+
     " Quando você se vira, percebe que o quarto está totalmente desmantelado novamente, porém o quadro não está mais ali."+
      " O recepcionista o acompanha até seu quarto e pede para que aguarde, pois o café da manhã já estava chegando. Entretanto, você havia chegado na noite desse mesmo dia." +
     " Você olha seu relógio analógico e percebe que ele quebrou, seu celular também sumiu. Em busca de respostas em seu quarto, você encontra aquele mesmo quadro antigo. Porém ele parece como se tivesse sido pintado ontem mesmo."+
     " Você vai checa a mobília de seu quarto e percebe que há uma calendário. Ao ver a data, acha que está errado, mas está escrito fevereiro 1992."+
     " Um dia específico também foi marcado, 12 de fevereiro com a seguindo descrição: 'Negócios'."+
     " Assim que vê isso, abre a porta do quarto e sai correndo até a recepção do hotel. Mesmo assustado, percebe que toda a estrutura está diferente, até mesmo os carros estão como se fossem do século 20."+
     "Mesmo sem acreditar, você vai até a rua e percebe que até mesmo os arredores estão totalmente diferentes."+
     "De repente você avista o mesmo sujeito desconhecido, ele lhe reconhece e o chama novamente."+
     "Desconhecido- Gostou do quadro?(O mesmo dando gargalhadas). Pegue essa chave, acredite em mim, mas ela vai ser bem útil."+
     "A chave parecia bem comum, porém igual as chaves dos quartos do hotel. Mas com uma entonação de cor diferente, ela ainda brilhava bastante parecia lhe chamar cada vez mais que você a encarava.",protagonista1,scan);
    
     
     Capitulo capitulo14 = new Capitulo(null,"Ao pegar a chave, sente uma vibração em seu metal. Ao olhar para frente, o desconhecido e suspeito sujeito desparece, sobrando somente isso que lhe deu."+
    " Algo lhe parece estranho na cidade, como se a conhecesse. Olhando para seu redor percebe que há coisas que você já viu em algum lugar, porém não lembra"+
    " Ao checar a frente do hotel, percebe que há um nome que você não tinha lido quando chegou, nem quando o recepcionista informou seu quarto."+
    " O nome era Hotel Valentine, número 1412. Você entra no hotel rapidamente e percebe que as pessoas estão lhe encarando por conta de sua vestimenta ser totalmente incomum naquele local."+
    "Você corre rapidamente para seu quarto. Quando entra, percebe que há uma maleta com roupas adequadas para essa época."+
    "Por baixo das roupas, havia uma espécie de relógio que você nunca tinha visto. Você não sabe se deve pegar, ou simplesmente largá-lo aí."
    ,protagonista1, scan);
    
     Capitulo capitulo15 = new Capitulo(null,"De repente tudo fica escuro novamente...Você acorda no quarto 1412, com um barulho estrondoso de obras."+
     "Você pensa que tudo foi um sonho. O desconhecido sujeito lhe ajuda a se levantar e fala-"+
     " Desconhecido- Parece que você não está muito bem, venha deixe-me tirá-lo daqui."+
     " Após sair, o desconhecido o leva para a porta e com olhar que parecia ser de desapontamento, o deixa ali."+
     " Assim que entra em seu quarto, logo você se deita e percebe que há um quadro com uma imagem diferente, parecia ser do ano atual, porém transmitia uma energia vazia e solitária..."+
     " Fim!", protagonista1, null);
    
     Capitulo capitulo16 = new Capitulo(null,"Ao pegar o relógio, você percebe que ele mostra uma porcentagem, como se fosse algo relacionado a bateria. Porém está escrito em sua interface - '50 aberturas restantes .'"+
     " Qual seria o significado? Mas ao olhar mais afundo na maleta, há também um papel com instruções sobre o relógio."+
     " Ao ler, percebe que se trata da chave. Quando você a aproxima do relógio ela começa a vibrar com mais intensidade. Então a deixa cair sem querer." +
     " Ao ler mais profundamente, ela dita como funciona a chave - 'Você pode utilizá-la em qualquer porta, porém não irá abrir o cômodo que você pensa.'"+
     " Mais abaixo, havia uma descrição do que eram essas aberturas - 'A cada vez que você abrir uma porta, gastará uma carga. NÃO ABRA PORTAS DEMAIS! VOCÊ PODE SE PERDER NO CAMINHO!'"+
     " O recado -Olá, gostou da chave? Aproveite sua aventura aqui. Você pode voltar quando quiser de onde você veio ou simplesmente ir para outros lugares especiais com ela. Mas lembre-se: NÃO ABRA PORTAS DEMAIS, VOCÊ PODE SE PERDER."+
     " Assinado - Smith, John." +
     " Você pega a maleta e sai do hotel, em busca de respostas e atrás desse tal de 'Jonh Smith'. Porém ao sair, algo lhe chama para explorar essa cidade..."+
     " Continua no próximo capítulo!",protagonista1,null);
    
    Capitulo capitulo17 = new Capitulo(null,"Você deixa o relógio, fecha a maleta e sai em direção a porta do quarto." +
    "Ao sair do quarto, percebe algo estranho em sua roupa, e a chave começa a vibrar com muito intesidade."+
    "De repente, ao tentar pegar a chave você percebe que o relógio está em seu braço. Mesmo sem ter colocado, tenta tirar de qualquer jeito."+
    "Porém, ele não sai de modo algum."+
    "Após desistir de tirar o relógio, você verifica a chave e vê que há uma carta dentro de seu bolso junto a ela com uma escrita bem grande - 'LEIA AGORA'."+
    " Ao ler, percebe que se trata da chave. Quando você a aproxima do relógio ela começa a vibrar com mais intensidade. Então a deixa cair sem querer." +
     " Ao ler mais profundamente, ela dita como funciona a chave - 'Você pode utilizá-la em qualquer porta, porém não irá abrir o cômodo que você pensa.'"+
     " Mais abaixo, havia uma descrição do que eram essas aberturas - 'A cada vez que você abrir uma porta, gastará uma carga. NÃO ABRA PORTAS DEMAIS! VOCÊ PODE SE PERDER NO CAMINHO!'"+
     " O recado -Olá, gostou da chave? Aproveite sua aventura aqui. Você pode voltar quando quiser de onde você veio ou simplesmente ir para outros lugares especiais com ela. Mas lembre-se: NÃO ABRA PORTAS DEMAIS, VOCÊ PODE SE PERDER."+
     " Assinado - Smith, John." +
     " Você pega a maleta e sai do hotel, em busca de respostas e atrás desse tal de 'Jonh Smith'. Porém ao sair, algo lhe chama para explorar essa cidade..."+
     " Continua no próximo capítulo!",protagonista1,null);

     Escolha[] escolhasInicio = {
        new Escolha("Opção 1- Direita", capitulo1,30),
        new Escolha("Opção 2- Esquerda", capitulo12,20)
    };
    Escolha[] escolhasCapitulo1 = {
        new Escolha("Opção 1- Você aceita e vê o que terá de tão inovador nesse quarto.", capitulo13,40),
        new Escolha("Opção 2 - Você se nega educadamente e vai em direção ao seu.", capitulo11,30)
    };
    Escolha[] escolhasCapitulo13 = {
        new Escolha("Opção 1 - Pegue a chave", capitulo14,25),
        new Escolha("Opção 2 - Rejeite-a", capitulo15,20)
    };
    Escolha[] escolhascapitulo14 = {
        new Escolha("Opção 1 - Pegue a chave", capitulo16,15),
        new Escolha("Opção 2 - Já aconteceram coisas estranhas demais por hoje, deixe-o aí.", capitulo17,10)
    };














    
     inicio.adicionarEscolhas(escolhasInicio);
     capitulo1.adicionarEscolhas(escolhasCapitulo1);
     capitulo13.adicionarEscolhas(escolhasCapitulo13);
     capitulo14.adicionarEscolhas(escolhascapitulo14);


     Capitulo raiz = inicio;
     raiz.executar();
    
   





}
}