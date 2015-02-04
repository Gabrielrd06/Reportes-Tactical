/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Views;

import Controllers.DetalleOrdenJpaController;
import Controllers.OrdenCompraJpaController;
import Controllers.TrabajadorJpaController;
import Entitys.Area;
import Entitys.DetalleOrden;
import Entitys.OrdenCompra;
import Reports.Reportes;
import Views.Settings.MT;
import Views.Settings.TableColumnAdjuster;
import Views.Settings.NumToTex;
import Views.Settings.VentanaInicio;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Gabriel
 */
public class frmReportesOrdenesC extends VentanaInicio {
     private static frmReportesOrdenesC instancia; 

    /**
     * Creates new form frmReportesOrdenesC
     */
    public frmReportesOrdenesC() {
        initComponents();
        this.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - this.getWidth() / 2,Toolkit.getDefaultToolkit().getScreenSize().height / 2 - this.getHeight() / 2 );   
        this.presentarDatos();
        this.setAnchoColumnas();
    }
    
    public static frmReportesOrdenesC getInstancia() {
        if (instancia == null) {
            instancia = new frmReportesOrdenesC();
        }
        return instancia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOrdenCompra = new javax.swing.JTable();
        btnVerReporte = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNumOrden = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reportes Ordenes De Compra");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Ordenes de Compra"));

        jTableOrdenCompra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableOrdenCompra);

        btnVerReporte.setText("Ver Reporte");
        btnVerReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnVerReporte)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerReporte)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Busqueda"));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Num Orden:");

        txtNumOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumOrdenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addGap(198, 198, 198))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void txtNumOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumOrdenActionPerformed

    private void btnVerReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerReporteActionPerformed
        // TODO add your handling code here:
        Reportes reporte = new Reportes();
        Map parametro = new HashMap();

        if (jTableOrdenCompra.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Orden de Compra", "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
        } else {         
            String moneda;
            OrdenCompra oc = (OrdenCompra) ((MT) jTableOrdenCompra.getModel()).getSeleccion(jTableOrdenCompra.getSelectedRow());  
            System.out.println(oc.getFechaEntrega());
            parametro.put("idordencompra", oc.getIdOrdenCompra());
            parametro.put("numordencompra", oc.getNumeroOrden().substring(0,4)+"-"+oc.getNumeroOrden().substring(4,7));
            Area oarea = oc.getIdSolicitante().getIdArea();
            parametro.put("supervisor",controladorTrabajador.buscarXResponsable(oarea).get(0).getApellidos()+" "+controladorTrabajador.buscarXResponsable(oarea).get(0).getNombres());
            parametro.put("elaboradopor",oc.getIdElaborador().getApellidos()+" "+oc.getIdElaborador().getNombres());
            if("S/. NUEVOS SOLES".equals(oc.getMoneda())){moneda = "NUEVOS SOLES";
            }else{moneda = "DÓLARES AMERICANOS";}
            parametro.put("moneda",moneda);       
            parametro.put("retraso",this.restarFechas(oc.getFechaRecepcion(),oc.getFechaEntrega())+ " días");
            parametro.put("firma",getClass().getResourceAsStream("/Reports/firma_opt.png"));
            //***Buscando Orden **//
            double subtotal=0;
            List<DetalleOrden> listDetalleOrden = controladorDetalleOrden.buscarXOrden(oc);
            for (DetalleOrden listDetalleOrden1 : listDetalleOrden) {
                subtotal = subtotal + listDetalleOrden1.getCantidad() * listDetalleOrden1.getPrecioorden();
            }
            double igv = subtotal * 0.18;
            double total = subtotal + igv;            
            ///////////////////////
            parametro.put("subtotal",subtotal);
            parametro.put("igv",igv);
            parametro.put("total",total); 
            //**Convertir Numero a letras para Ireport
            NumToTex num = new NumToTex();String enletras = num.convertirLetras((int) total);
            Double decimal = total- (int)total; 
            int intreporte = (int) ((Math.round(decimal*Math.pow(10,2))/Math.pow(10,2))*100);
                       
            enletras = enletras+" CON "+intreporte+"/100 "+moneda.toUpperCase();          
           ///////////////
            parametro.put("totalenletras",enletras.toUpperCase());
            
            try {
                reporte.ejecutarReporte("Reports/reporte1.jasper", parametro);
            } catch (Exception ex) {

            }
        }
    }//GEN-LAST:event_btnVerReporteActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    
