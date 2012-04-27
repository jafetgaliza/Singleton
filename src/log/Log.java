package log;


public class Log {
	private String mensagem = "";
	//private ArrayList<String> msg = new ArrayList<String>();
	private static Log log;
	
	private Log(){
	
	}
	
	public static Log getInstance() {
		if (log == null)
			log = new Log();
		return log;
	}
	
	public void gravar(String msg) {
		this.mensagem += msg +";\n";
	}
	
	public String mostrarMensagens() {
		
		return mensagem;
	}
	
	public void limpar() {
		this.mensagem = "";
	}
}
