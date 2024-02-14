package javax.activation;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.URL;

public class DataHandler {
    private static final ActivationDataFlavor[] emptyFlavors = new ActivationDataFlavor[0];
    private static DataContentHandlerFactory factory;
    private CommandMap currentCommandMap;
    private DataContentHandler dataContentHandler;
    private DataSource dataSource;
    private DataContentHandler factoryDCH;
    private DataSource objDataSource;
    /* access modifiers changed from: private */
    public Object object;
    /* access modifiers changed from: private */
    public String objectMimeType;
    private DataContentHandlerFactory oldFactory;
    private String shortType;
    private ActivationDataFlavor[] transferFlavors;

    public DataHandler(DataSource dataSource2) {
        this.objDataSource = null;
        this.object = null;
        this.objectMimeType = null;
        this.currentCommandMap = null;
        this.transferFlavors = emptyFlavors;
        this.dataContentHandler = null;
        this.factoryDCH = null;
        this.shortType = null;
        this.dataSource = dataSource2;
        this.oldFactory = factory;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.lang.String getBaseType() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.shortType     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = r2.getContentType()     // Catch:{ all -> 0x001b }
            javax.activation.MimeType r1 = new javax.activation.MimeType     // Catch:{ MimeTypeParseException -> 0x0015 }
            r1.<init>(r0)     // Catch:{ MimeTypeParseException -> 0x0015 }
            java.lang.String r1 = r1.getBaseType()     // Catch:{ MimeTypeParseException -> 0x0015 }
            r2.shortType = r1     // Catch:{ MimeTypeParseException -> 0x0015 }
            goto L_0x0017
        L_0x0015:
            r2.shortType = r0     // Catch:{ all -> 0x001b }
        L_0x0017:
            java.lang.String r0 = r2.shortType     // Catch:{ all -> 0x001b }
            monitor-exit(r2)
            return r0
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.activation.DataHandler.getBaseType():java.lang.String");
    }

    private synchronized CommandMap getCommandMap() {
        CommandMap commandMap = this.currentCommandMap;
        if (commandMap != null) {
            return commandMap;
        }
        return CommandMap.getDefaultCommandMap();
    }

    private synchronized DataContentHandler getDataContentHandler() {
        DataContentHandlerFactory dataContentHandlerFactory;
        DataContentHandlerFactory dataContentHandlerFactory2 = factory;
        if (dataContentHandlerFactory2 != this.oldFactory) {
            this.oldFactory = dataContentHandlerFactory2;
            this.factoryDCH = null;
            this.dataContentHandler = null;
            this.transferFlavors = emptyFlavors;
        }
        DataContentHandler dataContentHandler2 = this.dataContentHandler;
        if (dataContentHandler2 != null) {
            return dataContentHandler2;
        }
        String baseType = getBaseType();
        if (this.factoryDCH == null && (dataContentHandlerFactory = factory) != null) {
            this.factoryDCH = dataContentHandlerFactory.createDataContentHandler(baseType);
        }
        DataContentHandler dataContentHandler3 = this.factoryDCH;
        if (dataContentHandler3 != null) {
            this.dataContentHandler = dataContentHandler3;
        }
        if (this.dataContentHandler == null) {
            if (this.dataSource != null) {
                this.dataContentHandler = getCommandMap().createDataContentHandler(baseType, this.dataSource);
            } else {
                this.dataContentHandler = getCommandMap().createDataContentHandler(baseType);
            }
        }
        DataSource dataSource2 = this.dataSource;
        if (dataSource2 != null) {
            this.dataContentHandler = new DataSourceDataContentHandler(this.dataContentHandler, dataSource2);
        } else {
            this.dataContentHandler = new ObjectDataContentHandler(this.dataContentHandler, this.object, this.objectMimeType);
        }
        return this.dataContentHandler;
    }

