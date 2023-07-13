public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(0000001);
        p1.setDono("Fulano de Tal");
        p1.abrirConta("CC");
        p1.estadoAtual();
        p1.depositar(150);
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(0000002);
        p2.setDono("Cicrano de tal");
        p2.abrirConta("CP");
        p2.estadoAtual();
        p2.depositar(50);
        p2.estadoAtual();

    }
}
