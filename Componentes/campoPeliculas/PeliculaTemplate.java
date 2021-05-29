package campoPeliculas;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import disegno.ObjDecoradorServicio;
import disegno.ObjGraficoServicio;
import tarjeta.TarjetaComponent;

public class PeliculaTemplate extends JPanel{
	private PeliculaComponent peliculaComponent;
	private JPanel jpPanel_1, jpPanel_2, jpPanel_3, jpPanel_4, jpPanel_5;
	private ImageIcon imgPanel_1, imgPanel_2, imgPanel_3, imgPanel_4, imgPanel_5;
	
	private ObjDecoradorServicio objDeServicio;
	private ObjGraficoServicio objGraServicio;
	
	
	public PeliculaTemplate(PeliculaComponent peliculaComponent) {
		this.peliculaComponent = peliculaComponent;
		
		this.objDeServicio = ObjDecoradorServicio.getServicioDercorador();
		this.objGraServicio = ObjGraficoServicio.getServicioObjeto();
		
		//Llamado de los componentes
		this.crearPaneles();
		this.agregarObjetosGraficos();
		this.agregarComponentesPanel();
		
		
		
		//Caracteristicas de la ventana
		this.setSize(985, 550);
		this.setBackground(objDeServicio.getColorGrisMedio());
		this.setLayout(null);
		this.setVisible(true);
		
	}
	
	//--------------------------------------------------------------
	//Creación de los paneles
	public void crearPaneles() {
		jpPanel_1 = objGraServicio.crearPanel(55, 165, 170, 300, Color.WHITE);
		jpPanel_2 = objGraServicio.crearPanel(235, 165, 170, 300, Color.WHITE);
		jpPanel_3 = objGraServicio.crearPanel(415, 165, 170, 300, Color.WHITE);
		jpPanel_4 = objGraServicio.crearPanel(595, 165, 170, 300, Color.WHITE);
		jpPanel_5 = objGraServicio.crearPanel(775, 165, 170, 300, Color.WHITE);
		
		this.add(jpPanel_1);
		this.add(jpPanel_2);
		this.add(jpPanel_3);
		this.add(jpPanel_4);
		this.add(jpPanel_5);
	}
	
	public void agregarObjetosGraficos() {
		imgPanel_1 = new ImageIcon("Cliente/img/peli_1.png");
		imgPanel_2 = new ImageIcon("Cliente/img/peli2.png");
		imgPanel_3 = new ImageIcon("Cliente/img/peli3.png");
		imgPanel_4 = new ImageIcon("Cliente/img/peli4.png");
		imgPanel_5 = new ImageIcon("Cliente/img/peli5.png");
		
	}
	
	public void agregarComponentesPanel() {
		jpPanel_1.add((new TarjetaComponent(imgPanel_1, "¡SCOOBY!", "Animación", "$ 48.000,00", objDeServicio.getColorRojo())).getTarjetaTemplate());
		jpPanel_2.add((new TarjetaComponent(imgPanel_2, "Sonic", "Animación y aventura", "$ 16.000,00",objDeServicio.getColorRojo())).getTarjetaTemplate());
		jpPanel_3.add((new TarjetaComponent(imgPanel_3, "1979", "Acción", "$ 10.000,00",objDeServicio.getColorRojo())).getTarjetaTemplate());
		jpPanel_4.add((new TarjetaComponent(imgPanel_4, "Bad Boys for Life", "Acción y Aventura", "$ 48.000,00",objDeServicio.getColorRojo())).getTarjetaTemplate());
		jpPanel_5.add((new TarjetaComponent(imgPanel_5, "Deathstroke", "Acción y Aventura", "$ 56.000,00",objDeServicio.getColorRojo())).getTarjetaTemplate());
		
	}
	
}
