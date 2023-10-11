class CPlusPlus extends Planeta{
	public CPlusPlus(int x, int y) {
        super("CPlusPlus", x, y, 2, 0.5, "C++ � uma linguagem de programa��o de alto desempenho usada em muitos dom�nios, incluindo desenvolvimento de sistemas, jogos, aplicativos de desktop e engenharia de software. � uma extens�o da linguagem C, com suporte a programa��o orientada a objetos.");
    }

	@Override
    public void exibirInfo() {
        System.out.println("JavaScript: Velocidade Transla��o=" + getVelocidadeTranslacao() +
                ", Velocidade Rota��o=" + getVelocidadeRotacao() +
                ", Bugs Colididos=" + getBugsColididos() +
                ", Desenvolvedores Colididos=" + getDesenvolvedoresColididos());
    }
}