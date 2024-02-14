package p424wa;

import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0016"}, mo71668d2 = {"Lwa/e;", "Lwa/c;", "Lwa/b;", "", "value", "", "k", "isEmpty", "", "other", "equals", "hashCode", "", "toString", "m", "()Ljava/lang/Integer;", "start", "l", "endInclusive", "<init>", "(II)V", "a", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: wa.e */
/* compiled from: Ranges.kt */
public final class C16788e extends C16785c implements C16783b<Integer> {

    /* renamed from: g */
    public static final C16789a f67768g = new C16789a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final C16788e f67769o = new C16788e(1, 0);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo71668d2 = {"Lwa/e$a;", "", "Lwa/e;", "EMPTY", "Lwa/e;", "a", "()Lwa/e;", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: wa.e$a */
    /* compiled from: Ranges.kt */
    public static final class C16789a {
        private C16789a() {
        }

        public /* synthetic */ C16789a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C16788e mo79778a() {
            return C16788e.f67769o;
        }
    }

    public C16788e(int i, int i2) {
        super(i, i2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C16788e) {
            if (!isEmpty() || !((C16788e) obj).isEmpty()) {
                C16788e eVar = (C16788e) obj;
                if (!(mo79764d() == eVar.mo79764d() && mo79766f() == eVar.mo79766f())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo79764d() * 31) + mo79766f();
    }

    public boolean isEmpty() {
        return mo79764d() > mo79766f();
    }

    /* renamed from: k */
    public boolean mo79775k(int i) {
        return mo79764d() <= i && i <= mo79766f();
    }

    /* renamed from: l */
    public Integer getEndInclusive() {
        return Integer.valueOf(mo79766f());
    }

    /* renamed from: m */
    public Integer getStart() {
        return Integer.valueOf(mo79764d());
    }

    public String toString() {
        return mo79764d() + ".." + mo79766f();
    }
}
