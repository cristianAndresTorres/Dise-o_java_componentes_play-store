package vistaPrincipal;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import disegno.ObjDecoradorServicio;
import disegno.ObjGraficoServicio;

public class VistaPrincipalTemplate extends JFrame{
	//Atributos
	
	private ObjGraficoServicio objGrafico;
	private JPanel jpPanelIzquierdo;
	private JPanel jpPanelCentral;
	private JPanel jpPanelSuperior;
	private ObjDecoradorServicio objFraSer;
	
	private VistaPrincipalComponent vistaPrincipalComponent;
	
	//Constructor
	public VistaPrincipalTemplate(VistaPrincipalComponent vistaPrincipalComponent) {
		this.vistaPrincipalComponent = vistaPrincipalComponent;
		this.objFraSer = ObjDecoradorServicio.getServicioDercorador();
		
		this.setTitle("Google Play Store");
		this.setSize(1200,600);
		this.setLocationRelativeTo(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.setLayout(null);
		this.setVisible(true);
		
		objGrafico = ObjGraficoServicio.getServicioObjeto();
		
		this.asignarPaneles();
		this.agregarPaneles();
		
	}
	
	public void asignarPaneles() {
		jpPanelSuperior = objGrafico.crearPanel(0, 0, 1200, 65, Color.gray);
		jpPanelIzquierdo = objGrafico.crearPanel(0, 65, 215, 550, Color.cyan);
		jpPanelCentral = objGrafico.crearPanel(215, 65, 985, 550, objFraSer.getColorGrisMedio());
	}
	
	public void agregarPaneles() {
		this.add(jpPanelSuperior);
		this.add(jpPanelIzquierdo);
		this.add(jpPanelCentral);
	}
	
	

	//Getters and setters--------------------------------------------------
	public JPanel getJpPanelIzquierdo() {
		return jpPanelIzquierdo;
	}

	public JPanel getJpPanelCentral() {
		return jpPanelCentral;
	}

	public JPanel getJpPanelSuperior() {
		return jpPanelSuperior;
	}

}