//        if (!txtNumOrden.getText().equals("")) {
//            while (this.listOrdenCompra.size() > 0) {
//                this.listOrdenCompra.remove(0);
//            }
//            this.listOrdenCompra = controladorOrdenCompra.buscarxOrdenCompra(Integer.parseInt(null)txtNumOrden.getText());
//        }
//        this.presentarDatos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmReportesOrdenesC().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVerReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOrdenCompra;
    private javax.swing.JTextField txtNumOrden;
    // End of variables declaration//GEN-END:variables

    OrdenCompraJpaController controladorOrdenCompra = new OrdenCompraJpaController();
    DetalleOrdenJpaController controladorDetalleOrden = new DetalleOrdenJpaController();
    TrabajadorJpaController controladorTrabajador = new TrabajadorJpaController();
    
    List<OrdenCompra> listOrdenCompra;
    SimpleDateFormat fechaTabla = new SimpleDateFormat("dd' de 'MMMM' de 'yyyy",new Locale("es-ES"));
    
    @Override
    public void presentarDatos() {
        listOrdenCompra = controladorOrdenCompra.findOrdenCompraEntities();        
        Object[][] datos = new Object[listOrdenCompra.size()][6];
            for (int i = 0; i < listOrdenCompra.size(); i++) {
                datos[i][0] = listOrdenCompra.get(i).getNumeroOrden().subSequence(0,4)+"-"+listOrdenCompra.get(i).getNumeroOrden().subSequence(4,7);
                datos[i][1] = listOrdenCompra.get(i).getIdContacto().getIdProveedor().getRazonsocial();
                datos[i][2] = listOrdenCompra.get(i).getIdProyecto().getNombre();
                String fechaEntrega = fechaTabla.format(listOrdenCompra.get(i).getFechaEntrega());
                datos[i][3] = fechaEntrega;
                String fechaRecepcion;
                if(listOrdenCompra.get(i).getFechaRecepcion() != null){fechaRecepcion = fechaTabla.format(listOrdenCompra.get(i).getFechaRecepcion());
                }else {fechaRecepcion = "";}                
                datos[i][4] = fechaRecepcion; 
                datos[i][5] = this.restarFechas(listOrdenCompra.get(i).getFechaRecepcion(),listOrdenCompra.get(i).getFechaEntrega());
            }
            String[] columnas = {"NUMERO DE ORDEN","PROVEEDOR", "PROYECTO","F.ENTREGA","F.RECEPCION","RETRASO"};
            jTableOrdenCompra.setModel(new MT(columnas, datos, listOrdenCompra));
            this.setAnchoColumnas();    
    }

    @Override
    public void llenarCampos(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void presentarDatos(String opcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void llenarCampos(String opcion, Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void limpiarFormulario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setAnchoColumnas(){        
        jTableOrdenCompra.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        TableColumnAdjuster tca = new TableColumnAdjuster(jTableOrdenCompra);
        tca.adjustColumns();        
    }
    
    public long restarFechas(Date FechaMayor, Date FechaMenor) {
        long dias;
        if (FechaMayor != null && FechaMenor != null) {
            long diferencia = FechaMayor.getTime() - FechaMenor.getTime();
            dias = diferencia / (1000 * 60 * 60 * 24);
        } else {
            dias = 0;
        }

        return dias;
    }
}
