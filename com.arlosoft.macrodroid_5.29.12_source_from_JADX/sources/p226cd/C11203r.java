package p226cd;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u0011\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J\u0010\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0001H\u0016J\b\u0010!\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\"H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\b\u0010&\u001a\u00020%H\u0016J\b\u0010'\u001a\u00020\u000bH\u0016R\u001b\u0010,\u001a\u00020\u00028Ö\u0002X\u0004¢\u0006\f\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)¨\u00061"}, mo71668d2 = {"Lcd/r;", "Lcd/c;", "Lcd/b;", "source", "", "byteCount", "Lja/u;", "X", "Lcd/e;", "byteString", "V", "", "string", "s0", "", "beginIndex", "endIndex", "v0", "", "write", "offset", "Ljava/nio/ByteBuffer;", "Lcd/y;", "A1", "b", "writeByte", "s", "writeShort", "i", "writeInt", "v", "a1", "R1", "flush", "", "isOpen", "close", "Lcd/z;", "q", "toString", "getBuffer", "()Lcd/b;", "getBuffer$annotations", "()V", "buffer", "Lcd/w;", "sink", "<init>", "(Lcd/w;)V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.r */
/* compiled from: RealBufferedSink.kt */
public final class C11203r implements C11184c {

    /* renamed from: a */
    public final C11210w f54134a;

    /* renamed from: c */
    public final C11179b f54135c = new C11179b();

    /* renamed from: d */
    public boolean f54136d;

    public C11203r(C11210w wVar) {
        C13706o.m87929f(wVar, "sink");
        this.f54134a = wVar;
    }

    /* renamed from: A1 */
    public long mo62396A1(C11212y yVar) {
        C13706o.m87929f(yVar, "source");
        long j = 0;
        while (true) {
            long m0 = yVar.mo62392m0(this.f54135c, 8192);
            if (m0 == -1) {
                return j;
            }
            j += m0;
            mo62543b();
        }
    }

    /* renamed from: R1 */
    public C11184c mo62413R1(long j) {
        if (!this.f54136d) {
            this.f54135c.mo62413R1(j);
            return mo62543b();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: V */
    public C11184c mo62419V(C11188e eVar) {
        C13706o.m87929f(eVar, "byteString");
        if (!this.f54136d) {
            this.f54135c.mo62419V(eVar);
            return mo62543b();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: X */
    public void mo62384X(C11179b bVar, long j) {
        C13706o.m87929f(bVar, "source");
        if (!this.f54136d) {
            this.f54135c.mo62384X(bVar, j);
            mo62543b();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a1 */
    public C11184c mo62423a1(long j) {
        if (!this.f54136d) {
            this.f54135c.mo62423a1(j);
            return mo62543b();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: b */
    public C11184c mo62543b() {
        if (!this.f54136d) {
            long e = this.f54135c.mo62428e();
            if (e > 0) {
                this.f54134a.mo62384X(this.f54135c, e);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public void close() {
        if (!this.f54136d) {
            Throwable th = null;
            try {
                if (this.f54135c.mo62399D() > 0) {
                    C11210w wVar = this.f54134a;
                    C11179b bVar = this.f54135c;
                    wVar.mo62384X(bVar, bVar.mo62399D());
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f54134a.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f54136d = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public void flush() {
        if (!this.f54136d) {
            if (this.f54135c.mo62399D() > 0) {
                C11210w wVar = this.f54134a;
                C11179b bVar = this.f54135c;
                wVar.mo62384X(bVar, bVar.mo62399D());
            }
            this.f54134a.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C11179b getBuffer() {
        return this.f54135c;
    }

    public boolean isOpen() {
        return !this.f54136d;
    }

    /* renamed from: q */
    public C11213z mo62388q() {
        return this.f54134a.mo62388q();
    }

    /* renamed from: s0 */
    public C11184c mo62455s0(String str) {
        C13706o.m87929f(str, TypedValues.Custom.S_STRING);
        if (!this.f54136d) {
            this.f54135c.mo62455s0(str);
            return mo62543b();
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        return "buffer(" + this.f54134a + ')';
    }

    /* renamed from: v0 */
    public C11184c mo62460v0(String str, int i, int i2) {
        C13706o.m87929f(str, TypedValues.Custom.S_STRING);
        if (!this.f54136d) {
            this.f54135c.mo62460v0(str, i, i2);
            return mo62543b();
        }
        throw new IllegalStateException("closed".toString());
    }

    public int write(ByteBuffer byteBuffer) {
        C13706o.m87929f(byteBuffer, "source");
        if (!this.f54136d) {
            int write = this.f54135c.write(byteBuffer);
            mo62543b();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C11184c writeByte(int i) {
        if (!this.f54136d) {
            this.f54135c.writeByte(i);
            return mo62543b();
        }
        throw new IllegalStateException("closed".toString());
    }

    public C11184c writeInt(int i) {
        if (!this.f54136d) {
            this.f54135c.writeInt(i);
            return mo62543b();
        }
        throw new IllegalStateException("closed".toString());
    }

    public C11184c writeShort(int i) {
        if (!this.f54136d) {
            this.f54135c.writeShort(i);
            return mo62543b();
        }
        throw new IllegalStateException("closed".toString());
    }

    public C11184c write(byte[] bArr) {
        C13706o.m87929f(bArr, "source");
        if (!this.f54136d) {
            this.f54135c.write(bArr);
            return mo62543b();
        }
        throw new IllegalStateException("closed".toString());
    }

    public C11184c write(byte[] bArr, int i, int i2) {
        C13706o.m87929f(bArr, "source");
        if (!this.f54136d) {
            this.f54135c.write(bArr, i, i2);
            return mo62543b();
        }
        throw new IllegalStateException("closed".toString());
    }
}
