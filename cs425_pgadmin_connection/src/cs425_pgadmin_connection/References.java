package cs425_pgadmin_connection;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;

public class References extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTable table;
    private JTextField search;
    private JButton b1,b2,b3;

    public static void main(String[] args) {
	new References().setVisible(true);
    }
   

    public References() {
        setBounds(350, 200, 890, 475);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);


	b2 = new JButton("Exit");
	b2.addActionListener(this);
	b2.setBounds(712, 89, 138, 33);
	contentPane.add(b2);


	JLabel l1 = new JLabel("References");
	l1.setForeground(new Color(107, 142, 35));
	l1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
	l1.setBounds(300, 15, 400, 47);
	contentPane.add(l1);
	

	JLabel l2 = new JLabel("1. Professor Slides");
	l2.setForeground(new Color(107, 142, 35));
	l2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
	l2.setBounds(200, 150, 400, 47);
	contentPane.add(l2);
	
	JLabel l4 = new JLabel("(Took reference of the connection)");
	l4.setForeground(new Color(107, 142, 35));
	l4.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
	l4.setBounds(230, 180, 900, 47);
	contentPane.add(l4);
	
	JLabel l3 = new JLabel("2. https://www.youtube.com/watch?v=4bH5joqogvg");
	l3.setForeground(new Color(107, 142, 35));
	l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
	l3.setBounds(200, 250, 900, 47);
	contentPane.add(l3);
	
	JLabel l5 = new JLabel("(Took reference of the styles in pages)");
	l5.setForeground(new Color(107, 142, 35));
	l5.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
	l5.setBounds(230, 280, 900, 47);
	contentPane.add(l5);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 128, 128), 3, true), "Credits",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 0)));
	panel.setBounds(67, 54, 793, 368);
	contentPane.add(panel);
        panel.setBackground(Color.WHITE);
    }
    
    public void actionPerformed(ActionEvent ae){
    	if(ae.getSource() == b2){
    		  this.setVisible(false);
              new Home().setVisible(true);
        }
       
    }
}

