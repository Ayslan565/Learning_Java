import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Livro[] l = new Livro[4];

        Pessoa[] p = new Pessoa[3];
        p[0] = new Pessoa("Ayslan", 19, true);
        p[1] = new Pessoa("Calos", 20, false);
        p[2] = new Pessoa("Caio", 18, true);

        l[0] = new Livro("Aprendendo a não ser um idiota", "José Miguel",300, p[0]);
        l[1] = new Livro("Java Para Iniciantes", "Guanabara",1500,p[1] );
        l[2] = new Livro("O principe", "Cecilia",370, p[2]);

        System.out.println(l[2].detalhes());


    }
}