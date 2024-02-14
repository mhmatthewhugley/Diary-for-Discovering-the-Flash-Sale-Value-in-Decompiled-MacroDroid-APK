package p132m4;

import java.io.File;
import p132m4.C7910a;

/* renamed from: m4.d */
/* compiled from: DiskLruCacheFactory */
public class C7917d implements C7910a.C7911a {

    /* renamed from: a */
    private final long f19021a;

    /* renamed from: b */
    private final C7918a f19022b;

    /* renamed from: m4.d$a */
    /* compiled from: DiskLruCacheFactory */
    public interface C7918a {
        /* renamed from: a */
        File mo37813a();
    }

    public C7917d(C7918a aVar, long j) {
        this.f19021a = j;
        this.f19022b = aVar;
    }

    public C7910a build() {
        File a = this.f19022b.mo37813a();
        if (a == null) {
            return null;
        }
        if (a.mkdirs() || (a.exists() && a.isDirectory())) {
            return C7919e.m33124c(a, this.f19021a);
        }
        return null;
    }
}
