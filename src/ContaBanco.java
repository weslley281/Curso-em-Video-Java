public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo.equals("CC")) {
            this.setSaldo(50);
            System.out.println("Conta corrente aberta com  sucesso");
        } else if (tipo.equals("CP")) {
            this.setSaldo(150);
            System.out.println("Conta poupança aberta com  sucesso");
        }else {
            System.out.println("Erro ao abrir conta");
        }
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta ainda tem um saldo de R$ " + this.getSaldo() + "e por isso não poderá ser fechada");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta tem um saldo negativo de R$ " + this.getSaldo() + "e por isso não poderá ser fechada");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void sacar(){

    }

    public void pagarMensal(){

    }
}
