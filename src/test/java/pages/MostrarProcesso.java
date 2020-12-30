package pages;

import support.DriverQA;

public class MostrarProcesso extends BasePage {

    public MostrarProcesso(DriverQA stepDriver) {
        super(stepDriver);
    }

    public String getNotice() {
        return driver.getText("notice");
    }
}
