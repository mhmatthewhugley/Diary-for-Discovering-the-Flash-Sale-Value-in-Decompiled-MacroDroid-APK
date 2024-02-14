package p426wc;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p226cd.C11179b;
import p226cd.C11184c;
import p372qc.C16279b;
import p426wc.C16798c;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00015B\u0017\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00102\u001a\u00020\u0016¢\u0006\u0004\b3\u00104J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ$\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0002J(\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J(\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\tJ\u001e\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002J\u001e\u0010'\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%J\u0016\u0010)\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0004J&\u0010,\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002J\b\u0010-\u001a\u00020\u0006H\u0016J$\u0010/\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¨\u00066"}, mo71668d2 = {"Lwc/i;", "Ljava/io/Closeable;", "", "streamId", "", "byteCount", "Lja/u;", "m", "d0", "Lwc/l;", "peerSettings", "b", "promisedStreamId", "", "Lwc/b;", "requestHeaders", "h", "flush", "Lwc/a;", "errorCode", "i", "T0", "", "outFinished", "Lcd/b;", "source", "X0", "flags", "buffer", "c", "settings", "j", "ack", "payload1", "payload2", "k", "lastGoodStreamId", "", "debugData", "f", "windowSizeIncrement", "d", "length", "type", "e", "close", "headerBlock", "g", "Lcd/c;", "sink", "client", "<init>", "(Lcd/c;Z)V", "a", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: wc.i */
/* compiled from: Http2Writer.kt */
public final class C16832i implements Closeable {

    /* renamed from: p */
    private static final Logger f67992p = Logger.getLogger(C16801d.class.getName());

    /* renamed from: s */
    public static final C16833a f67993s = new C16833a((C13695i) null);

    /* renamed from: a */
    private final C11179b f67994a;

    /* renamed from: c */
    private int f67995c = 16384;

    /* renamed from: d */
    private boolean f67996d;

    /* renamed from: f */
    private final C16798c.C16800b f67997f;

    /* renamed from: g */
    private final C11184c f67998g;

    /* renamed from: o */
    private final boolean f67999o;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, mo71668d2 = {"Lwc/i$a;", "", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.i$a */
    /* compiled from: Http2Writer.kt */
    public static final class C16833a {
        private C16833a() {
        }

        public /* synthetic */ C16833a(C13695i iVar) {
            this();
        }
    }

    public C16832i(C11184c cVar, boolean z) {
        C13706o.m87929f(cVar, "sink");
        this.f67998g = cVar;
        this.f67999o = z;
        C11179b bVar = new C11179b();
        this.f67994a = bVar;
        this.f67997f = new C16798c.C16800b(0, false, bVar, 3, (C13695i) null);
    }

    /* renamed from: m */
    private final void m99786m(int i, long j) throws IOException {
        while (j > 0) {
            long min = Math.min((long) this.f67995c, j);
            j -= min;
            mo79930e(i, (int) min, 9, j == 0 ? 4 : 0);
            this.f67998g.mo62384X(this.f67994a, min);
        }
    }

    /* renamed from: T0 */
    public final int mo79923T0() {
        return this.f67995c;
    }

    /* renamed from: X0 */
    public final synchronized void mo79924X0(boolean z, int i, C11179b bVar, int i2) throws IOException {
        if (!this.f67996d) {
            mo79926c(i, z ? 1 : 0, bVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    public final synchronized void mo79925b(C16839l lVar) throws IOException {
        C13706o.m87929f(lVar, "peerSettings");
        if (!this.f67996d) {
            this.f67995c = lVar.mo79952e(this.f67995c);
            if (lVar.mo79949b() != -1) {
                this.f67997f.mo79805e(lVar.mo79949b());
            }
            mo79930e(0, 0, 4, 1);
            this.f67998g.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: c */
    public final void mo79926c(int i, int i2, C11179b bVar, int i3) throws IOException {
        mo79930e(i, i3, 0, i2);
        if (i3 > 0) {
            C11184c cVar = this.f67998g;
            C13706o.m87926c(bVar);
            cVar.mo62384X(bVar, (long) i3);
        }
    }

    public synchronized void close() throws IOException {
        this.f67996d = true;
        this.f67998g.close();
    }

    /* renamed from: d */
    public final synchronized void mo79928d(int i, long j) throws IOException {
        if (!this.f67996d) {
            if (j != 0 && j <= 2147483647L) {
                mo79930e(i, 4, 8, 0);
                this.f67998g.writeInt((int) j);
                this.f67998g.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: d0 */
    public final synchronized void mo79929d0() throws IOException {
        if (this.f67996d) {
            throw new IOException("closed");
        } else if (this.f67999o) {
            Logger logger = f67992p;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C16279b.m97663q(">> CONNECTION " + C16801d.f67830a.mo62502m(), new Object[0]));
            }
            this.f67998g.mo62419V(C16801d.f67830a);
            this.f67998g.flush();
        }
    }

    /* renamed from: e */
    public final void mo79930e(int i, int i2, int i3, int i4) throws IOException {
        Logger logger = f67992p;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C16801d.f67834e.mo79811c(false, i, i2, i3, i4));
        }
        boolean z = true;
        if (i2 <= this.f67995c) {
            if ((((int) 2147483648L) & i) != 0) {
                z = false;
            }
            if (z) {
                C16279b.m97646V(this.f67998g, i2);
                this.f67998g.writeByte(i3 & 255);
                this.f67998g.writeByte(i4 & 255);
                this.f67998g.writeInt(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(("reserved bit set: " + i).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f67995c + ": " + i2).toString());
    }

    /* renamed from: f */
    public final synchronized void mo79931f(int i, C16794a aVar, byte[] bArr) throws IOException {
        C13706o.m87929f(aVar, "errorCode");
        C13706o.m87929f(bArr, "debugData");
        if (!this.f67996d) {
            boolean z = false;
            if (aVar.mo79791b() != -1) {
                mo79930e(0, bArr.length + 8, 7, 0);
                this.f67998g.writeInt(i);
                this.f67998g.writeInt(aVar.mo79791b());
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.f67998g.write(bArr);
                }
                this.f67998g.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void flush() throws IOException {
        if (!this.f67996d) {
            this.f67998g.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: g */
    public final synchronized void mo79933g(boolean z, int i, List<C16796b> list) throws IOException {
        C13706o.m87929f(list, "headerBlock");
        if (!this.f67996d) {
            this.f67997f.mo79807g(list);
            long D = this.f67994a.mo62399D();
            long min = Math.min((long) this.f67995c, D);
            int i2 = (D > min ? 1 : (D == min ? 0 : -1));
            int i3 = i2 == 0 ? 4 : 0;
            if (z) {
                i3 |= 1;
            }
            mo79930e(i, (int) min, 1, i3);
            this.f67998g.mo62384X(this.f67994a, min);
            if (i2 > 0) {
                m99786m(i, D - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: h */
    public final synchronized void mo79934h(int i, int i2, List<C16796b> list) throws IOException {
        C13706o.m87929f(list, "requestHeaders");
        if (!this.f67996d) {
            this.f67997f.mo79807g(list);
            long D = this.f67994a.mo62399D();
            int min = (int) Math.min(((long) this.f67995c) - 4, D);
            int i3 = min + 4;
            long j = (long) min;
            int i4 = (D > j ? 1 : (D == j ? 0 : -1));
            mo79930e(i, i3, 5, i4 == 0 ? 4 : 0);
            this.f67998g.writeInt(i2 & Integer.MAX_VALUE);
            this.f67998g.mo62384X(this.f67994a, j);
            if (i4 > 0) {
                m99786m(i, D - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: i */
    public final synchronized void mo79935i(int i, C16794a aVar) throws IOException {
        C13706o.m87929f(aVar, "errorCode");
        if (!this.f67996d) {
            if (aVar.mo79791b() != -1) {
                mo79930e(i, 4, 3, 0);
                this.f67998g.writeInt(aVar.mo79791b());
                this.f67998g.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: j */
    public final synchronized void mo79936j(C16839l lVar) throws IOException {
        C13706o.m87929f(lVar, "settings");
        if (!this.f67996d) {
            int i = 0;
            mo79930e(0, lVar.mo79956i() * 6, 4, 0);
            while (i < 10) {
                if (lVar.mo79953f(i)) {
                    this.f67998g.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                    this.f67998g.writeInt(lVar.mo79948a(i));
                }
                i++;
            }
            this.f67998g.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: k */
    public final synchronized void mo79937k(boolean z, int i, int i2) throws IOException {
        if (!this.f67996d) {
            mo79930e(0, 8, 6, z ? 1 : 0);
            this.f67998g.writeInt(i);
            this.f67998g.writeInt(i2);
            this.f67998g.flush();
        } else {
            throw new IOException("closed");
        }
    }
}
