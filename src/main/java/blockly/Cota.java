package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Cota {

public static final int TIMEOUT = 300;

/**
 *
 * @param Consulta a Entidades<app.entity.Cota>
 *
 * @author Ícaro Antunes
 * @since 02/09/2024, 16:28:23
 *
 */
public static Var obtemDaTelaONomeDoGrupo(@ParamMetaData(description = "Consulta_a_Entidades", id = "9f8bd767") Var Consulta_a_Entidades) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return Var.VAR_NULL;
   }
 }.call();
}

}

