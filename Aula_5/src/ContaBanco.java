import java.util.Objects;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    //Metodos


public void abrirConta(String t){
    this.setTipo(t);
    this.setStatus(true);
    if (Objects.equals(t, "CC")){
        this.setSaldo(50);

    } else if (Objects.equals(t, "CP")) {
        this.setSaldo(150);
    }
    System.out.println("Conta Aberta!");
}

    private void setStatus(char t) {
    }

    public void  fechar(){
    if(this.getSaldo() > 0){
        System.out.println("Não pode fechar, pois há saldo!");
    } else if (this.getSaldo()< 0) {
        System.out.println("Não pode fechar, pois há debitos!");
    }
    else {
        System.out.println("Conta fechada com sucesso");
    }
    }
public void depositar(float v){
    if (this.isStatus()){
        this.setSaldo(this.getSaldo() + v);
        System.out.println("Deposito Realizado na conta de " + this.getDono());
    }
    else {
        System.out.println("impossivel depositar em uma conta fechada");
    }
}

public void sacar(float v){
    if (this.isStatus()){
        if(this.getSaldo() >= v){
            this.setSaldo(v - this.getSaldo());
            System.out.println("Saque realizado na conta de " + this.getDono());
        }else {
            System.out.println("Dinheiro Insuficiente");
        }

        }
}
    public void pagarMensal(int v ){
        pagarMensal(0);
        if (Objects.equals(getTipo(), "CC")){
            v = 12;
        }
        else if(Objects.equals(this.getTipo(), "CP")){
            v = 20;
        }
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensaliadade PAGA com sucesso por " + this.getDono());
        }
        else {
            System.out.println("Impossivel pagar uma conta FECHADA");
        }
    }
    public void estadoAtual(){
        System.out.println("Estado Atual");
        System.out.println("________________________________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    //SET | GET
    public int setNumConta(int n){
        numConta = n;
        return n;
    }
    public int getNumConta(){
        return numConta  ;
    }

    public String setTipo(String t){
        tipo = t;
        return t;
}

    public String getTipo(){
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean sta) {
        this.status = sta;
    }

    //Construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

}