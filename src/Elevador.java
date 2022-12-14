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


    //inicializa : que deve receber como par??metros a capacidade do elevador e o total de andares no pr??dio (os elevadores sempre come??am no t??rreo e vazio);
    //entra: para acrescentar uma pessoa no elevador (s?? deve acrescentar se ainda houver espa??o);
    //Sai : para remover uma pessoa do elevador (s?? deve remover se houver algu??m dentro dele);
    //Sobe : para subir um andar (n??o deve subir se j?? estiver no ??ltimo andar);
    //Desce : para descer um andar (n??o deve descer se j?? estiver no t??rreo);

    public void inicializa(int capacidadeDoElevador, int totalDeAndar){
        System.out.println("Capacidade do Elevador " + getCapacidadeDoElevador() +" e Total de andares " + getTotalDeAndar());
    }
    public void entra(){
        if (getPessoasPresenteNoElevador()>getCapacidadeDoElevador()){
            System.out.println("Est?? cheio");
        }else System.out.println("Bem-vindo," + " Pessoas no elevador: " + getPessoasEntrandoNoElevador());
    }
    public void sai(){
        if (getPessoasPresenteNoElevador()<0) System.out.println("Op??, mas n??o tem ningu??m aqui");
        else System.out.println("At?? mais (Saiu uma pessoa)," + " Pessoas no elevador: " +getPessoasSaindoDoElevador());
    }
    public void sobe(){
        //Sobe : para subir um andar (n??o deve subir se j?? estiver no ??ltimo andar);
        if (getAndarAtual()>getTotalDeAndar()) System.out.println("Op??, se tumou red bull e criou asas? Volte!");
        else System.out.println("Andar atual: " + getAndarAtual() + ", Proximo andar: " + getSobeAndar());
    }
    public void desce(){
        //Desce : para descer um andar (n??o deve descer se j?? estiver no t??rreo);
        if (getAndarAtual()<0) System.out.println("Op??, Quer entra no ch??o??");
        else System.out.println("Andar atual " + getAndarAtual() + ", Proximo andar " + getDesceAndar());
    }

    public int getPessoasSaindoDoElevador() {
        return pessoasPresenteNoElevador = pessoasPresenteNoElevador - 1;
    }
}
