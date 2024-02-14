package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH$J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\bH\u0004R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, mo71668d2 = {"Lkotlin/collections/b;", "T", "", "", "d", "hasNext", "next", "()Ljava/lang/Object;", "Lja/u;", "a", "value", "c", "(Ljava/lang/Object;)V", "b", "Lkotlin/collections/b1;", "Lkotlin/collections/b1;", "state", "Ljava/lang/Object;", "nextValue", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.collections.b */
/* compiled from: AbstractIterator.kt */
public abstract class C13564b<T> implements Iterator<T>, C16368a {

    /* renamed from: a */
    private C13569b1 f61855a = C13569b1.NotReady;

    /* renamed from: c */
    private T f61856c;

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: kotlin.collections.b$a */
    /* compiled from: AbstractIterator.kt */
    public /* synthetic */ class C13565a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61857a;

        static {
            int[] iArr = new int[C13569b1.values().length];
            iArr[C13569b1.Done.ordinal()] = 1;
            iArr[C13569b1.Ready.ordinal()] = 2;
            f61857a = iArr;
        }
    }

    /* renamed from: d */
    private final boolean m87393d() {
        this.f61855a = C13569b1.Failed;
        mo71688a();
        return this.f61855a == C13569b1.Ready;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo71688a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo71689b() {
        this.f61855a = C13569b1.Done;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo71690c(T t) {
        this.f61856c = t;
        this.f61855a = C13569b1.Ready;
    }

    public boolean hasNext() {
        C13569b1 b1Var = this.f61855a;
        if (b1Var != C13569b1.Failed) {
            int i = C13565a.f61857a[b1Var.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return m87393d();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public T next() {
        if (hasNext()) {
            this.f61855a = C13569b1.NotReady;
            return this.f61856c;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
