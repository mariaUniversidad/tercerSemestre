package listados;

import entidades.tbClientes;
import java.util.ArrayList;

public class listadoClientes {

    ArrayList<tbClientes> lista;

    public listadoClientes() {
        lista = new ArrayList();
    }

    public void agregarClientes(tbClientes c) {
        lista.add(c);
    }
    
    public tbClientes obtenerClienteByPosicion(int index) {
        return lista.get(index);
    }
    
}
