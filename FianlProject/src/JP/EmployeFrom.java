package JP;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class EmployeFrom
{   
	
	JFrame frame;
	PrintWriter out;
	File file;
    private JLabel Data_Below; 
    private ButtonGroup Department; 
    private JLabel Firstname_Error; 
    private ButtonGroup Gender; 
    private JComboBox<String> jComboBox1; 
    private JComboBox<String> jComboBox2; 
    private JComboBox<String> jComboBox3; 
   
    private JLabel jLabel1; 
    private JLabel jLabel2; 
    private JLabel jLabel3; 
    private JLabel jLabel4; 
    private JLabel jLabel5; 
    private JLabel jLabel6; 
    private JLabel jLabel7; 
    private JLabel jLabel8; 
    private JLabel jLabel9; 
    private JPasswordField jPasswordField1; 
    private JPasswordField jPasswordField2; 
    private JRadioButton jRadioButton1; 
    private JRadioButton jRadioButton2; 
    private JRadioButton jRadioButton3; 
    private JRadioButton jRadioButton4; 
    private JRadioButton jRadioButton5; 
    private JRadioButton jRadioButton6; 
    private JRadioButton jRadioButton7;
    private JRadioButton jRadioButton8;
    private JTextArea  jTextArea1; 
    private JTextField jTextField1; 
    private JTextField jTextField2; 
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JButton jButton1; 
    private JButton jButton2; 
    private JLabel pwd_Error;
    private String dates[] 
            = { "1", "2", "3", "4", "5", 
                "6", "7", "8", "9", "10", 
                "11", "12", "13", "14", "15", 
                "16", "17", "18", "19", "20", 
                "21", "22", "23", "24", "25", 
                "26", "27", "28", "29", "30", 
                "31" }; 
        private String months[] 
            = { "Jan", "Feb", "Mar", "Apr", 
                "May", "Jun", "July", "Aug", 
                "Sep", "Oct", "Nov", "Dec" }; 
        private String years[] 
            = { "1995", "1996", "1997", "1998", 
                "1999", "2000", "2001", "2002", 
                "2003", "2004", "2005", "2006", 
                "2007", "2008", "2009", "2010", 
                "2011", "2012", "2013", "2014", 
                "2015", "2016", "2017", "2018", 
                "2019" }; 
       

        
    public EmployeFrom() { 
    	frame = new JFrame("Employee Status Bank ");
    	frame.setSize(800, 600);
        frame.setMinimumSize(new Dimension(780, 550));
    	this.initComponents(); 
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setForeground(Color.GREEN);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void initComponents() {
    	
    	jLabel1 = new JLabel("Employee Name");
    	jLabel1.setBounds(10, 30, 120, 20);
    	frame.add(jLabel1);
    	jTextField1 = new JTextField();
    	jTextField1.setBounds(160, 30, 200, 20);
    	frame.add(jTextField1);
    	
    	jLabel2 = new JLabel("Address");
    	jLabel2.setBounds(10, 60, 120, 20);
    	frame.add(jLabel2);
    	jTextField2 = new JTextField();
    	jTextField2.setBounds(160, 60, 200, 20);
    	frame.add(jTextField2);
    	
    	jLabel3 = new JLabel("State");
    	jLabel3.setBounds(10, 90, 120, 20);
    	frame.add(jLabel3);
    	jTextField3 = new JTextField();
    	jTextField3.setBounds(160, 90, 200, 20);
    	frame.add(jTextField3);
    	
    	jLabel4 = new JLabel("City");
    	jLabel4.setBounds(10, 120, 120, 20);
    	frame.add(jLabel4);
    	jTextField4 = new JTextField();
    	jTextField4.setBounds(160, 120, 200, 20);
    	frame.add(jTextField4);
    	
    	jLabel5 = new JLabel("Email Address");
    	jLabel5.setBounds(10, 150, 120, 20);
    	frame.add(jLabel5);
    	jTextField5 = new JTextField();
    	jTextField5.setBounds(160, 150, 200, 20);
    	frame.add(jTextField5);
    	
    	jLabel6 = new JLabel("Phone NO.");
    	jLabel6.setBounds(10, 180, 120, 20);
    	frame.add(jLabel6);
    	jTextField6 = new JTextField();
    	jTextField6.setBounds(160, 180, 200, 20);
    	frame.add(jTextField6);
    	
    	
    	jLabel7 = new JLabel("Password");
    	jLabel7.setBounds(10, 210, 120, 20);
    	frame.add(jLabel7);
    	jPasswordField1 = new JPasswordField();
    	jPasswordField1.setBounds(160, 210, 200, 20);
    	frame.add(jPasswordField1);
    	
    	jLabel8 = new JLabel("Confirm Password");
    	jLabel8.setBounds(10, 230, 120, 20);
    	frame.add(jLabel8);
    	jPasswordField2 = new JPasswordField();
    	jPasswordField2.setBounds(160, 230, 200, 20);
    	frame.add(jPasswordField2);
    	
    	jPasswordField2.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent Jahid) {
				
			}

			@Override
			public void focusLost(FocusEvent jahid) {
				if(jPasswordField2.getText().equals(jPasswordField1.getText())==true || jPasswordField1.getText().equals(jPasswordField2.getText())==true) 
		        { 
		            pwd_Error.setVisible(false); 
		        } 
		        else 
		        { 
		            pwd_Error.setVisible(true); 
		            jPasswordField1.setFocusable(true); 
		            jPasswordField1.requestFocus(); 
		        } 
				
			}
         } );
    	
    	
    	jLabel9 = new JLabel("Date of Birth");
    	jLabel9.setBounds(10, 260, 120, 20);
    	frame.add(jLabel9);
    	jComboBox1 = new JComboBox<String>(dates);
    	jComboBox1.setBounds(160, 260, 60, 20);
    	frame.add(jComboBox1);
    	jComboBox2 = new JComboBox<String>(months);
    	jComboBox2.setBounds(230, 260, 60, 20);
    	frame.add(jComboBox2);
    	jComboBox3 = new JComboBox<String>(years);
    	jComboBox3.setBounds(300, 260, 60, 20);
    	frame.add(jComboBox3);
    
    
    	jLabel7 = new JLabel("Gender");
    	jLabel7.setBounds(10, 290, 120, 20);
    	frame.add(jLabel7);
    	
    	jRadioButton1 = new JRadioButton("Male", true);
    	jRadioButton2 = new JRadioButton("Female");
    	jRadioButton1.setBounds(160, 290, 60, 20);    
    	jRadioButton2.setBounds(230, 290, 100, 20);    
    	Gender = new ButtonGroup();    
    	Gender.add(jRadioButton1);
    	Gender.add(jRadioButton2);
    	frame.add(jRadioButton1); 
    	frame.add(jRadioButton2);
    	
    	jLabel8 = new JLabel("Department");
    	jLabel8.setBounds(10, 320, 120, 20);
    	frame.add(jLabel8);
    
    	jRadioButton3 = new JRadioButton("Accounting");
    	jRadioButton4 = new JRadioButton("IT");
    	jRadioButton5 = new JRadioButton("Research");
    	jRadioButton6 = new JRadioButton("Loan");
    	jRadioButton7 = new JRadioButton("Cashiar");
    	jRadioButton8 = new JRadioButton("Transport");
    	jRadioButton3.setBounds(160, 320, 200, 20);    
    	jRadioButton4.setBounds(160, 350, 240, 20);    
    	jRadioButton5.setBounds(160, 380, 240, 20);    
    	jRadioButton6.setBounds(160, 410, 240, 20);    
    	jRadioButton7.setBounds(160, 440, 240, 20);    
    	jRadioButton8.setBounds(160, 480, 240, 20);
    	Department = new ButtonGroup();    
    	Department.add(jRadioButton3);
    	Department.add(jRadioButton4);    
    	Department.add(jRadioButton5);
    	Department.add(jRadioButton6);    
    	Department.add(jRadioButton7);
    	Department.add(jRadioButton8);
    	frame.add(jRadioButton3); 
    	frame.add(jRadioButton4);
    	frame.add(jRadioButton5);
    	frame.add(jRadioButton6);
    	frame.add(jRadioButton7);
    	frame.add(jRadioButton8);
    	
    	jButton1 = new JButton("Submit");    
    	jButton1.setBounds(190, 510, 85, 25);
    	frame.add(jButton1);
    	jButton2 = new JButton("Cancel");    
    	jButton2.setBounds(295, 510, 85, 25);
    	frame.add(jButton2);
    	
    	jButton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(jTextField1.getText().equals("")) {
					JOptionPane.showMessageDialog(frame,"Wrong Information","Field empty",JOptionPane.WARNING_MESSAGE);
				}else if(jPasswordField2.getText().equals(jPasswordField1.getText())!=true || jPasswordField1.getText().equals(jPasswordField2.getText())!=true) {
					JOptionPane.showMessageDialog(frame,"Not match yet","Password Missmatch",JOptionPane.WARNING_MESSAGE);
				}else{
					pwd_Error.setVisible(false); 
				
					jTextArea1.setText("Employee Name : "+jTextField1.getText()+"\n" 
				               +"Address: "+jTextField2.getText()+"\n" 
				               +"State : "+jTextField3.getText()+"\n" 
				               +"City : "+jTextField4.getText()+"\n"
				               +"Email Address: "+jTextField5.getText()+"\n"
				               +"Phone NO.: "+jTextField6.getText()+"\n" 
				               +"Date Of Birth : "+jComboBox1.getSelectedItem().toString()+" "+jComboBox2.getSelectedItem().toString()+" "+jComboBox3.getSelectedItem().toString()+"\n" 
				               +"Gender : "+ Gender.getSelection().getActionCommand()+"\n" 
				               +"Department : "+Department.getSelection().getActionCommand() 
				            );
					
					file = new File("src/JP/EmployeData.txt");
					
					try {
						out = new PrintWriter(file);
					} catch (FileNotFoundException e1) {
						try {
							file.createNewFile();
							out = new PrintWriter(file.getAbsoluteFile());
						} catch (IOException e2) {
							JOptionPane.showMessageDialog(frame,e2.getMessage(),"I/O Exceptio Occurs",JOptionPane.WARNING_MESSAGE);
						}
					}
					out.println(jTextArea1.getText());
					out.close();
					JOptionPane.showMessageDialog(frame, " **successfully Enter your Details !**");
					
				}
				
			}
    		
    	});
    	
    	jButton2.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
				jTextArea1.setText("");
				pwd_Error.setVisible(false); 
				jTextField1.setText("");
				jTextField2.setText("");
				jTextField3.setText("");
				jPasswordField1.setText("");
				jPasswordField2.setText("");
			}
    	});
    	
    	
    	jTextArea1 = new JTextArea();
    	jTextArea1.setBounds(420, 235, 340, 250);
    	frame.add(jTextArea1);
    	
    	pwd_Error = new JLabel("!!NOT MACHED PASSWORD!!");
    	pwd_Error.setBounds(395, 150, 300, 20);
    	pwd_Error.setForeground(Color.YELLOW);
    	pwd_Error.setVisible(false); 
    	frame.add(pwd_Error);
    	jRadioButton1.setActionCommand("Male"); 
        jRadioButton2.setActionCommand("Female"); 
        jRadioButton3.setActionCommand("Accounting"); 
        jRadioButton4.setActionCommand("IT"); 
        jRadioButton5.setActionCommand("Research"); 
        jRadioButton6.setActionCommand("Loan");
        jRadioButton7.setActionCommand("Cashiar");
        jRadioButton8.setActionCommand("Transport"); 	
    }                       
public static void main(String args[]) 
{  
	          /* Create and display the form */ 
        java.awt.EventQueue.invokeLater(new Runnable() { 
                       public void run() { 
                new EmployeFrom(); 
            } 
        }); 
    }
}