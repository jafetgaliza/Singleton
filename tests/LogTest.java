

import static org.junit.Assert.*;
import log.Log;

import org.junit.Test;

public class LogTest {

	@Test
	public void testGravarMensagem() {
		Log l = Log.getInstance();
		l.gravar("pas1");
		
		assertEquals("pas1;\n", l.mostrarMensagens());

		l.limpar();
	}
	
	@Test
	public void testeGravarDuasMensagens() {
		Log l = Log.getInstance();
		l.gravar("pas1");
		l.gravar("poo");
		
		assertEquals("pas1;\npoo;\n", l.mostrarMensagens());

		l.limpar();

	}
	
	@Test
	public void testSingleton(){
		
		Log l = Log.getInstance();
		l.gravar("qualquer coisa...");
		
		Log l2 = Log.getInstance();
		l2.gravar("alguma coisa...");
		
		assertEquals("qualquer coisa...;\nalguma coisa...;\n", l.mostrarMensagens());
		
		l.limpar();
	}
	
	@Test
	public void testLimpar() {
		Log l = Log.getInstance();
		l.gravar("limpando...");
		
		l.limpar();

		assertEquals("", l.mostrarMensagens());
	}

}