public class Caneta {
    //Atributos
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;


    //Metodo construtor
    public  Caneta(String m, String c, float p){
        this.setModelo(m);
        this.cor = c;
        this.setPonta(p);
        this.tampar();

    }

    // Métodos
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo (String m){
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
        System.out.println("Tampada");
    }
    public void destampar(){
        this.tampada = false;
        System.out.println("Destampada");
    }

    public void status(){
        System.out.println("\n SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Ela está tampada: " + this.tampada);

    }

}

