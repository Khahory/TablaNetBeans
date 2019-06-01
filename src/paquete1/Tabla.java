
package paquete1;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Tabla extends javax.swing.JFrame {

    public Tabla() {
        initComponents();
        mostrarTabla("");
        mostrarItems();
    }
     
    //objetos ######################
    Conexion con = new Conexion();
    Connection cn = con.conectar();
    Color Color_tabla = new Color(88, 179, 105, 255);
    //fin
    
    //variables
    String atributo = "id";
    //fin

//mostrar tabla
    public void mostrarTabla(String valor){
        
            DefaultTableModel modelo = new DefaultTableModel();
            //agregar columnas
            modelo.addColumn("Id");
            modelo.addColumn("Nombre");
            modelo.addColumn("Edad");
            modelo.addColumn("Fecha");
            modelo.addColumn("pedro");
            modelo.addColumn("juan");
            modelo.addColumn("juanloco");
            tabla.setModel(modelo);
            //Fin
            
            //variables
            String sql = "";
            //fin
            
            //buscar por seleccion, condicional
            if(valor.equals("")){
                 sql = "SELECT * FROM persona";
            }else{
                sql = "SELECT * FROM persona WHERE " +atributo +" = " +"'" +valor +"'";
            }
            //fin

            String datos[] = new String[4];
            Statement st;
            
             try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            

            
            //Agregar los reglones
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                modelo.addRow(datos);
            }
            
            tabla.setModel(modelo);
            //Fin

            
            //desshabilitar
            deshabilitarTF();
            deshabilitarBotones();
            enviarfecha();
            
            //color de la tabla
            tabla.setBackground(Color_tabla);
            //fin
            
            //Fin
        } catch (SQLException ex) {
            Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        panel_pestanas = new javax.swing.JTabbedPane();
        panel_registro = new javax.swing.JPanel();
        tf_nombre = new javax.swing.JTextField();
        tf_edad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boton_guardar = new javax.swing.JButton();
        boton_nuevo = new javax.swing.JButton();
        boton_modificar = new javax.swing.JButton();
        boton_actualizar = new javax.swing.JButton();
        tf_buscar = new javax.swing.JTextField();
        boton_cancelar = new javax.swing.JButton();
        calendar_fecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        tf_fecha = new javax.swing.JTextField();
        boton_refrescar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        boton_buscar = new javax.swing.JButton();
        tf_encontrar = new javax.swing.JTextField();
        box_columnas = new javax.swing.JComboBox<>();
        panel_ayuda = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        boton_limpiar = new javax.swing.JButton();
        boton_eliminar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panel_pestanas.setBackground(new java.awt.Color(102, 255, 102));
        panel_pestanas.setForeground(new java.awt.Color(0, 0, 0));

        panel_registro.setBackground(new java.awt.Color(0, 51, 102));
        panel_registro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tf_nombre.setBackground(new java.awt.Color(187, 204, 219));
        tf_nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_nombre.setForeground(new java.awt.Color(0, 0, 0));
        tf_nombre.setCaretColor(new java.awt.Color(0, 0, 0));

        tf_edad.setBackground(new java.awt.Color(187, 204, 219));
        tf_edad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_edad.setForeground(new java.awt.Color(0, 0, 0));
        tf_edad.setCaretColor(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 173, 77));
        jLabel1.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 173, 77));
        jLabel3.setText("Edad");

        boton_guardar.setBackground(new java.awt.Color(51, 51, 255));
        boton_guardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        boton_guardar.setForeground(new java.awt.Color(255, 255, 255));
        boton_guardar.setText("Guardar");
        boton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_guardarActionPerformed(evt);
            }
        });

        boton_nuevo.setBackground(new java.awt.Color(51, 51, 255));
        boton_nuevo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        boton_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        boton_nuevo.setText("Nuevo");
        boton_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_nuevoActionPerformed(evt);
            }
        });

        boton_modificar.setBackground(new java.awt.Color(51, 51, 255));
        boton_modificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        boton_modificar.setForeground(new java.awt.Color(255, 255, 255));
        boton_modificar.setText("Modificar");
        boton_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificarActionPerformed(evt);
            }
        });

        boton_actualizar.setBackground(new java.awt.Color(51, 51, 255));
        boton_actualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        boton_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        boton_actualizar.setText("Actualizar");
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });

        boton_cancelar.setBackground(new java.awt.Color(153, 0, 0));
        boton_cancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        boton_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        boton_cancelar.setText("Cancelar");
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 173, 77));
        jLabel4.setText("Fecha de registro");

        tf_fecha.setBackground(new java.awt.Color(187, 204, 219));
        tf_fecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_fecha.setForeground(new java.awt.Color(0, 0, 0));
        tf_fecha.setCaretColor(new java.awt.Color(0, 0, 0));

        boton_refrescar.setBackground(new java.awt.Color(51, 51, 255));
        boton_refrescar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        boton_refrescar.setForeground(new java.awt.Color(255, 255, 255));
        boton_refrescar.setText("Refrescar");
        boton_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_refrescarActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 173, 77));
        jLabel5.setText("Buscar");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        boton_buscar.setBackground(new java.awt.Color(0, 51, 51));
        boton_buscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        boton_buscar.setForeground(new java.awt.Color(102, 255, 102));
        boton_buscar.setText("Buscar");
        boton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscarActionPerformed(evt);
            }
        });

        tf_encontrar.setBackground(new java.awt.Color(187, 204, 219));
        tf_encontrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_encontrar.setForeground(new java.awt.Color(0, 0, 0));
        tf_encontrar.setCaretColor(new java.awt.Color(0, 0, 0));

        box_columnas.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel_registroLayout = new javax.swing.GroupLayout(panel_registro);
        panel_registro.setLayout(panel_registroLayout);
        panel_registroLayout.setHorizontalGroup(
            panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registroLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(calendar_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_fecha)
                            .addComponent(tf_edad, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(panel_registroLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(boton_guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_refrescar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_cancelar)
                .addGap(0, 267, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_nuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registroLayout.createSequentialGroup()
                            .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(box_columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_encontrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registroLayout.createSequentialGroup()
                            .addComponent(boton_buscar)
                            .addGap(82, 82, 82)))))
            .addGroup(panel_registroLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_registroLayout.setVerticalGroup(
            panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_registroLayout.createSequentialGroup()
                                .addComponent(calendar_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registroLayout.createSequentialGroup()
                                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addComponent(boton_modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_actualizar)
                            .addComponent(tf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(box_columnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_encontrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_buscar))
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addComponent(tf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(boton_nuevo)
                        .addGap(19, 19, 19)
                        .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_guardar)
                            .addComponent(boton_refrescar)
                            .addComponent(boton_cancelar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_pestanas.addTab("Base de datos", panel_registro);

        panel_ayuda.setBackground(new java.awt.Color(0, 102, 102));
        panel_ayuda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Created by Angel Maria Perez", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setText("Facebook");

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 51));
        jLabel7.setText("Hotmail");

        tf1.setBackground(new java.awt.Color(0, 102, 102));
        tf1.setForeground(new java.awt.Color(51, 255, 51));
        tf1.setText("angeld05@live.com");

        tf2.setBackground(new java.awt.Color(0, 102, 102));
        tf2.setForeground(new java.awt.Color(51, 255, 51));
        tf2.setText("https://www.facebook.com/angel.mariaperez.9?ref=br_rs");

        javax.swing.GroupLayout panel_ayudaLayout = new javax.swing.GroupLayout(panel_ayuda);
        panel_ayuda.setLayout(panel_ayudaLayout);
        panel_ayudaLayout.setHorizontalGroup(
            panel_ayudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ayudaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel_ayudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ayudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf1)
                    .addComponent(tf2, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        panel_ayudaLayout.setVerticalGroup(
            panel_ayudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ayudaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panel_ayudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panel_ayudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        panel_pestanas.addTab("Info", panel_ayuda);

        tabla.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        boton_limpiar.setBackground(new java.awt.Color(0, 102, 102));
        boton_limpiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        boton_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        boton_limpiar.setText("Limpiar");
        boton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_limpiarActionPerformed(evt);
            }
        });

        boton_eliminar.setBackground(new java.awt.Color(0, 102, 102));
        boton_eliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        boton_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        boton_eliminar.setText("Eliminar");
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_pestanas)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_pestanas, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_limpiar)
                        .addGap(0, 155, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_refrescarActionPerformed
        mostrarTabla("");
        boton_modificar.setEnabled(true);
    }//GEN-LAST:event_boton_refrescarActionPerformed

    private void boton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_guardarActionPerformed
        insertarDatos();
    }//GEN-LAST:event_boton_guardarActionPerformed

    private void boton_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_nuevoActionPerformed
        boton_guardar.setEnabled(true);
        boton_modificar.setEnabled(false);
        boton_cancelar.setEnabled(true);
        tf_nombre.setEnabled(true);
        tf_edad.setEnabled(true);
        boton_nuevo.setEnabled(false);
    }//GEN-LAST:event_boton_nuevoActionPerformed

    private void boton_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificarActionPerformed
        modificarDatos();
        boton_refrescar.setEnabled(false);
    }//GEN-LAST:event_boton_modificarActionPerformed

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
       actualizarDatos();
       mostrarTabla("");
       boton_refrescar.setEnabled(true);
    }//GEN-LAST:event_boton_actualizarActionPerformed

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed
       eliminar();
    }//GEN-LAST:event_boton_eliminarActionPerformed

    private void boton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_boton_limpiarActionPerformed

    private void boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelarActionPerformed
       limpiar();
       deshabilitarTF();
       deshabilitarBotones();
       boton_modificar.setEnabled(true);
       boton_refrescar.setEnabled(true);
       
    }//GEN-LAST:event_boton_cancelarActionPerformed

    private void boton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarActionPerformed
        buscarPorBox();
        limpiar();
        deshabilitarTF();
        deshabilitarBotones();
        boton_modificar.setEnabled(true);
        boton_refrescar.setEnabled(true);
    }//GEN-LAST:event_boton_buscarActionPerformed

    //enviar los datos a la base de datos
    public void insertarDatos() {
        if (probarCamposVacios() == true) {
            try {
                PreparedStatement ppt = cn.prepareStatement("INSERT INTO persona(nombre,edad,fecha) VALUES (?,?,?)");
                ppt.setString(1, tf_nombre.getText());
                ppt.setString(2, tf_edad.getText());
                ppt.setString(3, tf_fecha.getText());
                ppt.executeUpdate();
                limpiar();
                JOptionPane.showMessageDialog(null, "Datos guardados");
                mostrarTabla("");
                boton_modificar.setEnabled(true);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "El campo del nombre o de la edad estan incorrectos", "Problema con los datos", 0);

                Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    //limpiar campos
    public void limpiar() {
        tf_nombre.setText("");
        tf_edad.setText("");
        tf_buscar.setText("");
        tf_encontrar.setText("");
        enviarfecha();
    }
    
    //modificar datos
    public void modificarDatos(){
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            tf_buscar.setText(tabla.getValueAt(fila, 0).toString());
            tf_nombre.setText(tabla.getValueAt(fila, 1).toString());
            tf_edad.setText(tabla.getValueAt(fila, 2).toString());
            tf_fecha.setText(tabla.getValueAt(fila, 3).toString());
            
            boton_actualizar.setEnabled(true);
            boton_cancelar.setEnabled(true);
            boton_nuevo.setEnabled(false);
            boton_modificar.setEnabled(false);
            habilitarTF();
            enviarfecha();
            
        }else{
            JOptionPane.showMessageDialog(null, "Fila no seleccionada", "Desconocido",3);
        }
    }
    
    //actualizar datos
    public void actualizarDatos(){
        try {
            PreparedStatement pps = cn.prepareStatement("UPDATE persona SET nombre = '" +tf_nombre.getText() +"',edad = '" +
                    tf_edad.getText() +"',fecha = '" +tf_fecha.getText() +"' WHERE id = '" +tf_buscar.getText() +"'");
            pps.executeUpdate();
            limpiar();
            deshabilitarBotones();
            boton_modificar.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Datos actualizados");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha cometido algun error");
            Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //eliminar datos
    public void eliminar() {
        int fila = tabla.getSelectedRow();
        String valor = tabla.getValueAt(fila, 0).toString();

        if (fila >= 0) {
            try {
                PreparedStatement pps = cn.prepareStatement("DELETE FROM persona WHERE  id = '" + valor + "'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dato eliminado");
                mostrarTabla("");
            } catch (SQLException ex) {
                Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
    }

    //deshabilitar campos
    public void deshabilitarTF() {
        tf_nombre.setEnabled(false);
        tf_edad.setEnabled(false);

    }

    //habilitar campos
    public void habilitarTF() {
        tf_nombre.setEnabled(true);
        tf_edad.setEnabled(true);

    }
    
    //deshabilitar botones
    public void deshabilitarBotones() {
        boton_guardar.setEnabled(false);
        boton_cancelar.setEnabled(false);
        boton_actualizar.setEnabled(false);

        boton_nuevo.setEnabled(true);

    }
    
    //fechas
    public void enviarfecha(){
        DateFormat df = DateFormat.getDateInstance(3);
        Date fechaActual = new Date();
        calendar_fecha.setDate(fechaActual);
        tf_fecha.setText(df.format(fechaActual));
    }

    
    //mostrar box
    public void buscarPorBox(){
        atributo = box_columnas.getSelectedItem().toString();
        mostrarTabla(tf_encontrar.getText());
    }
    
    //mostrar items
    public void mostrarItems(){
        box_columnas.addItem("id");
        box_columnas.addItem("nombre");
        box_columnas.addItem("edad");
        box_columnas.addItem("fecha");
                    calendar_fecha.setVisible(false);
            tf1.setEditable(false);
            tf2.setEditable(false);

            //bloquear
            tf_buscar.setEditable(false);
          
            //ventana en el centro
            setLocationRelativeTo(null);
            //fin
    }
    
    //probar Campos Vacios
    boolean probarCamposVacios(){
        String name, edad;
        name = tf_nombre.getText();
        edad = tf_edad.getText();
        boolean x = false;
        
        if(name.isEmpty() || edad.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese un nombre y una edad", "Aviso del registro", 2);
        }else{
            x = true;
        }
        return x;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_actualizar;
    private javax.swing.JButton boton_buscar;
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JButton boton_eliminar;
    private javax.swing.JButton boton_guardar;
    private javax.swing.JButton boton_limpiar;
    private javax.swing.JButton boton_modificar;
    private javax.swing.JButton boton_nuevo;
    private javax.swing.JButton boton_refrescar;
    private javax.swing.JComboBox<String> box_columnas;
    private com.toedter.calendar.JDateChooser calendar_fecha;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_ayuda;
    private javax.swing.JTabbedPane panel_pestanas;
    private javax.swing.JPanel panel_registro;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf_buscar;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_encontrar;
    private javax.swing.JTextField tf_fecha;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
}
