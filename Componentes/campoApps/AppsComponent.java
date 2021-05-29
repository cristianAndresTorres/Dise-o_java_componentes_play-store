package campoApps;

public class AppsComponent {
	//Atributos
	
	private AppsTemplate appsTemplate;
	
	public AppsComponent() {
		appsTemplate = new AppsTemplate(this);
	}
	
	public AppsTemplate getTemplate() {
		return appsTemplate;
	}
	

}
