/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

import javax.swing.DefaultListModel;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.table.DefaultTableModel;
import logica.EquiposLogica;
import logica.PartidosLogica;
import repositorio.EquiposRepositorio;

/**
 *
 * @author nico2
 */
public class MostrarInfo extends javax.swing.JFrame {

    PartidosLogica partidoLog = new PartidosLogica();
    
    DefaultListModel model = new DefaultListModel();
    DefaultTableModel dtm = new DefaultTableModel();
    EquiposRepositorio equipo = new EquiposRepositorio();
    EquiposLogica equipoL = new EquiposLogica();
    private int nameTeam1;
    private int nameTeam2;
    private int numc;
    String[][] actualizarJugadores1 = new String[12][9];
    String[][] actualizarJugadores2 = new String[12][9];
    
    int numeroTabla = 1;
    String[][] cod1 = equipo.obtenerNombreYCodigoEquipo();
            
    String ganador = "";
    
    String puntosTotales1 = "0";
    String puntosTotales2 = "0";
    /**
     * Creates new form MostrarInfo
     */
    public MostrarInfo() {

        initComponents();
        jScrollPane2.setVisible(false);
        jTable1.setVisible(false);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(false);
        jButton5.setVisible(false);
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jTextField7.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jDateChooser1.setVisible(false);
        jScrollPane1.setVisible(false);
        jButton6.setVisible(false);
        jList1.setModel(model);
        jButton2.setEnabled(false);
        nEspectadoresInput.setVisible( false );
        jLabel5.setText("Nombre Arbitro:");
        jLabel10.setText("Número Faltas totales: ");
        jLabel13.setVisible( false );
        updateButton.setVisible( false );
         
        dtm = (DefaultTableModel) jTable1.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nEspectadoresInput = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        updateButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Cargar Información Partido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        jButton2.setText("Cargar Información Jugadores");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel1.setText("Nombre Equipo 1:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 115, -1, -1));

        jLabel2.setText("Carga De Información");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 44, -1, -1));

        jLabel3.setText("Nombre Equipo 2:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 143, -1, -1));

        jLabel4.setText("Fecha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 168, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        jLabel5.setText("Nombre Arbitro:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 205, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 133, -1));

