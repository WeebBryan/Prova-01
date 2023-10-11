class JavaScript extends Planeta {
    public JavaScript(int x, int y) {
        super("JavaScript", x, y, 3, 10, "JavaScript é uma linguagem de programação amplamente usada para desenvolvimento web. Ela é executada no navegador do cliente e é usada para criar páginas da web interativas e dinâmicas. Além disso, o Node.js permite que JavaScript seja usado no lado do servidor.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("JavaScript: Velocidade Translação=" + getVelocidadeTranslacao() +
                ", Velocidade Rotação=" + getVelocidadeRotacao() +
                ", Bugs Colididos=" + getBugsColididos() +
                ", Desenvolvedores Colididos=" + getDesenvolvedoresColididos());
    }
}