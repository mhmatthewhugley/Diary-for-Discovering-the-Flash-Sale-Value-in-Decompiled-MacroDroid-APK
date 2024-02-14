package p226cd;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016¨\u0006\u0015"}, mo71668d2 = {"Lcd/j;", "Lcd/y;", "Lja/u;", "e", "Lcd/b;", "sink", "", "byteCount", "m0", "b", "", "c", "Lcd/z;", "q", "close", "Lcd/d;", "source", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Lcd/d;Ljava/util/zip/Inflater;)V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.j */
/* compiled from: InflaterSource.kt */
public final class C11194j implements C11212y {

    /* renamed from: a */
    private final C11186d f54116a;

    /* renamed from: c */
    private final Inflater f54117c;

    /* renamed from: d */
    private int f54118d;

    /* renamed from: f */
    private boolean f54119f;

    public C11194j(C11186d dVar, Inflater inflater) {
        C13706o.m87929f(dVar, "source");
        C13706o.m87929f(inflater, "inflater");
        this.f54116a = dVar;
        this.f54117c = inflater;
    }

    /* renamed from: e */
    private final void m75155e() {
        int i = this.f54118d;
        if (i != 0) {
            int remaining = i - this.f54117c.getRemaining();
            this.f54118d -= remaining;
            this.f54116a.skip((long) remaining);
        }
    }

    /* renamed from: b */
    public final long mo62529b(C11179b bVar, long j) throws IOException {
        C13706o.m87929f(bVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0)) {
            throw new IllegalArgumentException(C13706o.m87936m("byteCount < 0: ", Long.valueOf(j)).toString());
        } else if (!(!this.f54119f)) {
            throw new IllegalStateException("closed".toString());
        } else if (i == 0) {
            return 0;
        } else {
            try {
                C11206t H = bVar.mo62403H(1);
                int min = (int) Math.min(j, (long) (8192 - H.f54144c));
                mo62530c();
                int inflate = this.f54117c.inflate(H.f54142a, H.f54144c, min);
                m75155e();
                if (inflate > 0) {
                    H.f54144c += inflate;
                    long j2 = (long) inflate;
                    bVar.mo62398C(bVar.mo62399D() + j2);
                    return j2;
                }
                if (H.f54143b == H.f54144c) {
                    bVar.f54090a = H.mo62562b();
                    C11208u.m75234b(H);
                }
                return 0;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo62530c() throws IOException {
        if (!this.f54117c.needsInput()) {
            return false;
        }
        if (this.f54116a.mo62469x1()) {
            return true;
        }
        C11206t tVar = this.f54116a.getBuffer().f54090a;
        C13706o.m87926c(tVar);
        int i = tVar.f54144c;
        int i2 = tVar.f54143b;
        int i3 = i - i2;
        this.f54118d = i3;
        this.f54117c.setInput(tVar.f54142a, i2, i3);
        return false;
    }

    public void close() throws IOException {
        if (!this.f54119f) {
            this.f54117c.end();
            this.f54119f = true;
            this.f54116a.close();
        }
    }

    /* renamed from: m0 */
    public long mo62392m0(C11179b bVar, long j) throws IOException {
        C13706o.m87929f(bVar, "sink");
        do {
            long b = mo62529b(bVar, j);
            if (b > 0) {
                return b;
            }
            if (this.f54117c.finished() || this.f54117c.needsDictionary()) {
                return -1;
            }
        } while (!this.f54116a.mo62469x1());
        throw new EOFException("source exhausted prematurely");
    }

    /* renamed from: q */
    public C11213z mo62393q() {
        return this.f54116a.mo62393q();
    }
}
