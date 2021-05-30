package isp.correto;
/**
 *
 * @author Fabricio
 */
public class Desenvolvedor extends Funcionario{

	private double salario;
	
	public Desenvolvedor(double salario) {
		this.salario = salario;
	}
	
	@Override
	public double getSalario() {
		return this.salario;
	}

	public double getComissao() {
		return 0d;
	}
}