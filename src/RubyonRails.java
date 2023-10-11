class RubyonRails extends Planeta {
	public RubyonRails(int x, int y) {
        super("RubyonRails", x, y, 2, 48, "Ruby on Rails, muitas vezes chamado apenas de \"Rails\", é um framework de desenvolvimento web escrito em Ruby. Ele segue a filosofia de convenção sobre configuração (CoC) e é conhecido por sua produtividade e facilidade de uso no desenvolvimento de aplicativos web.");
    }

	@Override
    public void exibirInfo() {
        System.out.println("JavaScript: Velocidade Translação=" + getVelocidadeTranslacao() +
                ", Velocidade Rotação=" + getVelocidadeRotacao() +
                ", Bugs Colididos=" + getBugsColididos() +
                ", Desenvolvedores Colididos=" + getDesenvolvedoresColididos());
    }
}
