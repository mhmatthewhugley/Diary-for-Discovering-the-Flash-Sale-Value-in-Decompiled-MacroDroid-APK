package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.IOException;

class CrashlyticsFileMarker {

    /* renamed from: a */
    private final String f4976a;

    /* renamed from: b */
    private final FileStore f4977b;

    public CrashlyticsFileMarker(String str, FileStore fileStore) {
        this.f4976a = str;
        this.f4977b = fileStore;
    }

    /* renamed from: b */
    private File m6696b() {
        return this.f4977b.mo23501e(this.f4976a);
    }

    /* renamed from: a */
    public boolean mo23033a() {
        try {
            return m6696b().createNewFile();
        } catch (IOException e) {
            Logger f = Logger.m6525f();
            f.mo22957e("Error creating marker: " + this.f4976a, e);
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo23034c() {
        return m6696b().exists();
    }

    /* renamed from: d */
    public boolean mo23035d() {
        return m6696b().delete();
    }
}
