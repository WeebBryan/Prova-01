class CPlusPlus extends Planeta{
	public CPlusPlus(int x, int y) {
        super("CPlusPlus", x, y, 2, 0.5, "C++ é uma linguagem de programação de alto desempenho usada em muitos domínios, incluindo desenvolvimento de sistemas, jogos, aplicativos de desktop e engenharia de software. É uma extensão da linguagem C, com suporte a programação orientada a objetos.");
    }

	@Override
    public void exibirInfo() {
        System.out.println("JavaScript: Velocidade Translação=" + getVelocidadeTranslacao() +
                ", Velocidade Rotação=" + getVelocidadeRotacao() +
                ", Bugs Colididos=" + getBugsColididos() +
                ", Desenvolvedores Colididos=" + getDesenvolvedoresColididos());
    }
}