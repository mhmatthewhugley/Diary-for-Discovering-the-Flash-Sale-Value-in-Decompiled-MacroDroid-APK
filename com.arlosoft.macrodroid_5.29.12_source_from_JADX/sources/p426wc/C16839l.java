package p426wc;

import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0011\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0000R\u0011\u0010\u0012\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, mo71668d2 = {"Lwc/l;", "", "", "id", "value", "h", "", "f", "a", "i", "d", "defaultValue", "e", "other", "Lja/u;", "g", "b", "()I", "headerTableSize", "c", "initialWindowSize", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: wc.l */
/* compiled from: Settings.kt */
public final class C16839l {

    /* renamed from: c */
    public static final C16840a f68009c = new C16840a((C13695i) null);

    /* renamed from: a */
    private int f68010a;

    /* renamed from: b */
    private final int[] f68011b = new int[10];

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, mo71668d2 = {"Lwc/l$a;", "", "", "COUNT", "I", "DEFAULT_INITIAL_WINDOW_SIZE", "ENABLE_PUSH", "HEADER_TABLE_SIZE", "INITIAL_WINDOW_SIZE", "MAX_CONCURRENT_STREAMS", "MAX_FRAME_SIZE", "MAX_HEADER_LIST_SIZE", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.l$a */
    /* compiled from: Settings.kt */
    public static final class C16840a {
        private C16840a() {
        }

        public /* synthetic */ C16840a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo79948a(int i) {
        return this.f68011b[i];
    }

    /* renamed from: b */
    public final int mo79949b() {
        if ((this.f68010a & 2) != 0) {
            return this.f68011b[1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo79950c() {
        if ((this.f68010a & 128) != 0) {
            return this.f68011b[7];
        }
        return 65535;
    }

    /* renamed from: d */
    public final int mo79951d() {
        if ((this.f68010a & 16) != 0) {
            return this.f68011b[4];
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: e */
    public final int mo79952e(int i) {
        return (this.f68010a & 32) != 0 ? this.f68011b[5] : i;
    }

    /* renamed from: f */
    public final boolean mo79953f(int i) {
        return ((1 << i) & this.f68010a) != 0;
    }

    /* renamed from: g */
    public final void mo79954g(C16839l lVar) {
        C13706o.m87929f(lVar, "other");
        for (int i = 0; i < 10; i++) {
            if (lVar.mo79953f(i)) {
                mo79955h(i, lVar.mo79948a(i));
            }
        }
    }

    /* renamed from: h */
    public final C16839l mo79955h(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f68011b;
            if (i < iArr.length) {
                this.f68010a = (1 << i) | this.f68010a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* renamed from: i */
    public final int mo79956i() {
        return Integer.bitCount(this.f68010a);
    }
}
