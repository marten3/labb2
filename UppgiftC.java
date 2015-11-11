import MyFirstGUI.MyButton;
import MyFirstGUI.MyColorMaker;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Mårten on 2015-11-10.
 */
public class UppgiftC {
    public static void main(String[] args){
        // Det vi behöver
        int n;
        try{
            n = Integer.parseInt(args[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            n = 15;
        }
        JFrame frame = new JFrame();
        JFrame frame2 = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();

        Dimension size = new Dimension(150,40);
        String[] textlines1 = {"Hej","Tjenare","Tjo","Jag heter birger"};
        String[] textlines2 = {"På dig","Gullfnutt","Snygging","Errår på derrår"};

        // Skapar knapparna
        MyButton[] buttons, buttons2;
        buttons = createButtons(n,size,textlines1,textlines2);
        buttons2 = createButtons(n,size,textlines1,textlines2);
        giveListeners(buttons,1);
        giveListeners(buttons2,2);
        for(MyButton i : buttons){
            panel.add(i);
        }
        for(MyButton i : buttons2){
            panel2.add(i);
        }

        // Skapar fönsterna
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400,500));
        frame.pack();
        frame.setVisible(true);

        frame2.getContentPane().add(panel2);
        frame2.setPreferredSize(new Dimension(400,500));
        frame2.pack();
        frame2.setVisible(true);
    }

    private static MyButton[] createButtons(int n, Dimension size, String[] textlines1, String[] textlines2){
        MyButton[] barry = new MyButton[n];
        Random givetext = new Random();
        for(int i=0;i<n;i++){
            barry[i] = new MyButton(MyColorMaker.randomColor(),MyColorMaker.randomColor(),
                    textlines1[givetext.nextInt(textlines1.length)],textlines2[givetext.nextInt(textlines2.length)]);
            barry[i].setPreferredSize(size);
        }
        return barry;
    }
    private static void giveListeners(MyButton[] buttons,int a){
        if(a==1){
            for(MyButton barry : buttons){
                barry.addActionListener(barry);
            }
        }else{
            for(MyButton barry : buttons){
                for(MyButton stuart : buttons){
                    if(barry != stuart){
                        barry.addActionListener(stuart);
                    }
                }
            }
        }
    }
}
