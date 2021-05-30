package lsp.errado;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fabricio
 */
public class ContaSalario extends ContaCorrenteComum{
   public void rende() {
       try {
           throw new Exception("Essa conta não possui rendimento");
       } catch (Exception ex) {
           Logger.getLogger(ContaSalario.class.getName()).log(Level.SEVERE, null, ex);
       }
  }
}
