package campoEntretenimiento;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import disegno.ObjDecoradorServicio;
import disegno.ObjGraficoServicio;
import tarjeta.TarjetaComponent;

public class EntretenimientoTemplate extends JPanel{
	private EntretenimientoComponent entretenimientoComponent;
	
	private JPanel jpPanel_1, jpPanel_2, jpPanel_3, jpPanel_4, jpPanel_5, jpGeneral;
	private ImageIcon imgPanel_1, imgPanel_2, imgPanel_3, imgPanel_4, imgPanel_5;
	private ImageIcon img_btn_1, img_btn_2;
	
	
	
	private ObjDecoradorServicio objDeServicio;
	private ObjGraficoServicio objGraServicio;
	
	public EntretenimientoTemplate(EntretenimientoComponent entretenimientoComponent) {
		this.entretenimientoComponent = entretenimientoComponent;
		
		
		this.objDeServicio = ObjDecoradorServicio.getServicioDercorador();
		this.objGraServicio = ObjGraficoServicio.getServicioObjeto();
		
		//Llamado de los componentes
		this.crearPaneles();
		this.agregarObjetosGraficos();
		this.agregarComponentesPanel();
		
		this.crearBotonAnimacion();
		this.crearPanelAnimacion();
		this.inicializarComponentes();
		
		//Caracteristicas de la ventana
		this.setSize(985, 550);
		this.setBackground(objDeServicio.getColorGrisMedio());
		this.setLayout(null);
		this.setVisible(true);
		
	}
	
	public void crearPaneles() {
		jpPanel_1 = objGraServicio.crearPanel(55, 165, 170, 300, Color.WHITE);
		jpPanel_2 = objGraServicio.crearPanel(235, 165, 170, 300, Color.WHITE);
		jpPanel_3 = objGraServicio.crearPanel(415, 165, 170, 300, Color.WHITE);
		jpPanel_4 = objGraServicio.crearPanel(595, 165, 170, 300, Color.WHITE);
		jpPanel_5 = objGraServicio.crearPanel(775, 165, 170, 300, Color.WHITE);
		jpGeneral = objGraServicio.crearPanel(100, 0, 750, 145, objDeServicio.getColorGrisMedio());
				
		this.add(jpPanel_1);
		this.add(jpPanel_2);
		this.add(jpPanel_3);
		this.add(jpPanel_4);
		this.add(jpPanel_5);
		this.add(jpGeneral);
	}
			
	public void agregarObjetosGraficos() {
		imgPanel_1 = new ImageIcon("Cliente/img/libro_1.png");
		imgPanel_2 = new ImageIcon("Cliente/img/musica_2.png");
		imgPanel_3 = new ImageIcon("Cliente/img/peli3.png");
		imgPanel_4 = new ImageIcon("Cliente/img/juego_5.png");
		imgPanel_5 = new ImageIcon("Cliente/img/juego_1.png");
				
	}
	//--------------------------------------------------------------
	//Creación de los paneles			
	public void agregarComponentesPanel() {
		jpPanel_1.add((new TarjetaComponent(imgPanel_1, "La depresión (no) Existe", "Cecilia Ramos Valencia", "$ 29.900,00", objDeServicio.getColorAzulOscuro())).getTarjetaTemplate());
		jpPanel_2.add((new TarjetaComponent(imgPanel_2, "Blinding Lights", "Vibe2Vibe", "$ 2.200,00",objDeServicio.getColorNaranja())).getTarjetaTemplate());
		jpPanel_3.add((new TarjetaComponent(imgPanel_3, "1979", "Acción", "$ 10.000,00",objDeServicio.getColorRojo())).getTarjetaTemplate());
		jpPanel_5.add((new TarjetaComponent(imgPanel_5, "Battele Legion-Mas", "Trapliight Ltda.", "Free", objDeServicio.getColorVerde())).getTarjetaTemplate());
		jpPanel_4.add((new TarjetaComponent(imgPanel_4, "Line: Llamada y mensajes", "Line Corporation", "Free",objDeServicio.getColorVerde())).getTarjetaTemplate());
		
	}
	//---------------------------------------------------------------------------------------------------------------------
	//Animación 
	public void crearBotonAnimacion() {
		img_btn_1 = new ImageIcon("Cliente/img/derecha.png");
		img_btn_2 = new ImageIcon("Cliente/img/izquierda.png");
		
		
		img_btn_1 = new ImageIcon(img_btn_1.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));
		btnAnimacion_der = objGraServicio.crearBoton("", 865, 65, 40, 40, null, objDeServicio.getColorGrisMedio(), objDeServicio.getcMano(), img_btn_1);
		btnAnimacion_der.addActionListener(entretenimientoComponent);
		this.add(btnAnimacion_der);
		img_btn_2 = new ImageIcon(img_btn_2.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));
		btnAnimacion_izq = objGraServicio.crearBoton("", 20, 65, 40, 40, null, objDeServicio.getColorGrisMedio(), objDeServicio.getcMano(), img_btn_2);
		btnAnimacion_izq.addActionListener(entretenimientoComponent);
		this.add(btnAnimacion_izq);
	}
	
	public void crearPanelAnimacion() {
		this.jpAnimacion = objGraServicio.crearPanel(0, 0, 3000, 145, new Color(0,0,0,0));
		this.jpGeneral.add(jpAnimacion);
	}
	
	public void inicializarComponentes() {
		img_1 = new ImageIcon("Cliente/img/img_1.png");
		img_2 = new ImageIcon("Cliente/img/img_2.png");
		img_3 = new ImageIcon("Cliente/img/img_3.png");
		img_4 = new ImageIcon("Cliente/img/img_4.png");
		
		img_Aux = new ImageIcon(img_1.getImage().getScaledInstance(750, 145, Image.SCALE_AREA_AVERAGING));
		jlImg_1 = objGraServicio.crearJLabel2("", 0, 0, 750, 145, null, null, null, img_Aux);
		jpAnimacion.add(jlImg_1);		
		img_Aux = new ImageIcon(img_2.getImage().getScaledInstance(750, 145, Image.SCALE_AREA_AVERAGING));
		jlImg_2 = objGraServicio.crearJLabel2("", 750, 0, 750, 145, null, null, null, img_Aux);
		jpAnimacion.add(jlImg_2);
		
		img_Aux = new ImageIcon(img_3.getImage().getScaledInstance(750, 145, Image.SCALE_AREA_AVERAGING));
		jlImg_3 = objGraServicio.crearJLabel2("", 1500, 0, 750, 145, null, null, null, img_Aux);
		jpAnimacion.add(jlImg_3);	
		
		img_Aux = new ImageIcon(img_4.getImage().getScaledInstance(750, 145, Image.SCALE_AREA_AVERAGING));
		jlimg_4 = objGraServicio.crearJLabel2("", 2250, 0, 750, 145, null, null, null, img_Aux);
		jpAnimacion.add(jlimg_4);
		
	}

	public JPanel getPanelAnimacion() {
		return jpAnimacion;
	}
	
	//---------------------------------------------------------------------------
	
	
	
	public JButton getBtnAnimacion_der() {
		return btnAnimacion_der;
	}

	public JButton getBtnAnimacion_izq() {
		return btnAnimacion_izq;
	}

	//Animación
	private JButton btnAnimacion_der,btnAnimacion_izq;
	private JPanel jpAnimacion;
	private ImageIcon img_1, img_2, img_3, img_4, img_Aux;
	private JLabel jlImg_1, jlImg_2, jlImg_3, jlimg_4;

}
