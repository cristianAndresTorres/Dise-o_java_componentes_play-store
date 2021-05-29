package campoPeliculas;

import campoMusica.MusicaTemplate;

public class PeliculaComponent {
	//Atributos
	
	private PeliculaTemplate peliculaTemplate;
	
	public PeliculaComponent() {
		peliculaTemplate = new PeliculaTemplate(this);
	}
	
	public PeliculaTemplate getTemplate() {
		return peliculaTemplate;
	}

}
