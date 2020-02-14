package edu.escuelaing.arep.app.model;

import edu.escuelaing.arep.app.servicios.Services;

public class Json {
    int [] datos;

    int sum=0;

    public Json (int[] datos){
        this.datos= datos;
    }

    public void mergeSort(){
        Services.mergeSort(datos, datos.length);
    }

    public void sum (){
        for (int i : datos){
            sum += i;
        }
    }
    public int[] getDatos() {
        return datos;
    }

    public void setDatos(int[] datos) {
        this.datos = datos;
    }

    public int getSumatoria() {
        return sum;
    }

    public void setSumatoria(int sumatoria) {
        this.sum = sumatoria;
    }

}