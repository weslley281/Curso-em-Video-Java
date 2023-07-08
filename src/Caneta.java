public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean estaTampada;
    public void status(){
        System.out.println("A caneta é da cor " + this.cor);
        System.out.println("O modelo é " + this.modelo);
        System.out.println("A ponta é " + this.ponta);
        System.out.println("A carga é " + this.carga);
        System.out.println("Está tampada  " + this.estaTampada);
    }
    public String rabiscar(){
        if (this.estaTampada){
            return "Não pode rabiscar";
        }
        return "Estou rabiscando";
    }

    public void tamparDestanpar(){
        this.estaTampada = !this.estaTampada;
        if (this.estaTampada){
            System.out.println("A caneta está tampada");
        }else {
            System.out.println("A caneta esta destampada");
        }
    }
}
