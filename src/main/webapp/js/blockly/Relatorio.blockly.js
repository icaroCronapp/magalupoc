window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Relatorio = window.blockly.js.blockly.Relatorio || {};

/**
 * @function manioulaZindex
 *
 *
 *
 *
 * @author Ícaro Antunes
 * @since 03/09/2024, 15:49:16
 *
 */
window.blockly.js.blockly.Relatorio.manioulaZindexArgs = [];
window.blockly.js.blockly.Relatorio.manioulaZindex = async function() {

  //
  this.cronapi.util.openReport('reports/teste.report', []);
  //
  this.cronapi.screen.hideModal("modal83365");
}
