import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SistemaJavaLar {
    private ArrayList<Planeta> planetas;
    private int bugs;
    private int desenvolvedores;
    private int instantes;
    private int anosJavaLar;

    public SistemaJavaLar() {
        planetas = new ArrayList<>();
        planetas.add(new Python(1, 1));
        planetas.add(new JavaScript(2, 2));
        planetas.add(new RubyonRails(3, 3));
        planetas.add(new PHP(4, 4));
        planetas.add(new CSharp(5, 5));
        planetas.add(new CPlusPlus(6, 6));
        planetas.add(new C(7, 7));
        bugs = 0;
        desenvolvedores = 0;
        instantes = 0;
        anosJavaLar = 0;
    }

    public void menu() {
        while (true) {
            System.out.println("Sistema JavaLar");
            System.out.println("1. Novo instante");
            System.out.println("2. Relatório final");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = LerEntrada.readInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe a quantidade de tempo (instante): ");
                    int tempo = LerEntrada.readInt();
                    System.out.print("Informe o número de bugs: ");
                    int novosBugs = LerEntrada.readInt();
                    System.out.print("Informe o número de desenvolvedores: ");
                    int novosDesenvolvedores = LerEntrada.readInt();

                    bugs += novosBugs;
                    desenvolvedores += novosDesenvolvedores;

                    novoInstante(tempo, novosBugs, novosDesenvolvedores);
                    break;
                case 2:
                    relatorioFinal();
                    return;
                case 3:
                    System.out.println("Saindo do sistema.");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public void novoInstante(int tempo, int novosBugs, int novosDesenvolvedores) {
        for (Planeta planeta : planetas) {
            planeta.mover(tempo);
        }
        
        for (int i = 0; i < novosBugs; i++) {
            int index = new Random().nextInt(planetas.size());
            Planeta planeta = planetas.get(index);
            planeta.colidirComBug();
        }

        for (int i = 0; i < novosDesenvolvedores; i++) {
            int index = new Random().nextInt(planetas.size());
            Planeta planeta = planetas.get(index);
            planeta.colidirComDesenvolvedor();
        }

        instantes++;
        anosJavaLar += tempo * planetas.size();
     
        System.out.println("Instante " + instantes + ":");
        for (Planeta planeta : planetas) {
            planeta.exibirInfo();
        }

        int planetasNoNorte = 0;
        int planetasNoSul = 0;

        for (Planeta planeta : planetas) {
            if (planeta.getY() > 0) {
                planetasNoNorte++;
            } else if (planeta.getY() < 0) {
                planetasNoSul++;
            }
        }

        System.out.println("Planetas no Norte: " + planetasNoNorte);
        System.out.println("Planetas no Sul: " + planetasNoSul);

        for (int i = 0; i < planetas.size(); i++) {
            Planeta planeta1 = planetas.get(i);
            for (int j = i + 1; j < planetas.size(); j++) {
                Planeta planeta2 = planetas.get(j);
                if (planeta1.getX() == planeta2.getX() && planeta1.getY() == planeta2.getY()) {
                    System.out.println("Houve alinhamento entre " + planeta1.getNome() + " e " + planeta2.getNome());
                }
            }
        }

        for (int i = 0; i < planetas.size(); i++) {
            Planeta planeta1 = planetas.get(i);
            for (int j = i + 1; j < planetas.size(); j++) {
                Planeta planeta2 = planetas.get(j);
                int distancia = calcularDistancia(planeta1, planeta2);
                System.out.println("Distância entre " + planeta1.getNome() + " e " + planeta2.getNome() + "é de: " + distancia);
            }
        }

        for (int i = 0; i < planetas.size(); i++) {
            Planeta planeta1 = planetas.get(i);
            for (int j = i + 1; j < planetas.size(); j++) {
                Planeta planeta2 = planetas.get(j);
                double distanciaEuclidianaQuadrado = calcularDistanciaEuclidianaQuadrado(planeta1, planeta2);
                System.out.println("Distância Euclidiana entre " + planeta1.getNome() + " e " + planeta2.getNome() + "é de: " + distanciaEuclidianaQuadrado);
            }
        }

        ArrayList<Planeta> planetasExplodidos = new ArrayList<>();
        for (Planeta planeta : planetas) {
            if (planeta.getVelocidadeTranslacao() == 0) {
                planetasExplodidos.add(planeta);
            }
        }

        if (!planetasExplodidos.isEmpty()) {
            System.out.print("Planetas que explodiram: ");
            for (Planeta planeta : planetasExplodidos) {
                System.out.print(planeta.getNome() + " ");
                planetas.remove(planeta);
            }
            System.out.println();
        }
    }

    private int calcularDistancia(Planeta planeta1, Planeta planeta2) {
        int dx = planeta1.getX() - planeta2.getX();
        int dy = planeta1.getY() - planeta2.getY();
        return dx * dx + dy * dy;
    }

    private double calcularDistanciaEuclidianaQuadrado(Planeta planeta1, Planeta planeta2) {
        int dx = planeta1.getX() - planeta2.getX();
        int dy = planeta1.getY() - planeta2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void relatorioFinal() {
        System.out.println("Relatório Final:");
        for (Planeta planeta : planetas) {
            System.out.println(planeta.getNome() + ":");
            System.out.println("Velocidade de Translação: " + planeta.getVelocidadeTranslacao());
            System.out.println("Velocidade de Rotação: " + planeta.getVelocidadeRotacao());
            System.out.println("Bugs Colididos: " + planeta.getBugsColididos());
            System.out.println("Desenvolvedores Colididos: " + planeta.getDesenvolvedoresColididos());
            System.out.println("Descrição: " + planeta.getDescricao());
            System.out.println();
        }

        System.out.println("Anos JavaLar: " + anosJavaLar);
        System.out.println("Total de instantes: " + instantes);
    }
}