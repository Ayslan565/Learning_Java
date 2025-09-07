//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa p1 =  new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 =new Professor();
        Funcionario p4 =new Funcionario();

        p1.setNome("Jose");
        p2.setNome("Maria");
        p3.setNome("Lucas");
        p4.setNome("Fabiula");


        p1.setSexo("F");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");

        p2.setCurso("Informatica");
        p2.setIdade(18);
        p4.setIdade(20);
        p3.setIdade(50);

        p3.setSalario(2790.90f);

        p3.receberAumen(500.20f);
        p4.mudaTrabalho();
        p2.cacelarMatric();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());}


}