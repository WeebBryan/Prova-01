class Python extends Planeta {
    public Python(int x, int y) {
        super("Python", x, y, 4, 24, ", Python � uma linguagem de programa��o de alto n�vel conhecida por sua simplicidade e legibilidade. � amplamente utilizado para desenvolvimento web, an�lise de dados, automa��o, aprendizado de m�quina e muitos outros dom�nios. Python � conhecido por sua sintaxe limpa e � uma �tima escolha para iniciantes.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Python: Velocidade Transla��o=" + getVelocidadeTranslacao() +
                ", Velocidade Rota��o=" + getVelocidadeRotacao() +
                ", Bugs Colididos=" + getBugsColididos() +
                ", Desenvolvedores Colididos=" + getDesenvolvedoresColididos());
    }
}
