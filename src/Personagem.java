public class Personagem {
    private int sanidade;

    public Personagem(String nome, int sanidadeInicial) {
        setSanidade(sanidadeInicial);
    }
    public int getSanidade(){
        return sanidade;
    }

    public void setSanidade(int newSanidade) {
        if(newSanidade >= 0){
            this.sanidade = newSanidade;

        }
        else{
            System.out.println("A Sanidade do personagem está em  0, significa que ele enlouqueceu.");
        }
        System.out.println("A sanidade do personagem está com " + sanidade + " de sanidade." );
    }
}
