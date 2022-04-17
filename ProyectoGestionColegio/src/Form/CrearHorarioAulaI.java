/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Clases.*;
import java.util.StringTokenizer;
import javax.swing.*;
/**
 *
 * @author jhona
 */
public class CrearHorarioAulaI extends javax.swing.JDialog {

    /**
     * Creates new form CrearHorarioAulaI
     */
    public CrearHorarioAulaI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        jTextFieldIDAula.setText(Colegio.idAulaSelect);
        jTextFieldIDAula.setEditable(false);
        jTextHorasM.setEditable(false);
        jTextFieldIdProf.setEditable(false);
        jTextHorasR.setEditable(false);
        mostrarHorario(Colegio.idAulaSelect);
        mostrarProf();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableHorarioI = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProfDisp = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxCurso = new javax.swing.JComboBox();
        jTextHorasM = new javax.swing.JTextField();
        jTextFieldIDAula = new javax.swing.JTextField();
        jTextFieldIdProf = new javax.swing.JTextField();
        jButtonAgregarHorarioCurso = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextHorasR = new javax.swing.JTextField();
        jButtonEliminarCurso = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTableHorarioI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"8:00-8:45", null, null, null, null, null},
                {"8:45-9:30", null, null, null, null, null},
                {"9:30-10:00", null, null, null, null, null},
                {"10:00-10:45", null, null, null, null, null},
                {"10:45-11:30", null, null, null, null, null},
                {"11:30-12:15", null, null, null, null, null}
            },
            new String [] {
                "Horario", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableHorarioI.setRowHeight(25);
        jTableHorarioI.getTableHeader().setResizingAllowed(false);
        jTableHorarioI.getTableHeader().setReorderingAllowed(false);
        jTableHorarioI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHorarioIMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableHorarioI);

        jTableProfDisp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Apellidos", "Nombres", "DNI", "Género", "Celular"
            }
        ));
        jTableProfDisp.getTableHeader().setResizingAllowed(false);
        jTableProfDisp.getTableHeader().setReorderingAllowed(false);
        jTableProfDisp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProfDispMouseClicked(evt);
            }
        });
        jTableProfDisp.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jTableProfDispComponentHidden(evt);
            }
        });
        jScrollPane3.setViewportView(jTableProfDisp);

        jLabel15.setBackground(new java.awt.Color(204, 204, 255));
        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Horario del Aula-Inicial");
        jLabel15.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(204, 204, 255));
        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Profesores Disponibles");
        jLabel13.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setText("ID del Aula");

        jLabel2.setText("ID del Profesor");

        jLabel3.setText("Cursos");

        jLabel4.setText("Horas máxima");

        jComboBoxCurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Curso", "Matematica", "Comunicacion", "Ciencias", "Personal Social" }));
        jComboBoxCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCursoItemStateChanged(evt);
            }
        });
        jComboBoxCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxCursoMouseClicked(evt);
            }
        });
        jComboBoxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCursoActionPerformed(evt);
            }
        });

        jTextFieldIDAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDAulaActionPerformed(evt);
            }
        });

        jButtonAgregarHorarioCurso.setText("Agregar Curso");
        jButtonAgregarHorarioCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarHorarioCursoActionPerformed(evt);
            }
        });

        jLabel5.setText("Horas registradas");

        jButtonEliminarCurso.setText("Eliminar Curso");
        jButtonEliminarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextHorasR))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldIDAula)
                            .addComponent(jTextFieldIdProf)
                            .addComponent(jTextHorasM)
                            .addComponent(jComboBoxCurso, 0, 161, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAgregarHorarioCurso)
                .addGap(66, 66, 66)
                .addComponent(jButtonEliminarCurso)
                .addGap(41, 41, 41))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldIDAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldIdProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextHorasM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextHorasR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregarHorarioCurso)
                    .addComponent(jButtonEliminarCurso))
                .addGap(33, 33, 33))
        );

        jLabel14.setBackground(new java.awt.Color(204, 204, 255));
        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Datos del Curso");
        jLabel14.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1253, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCursoActionPerformed
   
    }//GEN-LAST:event_jComboBoxCursoActionPerformed

    private void jButtonAgregarHorarioCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarHorarioCursoActionPerformed
        //Bueno, aquí empieza la triste historia del Bratty salvaje
        String cualquiera=(String)jComboBoxCurso.getSelectedItem();
        String codAula=jTextFieldIDAula.getText();
        String codProf=jTextFieldIdProf.getText();
        int posP=Colegio.existeBuscarProf(codProf);
        int pos=Colegio.existeBuscarAula(codAula);
        int fila=this.jTableHorarioI.getSelectedRow();
        if(!jTextFieldIDAula.getText().equalsIgnoreCase("") && !jTextFieldIdProf.getText().equalsIgnoreCase("") && !cualquiera.equalsIgnoreCase("Seleccione Curso") && fila!=-1){
            if(!jTextHorasM.getText().equalsIgnoreCase(jTextHorasR.getText())){
                int colum=this.jTableHorarioI.getSelectedColumn();
                String a=(String)this.jTableHorarioI.getValueAt(fila, colum);
                if(a==null){
                    //Acá busco algo en HorarioProfesor, si el espacio está lleno, pos no se matricula en nada :V
                    String hp[][]=Colegio.listaProf[posP].getHp().getHor();
                    String aparCurso=aparTablaCursoEX(codProf,cualquiera);
                    if(hp[fila][colum-1]==null){
                        if(aparCurso.equalsIgnoreCase(cualquiera) || aparCurso.equalsIgnoreCase("No")){
                            String cuadro=cualquiera+"/"+jTextFieldIdProf.getText();
                            this.jTableHorarioI.setValueAt(cuadro, fila, colum);
                            Colegio.listaAula[pos].modificarHorarioA(cuadro,fila,colum-1);
                            mostrarHorario(codAula);
                            jTextHorasR.setText(aparTabla(cualquiera)+"");
                            //Aquí empezamos a hacer lo del horario del profesor
                            Colegio.listaProf[posP].modificarHorarioP(cualquiera+"/"+codAula, fila, colum-1);
                            GestorArchivos.actualizaFicheroAula();
                            GestorArchivos.actualizaFicheroProfesor();
                        }else{
                            JOptionPane.showMessageDialog(null,"Ya hay un profesor enseñando este curso");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"El profesor ya está registrado en este horario...!");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Solo se llenan celdas vacías...!");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Ya completó las horas máximas del curso");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }        
    }//GEN-LAST:event_jButtonAgregarHorarioCursoActionPerformed

    private void jTableHorarioIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHorarioIMouseClicked
        
    }//GEN-LAST:event_jTableHorarioIMouseClicked

    private void jTextFieldIDAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDAulaActionPerformed

    }//GEN-LAST:event_jTextFieldIDAulaActionPerformed

    private void jTableProfDispComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableProfDispComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableProfDispComponentHidden

    private void jTableProfDispMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProfDispMouseClicked
        int fila = this.jTableProfDisp.getSelectedRow();
        int pos = Colegio.existeBuscarProf(this.jTableProfDisp.getValueAt(fila, 0).toString());
        mostrarCasilla(pos);
    }//GEN-LAST:event_jTableProfDispMouseClicked

    private void jComboBoxCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxCursoMouseClicked
        
    }//GEN-LAST:event_jComboBoxCursoMouseClicked

    private void jComboBoxCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxCursoItemStateChanged
        //Holi boli
        String nameCurso=(String)jComboBoxCurso.getSelectedItem();
        Curso cur[]=Aula.ICursos();
        for(int i=0;i<cur.length;i++){
            if(nameCurso.equalsIgnoreCase(cur[i].getNombre())){
                String n=cur[i].getnHoras()+"";
                jTextHorasM.setText(n);
                jTextHorasR.setText(aparTabla(nameCurso)+"");
            }
        }         
    }//GEN-LAST:event_jComboBoxCursoItemStateChanged

    private void jButtonEliminarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCursoActionPerformed
        // Aquí inicia el sufrimiento del Bratty 2.0
        String codAula=jTextFieldIDAula.getText();
        int pos=Colegio.existeBuscarAula(codAula);
        int fila=this.jTableHorarioI.getSelectedRow();
        if(fila!=-1){
            int colum=this.jTableHorarioI.getSelectedColumn();
            String a=(String)this.jTableHorarioI.getValueAt(fila, colum);
            if(a!=null){
                StringTokenizer tokens=new StringTokenizer(a,"/");
                int nDatos=tokens.countTokens();
                String[] datos=new String[nDatos];
                int k=0;
                while(tokens.hasMoreTokens()){
                    datos[k]=tokens.nextToken();
                    k++;
                }
                int posP=Colegio.existeBuscarProf(datos[1]);
                this.jTableHorarioI.setValueAt(null, fila, colum);
                Colegio.listaAula[pos].modificarHorarioA(null,fila,colum-1);
                mostrarHorario(codAula);
                jTextHorasR.setText(aparTabla(datos[0])+"");
                Colegio.listaProf[posP].modificarHorarioP(null, fila, colum-1);
                GestorArchivos.actualizaFicheroAula();
                GestorArchivos.actualizaFicheroProfesor();
            }else{
                JOptionPane.showMessageDialog(null, "Solo se pueden eliminar celdas llenas...!");
            }    
        }else{
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
    }//GEN-LAST:event_jButtonEliminarCursoActionPerformed

    private int aparTabla(String s){
        int apar=0;
        //s -> es el código del profe
        for(int i=0;i<6;i++){
            for(int j=1;j<=5;j++){
                String a=(String)jTableHorarioI.getValueAt(i,j);
                if(a!=null){
                    StringTokenizer tokens=new StringTokenizer(a,"/");
                    int nDatos=tokens.countTokens();
                    String[] datos=new String[nDatos];
                    int k=0;
                    while(tokens.hasMoreTokens()){
                        datos[k]=tokens.nextToken();
                        k++;
                    }
                    String arriba=datos[0];
                    if(arriba.equalsIgnoreCase(s)){
                        apar++;
                    }
                }
            }
        }
        return apar;
    }
    
    private String aparTablaCursoEX(String codP, String curso){
        String apar="No";
        //s -> es el código del profe
        for(int i=0;i<6;i++){
            for(int j=1;j<=5;j++){
                String a=(String)jTableHorarioI.getValueAt(i,j);
                if(a!=null){
                    StringTokenizer tokens=new StringTokenizer(a,"/");
                    int nDatos=tokens.countTokens();
                    String[] datos=new String[nDatos];
                    int k=0;
                    while(tokens.hasMoreTokens()){
                        datos[k]=tokens.nextToken();
                        k++;
                    }
                    if(codP.equalsIgnoreCase(datos[1]) && curso.equalsIgnoreCase(datos[0])){
                        apar=datos[0];
                    }
                    if(!codP.equalsIgnoreCase(datos[1]) && curso.equalsIgnoreCase(datos[0])){
                        apar="0";
                    }
                }
            }
        }
        return apar;
    }
    
    private void mostrarHorario(String codAula){
        int pos=Colegio.existeBuscarAula(codAula);
        String hor[][]=Colegio.listaAula[pos].getHa().getHor();
        for(int i=0;i<6;i++){
            for(int j=0;j<5;j++){
                jTableHorarioI.setValueAt(hor[i][j],i,j+1);
            }
        }
    }
    
    private void mostrarCasilla(int pos){
        this.jTextFieldIdProf.setText(Colegio.listaProf[pos].getCodigo());
    }
    
    public void mostrarProf(){
        String matris[][]=new String[Colegio.listaProf.length][6];
        for(int i=0;i<Colegio.listaProf.length;i++){
            matris[i][0]=Colegio.listaProf[i].getCodigo();
            matris[i][1]=Colegio.listaProf[i].getApellido();
            matris[i][2]=Colegio.listaProf[i].getNombre();
            matris[i][3]=Colegio.listaProf[i].getDni();
            matris[i][4]=Colegio.listaProf[i].getGenero();
            matris[i][5]=Colegio.listaProf[i].getCelular();
        }
        jTableProfDisp.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "ID", "Apellidos", "Nombres", "DNI", "Género", "Celular"
            }
        ));
    }
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
            java.util.logging.Logger.getLogger(CrearHorarioAulaI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearHorarioAulaI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearHorarioAulaI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearHorarioAulaI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearHorarioAulaI dialog = new CrearHorarioAulaI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarHorarioCurso;
    private javax.swing.JButton jButtonEliminarCurso;
    private javax.swing.JComboBox jComboBoxCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableHorarioI;
    private javax.swing.JTable jTableProfDisp;
    private javax.swing.JTextField jTextFieldIDAula;
    private javax.swing.JTextField jTextFieldIdProf;
    private javax.swing.JTextField jTextHorasM;
    private javax.swing.JTextField jTextHorasR;
    // End of variables declaration//GEN-END:variables
}
