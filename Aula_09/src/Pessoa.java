public class Pessoa {
    private String nome;
    private int idade;
    private  boolean sex;

    public String getnome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void fazerAniversario(){
        this.idade ++;
    }

    public Pessoa(String nome,int idade, boolean sex ) {
        this.nome = nome;
        this.idade = idade;
        this.sex = sex;
    }
}
