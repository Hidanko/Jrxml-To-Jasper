package br.com.sattra.JxmlCompiler;

import java.io.File;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;

public class Compilador {
	private static Compilador INSTANCE;

	public synchronized static Compilador getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Compilador();
		}
		return INSTANCE;
	}

	public boolean compilar(String caminho) throws JRException {

		String output = caminho + ".jasper";
		JasperCompileManager.compileReportToFile(caminho, output);
		if (new File(output).exists()) {
			System.out.println("Arquivo " + output + " gerado.");
			return true;
		}
		System.out.println("Erro ao criar o arquivo!");
		return false;

	}
}
