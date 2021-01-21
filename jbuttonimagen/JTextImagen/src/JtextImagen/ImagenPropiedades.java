/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JtextImagen;

import java.io.File;
import java.io.Serializable;


public class ImagenPropiedades implements Serializable{
    
       private File rutaImagen;
       private int msuperior;
       private int mizqu;

    public ImagenPropiedades(File rutaImagen, int msuperior, int mizqu) {
        this.rutaImagen = rutaImagen;
        this.msuperior = msuperior;
        this.mizqu = mizqu;
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public int getMsuperior() {
        return msuperior;
    }

    public void setMsuperior(int msuperior) {
        this.msuperior = msuperior;
    }

    public int getMizqu() {
        return mizqu;
    }

    public void setMizqu(int mizqu) {
        this.mizqu = mizqu;
    }   
       
}

