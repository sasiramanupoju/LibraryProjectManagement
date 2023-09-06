package cs425_pgadmin_connection;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

	private JPanel contentPane;
        private JButton b1,b2,b3,b4,b5,b6,l2,l3,l4,c1,c2,c3,d1,d2,d3,d4;
        private JButton a1,a2,a3,e1,e2,e3,f1,f2,f3;

	public static void main(String[] args) {
            new Home().setVisible(true);
	}
        
        public Home() {
            super("CS 425, Group 16");
            setBounds(400, 150, 800, 800);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            
            JMenuBar menuBar = new JMenuBar();
            menuBar.add(Box.createRigidArea(new Dimension(230,100)));
            menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(128, 128, 128)));
            menuBar.setBackground(Color.white);
            menuBar.setBounds(0, 10, 1000, 40);
            contentPane.add(menuBar);

            JMenu mnExit = new JMenu("Exit");
            mnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
            
            
            JMenuItem mntmLogout = new JMenuItem("Cancel");
            mntmLogout.setBackground(Color.white);
            mntmLogout.setForeground(Color.red);
            mntmLogout.addActionListener(this);
            mnExit.add(mntmLogout);
            
            JMenuItem mntmExit = new JMenuItem("Exit");
            mntmExit.setForeground(Color.red);
            mntmExit.setBackground(Color.white);
            mntmExit.addActionListener(this);
            mnExit.add(mntmExit);
                
            

            JMenu mnHelp = new JMenu("Information");
            mnHelp.setFont(new Font("Trebuchet MS", Font.BOLD, 17));

            JMenuItem mntmReadme = new JMenuItem("References");
            mntmReadme.setBackground(Color.white);
            mntmReadme.setForeground(Color.red);
            mntmReadme.addActionListener(this);
            mnHelp.add(mntmReadme);

            JMenuItem mntmAboutUs = new JMenuItem("About Us");
            mntmAboutUs.setForeground(Color.red);
            mntmAboutUs.setBackground(Color.white);
            mntmAboutUs.addActionListener(this);
            mnHelp.add(mntmAboutUs);
            
            JMenu query = new JMenu("Example-queries");
            query.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
            

            JMenuItem issue = new JMenuItem("Members that took book");
            issue.setBackground(Color.white);
            issue.setForeground(Color.red);
            issue.addActionListener(this);
            query.add(issue);

            JMenuItem return_book = new JMenuItem("Members that returned book");
            return_book.setForeground(Color.red);
            return_book.setBackground(Color.white);
            return_book.addActionListener(this);
            query.add(return_book);
            
            JMenuItem mobile = new JMenuItem("Members mobile number");
            mobile.setForeground(Color.red);
            mobile.setBackground(Color.white);
            mobile.addActionListener(this);
            query.add(mobile);

            JMenu mnRecord = new JMenu("Record");
            mnRecord.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
            

            JMenuItem bookdetails = new JMenuItem("Book Details");
            bookdetails.addActionListener(this);
            bookdetails.setBackground(Color.white);
            bookdetails.setForeground(Color.red);
            mnRecord.add(bookdetails);

            JMenuItem studentdetails = new JMenuItem("Student Details");
            studentdetails.setBackground(Color.white);
            studentdetails.setForeground(Color.red);
            studentdetails.addActionListener(this);
            mnRecord.add(studentdetails);

            menuBar.add(query);
            menuBar.add(mnHelp);
            menuBar.add(mnExit);

            
            JLabel l1 = new JLabel("Library Management System Project");
            l1.setForeground(new Color(204, 51, 102));
            l1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
            l1.setBounds(120, 30, 701, 80);
            contentPane.add(l1);

          l2 = new JButton("Insert Member");
          l2.addActionListener(this);
          l2.setBounds(60, 160, 159, 52);
          contentPane.add(l2);

          l3 = new JButton("Add Librarian");
          l3.addActionListener(this);
          l3.setBounds(300, 160, 154, 52);
          contentPane.add(l3);

          l4 = new JButton("Add Records");
          l4.addActionListener(this);
          l4.setBounds(530, 160, 154, 52);
          contentPane.add(l4);
          
          c1 = new JButton("Insert mobile no.");
          c1.addActionListener(this);
          c1.setBounds(60, 215, 159, 52);
          contentPane.add(c1);
          
          c2 = new JButton("Insert Articles");
          c2.addActionListener(this);
          c2.setBounds(300, 215, 159, 52);
          contentPane.add(c2);
          
          c3 = new JButton("Insert Books");
          c3.addActionListener(this);
          c3.setBounds(530, 215, 159, 52);
          contentPane.add(c3);
          
          d1 = new JButton("Insert Documents");
          d1.addActionListener(this);
          d1.setBounds(60, 270, 159, 52);
          contentPane.add(d1);
          
          d2 = new JButton("Insert Magazines");
          d2.addActionListener(this);
          d2.setBounds(300, 270, 159, 52);
          contentPane.add(d2);
          
          d3 = new JButton("Insert Research paper");
          d3.addActionListener(this);
          d3.setBounds(530, 270, 159, 52);
          contentPane.add(d3);

            b1 = new JButton("Add thesis");
            b1.addActionListener(this);
            b1.setBounds(60, 320, 159, 52);
            contentPane.add(b1);

            b2 = new JButton("Add Takes relation");
            b2.addActionListener(this);
            b2.setBounds(300, 320, 159, 52);
            contentPane.add(b2);

            JPanel panel = new JPanel();
            panel.setBorder(new TitledBorder(new LineBorder(new Color(250, 128, 114), 2), "Add the data", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(220, 20, 60)));
            panel.setBounds(20, 120, 750, 260);
            panel.setBackground(Color.WHITE);
            contentPane.add(panel);
            
            a1 = new JButton("Show members");
            a1.addActionListener(this);
            a1.setBounds(60, 450, 159, 52);
            contentPane.add(a1);

            a2 = new JButton("Show Librarian");
            a2.addActionListener(this);
            a2.setBounds(300, 450, 159, 52);
            contentPane.add(a2);

            a3 = new JButton("Show Records");
            a3.addActionListener(this);
            a3.setBounds(530, 450, 159, 52);
            contentPane.add(a3);
            
            e1 = new JButton("Show Mobile no.");
            e1.addActionListener(this);
            e1.setBounds(60, 510, 159, 52);
            contentPane.add(e1);

            e2 = new JButton("Show Articles");
            e2.addActionListener(this);
            e2.setBounds(300, 510, 159, 52);
            contentPane.add(e2);

            e3 = new JButton("Show Books");
            e3.addActionListener(this);
            e3.setBounds(530, 510, 159, 52);
            contentPane.add(e3);
            
            f1 = new JButton("Show Documents");
            f1.addActionListener(this);
            f1.setBounds(60, 570, 159, 52);
            contentPane.add(f1);

            f2 = new JButton("Show Magazines");
            f2.addActionListener(this);
            f2.setBounds(300, 570, 159, 52);
            contentPane.add(f2);

            f3 = new JButton("Show Research paper");
            f3.addActionListener(this);
            f3.setBounds(530, 570, 159, 52);
            contentPane.add(f3);

            b4 = new JButton("Show thesis");
            b4.addActionListener(this);
            b4.setBounds(60, 630, 159, 52);
            contentPane.add(b4);

            b5 = new JButton("Show Takes relation");
            b5.addActionListener(this);
            b5.setBounds(300, 630, 159, 52);
            contentPane.add(b5);

            JPanel panel2 = new JPanel();
            panel2.setBorder(new TitledBorder(new LineBorder(new Color(205, 133, 63), 2), "View the data", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(233, 150, 122)));
            panel2.setBounds(20, 420, 750, 270);
            panel2.setBackground(Color.WHITE);
            contentPane.add(panel2);
            
            getContentPane().setBackground(Color.WHITE);
            contentPane.setBackground(Color.WHITE);
	}
        
        
        public void actionPerformed(ActionEvent ae){
            String msg = ae.getActionCommand();
            if(msg.equals("Logout")){
                setVisible(false);
            }else if(msg.equals("Exit")){
                System.exit(ABORT);
            
            }
            else if(msg.equals("References")){
            	setVisible(false);
        		new References().setVisible(true);
            }
            else if(msg.equals("About Us")){
                setVisible(false);
                new About().setVisible(true);
            
            }
            if(ae.getSource() == a1){
            	setVisible(false);
                new ShowMembers().setVisible(true);
            }
            if(ae.getSource() == l2){
            	setVisible(false);
                new insert_member().setVisible(true);
            }
            if(ae.getSource() == l3){
            	setVisible(false);
              new insert_librarians().setVisible(true);
          }
            if(ae.getSource() == l4){
            	setVisible(false);
                new insert_records().setVisible(true);
            }
            if(ae.getSource() == a3){
            	setVisible(false);
                new ShowRecords().setVisible(true);
            }
            if(ae.getSource() == a2){
            	setVisible(false);
              new ShowLibrarians().setVisible(true);
          }
            if(ae.getSource() == e1){
            	setVisible(false);
                new ShowMobileNo().setVisible(true);
            }
            if(ae.getSource() == e2){
            	setVisible(false);
                new ShowArticles().setVisible(true);
            }
            if(ae.getSource() == e3){
            	setVisible(false);
                new ShowBooks().setVisible(true);
            }
            if(ae.getSource() == f1){
            	setVisible(false);
                new ShowDocuments().setVisible(true);
            }
            if(ae.getSource() == f2){
            	setVisible(false);
                new ShowMagazines().setVisible(true);
            }
            if(ae.getSource() == f3){
            	setVisible(false);
                new ShowResearchPaper().setVisible(true);
            }
            if(ae.getSource() == b4){
            	setVisible(false);
                new ShowThesis().setVisible(true);
            }
            if(ae.getSource() == b5){
            	setVisible(false);
                new ShowTakesRelation().setVisible(true);
            }
            if(ae.getSource() == c1){
            	setVisible(false);
                new insert_mobileNo().setVisible(true);
            }
            if(ae.getSource() == c2){
            	setVisible(false);
                new insert_articles().setVisible(true);
            }
            if(ae.getSource() == c3){
            	setVisible(false);
                new insert_books().setVisible(true);
            }
            if(ae.getSource() == d1){
            	setVisible(false);
                new insert_documents().setVisible(true);
            }
            if(ae.getSource() == d2){
            	setVisible(false);
                new insert_magazines().setVisible(true);
            }
            if(ae.getSource() == d3){
            	setVisible(false);
                new insert_researchPaper().setVisible(true);
            }
            if(ae.getSource() == b1){
            	setVisible(false);
                new insert_thesis().setVisible(true);
            }
            if(ae.getSource() == b2){
            	setVisible(false);
                new insert_takesRelation().setVisible(true);
            }
            if(msg.equals("Members that took book")){
            	setVisible(false);
                new Query().setVisible(true);
            }
            if(msg.equals("Members that returned book")){
            	setVisible(false);
                new Query2().setVisible(true);
            }

            if(msg.equals("Members mobile number")){
            	setVisible(false);
                new Query3().setVisible(true);
            }
            
        }
}