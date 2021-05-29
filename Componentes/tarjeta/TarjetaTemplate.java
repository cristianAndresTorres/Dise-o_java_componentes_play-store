package tarjeta;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import disegno.ObjDecoradorServicio;
import disegno.ObjGraficoServicio;

public class TarjetaTemplate  extends JPanel{
	private TarjetaComponent tarjetaComponent;
	//Recursos
	private ObjDecoradorServicio objDerServicio;
	private ObjGraficoServicio objGraServicio;
	
	private JLabel titulo_1;
	private JLabel titulo_2;
	private JLabel precio;
	private JLabel icono;
	
	private ImageIcon imgIcono;
	
	public TarjetaTemplate(TarjetaComponent tarjetaComponent, ImageIcon img, String titulo_1,
				String titulo_2, String precio, Color color) {
		this.tarjetaComponent = tarjetaComponent;
		
		
		//Servicios--------------------------------------------------------
		objGraServicio = ObjGraficoServicio.getServicioObjeto();
		objDerServicio = ObjDecoradorServicio.getServicioDercorador();
		
		//Titulos------------------------------------------------------------
		this.titulo_1 = objGraServicio.crearJLabel(titulo_1, 5, 185, 150, 75, objDerServicio.getFontTprincipal(), objDerServicio.getColorGris(), objDerServicio.getcMano());
		this.titulo_1.setHorizontalAlignment(SwingConstants.LEFT);
		this.titulo_2 = objGraServicio.crearJLabel(titulo_2, 5, 205, 150, 75, objDerServicio.getFontOpc(), objDerServicio.getColorGris(), objDerServicio.getcMano());
		this.titulo_2.setHorizontalAlignment(SwingConstants.LEFT);
		this.precio = objGraServicio.crearJLabel(precio, 5, 250, 205, 75, null, color, objDerServicio.getcMano());
		//Tamaño del icono----------------------------------------------------
		imgIcono = new ImageIcon(img.getImage().getScaledInstance(170, 200, Image.SCALE_AREA_AVERAGING));
		icono = objGraServicio.crearJLabel2("", 0, 0, 170, 200, null, null, null, imgIcono);
		
		
		this.add(this.titulo_1);
		this.add(this.titulo_2);
		this.add(this.precio);
		this.add(icono);
		
		//Caracteristicas de la ventana
		this.setSize(170, 300);
		this.setBackground(Color.white);
		this.setLayout(null);
		this.setVisible(true);
		
	}

}
