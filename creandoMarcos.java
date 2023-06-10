package graficos;
import javax.swing.*;

public class creandoMarcos extends Object {
    
    public static void main(String[] args){
        
        miMarco marco1 = new miMarco();
        
        marco1.setVisible(true);
        
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

class miMarco extends JFrame{
    
    public miMarco(){
        
        //setSize(500, 300);
        
        //setLocation(500, 300);
        
        setBounds(500, 300, 250, 250);
        
        //setResizable(false);
        
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        setTitle("Hola");

    }
}

// Andrea Díaz 30.437.156