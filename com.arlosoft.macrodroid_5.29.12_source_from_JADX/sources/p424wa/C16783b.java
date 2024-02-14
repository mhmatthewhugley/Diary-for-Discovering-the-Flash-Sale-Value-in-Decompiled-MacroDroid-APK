package p424wa;

import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, mo71668d2 = {"Lwa/b;", "", "T", "", "", "isEmpty", "getStart", "()Ljava/lang/Comparable;", "start", "getEndInclusive", "endInclusive", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: wa.b */
/* compiled from: Range.kt */
public interface C16783b<T extends Comparable<? super T>> {

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: wa.b$a */
    /* compiled from: Range.kt */
    public static final class C16784a {
        /* renamed from: a */
        public static <T extends Comparable<? super T>> boolean m99518a(C16783b<T> bVar, T t) {
            C13706o.m87929f(t, "value");
            return t.compareTo(bVar.getStart()) >= 0 && t.compareTo(bVar.getEndInclusive()) <= 0;
        }

        /* renamed from: b */
        public static <T extends Comparable<? super T>> boolean m99519b(C16783b<T> bVar) {
            return bVar.getStart().compareTo(bVar.getEndInclusive()) > 0;
        }
    }

    T getEndInclusive();

    T getStart();

    boolean isEmpty();
}
