import java.util.Calendar;

public class DateHelper {
	public static boolean verificaSeJaFezAniversario(Calendar dataDesejada) {
		Calendar hoje = Calendar.getInstance();
		if (hoje.get(Calendar.MONTH) < dataDesejada.get(Calendar.MONTH) || 
				(hoje.get(Calendar.MONTH) == dataDesejada.get(Calendar.MONTH) && 
				hoje.get(Calendar.DAY_OF_MONTH) < dataDesejada.get(Calendar.DAY_OF_MONTH)))
			return true;
		return false;
	}
	
	private static int calcularAnoBruto(Calendar dataDesejada) {
		Calendar hoje = Calendar.getInstance();
		return Integer.valueOf(hoje.get(Calendar.YEAR)) - Integer.valueOf(dataDesejada.get(Calendar.YEAR));	
	}
	
	public static int calcularAno(Calendar dataDesejada) {
		int ano = calcularAnoBruto(dataDesejada);
		if (verificaSeJaFezAniversario(dataDesejada))
			ano-=1;	
		return ano;
	}
}
