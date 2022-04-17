/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Clases.*;
import Form.*;
import java.awt.Frame;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jhona
 */
public class PanelAulaPro extends javax.swing.JPanel {

    /**
     * Creates new form PanelAulaAdm
     */
        int posP = Colegio.existeBuscarProf(Colegio.idProfeIniciado);
        
    public PanelAulaPro() {
        initComponents();
        jTextIdAula.setEditable(false);
        jTextFieldCantidadAula.setEditable(false);
        jTextCantAlu.setEditable(false);
        String aulas[] = Colegio.listaProf[posP].aulaProf();
        jTextFieldCantidadAula.setText(String.valueOf(aulas.length));
        mostrarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupNivel = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAulas = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCantidadAula = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextIdAula = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jRadioButtonIni = new javax.swing.JRadioButton();
        jRadioButtonPrim = new javax.swing.JRadioButton();
        jRadioButtonSecun = new javax.swing.JRadioButton();
        jTextFieldTutor = new javax.swing.JTextField();
        jButtonNominaAula = new javax.swing.JButton();
        jTextFieldGrado = new javax.swing.JTextField();
        jTextFieldSeccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextCantAlu = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTableAulas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAulas.setColumnSelectionAllowed(true);
        jTableAulas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableAulas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAulasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableAulas);

        jLabel10.setText("Cantidad");

        jTextFieldCantidadAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadAulaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jPanel3.setBackground(new java.awt.Color(245, 244, 244));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setName(""); // NOI18N

        jLabel1.setText("ID Aula");

        jLabel2.setText("Grado");

        jLabel3.setText("Nivel");

        jLabel4.setText("Tutor");

        jTextIdAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdAulaActionPerformed(evt);
            }
        });

        jLabel11.setText("Sección");

        buttonGroupNivel.add(jRadioButtonIni);
        jRadioButtonIni.setText("Inicial");
        jRadioButtonIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonIniActionPerformed(evt);
            }
        });

        buttonGroupNivel.add(jRadioButtonPrim);
        jRadioButtonPrim.setText("Primaria");
        jRadioButtonPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPrimActionPerformed(evt);
            }
        });

        buttonGroupNivel.add(jRadioButtonSecun);
        jRadioButtonSecun.setText("Secundaria");

        jButtonNominaAula.setText("Mostrar Nómina");
        jButtonNominaAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNominaAulaActionPerformed(evt);
            }
        });

        jLabel6.setText("Cantidad de Alumnos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel11))
                            .addGap(315, 315, 315))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jRadioButtonIni)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButtonPrim)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButtonSecun))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldTutor)
                                    .addComponent(jTextFieldSeccion)
                                    .addComponent(jTextFieldGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextIdAula, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jTextCantAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(203, 203, 203))))
                            .addGap(35, 35, 35)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jButtonNominaAula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextIdAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButtonIni)
                    .addComponent(jRadioButtonPrim)
                    .addComponent(jRadioButtonSecun))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jTextCantAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButtonNominaAula)
                .addGap(32, 32, 32))
        );

        jLabel12.setBackground(new java.awt.Color(204, 204, 255));
        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Datos de Aula");
        jLabel12.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setBackground(new java.awt.Color(204, 204, 255));
        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Lista de Aulas");
        jLabel13.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(511, 511, 511)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCantidadAula, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldCantidadAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAulasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAulasMouseClicked
        int fila = this.jTableAulas.getSelectedRow();
        int pos = Colegio.existeBuscarAula(this.jTableAulas.getValueAt(fila, 0).toString());
        
        mostrarCasilla(pos);
    }//GEN-LAST:event_jTableAulasMouseClicked

    private void mostrarCasilla(int pos){
        String nivel;
        nivel=Colegio.listaAula[pos].getNivel();
        this.jTextIdAula.setText(Colegio.listaAula[pos].getCodigo());
        if(nivel.equals("Inicial")){
            jRadioButtonIni.setSelected(true);
        }else if(nivel.equals("Secundaria")){
            jRadioButtonSecun.setSelected(true);
        }else{
            jRadioButtonPrim.setSelected(true);
        }
        this.jTextFieldGrado.setText(Colegio.listaAula[pos].getGrado());
        this.jTextFieldSeccion.setText(Colegio.listaAula[pos].getSeccion());
        //Tutor
        String idP = Colegio.listaAula[pos].getTutor();
        int posT = Colegio.existeBuscarProf(idP);
        this.jTextFieldTutor.setText(Colegio.listaProf[posT].getNombre() + " " + Colegio.listaProf[posT].getApellido());
        this.jTextCantAlu.setText(String.valueOf(Colegio.listaAula[pos].getCantidadAlumno()));
    }
    
    private void jTextFieldCantidadAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadAulaActionPerformed
        
    }//GEN-LAST:event_jTextFieldCantidadAulaActionPerformed

    private void jRadioButtonPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPrimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonPrimActionPerformed

    private void jRadioButtonIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonIniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonIniActionPerformed

    
    public void mostrarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nivel");
        modelo.addColumn("Grado");
        modelo.addColumn("Sección");
        modelo.addColumn("Tutor");
        
        //Extraemos las aulas en las que enseña el profesor
        String aulas[] = Colegio.listaProf[posP].aulaProf();
        int cantidadAula = aulas.length;
        int posA;
        String idP;
        int posT;
        jTableAulas.setModel(modelo);
        
         String datos[] = new String[5];
         
         for(int i=0;i<cantidadAula;i++){
            posA = Colegio.existeBuscarAula(aulas[i]);
            datos[0]= Colegio.listaAula[posA].getCodigo();
            datos[1]=Colegio.listaAula[posA].getNivel();
            datos[2]=Colegio.listaAula[posA].getGrado();
            datos[3]=Colegio.listaAula[posA].getSeccion();
            idP = Colegio.listaAula[i].getTutor();
            posT = Colegio.existeBuscarProf(idP);
            datos[4]=Colegio.listaProf[posT].getNombre() + " " + Colegio.listaProf[posT].getApellido();
            modelo.addRow(datos);  
        }      
    }
    
    private void jTextIdAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdAulaActionPerformed

    }//GEN-LAST:event_jTextIdAulaActionPerformed

    private void jButtonNominaAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNominaAulaActionPerformed
        Colegio.idAulaSelect = jTextIdAula.getText();
        
        if(Colegio.idAulaSelect.isEmpty()){
            JOptionPane.showMessageDialog(null, "Aula no seleccionada");
        }else{
                //Se puede ingresar para corregir
               Frame MainMenuAdm = null;
               VerNomina aA = new VerNomina(MainMenuAdm, true);
                       aA.setVisible(true);
                       aA.setResizable(false);
            }
    }//GEN-LAST:event_jButtonNominaAulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupNivel;
    private javax.swing.JButton jButtonNominaAula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonIni;
    private javax.swing.JRadioButton jRadioButtonPrim;
    private javax.swing.JRadioButton jRadioButtonSecun;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAulas;
    private javax.swing.JTextField jTextCantAlu;
    private javax.swing.JTextField jTextFieldCantidadAula;
    private javax.swing.JTextField jTextFieldGrado;
    private javax.swing.JTextField jTextFieldSeccion;
    private javax.swing.JTextField jTextFieldTutor;
    private javax.swing.JTextField jTextIdAula;
    // End of variables declaration//GEN-END:variables

    

}
