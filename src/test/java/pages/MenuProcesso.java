package pages;

import support.DriverQA;

public class MenuProcesso extends BasePage {

    public MenuProcesso(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void clicarProcessos() {
        driver.click("#processos.ls-ico-stats", "css");
    }
}
