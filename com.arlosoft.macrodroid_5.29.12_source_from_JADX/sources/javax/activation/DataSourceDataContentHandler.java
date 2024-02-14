package javax.activation;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: DataHandler */
class DataSourceDataContentHandler implements DataContentHandler {
    private DataContentHandler dch;

    /* renamed from: ds */
    private DataSource f61332ds;
    private ActivationDataFlavor[] transferFlavors = null;

    public DataSourceDataContentHandler(DataContentHandler dataContentHandler, DataSource dataSource) {
        this.f61332ds = dataSource;
        this.dch = dataContentHandler;
    }

    public Object getContent(DataSource dataSource) throws IOException {
        DataContentHandler dataContentHandler = this.dch;
        if (dataContentHandler != null) {
            return dataContentHandler.getContent(dataSource);
        }
        return dataSource.getInputStream();
    }

    public Object getTransferData(ActivationDataFlavor activationDataFlavor, DataSource dataSource) throws IOException {
        DataContentHandler dataContentHandler = this.dch;
        if (dataContentHandler != null) {
            return dataContentHandler.getTransferData(activationDataFlavor, dataSource);
        }
        if (activationDataFlavor.equals(getTransferDataFlavors()[0])) {
            return dataSource.getInputStream();
        }
        throw new IOException("Unsupported DataFlavor: " + activationDataFlavor);
    }

    public ActivationDataFlavor[] getTransferDataFlavors() {
        if (this.transferFlavors == null) {
            DataContentHandler dataContentHandler = this.dch;
            if (dataContentHandler != null) {
                this.transferFlavors = dataContentHandler.getTransferDataFlavors();
            } else {
                ActivationDataFlavor[] activationDataFlavorArr = new ActivationDataFlavor[1];
                this.transferFlavors = activationDataFlavorArr;
                activationDataFlavorArr[0] = new ActivationDataFlavor(this.f61332ds.getContentType(), this.f61332ds.getContentType());
            }
        }
        return this.transferFlavors;
    }

    public void writeTo(Object obj, String str, OutputStream outputStream) throws IOException {
        DataContentHandler dataContentHandler = this.dch;
        if (dataContentHandler != null) {
            dataContentHandler.writeTo(obj, str, outputStream);
            return;
        }
        throw new UnsupportedDataTypeException("no DCH for content type " + this.f61332ds.getContentType());
    }
}
