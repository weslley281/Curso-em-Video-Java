package Aula06;

public class ControleRemoto implements Controlador {
    private Integer volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(int volume, boolean ligado, boolean tocando) {
        this.volume = volume;
        this.ligado = ligado;
        this.tocando = tocando;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("_________________Menu_________________");
        String testeLigado = this.isLigado() ? "ligado" : "desligado";
        String testeVolume = this.isTocando() ? "" : "não";

        System.out.printf("O controle remoto está %s\n", testeLigado);
        System.out.printf("O controle %s está tocando\n", testeVolume);
        System.out.printf("O volume está em %d\n", getVolume());

        for (Integer i = 0; i <= this.getVolume(); i++){
            System.out.print("*");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Menu fechado");
    }

    @Override
    public void maisVolume() {
        if (this.ligado){
            if (this.getVolume() <= 100) {
                this.setVolume(this.getVolume() + 2);
            }else {
                this.setVolume(100);
            }
        }else {
            System.out.println("Nada aconteceu");
        }
    }

    @Override
    public void menosVolume() {
        if (this.ligado){
            if (this.getVolume() >= 0) {
                this.setVolume(this.getVolume() - 2);
            }else {
                this.setVolume(0);
            }
        }else {
            System.out.println("Nada aconteceu");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.ligado){
            this.setVolume(0);
        }else {
            System.out.println("Nada aconteceu");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.ligado){
            this.setVolume(1);
        }else {
            System.out.println("Nada aconteceu");
        }
    }

    @Override
    public void play() {
        if (this.ligado && !this.isTocando()){
            this.setTocando(true);
        }else {
            System.out.println("Nada aconteceu");
        }
    }

    @Override
    public void pause() {
        if (this.ligado && this.isTocando()){
            this.setTocando(false);
        }else {
            System.out.println("Nada aconteceu");
        }
    }
}
