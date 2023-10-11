abstract class Planeta {
	private String nome;
	private int x;
	private int y;
	private int velocidadeTranslacao;
	private double velocidadeRotacao;
	private int bugsColididos;
	private int desenvolvedoresColididos;
	private String descricao;

	public Planeta(String nome, int x, int y, int velocidadeTranslacao, double velocidadeRotacao, String descricao) {
		this.nome = nome;
		this.x = x;
		this.y = y;
		this.velocidadeTranslacao = velocidadeTranslacao;
		this.velocidadeRotacao = velocidadeRotacao;
		this.bugsColididos = 0;
		this.desenvolvedoresColididos = 0;
		this.descricao = descricao;
	}

	public void mover(int tempo) {
		x = (x + (velocidadeTranslacao * tempo)) % 10;
		double horasPassadas = velocidadeRotacao * tempo;
		System.out.println(nome + ": " + horasPassadas + " horas se passaram.");
	}

	public void colidirComBug() {
		bugsColididos++;
		if (velocidadeTranslacao > 0) {
			velocidadeTranslacao--;
		}
	}

	public void colidirComDesenvolvedor() {
		desenvolvedoresColididos++;
		velocidadeTranslacao++;
	}

	public abstract void exibirInfo();

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getBugsColididos() {
		return bugsColididos;
	}

	public int getDesenvolvedoresColididos() {
		return desenvolvedoresColididos;
	}

	public String getNome() {

		return nome;
	}

	public int getVelocidadeTranslacao() {

		return velocidadeTranslacao;
	}

	public double getVelocidadeRotacao() {

		return velocidadeRotacao;
	}

	public String getDescricao() {
		return descricao;
	}
}