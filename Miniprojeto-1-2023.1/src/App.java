import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner escolhas = new Scanner(System.in);
        System.out.println("Olá, bem vindo ao  nosso querido hotel. Poderia informar seu nome por favor?");
        String nome = escolhas.nextLine();
        System.out.println("Olá, " + nome + ", boa noite. O seu quarto encontra-se a direita do primeiro corredor. Pedimos coerentemente que ignore o barulho do quarto 1412, só está em reforma.");
        System.out.println("Você segue em direção ao primeiro corredor, porém não lembra em direção deve ir, qual você escolhe?");
        System.out.println("Opção 1 - Direita; Opção 2 - Esquerda");
        System.out.println("Escreva '1' ou '2',isso valerá para todas as opções futuras.  ");
        int caminhos = escolhas.nextInt();
        
    


    


    
    
    
    if(caminhos == 1 ){
        System.out.println("Você escolheu a opção" + caminhos);
        System.out.println("Você acaba observando que o quarto 1412 é ao lado do seu, e um desconhecido o chama para ver o que haverá de novidade nesse quarto.");
        System.out.println("Aceita ir conhecer ou irá seguir para seu quarto?");
        System.out.println("Opção 1- Você aceita e vê o que terá de tão inovador nesse quarto. ");
        System.out.println("Opção 2 - Você se nega educadamente e vai em direção ao seu.");
        int caminho = escolhas.nextInt();
            if(caminho == 1){
                System.out.println("Você escolheu a opção " + caminho);
                System.out.println("Assim que você entra no quarto, algo muito estranho acontece...");
                System.out.println("De repente o barulho de obras param, o desconhecido que o chamou pede para que você observe o quadro na parede e lhe diz-");
                System.out.println("Desconhecido - Esse quadro vale milhões, é como voltar no tempo(O quadro era uma pintura antiga do século passado)");
                System.out.println("Enquanto você observa o quadro, algo de estranho acontece ao redor... O seu arredor começa a escurecer...");
                System.out.println("De repente você acorda ,aparentemente você desmaiou durante a apreciação do quadro, porém o quarto está estranho...Cores e mobílias diferentes, até mesmo a porta está com uma coloração nova.");
                System.out.println("Você pensa que está em seu quarto, porém ao sair dele percebe que não chegou a sair do quarto 1412 e até mesmo o corredor está diferente.");
                System.out.println("Ainda no corredor, o recepcionista lhe encontra, porém ele está com uma roupa totalmente diferente e fora de época.Ele diz- ");
                System.out.println("Recepcionista- Por que você entrou aí?Ainda está em reforma, não há nada para ver.Este quarto só ficará pronto quando o dono do hotel autorizar o orçamento. ");
                System.out.println("Quando você se vira, percebe que o quarto está totalmente desmantelado novamente, porém o quadro não está mais ali.");
                System.out.println("O recepcionista o acompanha até seu quarto e pede para que aguarde, pois o café da manhã já estava chegando. Entretanto, você havia chegado na noite desse mesmo dia.");
                System.out.println("Você olha seu relógio analógico e percebe que ele quebrou, seu celular também sumiu. Em busca de respostas em seu quarto, você encontra aquele mesmo quadro antigo. Porém ele parece como se tivesse sido pintado ontem mesmo.");
                System.out.println("Você vai checa a mobília de seu quarto e percebe que há uma calendário. Ao ver a data, acha que está errado, mas está escrito fevereiro 1992.");
                System.out.println("Um dia específico também foi marcado, 12 de fevereiro com a seguindo descrição: 'Negócios'.");
                System.out.println("Assim que vê isso, abre a porta do quarto e sai correndo até a recepção do hotel. Mesmo assustado, percebe que toda a estrutura está diferente, até mesmo os carros estão como se fossem do século 20.");
                System.out.println("Mesmo sem acreditar, você vai até a rua e percebe que até mesmo os arredores estão totalmente diferentes.");
                System.out.println("De repente você avista o mesmo sujeito desconhecido, ele lhe reconhece e o chama novamente.");
                System.out.println("Desconhecido- Gostou do quadro?(O mesmo dando gargalhadas). Pegue essa chave, acredite em mim, mas ela vai ser bem útil.");
                System.out.println("A chave parecia bem comum, porém igual as chaves dos quartos do hotel. Mas com uma entonação de cor diferente, ela ainda brilhava bastante parecia lhe chamar cada vez mais que você a encarava.");
                System.out.println("Opção 1 - Pegue a chave; Opção 2 - Reijeite");
                int caminho2 = escolhas.nextInt();
                if(caminho2 == 1){
                    System.out.println("Você escolheu a opção " + caminho2);
                    System.out.println("Ao pegar a chave, sente uma vibração em seu metal. Ao olhar para frente, o desconhecido e suspeito sujeito desparece, sobrando somente isso que lhe deu.");
                    System.out.println("Algo lhe parece estranho na cidade, como se a conhecesse. Olhando para seu redor percebe que há coisas que você já viu em algum lugar, porém não lembra");
                    System.out.println("Ao checar a frente do hotel, percebe que há um nome que você não tinha lido quando chegou, nem quando o recepcionista informou seu quarto.");
                    System.out.println("O nome era Hotel Valentine, número 1412. Você entra no hotel rapidamente e percebe que as pessoas estão lhe encarando por conta de sua vestimenta ser totalmente incomum naquele local.");
                    System.out.println("Você corre rapidamente para seu quarto. Quando entra, percebe que há uma maleta com roupas adequadas para essa época.");
                    System.out.println("Por baixo das roupas, havia uma espécie de relógio que você nunca tinha visto. Você não sabe se deve pegar, ou simplesmente largá-lo aí.");
                    System.out.println("Opção 1- Pegue o relógio; Opção 2 - Já aconteceram coisas estranhas demais por hoje, deixe-o aí. ");
                    int caminho21 = escolhas.nextInt();
                    if(caminho21 == 1){
                        System.out.println("Você escolheu a opção " + caminho21);
                        System.out.println("Ao pegar o relógio, você percebe que ele mostra uma porcentagem, como se fosse algo relacionado a bateria. Porém está escrito em sua interface - '50 aberturas restantes .'");
                        System.out.println("Qual seria o significado? Mas ao olhar mais afundo na maleta, há também um papel com instruções sobre o relógio.");
                        System.out.println("Ao ler, percebe que se trata da chave. Quando você a aproxima do relógio ela começa a vibrar com mais intensidade. Então a deixa cair sem querer.");
                        System.out.println("Ao ler mais profundamente, ela dita como funciona a chave - 'Você pode utilizá-la em qualquer porta, porém não irá abrir o cômodo que você pensa.'");
                        System.out.println("Mais abaixo, havia uma descrição do que eram essas aberturas - 'A cada vez que você abrir uma porta, gastará uma carga. NÃO ABRA PORTAS DEMAIS! VOCÊ PODE SE PERDER NO CAMINHO!'");
                        System.out.println("Ao olhar mais embaixo, vê que há uma assinatura com um nome e um recado para você -");
                        System.out.println("O recado -Olá, gostou da chave? Aproveite sua aventura aqui. Você pode voltar quando quiser de onde você veio ou simplesmente ir para outros lugares especiais com ela. Mas lembre-se: NÃO ABRA PORTAS DEMAIS, VOCÊ PODE SE PERDER.");
                        System.out.println("Assinado - Smith, John.");
                        System.out.println("Você pega a maleta e sai do hotel, em busca de respostas e atrás desse tal de 'Jonh Smith'. Porém ao sair, algo lhe chama para explorar essa cidade...");
                        System.out.println("Continua no próximo capítulo!");
                    }
                    else if(caminho21 == 2){
                        System.out.println("Você escolheu a opção " + caminho21);
                        System.out.println("Você deixa o relógio, fecha a maleta e sai em direção a porta do quarto.");
                        System.out.println("Ao sair do quarto, percebe algo estranho em sua roupa, e a chave começa a vibrar com muito intesidade.");
                        System.out.println("De repente, ao tentar pegar a chave você percebe que o relógio está em seu braço. Mesmo sem ter colocado, tenta tirar de qualquer jeito.");
                        System.out.println("Porém, ele não sai de modo algum.");
                        System.out.println("Após desistir de tirar o relógio, você verifica a chave e vê que há uma carta dentro de seu bolso junto a ela com uma escrita bem grande - 'LEIA AGORA'.");
                        System.out.println("Ao ler, percebe que se trata da chave. Quando você a aproxima do relógio ela começa a vibrar com mais intensidade. Então a deixa cair sem querer.");
                        System.out.println("Ao ler mais profundamente, ela dita como funciona a chave - 'Você pode utilizá-la em qualquer porta, porém não irá abrir o cômodo que você pensa.'");
                        System.out.println("Mais abaixo, havia uma descrição do que eram essas aberturas - 'A cada vez que você abrir uma porta, gastará uma carga. NÃO ABRA PORTAS DEMAIS! VOCÊ PODE SE PERDER NO CAMINHO!'");
                        System.out.println("Ao olhar mais embaixo, vê que há uma assinatura com um nome e um recado para você -");
                        System.out.println("O recado - Olá, gostou da chave? Aproveite sua aventura aqui. Você pode voltar quando quiser de onde você veio ou simplesmente ir para outros lugares especiais com ela. Mas lembre-se: NÃO ABRA PORTAS DEMAIS, VOCÊ PODE SE PERDER.");
                        System.out.println("Assinado - Smith, John.");
                        System.out.println("Você pega a maleta e sai do hotel, em busca de respostas e atrás desse tal de 'Jonh Smith'. Porém ao sair, algo lhe chama para explorar essa cidade...");
                        System.out.println("Continua no próximo capítulo!");


                    }
                    else {
                    System.out.println("Escolha inválida, tente novamente.");
                    }   
                
                    
                }
                else if(caminho2 == 2){
                    System.out.println("Você escolheu a opção " + caminho2);
                    System.out.println("De repente tudo fica escuro novamente...Você acorda no quarto 1412, com um barulho estrondoso de obras.");
                    System.out.println("Você pensa que tudo foi um sonho. O desconhecido sujeito lhe ajuda a se levantar e fala-");
                    System.out.println("Desconhecido- Parece que você não está muito bem, venha deixe-me tirá-lo daqui.");
                    System.out.println("Após sair, o desconhecido o leva para a porta e com olhar que parecia ser de desapontamento, o deixa ali.");
                    System.out.println("Assim que entra em seu quarto, logo você se deita e percebe que há um quadro com uma imagem diferente, parecia ser do ano atual, porém transmitia uma energia vazia e solitária...");
                    System.out.println("Fim!");

                }
                else {
                System.out.println("Escolha inválida, tente novamente.");
                }
                
            }
            else if(caminho == 2){
                System.out.println("Você escolheu a opção " + caminho);
                System.out.println("Você anda em direção ao seu quarto e o abre. ");
                System.out.println("Assim que entra, se deita e percebe que o barulho do quarto 1412, ao lado do seu, parou. Ao olhar para cima, percebe que há uma marca antiga na parede de seu quarto.");
                System.out.println("Como se houvesse um quadro que ali estava, porém deveria ter sido retirado.Após isso, você se deita e descansa pelo resto da noite.");
                System.out.println("Fim!");
            
                

        }    

            


    }
    else if(caminhos == 2){
        System.out.println("Você escolheu a opção" + caminhos);
        System.out.println("Você acaba se perdendo no meio do caminho, porém o recepcionista do hotel lhe encontra e o guia até a porta de seu quarto.");
        System.out.println("Assim que entra, se deita e percebe que o barulho do quarto 1412, ao lado do seu, parou. Após isso, você se deita e descansa pelo resto da noite.");
        System.out.println("Fim!");
        
        
    }
    else {
        System.out.println("Escolha inválida, tente novamente.");
    }
    escolhas.close();
}
}
