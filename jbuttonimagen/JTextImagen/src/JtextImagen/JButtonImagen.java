/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JtextImagen;

import java.awt.Graphics;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Ovejo
 */
public class JButtonImagen extends JButton implements Serializable{
    
    private ImagenPropiedades imagen;
    
    public JButtonImagen() {

    
    }

    public ImagenPropiedades getImagen() {
        return imagen;
    }

    public void setImagen(ImagenPropiedades imagen) {
        this.imagen = imagen;
    }

    

    @Override
    protected void paintComponent(Graphics g) {
       
        super.paintComponent(g); 
        
        if (imagen != null){
        
            if (imagen.getRutaImagen() != null && imagen.getRutaImagen().exists()) {

                ImageIcon imageIcon = new ImageIcon(imagen.getRutaImagen().getAbsolutePath());
                g.drawImage(imageIcon.getImage(), imagen.getMsuperior(), imagen.getMizqu(), null);

            }
        }
    }

    
    
    
}
