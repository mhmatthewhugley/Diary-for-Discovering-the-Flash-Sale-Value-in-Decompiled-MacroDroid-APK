package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.sequences.C15118h;
import p297ja.C13328m;
import p297ja.C13337s;
import p370qa.C16254a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000¶\u0001\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001f\n\u0002\b\u0007\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u001f\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\n\u001a'\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0013\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u001d\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0016\u0010\n\u001a\u001f\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0017\u0010\u0007\u001a\u001f\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0018\u0010\n\u001a\u001d\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0019\u0010\u0007\u001a\u001d\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u001a\u0010\n\u001a\u001f\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001b\u0010\u0007\u001a\u001f\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u001c\u0010\n\u001a$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r\u001a$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001d\u001a\u00020\r\u001a6\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030 H\bø\u0001\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0000*\u00020#*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001a=\u0010'\u001a\u00028\u0000\"\u0010\b\u0000\u0010%*\n\u0012\u0006\b\u0000\u0012\u00028\u00010$\"\b\b\u0001\u0010\u0000*\u00020#*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010&\u001a\u00028\u0000¢\u0006\u0004\b'\u0010(\u001a$\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r\u001a$\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001d\u001a\u00020\r\u001a\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a&\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000,*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a8\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u00100\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000.j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`/\u001a\u0010\u00104\u001a\u000203*\b\u0012\u0004\u0012\u00020\u000302\u001a\u0010\u00106\u001a\u000205*\b\u0012\u0004\u0012\u00020\r02\u001a\u0010\u00109\u001a\u000208*\b\u0012\u0004\u0012\u00020702\u001a7\u0010:\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010%*\n\u0012\u0006\b\u0000\u0012\u00028\u00000$*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010&\u001a\u00028\u0001¢\u0006\u0004\b:\u0010(\u001a&\u0010=\u001a\u0012\u0012\u0004\u0012\u00028\u00000;j\b\u0012\u0004\u0012\u00028\u0000`<\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000?\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000002\u001a\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000B\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a<\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u001f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H\bø\u0001\u0000\u001a\"\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000F0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a-\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000B\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0004\u001a\u001c\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000K\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a-\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000B\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0004\u001a0\u0010N\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030 H\bø\u0001\u0000\u001a\u0016\u0010O\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a+\u0010P\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000,*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\bP\u0010Q\u001a.\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\bR\u0010S\u001a.\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\bT\u0010S\u001a.\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u0000022\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\bU\u0010V\u001a-\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002\u001a-\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u0000022\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002\u001a?\u0010[\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010Z0\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u001f*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0004\u001a}\u0010f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010^*\u00060\\j\u0002`]*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010_\u001a\u00028\u00012\b\b\u0002\u0010a\u001a\u00020`2\b\b\u0002\u0010b\u001a\u00020`2\b\b\u0002\u0010c\u001a\u00020`2\b\b\u0002\u0010d\u001a\u00020\r2\b\b\u0002\u0010e\u001a\u00020`2\u0016\b\u0002\u0010D\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020`\u0018\u00010 ¢\u0006\u0004\bf\u0010g\u001a`\u0010i\u001a\u00020h\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010a\u001a\u00020`2\b\b\u0002\u0010b\u001a\u00020`2\b\b\u0002\u0010c\u001a\u00020`2\b\b\u0002\u0010d\u001a\u00020\r2\b\b\u0002\u0010e\u001a\u00020`2\u0016\b\u0002\u0010D\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020`\u0018\u00010 \u001a\u001c\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000j\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u0002\u0007\n\u0005\b20\u0001¨\u0006l"}, mo71668d2 = {"T", "", "element", "", "O", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "V", "(Ljava/lang/Iterable;)Ljava/lang/Object;", "", "W", "(Ljava/util/List;)Ljava/lang/Object;", "X", "Y", "", "index", "Z", "(Ljava/util/List;I)Ljava/lang/Object;", "a0", "(Ljava/lang/Iterable;Ljava/lang/Object;)I", "b0", "(Ljava/util/List;Ljava/lang/Object;)I", "h0", "i0", "j0", "k0", "t0", "u0", "v0", "w0", "n", "Q", "R", "Lkotlin/Function1;", "predicate", "S", "", "", "C", "destination", "U", "(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;", "z0", "A0", "s0", "", "x0", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "y0", "", "", "B0", "", "E0", "", "", "G0", "C0", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "D0", "F0", "", "H0", "I0", "", "K0", "transform", "l0", "Lkotlin/collections/k0;", "M0", "P", "other", "c0", "", "J0", "L0", "L", "M", "m0", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "n0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;", "p0", "r0", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "elements", "o0", "q0", "Lja/m;", "N0", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "d0", "(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lqa/l;)Ljava/lang/Appendable;", "", "f0", "Lkotlin/sequences/h;", "N", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.b0 */
/* compiled from: _Collections.kt */
class C13566b0 extends C13562a0 {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004"}, mo71668d2 = {"kotlin/collections/b0$a", "Lkotlin/sequences/h;", "", "iterator", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.collections.b0$a */
    /* compiled from: Sequences.kt */
    public static final class C13567a implements C15118h<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f61858a;

        public C13567a(Iterable iterable) {
            this.f61858a = iterable;
        }

        public Iterator<T> iterator() {
            return this.f61858a.iterator();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"T", "", "a", "()Ljava/util/Iterator;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.collections.b0$b */
    /* compiled from: _Collections.kt */
    static final class C13568b extends C13708q implements C16254a<Iterator<? extends T>> {
        final /* synthetic */ Iterable<T> $this_withIndex;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13568b(Iterable<? extends T> iterable) {
            super(0);
            this.$this_withIndex = iterable;
        }

        /* renamed from: a */
        public final Iterator<T> invoke() {
            return this.$this_withIndex.iterator();
        }
    }

    /* renamed from: A0 */
    public static <T> List<T> m87397A0(List<? extends T> list, int i) {
        C13706o.m87929f(list, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return C13614t.m87748j();
        } else {
            int size = list.size();
            if (i >= size) {
                return m87402F0(list);
            }
            if (i == 1) {
                return C13612s.m87736e(m87434i0(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator<? extends T> listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    /* renamed from: B0 */
    public static boolean[] m87398B0(Collection<Boolean> collection) {
        C13706o.m87929f(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        int i = 0;
        for (Boolean booleanValue : collection) {
            zArr[i] = booleanValue.booleanValue();
            i++;
        }
        return zArr;
    }

    /* renamed from: C0 */
    public static final <T, C extends Collection<? super T>> C m87399C0(Iterable<? extends T> iterable, C c) {
        C13706o.m87929f(iterable, "<this>");
        C13706o.m87929f(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: D0 */
    public static final <T> HashSet<T> m87400D0(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        return (HashSet) m87399C0(iterable, new HashSet(C13613s0.m87740e(C13616u.m87774u(iterable, 12))));
    }

    /* renamed from: E0 */
    public static int[] m87401E0(Collection<Integer> collection) {
        C13706o.m87929f(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer intValue : collection) {
            iArr[i] = intValue.intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: F0 */
    public static <T> List<T> m87402F0(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C13614t.m87755q(m87404H0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C13614t.m87748j();
        }
        if (size != 1) {
            return m87405I0(collection);
        }
        return C13612s.m87736e(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: G0 */
    public static long[] m87403G0(Collection<Long> collection) {
        C13706o.m87929f(collection, "<this>");
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Long longValue : collection) {
            jArr[i] = longValue.longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: H0 */
    public static final <T> List<T> m87404H0(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m87405I0((Collection) iterable);
        }
        return (List) m87399C0(iterable, new ArrayList());
    }

    /* renamed from: I0 */
    public static <T> List<T> m87405I0(Collection<? extends T> collection) {
        C13706o.m87929f(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: J0 */
    public static <T> Set<T> m87406J0(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) m87399C0(iterable, new LinkedHashSet());
    }

    /* renamed from: K0 */
    public static <T> Set<T> m87407K0(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C13627z0.m87808f((Set) m87399C0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C13627z0.m87806d();
        }
        if (size != 1) {
            return (Set) m87399C0(iterable, new LinkedHashSet(C13613s0.m87740e(collection.size())));
        }
        return C13625y0.m87800c(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: L */
    public static <T> boolean m87408L(Iterable<? extends T> iterable, C16265l<? super T, Boolean> lVar) {
        C13706o.m87929f(iterable, "<this>");
        C13706o.m87929f(lVar, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object invoke : iterable) {
            if (!lVar.invoke(invoke).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: L0 */
    public static <T> Set<T> m87409L0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C13706o.m87929f(iterable, "<this>");
        C13706o.m87929f(iterable2, "other");
        Set<T> J0 = m87406J0(iterable);
        boolean unused = C13624y.m87797z(J0, iterable2);
        return J0;
    }

    /* renamed from: M */
    public static <T> boolean m87410M(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return !((Collection) iterable).isEmpty();
        }
        return iterable.iterator().hasNext();
    }

    /* renamed from: M0 */
    public static <T> Iterable<C13592k0<T>> m87411M0(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        return new C13595l0(new C13568b(iterable));
    }

    /* renamed from: N */
    public static <T> C15118h<T> m87412N(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        return new C13567a(iterable);
    }

    /* renamed from: N0 */
    public static <T, R> List<C13328m<T, R>> m87413N0(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        C13706o.m87929f(iterable, "<this>");
        C13706o.m87929f(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C13616u.m87774u(iterable, 10), C13616u.m87774u(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C13337s.m85692a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: O */
    public static <T> boolean m87414O(Iterable<? extends T> iterable, T t) {
        C13706o.m87929f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        return m87426a0(iterable, t) >= 0;
    }

    /* renamed from: P */
    public static <T> List<T> m87415P(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        return m87402F0(m87406J0(iterable));
    }

    /* renamed from: Q */
    public static <T> List<T> m87416Q(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        C13706o.m87929f(iterable, "<this>");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return m87402F0(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    return C13614t.m87748j();
                }
                if (size == 1) {
                    return C13612s.m87736e(m87433h0(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i < size2) {
                            arrayList.add(((List) iterable).get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object next : iterable) {
                if (i2 >= i) {
                    arrayList.add(next);
                } else {
                    i2++;
                }
            }
            return C13614t.m87755q(arrayList);
        }
    }

    /* renamed from: R */
    public static <T> List<T> m87417R(List<? extends T> list, int i) {
        C13706o.m87929f(list, "<this>");
        if (i >= 0) {
            return m87451z0(list, C16792h.m99540b(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: S */
    public static <T> List<T> m87418S(Iterable<? extends T> iterable, C16265l<? super T, Boolean> lVar) {
        C13706o.m87929f(iterable, "<this>");
        C13706o.m87929f(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: T */
    public static <T> List<T> m87419T(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        return (List) m87420U(iterable, new ArrayList());
    }

    /* renamed from: U */
    public static final <C extends Collection<? super T>, T> C m87420U(Iterable<? extends T> iterable, C c) {
        C13706o.m87929f(iterable, "<this>");
        C13706o.m87929f(c, "destination");
        for (Object next : iterable) {
            if (next != null) {
                c.add(next);
            }
        }
        return c;
    }

    /* renamed from: V */
    public static <T> T m87421V(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        if (iterable instanceof List) {
            return m87422W((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: W */
    public static <T> T m87422W(List<? extends T> list) {
        C13706o.m87929f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: X */
    public static <T> T m87423X(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: Y */
    public static <T> T m87424Y(List<? extends T> list) {
        C13706o.m87929f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: Z */
    public static <T> T m87425Z(List<? extends T> list, int i) {
        C13706o.m87929f(list, "<this>");
        if (i < 0 || i > C13614t.m87750l(list)) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: a0 */
    public static final <T> int m87426a0(Iterable<? extends T> iterable, T t) {
        C13706o.m87929f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (Object next : iterable) {
            if (i < 0) {
                C13614t.m87758t();
            }
            if (C13706o.m87924a(t, next)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b0 */
    public static <T> int m87427b0(List<? extends T> list, T t) {
        C13706o.m87929f(list, "<this>");
        return list.indexOf(t);
    }

    /* renamed from: c0 */
    public static <T> Set<T> m87428c0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C13706o.m87929f(iterable, "<this>");
        C13706o.m87929f(iterable2, "other");
        Set<T> J0 = m87406J0(iterable);
        C13624y.m87796E(J0, iterable2);
        return J0;
    }

    /* renamed from: d0 */
    public static final <T, A extends Appendable> A m87429d0(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C16265l<? super T, ? extends CharSequence> lVar) {
        C13706o.m87929f(iterable, "<this>");
        C13706o.m87929f(a, "buffer");
        C13706o.m87929f(charSequence, "separator");
        C13706o.m87929f(charSequence2, "prefix");
        C13706o.m87929f(charSequence3, "postfix");
        C13706o.m87929f(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
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

    /* renamed from: e0 */
    public static /* synthetic */ Appendable m87430e0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C16265l lVar, int i2, Object obj) {
        String str = (i2 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return m87429d0(iterable, appendable, str, charSequence6, charSequence5, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : lVar);
    }

    /* renamed from: f0 */
    public static final <T> String m87431f0(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C16265l<? super T, ? extends CharSequence> lVar) {
        C13706o.m87929f(iterable, "<this>");
        C13706o.m87929f(charSequence, "separator");
        C13706o.m87929f(charSequence2, "prefix");
        C13706o.m87929f(charSequence3, "postfix");
        C13706o.m87929f(charSequence4, "truncated");
        String sb = ((StringBuilder) m87429d0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C13706o.m87928e(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: g0 */
    public static /* synthetic */ String m87432g0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C16265l lVar, int i2, Object obj) {
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
        return m87431f0(iterable, charSequence, charSequence6, charSequence5, i3, charSequence7, lVar);
    }

    /* renamed from: h0 */
    public static <T> T m87433h0(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        if (iterable instanceof List) {
            return m87434i0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: i0 */
    public static <T> T m87434i0(List<? extends T> list) {
        C13706o.m87929f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(C13614t.m87750l(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: j0 */
    public static <T> T m87435j0(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* renamed from: k0 */
    public static <T> T m87436k0(List<? extends T> list) {
        C13706o.m87929f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: l0 */
    public static <T, R> List<R> m87437l0(Iterable<? extends T> iterable, C16265l<? super T, ? extends R> lVar) {
        C13706o.m87929f(iterable, "<this>");
        C13706o.m87929f(lVar, "transform");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(iterable, 10));
        for (Object invoke : iterable) {
            arrayList.add(lVar.invoke(invoke));
        }
        return arrayList;
    }

    /* renamed from: m0 */
    public static <T extends Comparable<? super T>> T m87438m0(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: n0 */
    public static <T> List<T> m87439n0(Iterable<? extends T> iterable, T t) {
        C13706o.m87929f(iterable, "<this>");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(iterable, 10));
        boolean z = false;
        for (Object next : iterable) {
            boolean z2 = true;
            if (!z && C13706o.m87924a(next, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: o0 */
    public static <T> List<T> m87440o0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C13706o.m87929f(iterable, "<this>");
        C13706o.m87929f(iterable2, "elements");
        if (iterable instanceof Collection) {
            return m87442q0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        boolean unused = C13624y.m87797z(arrayList, iterable);
        boolean unused2 = C13624y.m87797z(arrayList, iterable2);
        return arrayList;
    }

    /* renamed from: p0 */
    public static <T> List<T> m87441p0(Iterable<? extends T> iterable, T t) {
        C13706o.m87929f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m87443r0((Collection) iterable, t);
        }
        ArrayList arrayList = new ArrayList();
        boolean unused = C13624y.m87797z(arrayList, iterable);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: q0 */
    public static <T> List<T> m87442q0(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        C13706o.m87929f(collection, "<this>");
        C13706o.m87929f(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        boolean unused = C13624y.m87797z(arrayList2, iterable);
        return arrayList2;
    }

    /* renamed from: r0 */
    public static <T> List<T> m87443r0(Collection<? extends T> collection, T t) {
        C13706o.m87929f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: s0 */
    public static <T> List<T> m87444s0(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m87402F0(iterable);
        }
        List<T> H0 = m87404H0(iterable);
        C13562a0.m87388K(H0);
        return H0;
    }

    /* renamed from: t0 */
    public static <T> T m87445t0(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        if (iterable instanceof List) {
            return m87446u0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: u0 */
    public static <T> T m87446u0(List<? extends T> list) {
        C13706o.m87929f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    /* renamed from: v0 */
    public static <T> T m87447v0(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    /* renamed from: w0 */
    public static <T> T m87448w0(List<? extends T> list) {
        C13706o.m87929f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: x0 */
    public static <T extends Comparable<? super T>> List<T> m87449x0(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m87402F0(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt___CollectionsKt.sorted>");
            Comparable[] comparableArr = (Comparable[]) array;
            C13593l.m87570q(comparableArr);
            return C13593l.m87557d(comparableArr);
        }
        List<T> H0 = m87404H0(iterable);
        C13622x.m87780x(H0);
        return H0;
    }

    /* renamed from: y0 */
    public static <T> List<T> m87450y0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        C13706o.m87929f(iterable, "<this>");
        C13706o.m87929f(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m87402F0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt___CollectionsKt.sortedWith>");
            C13593l.m87571r(array, comparator);
            return C13593l.m87557d(array);
        }
        List<T> H0 = m87404H0(iterable);
        C13622x.m87781y(H0, comparator);
        return H0;
    }

    /* renamed from: z0 */
    public static <T> List<T> m87451z0(Iterable<? extends T> iterable, int i) {
        C13706o.m87929f(iterable, "<this>");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return C13614t.m87748j();
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return m87402F0(iterable);
                }
                if (i == 1) {
                    return C13612s.m87736e(m87421V(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object add : iterable) {
                arrayList.add(add);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return C13614t.m87755q(arrayList);
        }
    }
}
