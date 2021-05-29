package campoMusica;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import disegno.ObjDecoradorServicio;
import disegno.ObjGraficoServicio;
import tarjeta.TarjetaComponent;

public class MusicaTemplate extends JPanel{
	private MusicaComponent musicaComponent;
	
	private JPanel jpPanel_1, jpPanel_2, jpPanel_3, jpPanel_4, jpPanel_5;
	private ImageIcon imgPanel_1, imgPanel_2, imgPanel_3, imgPanel_4, imgPanel_5;
	
	private ObjDecoradorServicio objDeServicio;
	private ObjGraficoServicio objGraServicio;
	
	
	public MusicaTemplate(MusicaComponent musicaComponent) {
		this.musicaComponent = musicaComponent;
		
		
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
			imgPanel_1 = new ImageIcon("Cliente/img/musica_1.png");
			imgPanel_2 = new ImageIcon("Cliente/img/musica_2.png");
			imgPanel_3 = new ImageIcon("Cliente/img/musica_3.png");
			imgPanel_4 = new ImageIcon("Cliente/img/musica_4.png");
			imgPanel_5 = new ImageIcon("Cliente/img/musica_5.png");
			
		}
		
		public void agregarComponentesPanel() {
			jpPanel_1.add((new TarjetaComponent(imgPanel_1, "Dreamland", "Glass Animals", "$ 20.000,00", objDeServicio.getColorNaranja())).getTarjetaTemplate());
			jpPanel_2.add((new TarjetaComponent(imgPanel_2, "Blinding Lights", "Vibe2Vibe", "$ 2.200,00",objDeServicio.getColorNaranja())).getTarjetaTemplate());
			jpPanel_3.add((new TarjetaComponent(imgPanel_3, "What You're Made", "Lindsey Stirling", "$ 5.000,00",objDeServicio.getColorNaranja())).getTarjetaTemplate());
			jpPanel_4.add((new TarjetaComponent(imgPanel_4, "All Night", "Zion & Lennox", "$ 5.000,00",objDeServicio.getColorNaranja())).getTarjetaTemplate());
			jpPanel_5.add((new TarjetaComponent(imgPanel_5, "This Is Life", "Jesseee B", "$ 13.000,00",objDeServicio.getColorNaranja())).getTarjetaTemplate());
			
		}
	
	
}
