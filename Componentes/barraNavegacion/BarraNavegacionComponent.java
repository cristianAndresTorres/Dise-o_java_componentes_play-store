package barraNavegacion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import barraTitulo.BarraTituloTemplate;
import disegno.ObjDecoradorServicio;
import vistaPrincipal.VistaPrincipalComponent;

public class BarraNavegacionComponent extends MouseAdapter implements ActionListener{
	private BarraNavegacionTemplate barraNavegacionTemplate;
	private VistaPrincipalComponent vistaPrincipalComponent;
	private ObjDecoradorServicio objDecorador = ObjDecoradorServicio.getServicioDercorador();
	
	public BarraNavegacionComponent(VistaPrincipalComponent vistaPrincipalComponent) {
		barraNavegacionTemplate = new BarraNavegacionTemplate(this);
		this.vistaPrincipalComponent = vistaPrincipalComponent;
	}
	
	public BarraNavegacionTemplate getBarraNavTemplate() {
		return barraNavegacionTemplate;
	}


	//Evento
	@Override
	public void actionPerformed(ActionEvent e) {
		vistaPrincipalComponent.mostrarComponentes(e.getActionCommand().trim());
	}
	
	//Eventos de ratón
	//--------------------------------------------------------------------------------------------------------
	@Override
	public void mouseEntered(MouseEvent e) {
		JButton btnBoton = (JButton)e.getSource();
		if(btnBoton.getText().trim().equals("Entretenimiento"))btnBoton.setBackground(Color.DARK_GRAY);
		else if(btnBoton.getText().trim().equals("Apps"))btnBoton.setBackground(objDecorador.getColorVerde());
		else if(btnBoton.getText().trim().equals("Películas"))btnBoton.setBackground(objDecorador.getColorRojo());
		else if(btnBoton.getText().trim().equals("Musica"))btnBoton.setBackground(objDecorador.getColorNaranja());
		else if(btnBoton.getText().trim().equals("Libros"))btnBoton.setBackground(objDecorador.getColorAzulOscuro());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton btnBoton = (JButton)e.getSource();
		if(btnBoton.getText().trim().equals("Entretenimiento"))btnBoton.setBackground(objDecorador.getColorGris());
		else if(btnBoton.getText().trim().equals("Apps"))btnBoton.setBackground(objDecorador.getColorVerdeClaro());
		else if(btnBoton.getText().trim().equals("Películas"))btnBoton.setBackground(objDecorador.getColorRojoClaro());
		else if(btnBoton.getText().trim().equals("Musica"))btnBoton.setBackground(objDecorador.getColorNaranjaClaro());
		else if(btnBoton.getText().trim().equals("Libros"))btnBoton.setBackground(objDecorador.getColorAzulClaro());
	}
}
