
package listados;

import entidades.TbServicios;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class listadoServicios {
     ArrayList<TbServicios> lista;
    
      public listadoServicios() {
        lista = new ArrayList();
    }

    public void agregarServicios(TbServicios s) {
        lista.add(s);
    }
    
    public TbServicios obtenerServiciosByPosicion(int index) {
        return lista.get(index);
    }
    
    public String[] getListaNombresServicios() {
        return this.lista.stream()
                .map(map -> map.getNombre_servicio())
                .toArray(String[]::new);
    }
    
}
