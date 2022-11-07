package Interfaz;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JCheckBox;

public class PanelDescuentos extends JPanel {
	private JCheckBox chckbxProntoPago;
	private JCheckBox chckbxTrasladoDeCuenta;
	private JCheckBox chckbxServicioPublico;

	/**
	 * Create the panel.
	 */
	public PanelDescuentos() {
		setBorder(new TitledBorder(null, "Descuentos", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		setLayout(new GridLayout(2, 2, 5, 5));
		
		chckbxProntoPago = new JCheckBox("Pronto pago");
		add(chckbxProntoPago);
		
		chckbxTrasladoDeCuenta = new JCheckBox("Traslado de cuenta");
		add(chckbxTrasladoDeCuenta);
		
		chckbxServicioPublico = new JCheckBox("Servicio publico");
		add(chckbxServicioPublico);

	}

   public boolean hayDescuentoProntoPago() {
	   return chckbxProntoPago.isSelected();
   }

   
   public boolean hayDescuentoTrasladoCuenta(){
	   return chckbxTrasladoDeCuenta.isSelected();
   }
  
   public boolean hayDescuentoServicioPublico(){
	   return chckbxServicioPublico.isSelected();
   }

   public void limpiar(){
	   chckbxProntoPago.setSelected(false);
	   chckbxServicioPublico.setSelected(false);
	   chckbxTrasladoDeCuenta.setSelected(false);
   }
   
}
