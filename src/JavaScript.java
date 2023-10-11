class JavaScript extends Planeta {
    public JavaScript(int x, int y) {
        super("JavaScript", x, y, 3, 10, "JavaScript � uma linguagem de programa��o amplamente usada para desenvolvimento web. Ela � executada no navegador do cliente e � usada para criar p�ginas da web interativas e din�micas. Al�m disso, o Node.js permite que JavaScript seja usado no lado do servidor.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("JavaScript: Velocidade Transla��o=" + getVelocidadeTranslacao() +
                ", Velocidade Rota��o=" + getVelocidadeRotacao() +
                ", Bugs Colididos=" + getBugsColididos() +
                ", Desenvolvedores Colididos=" + getDesenvolvedoresColididos());
    }
}