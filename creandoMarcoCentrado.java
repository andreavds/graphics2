package graficos;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.JFrame;

public class creandoMarcoCentrado extends Object {
    public static void main(String[] args){
        marcoCentrado miMarco = new marcoCentrado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
        miMarco.setTitle("Computacion Grafica");
        
    }
    
}

class marcoCentrado extends JFrame{
    public marcoCentrado(){
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        
        Dimension tamanioPantalla = miPantalla.getScreenSize();
        
        int alturaPantalla = tamanioPantalla.height;
        int anchoPantalla = tamanioPantalla.width;
        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        
        Image miIcono = miPantalla.getImage("imagen.jpg");
        setIconImage(miIcono);
    }
}

// Andrea Díaz 30.437.156