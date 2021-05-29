package barraNavegacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import disegno.ObjDecoradorServicio;
import disegno.ObjGraficoServicio;

public class BarraNavegacionTemplate extends JPanel{
	//Atributos
	private JButton btnEntre,btnApps,btnPeli, btnMusi, btnLibros; 
	private JButton btnCuen, btnFG,btnSus,btnCan,btnLD, btnAP, btnGP, btnInicio;
	private ImageIcon imgEntre,imgApps,imgPeli, imgMusi, imgLibros, imgAUX;
	
	private ObjDecoradorServicio objDecoradorServicio;
	private ObjGraficoServicio objGraficoServicio;
	
	private BarraNavegacionComponent barraNavegacionComponent;
	
	public BarraNavegacionTemplate(BarraNavegacionComponent barraNavegacionComponent) {
		this.barraNavegacionComponent = barraNavegacionComponent;
		objDecoradorServicio = ObjDecoradorServicio.getServicioDercorador();
		objGraficoServicio = ObjGraficoServicio.getServicioObjeto();
		
		this.crearObjDecoradores();
		this.crearBotonesCatalogo();
		this.crearBotonesInformativos();
		
		//Caracteristicas de la ventana
		this.setSize(215, 550);
		this.setBackground(objDecoradorServicio.getColorGrisMedio());
		this.setLayout(null);
		this.setVisible(true);
	}
	
	public void crearObjDecoradores() {
		imgEntre = new ImageIcon("Cliente/img/Entre.png");
		imgApps = new ImageIcon("Cliente/img/Apps.png");
		imgPeli = new ImageIcon("Cliente/img/Peli.png");
		imgMusi = new ImageIcon("Cliente/img/Musica.png");
		imgLibros = new ImageIcon("Cliente/img/Libros.png");		
	}
	
	public void crearBotonesCatalogo() {
		//Entretenimiento
		imgAUX = new ImageIcon(imgEntre.getImage().getScaledInstance(75, 55, Image.SCALE_AREA_AVERAGING));
		btnEntre = objGraficoServicio.crearBoton("   Entretenimiento", 0, 0, 215, 55, Color.white, objDecoradorServicio.getColorGris(), objDecoradorServicio.getcMano(), imgAUX);
		this.btnEntre.addActionListener(barraNavegacionComponent);
		this.btnEntre.addMouseListener(barraNavegacionComponent);
		this.add(btnEntre);
		//Apps
		imgAUX = new ImageIcon(imgApps.getImage().getScaledInstance(75, 55, Image.SCALE_AREA_AVERAGING));
		btnApps = objGraficoServicio.crearBoton("   Apps", 0, 55, 215, 55, Color.white, objDecoradorServicio.getColorVerdeClaro(), objDecoradorServicio.getcMano(), imgAUX);
		this.btnApps.addActionListener(barraNavegacionComponent);
		this.btnApps.addMouseListener(barraNavegacionComponent);
		this.add(btnApps);
		//Peliculas
		imgAUX = new ImageIcon(imgPeli.getImage().getScaledInstance(75, 55, Image.SCALE_AREA_AVERAGING));
		btnPeli = objGraficoServicio.crearBoton("   Películas", 0, 110, 215, 55, Color.white, objDecoradorServicio.getColorRojoClaro(), objDecoradorServicio.getcMano(), imgAUX);
		this.btnPeli.addActionListener(barraNavegacionComponent);
		this.btnPeli.addMouseListener(barraNavegacionComponent);
		this.add(btnPeli);
		//Musica
		imgAUX = new ImageIcon(imgMusi.getImage().getScaledInstance(75, 55, Image.SCALE_AREA_AVERAGING));
		btnMusi = objGraficoServicio.crearBoton("   Musica", 0, 165, 215, 55, Color.white, objDecoradorServicio.getColorNaranjaClaro(), objDecoradorServicio.getcMano(), imgAUX);
		this.btnMusi.addActionListener(barraNavegacionComponent);		
		this.btnMusi.addMouseListener(barraNavegacionComponent);
		this.add(btnMusi);
		//Musica
		imgAUX = new ImageIcon(imgLibros.getImage().getScaledInstance(75, 55, Image.SCALE_AREA_AVERAGING));
		btnLibros = objGraficoServicio.crearBoton("   Libros", 0, 220, 215, 55, Color.white, objDecoradorServicio.getColorAzulClaro(), objDecoradorServicio.getcMano(), imgAUX);
		this.btnLibros.addActionListener(barraNavegacionComponent);
		this.btnLibros.addMouseListener(barraNavegacionComponent);
		this.add(btnLibros);
	}
	
	public void crearBotonesInformativos() {		 
		 btnCuen = objGraficoServicio.crearBoton("Cuenta", 0, 285, 215, 30, objDecoradorServicio.getColorGris(), objDecoradorServicio.getColorGrisMedio(), objDecoradorServicio.getcMano(), null);
			 this.add(btnCuen);
		btnFG = objGraficoServicio.crearBoton("Formas de pago", 0, 315, 215, 30, objDecoradorServicio.getColorGris(), objDecoradorServicio.getColorGrisMedio(), objDecoradorServicio.getcMano(), null);
			this.add(btnFG);	
		btnSus = objGraficoServicio.crearBoton("Mis suscripciones", 0, 345, 215, 30, objDecoradorServicio.getColorGris(), objDecoradorServicio.getColorGrisMedio(), objDecoradorServicio.getcMano(), null);
			this.add(btnSus);	
		btnCan = objGraficoServicio.crearBoton("Canjear", 0, 375, 215, 30, objDecoradorServicio.getColorGris(), objDecoradorServicio.getColorGrisMedio(), objDecoradorServicio.getcMano(), null);
			this.add(btnCan);
		btnLD = objGraficoServicio.crearBoton("Lista de deseos", 0, 405, 215, 30, objDecoradorServicio.getColorGris(), objDecoradorServicio.getColorGrisMedio(), objDecoradorServicio.getcMano(), null);
			this.add(btnLD);	
		btnAP = objGraficoServicio.crearBoton("Mi actividad de Play", 0, 435, 215, 30, objDecoradorServicio.getColorGris(), objDecoradorServicio.getColorGrisMedio(), objDecoradorServicio.getcMano(), null);
			this.add(btnAP);	
		btnGP = objGraficoServicio.crearBoton("Guía de padres", 0, 465, 215, 30, objDecoradorServicio.getColorGris(), objDecoradorServicio.getColorGrisMedio(), objDecoradorServicio.getcMano(), null);
			this.add(btnGP);	
			
		btnInicio = objGraficoServicio.crearBoton("Inicio", 0, 495, 215, 30, Color.white, objDecoradorServicio.getColorAzulOscuro(), objDecoradorServicio.getcMano(), null);
			this.btnInicio.addActionListener(barraNavegacionComponent);	
			this.add(btnInicio);
	}

	//---------------------------------------------------
	//Getters and setters
	public JButton getBtnEntre() {return btnEntre;}
	public JButton getBtnApps() {return btnApps;}
	public JButton getBtnPeli() {return btnPeli;}
	public JButton getBtnMusi() {return btnMusi;}
	public JButton getBtnLibros() {return btnLibros;}
	public void setBtnLibros(JButton btnLibros) {this.btnLibros = btnLibros;}
	
	
	
	

}
