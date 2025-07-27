//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("====MENU====");
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.play();
        c.ligarMudo();
        c.abrirMenu();

    }
}