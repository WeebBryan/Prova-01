class PHP extends Planeta{
	public PHP(int x, int y) {
        super("PHP", x, y, 2, 60, "PHP � uma linguagem de script amplamente utilizada para desenvolvimento web. Ela � frequentemente usada para criar p�ginas web din�micas e interagir com bancos de dados. PHP � integrado com muitos sistemas de gerenciamento de conte�do, como WordPress e Joomla.");
    }

	@Override
    public void exibirInfo() {
        System.out.println("JavaScript: Velocidade Transla��o=" + getVelocidadeTranslacao() +
                ", Velocidade Rota��o=" + getVelocidadeRotacao() +
                ", Bugs Colididos=" + getBugsColididos() +
                ", Desenvolvedores Colididos=" + getDesenvolvedoresColididos());
    }
}
