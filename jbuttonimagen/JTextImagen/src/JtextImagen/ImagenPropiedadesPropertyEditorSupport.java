/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JtextImagen;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author Ovejo
 */
public class ImagenPropiedadesPropertyEditorSupport extends PropertyEditorSupport {

    private ImagenPropiedadesPanel imagenPropiedadesPanel = new ImagenPropiedadesPanel();
    
    @Override
    public boolean supportsCustomEditor() {
        return true; 
    }

    @Override
    public Component getCustomEditor() {
        return imagenPropiedadesPanel; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getJavaInitializationString() {
      
        //pueba
        ImagenPropiedades imagen = imagenPropiedadesPanel.getSelectedValue();
        String rutaImagen = imagen.getRutaImagen().getAbsolutePath();
        rutaImagen = rutaImagen.replace("\\", "/");
        return "new JtextImagen.ImagenPropiedades(" + "new java.io.File(\"" + rutaImagen + "\"), " + imagen.getMsuperior() + ", " + imagen.getMizqu() + ")"; 
    
    }

    @Override
    public Object getValue() {
        return imagenPropiedadesPanel.getSelectedValue(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
