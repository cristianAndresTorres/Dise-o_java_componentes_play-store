package tarjeta;

import java.awt.Color;

import javax.swing.ImageIcon;

public class TarjetaComponent {
	private TarjetaTemplate tarjetaTemplate;
	
	//Constructor
	public TarjetaComponent(ImageIcon img, String titulo_1, String titulo_2, String precio, Color color) {
		this.tarjetaTemplate = new TarjetaTemplate(this,img, titulo_1, titulo_2, precio, color);
	}
	
	
	public TarjetaTemplate getTarjetaTemplate() {
		return tarjetaTemplate;
	}

}
