package com.mycompany.proyectocomputador;

import java.io.IOException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmComputador extends javax.swing.JFrame {

    MetodosComputador metodos = new MetodosComputador();
    Vector<computador> vectorComputadores = new Vector<>();
    Vector<computador> copiaComputadores = new Vector<>();
    DefaultTableModel modelo;

    public FrmComputador() {
        initComponents();
        modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        setLocationRelativeTo(null);
    }

    public void mostrarEnTabla() {
        modelo.setRowCount(0);

        for (computador c : vectorComputadores) {
            modelo.addRow(new Object[]{
                c.getCodigo(),
                c.getMarca(),
                c.getProcesador(),
                c.getRam()
            });
        }
    }

    public void limpiarCampos() {
        txtCodigo.setText("");
        txtMarca.setText("");
        txtProcesador.setText("");
        txtRam.setText("");
        txtValorBuscar.setText("");
        txtCodigo.requestFocus();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblProcesador = new javax.swing.JLabel();
        lblRam = new javax.swing.JLabel();
        lblBuscarPor = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtProcesador = new javax.swing.JTextField();
        txtRam = new javax.swing.JTextField();
        txtValorBuscar = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnOrdenAsc = new javax.swing.JButton();
        btnOrdenDesc = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        btnImportar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        cbOrdenarPor = new javax.swing.JComboBox<>();
        brnLimpiar = new javax.swing.JButton();
        cbBuscarPor = new javax.swing.JComboBox<>();
        txtBuscarpor = new javax.swing.JLabel();
        ordenarPor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCodigo.setText("Codigo");

        lblMarca.setText("Marca");

        lblProcesador.setText("Procesador");

        lblRam.setText("Ram");

        lblBuscarPor.setText("Valor Buscar");

        btnAdicionar.setText("Guardar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Ver Todos");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnOrdenAsc.setText("Ordenar Asc");
        btnOrdenAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenAscActionPerformed(evt);
            }
        });

        btnOrdenDesc.setText("Ordenar Desc");
        btnOrdenDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenDescActionPerformed(evt);
            }
        });

        btnCopiar.setText("Copiar");
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnExportar.setText("Exportar");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        btnImportar.setText("Importar");
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Marca", "Procesador", "RAM"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        cbOrdenarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "codigo", "marca", "procesador", "ram" }));

        brnLimpiar.setText("Limpiar");
        brnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnLimpiarActionPerformed(evt);
            }
        });

        cbBuscarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "codigo", "marca", "procesador", "ram" }));

        txtBuscarpor.setText("Buscar por");

        ordenarPor.setText("Ordenar por");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brnLimpiar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOrdenAsc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOrdenDesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCopiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExportar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnImportar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addGap(26, 26, 26)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProcesador)
                                    .addComponent(lblMarca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscarpor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ordenarPor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbOrdenarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBuscarPor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblRam)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarpor)
                    .addComponent(cbBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscarPor)
                    .addComponent(txtValorBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ordenarPor)
                            .addComponent(cbOrdenarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProcesador)
                            .addComponent(txtProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRam)
                    .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnMostrar)
                    .addComponent(btnBuscar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrdenAsc)
                    .addComponent(btnOrdenDesc)
                    .addComponent(btnCopiar)
                    .addComponent(btnExportar)
                    .addComponent(btnImportar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(brnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrarEnTabla();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        try {
            String codigo = txtCodigo.getText().trim();
            String marca = txtMarca.getText().trim();
            String procesador = txtProcesador.getText().trim();
            int ram = Integer.parseInt(txtRam.getText().trim());

            if (codigo.isEmpty() || marca.isEmpty() || procesador.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Complete todos los campos");
                return;
            }

            if (metodos.existeCodigo(vectorComputadores, codigo)) {
                JOptionPane.showMessageDialog(this, "El código ya existe, no se permiten duplicados");
                txtCodigo.requestFocus();
                return;
            }

            computador c = new computador(codigo, marca, procesador, ram);
            metodos.adicionarComputador(vectorComputadores, c);

            JOptionPane.showMessageDialog(this, "Computador agregado");
            // mostrarEnTabla();
            limpiarCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La RAM debe ser numérica");
        }

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            String atributo = cbBuscarPor.getSelectedItem().toString();
            String valor = txtValorBuscar.getText().trim();

            int pos = metodos.buscarComputador(vectorComputadores, atributo, valor);

            if (pos != -1) {
                String codigo = txtCodigo.getText().trim();
                String marca = txtMarca.getText().trim();
                String procesador = txtProcesador.getText().trim();
                int ram = Integer.parseInt(txtRam.getText().trim());

                metodos.actualizarComputador(vectorComputadores, pos, atributo, codigo, marca, procesador, ram);
                JOptionPane.showMessageDialog(this, "Actualizado correctamente");
                mostrarEnTabla();
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La RAM debe ser numérica");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnOrdenAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenAscActionPerformed
        String atributo = cbOrdenarPor.getSelectedItem().toString();
        metodos.ordenarAsc(vectorComputadores, atributo);
        mostrarEnTabla();
    }//GEN-LAST:event_btnOrdenAscActionPerformed

    private void btnOrdenDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenDescActionPerformed
        String atributo = cbOrdenarPor.getSelectedItem().toString();
        metodos.ordenarDesc(vectorComputadores, atributo);
        mostrarEnTabla();
    }//GEN-LAST:event_btnOrdenDescActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        copiaComputadores = metodos.copiarComputadores(vectorComputadores);
        JOptionPane.showMessageDialog(this, "Copia realizada. Total copiados: " + copiaComputadores.size());
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String atributo = cbBuscarPor.getSelectedItem().toString();
        String valor = txtValorBuscar.getText().trim();

        int pos = metodos.buscarComputador(vectorComputadores, atributo, valor);

        if (pos != -1) {
            metodos.eliminarComputador(vectorComputadores, pos);
            JOptionPane.showMessageDialog(this, "Eliminado correctamente");
            mostrarEnTabla();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        try {
            metodos.exportarArchivo(vectorComputadores, "computadores.txt");
            JOptionPane.showMessageDialog(this, "Datos exportados correctamente");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al exportar: " + e.getMessage());
        }
    }//GEN-LAST:event_btnExportarActionPerformed

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        try {
            vectorComputadores = metodos.importarArchivo("computadores.txt");
            mostrarEnTabla();
            JOptionPane.showMessageDialog(this, "Datos importados correctamente");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al importar: " + e.getMessage());
        }
    }//GEN-LAST:event_btnImportarActionPerformed

    private void brnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_brnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String atributo = cbBuscarPor.getSelectedItem().toString();
        String valor = txtValorBuscar.getText().trim();

        int pos = metodos.buscarComputador(vectorComputadores, atributo, valor);

        if (pos != -1) {
            computador c = vectorComputadores.get(pos);
            txtCodigo.setText(c.getCodigo());
            txtMarca.setText(c.getMarca());
            txtProcesador.setText(c.getProcesador());
            txtRam.setText(String.valueOf(c.getRam()));
            JOptionPane.showMessageDialog(this, "Se encontró");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmComputador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnLimpiar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnImportar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnOrdenAsc;
    private javax.swing.JButton btnOrdenDesc;
    private javax.swing.JComboBox<String> cbBuscarPor;
    private javax.swing.JComboBox<String> cbOrdenarPor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscarPor;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblProcesador;
    private javax.swing.JLabel lblRam;
    private javax.swing.JLabel ordenarPor;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel txtBuscarpor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtProcesador;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextField txtValorBuscar;
    // End of variables declaration//GEN-END:variables

}
