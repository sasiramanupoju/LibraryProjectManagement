package cs425_pgadmin_connection;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class insert_documents extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5,t6;
    private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3;
    JButton b1,b2;

    public static void main(String[] args) {
        new insert_documents().setVisible(true);
    }

    public void random() {
        Random rd = new Random();
	t1.setText("" + rd.nextInt(1000000000 + 1));
    }

    public insert_documents() {
        super("Add Document");
	setBounds(700, 200, 550, 450);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel l1 = new JLabel("ISBN");
	l1.setForeground(new Color(25, 25, 112));
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setBounds(20, 63, 102, 22);
	contentPane.add(l1);

	JLabel l2 = new JLabel("Title");
	l2.setForeground(new Color(25, 25, 112));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(20, 97, 102, 22);
	contentPane.add(l2);

	JLabel l3 = new JLabel("Citation");
	l3.setForeground(new Color(25, 25, 112));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(20, 130, 200, 22);
	contentPane.add(l3);
	
	t1 = new JTextField();
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(174, 66, 156, 20);
	contentPane.add(t1);
	t1.setColumns(10);

	t2 = new JTextField();
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setColumns(10);
	t2.setBounds(174, 100, 156, 20);
	contentPane.add(t2);

	t3 = new JTextField();
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(174, 133, 156, 20);
	contentPane.add(t3);
	
	b1 = new JButton("ADD");
	b1.addActionListener(this);
	b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b1.setBounds(64, 321, 111, 33);
//        b1.setBackground(Color.BLACK);
//        b1.setForeground(Color.WHITE);
	contentPane.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b2.setBounds(198, 321, 111, 33);
//        b2.setBackground(Color.BLACK);
//        b2.setForeground(Color.WHITE);
	contentPane.add(b2);

//	JLabel l7 = new JLabel("Course");
//	l7.setForeground(new Color(25, 25, 112));
//	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
//	l7.setBounds(64, 173, 102, 22);
//	contentPane.add(l7);

//	comboBox_3 = new JComboBox();
//	comboBox_3.setModel(new DefaultComboBoxModel(
//			new String[] { "B.E", "B.Tech", "M.Tech", "MBA", "BBA", "BCA", "B.Sc", "M.Sc", "B.Com", "M.Com" }));
//	comboBox_3.setForeground(new Color(47, 79, 79));
//	comboBox_3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
//	comboBox_3.setBounds(176, 176, 154, 20);
//	contentPane.add(comboBox_3);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(102, 205, 170), 2, true), "Add-Document",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 255)));
	panel.setBackground(new Color(211, 211, 211));
	panel.setBounds(10, 38, 358, 348);
        
        contentPane.setBackground(Color.WHITE);
        panel.setBackground(Color.WHITE);
        
	contentPane.add(panel);
	random();
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            
            if(ae.getSource() == b1){
                try{
                	conn con = new conn();
                String sql = "INSERT INTO documents(isbn,title,citation)\n"
                		+ "VALUES(?,?,?);";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		st.setString(2, t2.getText());
		st.setString(3, t3.getText());

		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "Successfully Added");
                    this.setVisible(false);
                    new Home().setVisible(true);
                }
		else
                    JOptionPane.showMessageDialog(null, "error");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Home().setVisible(true);		
            }
        }catch(Exception e){
            
        }
    }
}