    public static synchronized void setDataContentHandlerFactory(DataContentHandlerFactory dataContentHandlerFactory) {
        Class<DataHandler> cls = DataHandler.class;
        synchronized (cls) {
            if (factory == null) {
                SecurityManager securityManager = System.getSecurityManager();
                if (securityManager != null) {
                    try {
                        securityManager.checkSetFactory();
                    } catch (SecurityException e) {
                        if (cls.getClassLoader() != dataContentHandlerFactory.getClass().getClassLoader()) {
                            throw e;
                        }
                    }
                }
                factory = dataContentHandlerFactory;
            } else {
                throw new Error("DataContentHandlerFactory already defined");
            }
        }
    }

    public CommandInfo[] getAllCommands() {
        if (this.dataSource != null) {
            return getCommandMap().getAllCommands(getBaseType(), this.dataSource);
        }
        return getCommandMap().getAllCommands(getBaseType());
    }

    public Object getBean(CommandInfo commandInfo) {
        try {
            ClassLoader contextClassLoader = SecuritySupport.getContextClassLoader();
            if (contextClassLoader == null) {
                contextClassLoader = getClass().getClassLoader();
            }
            return commandInfo.getCommandObject(this, contextClassLoader);
        } catch (IOException | ClassNotFoundException unused) {
            return null;
        }
    }

    public CommandInfo getCommand(String str) {
        if (this.dataSource != null) {
            return getCommandMap().getCommand(getBaseType(), str, this.dataSource);
        }
        return getCommandMap().getCommand(getBaseType(), str);
    }

    public Object getContent() throws IOException {
        Object obj = this.object;
        if (obj != null) {
            return obj;
        }
        return getDataContentHandler().getContent(getDataSource());
    }

    public String getContentType() {
        DataSource dataSource2 = this.dataSource;
        if (dataSource2 != null) {
            return dataSource2.getContentType();
        }
        return this.objectMimeType;
    }

    public DataSource getDataSource() {
        DataSource dataSource2 = this.dataSource;
        if (dataSource2 != null) {
            return dataSource2;
        }
        if (this.objDataSource == null) {
            this.objDataSource = new DataHandlerDataSource(this);
        }
        return this.objDataSource;
    }

