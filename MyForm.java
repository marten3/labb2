import MyFirstGUI.*;
import javax.swing.*;
import javax.swing.plaf.FileChooserUI;
import java.awt.*;
//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE
/**
 * Created by Mårten on 2015-11-09.
 */
public class MyForm extends JFrame{
    private MyButton abutton;
    private JPanel apanel;

    public MyForm(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        abutton = new MyButton();
        abutton.setActionCommand("click");
        abutton.setPreferredSize(new Dimension(500,200));

        apanel = new JPanel();
        apanel.add(abutton);
        add(apanel);
        pack();
        setVisible(true);

        //Lägg till lyssnare
        abutton.addActionListener(abutton);
    }

    // Jag utnyttjar polymorfism för att upfylla labbpekets specifikationer
    public static void main(String[] args){
        new MyForm();
    }
}
