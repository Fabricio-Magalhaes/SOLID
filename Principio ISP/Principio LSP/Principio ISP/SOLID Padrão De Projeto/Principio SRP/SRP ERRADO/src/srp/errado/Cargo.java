package srp.errado;
/**
 *
 * @author Fabricio
 */
public enum Cargo {
    DESENVOLVEDOR_SENIOR((RegraDeCalculo) new RegraVinteDoisEMeioPorcento()),
    DESENVOLVEDOR_JUNIOR((RegraDeCalculo) new RegraOnzePorcento());
    
    	private RegraDeCalculo regra;
	
	Cargo(RegraDeCalculo regra){
		this.regra = regra;
	}

	public RegraDeCalculo getRegra() {
		return regra;
	}
}