    public InputStream getInputStream() throws IOException {
        DataSource dataSource2 = this.dataSource;
        if (dataSource2 != null) {
            return dataSource2.getInputStream();
        }
        final DataContentHandler dataContentHandler2 = getDataContentHandler();
        if (dataContentHandler2 == null) {
            throw new UnsupportedDataTypeException("no DCH for MIME type " + getBaseType());
        } else if (!(dataContentHandler2 instanceof ObjectDataContentHandler) || ((ObjectDataContentHandler) dataContentHandler2).getDCH() != null) {
            final PipedOutputStream pipedOutputStream = new PipedOutputStream();
            PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
            new Thread(new Runnable() {
                /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0013 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r4 = this;
                        javax.activation.DataContentHandler r0 = r0     // Catch:{ IOException -> 0x0013, all -> 0x0019 }
                        javax.activation.DataHandler r1 = javax.activation.DataHandler.this     // Catch:{ IOException -> 0x0013, all -> 0x0019 }
                        java.lang.Object r1 = r1.object     // Catch:{ IOException -> 0x0013, all -> 0x0019 }
                        javax.activation.DataHandler r2 = javax.activation.DataHandler.this     // Catch:{ IOException -> 0x0013, all -> 0x0019 }
                        java.lang.String r2 = r2.objectMimeType     // Catch:{ IOException -> 0x0013, all -> 0x0019 }
                        java.io.PipedOutputStream r3 = r1     // Catch:{ IOException -> 0x0013, all -> 0x0019 }
                        r0.writeTo(r1, r2, r3)     // Catch:{ IOException -> 0x0013, all -> 0x0019 }
                    L_0x0013:
                        java.io.PipedOutputStream r0 = r1     // Catch:{ IOException -> 0x0020 }
                        r0.close()     // Catch:{ IOException -> 0x0020 }
                        goto L_0x0020
                    L_0x0019:
                        r0 = move-exception
                        java.io.PipedOutputStream r1 = r1     // Catch:{ IOException -> 0x001f }
                        r1.close()     // Catch:{ IOException -> 0x001f }
                    L_0x001f:
                        throw r0
                    L_0x0020:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: javax.activation.DataHandler.C133421.run():void");
                }
            }, "DataHandler.getInputStream").start();
            return pipedInputStream;
        } else {
            throw new UnsupportedDataTypeException("no object DCH for MIME type " + getBaseType());
        }
    }

    public String getName() {
        DataSource dataSource2 = this.dataSource;
        if (dataSource2 != null) {
            return dataSource2.getName();
        }
        return null;
    }

    public OutputStream getOutputStream() throws IOException {
        DataSource dataSource2 = this.dataSource;
        if (dataSource2 != null) {
            return dataSource2.getOutputStream();
        }
        return null;
    }

    public CommandInfo[] getPreferredCommands() {
        if (this.dataSource != null) {
            return getCommandMap().getPreferredCommands(getBaseType(), this.dataSource);
        }
        return getCommandMap().getPreferredCommands(getBaseType());
    }

    public Object getTransferData(ActivationDataFlavor activationDataFlavor) throws IOException {
        return getDataContentHandler().getTransferData(activationDataFlavor, this.dataSource);
    }

    public synchronized ActivationDataFlavor[] getTransferDataFlavors() {
        if (factory != this.oldFactory) {
            this.transferFlavors = emptyFlavors;
        }
        ActivationDataFlavor[] activationDataFlavorArr = this.transferFlavors;
        ActivationDataFlavor[] activationDataFlavorArr2 = emptyFlavors;
        if (activationDataFlavorArr == activationDataFlavorArr2) {
            this.transferFlavors = getDataContentHandler().getTransferDataFlavors();
        }
        ActivationDataFlavor[] activationDataFlavorArr3 = this.transferFlavors;
        if (activationDataFlavorArr3 == activationDataFlavorArr2) {
            return activationDataFlavorArr3;
        }
        return (ActivationDataFlavor[]) activationDataFlavorArr3.clone();
    }

    public boolean isDataFlavorSupported(ActivationDataFlavor activationDataFlavor) {
        ActivationDataFlavor[] transferDataFlavors = getTransferDataFlavors();
        for (ActivationDataFlavor equals : transferDataFlavors) {
            if (equals.equals(activationDataFlavor)) {
                return true;
            }
        }
        return false;
    }

    public synchronized void setCommandMap(CommandMap commandMap) {
        if (commandMap != this.currentCommandMap || commandMap == null) {
            this.transferFlavors = emptyFlavors;
            this.dataContentHandler = null;
            this.currentCommandMap = commandMap;
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataSource dataSource2 = this.dataSource;
        if (dataSource2 != null) {
            byte[] bArr = new byte[8192];
            InputStream inputStream = dataSource2.getInputStream();
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        return;
                    }
                } finally {
                    inputStream.close();
                }
            }
        } else {
            getDataContentHandler().writeTo(this.object, this.objectMimeType, outputStream);
        }
    }

    public DataHandler(Object obj, String str) {
        this.dataSource = null;
        this.objDataSource = null;
        this.currentCommandMap = null;
        this.transferFlavors = emptyFlavors;
        this.dataContentHandler = null;
        this.factoryDCH = null;
        this.shortType = null;
        this.object = obj;
        this.objectMimeType = str;
        this.oldFactory = factory;
    }

    public DataHandler(URL url) {
        this.dataSource = null;
        this.objDataSource = null;
        this.object = null;
        this.objectMimeType = null;
        this.currentCommandMap = null;
        this.transferFlavors = emptyFlavors;
        this.dataContentHandler = null;
        this.factoryDCH = null;
        this.oldFactory = null;
        this.shortType = null;
        this.dataSource = new URLDataSource(url);
        this.oldFactory = factory;
    }
}
