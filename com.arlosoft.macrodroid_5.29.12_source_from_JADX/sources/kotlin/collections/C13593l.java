package kotlin.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002*\u00020\u0005\u001aS\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r\u001a2\u0010\u000f\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007\u001a5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0014\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a9\u0010\u0018\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0016\u001a\u00028\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u001a\u001a\u00020\u0017*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u001a4\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a6\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0015\u0010!\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0002\u001a\u001f\u0010\"\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\"\u0010#\u001a;\u0010'\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010&\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000$j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`%¢\u0006\u0004\b'\u0010(¨\u0006)"}, mo71668d2 = {"T", "", "", "d", "([Ljava/lang/Object;)Ljava/util/List;", "", "", "c", "destination", "destinationOffset", "startIndex", "endIndex", "f", "([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;", "", "e", "fromIndex", "toIndex", "j", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "i", "([BII)[B", "element", "Lja/u;", "l", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "k", "", "elements", "o", "([Ljava/lang/Object;Ljava/util/Collection;)[Ljava/lang/Object;", "p", "([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;", "n", "q", "([Ljava/lang/Object;)V", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "r", "([Ljava/lang/Object;Ljava/util/Comparator;)V", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/collections/ArraysKt")
/* renamed from: kotlin.collections.l */
/* compiled from: _ArraysJvm.kt */
class C13593l extends C13591k {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, mo71668d2 = {"kotlin/collections/l$a", "Lkotlin/collections/c;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "element", "c", "index", "d", "(I)Ljava/lang/Integer;", "f", "h", "getSize", "()I", "size", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.collections.l$a */
    /* compiled from: _ArraysJvm.kt */
    public static final class C13594a extends C13570c<Integer> implements RandomAccess {

        /* renamed from: a */
        final /* synthetic */ int[] f61883a;

        C13594a(int[] iArr) {
            this.f61883a = iArr;
        }

        /* renamed from: c */
        public boolean mo71849c(int i) {
            return C13596m.m87626v(this.f61883a, i);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return mo71849c(((Number) obj).intValue());
        }

        /* renamed from: d */
        public Integer get(int i) {
            return Integer.valueOf(this.f61883a[i]);
        }

        /* renamed from: f */
        public int mo71851f(int i) {
            return C13596m.m87585J(this.f61883a, i);
        }

        public int getSize() {
            return this.f61883a.length;
        }

        /* renamed from: h */
        public int mo71852h(int i) {
            return C13596m.m87592Q(this.f61883a, i);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return mo71851f(((Number) obj).intValue());
        }

        public boolean isEmpty() {
            return this.f61883a.length == 0;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return mo71852h(((Number) obj).intValue());
        }
    }

    /* renamed from: c */
    public static List<Integer> m87556c(int[] iArr) {
        C13706o.m87929f(iArr, "<this>");
        return new C13594a(iArr);
    }

    /* renamed from: d */
    public static <T> List<T> m87557d(T[] tArr) {
        C13706o.m87929f(tArr, "<this>");
        List<T> a = C13602n.m87638a(tArr);
        C13706o.m87928e(a, "asList(this)");
        return a;
    }

    /* renamed from: e */
    public static byte[] m87558e(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        C13706o.m87929f(bArr, "<this>");
        C13706o.m87929f(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    /* renamed from: f */
    public static <T> T[] m87559f(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        C13706o.m87929f(tArr, "<this>");
        C13706o.m87929f(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    /* renamed from: g */
    public static /* synthetic */ byte[] m87560g(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return m87558e(bArr, bArr2, i, i2, i3);
    }

    /* renamed from: h */
    public static /* synthetic */ Object[] m87561h(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return m87559f(objArr, objArr2, i, i2, i3);
    }

    /* renamed from: i */
    public static byte[] m87562i(byte[] bArr, int i, int i2) {
        C13706o.m87929f(bArr, "<this>");
        C13589j.m87551b(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C13706o.m87928e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: j */
    public static <T> T[] m87563j(T[] tArr, int i, int i2) {
        C13706o.m87929f(tArr, "<this>");
        C13589j.m87551b(i2, tArr.length);
        T[] copyOfRange = Arrays.copyOfRange(tArr, i, i2);
        C13706o.m87928e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: k */
    public static void m87564k(int[] iArr, int i, int i2, int i3) {
        C13706o.m87929f(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    /* renamed from: l */
    public static <T> void m87565l(T[] tArr, T t, int i, int i2) {
        C13706o.m87929f(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    /* renamed from: m */
    public static /* synthetic */ void m87566m(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m87565l(objArr, obj, i, i2);
    }

    /* renamed from: n */
    public static int[] m87567n(int[] iArr, int[] iArr2) {
        C13706o.m87929f(iArr, "<this>");
        C13706o.m87929f(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        C13706o.m87928e(copyOf, "result");
        return copyOf;
    }

    /* renamed from: o */
    public static <T> T[] m87568o(T[] tArr, Collection<? extends T> collection) {
        C13706o.m87929f(tArr, "<this>");
        C13706o.m87929f(collection, "elements");
        int length = tArr.length;
        T[] copyOf = Arrays.copyOf(tArr, collection.size() + length);
        for (T t : collection) {
            copyOf[length] = t;
            length++;
        }
        C13706o.m87928e(copyOf, "result");
        return copyOf;
    }

    /* renamed from: p */
    public static <T> T[] m87569p(T[] tArr, T[] tArr2) {
        C13706o.m87929f(tArr, "<this>");
        C13706o.m87929f(tArr2, "elements");
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] copyOf = Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, copyOf, length, length2);
        C13706o.m87928e(copyOf, "result");
        return copyOf;
    }

    /* renamed from: q */
    public static final <T> void m87570q(T[] tArr) {
        C13706o.m87929f(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    /* renamed from: r */
    public static final <T> void m87571r(T[] tArr, Comparator<? super T> comparator) {
        C13706o.m87929f(tArr, "<this>");
        C13706o.m87929f(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
