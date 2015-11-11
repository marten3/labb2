/**
 * Created by Mårten on 2015-11-08.
 */
package MyFirstGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton implements ActionListener{
    //private Color bg;
    //private String btext;
    private int state;
    private Color col1;
    private Color col2;
    private String text1;
    private String text2;

    public MyButton(){
        this(new Color(100,250,250),new Color(250,20,20), "Tillstånd: 1", "Fatal error, click button to fix!");
    }
    public MyButton(Color col1, Color col2, String text1, String text2){
        this.col1 = col1;
        this.col2 = col2;
        this.text1 = text1;
        this.text2 = text2;
        this.changeState(0,col1,col2,text1,text2);
    }

    public void toggleState(){
        this.changeState(this.state,col1,col2,text1,text2);
    }

    public void actionPerformed(ActionEvent e){
        this.toggleState();
    }

    private void changeState(int state, Color col1, Color col2, String text1, String text2){
        if(state == 1){
            this.state = 0;
            this.setText(text2);
            this.setBackground(col2);
        }
        if(state == 0){
            this.state = 1;
            this.setText(text1);
            this.setBackground(col1);
        }
    }
}
