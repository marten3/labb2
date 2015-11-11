import MyFirstGUI.*;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Mårten on 2015-11-09.
 */
public class MyFirstApplet extends JApplet{
    private MyButton abutton;
    private JPanel apanel;

    public void init(){
        abutton = new MyButton();
        abutton.setActionCommand("click");
        abutton.setPreferredSize(new Dimension(500,200));
        apanel = new JPanel();
        apanel.add(abutton);
        add(apanel);
        //pack();
        setVisible(true);

        //Lägg till lyssnare
        abutton.addActionListener(abutton);
    }
}