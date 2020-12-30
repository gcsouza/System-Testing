package pages;

import support.DriverQA;

public class Processos extends BasePage {

    public Processos(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void preencherCampos(String campo, String valor) {

        switch(campo){
            case "vara": preencherInput("processo_vara", valor); break;
            case "número processo": preencherInput("processo_numero_processo", valor); break;
            case "natureza": preencherInput("processo_natureza", valor); break;
            case "partes": preencherInput("processo_partes", valor); break;
            case "urgente": preencherUrgente(valor); break;
            case "arbitramento": preencherArbitramento(valor); break;
            case "assistente social": preencherInput("processo_assistente_social", valor); break;
            case "data entrada": preencherInput("processo_data_entrada", valor); break;
            case "status": preencherInput("processo_status", valor); break;
        }
    }

    private void preencherArbitramento(String valor) {
        if (valor.toLowerCase().equals("sim")){
            driver.click("processo_arbitramento_s");
        } else {
            driver.click("#processo_arbitramento_n", "css");
        }
    }

    private void preencherUrgente(String valor) {
        driver.selectByText(valor, "processo_urgente");
    }

    private void preencherInput(String elemento, String valor) {
        driver.sendKeys(valor, elemento);
    }

    public void clicarSalvar() {
        driver.click("btn-save");
    }
}
