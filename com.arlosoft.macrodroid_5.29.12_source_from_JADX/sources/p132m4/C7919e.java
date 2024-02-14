package p132m4;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p089f4.C7293a;
import p102h4.C7380e;
import p132m4.C7910a;

/* renamed from: m4.e */
/* compiled from: DiskLruCacheWrapper */
public class C7919e implements C7910a {

    /* renamed from: a */
    private final C7929j f19023a;

    /* renamed from: b */
    private final File f19024b;

    /* renamed from: c */
    private final long f19025c;

    /* renamed from: d */
    private final C7914c f19026d = new C7914c();

    /* renamed from: e */
    private C7293a f19027e;

    @Deprecated
    protected C7919e(File file, long j) {
        this.f19024b = file;
        this.f19025c = j;
        this.f19023a = new C7929j();
    }

    /* renamed from: c */
    public static C7910a m33124c(File file, long j) {
        return new C7919e(file, j);
    }

    /* renamed from: d */
    private synchronized C7293a m33125d() throws IOException {
        if (this.f19027e == null) {
            this.f19027e = C7293a.m30139x(this.f19024b, 1, 1, this.f19025c);
        }
        return this.f19027e;
    }

    /* renamed from: a */
    public void mo37806a(C7380e eVar, C7910a.C7912b bVar) {
        C7293a.C7296c s;
        String b = this.f19023a.mo37827b(eVar);
        this.f19026d.mo37809a(b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Put: Obtained: ");
                sb.append(b);
                sb.append(" for for Key: ");
                sb.append(eVar);
            }
            try {
                C7293a d = m33125d();
                if (d.mo37212v(b) == null) {
                    s = d.mo37211s(b);
                    if (s != null) {
                        if (bVar.mo33013a(s.mo37219f(0))) {
                            s.mo37218e();
                        }
                        s.mo37217b();
                        this.f19026d.mo37810b(b);
                        return;
                    }
                    throw new IllegalStateException("Had two simultaneous puts for: " + b);
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            } catch (Throwable th) {
                s.mo37217b();
                throw th;
            }
        } finally {
            this.f19026d.mo37810b(b);
        }
    }

    /* renamed from: b */
    public File mo37807b(C7380e eVar) {
        String b = this.f19023a.mo37827b(eVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Get: Obtained: ");
            sb.append(b);
            sb.append(" for for Key: ");
            sb.append(eVar);
        }
        try {
            C7293a.C7298e v = m33125d().mo37212v(b);
            if (v != null) {
                return v.mo37223a(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }
}
