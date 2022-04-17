
package Form;

import Clases.*;
import Conexion.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AgregarAluAula extends javax.swing.JDialog {
    
    BD_Alumno bdAlumno = new BD_Alumno();
    BD_Aula bdAula = new BD_Aula();

    public AgregarAluAula(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        jTextIdAula.setEditable(false);
        jTextIdAlumno.setEditable(false);
        jTextApellidoAlu.setEditable(false);
        jTextNombreAlu.setEditable(false);
        jTextDniAlu.setEditable(false);
        jTextDireccionAlu.setEditable(false);
        jTextFieldCantidadAlu.setEditable(false);
        jTextFieldAforo.setEditable(false);
        jTextIdAula.setText(Colegio.idAulaSelect);
        int pos = Colegio.existeBuscarAula(jTextIdAula.getText().toString());
        jTextFieldAforo.setText(Colegio.listaAula[pos].getAforo());
        limpiar();
        setLocationRelativeTo(parent);
        mostrarTablaAlu();
        mostrarTablaAluRegis();
    }
    
    private void limpiar(){
        int pos = Colegio.existeBuscarAula(jTextIdAula.getText().toString());
        jTextFieldCantidadAlu.setText(cantidadAlusenAula()+"");
        jTextIdAlumno.setText("");
        jTextApellidoAlu.setText("");
        //jRadioButtonFemenino.
        jTextNombreAlu.setText("");
        jTextDireccionAlu.setText("");
        jTextDniAlu.setText("");    
    }
        
    public void mostrarTablaAlu(){
        Alumno listaAlu[] = bdAlumno.obtenerAlumnos();
        int edadI=edadIdeal();
        DefaultTableModel modeloAlu = new DefaultTableModel();

        modeloAlu.addColumn("ID");
        modeloAlu.addColumn("Apellidos");
        modeloAlu.addColumn("Nombres");
        modeloAlu.addColumn("DNI");
        modeloAlu.addColumn("Genero");
        modeloAlu.addColumn("Direccion");
        modeloAlu.addColumn("Edad");

        jTableAlu.setModel(modeloAlu);

        String datos[] = new String[7];
        int cant=0;
        while(listaAlu[cant]!=null){
            if(listaAlu[cant].getCodA()==null){
                if(edadI==listaAlu[cant].calcEdad()){
                    datos[0]= listaAlu[cant].getCodigo();
                    datos[1]=listaAlu[cant].getApellido();
                    datos[2]=listaAlu[cant].getNombre();
                    datos[3]=listaAlu[cant].getDni();
                    datos[4]=listaAlu[cant].getGenero();
                    datos[5]=listaAlu[cant].getDomicilio();
                    datos[6]=listaAlu[cant].calcEdad()+"";
                    modeloAlu.addRow(datos);
                }
            }
            cant++;
        }
    }
    
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

    public void mostrarTablaAluRegis(){
        Alumno listaAlu[] = bdAlumno.obtenerAlumnos();
        int edadI=edadIdeal();
        DefaultTableModel modeloAlu = new DefaultTableModel();
        String codAula=jTextIdAula.getText();
        
        modeloAlu.addColumn("ID");
        modeloAlu.addColumn("Apellidos");
        modeloAlu.addColumn("Nombres");
        modeloAlu.addColumn("DNI");
        modeloAlu.addColumn("Genero");
        modeloAlu.addColumn("Direccion");
        modeloAlu.addColumn("Edad");
        
        jTableAluRegistrado.setModel(modeloAlu);

        String datos[] = new String[7];
        int cant=0;
        while(listaAlu[cant]!=null){
            if(listaAlu[cant].getCodA()!=null){
                if(listaAlu[cant].getCodA().equals(codAula)){
                    datos[0]= listaAlu[cant].getCodigo();
                    datos[1]=listaAlu[cant].getApellido();
                    datos[2]=listaAlu[cant].getNombre();
                    datos[3]=listaAlu[cant].getDni();
                    datos[4]=listaAlu[cant].getGenero();
                    datos[5]=listaAlu[cant].getDomicilio();
                    datos[6]=listaAlu[cant].calcEdad()+"";
                    modeloAlu.addRow(datos);
                }
            }
            cant++;
        } 
    }
    
    public int edadIdeal (){
        int edad;
        int grado = Character.getNumericValue(Colegio.idAulaSelect.charAt(1));

        switch (Colegio.idAulaSelect.charAt(0)) {
            case 'P':
                edad=grado+5;
                break;
            case 'S':
                edad=grado+11;
                break;
            default:
                edad=grado;
                break;
        }
        return edad;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextDireccionAlu = new javax.swing.JTextField();
        jTextApellidoAlu = new javax.swing.JTextField();
        jTextNombreAlu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextDniAlu = new javax.swing.JTextField();
        jRadioButtonFemenino = new javax.swing.JRadioButton();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jSpinnerDiaNac = new javax.swing.JSpinner();
        jSpinnerMesNac = new javax.swing.JSpinner();
        jSpinnerAnioNac = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextIdAlumno = new javax.swing.JTextField();
        jButtonAgregarAlu1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextIdAula = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCantidadAlu = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldAforo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTableAlu = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTableAluRegistrado = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel11.setBackground(new java.awt.Color(255, 255, 204));

        jPanel10.setBackground(new java.awt.Color(0, 153, 153));

        jPanel5.setBackground(new java.awt.Color(245, 244, 244));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setName(""); // NOI18N

        jLabel2.setText("Nombres");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Genero");

        jLabel5.setText("Direccion");

        jLabel6.setText("Dia ");

        jLabel7.setText("Mes ");

        jLabel8.setText("Año ");

        jTextApellidoAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextApellidoAluActionPerformed(evt);
            }
        });

        jLabel9.setText("Nacimiento");

        jLabel14.setText("DNI");

        jRadioButtonFemenino.setText("Femenino");
        jRadioButtonFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemeninoActionPerformed(evt);
            }
        });

        jRadioButtonMasculino.setText("Masculino");

        jSpinnerDiaNac.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jSpinnerMesNac.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jSpinnerAnioNac.setModel(new javax.swing.SpinnerNumberModel(2004, 2004, 2015, 1));

        jLabel12.setBackground(new java.awt.Color(204, 204, 255));
        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Datos de Alumno");
        jLabel12.setOpaque(true);

        jLabel18.setText("id ALumno");

        jTextIdAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdAlumnoActionPerformed(evt);
            }
        });

        jButtonAgregarAlu1.setText("Agregar");
        jButtonAgregarAlu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarAlu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel18)))
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextDireccionAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNombreAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDniAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextApellidoAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jRadioButtonFemenino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonMasculino))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinnerDiaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAgregarAlu1)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jSpinnerMesNac, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinnerAnioNac, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(61, 61, 61))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextApellidoAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNombreAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDniAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButtonFemenino)
                    .addComponent(jRadioButtonMasculino))
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextDireccionAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jSpinnerDiaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jSpinnerMesNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jSpinnerAnioNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButtonAgregarAlu1)
                .addGap(31, 31, 31))
        );

        jPanel2.setBackground(new java.awt.Color(245, 244, 244));

        jLabel1.setText("id Aula");

        jTextIdAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdAulaActionPerformed(evt);
            }
        });

        jLabel10.setText("N° de Alumnos");

        jTextFieldCantidadAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadAluActionPerformed(evt);
            }
        });

        jLabel11.setText("Aforo");

        jTextFieldAforo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAforoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextIdAula, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(4, 4, 4)
                .addComponent(jTextFieldCantidadAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAforo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jTextFieldAforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextIdAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jTextFieldCantidadAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel17.setBackground(new java.awt.Color(204, 204, 255));
        jLabel17.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Lista de Alumnos Aptos");
        jLabel17.setOpaque(true);

        jTableAlu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAlu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAluMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(jTableAlu);

        jLabel19.setBackground(new java.awt.Color(204, 204, 255));
        jLabel19.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Lista de Alumnos Registrados");
        jLabel19.setOpaque(true);

        jTableAluRegistrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAluRegistrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAluRegistradoMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(jTableAluRegistrado);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(688, 688, 688))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1557, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextApellidoAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextApellidoAluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextApellidoAluActionPerformed

    private void jRadioButtonFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFemeninoActionPerformed

    private void jTextIdAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdAulaActionPerformed

    private void jTextIdAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdAlumnoActionPerformed

    private void jTableAluMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAluMouseClicked
        int fila = this.jTableAlu.getSelectedRow();
        String genero;
        int pos = Colegio.existeBuscarAlu(this.jTableAlu.getValueAt(fila, 0).toString());

        this.jTextIdAlumno.setText(Colegio.listaAlu[pos].getCodigo());
        this.jTextApellidoAlu.setText(Colegio.listaAlu[pos].getApellido());
        this.jTextNombreAlu.setText(Colegio.listaAlu[pos].getNombre());
        this.jTextDniAlu.setText(Colegio.listaAlu[pos].getDni());
        genero = Colegio.listaAlu[pos].getGenero();
        if(genero.equals("F")){
            jRadioButtonFemenino.setSelected(true);
        }else
        jRadioButtonMasculino.setSelected(true);
        this.jTextDireccionAlu.setText(Colegio.listaAlu[pos].getDomicilio());

        this.jSpinnerDiaNac.setValue(Colegio.listaAlu[pos].getDiaNac());
        this.jSpinnerMesNac.setValue(Colegio.listaAlu[pos].getMesNac());
        this.jSpinnerAnioNac.setValue(Colegio.listaAlu[pos].getAnioNac());
    }//GEN-LAST:event_jTableAluMouseClicked

    private void jTextFieldCantidadAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadAluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadAluActionPerformed

    private void jTableAluRegistradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAluRegistradoMouseClicked
        int fila = this.jTableAluRegistrado.getSelectedRow();
        String genero;
        int pos = Colegio.existeBuscarAlu(this.jTableAluRegistrado.getValueAt(fila, 0).toString());

        this.jTextIdAlumno.setText(Colegio.listaAlu[pos].getCodigo());
        this.jTextApellidoAlu.setText(Colegio.listaAlu[pos].getApellido());
        this.jTextNombreAlu.setText(Colegio.listaAlu[pos].getNombre());
        this.jTextDniAlu.setText(Colegio.listaAlu[pos].getDni());
        genero = Colegio.listaAlu[pos].getGenero();
        if(genero.equals("F")){
            jRadioButtonFemenino.setSelected(true);
        }else
        jRadioButtonMasculino.setSelected(true);
        this.jTextDireccionAlu.setText(Colegio.listaAlu[pos].getDomicilio());

        this.jSpinnerDiaNac.setValue(Colegio.listaAlu[pos].getDiaNac());
        this.jSpinnerMesNac.setValue(Colegio.listaAlu[pos].getMesNac());
        this.jSpinnerAnioNac.setValue(Colegio.listaAlu[pos].getAnioNac());
    }//GEN-LAST:event_jTableAluRegistradoMouseClicked

    
    private void jButtonAgregarAlu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarAlu1ActionPerformed
        String id = jTextIdAula.getText();
        BD_Alumno bdAlumno = new BD_Alumno();
        String codAlu = jTextIdAlumno.getText();
        
        if (!jTextIdAlumno.getText().isEmpty()){
            
            int can =Integer.parseInt(jTextFieldCantidadAlu.getText()); 
            int af=Integer.parseInt(jTextFieldAforo.getText());
            if(can==af){
              JOptionPane.showMessageDialog(null, "Aula llena");
            }else{
                Alumno a = new Alumno();
                a.setCodA(id);
                a.setCodigo(codAlu);
                bdAlumno.actualizarAlumnoAula(a);

                mostrarTablaAlu();
                mostrarTablaAluRegis();
                limpiar();
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Faltan Datos");
        }
    }//GEN-LAST:event_jButtonAgregarAlu1ActionPerformed

    private void jTextFieldAforoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAforoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAforoActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarAluAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarAluAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarAluAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarAluAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarAluAula dialog = new AgregarAluAula(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonAgregarAlu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButtonFemenino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerAnioNac;
    private javax.swing.JSpinner jSpinnerDiaNac;
    private javax.swing.JSpinner jSpinnerMesNac;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableAlu;
    private javax.swing.JTable jTableAluRegistrado;
    private javax.swing.JTextField jTextApellidoAlu;
    private javax.swing.JTextField jTextDireccionAlu;
    private javax.swing.JTextField jTextDniAlu;
    private javax.swing.JTextField jTextFieldAforo;
    private javax.swing.JTextField jTextFieldCantidadAlu;
    private javax.swing.JTextField jTextIdAlumno;
    private javax.swing.JTextField jTextIdAula;
    private javax.swing.JTextField jTextNombreAlu;
    // End of variables declaration//GEN-END:variables
}