        jLabel6.setText("Número puntos anotados equipo 1:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 285, -1, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 222, -1));

        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 41, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 51, 51));
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("No deben de haber formularios vacios");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 70, -1, -1));

        jLabel8.setText("Número puntos anotados equipo 2:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 319, -1, -1));

        jLabel9.setText("Nombre Estadio:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 353, -1, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 282, 169, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 350, 169, -1));

        jLabel10.setText("Número Faltas totales: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 245, -1, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 316, 169, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 139, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 139, -1));

        jLabel11.setBackground(new java.awt.Color(255, 51, 51));
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("No se puede seleccionar el mismo equipo");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 90, -1, -1));

        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jButton6.setText("Siguiente");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        jLabel12.setText("1");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 44, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Puntos anotados", "Número de faltas", "Número de robos", "Asistencias", "Tapones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 720, 270));

        nEspectadoresInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nEspectadoresInputActionPerformed(evt);
            }
        });
        getContentPane().add(nEspectadoresInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 170, -1));

        jLabel13.setText("Numero Espectadores:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        updateButton.setText("Actualizar");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(true);
        jButton5.setVisible(true);
        jComboBox2.setVisible(true);
        jComboBox1.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
        jTextField6.setVisible(true);
        jTextField7.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jButton4.setVisible(false);
        jLabel6.setVisible(true);
        jLabel8.setVisible(true);
        jLabel9.setVisible(true);
        jLabel10.setVisible(true);
        jDateChooser1.setVisible(true);
        jScrollPane1.setVisible(false);
        nEspectadoresInput.setVisible( true );
        jLabel13.setVisible( true );
        

        String[][] cod = equipo.obtenerNombreYCodigoEquipo();
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        for (int i = 0; i < cod.length; i++) {
            StringBuilder sbf = new StringBuilder();
            String singleString = "";
            sbf.append(cod[i][0]);
            singleString = sbf.toString();
            jComboBox1.addItem(singleString);
            jComboBox2.addItem(singleString);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton5.setVisible(true);
        jButton4.setVisible(false);
        jScrollPane1.setVisible(true);

        String[][] cod = equipo.obtenerNombreYCodigoEquipo();

        model.removeAllElements();
        for (int i = 0; i < 12; i++) {
            StringBuilder sbf = new StringBuilder();
            String singleString = "";
            sbf.append(equipoL.obtenerJugadoresEquipoPorId(cod[nameTeam1][1])[i][1]);
            singleString = sbf.toString();
            model.addElement(singleString);

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextField5.getText().isEmpty() || jTextField6.getText().isEmpty() || jTextField7.getText().isEmpty() || nEspectadoresInput.getText().isEmpty() ) {
            jLabel7.setVisible(true);
        }
        if (jComboBox1.getSelectedItem() == jComboBox2.getSelectedItem()) {
            jLabel11.setVisible(true);
        }

        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        String date = dFormat.format(jDateChooser1.getDate());
        nameTeam1 = jComboBox1.getSelectedIndex();
        nameTeam2 = jComboBox2.getSelectedIndex();
        String jc1 = jComboBox1.getSelectedItem().toString();
        String jc2 = jComboBox2.getSelectedItem().toString();
        String nArbitro = jTextField3.getText().trim();
        String nFaltas = jTextField4.getText();
        String nPuntoTeam1 = jTextField5.getText();
        String nPuntoTeam2 = jTextField7.getText();
        String nEstadio = jTextField6.getText();
        String nEspectadores = nEspectadoresInput.getText();
        
        
        if( Integer.parseInt( nPuntoTeam1.trim() ) > Integer.parseInt( nPuntoTeam2.trim()  ) ) ganador = jc1;
        else ganador = jc2;
        partidoLog.añadirPartido( jc1, jc2, nPuntoTeam1, nPuntoTeam2, date, nArbitro, nFaltas, nEstadio, nEspectadores);
        
        
        //Empieza logica de tablas equipos
        
        String[][] cod = equipo.obtenerNombreYCodigoEquipo();
        StringBuilder sbf = new StringBuilder();
        String singleString = "";
        sbf.append(cod[nameTeam1][1]);
        singleString = sbf.toString();
        //System.out.println("Equipo 1: " + singleString);

        StringBuilder zbf = new StringBuilder();
        String zingleString = "";
        zbf.append(cod[nameTeam2][1]);
        zingleString = zbf.toString();
        //System.out.println("Equipo 2: " + zingleString);
        jButton2.setEnabled(true);

        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
        jDateChooser1.setVisible(false);
        jTextField5.setVisible(false);
        jTextField7.setVisible(false);
        jTextField6.setVisible(false);
        jLabel1.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel7.setVisible(false);
        jLabel11.setVisible(false);
        jLabel6.setVisible(false);
        jButton6.setVisible(true);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jLabel10.setVisible(false);
        jLabel5.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTable1.setVisible(true);
        jScrollPane2.setVisible(true);
        nEspectadoresInput.setVisible( false );
         jLabel13.setVisible( false );
         updateButton.setVisible( true );
        
        llenarTabla1();
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton1.setVisible(true);
        jScrollPane2.setVisible(false);
        jTable1.setVisible(false);
        jButton4.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(false);
        jButton5.setVisible(false);
        jComboBox2.setVisible(false);
        jComboBox1.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jTextField7.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel11.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jDateChooser1.setVisible(false);
        jScrollPane1.setVisible(false);
        jButton6.setVisible(false);

        
        for(int i=0;i<jTable1.getRowCount();i++){
            dtm.removeRow(i);
            i-=1;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        numc = Integer.parseInt(jLabel12.getText());
        numc = numc + 1;
        String lb = Integer.toString(numc);
        jLabel12.setText(lb);

        String[][] cod1 = equipo.obtenerNombreYCodigoEquipo();

        StringBuilder sbf1 = new StringBuilder();
        String singleString1 = "";
        sbf1.append(equipoL.obtenerJugadoresEquipoPorId(cod1[nameTeam1][1])[numc][1]);
        singleString1 = sbf1.toString();
        jTextField3.setText(singleString1);
        
        llenarTabla2();
        
        if( numc > 2 ){
            this.setVisible( false );
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void nEspectadoresInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nEspectadoresInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nEspectadoresInputActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        
        //Boton actualizar para obtener data
        
        if( numeroTabla == 1 ){

            String id1 = cod1[nameTeam1][1];
            
            
            for( int i = 0; i < this.actualizarJugadores1.length; i ++ ){
                
                this.actualizarJugadores1[i][0] = equipoL.obtenerJugadoresEquipoPorId( id1 )[i][0].trim();
                this.actualizarJugadores1[i][1] = equipoL.obtenerJugadoresEquipoPorId( id1 )[i][1].trim();
                this.actualizarJugadores1[i][2] = equipoL.obtenerJugadoresEquipoPorId( id1 )[i][2].trim();
                this.actualizarJugadores1[i][3] = equipoL.obtenerJugadoresEquipoPorId( id1 )[i][3].trim();
            
                for( int k = 1; k < 6; k++ ){
                    
                    int valorTabla          = Integer.parseInt( (dtm.getValueAt(i, k) + "".trim() ) );
                    int valorAntiguoJugador = Integer.parseInt( equipoL.obtenerJugadoresEquipoPorId( id1 )[i][k + 3].trim() );
                    
                    if( k == 1 ){
                        puntosTotales1 = ( Integer.parseInt( puntosTotales1.trim() ) + valorTabla ) + "";
                    }
                    
                    this.actualizarJugadores1[i][k + 3] =  ( valorTabla + valorAntiguoJugador ) + "";
                }
            }
            
            //Actualizaremos los partidos ganados/ perdidos/ puntos totales
            String[] datosEquipo1 = equipoL.obtenerEquipoPorId( id1 );
            
            actualizarEquipo( id1, datosEquipo1, actualizarJugadores1);
            numeroTabla ++;
        }
        else if( numeroTabla == 2 ){
            
            System.out.println("Actualizando tabla 2");
            String id = cod1[nameTeam2][1];
            
            
            for( int i = 0; i < this.actualizarJugadores2.length; i ++ ){
                
                this.actualizarJugadores2[i][0] = equipoL.obtenerJugadoresEquipoPorId( id )[i][0].trim();
                this.actualizarJugadores2[i][1] = equipoL.obtenerJugadoresEquipoPorId( id )[i][1].trim();
                this.actualizarJugadores2[i][2] = equipoL.obtenerJugadoresEquipoPorId( id )[i][2].trim();
                this.actualizarJugadores2[i][3] = equipoL.obtenerJugadoresEquipoPorId( id )[i][3].trim();
                
                for( int k = 1; k < 6; k++ ){
                    
                    
                    int valorTabla          = Integer.parseInt( (dtm.getValueAt(i, k) + "".trim() ) );
                    int valorAntiguoJugador = Integer.parseInt( equipoL.obtenerJugadoresEquipoPorId( id )[i][k + 3].trim() );
                    
                     if( k == 1 ){
                        puntosTotales2 = ( Integer.parseInt( puntosTotales2.trim() ) + valorTabla ) + "";
                    }
                    this.actualizarJugadores2[i][k + 3] = (  valorTabla + valorAntiguoJugador ) + "";
                
                }
            }
            
            System.out.println( id );
            String[] datosEquipo2 = equipoL.obtenerEquipoPorId( id );
            //Actualizando equipos
            
            actualizarEquipo( id,datosEquipo2, actualizarJugadores2);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MostrarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarInfo().setVisible(true);
            }
        });
    }
    
    
    
    
    public void llenarTabla1(){
        
        jButton3.setVisible( false );

        Object[] matrizTable = new Object[6];
        //Añadiendo data nueva
        for (int i = 0; i < 12; i++) {
            StringBuilder sbf1 = new StringBuilder();
            StringBuilder sbf2 = new StringBuilder();
            StringBuilder sbf3 = new StringBuilder();
            StringBuilder sbf4 = new StringBuilder();
            StringBuilder sbf5 = new StringBuilder();
            StringBuilder sbf6 = new StringBuilder();
            String singleString2 = "";
            String singleString3 = "";
            String singleString4 = "";
            String singleString5 = "";
            String singleString6 = "";
            String singleString1 = "";
            sbf1.append( equipoL.obtenerJugadoresEquipoPorId( cod1[nameTeam1][1])[i][1]);
            sbf2.append(0);
            sbf3.append(0);
            sbf4.append(0);
            sbf5.append(0);
            sbf6.append(0);
            singleString1 = sbf1.toString();
            singleString2 = sbf2.toString();
            singleString3 = sbf3.toString();
            singleString4 = sbf4.toString();
            singleString5 = sbf5.toString();
            singleString6 = sbf6.toString();
            matrizTable[0] = singleString1;
            matrizTable[1] = singleString2;
            matrizTable[2] = singleString3;
            matrizTable[3] = singleString4;
            matrizTable[4] = singleString5;
            matrizTable[5] = singleString6;
            dtm.addRow(matrizTable);
            
        }
        
        
        
    }
    
    
    
     public void llenarTabla2(){
        
        Object[] matrizTable = new Object[6];

        //Eliminando data vieja
        for( int i = 11; i >= 0; i-- ){
            dtm.removeRow(i);
        }
        
        for (int i = 0; i < 12; i++) {
            StringBuilder sbf1 = new StringBuilder();
            StringBuilder sbf2 = new StringBuilder();
            StringBuilder sbf3 = new StringBuilder();
            StringBuilder sbf4 = new StringBuilder();
            StringBuilder sbf5 = new StringBuilder();
            StringBuilder sbf6 = new StringBuilder();
            String singleString2 = "";
            String singleString3 = "";
            String singleString4 = "";
            String singleString5 = "";
            String singleString6 = "";
            String singleString1 = "";
            sbf1.append( equipoL.obtenerJugadoresEquipoPorId( cod1[nameTeam2][1])[i][1]);
            sbf2.append(0);
            sbf3.append(0);
            sbf4.append(0);
            sbf5.append(0);
            sbf6.append(0);
            singleString1 = sbf1.toString();
            singleString2 = sbf2.toString();
            singleString3 = sbf3.toString();
            singleString4 = sbf4.toString();
            singleString5 = sbf5.toString();
            singleString6 = sbf6.toString();
            matrizTable[0] = singleString1;
            matrizTable[1] = singleString2;
            matrizTable[2] = singleString3;
            matrizTable[3] = singleString4;
            matrizTable[4] = singleString5;
            matrizTable[5] = singleString6;
            
            dtm.addRow(matrizTable);
        }
        
        
        
    }

    
    public void actualizarEquipo( String codigo, String[] equipoInfo, String[][] jugadoresActualizados ){

        
        //Asignar victoria/derrota
        
        if( equipoInfo[0].trim().equals( ganador.trim() ) ){
            
            equipoInfo[3] =  ( Integer.parseInt( equipoInfo[3].trim() ) + 1 ) + "";
        }
        else{
            
           equipoInfo[4] =  ( Integer.parseInt( equipoInfo[4].trim() ) + 1 ) + ""; 
        }
        
        //Sumar puntos totales
        
        if( numeroTabla == 1 ){
            System.out.println("Entro1");
            
            equipoInfo[5] = ( Integer.parseInt( equipoInfo[5].trim() ) + Integer.parseInt( puntosTotales1.trim() ) ) + "";
            EquiposLogica equipoL1 = new EquiposLogica();
            
            System.out.println("Code " + codigo );
            equipoL1.actualizarEquipo(codigo.trim(), equipoInfo, jugadoresActualizados);
        }
        else {
            System.out.println("Entro2");
            equipoInfo[5] = ( Integer.parseInt( equipoInfo[5].trim() ) + Integer.parseInt( puntosTotales2.trim() ) ) + "";
            EquiposLogica equipoL2 = new EquiposLogica();
            equipoL2.actualizarEquipo(codigo.trim(), equipoInfo, jugadoresActualizados);
        }
        
        
        
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField nEspectadoresInput;
    private javax.swing.JToggleButton updateButton;
    // End of variables declaration//GEN-END:variables
}
