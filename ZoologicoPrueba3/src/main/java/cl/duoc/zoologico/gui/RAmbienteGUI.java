/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cl.duoc.zoologico.gui;

import cl.duoc.zoologico.models.Ambiente;
import cl.duoc.zoologico.service.IZoologicoService;
import cl.duoc.zoologico.service.ZoologicoService;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mangl
 */
public class RAmbienteGUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form RAmbienteGUI
     */
    IZoologicoService servicio = AmbienteGUI.servicio;
    public RAmbienteGUI() {
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
        tblAmbientes = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Reporte de ambientes");

        tblAmbientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblAmbientes);

        btnEliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnEliminar)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void lista(){
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("Nombre animal");
        tabla.addColumn("Sector");
        tabla.addColumn("Nombre de la jaula");
        tabla.addColumn("Mantención de la jaula");
        tabla.addColumn("Ecosistema en el que vive");
        tabla.addColumn("Descripción");
        tblAmbientes.setModel(tabla);
    
        for(Ambiente ambiente : servicio.listaAmb()){
        Object[] fila = {
        ambiente.getListaAnimal().get(1),
        ambiente.getSector(),
        ambiente.getNombreJaula(),
        ambiente.getMantencion(),
        ambiente.getEcosistema(),
        ambiente.getDescripcion()
        };
        tabla.addRow(fila);
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAmbientes;
    // End of variables declaration//GEN-END:variables
}
