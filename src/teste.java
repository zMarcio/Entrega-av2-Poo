public class teste {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(
                0,
                10,
                15,
                10
        );
        System.out.println();
        elevador.inicializa(10,10);
        System.out.println("------------------------------------");
        elevador.entra();
        System.out.println("------------------------------------");
        elevador.sai();
        System.out.println("------------------------------------");
        elevador.sobe();
        System.out.println("------------------------------------");
        elevador.desce();







    }
}
