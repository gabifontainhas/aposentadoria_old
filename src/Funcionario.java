import java.util.Calendar;

public class Funcionario {
	private int codigo;
	private Calendar dataNascimento;
	private Calendar dataContratacao;
	private int idade;
	private int tempoTrabalhado;

	public Funcionario(int codigo, Calendar dataNascimento, Calendar dataContratacao) {
		this.codigo = codigo;
		this.dataNascimento = dataNascimento;
		this.dataContratacao = dataContratacao;
		idade = DateHelper.calcularAno(this.dataNascimento);
		tempoTrabalhado = DateHelper.calcularAno(this.dataContratacao);
	}

	public int getIdade() {
		return idade;
	}

	public int getTempoTrabalhado() {
		return tempoTrabalhado;
	}

	public int getCodigo() {
		return codigo;
	}

}
