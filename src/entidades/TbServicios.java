
package entidades;

public class TbServicios {
   
    private long idServicios;
    private String nombre_servicio;
    private double costo_servicio;

    public TbServicios() {
    }

    public TbServicios(long idServicios, String nombre_servicio, double costo_servicio) {
        this.idServicios = idServicios;
        this.nombre_servicio = nombre_servicio;
        this.costo_servicio = costo_servicio;
    }

    public long getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(long idServicios) {
        this.idServicios = idServicios;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public double getCosto_servicio() {
        return costo_servicio;
    }

    public void setCosto_servicio(double costo_servicio) {
        this.costo_servicio = costo_servicio;
    }
    
    
    
}
