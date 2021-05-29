package barraTitulo;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import disegno.ObjDecoradorServicio;
import disegno.ObjGraficoServicio;

public class BarraTituloTemplate extends JPanel{
	private BarraBuscadorComponent barraComponente;
	
	private ObjGraficoServicio objGraServicio;
	private ObjDecoradorServicio objDerServicio;
	//Objetos graficos
	private JLabel jlLogo, jlTitulo, icono;
	private JButton btnCerrar, btnBuscar;
	//Objetos Decoradores
	private ImageIcon ilogoApp, iDimAux;
	private Font fontTituloBarra;
	private JTextField jtxtBuscador;
	private ImageIcon img;
	
	public BarraTituloTemplate(BarraBuscadorComponent barraComponente) {
		this.barraComponente = barraComponente;
		this.objGraServicio = ObjGraficoServicio.getServicioObjeto();
		this.objDerServicio = ObjDecoradorServicio.getServicioDercorador();
		//--------------------------------------------------------------------
		this.crearObjDecoradores();
		this.crearBotones();
		this.asignarTitulos();
		this.asignarBuscador();
		
		
		this.addMouseMotionListener(barraComponente);
		this.addMouseListener(barraComponente);
		
		//Caracteristicas de la ventana
		this.setSize(1200, 65);
		this.setBackground(objDerServicio.getColorGrisMedio());
		this.setLayout(null);
		this.setVisible(true);
	}
	
	public void crearObjDecoradores() {
		ilogoApp = new ImageIcon("Cliente/img/logo.png");
		fontTituloBarra = new Font("Britannic Bold", Font.BOLD, 24);
		img = new ImageIcon("Cliente/img/lupa.png");
		
	}
	
	public void crearBotones() {
		iDimAux = new ImageIcon(objDerServicio.getIcerrar().getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
		btnCerrar = objGraServicio.crearBoton(null, 1165, 10, 25, 25, null, objDerServicio.getColorGrisMedio(), objDerServicio.getcMano(), iDimAux);
		btnCerrar.addActionListener(barraComponente);
		
		img = new ImageIcon(img.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
		btnBuscar = objGraServicio.crearBoton("", 600+250+20, 20, 60, 28, null, new Color(69, 132, 239), objDerServicio.getcMano(), img);
		this.add(btnCerrar);
		this.add(btnBuscar);
	}	
	
	public void asignarTitulos() {
		//Logo del aplicativo 
		ilogoApp = new ImageIcon(ilogoApp.getImage().getScaledInstance(45, 45, Image.SCALE_AREA_AVERAGING));
		jlLogo = objGraServicio.crearJLabel2(null, 35, 10, 45, 45, null, null, objDerServicio.getcMano(),ilogoApp);
		this.add(jlLogo);
		//Titulo Logo
		jlTitulo = objGraServicio.crearJLabel("Google Play", 35, 10, 250, 50, fontTituloBarra, objDerServicio.getColorGris(), objDerServicio.getcMano());
		this.add(jlTitulo);
		
	}
	
	public void asignarBuscador() {
		jtxtBuscador = objGraServicio.crearJTextField(" Buscar", 270, 20, 600, 28, Color.white, objDerServicio.getColorGris(), objDerServicio.getColorGris(), BorderFactory.createLineBorder(objDerServicio.getColorGrisClaro(), 1, true));
		jtxtBuscador.setHorizontalAlignment(SwingConstants.LEFT);
		this.add(jtxtBuscador);
	}
	

}
