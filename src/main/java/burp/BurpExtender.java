package burp;

import java.awt.*;

public class BurpExtender implements IBurpExtender, ITab {
    private DataCollectGUI dataCollectGUI;
    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks) {
        callbacks.setExtensionName("data");
        callbacks.printOutput("load success");
        dataCollectGUI = new DataCollectGUI(callbacks);
        callbacks.addSuiteTab(this);
    }

    @Override
    public String getTabCaption() {
        return "data-collect";
    }

    @Override
    public Component getUiComponent() {
        return dataCollectGUI.$$$getRootComponent$$$();
    }
}
