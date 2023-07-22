package Aula07;

public class Lutador {
    private String nome, nacionalidade, categoria;
    private Integer idade, vitorias, derrotas, empates;
    private float altura, peso;

    public Lutador(String nome, String nacionalidade, Integer idade, Integer vitorias, Integer derrotas, Integer empates, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2){
            this.categoria = "pena";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        }else {
            this.categoria = "Super pesado";
        }
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public void apresentar(){
        System.out.println("____________________Apresentação____________________");
        System.out.printf("Apresentamos %s de %s\n", this.getNome(), this.getNacionalidade());
        System.out.printf("Com %.2f KG\n", this.getPeso());
        System.out.printf("Com %d anos\n", this.getIdade());
        System.out.printf("Ele tem %d de vitórias\n", this.getVitorias());
        System.out.printf("Ele tem %d de derrotas\n", this.getDerrotas());
        System.out.printf("Ele tem %d de empates\n", this.getEmpates());
    }
    public void status(){
        System.out.printf("%s é um peso %s\n", this.getNome(), this.getCategoria());
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}
