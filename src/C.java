class C extends Planeta{
	public C(int x, int y) {
        super("C", x, y, 10, 0.1, "A linguagem C é uma linguagem de programação de baixo nível amplamente usada em sistemas operacionais, desenvolvimento de sistemas embarcados e desenvolvimento de software de baixo nível. É conhecida por sua eficiência e controle direto sobre o hardware.");
    }

	@Override
    public void exibirInfo() {
        System.out.println("JavaScript: Velocidade Translação=" + getVelocidadeTranslacao() +
                ", Velocidade Rotação=" + getVelocidadeRotacao() +
                ", Bugs Colididos=" + getBugsColididos() +
                ", Desenvolvedores Colididos=" + getDesenvolvedoresColididos());
    }
}