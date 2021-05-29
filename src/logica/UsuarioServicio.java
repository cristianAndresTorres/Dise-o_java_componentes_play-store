package logica;

import control.controlUsuario;

public class UsuarioServicio {
	private static UsuarioServicio servicio;
	private controlUsuario cUsuario;
	private String usuarioLogeado;
	
	public UsuarioServicio(){
		cUsuario = new controlUsuario();
	}
	
	public boolean verificarDatosUsuario(String nombreUsuario, String claveUsuario){
	    if(cUsuario.verificarUsuario(nombreUsuario, claveUsuario)){
	        this.usuarioLogeado = nombreUsuario;
	        return true;
	    }
	    return false;
	}
	
	
	
	public static UsuarioServicio getService(){
	    if(servicio == null)
	        servicio = new UsuarioServicio();
	    return servicio;
	}

}
