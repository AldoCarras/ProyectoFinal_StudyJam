package aldostudio.tourexpresbolivia;

/**
 * Created by ALDO on 27/12/2016.
 */

public class Lugar {

    private String nombre;
    private String reseña;
    private double ublat;
    private double ubalt;
    private String fecha;
    private long id;

    public Lugar( String fecha, String nombre, String reseña, double ubalt, double ublat) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.reseña = reseña;
        this.ubalt = ubalt;
        this.ublat = ublat;
    }



    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReseña() {
        return reseña;
    }

    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    public double getUbalt() {
        return ubalt;
    }

    public void setUbalt(double ubalt) {
        this.ubalt = ubalt;
    }

    public double getUblat() {
        return ublat;
    }

    public void setUblat(double ublat) {
        this.ublat = ublat;
    }
}
