/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import java.util.Date;
import java.time.LocalTime;
/**
 *
 * @author Maluli
 */
public class tbReserva {
    private Long idReservas;
    private Date fecha_reserva;
    private LocalTime hora_inicio;
    private LocalTime hora_fin;
    private long fk_id_cliente;

    public Long getIdReservas() {
        return idReservas;
    }

    public void setIdReservas(Long idReservas) {
        this.idReservas = idReservas;
    }

    public Date getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public LocalTime getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(LocalTime hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public LocalTime getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(LocalTime hora_fin) {
        this.hora_fin = hora_fin;
    }

    public long getFk_id_cliente() {
        return fk_id_cliente;
    }

    public void setFk_id_cliente(long fk_id_cliente) {
        this.fk_id_cliente = fk_id_cliente;
    }
    
    public tbReserva(){};
}
