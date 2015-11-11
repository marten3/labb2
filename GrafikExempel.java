/**
 * Created by Mårten on 2015-11-08.
 */
package MyFirstGUI;
import javax.swing.*;

public class GrafikExempel extends JFrame {
    public GrafikExempel() {
        JLabel myTextLabel = new JLabel("Hello World");
        add(myTextLabel);
        pack();
        setVisible(true);

        MyButton knapp = new MyButton();
        add(knapp);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        GrafikExempel myGExempel = new GrafikExempel();
    }
}
