package barraTitulo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import vistaPrincipal.VistaPrincipalComponent;

public class BarraBuscadorComponent extends MouseAdapter implements ActionListener, MouseMotionListener{
	//Atributos
	private BarraTituloTemplate barraTemplate;
	private VistaPrincipalComponent vistaPrincipalComponent;
	private int posicionX, posicionY;
	
	public BarraBuscadorComponent(VistaPrincipalComponent vistaPrincipalComponent) {
		//Por inyección de dependencias
		barraTemplate = new BarraTituloTemplate(this);
		this.vistaPrincipalComponent = vistaPrincipalComponent;
	}
	
	
	
	//-------------------------------------------------------
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	//Getters and setters
	//--------------------------------------------------------

	public BarraTituloTemplate getBarraTemplate() {
		return barraTemplate;
	}


	//Eventos del Mouse------------------------------------------------------------------------------------
	@Override
	public void mouseDragged(MouseEvent e) {
		vistaPrincipalComponent.moverVentana(e.getXOnScreen() - posicionX, e.getYOnScreen()-posicionY);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		posicionY = e.getY();
		posicionX = e.getX();
	}
	@Override
	public void mouseReleased(MouseEvent e) {}
}
