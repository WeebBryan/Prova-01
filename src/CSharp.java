class CSharp extends Planeta{
	public CSharp(int x, int y) {
        super("CSharp", x, y, 1, 4, "C# � uma linguagem de programa��o desenvolvida pela Microsoft. � usado principalmente para desenvolvimento de aplicativos Windows, jogos (por meio do Unity), e aplica��es de servidor. C# � parte do ecossistema .NET da Microsoft.");
    }

	@Override
    public void exibirInfo() {
        System.out.println("JavaScript: Velocidade Transla��o=" + getVelocidadeTranslacao() +
                ", Velocidade Rota��o=" + getVelocidadeRotacao() +
                ", Bugs Colididos=" + getBugsColididos() +
                ", Desenvolvedores Colididos=" + getDesenvolvedoresColididos());
    }
}