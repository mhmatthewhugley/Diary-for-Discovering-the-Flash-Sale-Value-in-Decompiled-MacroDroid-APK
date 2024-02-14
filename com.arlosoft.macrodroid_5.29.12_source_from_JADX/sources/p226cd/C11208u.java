package p226cd;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0002¨\u0006\u000b"}, mo71668d2 = {"Lcd/u;", "", "Lcd/t;", "c", "segment", "Lja/u;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "a", "<init>", "()V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.u */
/* compiled from: SegmentPool.kt */
public final class C11208u {

    /* renamed from: a */
    public static final C11208u f54149a = new C11208u();

    /* renamed from: b */
    private static final int f54150b = 65536;

    /* renamed from: c */
    private static final C11206t f54151c = new C11206t(new byte[0], 0, 0, false, false);

    /* renamed from: d */
    private static final int f54152d;

    /* renamed from: e */
    private static final AtomicReference<C11206t>[] f54153e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f54152d = highestOneBit;
        AtomicReference<C11206t>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f54153e = atomicReferenceArr;
    }

    private C11208u() {
    }

    /* renamed from: a */
    private final AtomicReference<C11206t> m75233a() {
        return f54153e[(int) (Thread.currentThread().getId() & (((long) f54152d) - 1))];
    }

    /* renamed from: b */
    public static final void m75234b(C11206t tVar) {
        AtomicReference<C11206t> a;
        C11206t tVar2;
        int i;
        C13706o.m87929f(tVar, "segment");
        if (!(tVar.f54147f == null && tVar.f54148g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!tVar.f54145d && (tVar2 = a.get()) != f54151c) {
            if (tVar2 == null) {
                i = 0;
            } else {
                i = tVar2.f54144c;
            }
            if (i < f54150b) {
                tVar.f54147f = tVar2;
                tVar.f54143b = 0;
                tVar.f54144c = i + 8192;
                if (!(a = f54149a.m75233a()).compareAndSet(tVar2, tVar)) {
                    tVar.f54147f = null;
                }
            }
        }
    }

    /* renamed from: c */
    public static final C11206t m75235c() {
        AtomicReference<C11206t> a = f54149a.m75233a();
        C11206t tVar = f54151c;
        C11206t andSet = a.getAndSet(tVar);
        if (andSet == tVar) {
            return new C11206t();
        }
        if (andSet == null) {
            a.set((Object) null);
            return new C11206t();
        }
        a.set(andSet.f54147f);
        andSet.f54147f = null;
        andSet.f54144c = 0;
        return andSet;
    }
}
