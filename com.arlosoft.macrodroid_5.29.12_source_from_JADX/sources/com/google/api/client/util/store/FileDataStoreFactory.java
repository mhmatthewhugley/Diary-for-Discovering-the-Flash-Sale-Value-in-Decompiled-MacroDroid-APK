package com.google.api.client.util.store;

import com.google.api.client.util.IOUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Logger;

public class FileDataStoreFactory extends AbstractDataStoreFactory {

    /* renamed from: d */
    private static final Logger f52855d = Logger.getLogger(FileDataStoreFactory.class.getName());

    static class FileDataStore<V extends Serializable> extends AbstractMemoryDataStore<V> {

        /* renamed from: c */
        private final File f52856c;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo60796b() throws IOException {
            IOUtils.m72697f(this.f52854b, new FileOutputStream(this.f52856c));
        }
    }
}
