    public class Lutador {

        //Atributos
        private String  nome;
        private String nacionalidade;
        private int idade;
        private float altura;
        private float peso;
        private int vitorias,empates,derrotas;
        private String categoria;

        //Metodos
        public void apresentar() {
            String apresentacao = """
        -----------------------------------------------------------------------
        CHEGOU A HORA!!!
        Apresentamos o Lutador: %s
        Diretamente de: %s
        Com %d anos e %.2fm de altura
        Pesando %.1fKg
         cartel de: %d Vitórias, %d Derrotas e %d Empates
        -----------------------------------------------------------------------
        """.formatted(this.getNome(), this.getNacionalidade(), this.getIdade(),
                    this.getAltura(), this.getPeso(), this.getVitorias(),
                    this.getDerrotas(), this.getEmpates());

            System.out.println(apresentacao);
        }
        public void status(){
            System.out.println(this.getNome() + "é um peso" + this.getCategoria());
            System.out.println("Ganhou: " + this.getVitorias() + " vezes");
            System.out.println("Empatou: " + this.getEmpates() + this.getEmpates() + "vezes");
            System.out.println("Perdeu: " + this.getDerrotas() + this.getDerrotas() + "vezes");



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



        //Construtor
        public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int empates, int derrotas) {
            this.nome = nome;
            this.nacionalidade = nacionalidade;
            this.idade = idade;
            this.altura = altura;
            this.setPeso(peso);
            this.vitorias = vitorias;
            this.empates = empates;
            this.derrotas = derrotas;
        }

        //Metodos Especiais

        //Getts e sets


        public String getCategoria() {

            return categoria;
        }

        private void setCategoria() {
            if (this.peso <52.2){
            this.categoria = "I N V A L I D O";    }

            else if (this.peso <= 70.3) {
                this.categoria = "L E V E";
            }
            else if (this.peso <= 120.2) {
                this.categoria = "P E S A D O";
            }
            else {
                this.categoria = "I N V A L I D O";
            }

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

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
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

        public int getVitorias() {
            return vitorias;
        }

        public void setVitorias(int vitorias) {
            this.vitorias = vitorias;
        }

        public int getEmpates() {
            return empates;
        }

        public void setEmpates(int empates) {
            this.empates = empates;
        }

        public int getDerrotas() {
            return derrotas;
        }

        public void setDerrotas(int derrotas) {
            this.derrotas = derrotas;
        }
    }