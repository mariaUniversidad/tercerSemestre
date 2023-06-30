
package listados;

import entidades.tbTipoPago;
import java.util.ArrayList;

public class listadoTipoPago {
     ArrayList<tbTipoPago> lista;

    public listadoTipoPago() {
        lista = new ArrayList();
    }

    public void agregarTipoPago(tbTipoPago c) {
        lista.add(c);
    }
    
    public tbTipoPago obtenerTipoPagoByPosition(int index) {
        return lista.get(index);
    }
}
