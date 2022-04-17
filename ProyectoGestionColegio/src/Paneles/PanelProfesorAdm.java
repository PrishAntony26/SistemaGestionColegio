/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Conexion.BD_Profesor;

import Clases.*;
import Form.*;
import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fiore
 */
public class PanelProfesorAdm extends javax.swing.JPanel {

    private BD_Profesor bdProfesor = new BD_Profesor();
    int cant;
    /**
     * Creates new form PanelProfesorAdm
     */
    
    public PanelProfesorAdm() {
        initComponents();
        jTextIdPro.setEditable(true);
        jTextFieldCantidadPro.setEditable(false);
        limpiar();
        mostrarTabla();
    }

        private void limpiar(){      
            jTextFieldCantidadPro.setText(cant+"");
            jTextIdPro.setText("");
            jTextApellidoPro.setText("");
            jTextNombrePro.setText("");
            jTextDireccionPro.setText("");
            jTextDniPro.setText(""); 
    }
    
    public void mostrarTabla(){
        int cantidadProf= Colegio.listaProf.length;
        DefaultTableModel modelo = new DefaultTableModel();
        Profesor listaProf[] = bdProfesor.obtenerProfesores();
        modelo.addColumn("Id");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Nombres");
        modelo.addColumn("DNI");
        modelo.addColumn("Direccion");
        modelo.addColumn("Genero");
        //modelo.addColumn("Celular");
        jTableProfesores.setModel(modelo);
        
         String datos[] = new String[6];
        
         for(cant=0;cant<listaProf.length;cant++){
            String cad = listaProf[cant].getCodigo();
            datos[0]= cad;
            cad = listaProf[cant].getApellido();
            datos[1]= cad;
            cad = listaProf[cant].getNombre();
            datos[2]= cad;
            cad = listaProf[cant].getDni();
            datos[3]= cad;
            cad = listaProf[cant].getDomicilio();
            datos[4]= cad;
            cad = listaProf[cant].getGenero();
            datos[5]= cad;
            //datos[5]=Colegio.listaProf[i].getCelular();
            modelo.addRow(datos);            
        }
         jTextFieldCantidadPro.setText(cant+"");
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGenero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProfesores = new javax.swing.JTable();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldBuscarPro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCantidadPro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextDireccionPro = new javax.swing.JTextField();
        jTextIdPro = new javax.swing.JTextField();
        jTextApellidoPro = new javax.swing.JTextField();
        jTextNombrePro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonActualizarPro = new javax.swing.JButton();
        jButtonAgregarPro = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextDniPro = new javax.swing.JTextField();
        jRadioButtonFemenino = new javax.swing.JRadioButton();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jSpinnerDiaNac = new javax.swing.JSpinner();
        jSpinnerMesNac = new javax.swing.JSpinner();
        jSpinnerAnioNac = new javax.swing.JSpinner();
        jButtonEliminarPro = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButtonVerHorarioPro = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTableProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableProfesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProfesoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableProfesores);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel10.setText("Cantidad");

        jTextFieldCantidadPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadProActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(204, 204, 255));
        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Lista de Profesores Contratados");
        jLabel13.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jButtonBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBuscarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCantidadPro, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jTextFieldBuscarPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldCantidadPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jPanel4.setBackground(new java.awt.Color(245, 244, 244));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setName(""); // NOI18N

        jLabel1.setText("id Profesor");

        jLabel2.setText("Nombres");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Genero");

        jLabel5.setText("Direccion");

        jLabel6.setText("Dia ");

        jLabel7.setText("Mes ");

        jLabel8.setText("Año ");

        jTextApellidoPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextApellidoProActionPerformed(evt);
            }
        });

        jLabel9.setText("Nacimiento");

        jButtonActualizarPro.setText("Actualizar");
        jButtonActualizarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarProActionPerformed(evt);
            }
        });

        jButtonAgregarPro.setText("Agregar");
        jButtonAgregarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarProActionPerformed(evt);
            }
        });

        jLabel11.setText("DNI");

        buttonGroupGenero.add(jRadioButtonFemenino);
        jRadioButtonFemenino.setText("Femenino");
        jRadioButtonFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemeninoActionPerformed(evt);
            }
        });

        buttonGroupGenero.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setText("Masculino");

        jSpinnerDiaNac.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jSpinnerMesNac.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jSpinnerAnioNac.setModel(new javax.swing.SpinnerNumberModel(1900, 1900, 2000, 1));

        jButtonEliminarPro.setText("Eliminar");
        jButtonEliminarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarProActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(204, 204, 255));
        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Datos del Profesor");
        jLabel12.setOpaque(true);

        jButtonVerHorarioPro.setText("Ver Horario");
        jButtonVerHorarioPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerHorarioProActionPerformed(evt);
            }
        });

        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reload-3x.png"))); // NOI18N
        jButtonLimpiar.setBorder(null);
        jButtonLimpiar.setContentAreaFilled(false);
        jButtonLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDniPro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDireccionPro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNombrePro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextApellidoPro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jRadioButtonFemenino)
                                .addGap(31, 31, 31)
                                .addComponent(jRadioButtonMasculino))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinnerDiaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerMesNac, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinnerAnioNac, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButtonAgregarPro)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVerHorarioPro)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButtonActualizarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jButtonEliminarPro)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLimpiar)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextApellidoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextDniPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel11)))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonFemenino)
                    .addComponent(jRadioButtonMasculino)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextDireccionPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5)))
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jSpinnerDiaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerMesNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerAnioNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregarPro)
                    .addComponent(jButtonActualizarPro)
                    .addComponent(jButtonEliminarPro))
                .addGap(18, 18, 18)
                .addComponent(jButtonVerHorarioPro)
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(97, 97, 97))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableProfesoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProfesoresMouseClicked
        int fila = this.jTableProfesores.getSelectedRow();
        String genero;
        String IdProfesor = this.jTableProfesores.getValueAt(fila, 0).toString();
        //int pos = Colegio.existeBuscarProf(id);
        int pos = bdProfesor.buscarPosicion(IdProfesor);
        Profesor listaProf[] = bdProfesor.obtenerProfesores();
        this.jTextIdPro.setText(IdProfesor);
        this.jTextApellidoPro.setText(listaProf[pos].getApellido());
        this.jTextNombrePro.setText(listaProf[pos].getNombre());
        this.jTextDniPro.setText(listaProf[pos].getDni());
        genero = listaProf[pos].getGenero();
        if(genero.equals("F")){
            jRadioButtonFemenino.setSelected(true);
        }else{
            jRadioButtonMasculino.setSelected(true);
        }           

        this.jSpinnerDiaNac.setValue(listaProf[pos].getDiaNac());
        this.jSpinnerMesNac.setValue(listaProf[pos].getMesNac());
        this.jSpinnerAnioNac.setValue(listaProf[pos].getAnioNac());
        
        //this.jTextCelularPro.setText(listaProf[pos].getCelular());
        this.jTextDireccionPro.setText(listaProf[pos].getDomicilio()); 
        
    }//GEN-LAST:event_jTableProfesoresMouseClicked

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if (!jTextFieldBuscarPro.getText().isEmpty()){
            String genero;
            String idB = jTextFieldBuscarPro.getText();
            int pos = Colegio.existeBuscarProf(idB);
            Profesor listaProf[] = bdProfesor.obtenerProfesores();
            if(pos>=0){
                this.jTextIdPro.setText(listaProf[pos].getCodigo());
                this.jTextApellidoPro.setText(listaProf[pos].getApellido());
                this.jTextNombrePro.setText(listaProf[pos].getNombre());
                this.jTextDniPro.setText(listaProf[pos].getDni());
                genero = listaProf[pos].getGenero();
                if(genero.equals("F")){
                    jRadioButtonFemenino.setSelected(true);
                }else{
                    jRadioButtonMasculino.setSelected(true);
                }
                this.jTextDireccionPro.setText(listaProf[pos].getDomicilio());
                
                this.jSpinnerDiaNac.setValue(listaProf[pos].getDiaNac());
                this.jSpinnerMesNac.setValue(listaProf[pos].getMesNac());
                this.jSpinnerAnioNac.setValue(listaProf[pos].getAnioNac());
                //this.jTextCelularPro.setText(listaProf[pos].getCelular());
            }else{
                JOptionPane.showMessageDialog(null, "Profesor con id " + idB + " NO encontrado" );
            }
        }else{
            JOptionPane.showMessageDialog(null, "Espacio Vacio");
        }

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldCantidadProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadProActionPerformed

    private void jTextApellidoProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextApellidoProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextApellidoProActionPerformed

    private void jButtonActualizarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarProActionPerformed
        if (!jTextNombrePro.getText().isEmpty() && !jTextApellidoPro.getText().isEmpty()
            && !jTextDniPro.getText().isEmpty() && !jTextDireccionPro.getText().isEmpty() 
                && (jRadioButtonFemenino.isSelected()||jRadioButtonMasculino.isSelected())){
            int dia, mes, anio;
            //int pos = Colegio.existeBuscarProf(jTextIdPro.getText());
            int v = bdProfesor.existeCodigo(jTextIdPro.getText());
            if(v<0){
                JOptionPane.showMessageDialog(null,"Debe ingresar un codigo valido ");
            }else{
                Profesor profe = new Profesor();
                profe.setCodigo(jTextIdPro.getText());
                profe.setNombre(jTextNombrePro.getText());
                profe.setApellido(jTextApellidoPro.getText());
                profe.setDomicilio(jTextDireccionPro.getText());
                profe.setDni(jTextDniPro.getText());
                if(jRadioButtonFemenino.isSelected()){
                    profe.setGenero("F"+"");
                }else{
                    if(jRadioButtonMasculino.isSelected()){
                        profe.setGenero("M"+"");
                    }
                }
                bdProfesor.actualizarProfesor(profe);
            }
            /*
            Colegio.listaProf[pos].setApellido(jTextApellidoPro.getText());
            Colegio.listaProf[pos].setNombre(jTextNombrePro.getText());
            try{
                int dni=Integer.parseInt(jTextDniPro.getText());
                Colegio.listaProf[pos].setDni(jTextDniPro.getText());
                //Validar numero de DNI Cantidad de dígitos
                Colegio.listaProf[pos].setDomicilio(jTextDireccionPro.getText());
                dia = Integer.parseInt(jSpinnerDiaNac.getValue().toString());
                Colegio.listaProf[pos].setDiaNac(dia);

                mes = Integer.parseInt(jSpinnerMesNac.getValue().toString());
                Colegio.listaProf[pos].setMesNac(mes);

                anio = Integer.parseInt(jSpinnerAnioNac.getValue().toString());
                Colegio.listaProf[pos].setAnioNac(anio);

                if(jRadioButtonFemenino.isSelected()){
                    Colegio.listaProf[pos].setGenero("Femenino");
                }else{
                    if(jRadioButtonMasculino.isSelected()){
                        Colegio.listaProf[pos].setGenero("Masculino");
                    }
                }
                int cell=Integer.parseInt(jTextCelularPro.getText());
                Colegio.listaProf[pos].setCelular(jTextCelularPro.getText());
                JOptionPane.showMessageDialog(null, "Datos Modificados satisfactoriamente");
                mostrarTabla();
                limpiar();
                GestorArchivos.actualizaFicheroProfesor();
            }catch(NumberFormatException ev){
                JOptionPane.showMessageDialog(null, "Ingrese formato valido en DNI o celular");
            }*/
        }else{
            JOptionPane.showMessageDialog(null, "Faltan Datos");
        }
        mostrarTabla();
    }//GEN-LAST:event_jButtonActualizarProActionPerformed

    private void jButtonAgregarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarProActionPerformed
        // Boton que agrega Profesores
        Profesor p = new Profesor();
        int dia,mes,anio, idN;
        String id;
        if (!jTextNombrePro.getText().isEmpty() && !jTextApellidoPro.getText().isEmpty()
            && !jTextDniPro.getText().isEmpty() && !jTextDireccionPro.getText().isEmpty()
                && (jRadioButtonFemenino.isSelected()||jRadioButtonMasculino.isSelected())){
            id = jTextIdPro.getText();
            //int pos= Colegio.existeBuscarProf(id);
            int pos = bdProfesor.existeCodigo(id);
            if(pos<0){
                p.setCodigo(jTextIdPro.getText());
                p.setNombre(jTextNombrePro.getText());

                p.setApellido(jTextApellidoPro.getText());
                try{
                    int dni=Integer.parseInt(jTextDniPro.getText());
                    p.setDni(jTextDniPro.getText());
                    //Validar numero de DNI Cantidad de dígitos
                    p.setDomicilio(jTextDireccionPro.getText());
                    dia = Integer.parseInt(jSpinnerDiaNac.getValue().toString());
                    p.setDiaNac(dia);

                    mes = Integer.parseInt(jSpinnerMesNac.getValue().toString());
                    p.setMesNac(mes);

                    anio = Integer.parseInt(jSpinnerAnioNac.getValue().toString());
                    p.setAnioNac(anio);

                    if(jRadioButtonFemenino.isSelected()){
                        p.setGenero("F"+"");
                    }else{
                        if(jRadioButtonMasculino.isSelected()){
                            p.setGenero("M"+"");
                        }
                    }
                    //Colegio.agregarProfesor(p);
                    bdProfesor.ingresarProfesor(p);
                    JOptionPane.showMessageDialog(null, "Profesor contratado correctamente");
                    mostrarTabla();
                    limpiar();
                }catch(NumberFormatException ev){
                    JOptionPane.showMessageDialog(null, "Ingrese formato válido en DNI o celular...!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Id ya existente");
            }    
                
                

        }else{
            JOptionPane.showMessageDialog(null, "Faltan Datos");
        }
    }//GEN-LAST:event_jButtonAgregarProActionPerformed

    private void jRadioButtonFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFemeninoActionPerformed

    private void jButtonEliminarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarProActionPerformed
        if (!jTextIdPro.getText().isEmpty()){
            String cod = jTextIdPro.getText();
            int v = bdProfesor.existeCodigo(cod);
            //int v = Colegio.existeBuscarProf(cod);
            
            if(v<0){
                JOptionPane.showMessageDialog(null, "Profesor No existe");
            }else{
                
                //Colegio.eliminarHorAProfDesp(cod);
                //Colegio.eliminarProfesor(cod);
                bdProfesor.eliminarProfesor(cod);
                JOptionPane.showMessageDialog(null, "Profesor Eliminado");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Profesor no seleccionado");
        }

        mostrarTabla();
        limpiar();
        
    }//GEN-LAST:event_jButtonEliminarProActionPerformed

    private void jButtonVerHorarioProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerHorarioProActionPerformed
         //Aquí pondré el horario del profe
        Colegio.idProfeIniciado=jTextIdPro.getText();
        if(!jTextIdPro.getText().equalsIgnoreCase("")){
            for(int i=0;i<Colegio.listaProf.length;i++){
                if(jTextIdPro.getText().equalsIgnoreCase(Colegio.listaProf[i].getCodigo())){
                    Frame MainMenuAdm = null;
                    new MostrarHorarioProfesor(MainMenuAdm, true).setVisible(true);                    
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un profesor");
        }
    }//GEN-LAST:event_jButtonVerHorarioProActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGenero;
    private javax.swing.JButton jButtonActualizarPro;
    private javax.swing.JButton jButtonAgregarPro;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminarPro;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonVerHorarioPro;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonFemenino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerAnioNac;
    private javax.swing.JSpinner jSpinnerDiaNac;
    private javax.swing.JSpinner jSpinnerMesNac;
    private javax.swing.JTable jTableProfesores;
    private javax.swing.JTextField jTextApellidoPro;
    private javax.swing.JTextField jTextDireccionPro;
    private javax.swing.JTextField jTextDniPro;
    private javax.swing.JTextField jTextFieldBuscarPro;
    private javax.swing.JTextField jTextFieldCantidadPro;
    private javax.swing.JTextField jTextIdPro;
    private javax.swing.JTextField jTextNombrePro;
    // End of variables declaration//GEN-END:variables
}
