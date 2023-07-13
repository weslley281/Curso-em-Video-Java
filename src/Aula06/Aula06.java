package Aula06;

public class Aula06 {
    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto(50,false,false);
        controleRemoto.setLigado(true);
        controleRemoto.abrirMenu();
        controleRemoto.maisVolume();
        controleRemoto.maisVolume();
        controleRemoto.maisVolume();
        controleRemoto.abrirMenu();
        controleRemoto.menosVolume();
        controleRemoto.ligarMudo();
        controleRemoto.abrirMenu();
    }


}
