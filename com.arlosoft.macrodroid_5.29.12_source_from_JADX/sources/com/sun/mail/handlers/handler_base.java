package com.sun.mail.handlers;

import java.io.IOException;
import javax.activation.ActivationDataFlavor;
import javax.activation.DataContentHandler;
import javax.activation.DataSource;

public abstract class handler_base implements DataContentHandler {
    /* access modifiers changed from: protected */
    public Object getData(ActivationDataFlavor activationDataFlavor, DataSource dataSource) throws IOException {
        return getContent(dataSource);
    }

    /* access modifiers changed from: protected */
    public abstract ActivationDataFlavor[] getDataFlavors();

    public Object getTransferData(ActivationDataFlavor activationDataFlavor, DataSource dataSource) throws IOException {
        ActivationDataFlavor[] dataFlavors = getDataFlavors();
        for (int i = 0; i < dataFlavors.length; i++) {
            if (dataFlavors[i].equals(activationDataFlavor)) {
                return getData(dataFlavors[i], dataSource);
            }
        }
        return null;
    }

    public ActivationDataFlavor[] getTransferDataFlavors() {
        return (ActivationDataFlavor[]) getDataFlavors().clone();
    }
}
