package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;

public class LogFileManager {

    /* renamed from: c */
    private static final NoopLogStore f5044c = new NoopLogStore();

    /* renamed from: a */
    private final FileStore f5045a;

    /* renamed from: b */
    private FileLogStore f5046b;

    private static final class NoopLogStore implements FileLogStore {
        private NoopLogStore() {
        }

        /* renamed from: a */
        public void mo23074a() {
        }

        /* renamed from: b */
        public String mo23075b() {
            return null;
        }

        /* renamed from: c */
        public byte[] mo23076c() {
            return null;
        }

        /* renamed from: d */
        public void mo23077d() {
        }

        /* renamed from: e */
        public void mo23078e(long j, String str) {
        }
    }

    public LogFileManager(FileStore fileStore) {
        this.f5045a = fileStore;
        this.f5046b = f5044c;
    }

    /* renamed from: d */
    private File m6828d(String str) {
        return this.f5045a.mo23510o(str, "userlog");
    }

    /* renamed from: a */
    public void mo23081a() {
        this.f5046b.mo23077d();
    }

    /* renamed from: b */
    public byte[] mo23082b() {
        return this.f5046b.mo23076c();
    }

    @Nullable
    /* renamed from: c */
    public String mo23083c() {
        return this.f5046b.mo23075b();
    }

    /* renamed from: e */
    public final void mo23084e(String str) {
        this.f5046b.mo23074a();
        this.f5046b = f5044c;
        if (str != null) {
            mo23085f(m6828d(str), 65536);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo23085f(File file, int i) {
        this.f5046b = new QueueFileLogStore(file, i);
    }

    /* renamed from: g */
    public void mo23086g(long j, String str) {
        this.f5046b.mo23078e(j, str);
    }

    public LogFileManager(FileStore fileStore, String str) {
        this(fileStore);
        mo23084e(str);
    }
}
