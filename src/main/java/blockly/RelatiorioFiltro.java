package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class RelatiorioFiltro {

public static final int TIMEOUT = 300;

/**
 *
 * @param idActive
 *
 * @author Ícaro Antunes
 * @since 02/09/2024, 16:57:01
 *
 */
public static Var abRelatorio(@ParamMetaData(description = "idActive", id = "4ac0060e") Var idActive) throws Exception {
 return new Callable<Var>() {

   private Var variavelRelat = Var.VAR_NULL;

   public Var call() throws Exception {
    System.out.println(idActive.getObjectAsString());
    System.out.println(
    cronapi.json.Operations.getJsonOrMapField(idActive,
    Var.valueOf("_objectKey")).getObjectAsString());
    variavelRelat =
    cronapi.report.Operations.generateReportWithParam(
    Var.valueOf("reports/relatorioFiltro.report"),
    Var.valueOf("pdf"),
    Var.valueOf("src/main/webapp/public/assets/relatorio/relatorioFiltro.report"),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("id",
    cronapi.json.Operations.getJsonOrMapField(idActive,
    Var.valueOf("_objectKey")))));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.util.openReport"),
    Var.valueOf("reports/novorelatiorifiltro.report"), cronapi.list.Operations.newList());
    return Var.VAR_NULL;
   }
 }.call();
}

}

