/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualclassroom.beta;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author harishsivaram
 */
public class Game extends JFrame implements ActionListener{
private static JFrame frame;
private static JPanel p;
private static JButton b;
private static JButton choose;
private static JLabel random;
private static JLabel sumRandom;

public static void main(String[] args) {
    Game bl= new Game() ;
    bl.gui();


}
public void gui(){
    frame=new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 500);
    frame.setLocation(500, 200);
    frame.setTitle("Blackjack");


    p= new JPanel();
    p.setLayout(null);
    p.setBackground(Color.GRAY);


    b = new JButton("Start play");
    b.setBounds(450, 50, 200, 50);

    b.addActionListener(this);

    choose= new JButton("choose");
    choose.setBounds(100, 50, 200, 50);
    choose.addActionListener(this);

    random= new JLabel("");
    random.setBounds(200, 150, 200, 50);

    sumRandom= new JLabel("");
    sumRandom.setBounds(30, 150, 200, 50);
    //text.setText();
    p.add(sumRandom);
    p.add(random);
    p.add(b);
    frame.add(p);
    frame.setVisible(true);
    
    
    
}
public void actionPerformed(ActionEvent e){

    if(e.getSource()== b){

        p.add(choose);
        b.setEnabled(false);
    }
    if(e.getSource()== choose){
        int randomNumbers = (int )(Math.random() * 11 + 1);
        random.setText(String.valueOf(random));
        int sum= randomNumbers++;
        sumRandom.setText(String.valueOf(sum));
    }
}
}
 
