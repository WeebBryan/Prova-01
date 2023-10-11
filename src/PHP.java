class PHP extends Planeta{
	public PHP(int x, int y) {
        super("PHP", x, y, 2, 60, "PHP é uma linguagem de script amplamente utilizada para desenvolvimento web. Ela é frequentemente usada para criar páginas web dinâmicas e interagir com bancos de dados. PHP é integrado com muitos sistemas de gerenciamento de conteúdo, como WordPress e Joomla.");
    }

	@Override
    public void exibirInfo() {
        System.out.println("JavaScript: Velocidade Translação=" + getVelocidadeTranslacao() +
                ", Velocidade Rotação=" + getVelocidadeRotacao() +
                ", Bugs Colididos=" + getBugsColididos() +
                ", Desenvolvedores Colididos=" + getDesenvolvedoresColididos());
    }
}
