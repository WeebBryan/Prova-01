class RubyonRails extends Planeta {
	public RubyonRails(int x, int y) {
        super("RubyonRails", x, y, 2, 48, "Ruby on Rails, muitas vezes chamado apenas de \"Rails\", � um framework de desenvolvimento web escrito em Ruby. Ele segue a filosofia de conven��o sobre configura��o (CoC) e � conhecido por sua produtividade e facilidade de uso no desenvolvimento de aplicativos web.");
    }

	@Override
    public void exibirInfo() {
        System.out.println("JavaScript: Velocidade Transla��o=" + getVelocidadeTranslacao() +
                ", Velocidade Rota��o=" + getVelocidadeRotacao() +
                ", Bugs Colididos=" + getBugsColididos() +
                ", Desenvolvedores Colididos=" + getDesenvolvedoresColididos());
    }
}
