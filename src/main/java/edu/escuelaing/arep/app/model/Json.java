package edu.escuelaing.arep.app.model;

import edu.escuelaing.arep.app.servicios.MergeSort;
import edu.escuelaing.arep.app.servicios.Services;

public class Json { 
    int [] datos;
    int[] ordenado;
    int sum=0;

    public Json (int[] datos){
        this.datos= datos;
        this.ordenado = new int[datos.length];
        System.arraycopy( datos, 0, this.ordenado, 0, datos.length );
        for (int i : datos){
            this.sum += datos[i];
        }
    }

    public void mergeSort(){
        Services.mergeSort(ordenado, ordenado.length);
    }
    public void mergeSort2(){
        MergeSort<Integer> merge = new MergeSort<>();
        //merge.mergeSort(this.datos,0, ordenado.length-1);
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

    public int[] getOrdenado() {
        return ordenado;
    }

    public void setOrdenado(int[] ordenado) {
        this.ordenado = ordenado;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

}