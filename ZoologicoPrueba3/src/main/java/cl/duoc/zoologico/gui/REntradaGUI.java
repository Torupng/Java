/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cl.duoc.zoologico.gui;

import static cl.duoc.zoologico.gui.EntradaGUI.servicio;
import cl.duoc.zoologico.models.Entrada;
import cl.duoc.zoologico.service.IZoologicoService;
import cl.duoc.zoologico.service.ZoologicoService;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mangl
 */
public class REntradaGUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form REntradaGUI
     */
    IZoologicoService servicio = EntradaGUI.servicio;
    public REntradaGUI() {
        initComponents();
        if(servicio == null)
            servicio =  new ZoologicoService();
        lista();
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
        tblEntradas = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reporte de entradas");

        tblEntradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblEntradas);

        btnEliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnEliminar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void lista(){
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("Rut del visitante");
        tabla.addColumn("Numero de telefóno");
        tabla.addColumn("Nombre");
        tabla.addColumn("Dirección");
        tabla.addColumn("Edad");
        tabla.addColumn("Estado civil");
        tabla.addColumn("Correo electronico");
        tblEntradas.setModel(tabla);
    
        for(Entrada entrada : servicio.listaEntrada()){
        Object[] fila = {
        entrada.getCodigo(),
        entrada.getVisita(),
        entrada.getFecha(),
        entrada.getTipo(),
        entrada.getColacion()
        };
        tabla.addRow(fila);
    }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEntradas;
    // End of variables declaration//GEN-END:variables
}
