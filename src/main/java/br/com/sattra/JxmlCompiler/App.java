package br.com.sattra.JxmlCompiler;

import java.io.File;

import javax.swing.JFileChooser;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;

public class App {
	public static void main(String[] args) throws JRException {
		File input = null;

		JFileChooser jfc = new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int retorno = jfc.showOpenDialog(null);
		input = jfc.getSelectedFile();

		// Verificando possiveis erros
		if (retorno == JFileChooser.CANCEL_OPTION) {
			System.out.println("Cancelado");
		} else if (retorno == JFileChooser.ERROR_OPTION || !input.getAbsolutePath().endsWith(".jrxml")
				|| !input.exists()) {
			System.out.println("Arquivo inválido!");

			// Somente executar se passar nos testes anteriores
		} else {

			Compilador compilador = Compilador.getInstance();
			boolean compilado = compilador.compilar(input.getPath());

			if (compilado) {
				System.out.println("Arquivo compilado.");
			}

		}
	}
}
