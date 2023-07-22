package Aula07;

public class Aula07 {
    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[4];
        lutador[0] = new Lutador("Vampeta", "Peru", 23, 12,0,5,1.83f,89);
        lutador[1] = new Lutador("Fulano", "Chile", 32, 0,42,2,1.7f,60);
        lutador[2] = new Lutador("Maltrano", "Camarões", 42, 200,0,0,1.9f,120);
        lutador[3] = new Lutador("Weslley", "Brasil", 27, 52, 2, 23,1.73f, 74);

        for (Integer i = 0; i < 4; i++){
            lutador[i].apresentar();
            lutador[i].status();
        }
    }
}
