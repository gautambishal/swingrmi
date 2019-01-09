package auction.rabindra.gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class SwingJRadioButtonDemo extends JFrame {
	 
    public SwingJRadioButtonDemo() {
        super("Swing JRadioButton Demo");
 
        JLabel jl= new JLabel("1. have you ever participated in the online auction before?");
        JRadioButton option1 = new JRadioButton("Yes");
        option1.setActionCommand("yes");
        JRadioButton option2 = new JRadioButton("No");  
        option2.setActionCommand("no");
 
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
       
        JPanel jp1= new JPanel();
        jp1.add(jl);
        jp1.setLayout(new FlowLayout());
        
        JPanel jp2= new JPanel();
        jp2.add(option1);jp2.add(option2);
        jp2.setLayout(new FlowLayout());
        
        JButton b= new JButton("Submit");
        b.addActionListener((ActionEvent e)->{ //use java8 and upper version to use -> feature
        	String selectedValue=group.getSelection().getActionCommand();
        	System.out.println(selectedValue);
        });
        
        JPanel jp3= new JPanel(); 
        jp3.add(b);
        setLayout(new GridLayout(3,1));
        add(jp1);
        add(jp2);
        add(jp3);
        
 
        pack();
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                new SwingJRadioButtonDemo().setVisible(true);
            }
        });
    }
}
