package srp.correto;

/**
 *
 * @author Fabricio
 */
public class RegraVinteDoisEMeioPorcento {
	public double calcula(Funcionario funcionario) {
		return funcionario.getSalario() - (funcionario.getSalario() * 0.225);
	}
}
