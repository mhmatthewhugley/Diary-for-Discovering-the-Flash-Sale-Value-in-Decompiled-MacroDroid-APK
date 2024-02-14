package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

public class UserMetadata {

    /* renamed from: a */
    private final MetaDataStore f5075a;

    /* renamed from: b */
    private final CrashlyticsBackgroundWorker f5076b;

    /* renamed from: c */
    private final String f5077c;

    /* renamed from: d */
    private final SerializeableKeysMap f5078d = new SerializeableKeysMap(false);

    /* renamed from: e */
    private final SerializeableKeysMap f5079e = new SerializeableKeysMap(true);

    /* renamed from: f */
    private final AtomicMarkableReference<String> f5080f = new AtomicMarkableReference<>((Object) null, false);

    private class SerializeableKeysMap {

        /* renamed from: a */
        final AtomicMarkableReference<KeysMap> f5081a;

        /* renamed from: b */
        private final AtomicReference<Callable<Void>> f5082b = new AtomicReference<>((Object) null);

        /* renamed from: c */
        private final boolean f5083c;

        public SerializeableKeysMap(boolean z) {
            this.f5083c = z;
            this.f5081a = new AtomicMarkableReference<>(new KeysMap(64, z ? 8192 : 1024), false);
        }

        /* renamed from: a */
        public Map<String, String> mo23110a() {
            return this.f5081a.getReference().mo23079a();
        }
    }

    public UserMetadata(String str, FileStore fileStore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        this.f5077c = str;
        this.f5075a = new MetaDataStore(fileStore);
        this.f5076b = crashlyticsBackgroundWorker;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ Object m6889e() throws Exception {
        m6892h();
        return null;
    }

    /* renamed from: f */
    public static UserMetadata m6890f(String str, FileStore fileStore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        MetaDataStore metaDataStore = new MetaDataStore(fileStore);
        UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsBackgroundWorker);
        userMetadata.f5078d.f5081a.getReference().mo23080d(metaDataStore.mo23090f(str, false));
        userMetadata.f5079e.f5081a.getReference().mo23080d(metaDataStore.mo23090f(str, true));
        userMetadata.f5080f.set(metaDataStore.mo23091g(str), false);
        return userMetadata;
    }

    @Nullable
    /* renamed from: g */
    public static String m6891g(String str, FileStore fileStore) {
        return new MetaDataStore(fileStore).mo23091g(str);
    }

    /* renamed from: h */
    private void m6892h() {
        boolean z;
        String str;
        synchronized (this.f5080f) {
            z = false;
            if (this.f5080f.isMarked()) {
                str = mo23108d();
                this.f5080f.set(str, false);
                z = true;
            } else {
                str = null;
            }
        }
        if (z) {
            this.f5075a.mo23092k(this.f5077c, str);
        }
    }

    /* renamed from: b */
    public Map<String, String> mo23106b() {
        return this.f5078d.mo23110a();
    }

    /* renamed from: c */
    public Map<String, String> mo23107c() {
        return this.f5079e.mo23110a();
    }

    @Nullable
    /* renamed from: d */
    public String mo23108d() {
        return this.f5080f.getReference();
    }

    /* renamed from: i */
    public void mo23109i(String str) {
        String c = KeysMap.m6825c(str, 1024);
        synchronized (this.f5080f) {
            if (!CommonUtils.m6603z(c, this.f5080f.getReference())) {
                this.f5080f.set(c, true);
                this.f5076b.mo22983h(new C1881a(this));
            }
        }
    }
}
