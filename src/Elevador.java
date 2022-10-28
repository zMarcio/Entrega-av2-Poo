public class Elevador {


    public Elevador(int andarAtual, int totalDeAndar, int capacidadeDoElevador, int pessoasPresenteNoElevador) {
        this.andarAtual = andarAtual;
        this.totalDeAndar = totalDeAndar;
        this.capacidadeDoElevador = capacidadeDoElevador;
        this.pessoasPresenteNoElevador = pessoasPresenteNoElevador;
    }

    private int andarAtual;
    private int totalDeAndar;
    private int capacidadeDoElevador;
    private int pessoasPresenteNoElevador;
    private  int pessoasSaindoDoElevador;
    private int pessoasEntrandoNoElevador;

    public int getSobeAndar() {
        return andarAtual = andarAtual + 1;
    }

    public int getDesceAndar() {
        return andarAtual = andarAtual - 1;
    }

    private int sobeAndar;
    private int desceAndar;


    public int getPessoasEntrandoNoElevador() {
        return pessoasPresenteNoElevador = pessoasPresenteNoElevador + 1;
    }
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalDeAndar() {
        return totalDeAndar;
    }

    public void setTotalDeAndar(int totalDeAndar) {
        this.totalDeAndar = totalDeAndar;
    }

    public int getCapacidadeDoElevador() {
        return capacidadeDoElevador;
    }

    public void setCapacidadeDoElevador(int capacidadeDoElevador) {
        this.capacidadeDoElevador = capacidadeDoElevador;
    }

    public int getPessoasPresenteNoElevador() {
        return pessoasPresenteNoElevador;
    }

    public void setPessoasPresenteNoElevador(int pessoasPresenteNoElevador) {
        this.pessoasPresenteNoElevador = pessoasPresenteNoElevador;
    }


    public void mostrarDetalhes() {
        System.out.println("Andar atual " + getAndarAtual());
        System.out.println("Total de andares " + getTotalDeAndar());
        System.out.println("Capacidade do elevador " + getCapacidadeDoElevador());
        System.out.println("Pesssoas presentes no elevador " + getPessoasPresenteNoElevador());
    }


    //inicializa : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
    //entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
    //Sai : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
    //Sobe : para subir um andar (não deve subir se já estiver no último andar);
    //Desce : para descer um andar (não deve descer se já estiver no térreo);

    public void inicializa(int capacidadeDoElevador, int totalDeAndar){
        System.out.println("Capacidade do Elevador " + getCapacidadeDoElevador() +" e Total de andares " + getTotalDeAndar());
    }
    public void entra(){
        if (getPessoasPresenteNoElevador()>getCapacidadeDoElevador()){
            System.out.println("Está cheio");
        }else System.out.println("Bem-vindo," + " Pessoas no elevador: " + getPessoasEntrandoNoElevador());
    }
    public void sai(){
        if (getPessoasPresenteNoElevador()<0) System.out.println("Opá, mas não tem ninguém aqui");
        else System.out.println("Até mais (Saiu uma pessoa)," + " Pessoas no elevador: " +getPessoasSaindoDoElevador());
    }
    public void sobe(){
        //Sobe : para subir um andar (não deve subir se já estiver no último andar);
        if (getAndarAtual()>getTotalDeAndar()) System.out.println("Opá, se tumou red bull e criou asas? Volte!");
        else System.out.println("Andar atual: " + getAndarAtual() + ", Proximo andar: " + getSobeAndar());
    }
    public void desce(){
        //Desce : para descer um andar (não deve descer se já estiver no térreo);
        if (getAndarAtual()<0) System.out.println("Opá, Quer entra no chão??");
        else System.out.println("Andar atual " + getAndarAtual() + ", Proximo andar " + getDesceAndar());
    }

    public int getPessoasSaindoDoElevador() {
        return pessoasPresenteNoElevador = pessoasPresenteNoElevador - 1;
    }
}
