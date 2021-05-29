package vistaPrincipal;

import barraNavegacion.BarraNavegacionComponent;
import barraTitulo.BarraBuscadorComponent;
import campoApps.AppsComponent;
import campoEntretenimiento.EntretenimientoComponent;
import campoLibros.LibroComponent;
import campoMusica.MusicaComponent;
import campoPeliculas.PeliculaComponent;
import vistaIncial.LoginComponent;

public class VistaPrincipalComponent {
	//Atributos
	private VistaPrincipalTemplate ventanaPrincipalTem;
	
	//Declaracion de componentes
	
	private BarraBuscadorComponent barraBusComponente;
	private BarraNavegacionComponent barraNavegacionComponent;
	private LoginComponent loginComponent;
	
	public VistaPrincipalComponent(LoginComponent loginComponent) {
		this.loginComponent = loginComponent;
		ventanaPrincipalTem = new VistaPrincipalTemplate(this);
		
		barraBusComponente = new BarraBuscadorComponent(this);
		barraNavegacionComponent = new BarraNavegacionComponent(this);
		
		//Se añaden los paneles
		ventanaPrincipalTem.getJpPanelSuperior().add(barraBusComponente.getBarraTemplate());
		ventanaPrincipalTem.getJpPanelIzquierdo().add(barraNavegacionComponent.getBarraNavTemplate());
		//-------------------------------------------------------
		entretenimientoComponent = new EntretenimientoComponent();
		ventanaPrincipalTem.getJpPanelCentral().add(entretenimientoComponent.getTemplate());
	}
	//---------------------------------------------------------
	public void mostrarComponentes(String componente) {
		//Se remueve el contenido del panel
		ventanaPrincipalTem.getJpPanelCentral().removeAll();
		 //Se van actualizando los componentes del panel central/Principal. Con base en los botones(Eventos)
		switch (componente) {
		case "Entretenimiento":
			ventanaPrincipalTem.getJpPanelCentral().add(entretenimientoComponent.getTemplate());
			break;
		case "Apps":
			if(appsComponent == null) {appsComponent = new AppsComponent();}
			ventanaPrincipalTem.getJpPanelCentral().add(appsComponent.getTemplate());
			
			break;
		case "Películas":
			if(peliculaComponent==null) {peliculaComponent= new PeliculaComponent();}
			ventanaPrincipalTem.getJpPanelCentral().add(peliculaComponent.getTemplate());
			
			break;	
		case "Musica":
			if(musicaComponent==null) {musicaComponent = new MusicaComponent();}
			ventanaPrincipalTem.getJpPanelCentral().add(musicaComponent.getTemplate());
			
			break;
		case "Libros":
			if(libroComponent==null) {libroComponent = new LibroComponent();}
			ventanaPrincipalTem.getJpPanelCentral().add(libroComponent.getTemplate());
			break;	
		case "Inicio":
			loginComponent.getLoginTemplate().setVisible(true);
			ventanaPrincipalTem.setVisible(false);
			break;	
			
		default:
			break;
		}
		//Se re-pinta nuevamente el panel
		ventanaPrincipalTem.repaint();
		
	}
	
	public void moverVentana(int posicionX, int posicionY) {
		this.ventanaPrincipalTem.setLocation(posicionX, posicionY);
	}
	
	
	//Getters and setters
	//-------------------------------------------------------
	public VistaPrincipalTemplate getVentanaPrincipalTem() {
		return ventanaPrincipalTem;
	}
	
	
	//---------------------------------------------------------
	private EntretenimientoComponent entretenimientoComponent;
	private AppsComponent appsComponent;
	private PeliculaComponent peliculaComponent;
	private MusicaComponent musicaComponent;
	private LibroComponent libroComponent;	
}
