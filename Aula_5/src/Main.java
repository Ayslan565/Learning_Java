
public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(19834);
        p1.abrirConta("CC");
        p1.setDono("Ayslan");
        p1.depositar(5000);
        p1.estadoAtual();



        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(29837);
        p2.setDono("Heitor");
        p2.abrirConta("CP");
        p2.depositar(253);
        p2.sacar(1000);
        p2.estadoAtual();
    }
}