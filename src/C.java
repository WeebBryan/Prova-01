class C extends Planeta{
	public C(int x, int y) {
        super("C", x, y, 10, 0.1, "A linguagem C � uma linguagem de programa��o de baixo n�vel amplamente usada em sistemas operacionais, desenvolvimento de sistemas embarcados e desenvolvimento de software de baixo n�vel. � conhecida por sua efici�ncia e controle direto sobre o hardware.");
    }

	@Override
    public void exibirInfo() {
        System.out.println("JavaScript: Velocidade Transla��o=" + getVelocidadeTranslacao() +
                ", Velocidade Rota��o=" + getVelocidadeRotacao() +
                ", Bugs Colididos=" + getBugsColididos() +
                ", Desenvolvedores Colididos=" + getDesenvolvedoresColididos());
    }
}