


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;


/**
 *
 * @author HP LAPTOP
 */
class Gui extends javax.swing.JFrame {

    /**
     * Creates new form Gui
     */
	public static String Query;
    public Gui() {
    	javax.swing.JFrame frame;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDateChooser1.setDateFormatString("MM/dd/yyyy");

        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton1ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton2ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Select Date");

        
        table.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Subject Name", "Subject Code", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(50);
        table.setVisible(false);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.getTableHeader().setVisible(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(30);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(30);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jMenuBar1.setPreferredSize(new java.awt.Dimension(99, 32));

        jMenu1.setText("Fill");
        jMenu1.setPreferredSize(new java.awt.Dimension(50, 20));
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Statitics");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException,NullPointerException{
    	java.sql.Connection connect2= DriverManager.getConnection("jdbc:mysql://localhost/timetable","admin","jyoti#123");
    	String dynamics="N",fluid="N",pde="N",tc="N",bs="N",evs="N",manprolab="N";
    	for(int i=0;i<5;i++){
    		Object obj=(Object)table.getValueAt(i, 0);
    		if("Dynamics".equals(obj))
    			{dynamics=(String) table.getModel().getValueAt(i, 2);
    			continue;
    			}
    		if("Fluid Mechanics".equals(obj))
			{fluid=(String) table.getModel().getValueAt(i, 2);
			continue;
			}
    		if("PDE".equals(obj))
			{pde=(String) table.getModel().getValueAt(i, 2);
			continue;
			}
    		if("Transform Calculus".equals(obj))
			{tc=(String) table.getModel().getValueAt(i, 2);
			continue;
			}
    		if("Biology".equals(obj))
			{bs=(String) table.getModel().getValueAt(i, 2);
			continue;
			}
    		if("EVS".equals(obj))
			{evs=(String) table.getModel().getValueAt(i, 2);
			continue;
			}
    		if("Manpro lab".equals(obj))
			{manprolab=(String) table.getModel().getValueAt(i, 2);
			continue;
			}
    		
    	}
    	Date d=jDateChooser1.getDate();
    	//String p="INSERT INTO `attendance`(`student`, `date`, `Dynamics`, `Fluid Mechanics`, `PDE`, `Transform Calculus`, `Biology`, `EVS`, `Manpro lab`) VALUES ('RAVI',"+jDateChooser1.getDate().toString()+","+dynamics+","+fluid+","+pde+","+tc+","+bs+","+evs+","+manprolab+")";
    	//PreparedStatement s=(PreparedStatement) connect2.prepareStatement(p);
    	//ResultSet set=s.executeQuery();
    	PreparedStatement st= (PreparedStatement) connect2.prepareStatement("INSERT INTO `attendance`(`student`, `date`, `Dynamics`, `Fluid Mechanics`, `PDE`, `Transform Calculus`, `Biology`, `EVS`, `Manpro lab`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);");
    	st.setString(1, "RAVI");
    	st.setNString(2, d.toString());
    	st.setString(3, dynamics);
    	st.setString(4, fluid);
    	st.setString(5, pde);
    	st.setString(6, tc);
    	st.setString(7, bs);
    	st.setString(8, evs);
    	st.setString(9, manprolab);
    	st.executeUpdate();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
        // TODO add your handling code here:
        table.setVisible(true);
        table.getTableHeader().setVisible(true);
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        DefaultTableModel d=(DefaultTableModel)table.getModel();
        
        Date date=jDateChooser1.getDate();
        int day=date.getDay();
        switch(day){
        case 1 : Query="SELECT Subject FROM `table` WHERE Monday='YES'";
                 break;
        case 2 : Query="SELECT Subject FROM `table` WHERE Tuesday='YES'";
                 break;
        case 3:Query="SELECT Subject FROM `table` WHERE Wednesday='YES'";
                break;
        case 4:Query="SELECT Subject FROM `table` WHERE Thursday='YES'";
                break;        
        case 5:Query="SELECT Subject FROM `table` WHERE Friday='YES'";
                 break;
        default :Query="SELECT Subject FROM `table` WHERE Tuesday='hi'";
        }
        java.sql.Connection connect1= DriverManager.getConnection("jdbc:mysql://localhost/timetable","admin","jyoti#123");
        PreparedStatement s=(PreparedStatement) connect1.prepareStatement(Gui.Query);
		ResultSet result=s.executeQuery();
		int i=0;
		while (result.next()) {
			d.setValueAt(result.getString(1), i++, 0);
		}
		
    }                                        

    /**
     * @param args the command line arguments
     * @throws ClassNotFoundException 
     * @throws SQLException 
     */
    public static void main(String args[])throws NullPointerException, ClassNotFoundException, SQLException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    	Gui g=new Gui();
    	Class.forName("com.mysql.jdbc.Driver");
		//java.sql.Connection connect1= DriverManager.getConnection("jdbc:mysql://localhost/timetable","admin","jyoti#123");
		//java.sql.Connection connect2= DriverManager.getConnection("jdbc:mysql://localhost/timetable","admin","jyoti#123");
		
    	try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    	        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
        

    }

    // Variables declaration - do not modify 
    public javax.swing.JFrame frame;
    
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu2;
    public javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuItem1;
    public javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable table;
    // End of variables declaration
        

}




