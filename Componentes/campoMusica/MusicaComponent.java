package campoMusica;

import campoLibros.LibroTemplate;

public class MusicaComponent {
	//Atributos
	
	private MusicaTemplate musicaTemplate;
	
	public MusicaComponent() {
		musicaTemplate = new MusicaTemplate(this);
	}
	
	public MusicaTemplate getTemplate() {
		return musicaTemplate;
	}

}
