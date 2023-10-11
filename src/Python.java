class Python extends Planeta {
    public Python(int x, int y) {
        super("Python", x, y, 4, 24, ", Python é uma linguagem de programação de alto nível conhecida por sua simplicidade e legibilidade. É amplamente utilizado para desenvolvimento web, análise de dados, automação, aprendizado de máquina e muitos outros domínios. Python é conhecido por sua sintaxe limpa e é uma ótima escolha para iniciantes.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Python: Velocidade Translação=" + getVelocidadeTranslacao() +
                ", Velocidade Rotação=" + getVelocidadeRotacao() +
                ", Bugs Colididos=" + getBugsColididos() +
                ", Desenvolvedores Colididos=" + getDesenvolvedoresColididos());
    }
}
