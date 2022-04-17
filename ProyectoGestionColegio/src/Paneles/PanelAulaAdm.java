/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Conexion.BD_Aula;
import Clases.*;
import Conexion.BD_Alumno;
import Conexion.BD_Profesor;
import Form.*;
import java.awt.Frame;
import java.util.StringTokenizer;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**s
 *
 * @author jhona
 */
public class PanelAulaAdm extends javax.swing.JPanel {
    
    private BD_Aula bdAula = new BD_Aula();
    private BD_Profesor bdProfesor = new BD_Profesor();
    static int num = 0;
    /**
     * Creates new form PanelAulaAdm
     */
    public PanelAulaAdm() {
        initComponents();
        limpiar();
        jTextIdAula.setEditable(false);
        jTextTutor.setEditable(false);
        jTextFieldCantidadAula.setEditable(false);
        jTextCantAlu.setEditable(false);
        mostrarTabla();
        mostrarTablaProf();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupNivel = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAulas = new javax.swing.JTable();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldBuscarAula = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCantidadAula = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextAforo = new javax.swing.JTextField();
        jTextIdAula = new javax.swing.JTextField();
        jButtonAgregarAula = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioButtonIni = new javax.swing.JRadioButton();
        jRadioButtonPrim = new javax.swing.JRadioButton();
        jRadioButtonSecun = new javax.swing.JRadioButton();
        jButtonVerHorarioAula = new javax.swing.JButton();
        jButtonAgregarAlumnos = new javax.swing.JButton();
        jButtonCrearHorarioAula = new javax.swing.JButton();
        jButtonNominaAula = new javax.swing.JButton();
        jTextFieldSeccion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextCantAlu = new javax.swing.JTextField();
        jComboBoxGrado = new javax.swing.JComboBox();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jTextTutor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProf = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();

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

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/magnifying-glass-3x.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel10.setText("Cantidad");

        jTextFieldCantidadAula.setEditable(false);
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

        jLabel5.setText("Aforo Máximo");

        jTextIdAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdAulaActionPerformed(evt);
            }
        });

        jButtonAgregarAula.setText("Agregar");
        jButtonAgregarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarAulaActionPerformed(evt);
            }
        });

        jLabel11.setText("Sección");

        buttonGroupNivel.add(jRadioButtonIni);
        jRadioButtonIni.setText("Inicial");
        jRadioButtonIni.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonIniItemStateChanged(evt);
            }
        });
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
        jRadioButtonSecun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSecunActionPerformed(evt);
            }
        });

        jButtonVerHorarioAula.setText("Ver Horario");
        jButtonVerHorarioAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerHorarioAulaActionPerformed(evt);
            }
        });

        jButtonAgregarAlumnos.setText("Agregar Alumnos");
        jButtonAgregarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarAlumnosActionPerformed(evt);
            }
        });

        jButtonCrearHorarioAula.setText("Crear Horario");
        jButtonCrearHorarioAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearHorarioAulaActionPerformed(evt);
            }
        });

        jButtonNominaAula.setText("Mostrar Nómina");
        jButtonNominaAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNominaAulaActionPerformed(evt);
            }
        });

        jTextFieldSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSeccionActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(204, 204, 255));
        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Datos de Aula");
        jLabel12.setOpaque(true);

        jLabel6.setText("Cantidad de Alumnos");

        jComboBoxGrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Grado" }));
        jComboBoxGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGradoActionPerformed(evt);
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

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jTextTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jButtonLimpiar)
                                        .addGap(35, 35, 35))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextAforo, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                                .addComponent(jTextCantAlu, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                                            .addComponent(jTextFieldSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(107, 107, 107))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextIdAula, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButtonIni)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonPrim)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonSecun)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAgregarAlumnos)
                            .addComponent(jButtonAgregarAula))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCrearHorarioAula, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonVerHorarioAula, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonNominaAula)
                            .addComponent(jButtonActualizar))
                        .addGap(22, 22, 22))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
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
                    .addComponent(jComboBoxGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextAforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCantAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregarAula)
                    .addComponent(jButtonVerHorarioAula)
                    .addComponent(jButtonActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregarAlumnos)
                    .addComponent(jButtonCrearHorarioAula)
                    .addComponent(jButtonNominaAula))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jLabel13.setBackground(new java.awt.Color(204, 204, 255));
        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Lista de Aulas Existentes");
        jLabel13.setOpaque(true);

        jTableProf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableProf.getTableHeader().setResizingAllowed(false);
        jTableProf.getTableHeader().setReorderingAllowed(false);
        jTableProf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProfMouseClicked(evt);
            }
        });
        jTableProf.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jTableProfComponentHidden(evt);
            }
        });
        jScrollPane3.setViewportView(jTableProf);

        jLabel14.setBackground(new java.awt.Color(204, 204, 255));
        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Profesores Disponibles para Tutoría");
        jLabel14.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(jButtonBuscar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldBuscarAula, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(106, 106, 106)
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldCantidadAula, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jTextFieldBuscarAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldCantidadAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAulasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAulasMouseClicked
        int fila = this.jTableAulas.getSelectedRow();
        int pos = Colegio.existeBuscarAula(this.jTableAulas.getValueAt(fila, 0).toString());
        
        mostrarCasilla(pos);
    }//GEN-LAST:event_jTableAulasMouseClicked

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if (!jTextFieldBuscarAula.getText().isEmpty()){
            String idB = jTextFieldBuscarAula.getText();
            int pos = Colegio.existeBuscarAula(idB);  
            
            if(pos>=0){
              mostrarCasilla(pos);  
            }else{
                JOptionPane.showMessageDialog(null, "Aula con id " + idB + " no encontrada" );
            }
        }else{
            JOptionPane.showMessageDialog(null, "Espacio Vacio");
        }  
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private int cantidadAlusenAula(){
        int num=0;
        BD_Aula bdAula = new BD_Aula(); 
        BD_Alumno bdAlumno = new BD_Alumno();
        Aula listaAula[] = bdAula.obtenerAulas();
        Alumno listaAlu[] = bdAlumno.obtenerAlumnos();
        
        String codeAula = jTextIdAula.getText();        

        int cant=0;
        while(listaAlu[cant]!=null){
            if(listaAlu[cant].getCodA()!=null){
                if(listaAlu[cant].getCodA().equals(codeAula)){
                    num++;
                }
            }
            cant++;
        }
        return num;
    }
    
    
    private void mostrarCasilla(int pos){
        String nivel;
        String item;
        
        jTextFieldSeccion.setEditable(false);
        
        nivel=Colegio.listaAula[pos].getNivel();
        this.jTextIdAula.setText(Colegio.listaAula[pos].getCodigo());
        if(nivel.equals("Inicial")){
            jRadioButtonIni.setSelected(true);
        }else if(nivel.equals("Secundaria")){
            jRadioButtonSecun.setSelected(true);
        }else{
            jRadioButtonPrim.setSelected(true);
        }
        this.jComboBoxGrado.removeAllItems();
        this.jComboBoxGrado.addItem(Colegio.listaAula[pos].getGrado());
        this.jTextFieldSeccion.setText(Colegio.listaAula[pos].getSeccion());
        
        this.jTextAforo.setText(Colegio.listaAula[pos].getAforo());
        this.jTextCantAlu.setText(cantidadAlusenAula()+"");
        String tut = Colegio.listaAula[pos].getTutor();
        int pP = Colegio.existeBuscarProf(tut);
        if(pP!=-1){
            this.jTextTutor.setText(Colegio.listaProf[pP].getCodigo() + " " + Colegio.listaProf[pP].getApellido() + " " + Colegio.listaProf[pP].getNombre()); 
        }    
    }
    
    private void jTextFieldCantidadAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadAulaActionPerformed

    private void jRadioButtonPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPrimActionPerformed
        jComboBoxGrado.removeAllItems();
        jComboBoxGrado.addItem("Seleccione Grado");
        jComboBoxGrado.addItem("1");
        jComboBoxGrado.addItem("2");
        jComboBoxGrado.addItem("3");
        jComboBoxGrado.addItem("4");
        jComboBoxGrado.addItem("5");
        jComboBoxGrado.addItem("6");
    }//GEN-LAST:event_jRadioButtonPrimActionPerformed

    private void jRadioButtonIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonIniActionPerformed
        jComboBoxGrado.removeAllItems();
        jComboBoxGrado.addItem("Seleccione Grado");
        jComboBoxGrado.addItem("3");
        jComboBoxGrado.addItem("4");
        jComboBoxGrado.addItem("5");
    }//GEN-LAST:event_jRadioButtonIniActionPerformed

    private void limpiar(){
        String cant = String.valueOf(Colegio.listaAula.length);
        jTextFieldSeccion.setEditable(true);
        jTextFieldCantidadAula.setText(cant);
        jTextIdAula.setText("");
        jTextTutor.setText("");
        jTextAforo.setText("");
        jComboBoxGrado.setSelectedIndex(0);
        jTextFieldSeccion.setText("");
        jTextCantAlu.setText("0");  
    }
    
    public void mostrarTabla(){
  
        DefaultTableModel modelo = new DefaultTableModel();
        Aula listaAula[] = bdAula.obtenerAulas();
        modelo.addColumn("ID");
        modelo.addColumn("Nivel");
        modelo.addColumn("Grado");
        modelo.addColumn("Sección");
        modelo.addColumn("Tutor");
        modelo.addColumn("Aforo");
        
        jTableAulas.setModel(modelo);
        
        String datos[] = new String[6];
         
         for(int i=0;i<listaAula.length;i++){
            datos[0]= listaAula[i].getCodigo();
            datos[1]=listaAula[i].getNivel();
            datos[2]=listaAula[i].getGrado();
            datos[3]=listaAula[i].getSeccion();
            datos[4]=listaAula[i].getTutor();
            datos[5]=listaAula[i].getAforo();
            modelo.addRow(datos);  
        }      
    }
    
    public void mostrarTablaProf(){
        DefaultTableModel modelo = new DefaultTableModel();
        boolean estutor = false;
        int j=0;
        Profesor listaProf[] = bdProfesor.obtenerProfesores();
        Aula listaAula[] = bdAula.obtenerAulas();
        modelo.addColumn("Id");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Nombres");
        modelo.addColumn("DNI");
        modelo.addColumn("Direccion");
        modelo.addColumn("Genero");
        //modelo.addColumn("Celular");
        jTableProf.setModel(modelo);
        
        String datos[] = new String[6];
        for(int i=0;i<listaProf.length;i++){
           String cad = listaProf[i].getCodigo();
           datos[0]= cad;
           cad = listaProf[i].getApellido();
           datos[1]= cad;
           cad = listaProf[i].getNombre();
           datos[2]= cad;
           cad = listaProf[i].getDni();
           datos[3]= cad;
           cad = listaProf[i].getDomicilio();
           datos[4]= cad;
           cad = listaProf[i].getGenero();
           datos[5]= cad;
           estutor=false;
           j=0;
           while(!estutor && j<listaAula.length){
               System.out.println(estutor);
               System.out.println(listaAula[j].getTutor());
               System.out.println(datos[0]);
               if(listaAula[j].getTutor().equals(datos[0])){
                   estutor=true;
               }
               j++;
           }
           //datos[5]=Colegio.listaProf[i].getCelular();
           if(!estutor){
               modelo.addRow(datos);  
           }    
        }
    }
    
    private void jButtonAgregarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarAulaActionPerformed
        // Boton que agrega aulas
        if ((jRadioButtonIni.isSelected()||jRadioButtonSecun.isSelected()||jRadioButtonPrim.isSelected())
            && !jTextTutor.getText().isEmpty() && !jComboBoxGrado.equals("Seleccione Grado")  &&!jTextAforo.getText().isEmpty()){
            
            //int pos = Colegio.existeBuscarAula(jTextIdAula.getText());
            int pos = bdAula.existeCodigo(jTextIdAula.getText());
            if(pos<0){
                //AULA NUEVA
                    Aula a = new Aula();
                    char nivel='I';
                    //Botón del nivel
                    if(jRadioButtonIni.isSelected()){
                        a.setNivel("Inicial");
                        nivel='I';
                    }else if(jRadioButtonSecun.isSelected()){
                        a.setNivel("Secundaria");
                        nivel='S';
                    }else if(jRadioButtonPrim.isSelected()){
                        a.setNivel("Primaria");
                        nivel='P';
                    }
                    //JTextField del Grado
                    a.setGrado(jComboBoxGrado.getSelectedItem().toString());
                    String grado=jComboBoxGrado.getSelectedItem().toString();            
                    //JTextField de la Sección
                    a.setSeccion(jTextFieldSeccion.getText());
                    String seccion=jTextFieldSeccion.getText();
                    String id=nivel+grado+seccion;
                    //El ID 
                    a.setAforo(jTextAforo.getText());
                    a.setCodigo(id);
                    //BUSCAR AL TUTOR
                    Profesor profesores[] = bdProfesor.obtenerProfesores();
                    StringTokenizer token = new StringTokenizer(jTextTutor.getText(), " ");  
                    String tok = token.nextToken();
                    int exist = bdProfesor.existeCodigo(tok);
                    if(exist!=-1){
                         //TUTOR EXISTE
                         a.setTutor(tok);
                         if(bdAula.ingresarAula(a)){
                            JOptionPane.showMessageDialog(null,"Aula ingresada correctamente..!!");
                         }else{
                            JOptionPane.showMessageDialog(null,"Un profesor no puede ser tutor de dos aulas o mas ");
                         }
                         mostrarTabla();
                    }else{
                        JOptionPane.showMessageDialog(null,"Tutor no existe debe registrarlo en la seccion 'Registrar profesor'");
                    }
                    /*
                    pos = Colegio.existeBuscarAula(id);
                    if(pos<0){
                        StringTokenizer tokens=new StringTokenizer(jTextTutor.getText().toString()," ");
                         int nDatos=tokens.countTokens();
                         String[] datos=new String[nDatos];
                         int i=0;
                         while(tokens.hasMoreTokens()){
                             datos[i]=tokens.nextToken();
                             i++;}
                         String idProfe = datos[0];
                         
                        //INGRESAR PROFESOR
                        a.setTutor(idProfe);  
                        try{
                        //JTextField de el Aforo
                            int af=Integer.parseInt(jTextAforo.getText());
                            a.setAforo(jTextAforo.getText());
                            //Ver Aula
                            Colegio.agregarAula(a);
                            JOptionPane.showMessageDialog(null, "Aula registrada exitosamente");
                            mostrarTabla();
                            mostrarTablaProf();
                            limpiar(); 
                        }catch(NumberFormatException ev){
                            JOptionPane.showMessageDialog(null,"Ingrese un aforo en números..!!");
                        }
                    }else{
                JOptionPane.showMessageDialog(null, "Aula ya existe");
                }*/
            }else{
                JOptionPane.showMessageDialog(null, "Aula ya existe");
            }

        }else{
            JOptionPane.showMessageDialog(null, "Faltan Datos");
        }
    }//GEN-LAST:event_jButtonAgregarAulaActionPerformed

    private void jTextIdAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdAulaActionPerformed

    }//GEN-LAST:event_jTextIdAulaActionPerformed

    private void jButtonVerHorarioAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerHorarioAulaActionPerformed
        //Aquí pondremos la cosa para mostrar el horario del aula xd
        //Crear una tabla dinámica 
        Colegio.idAulaSelect = jTextIdAula.getText();
        if(Colegio.idAulaSelect.isEmpty()){
            JOptionPane.showMessageDialog(null, "Aula no seleccionada");
        }else{
               Frame MainMenuAdm = null;
               new MostrarHorarioAula(MainMenuAdm,true).setVisible(true);
            }
    }//GEN-LAST:event_jButtonVerHorarioAulaActionPerformed

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

    private void jButtonCrearHorarioAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearHorarioAulaActionPerformed
        Colegio.idAulaSelect=jTextIdAula.getText();
        if(!jTextIdAula.getText().equalsIgnoreCase("")){
            for(int i=0;i<Colegio.listaAula.length;i++){
                if(jTextIdAula.getText().equalsIgnoreCase(Colegio.listaAula[i].getCodigo())){
                    Frame MainMenuAdm = null;
                    char nivel=jTextIdAula.getText().charAt(0);
                    if(nivel=='P'){
                        new CrearHorarioAulaP(MainMenuAdm, true).setVisible(true);
                    }else if(nivel=='S'){
                        new CrearHorarioAulaS(MainMenuAdm,true).setVisible(true);
                    }else if(nivel=='I'){
                        new CrearHorarioAulaI(MainMenuAdm,true).setVisible(true);
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un aula");
        }
    }//GEN-LAST:event_jButtonCrearHorarioAulaActionPerformed

    private void jButtonAgregarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarAlumnosActionPerformed
    //
        Colegio.idAulaSelect = jTextIdAula.getText();
        
        if(Colegio.idAulaSelect.isEmpty()){
            JOptionPane.showMessageDialog(null, "Aula no seleccionada");
        }else{
            int can=Integer.parseInt(jTextCantAlu.getText()); 
            int af=Integer.parseInt(jTextAforo.getText());
            if(can==af){
              JOptionPane.showMessageDialog(null, "Aula llena");
            }
               limpiar();
               //Se puede ingresar para corregir
               Frame MainMenuAdm = null;
               AgregarAluAula aA = new AgregarAluAula(MainMenuAdm, true);
                       aA.setVisible(true);
                       aA.setResizable(false);
            }        
    }//GEN-LAST:event_jButtonAgregarAlumnosActionPerformed

    private void jRadioButtonIniItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonIniItemStateChanged
        
    }//GEN-LAST:event_jRadioButtonIniItemStateChanged

    private void jRadioButtonSecunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSecunActionPerformed
        jComboBoxGrado.removeAllItems();
        jComboBoxGrado.addItem("Seleccione Grado");
        jComboBoxGrado.addItem("1");
        jComboBoxGrado.addItem("2");
        jComboBoxGrado.addItem("3");
        jComboBoxGrado.addItem("4");
        jComboBoxGrado.addItem("5");
    }//GEN-LAST:event_jRadioButtonSecunActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jTableProfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProfMouseClicked
        int fila = this.jTableProf.getSelectedRow();
        String pro = this.jTableProf.getValueAt(fila, 0).toString();
        String nomPro = this.jTableProf.getValueAt(fila, 2).toString();
        String apPro = this.jTableProf.getValueAt(fila, 1).toString();
                
        jTextTutor.setText(pro + " " + apPro + " " + nomPro);
        
    }//GEN-LAST:event_jTableProfMouseClicked

    private void jTableProfComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableProfComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableProfComponentHidden

    private void jComboBoxGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGradoActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        Aula a= new Aula();
        if(!jTextIdAula.getText().isEmpty()){
            if (!jTextAforo.getText().isEmpty()){
                try{
                    int pos = Colegio.existeBuscarAula(jTextIdAula.getText());     
                    int af = Integer.parseInt(jTextAforo.getText());
                    int cAlu = Integer.parseInt(jTextCantAlu.getText());
                    if(af>=cAlu){
                        a.setAforo(jTextAforo.getText());
                        if(!jTextTutor.getText().isEmpty()){
                            StringTokenizer tokens=new StringTokenizer(jTextTutor.getText().toString()," ");
                            int nDatos=tokens.countTokens();
                            String[] datos=new String[nDatos];
                            int i=0;
                            while(tokens.hasMoreTokens()){
                                datos[i]=tokens.nextToken();
                                i++;
                            }
                            a.setTutor(datos[0]);
                        }
                        //INGRESAR PROFESOR
                        //Colegio.listaAula[pos].setTutor(idProfe);
                        //JTextField de el Aforo
                        //a.setGrado(jComboBoxGrado.getSelectedItem().toString());
                        a.setCodigo(jTextIdAula.getText());
                        limpiar();
                        bdAula.actualizarAula(a);
                        mostrarTabla();
                        mostrarTablaProf();
                        //GestorArchivos.actualizaFicheroAlumno();
                        //GestorArchivos.actualizaFicheroAula();
                    }else{
                        JOptionPane.showMessageDialog(null, "El aforo no puede ser menor a la cantidad de Alumnos");
                    }
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Ingrese valores numericos");
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Algo salio mal");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Faltan Datos");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un aula");
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jTextTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTutorActionPerformed

    private void jTextFieldSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSeccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSeccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupNivel;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAgregarAlumnos;
    private javax.swing.JButton jButtonAgregarAula;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCrearHorarioAula;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonNominaAula;
    private javax.swing.JButton jButtonVerHorarioAula;
    private javax.swing.JComboBox jComboBoxGrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonIni;
    private javax.swing.JRadioButton jRadioButtonPrim;
    private javax.swing.JRadioButton jRadioButtonSecun;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableAulas;
    private javax.swing.JTable jTableProf;
    private javax.swing.JTextField jTextAforo;
    private javax.swing.JTextField jTextCantAlu;
    private javax.swing.JTextField jTextFieldBuscarAula;
    private javax.swing.JTextField jTextFieldCantidadAula;
    private javax.swing.JTextField jTextFieldSeccion;
    private javax.swing.JTextField jTextIdAula;
    private javax.swing.JTextField jTextTutor;
    // End of variables declaration//GEN-END:variables

    

}
