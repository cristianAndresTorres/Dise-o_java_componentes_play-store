package campoLibros;

import campoEntretenimiento.EntretenimientoTemplate;

public class LibroComponent {
	//Atributos
	
	private LibroTemplate libroTemplate;
	
	public LibroComponent() {
		libroTemplate = new LibroTemplate(this);
	}
	
	public LibroTemplate getTemplate() {
		return libroTemplate;
	}

}
