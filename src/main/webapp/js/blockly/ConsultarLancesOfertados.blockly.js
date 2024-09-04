window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ConsultarLancesOfertados = window.blockly.js.blockly.ConsultarLancesOfertados || {};

/**
 * @function filtrarLance
 *
 *
 *
 *
 * @author Ícaro Antunes
 * @since 04/09/2024, 16:20:44
 *
 */
window.blockly.js.blockly.ConsultarLancesOfertados.filtrarLanceArgs = [];
window.blockly.js.blockly.ConsultarLancesOfertados.filtrarLance = async function() {

  //
  this.cronapi.screen.doFilter("LanceComCota", 'or', this.cronapi.screen.createFilter('cota_nome', 'substringof', this.cronapi.screen.getValueOfField("vars.input792429761680013081")));
}

/**
 * @function filtroRelatorio
 *
 *
 *
 *
 * @author Ícaro Antunes
 * @since 04/09/2024, 16:20:44
 *
 */
window.blockly.js.blockly.ConsultarLancesOfertados.filtroRelatorioArgs = [];
window.blockly.js.blockly.ConsultarLancesOfertados.filtroRelatorio = async function() {

  //
  this.cronapi.screen.doFilter("LanceComCota", null, this.cronapi.screen.createFilter('dataInicial', 'eq', this.cronapi.screen.getValueOfField("vars.input7924")));
}
