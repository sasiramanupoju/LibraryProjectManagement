package cs425_pgadmin_connection;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class insert_researchPaper extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5,t6;
    private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3;
    JButton b1,b2;

    public static void main(String[] args) {
        new insert_researchPaper().setVisible(true);
    }

    public void random() {
        Random rd = new Random();
	t1.setText("" + rd.nextInt(1000000000 + 1));
    }

    public insert_researchPaper() {
        super("Add Research Paper");
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

	JLabel l2 = new JLabel("Authors");
	l2.setForeground(new Color(25, 25, 112));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(20, 97, 102, 22);
	contentPane.add(l2);

	JLabel l3 = new JLabel("Journal Name");
	l3.setForeground(new Color(25, 25, 112));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(20, 130, 200, 22);
	contentPane.add(l3);
	

	JLabel l6 = new JLabel("Publication Date");
	l6.setForeground(new Color(25, 25, 112));
	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	l6.setBounds(20, 176, 200, 22);
	contentPane.add(l6);


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
	
	t6 = new JTextField();
	t6.setForeground(new Color(147, 79, 79));
	t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t6.setColumns(10);
	t6.setBounds(176, 176, 154, 20);
	contentPane.add(t6);

//	comboBox = new JComboBox();
//	comboBox.setModel(new DefaultComboBoxModel(new String[] { "Mechanical", "CSE", "IT", "Civil", "Automobile", "EEE", "Other" }));
//	comboBox.setForeground(new Color(47, 79, 79));
//	comboBox.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
//	comboBox.setBounds(176, 211, 154, 20);
//	contentPane.add(comboBox);
//
//	comboBox_1 = new JComboBox();
//	comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "First", "Second", "Third", "Four" }));
//	comboBox_1.setForeground(new Color(47, 79, 79));
//	comboBox_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
//	comboBox_1.setBounds(176, 244, 154, 20);
//	contentPane.add(comboBox_1);
//
//	comboBox_2 = new JComboBox();
//	comboBox_2.setModel(
//			new DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));
//	comboBox_2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
//	comboBox_2.setForeground(new Color(47, 79, 79));
//	comboBox_2.setBounds(176, 277, 154, 20);
//	contentPane.add(comboBox_2);

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
	panel.setBorder(new TitledBorder(new LineBorder(new Color(102, 205, 170), 2, true), "Add-ResearchPaper",
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
                String sql = "INSERT INTO research_paper(isbn,authors,journal_name,published_date)\n"
                		+ "VALUES(?,?,?,?);";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		st.setString(2, t2.getText());
		st.setString(3, t3.getText());
		st.setString(4, t6.getText());

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
