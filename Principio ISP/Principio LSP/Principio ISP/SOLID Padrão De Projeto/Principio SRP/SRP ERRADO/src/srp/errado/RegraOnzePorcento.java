package srp.errado;
/**
 *
 * @author Fabricio
 * 
 */
public class RegraOnzePorcento {
	public double calcula(Funcionario funcionario) {
		return funcionario.getSalario() - (funcionario.getSalario() * 0.11);
	}
}
