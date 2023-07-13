public class Aula04 {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        caneta.modelo = "";
        caneta.ponta = 0.5F;
        caneta.estaTampada = false;
        caneta.cor = "verde";
        caneta.status();

        caneta.tamparDestanpar();
        caneta.tamparDestanpar();
        caneta.tamparDestanpar();

        System.out.println(caneta.rabiscar());
        caneta.tamparDestanpar();
        System.out.println(caneta.rabiscar());

        Caneta caneta2 = new Caneta();
        System.out.println(caneta2.rabiscar());
        caneta.tamparDestanpar();
        System.out.println(caneta2.rabiscar());
    }
}
