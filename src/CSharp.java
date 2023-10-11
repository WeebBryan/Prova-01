class CSharp extends Planeta{
	public CSharp(int x, int y) {
        super("CSharp", x, y, 1, 4, "C# é uma linguagem de programação desenvolvida pela Microsoft. É usado principalmente para desenvolvimento de aplicativos Windows, jogos (por meio do Unity), e aplicações de servidor. C# é parte do ecossistema .NET da Microsoft.");
    }

	@Override
    public void exibirInfo() {
        System.out.println("JavaScript: Velocidade Translação=" + getVelocidadeTranslacao() +
                ", Velocidade Rotação=" + getVelocidadeRotacao() +
                ", Bugs Colididos=" + getBugsColididos() +
                ", Desenvolvedores Colididos=" + getDesenvolvedoresColididos());
    }
}