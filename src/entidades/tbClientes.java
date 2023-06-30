
package entidades;

public class tbClientes {

    private long idCliente;
    private String primer_nombre;
    private String identificacion;
    private String correo;
    private String telefono;

    public tbClientes() {
    }

    public tbClientes(long idCliente, String primer_nombre, String identificacion, String correo, String telefono) {
        this.idCliente = idCliente;
        this.primer_nombre = primer_nombre;
        this.identificacion = identificacion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "tbClientes{" + "idCliente=" + idCliente + ", primer_nombre=" + primer_nombre + ", identificacion=" + identificacion + ", correo=" + correo + ", telefono=" + telefono + '}';
    }

}
