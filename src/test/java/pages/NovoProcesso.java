package pages;

import support.DriverQA;

public class NovoProcesso extends BasePage {

    private String processCode;

    public NovoProcesso(DriverQA stepDriver) {
        super(stepDriver);
    }

    public String getCode() {
        return processCode;
    }

    public void setCode(String code) {
        processCode = code;
    }
}

