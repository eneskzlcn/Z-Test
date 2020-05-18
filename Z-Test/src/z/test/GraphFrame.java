/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.test;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Pc
 */
public class GraphFrame extends JFrame{
    
    public GraphFrame(){
       
    }
    @Override
    public void setVisible(boolean b) {
        super.setVisible(b); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSize(Dimension d) {
        super.setSize(d); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(operation); 
    }
    @Override
    public Component add(Component comp) {
        return super.add(comp); 
    }

}
