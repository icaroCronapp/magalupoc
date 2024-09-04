package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class UsuarioCota {

public static final int TIMEOUT = 300;

/**
 *
 * @param Consulta a Entidades<app.entity.Cota>
 *
 * @author Ícaro Antunes
 * @since 02/09/2024, 16:28:23
 *
 */
public static Var obterIdDoUsuiarioLogado(@ParamMetaData(description = "Consulta_a_Entidades", id = "7b290765") Var Consulta_a_Entidades) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.list.Operations.getFirst((
cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select \n	u.id \nfrom \n	User u  \nwhere \n	u.userName = :userName"),Var.valueOf("userName",
cronapi.util.Operations.getCurrentUserName()))));
   }
 }.call();
}

/**
 *
 * @param Consulta a Entidades<app.entity.Cota>
 *
 * @author Ícaro Antunes
 * @since 02/09/2024, 16:28:23
 *
 */
public static Var obterIdFilialLinkadaAoUser(@ParamMetaData(description = "Consulta_a_Entidades", id = "7b290765") Var Consulta_a_Entidades) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.list.Operations.getFirst((
cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select \n	u.filial.id \nfrom \n	User u  \nwhere \n	u.userName = :userName"),Var.valueOf("userName",
cronapi.util.Operations.getCurrentUserName()))));
   }
 }.call();
}

}

