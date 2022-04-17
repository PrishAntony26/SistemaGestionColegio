/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Clases.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author ARNOLD
 */
public class PanelNotas extends javax.swing.JPanel {

    public PanelNotas(){
        initComponents();
        btnAgregar.setVisible(false);
        cargaComboAulas(cboAula);
    }
    
    public void cargaComboAulas(JComboBox cboAu){
        int n;
        String aulas[];
        n = Colegio.existeBuscarProf(Colegio.idProfeIniciado);
        aulas = Colegio.listaProf[n].aulaProf();
        for(int i=0; i<aulas.length; i++){
            cboAu.addItem(aulas[i]);
        }
    }
    
    public void cargaComboCursos(JComboBox cboCur, String idAula){
        cboCurso.removeAllItems();
        cboCurso.addItem("Seleccionar Curso");
        int na,np;
        String cursos[];
        Curso cur[];
        na = Colegio.existeBuscarAula(idAula);
        np = Colegio.existeBuscarProf(Colegio.idProfeIniciado);
        cur = Colegio.listaAula[na].getCursos();
        cursos = Colegio.listaProf[np].cursoProf(cur,idAula);
        
        for(int i=0; i<cursos.length; i++){
            cboCur.addItem(cursos[i]);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNotas = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cboAula = new javax.swing.JComboBox();
        cboCurso = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTableNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableNotas);

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregar.setText("Guardar Cambios");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(204, 204, 255));
        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Registro de Notas");
        jLabel13.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(547, 547, 547))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        cboAula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cboAula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Aula" }));
        cboAula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboAulaItemStateChanged(evt);
            }
        });
        cboAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAulaActionPerformed(evt);
            }
        });

        cboCurso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cboCurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Curso" }));
        cboCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cboCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCursoItemStateChanged(evt);
            }
        });
        cboCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCursoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Aula");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Curso");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(324, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(cboAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(cboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboAula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(5, 5, 5)))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboAulaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboAulaItemStateChanged
        
        String idAula=(String)cboAula.getSelectedItem();
        if(!idAula.equals("Seleccionar Aula")){
        cargaComboCursos(cboCurso, idAula);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un aula");
        }
    }//GEN-LAST:event_cboAulaItemStateChanged

    private void cboCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCursoItemStateChanged
        int na,filas;
        String alums[];
        String matriz[][];
        String idAula=(String)cboAula.getSelectedItem();
        int posAlu;
        na = Colegio.existeBuscarAula(idAula);
        alums = Colegio.listaAula[na].getAlumnos();
        filas = alums.length;
        String nomCurso = (String)cboCurso.getSelectedItem();
        int nota[][];
        if(nomCurso!=null){
            if(!nomCurso.equals("Seleccionar Curso")){
                btnAgregar.setVisible(true);
                matriz = new String[filas][6];
                for (int i = 0; i < filas; i++) {
                    posAlu = Colegio.existeBuscarAlu(alums[i]);
                    matriz[i][0]=Colegio.listaAlu[posAlu].getApellido()+" "+Colegio.listaAlu[posAlu].getNombre();
                }
                
                int pos = Colegio.existeBuscarAula(idAula);
                
                nota = Colegio.listaAula[pos].obtenerNotas(nomCurso);
                
                for(int i=0; i<filas; i++){
                    for(int j=1; j<6;j++){
                        if(nota[i][j-1] != 0){
                        matriz[i][j] = String.valueOf(nota[i][j-1]);
                        }
                    }
                }
        
                jTableNotas.setModel(new javax.swing.table.DefaultTableModel(
                    matriz,
                    new String [] {
                        "Alumno","PC1","PC2","T1","T2","Ex"
                    }
                ));
            }else{
                
                jTableNotas.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {},
                new String [] {}
                ));
                btnAgregar.setVisible(false);
            }
        }else{
            jTableNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {}
            ));
            btnAgregar.setVisible(false);
        }
    }//GEN-LAST:event_cboCursoItemStateChanged

    
    private void cboAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAulaActionPerformed

    private void cboCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCursoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int fila = jTableNotas.getRowCount();
        int colum = jTableNotas.getColumnCount()-1;
        String nota[][] = new String[fila][colum];
        int notas[][] = new int[fila][colum];
        for(int i=0; i<fila; i++){
            for(int j=0; j<colum;j++){
                nota[i][j]=(String)jTableNotas.getValueAt(i,j+1);
            }
        }

        /***************************************/
        //GUARDAR LOS REGISTROS
        try{
            for(int i=0; i<fila; i++){
                for(int j=0; j<colum;j++){
                    if(nota[i][j] != null){
                    notas[i][j]=Integer.parseInt(nota[i][j]);
                    }
                }
            }
            /********************************************/

            String nomCurso = (String)cboCurso.getSelectedItem();
            String idAula = (String)cboAula.getSelectedItem();
            int pos = Colegio.existeBuscarAula(idAula);

            Colegio.listaAula[pos].ingresarNotas(notas, nomCurso);
            JOptionPane.showMessageDialog(null,"Notas ingresadas satisfactoriamente");
            GestorArchivos.actualizaFicheroAula();
        }catch(NumberFormatException ev){
                JOptionPane.showMessageDialog(null,"Solo se pueden ingresar valores numéricos");
            }
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox cboAula;
    private javax.swing.JComboBox cboCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableNotas;
    // End of variables declaration//GEN-END:variables
}