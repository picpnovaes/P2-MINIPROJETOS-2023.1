public class Personagem {
    private int sanidade;

    public Personagem(int sanidade) {
        this.sanidade = sanidade;
    }

    public void alterarEnergia(int normal) {
        sanidade += normal;
        System.out.println("A sanidade do personagem está com " + sanidade + " de sanidade." );
    }
}
