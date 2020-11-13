public class NodoPila {
        int elemento;
        NodoPila siguiente;

        NodoPila(int x) {
            elemento = x;
            siguiente = null;
        }
    }

    class PilaLista
    {
        private NodoPila cima;

        public PilaLista()
        {
            cima = null;
        }

        // operaciones

        public boolean pilaVacia() {

            if(cima==null)
            {
                return true;
            }else
            {
                return false;
            }

        }


        public void insertar(int elemento)
        {
            NodoPila nuevo;
            nuevo = new NodoPila(elemento);
            nuevo.siguiente = cima;
            cima = nuevo;
        }


        public int quitar()
        {
            if (pilaVacia())
            {
                return 0;
            }

            int aux = cima.elemento;
            cima = cima.siguiente;
            return aux;
        }
    }
