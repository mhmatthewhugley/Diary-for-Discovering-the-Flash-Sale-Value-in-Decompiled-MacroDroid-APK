package p226cd;

import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0016¢\u0006\u0004\b\r\u0010\u000eB1\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\r\u0010\u0016J\u0006\u0010\u0002\u001a\u00020\u0000J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0017"}, mo71668d2 = {"Lcd/t;", "", "d", "b", "segment", "c", "", "byteCount", "e", "Lja/u;", "a", "sink", "f", "<init>", "()V", "", "data", "pos", "limit", "", "shared", "owner", "([BIIZZ)V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.t */
/* compiled from: Segment.kt */
public final class C11206t {

    /* renamed from: h */
    public static final C11207a f54141h = new C11207a((C13695i) null);

    /* renamed from: a */
    public final byte[] f54142a;

    /* renamed from: b */
    public int f54143b;

    /* renamed from: c */
    public int f54144c;

    /* renamed from: d */
    public boolean f54145d;

    /* renamed from: e */
    public boolean f54146e;

    /* renamed from: f */
    public C11206t f54147f;

    /* renamed from: g */
    public C11206t f54148g;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, mo71668d2 = {"Lcd/t$a;", "", "", "SHARE_MINIMUM", "I", "SIZE", "<init>", "()V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* renamed from: cd.t$a */
    /* compiled from: Segment.kt */
    public static final class C11207a {
        private C11207a() {
        }

        public /* synthetic */ C11207a(C13695i iVar) {
            this();
        }
    }

    public C11206t() {
        this.f54142a = new byte[8192];
        this.f54146e = true;
        this.f54145d = false;
    }

    /* renamed from: a */
    public final void mo62561a() {
        C11206t tVar = this.f54148g;
        int i = 0;
        if (tVar != this) {
            C13706o.m87926c(tVar);
            if (tVar.f54146e) {
                int i2 = this.f54144c - this.f54143b;
                C11206t tVar2 = this.f54148g;
                C13706o.m87926c(tVar2);
                int i3 = 8192 - tVar2.f54144c;
                C11206t tVar3 = this.f54148g;
                C13706o.m87926c(tVar3);
                if (!tVar3.f54145d) {
                    C11206t tVar4 = this.f54148g;
                    C13706o.m87926c(tVar4);
                    i = tVar4.f54143b;
                }
                if (i2 <= i3 + i) {
                    C11206t tVar5 = this.f54148g;
                    C13706o.m87926c(tVar5);
                    mo62566f(tVar5, i2);
                    mo62562b();
                    C11208u.m75234b(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    /* renamed from: b */
    public final C11206t mo62562b() {
        C11206t tVar = this.f54147f;
        if (tVar == this) {
            tVar = null;
        }
        C11206t tVar2 = this.f54148g;
        C13706o.m87926c(tVar2);
        tVar2.f54147f = this.f54147f;
        C11206t tVar3 = this.f54147f;
        C13706o.m87926c(tVar3);
        tVar3.f54148g = this.f54148g;
        this.f54147f = null;
        this.f54148g = null;
        return tVar;
    }

    /* renamed from: c */
    public final C11206t mo62563c(C11206t tVar) {
        C13706o.m87929f(tVar, "segment");
        tVar.f54148g = this;
        tVar.f54147f = this.f54147f;
        C11206t tVar2 = this.f54147f;
        C13706o.m87926c(tVar2);
        tVar2.f54148g = tVar;
        this.f54147f = tVar;
        return tVar;
    }

    /* renamed from: d */
    public final C11206t mo62564d() {
        this.f54145d = true;
        return new C11206t(this.f54142a, this.f54143b, this.f54144c, true, false);
    }

    /* renamed from: e */
    public final C11206t mo62565e(int i) {
        C11206t tVar;
        if (i > 0 && i <= this.f54144c - this.f54143b) {
            if (i >= 1024) {
                tVar = mo62564d();
            } else {
                tVar = C11208u.m75235c();
                byte[] bArr = this.f54142a;
                byte[] bArr2 = tVar.f54142a;
                int i2 = this.f54143b;
                byte[] unused = C13593l.m87560g(bArr, bArr2, 0, i2, i2 + i, 2, (Object) null);
            }
            tVar.f54144c = tVar.f54143b + i;
            this.f54143b += i;
            C11206t tVar2 = this.f54148g;
            C13706o.m87926c(tVar2);
            tVar2.mo62563c(tVar);
            return tVar;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    /* renamed from: f */
    public final void mo62566f(C11206t tVar, int i) {
        C13706o.m87929f(tVar, "sink");
        if (tVar.f54146e) {
            int i2 = tVar.f54144c;
            if (i2 + i > 8192) {
                if (!tVar.f54145d) {
                    int i3 = tVar.f54143b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = tVar.f54142a;
                        byte[] unused = C13593l.m87560g(bArr, bArr, 0, i3, i2, 2, (Object) null);
                        tVar.f54144c -= tVar.f54143b;
                        tVar.f54143b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f54142a;
            byte[] bArr3 = tVar.f54142a;
            int i4 = tVar.f54144c;
            int i5 = this.f54143b;
            byte[] unused2 = C13593l.m87558e(bArr2, bArr3, i4, i5, i5 + i);
            tVar.f54144c += i;
            this.f54143b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public C11206t(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        C13706o.m87929f(bArr, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        this.f54142a = bArr;
        this.f54143b = i;
        this.f54144c = i2;
        this.f54145d = z;
        this.f54146e = z2;
    }
}
