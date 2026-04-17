import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.sql.*; 
public class DB1_EmpSwing extends JFrame implements ActionListener { 
     JTextField txtEno, txtEName, txtDesignation, txtSalary; 
    JButton btnSave, btnClear; 
        public DB1_EmpSwing() { 
        setTitle("Employee Form"); 
        setSize(300, 250);     
        setLayout(new GridLayout(5, 2)); 
        add(new JLabel("Emp No:")); 
        txtEno = new JTextField(); 
        add(txtEno); 
        add(new JLabel("Name:")); 
        txtEName = new JTextField(); 
        add(txtEName); 
        add(new JLabel("Designation:")); 
        txtDesignation = new JTextField(); 
        add(txtDesignation); 
        add(new JLabel("Salary:")); 
        txtSalary = new JTextField(); 
        add(txtSalary); 
 
        btnSave = new JButton("Save"); 
        add(btnSave); 
        btnSave.addActionListener(this);  
        btnClear = new JButton("Clear"); 
        add(btnClear); 
       btnClear.addActionListener(this); 
       setVisible(true); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 
 public void actionPerformed(ActionEvent e) { 
        try { 
 if(e.getSource()==btnSave) 
  { 
     Class.forName("org.postgresql.Driver"); 
            Connection con = 
DriverManager.getConnection("JDBC:postgresql://172.16.6.1/ty170","ty170",""); 
            PreparedStatement pst = con.prepareStatement("INSERT INTO EmpSwing 
VALUES (?, ?, ?, ?)"); 
            pst.setInt(1, Integer.parseInt(txtEno.getText())); 
            pst.setString(2, txtEName.getText()); 
            pst.setString(3, txtDesignation.getText()); 
            pst.setInt(4, Integer.parseInt(txtSalary.getText())); 
            pst.executeUpdate(); 
            JOptionPane.showMessageDialog(this, "Employee saved!"); 
            con.close(); 
  } 
 if(e.getSource()==btnClear) 
 { 
 txtEno.setText(" "); 
 txtEName.setText(" "); 
 txtDesignation.setText(" "); 
 txtSalary.setText(" "); 
 txtEno.requestFocus(); 
 } 
        } catch (Exception ex) { 
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage()); 
        } 
    } 
    public static void main(String[] args) { 
        new DB1_EmpSwing(); 
    } 
} 
