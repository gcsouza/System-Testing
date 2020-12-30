package pages;

import support.DriverQA;

public class ListaProcessos extends BasePage {
    
    public ListaProcessos(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void clicarNovo() {
        driver.click("btn-novo");
    }

    public void clicarMostrar(String code) {
        String elemento = "btn-show_" + code;
        driver.click(elemento);
    }

    public void clicarEditarProcesso(String code) {
        String elemento = "btn-edit_" + code;
        driver.click(elemento);
    }

    public void clicarDeletar(String code) {
        String elemento = "btn-delete_" + code;
        driver.click(elemento);
    }

    public void confirmarDelecao() {
        driver.ChooseOkOnNextConfirmation();
    }

    public boolean botaoDeletarExiste(String code) throws InterruptedException {
        String elemento = "btn-delete_" + code;
        Thread.sleep(1000);
        return driver.getDriver().getPageSource().contains(elemento);
    }
}
