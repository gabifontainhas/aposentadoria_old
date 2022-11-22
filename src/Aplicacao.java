import java.util.Calendar;
import java.util.Scanner;

/*42) Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para
estar em condições, um dos seguintes requisitos deve ser satisfeito:
- Ter no mínimo 65 anos de idade.
- Ter trabalhado no mínimo 30 anos.
- Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
Com base nas informações acima, faça um algoritmo que leia:
 
o número do empregado (código), 
o ano de seu nascimento 
ano de seu ingresso na empresa. 
O programa deverá escrever a idade e o tempo
de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'. 
 */

public class Aplicacao {
	public static void main (String args[]) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Informe seu código: ");
			int codigo = Integer.valueOf(scanner.next());
			System.out.print("Informe sua data de nascimento (formato dd/MM/aaaa): ");
			String dataTemp = String.valueOf(scanner.next());			
			Calendar dataNascimento = Calendar.getInstance();
			dataNascimento.set(Integer.valueOf(dataTemp.substring(6, 10)), Integer.valueOf(dataTemp.substring(3, 5))-1, Integer.valueOf(dataTemp.substring(0,2)));			
			System.out.print("Informe sua data de contratação (formato dd/MM/aaaa): ");
			dataTemp = String.valueOf(scanner.next());	
			Calendar dataContratacao = Calendar.getInstance();
			dataContratacao.set(Integer.valueOf(dataTemp.substring(6, 10)), Integer.valueOf(dataTemp.substring(3, 5))-1, Integer.valueOf(dataTemp.substring(0,2)));			
			Funcionario funcionario = new Funcionario(codigo, dataNascimento, dataContratacao);			
			System.out.println("A idade do funcionário é: " + funcionario.getIdade());
			System.out.println("O tempo trabalhado do funcionário é: " + funcionario.getTempoTrabalhado());		
			if (new Aposentadoria().podeAposentar(funcionario)) 
				System.out.println("O funcionário pode se aposentar. Requerer aposentadoria.");
			else 
				System.out.println("O funcionário não pode se aposentar. Não requerer aposentadoria. ");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
