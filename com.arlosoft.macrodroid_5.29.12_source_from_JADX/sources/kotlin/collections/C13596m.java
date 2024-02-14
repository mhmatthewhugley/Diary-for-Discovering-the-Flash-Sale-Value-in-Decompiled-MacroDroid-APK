package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13681c;
import kotlin.jvm.internal.C13683d;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.sequences.C15118h;
import p297ja.C13328m;
import p297ja.C13337s;
import p370qa.C16254a;
import p370qa.C16265l;
import p379ra.C16368a;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000ä\u0001\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a*\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\b\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0002\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0002\u001a\u00020\nH\u0002\u001a\u001f\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000e\u0010\r\u001a)\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u0007*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0014\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0012\u0010\u0016\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007\u001a\u0012\u0010\u0017\u001a\u00020\u0007*\u00020\t2\u0006\u0010\u0002\u001a\u00020\n\u001a\u001f\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0018\u0010\r\u001a\u0012\u0010\u0019\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007\u001a\u001f\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001a\u0010\r\u001a\n\u0010\u001b\u001a\u00020\n*\u00020\t\u001a!\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001c\u0010\r\u001a-\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 \u001a+\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\b\b\u0000\u0010\u0000*\u00020!*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b\"\u0010#\u001a?\u0010&\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u000e*\n\u0012\u0006\b\u0000\u0012\u00028\u00010$\"\b\b\u0001\u0010\u0000*\u00020!*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010%\u001a\u00028\u0000¢\u0006\u0004\b&\u0010'\u001a-\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b(\u0010 \u001aC\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010+\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000)j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`*¢\u0006\u0004\b,\u0010-\u001aA\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010+\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000)j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`*¢\u0006\u0004\b.\u0010/\u001a9\u00100\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u000e*\n\u0012\u0006\b\u0000\u0012\u00028\u00000$*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010%\u001a\u00028\u0001¢\u0006\u0004\b0\u0010'\u001a+\u00101\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u000e*\n\u0012\u0006\b\u0000\u0012\u00020\u00070$*\u00020\u00062\u0006\u0010%\u001a\u00028\u0000¢\u0006\u0004\b1\u00102\u001a%\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b3\u0010#\u001a\u0010\u00106\u001a\b\u0012\u0004\u0012\u0002050\u001e*\u000204\u001a\u0010\u00109\u001a\b\u0012\u0004\u0012\u0002080\u001e*\u000207\u001a\u0010\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e*\u00020\u0006\u001a\u0010\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u001e*\u00020;\u001a\u0010\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u001e*\u00020>\u001a\u0010\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u001e*\u00020A\u001a\u0010\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e*\u00020D\u001a\u0010\u0010F\u001a\b\u0012\u0004\u0012\u00020\n0\u001e*\u00020\t\u001a%\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000G\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bH\u0010#\u001a\u0010\u0010I\u001a\b\u0012\u0004\u0012\u0002050G*\u000204\u001a\u0010\u0010J\u001a\b\u0012\u0004\u0012\u0002080G*\u000207\u001a\u0010\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070G*\u00020\u0006\u001a\u0010\u0010L\u001a\b\u0012\u0004\u0012\u00020<0G*\u00020;\u001a\u0010\u0010M\u001a\b\u0012\u0004\u0012\u00020?0G*\u00020>\u001a\u0010\u0010N\u001a\b\u0012\u0004\u0012\u00020B0G*\u00020A\u001a\u0010\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030G*\u00020D\u001a\u0010\u0010P\u001a\b\u0012\u0004\u0012\u00020\n0G*\u00020\t\u001a%\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000Q\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bR\u0010S\u001aE\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010T*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010UH\bø\u0001\u0000¢\u0006\u0004\bT\u0010W\u001a+\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000Y0X\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bZ\u0010[\u001a\u0016\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030Y0X*\u00020D\u001a\u0010\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e*\u00020\u0006\u001a\u0010\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00070^*\u00020\u0006\u001a\u0015\u0010`\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0007¢\u0006\u0004\b`\u0010a\u001a\u0015\u0010\u0000\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0007¢\u0006\u0004\b\u0000\u0010a\u001aJ\u0010d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010c0\u001e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010T*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u000e\u0010b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0001H\u0004¢\u0006\u0004\bd\u0010e\u001a\u0010o\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010&*\u00060fj\u0002`g*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010h\u001a\u00028\u00012\b\b\u0002\u0010j\u001a\u00020i2\b\b\u0002\u0010k\u001a\u00020i2\b\b\u0002\u0010l\u001a\u00020i2\b\b\u0002\u0010m\u001a\u00020\u00072\b\b\u0002\u0010n\u001a\u00020i2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020i\u0018\u00010U¢\u0006\u0004\bo\u0010p\u001ai\u0010r\u001a\u00020q\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\b\b\u0002\u0010j\u001a\u00020i2\b\b\u0002\u0010k\u001a\u00020i2\b\b\u0002\u0010l\u001a\u00020i2\b\b\u0002\u0010m\u001a\u00020\u00072\b\b\u0002\u0010n\u001a\u00020i2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020i\u0018\u00010U¢\u0006\u0004\br\u0010s\u001a%\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00000X\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bt\u0010[\u001a%\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000u\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bv\u0010w\"#\u0010{\u001a\u00020x\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\by\u0010z\"#\u0010~\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\b|\u0010}\"\u0016\u0010~\u001a\u00020\u0007*\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u0010\u0001\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0001"}, mo71668d2 = {"T", "", "element", "", "w", "([Ljava/lang/Object;Ljava/lang/Object;)Z", "", "", "v", "", "", "u", "B", "([Ljava/lang/Object;)Ljava/lang/Object;", "C", "index", "H", "([Ljava/lang/Object;I)Ljava/lang/Object;", "G", "([II)Ljava/lang/Integer;", "K", "([Ljava/lang/Object;Ljava/lang/Object;)I", "J", "I", "P", "Q", "V", "U", "W", "n", "", "y", "([Ljava/lang/Object;I)Ljava/util/List;", "", "z", "([Ljava/lang/Object;)Ljava/util/List;", "", "destination", "A", "([Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;", "Z", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "X", "([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;", "Y", "([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;", "b0", "a0", "([ILjava/util/Collection;)Ljava/util/Collection;", "i0", "", "", "c0", "", "", "j0", "g0", "", "", "h0", "", "", "f0", "", "", "e0", "", "k0", "d0", "", "r0", "l0", "s0", "p0", "q0", "o0", "n0", "t0", "m0", "", "v0", "([Ljava/lang/Object;)Ljava/util/Set;", "R", "Lkotlin/Function1;", "transform", "([Ljava/lang/Object;Lqa/l;)Ljava/util/List;", "", "Lkotlin/collections/k0;", "w0", "([Ljava/lang/Object;)Ljava/lang/Iterable;", "x0", "x", "", "u0", "S", "([I)Ljava/lang/Integer;", "other", "Lja/m;", "y0", "([Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "L", "([Ljava/lang/Object;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lqa/l;)Ljava/lang/Appendable;", "", "N", "([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lqa/l;)Ljava/lang/String;", "s", "Lkotlin/sequences/h;", "t", "([Ljava/lang/Object;)Lkotlin/sequences/h;", "Lwa/e;", "D", "([Ljava/lang/Object;)Lwa/e;", "indices", "F", "([Ljava/lang/Object;)I", "lastIndex", "E", "([I)I", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/collections/ArraysKt")
/* renamed from: kotlin.collections.m */
/* compiled from: _Arrays.kt */
class C13596m extends C13593l {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004"}, mo71668d2 = {"kotlin/collections/m$a", "", "", "iterator", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.collections.m$a */
    /* compiled from: Iterables.kt */
    public static final class C13597a implements Iterable<T>, C16368a {

        /* renamed from: a */
        final /* synthetic */ Object[] f61885a;

        public C13597a(Object[] objArr) {
            this.f61885a = objArr;
        }

        public Iterator<T> iterator() {
            return C13681c.m87864a(this.f61885a);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004"}, mo71668d2 = {"kotlin/collections/m$b", "Lkotlin/sequences/h;", "", "iterator", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.collections.m$b */
    /* compiled from: Sequences.kt */
    public static final class C13598b implements C15118h<T> {

        /* renamed from: a */
        final /* synthetic */ Object[] f61886a;

        public C13598b(Object[] objArr) {
            this.f61886a = objArr;
        }

        public Iterator<T> iterator() {
            return C13681c.m87864a(this.f61886a);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"T", "", "a", "()Ljava/util/Iterator;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.collections.m$c */
    /* compiled from: _Arrays.kt */
    static final class C13599c extends C13708q implements C16254a<Iterator<? extends T>> {
        final /* synthetic */ T[] $this_withIndex;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13599c(T[] tArr) {
            super(0);
            this.$this_withIndex = tArr;
        }

        /* renamed from: a */
        public final Iterator<T> invoke() {
            return C13681c.m87864a(this.$this_withIndex);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"", "", "a", "()Ljava/util/Iterator;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.collections.m$d */
    /* compiled from: _Arrays.kt */
    static final class C13600d extends C13708q implements C16254a<Iterator<? extends Boolean>> {
        final /* synthetic */ boolean[] $this_withIndex;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13600d(boolean[] zArr) {
            super(0);
            this.$this_withIndex = zArr;
        }

        /* renamed from: a */
        public final Iterator<Boolean> invoke() {
            return C13683d.m87865a(this.$this_withIndex);
        }
    }

    /* renamed from: A */
    public static final <C extends Collection<? super T>, T> C m87576A(T[] tArr, C c) {
        C13706o.m87929f(tArr, "<this>");
        C13706o.m87929f(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    /* renamed from: B */
    public static <T> T m87577B(T[] tArr) {
        C13706o.m87929f(tArr, "<this>");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: C */
    public static <T> T m87578C(T[] tArr) {
        C13706o.m87929f(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: D */
    public static <T> C16788e m87579D(T[] tArr) {
        C13706o.m87929f(tArr, "<this>");
        return new C16788e(0, m87581F(tArr));
    }

    /* renamed from: E */
    public static final int m87580E(int[] iArr) {
        C13706o.m87929f(iArr, "<this>");
        return iArr.length - 1;
    }

    /* renamed from: F */
    public static <T> int m87581F(T[] tArr) {
        C13706o.m87929f(tArr, "<this>");
        return tArr.length - 1;
    }

    /* renamed from: G */
    public static Integer m87582G(int[] iArr, int i) {
        C13706o.m87929f(iArr, "<this>");
        if (i < 0 || i > m87580E(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    /* renamed from: H */
    public static <T> T m87583H(T[] tArr, int i) {
        C13706o.m87929f(tArr, "<this>");
        if (i < 0 || i > m87581F(tArr)) {
            return null;
        }
        return tArr[i];
    }

    /* renamed from: I */
    public static final int m87584I(char[] cArr, char c) {
        C13706o.m87929f(cArr, "<this>");
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: J */
    public static final int m87585J(int[] iArr, int i) {
        C13706o.m87929f(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: K */
    public static <T> int m87586K(T[] tArr, T t) {
        C13706o.m87929f(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (C13706o.m87924a(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: L */
    public static final <T, A extends Appendable> A m87587L(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C16265l<? super T, ? extends CharSequence> lVar) {
        C13706o.m87929f(tArr, "<this>");
        C13706o.m87929f(a, "buffer");
        C13706o.m87929f(charSequence, "separator");
        C13706o.m87929f(charSequence2, "prefix");
        C13706o.m87929f(charSequence3, "postfix");
        C13706o.m87929f(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C15166n.m93609a(a, t, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: M */
    public static /* synthetic */ Appendable m87588M(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C16265l lVar, int i2, Object obj) {
        String str = (i2 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return m87587L(objArr, appendable, str, charSequence6, charSequence5, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : lVar);
    }

    /* renamed from: N */
    public static final <T> String m87589N(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C16265l<? super T, ? extends CharSequence> lVar) {
        C13706o.m87929f(tArr, "<this>");
        C13706o.m87929f(charSequence, "separator");
        C13706o.m87929f(charSequence2, "prefix");
        C13706o.m87929f(charSequence3, "postfix");
        C13706o.m87929f(charSequence4, "truncated");
        String sb = ((StringBuilder) m87587L(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C13706o.m87928e(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: O */
    public static /* synthetic */ String m87590O(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C16265l lVar, int i2, Object obj) {
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
        return m87589N(objArr, charSequence, charSequence6, charSequence5, i3, charSequence7, lVar);
    }

    /* renamed from: P */
    public static <T> T m87591P(T[] tArr) {
        C13706o.m87929f(tArr, "<this>");
        if (!(tArr.length == 0)) {
            return tArr[m87581F(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: Q */
    public static final int m87592Q(int[] iArr, int i) {
        C13706o.m87929f(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (i == iArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    /* renamed from: R */
    public static <T, R> List<R> m87593R(T[] tArr, C16265l<? super T, ? extends R> lVar) {
        C13706o.m87929f(tArr, "<this>");
        C13706o.m87929f(lVar, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T invoke : tArr) {
            arrayList.add(lVar.invoke(invoke));
        }
        return arrayList;
    }

    /* renamed from: S */
    public static Integer m87594S(int[] iArr) {
        C13706o.m87929f(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        C13603n0 i2 = new C16788e(1, m87580E(iArr)).iterator();
        while (i2.hasNext()) {
            int i3 = iArr[i2.nextInt()];
            if (i < i3) {
                i = i3;
            }
        }
        return Integer.valueOf(i);
    }

    /* renamed from: T */
    public static Integer m87595T(int[] iArr) {
        C13706o.m87929f(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        C13603n0 i2 = new C16788e(1, m87580E(iArr)).iterator();
        while (i2.hasNext()) {
            int i3 = iArr[i2.nextInt()];
            if (i > i3) {
                i = i3;
            }
        }
        return Integer.valueOf(i);
    }

    /* renamed from: U */
    public static char m87596U(char[] cArr) {
        C13706o.m87929f(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: V */
    public static <T> T m87597V(T[] tArr) {
        C13706o.m87929f(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return tArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: W */
    public static <T> T m87598W(T[] tArr) {
        C13706o.m87929f(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: X */
    public static final <T> T[] m87599X(T[] tArr, Comparator<? super T> comparator) {
        C13706o.m87929f(tArr, "<this>");
        C13706o.m87929f(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        C13706o.m87928e(copyOf, "copyOf(this, size)");
        C13593l.m87571r(copyOf, comparator);
        return copyOf;
    }

    /* renamed from: Y */
    public static <T> List<T> m87600Y(T[] tArr, Comparator<? super T> comparator) {
        C13706o.m87929f(tArr, "<this>");
        C13706o.m87929f(comparator, "comparator");
        return C13593l.m87557d(m87599X(tArr, comparator));
    }

    /* renamed from: Z */
    public static final <T> List<T> m87601Z(T[] tArr, int i) {
        C13706o.m87929f(tArr, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return C13614t.m87748j();
        } else {
            int length = tArr.length;
            if (i >= length) {
                return m87610i0(tArr);
            }
            if (i == 1) {
                return C13612s.m87736e(tArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = length - i; i2 < length; i2++) {
                arrayList.add(tArr[i2]);
            }
            return arrayList;
        }
    }

    /* renamed from: a0 */
    public static final <C extends Collection<? super Integer>> C m87602a0(int[] iArr, C c) {
        C13706o.m87929f(iArr, "<this>");
        C13706o.m87929f(c, "destination");
        for (int valueOf : iArr) {
            c.add(Integer.valueOf(valueOf));
        }
        return c;
    }

    /* renamed from: b0 */
    public static <T, C extends Collection<? super T>> C m87603b0(T[] tArr, C c) {
        C13706o.m87929f(tArr, "<this>");
        C13706o.m87929f(c, "destination");
        for (T add : tArr) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: c0 */
    public static List<Byte> m87604c0(byte[] bArr) {
        C13706o.m87929f(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return C13614t.m87748j();
        }
        if (length != 1) {
            return m87613l0(bArr);
        }
        return C13612s.m87736e(Byte.valueOf(bArr[0]));
    }

    /* renamed from: d0 */
    public static List<Character> m87605d0(char[] cArr) {
        C13706o.m87929f(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            return C13614t.m87748j();
        }
        if (length != 1) {
            return m87614m0(cArr);
        }
        return C13612s.m87736e(Character.valueOf(cArr[0]));
    }

    /* renamed from: e0 */
    public static List<Double> m87606e0(double[] dArr) {
        C13706o.m87929f(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return C13614t.m87748j();
        }
        if (length != 1) {
            return m87615n0(dArr);
        }
        return C13612s.m87736e(Double.valueOf(dArr[0]));
    }

    /* renamed from: f0 */
    public static List<Float> m87607f0(float[] fArr) {
        C13706o.m87929f(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return C13614t.m87748j();
        }
        if (length != 1) {
            return m87616o0(fArr);
        }
        return C13612s.m87736e(Float.valueOf(fArr[0]));
    }

    /* renamed from: g0 */
    public static List<Integer> m87608g0(int[] iArr) {
        C13706o.m87929f(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return C13614t.m87748j();
        }
        if (length != 1) {
            return m87617p0(iArr);
        }
        return C13612s.m87736e(Integer.valueOf(iArr[0]));
    }

    /* renamed from: h0 */
    public static List<Long> m87609h0(long[] jArr) {
        C13706o.m87929f(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return C13614t.m87748j();
        }
        if (length != 1) {
            return m87618q0(jArr);
        }
        return C13612s.m87736e(Long.valueOf(jArr[0]));
    }

    /* renamed from: i0 */
    public static <T> List<T> m87610i0(T[] tArr) {
        C13706o.m87929f(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return C13614t.m87748j();
        }
        if (length != 1) {
            return m87619r0(tArr);
        }
        return C13612s.m87736e(tArr[0]);
    }

    /* renamed from: j0 */
    public static List<Short> m87611j0(short[] sArr) {
        C13706o.m87929f(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return C13614t.m87748j();
        }
        if (length != 1) {
            return m87621s0(sArr);
        }
        return C13612s.m87736e(Short.valueOf(sArr[0]));
    }

    /* renamed from: k0 */
    public static List<Boolean> m87612k0(boolean[] zArr) {
        C13706o.m87929f(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return C13614t.m87748j();
        }
        if (length != 1) {
            return m87623t0(zArr);
        }
        return C13612s.m87736e(Boolean.valueOf(zArr[0]));
    }

    /* renamed from: l0 */
    public static final List<Byte> m87613l0(byte[] bArr) {
        C13706o.m87929f(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte valueOf : bArr) {
            arrayList.add(Byte.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: m0 */
    public static final List<Character> m87614m0(char[] cArr) {
        C13706o.m87929f(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char valueOf : cArr) {
            arrayList.add(Character.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: n0 */
    public static final List<Double> m87615n0(double[] dArr) {
        C13706o.m87929f(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double valueOf : dArr) {
            arrayList.add(Double.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: o0 */
    public static final List<Float> m87616o0(float[] fArr) {
        C13706o.m87929f(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: p0 */
    public static final List<Integer> m87617p0(int[] iArr) {
        C13706o.m87929f(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: q0 */
    public static final List<Long> m87618q0(long[] jArr) {
        C13706o.m87929f(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: r0 */
    public static <T> List<T> m87619r0(T[] tArr) {
        C13706o.m87929f(tArr, "<this>");
        return new ArrayList(C13614t.m87745g(tArr));
    }

    /* renamed from: s */
    public static <T> Iterable<T> m87620s(T[] tArr) {
        C13706o.m87929f(tArr, "<this>");
        if (tArr.length == 0) {
            return C13614t.m87748j();
        }
        return new C13597a(tArr);
    }

    /* renamed from: s0 */
    public static final List<Short> m87621s0(short[] sArr) {
        C13706o.m87929f(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short valueOf : sArr) {
            arrayList.add(Short.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: t */
    public static <T> C15118h<T> m87622t(T[] tArr) {
        C13706o.m87929f(tArr, "<this>");
        if (tArr.length == 0) {
            return C15125n.m93470e();
        }
        return new C13598b(tArr);
    }

    /* renamed from: t0 */
    public static final List<Boolean> m87623t0(boolean[] zArr) {
        C13706o.m87929f(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean valueOf : zArr) {
            arrayList.add(Boolean.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: u */
    public static boolean m87624u(char[] cArr, char c) {
        C13706o.m87929f(cArr, "<this>");
        return m87584I(cArr, c) >= 0;
    }

    /* renamed from: u0 */
    public static final Set<Integer> m87625u0(int[] iArr) {
        C13706o.m87929f(iArr, "<this>");
        return (Set) m87602a0(iArr, new LinkedHashSet(C13613s0.m87740e(iArr.length)));
    }

    /* renamed from: v */
    public static final boolean m87626v(int[] iArr, int i) {
        C13706o.m87929f(iArr, "<this>");
        return m87585J(iArr, i) >= 0;
    }

    /* renamed from: v0 */
    public static <T> Set<T> m87627v0(T[] tArr) {
        C13706o.m87929f(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return C13627z0.m87806d();
        }
        if (length != 1) {
            return (Set) m87603b0(tArr, new LinkedHashSet(C13613s0.m87740e(tArr.length)));
        }
        return C13625y0.m87800c(tArr[0]);
    }

    /* renamed from: w */
    public static <T> boolean m87628w(T[] tArr, T t) {
        C13706o.m87929f(tArr, "<this>");
        return m87586K(tArr, t) >= 0;
    }

    /* renamed from: w0 */
    public static <T> Iterable<C13592k0<T>> m87629w0(T[] tArr) {
        C13706o.m87929f(tArr, "<this>");
        return new C13595l0(new C13599c(tArr));
    }

    /* renamed from: x */
    public static List<Integer> m87630x(int[] iArr) {
        C13706o.m87929f(iArr, "<this>");
        return C13566b0.m87402F0(m87625u0(iArr));
    }

    /* renamed from: x0 */
    public static Iterable<C13592k0<Boolean>> m87631x0(boolean[] zArr) {
        C13706o.m87929f(zArr, "<this>");
        return new C13595l0(new C13600d(zArr));
    }

    /* renamed from: y */
    public static <T> List<T> m87632y(T[] tArr, int i) {
        C13706o.m87929f(tArr, "<this>");
        if (i >= 0) {
            return m87601Z(tArr, C16792h.m99540b(tArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: y0 */
    public static <T, R> List<C13328m<T, R>> m87633y0(T[] tArr, R[] rArr) {
        C13706o.m87929f(tArr, "<this>");
        C13706o.m87929f(rArr, "other");
        int min = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(C13337s.m85692a(tArr[i], rArr[i]));
        }
        return arrayList;
    }

    /* renamed from: z */
    public static <T> List<T> m87634z(T[] tArr) {
        C13706o.m87929f(tArr, "<this>");
        return (List) m87576A(tArr, new ArrayList());
    }
}
