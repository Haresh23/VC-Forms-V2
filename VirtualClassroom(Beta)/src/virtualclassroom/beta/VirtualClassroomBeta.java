import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class VirtualClassroomBeta extends JFrame {
/**
 * 
 */
    private static final long serialVersionUID = 1L;
    private JTextField tfCount;

    public VirtualClassroomBeta() {
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        setResizable(false);
        cp.add(new JLabel("enter code"));
        tfCount = new JTextField("0", 10);
        tfCount.setEditable(true);
        cp.add(tfCount);
        JButton nupp = new JButton("get answer");
        cp.add(nupp);
        nupp.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                int[] array;
                array = new int[30];
                array[0] = 111111;
                array[1] = 888888;
                array[2] = 333333;
                array[3] = 555555;
                array[4] = 111111;
                array[5] = 643208;
                array[6] = 643208;
                array[7] = 643208;
                array[8] = 643208;
                array[9] = 643208;
                array[10] = 643208;
               
               // array[30] = 643208;
                int number = Integer.parseInt(tfCount.getText());
                tfCount.setText(String.valueOf(array[number]));

            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Koodibaas");
        setSize(300, 100);
        setVisible(true);
        }
    public static void main(String args[])
    {
        new VirtualClassroomBeta();
    }
}