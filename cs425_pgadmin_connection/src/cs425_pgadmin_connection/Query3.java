package cs425_pgadmin_connection;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;



public class Query3 extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTable table;
    private JTextField search;
    private JButton b1,b2,b3;

    public static void main(String[] args) {
	new Query3().setVisible(true);
    }
    
    public void Book() {
	try {
            conn con = new conn();
            String sql = "select members.first_name,members.last_name,studentphoneno.phone \n"
            		+ "from members, studentphoneno\n"
            		+ "where studentphoneno.member_id = members.member_id;";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            con.c.close();
	} catch (Exception e) {
	
	}
    }

    public Query3() {
        setBounds(350, 200, 890, 475);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(79, 133, 771, 282);
	contentPane.add(scrollPane);

	table = new JTable();
	table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                int row = table.getSelectedRow();
		search.setText(table.getModel().getValueAt(row, 1).toString());
            }
	});
	table.setBackground(new Color(240, 248, 255));
	table.setForeground(Color.DARK_GRAY);
	table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
	scrollPane.setViewportView(table);

	b2 = new JButton("Exit");
	b2.addActionListener(this);
	b2.setBounds(712, 89, 138, 33);
	contentPane.add(b2);


	JLabel l1 = new JLabel("Showing the Member's mobile number");
	l1.setForeground(new Color(107, 142, 35));
	l1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
	l1.setBounds(200, 15, 800, 47);
	contentPane.add(l1);

       

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 128, 128), 3, true), "Member-Details",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 0)));
	panel.setBounds(67, 54, 793, 368);
	contentPane.add(panel);
        panel.setBackground(Color.WHITE);
	Book();
    }
    
    public void actionPerformed(ActionEvent ae){
    	if(ae.getSource() == b2){
    		  this.setVisible(false);
              new Home().setVisible(true);
        }
        
    }
}

