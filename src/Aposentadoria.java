
public class Aposentadoria {
	private static final int aposentadoriaPorIdade = 65;
	private static final int aposentadoriaPorContribuicao = 30;
	private static final int aposentadoriaIdadeEContribuicaoIdade = 60;
	private static final int aposentadoriaIdadeEContribuicaoContribuicao = 25;
	
	public boolean podeAposentar(Funcionario funcionario) {
		if (funcionario.getIdade() >= aposentadoriaPorIdade)
			return true;
		else if (funcionario.getTempoTrabalhado() >= aposentadoriaPorContribuicao)
			return true;
		else if (funcionario.getIdade() >= aposentadoriaIdadeEContribuicaoIdade && funcionario.getTempoTrabalhado() >= aposentadoriaIdadeEContribuicaoContribuicao)
			return true;
		else
			return false;	
	}
}
