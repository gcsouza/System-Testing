package pages;

import support.DriverQA;

public class DetalheProcesso extends BasePage {

    public DetalheProcesso(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void clicarVoltar() {
        driver.click(".ls-btn-primary-danger", "css");
    }

    public Object getCode() {
        return driver.getText("codigo");
    }

    public String getCampo(String campo) {
        return driver.getText(campo);
    }
}