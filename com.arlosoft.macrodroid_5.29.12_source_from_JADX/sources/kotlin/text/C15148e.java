package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.sequences.C15118h;
import p297ja.C13328m;
import p370qa.C16269p;
import p379ra.C16368a;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012&\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0014"}, mo71668d2 = {"Lkotlin/text/e;", "Lkotlin/sequences/h;", "Lwa/e;", "", "iterator", "", "a", "Ljava/lang/CharSequence;", "input", "", "b", "I", "startIndex", "c", "limit", "Lkotlin/Function2;", "Lja/m;", "getNextMatch", "<init>", "(Ljava/lang/CharSequence;IILqa/p;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.text.e */
/* compiled from: Strings.kt */
final class C15148e implements C15118h<C16788e> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f64357a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f64358b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f64359c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C16269p<CharSequence, Integer, C13328m<Integer, Integer>> f64360d;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0002J\t\u0010\u0007\u001a\u00020\u0006H\u0002R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\"\u0010\u0016\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\"\u0010\u001a\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\r¨\u0006\u001b"}, mo71668d2 = {"kotlin/text/e$a", "", "Lwa/e;", "Lja/u;", "a", "b", "", "hasNext", "", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "c", "getCurrentStartIndex", "setCurrentStartIndex", "currentStartIndex", "d", "getNextSearchIndex", "setNextSearchIndex", "nextSearchIndex", "g", "getCounter", "setCounter", "counter", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.text.e$a */
    /* compiled from: Strings.kt */
    public static final class C15149a implements Iterator<C16788e>, C16368a {

        /* renamed from: a */
        private int f64361a = -1;

        /* renamed from: c */
        private int f64362c;

        /* renamed from: d */
        private int f64363d;

        /* renamed from: f */
        private C16788e f64364f;

        /* renamed from: g */
        private int f64365g;

        /* renamed from: o */
        final /* synthetic */ C15148e f64366o;

        C15149a(C15148e eVar) {
            this.f64366o = eVar;
            int f = C16792h.m99544f(eVar.f64358b, 0, eVar.f64357a.length());
            this.f64362c = f;
            this.f64363d = f;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < kotlin.text.C15148e.m93527e(r6.f64366o)) goto L_0x0023;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m93529a() {
            /*
                r6 = this;
                int r0 = r6.f64363d
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f64361a = r1
                r0 = 0
                r6.f64364f = r0
                goto L_0x009e
            L_0x000c:
                kotlin.text.e r0 = r6.f64366o
                int r0 = r0.f64359c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f64365g
                int r0 = r0 + r3
                r6.f64365g = r0
                kotlin.text.e r4 = r6.f64366o
                int r4 = r4.f64359c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f64363d
                kotlin.text.e r4 = r6.f64366o
                java.lang.CharSequence r4 = r4.f64357a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                wa.e r0 = new wa.e
                int r1 = r6.f64362c
                kotlin.text.e r4 = r6.f64366o
                java.lang.CharSequence r4 = r4.f64357a
                int r4 = kotlin.text.C15177w.m93676U(r4)
                r0.<init>(r1, r4)
                r6.f64364f = r0
                r6.f64363d = r2
                goto L_0x009c
            L_0x0047:
                kotlin.text.e r0 = r6.f64366o
                qa.p r0 = r0.f64360d
                kotlin.text.e r4 = r6.f64366o
                java.lang.CharSequence r4 = r4.f64357a
                int r5 = r6.f64363d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                ja.m r0 = (p297ja.C13328m) r0
                if (r0 != 0) goto L_0x0077
                wa.e r0 = new wa.e
                int r1 = r6.f64362c
                kotlin.text.e r4 = r6.f64366o
                java.lang.CharSequence r4 = r4.f64357a
                int r4 = kotlin.text.C15177w.m93676U(r4)
                r0.<init>(r1, r4)
                r6.f64364f = r0
                r6.f64363d = r2
                goto L_0x009c
            L_0x0077:
                java.lang.Object r2 = r0.mo70152a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo70153b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f64362c
                wa.e r4 = p424wa.C16792h.m99549k(r4, r2)
                r6.f64364f = r4
                int r2 = r2 + r0
                r6.f64362c = r2
                if (r0 != 0) goto L_0x0099
                r1 = 1
            L_0x0099:
                int r2 = r2 + r1
                r6.f64363d = r2
            L_0x009c:
                r6.f64361a = r3
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C15148e.C15149a.m93529a():void");
        }

        /* renamed from: b */
        public C16788e next() {
            if (this.f64361a == -1) {
                m93529a();
            }
            if (this.f64361a != 0) {
                C16788e eVar = this.f64364f;
                C13706o.m87927d(eVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f64364f = null;
                this.f64361a = -1;
                return eVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f64361a == -1) {
                m93529a();
            }
            return this.f64361a == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C15148e(CharSequence charSequence, int i, int i2, C16269p<? super CharSequence, ? super Integer, C13328m<Integer, Integer>> pVar) {
        C13706o.m87929f(charSequence, "input");
        C13706o.m87929f(pVar, "getNextMatch");
        this.f64357a = charSequence;
        this.f64358b = i;
        this.f64359c = i2;
        this.f64360d = pVar;
    }

    public Iterator<C16788e> iterator() {
        return new C15149a(this);
    }
}
