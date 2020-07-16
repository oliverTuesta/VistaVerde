package hosp.vistaverde.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

    private String nombre;
    private String apellidos;
    private String dni;
    private String prosedencia;
    private String cuarto;
    private int dias;
    private float costoTotal;
    private String fecha;
    private String hora;
    private int id;
    private Date date = new Date();

    ;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String dni, String prosedencia, String cuarto, float costoTotal, String fecha, int dias, int id) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.cuarto = cuarto;
        this.costoTotal = costoTotal;
        this.fecha = fecha;
        this.prosedencia = prosedencia;
        this.dias = dias;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos.toUpperCase();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCuarto() {
        return cuarto;
    }

    public void setCuarto(String cuarto) {
        this.cuarto = cuarto;
    }

    public float getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(float costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getFecha() {
        return fecha;
    }

    public String getFechaActual() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }

    public String getHoraActual() {
        DateFormat hourFormat = new SimpleDateFormat("HH:mm");
        return hourFormat.format(date);
    }

    public String getProsedencia() {
        return prosedencia;
    }

    public void setProsedencia(String prosedencia) {
        this.prosedencia = prosedencia.toUpperCase();
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
