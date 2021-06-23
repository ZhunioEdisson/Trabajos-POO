/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author mary zhingre
 */
public class Linea {
    private long id;
    private int puntoX1;
    private int puntoY1;
    private int puntoX2;
    private int puntoY2;
    private double longitud;
    private Figura figura;

    public Linea(long id, int puntoX1, int puntoY1, int puntoX2, int puntoY2) {
        this.id = id;
        this.puntoX1 = puntoX1;
        this.puntoY1 = puntoY1;
        this.puntoX2 = puntoX2;
        this.puntoY2 = puntoY2;
    }
    

    public Linea(long id, int puntoX1, int puntoY1, int puntoX2, int puntoY2, double longitud) {
        this.id = id;
        this.puntoX1 = puntoX1;
        this.puntoY1 = puntoY1;
        this.puntoX2 = puntoX2;
        this.puntoY2 = puntoY2;
        this.longitud = longitud;
    }

    public Linea(long id, int puntoX1, int puntoY1, int puntoX2, int puntoY2, double longitud, Figura figura) {
        this.id = id;
        this.puntoX1 = puntoX1;
        this.puntoY1 = puntoY1;
        this.puntoX2 = puntoX2;
        this.puntoY2 = puntoY2;
        this.longitud = longitud;
        this.figura = figura;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPuntoX1() {
        return puntoX1;
    }

    public void setPuntoX1(int puntoX1) {
        this.puntoX1 = puntoX1;
    }

    public int getPuntoY1() {
        return puntoY1;
    }

    public void setPuntoY1(int puntoY1) {
        this.puntoY1 = puntoY1;
    }

    public int getPuntoX2() {
        return puntoX2;
    }

    public void setPuntoX2(int puntoX2) {
        this.puntoX2 = puntoX2;
    }

    public int getPuntoY2() {
        return puntoY2;
    }

    public void setPuntoY2(int puntoY2) {
        this.puntoY2 = puntoY2;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public Figura getFigura() {
        return figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    @Override
    public String toString() {
        return "Linea{" + "id=" + id + ", puntoX1=" + puntoX1 + ", puntoY1=" + puntoY1 + ", puntoX2=" + puntoX2 + ", puntoY2=" + puntoY2 + ", longitud=" + longitud + ", figura=" + figura + '}';
    }

    
    

   

    

   
    
    
    
    
    
}
