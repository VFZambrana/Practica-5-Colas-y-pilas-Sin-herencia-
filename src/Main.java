public class Main {
    public static void main(String[] args) {

        //=================================================================>PILAS
        System.out.println("PILAS\n");
        PilaLista pilaLista = new PilaLista();

        //insertar elementos

        pilaLista.insertar(1);
        pilaLista.insertar(2);
        pilaLista.insertar(3);
        pilaLista.insertar(4);
        pilaLista.insertar(5);

        //QUITAR

        pilaLista.quitar();

        //MOSTRAR

        System.out.println(pilaLista.quitar());
        System.out.println(pilaLista.quitar());
        System.out.println(pilaLista.quitar());
        System.out.println(pilaLista.quitar());
        System.out.println(pilaLista.quitar());

        //=================================================================>COLAS

        System.out.println("\nCOLAS\n");
        ColaLista colaLista = new ColaLista();

        //insertar elementos

        colaLista.insertar(1);
        colaLista.insertar(2);
        colaLista.insertar(3);
        colaLista.insertar(4);
        colaLista.insertar(5);

        colaLista.quitar();
        colaLista.quitar();

        System.out.println(colaLista.quitar());
        System.out.println(colaLista.quitar());
        System.out.println(colaLista.quitar());
        System.out.println(colaLista.quitar());
        System.out.println(colaLista.quitar());

    }
}
