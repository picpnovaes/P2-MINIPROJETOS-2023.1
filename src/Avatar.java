public class Avatar{
    
    static String protagonista1 = "Peter";
    static int cargas = 50;
    static String genero = "Masculino";
    static int sanidade = 10;
    static boolean viajar;
    
        public static void meditar(){
            
            if(sanidade <= 100 || sanidade != 100 ){
                sanidade += 20;
                System.out.println("A sanidade de " + protagonista1 + " foi restaurada, agora ele tem " + sanidade +" de sanidade restante.");

            }
            else{
                System.out.println("A sanidade de "+ protagonista1 + "já está em 100%");
            }
            
        }
        

        public static void viajando(){
                if(viajar == true){
                    sanidade -= 5;
                    cargas -= 10;
                    System.out.println("Você viajou para outra linha do tempo e acabou perdendo um pouco de sanidade, restando somente "+ sanidade + " de sanidade.");
                    System.out.println("Você viajou para outra linha do tempo e acabou perdendo um pouco da carga da chave, restando somente "+ cargas + " cargas");
                }
                else{
                    System.out.println("Você decidiu se manter nessa linha temporal por enquanto, portanto sua sanidade continua sendo "+ sanidade+ "." );
                    System.out.println("Suas cargas da chaves também se mantém as mesmas, portanto ainda restam " + cargas + " de carga.");
                }
            }
        public static void loucura(){
                if(sanidade == 0 || sanidade < 0){
                    System.out.println(protagonista1 + " enlouqueceu e acabou gastando todas as cargas restantes viajando por linhas do tempo aleatórias, ele não sabe se está no passado, presente ou futuro. Apenas vagando pela linha do tempo em que ele foi parar.");
                
                }
                else{
                    System.out.println(protagonista1 + " ainda está mentalmente estável, podendo viajar tranquilamente pelas linhas temporais.");
                }        

        
            }            
}
























   
     
    
    
    
    
    
    
    


