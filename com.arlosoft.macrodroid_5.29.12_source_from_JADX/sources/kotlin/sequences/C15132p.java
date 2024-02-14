package kotlin.sequences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13704m;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16265l;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0003\u001a$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00020\u0005\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u001a0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u001a\"\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\f*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001a$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00020\u0005\u001a0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u001a7\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u0011*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0011\u0010\u0013\u001a\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a<\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\b\u001a6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u001a<\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0018*\u00020\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\b\u001a\u0016\u0010\u001d\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a.\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a-\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0002\u001a}\u0010-\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010\u000e*\u00060$j\u0002`%*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010&\u001a\u00028\u00012\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020'2\b\b\u0002\u0010+\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020'2\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020'\u0018\u00010\b¢\u0006\u0004\b-\u0010.\u001a`\u00100\u001a\u00020/\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020'2\b\b\u0002\u0010+\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020'2\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020'\u0018\u00010\b\u001a\u001c\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u00062"}, mo71668d2 = {"T", "Lkotlin/sequences/h;", "q", "(Lkotlin/sequences/h;)Ljava/lang/Object;", "v", "", "n", "m", "Lkotlin/Function1;", "", "predicate", "o", "", "p", "A", "B", "", "C", "destination", "(Lkotlin/sequences/h;Ljava/util/Collection;)Ljava/util/Collection;", "", "D", "", "E", "R", "transform", "r", "w", "x", "l", "element", "z", "(Lkotlin/sequences/h;Ljava/lang/Object;)Lkotlin/sequences/h;", "", "elements", "y", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "s", "(Lkotlin/sequences/h;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lqa/l;)Ljava/lang/Appendable;", "", "t", "k", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/sequences/SequencesKt")
/* renamed from: kotlin.sequences.p */
/* compiled from: _Sequences.kt */
class C15132p extends C15131o {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004"}, mo71668d2 = {"kotlin/sequences/p$a", "", "", "iterator", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.sequences.p$a */
    /* compiled from: Iterables.kt */
    public static final class C15133a implements Iterable<T>, C16368a {

        /* renamed from: a */
        final /* synthetic */ C15118h f64325a;

        public C15133a(C15118h hVar) {
            this.f64325a = hVar;
        }

        public Iterator<T> iterator() {
            return this.f64325a.iterator();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"", "T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.sequences.p$b */
    /* compiled from: _Sequences.kt */
    static final class C15134b extends C13708q implements C16265l<T, Boolean> {

        /* renamed from: a */
        public static final C15134b f64326a = new C15134b();

        C15134b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(T t) {
            return Boolean.valueOf(t == null);
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: kotlin.sequences.p$c */
    /* compiled from: _Sequences.kt */
    /* synthetic */ class C15135c extends C13704m implements C16265l<C15118h<? extends R>, Iterator<? extends R>> {

        /* renamed from: a */
        public static final C15135c f64327a = new C15135c();

        C15135c() {
            super(1, C15118h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        /* renamed from: l */
        public final Iterator<R> invoke(C15118h<? extends R> hVar) {
            C13706o.m87929f(hVar, "p0");
            return hVar.iterator();
        }
    }

    /* renamed from: A */
    public static <T> C15118h<T> m93477A(C15118h<? extends T> hVar, int i) {
        C13706o.m87929f(hVar, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return C15125n.m93470e();
        } else {
            if (hVar instanceof C15110c) {
                return ((C15110c) hVar).mo74408b(i);
            }
            return new C15138r(hVar, i);
        }
    }

    /* renamed from: B */
    public static <T> C15118h<T> m93478B(C15118h<? extends T> hVar, C16265l<? super T, Boolean> lVar) {
        C13706o.m87929f(hVar, "<this>");
        C13706o.m87929f(lVar, "predicate");
        return new C15140s(hVar, lVar);
    }

    /* renamed from: C */
    public static final <T, C extends Collection<? super T>> C m93479C(C15118h<? extends T> hVar, C c) {
        C13706o.m87929f(hVar, "<this>");
        C13706o.m87929f(c, "destination");
        for (Object add : hVar) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: D */
    public static <T> List<T> m93480D(C15118h<? extends T> hVar) {
        C13706o.m87929f(hVar, "<this>");
        return C13614t.m87755q(m93481E(hVar));
    }

    /* renamed from: E */
    public static <T> List<T> m93481E(C15118h<? extends T> hVar) {
        C13706o.m87929f(hVar, "<this>");
        return (List) m93479C(hVar, new ArrayList());
    }

    /* renamed from: k */
    public static <T> Iterable<T> m93482k(C15118h<? extends T> hVar) {
        C13706o.m87929f(hVar, "<this>");
        return new C15133a(hVar);
    }

    /* renamed from: l */
    public static <T> int m93483l(C15118h<? extends T> hVar) {
        C13706o.m87929f(hVar, "<this>");
        Iterator<? extends T> it = hVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                C13614t.m87757s();
            }
        }
        return i;
    }

    /* renamed from: m */
    public static <T> C15118h<T> m93484m(C15118h<? extends T> hVar, int i) {
        C13706o.m87929f(hVar, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return hVar;
        } else {
            if (hVar instanceof C15110c) {
                return ((C15110c) hVar).mo74407a(i);
            }
            return new C15108b(hVar, i);
        }
    }

    /* renamed from: n */
    public static <T> C15118h<T> m93485n(C15118h<? extends T> hVar, C16265l<? super T, Boolean> lVar) {
        C13706o.m87929f(hVar, "<this>");
        C13706o.m87929f(lVar, "predicate");
        return new C15112e(hVar, true, lVar);
    }

    /* renamed from: o */
    public static <T> C15118h<T> m93486o(C15118h<? extends T> hVar, C16265l<? super T, Boolean> lVar) {
        C13706o.m87929f(hVar, "<this>");
        C13706o.m87929f(lVar, "predicate");
        return new C15112e(hVar, false, lVar);
    }

    /* renamed from: p */
    public static <T> C15118h<T> m93487p(C15118h<? extends T> hVar) {
        C13706o.m87929f(hVar, "<this>");
        C15118h<T> o = m93486o(hVar, C15134b.f64326a);
        C13706o.m87927d(o, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return o;
    }

    /* renamed from: q */
    public static <T> T m93488q(C15118h<? extends T> hVar) {
        C13706o.m87929f(hVar, "<this>");
        Iterator<? extends T> it = hVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: r */
    public static <T, R> C15118h<R> m93489r(C15118h<? extends T> hVar, C16265l<? super T, ? extends C15118h<? extends R>> lVar) {
        C13706o.m87929f(hVar, "<this>");
        C13706o.m87929f(lVar, "transform");
        return new C15114f(hVar, lVar, C15135c.f64327a);
    }

    /* renamed from: s */
    public static final <T, A extends Appendable> A m93490s(C15118h<? extends T> hVar, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C16265l<? super T, ? extends CharSequence> lVar) {
        C13706o.m87929f(hVar, "<this>");
        C13706o.m87929f(a, "buffer");
        C13706o.m87929f(charSequence, "separator");
        C13706o.m87929f(charSequence2, "prefix");
        C13706o.m87929f(charSequence3, "postfix");
        C13706o.m87929f(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : hVar) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C15166n.m93609a(a, next, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: t */
    public static final <T> String m93491t(C15118h<? extends T> hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C16265l<? super T, ? extends CharSequence> lVar) {
        C13706o.m87929f(hVar, "<this>");
        C13706o.m87929f(charSequence, "separator");
        C13706o.m87929f(charSequence2, "prefix");
        C13706o.m87929f(charSequence3, "postfix");
        C13706o.m87929f(charSequence4, "truncated");
        String sb = ((StringBuilder) m93490s(hVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C13706o.m87928e(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: u */
    public static /* synthetic */ String m93492u(C15118h hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C16265l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return m93491t(hVar, charSequence, charSequence6, charSequence5, i3, charSequence7, lVar);
    }

    /* renamed from: v */
    public static <T> T m93493v(C15118h<? extends T> hVar) {
        C13706o.m87929f(hVar, "<this>");
        Iterator<? extends T> it = hVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* renamed from: w */
    public static <T, R> C15118h<R> m93494w(C15118h<? extends T> hVar, C16265l<? super T, ? extends R> lVar) {
        C13706o.m87929f(hVar, "<this>");
        C13706o.m87929f(lVar, "transform");
        return new C15142t(hVar, lVar);
    }

    /* renamed from: x */
    public static <T, R> C15118h<R> m93495x(C15118h<? extends T> hVar, C16265l<? super T, ? extends R> lVar) {
        C13706o.m87929f(hVar, "<this>");
        C13706o.m87929f(lVar, "transform");
        return m93487p(new C15142t(hVar, lVar));
    }

    /* renamed from: y */
    public static <T> C15118h<T> m93496y(C15118h<? extends T> hVar, Iterable<? extends T> iterable) {
        C13706o.m87929f(hVar, "<this>");
        C13706o.m87929f(iterable, "elements");
        return C15125n.m93471f(C15125n.m93475j(hVar, C13566b0.m87412N(iterable)));
    }

    /* renamed from: z */
    public static <T> C15118h<T> m93497z(C15118h<? extends T> hVar, T t) {
        C13706o.m87929f(hVar, "<this>");
        return C15125n.m93471f(C15125n.m93475j(hVar, C15125n.m93475j(t)));
    }
}
