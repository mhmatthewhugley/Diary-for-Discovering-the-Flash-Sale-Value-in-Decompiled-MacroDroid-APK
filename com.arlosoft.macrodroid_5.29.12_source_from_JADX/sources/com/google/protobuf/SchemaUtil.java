package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class SchemaUtil {

    /* renamed from: a */
    private static final Class<?> f57070a = m81146B();

    /* renamed from: b */
    private static final UnknownFieldSchema<?, ?> f57071b = m81147C(false);

    /* renamed from: c */
    private static final UnknownFieldSchema<?, ?> f57072c = m81147C(true);

    /* renamed from: d */
    private static final UnknownFieldSchema<?, ?> f57073d = new UnknownFieldSetLiteSchema();

    private SchemaUtil() {
    }

    /* renamed from: A */
    static <UT, UB> UB m81145A(int i, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumVerifier == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (enumVerifier.mo60055a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m81156L(i, intValue, ub, unknownFieldSchema);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!enumVerifier.mo60055a(intValue2)) {
                    ub = m81156L(i, intValue2, ub, unknownFieldSchema);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: B */
    private static Class<?> m81146B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    private static UnknownFieldSchema<?, ?> m81147C(boolean z) {
        try {
            Class<?> D = m81148D();
            if (D == null) {
                return null;
            }
            return (UnknownFieldSchema) D.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    private static Class<?> m81148D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    static <T, FT extends FieldSet.FieldDescriptorLite<FT>> void m81149E(ExtensionSchema<FT> extensionSchema, T t, T t2) {
        FieldSet<FT> c = extensionSchema.mo65102c(t2);
        if (!c.mo65135n()) {
            extensionSchema.mo65103d(t).mo65140u(c);
        }
    }

    /* renamed from: F */
    static <T> void m81150F(MapFieldSchema mapFieldSchema, T t, T t2, long j) {
        UnsafeUtil.m81376V(t, j, mapFieldSchema.mo65332a(UnsafeUtil.m81360F(t, j), UnsafeUtil.m81360F(t2, j)));
    }

    /* renamed from: G */
    static <T, UT, UB> void m81151G(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, T t2) {
        unknownFieldSchema.mo65457p(t, unknownFieldSchema.mo65452k(unknownFieldSchema.mo65448g(t), unknownFieldSchema.mo65448g(t2)));
    }

    /* renamed from: H */
    public static UnknownFieldSchema<?, ?> m81152H() {
        return f57071b;
    }

    /* renamed from: I */
    public static UnknownFieldSchema<?, ?> m81153I() {
        return f57072c;
    }

    /* renamed from: J */
    public static void m81154J(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = f57070a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: K */
    static boolean m81155K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: L */
    static <UT, UB> UB m81156L(int i, int i2, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (ub == null) {
            ub = unknownFieldSchema.mo65455n();
        }
        unknownFieldSchema.mo65446e(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: M */
    public static UnknownFieldSchema<?, ?> m81157M() {
        return f57073d;
    }

    /* renamed from: N */
    public static void m81158N(int i, List<Boolean> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo64819G(i, list, z);
        }
    }

    /* renamed from: O */
    public static void m81159O(int i, List<ByteString> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo64826P(i, list);
        }
    }

    /* renamed from: P */
    public static void m81160P(int i, List<Double> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo64825N(i, list, z);
        }
    }

    /* renamed from: Q */
    public static void m81161Q(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo64846q(i, list, z);
        }
    }

    /* renamed from: R */
    public static void m81162R(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo64842m(i, list, z);
        }
    }

    /* renamed from: S */
    public static void m81163S(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo64815E(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m81164T(int i, List<Float> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo64834b(i, list, z);
        }
    }

    /* renamed from: U */
    public static void m81165U(int i, List<?> list, Writer writer, Schema schema) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo64847r(i, list, schema);
        }
    }

    /* renamed from: V */
    public static void m81166V(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo64839h(i, list, z);
        }
    }

    /* renamed from: W */
    public static void m81167W(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo64824M(i, list, z);
        }
    }

    /* renamed from: X */
    public static void m81168X(int i, List<?> list, Writer writer, Schema schema) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo64832a(i, list, schema);
        }
    }

    /* renamed from: Y */
    public static void m81169Y(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo64817F(i, list, z);
        }
    }

    /* renamed from: Z */
    public static void m81170Z(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo64850u(i, list, z);
        }
    }

    /* renamed from: a */
    static int m81171a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m80093N0(i) + CodedOutputStream.m80129u0(size);
        }
        return size * CodedOutputStream.m80101V(i, true);
    }

    /* renamed from: a0 */
    public static void m81172a0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo64822K(i, list, z);
        }
    }

    /* renamed from: b */
    static int m81173b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m81174b0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo64844o(i, list, z);
        }
    }

    /* renamed from: c */
    static int m81175c(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int N0 = size * CodedOutputStream.m80093N0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            N0 += CodedOutputStream.m80107Z(list.get(i2));
        }
        return N0;
    }

    /* renamed from: c0 */
    public static void m81176c0(int i, List<String> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo64837e(i, list);
        }
    }

    /* renamed from: d */
    static int m81177d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = m81179e(list);
        if (z) {
            return CodedOutputStream.m80093N0(i) + CodedOutputStream.m80129u0(e);
        }
        return e + (size * CodedOutputStream.m80093N0(i));
    }

    /* renamed from: d0 */
    public static void m81178d0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo64843n(i, list, z);
        }
    }

    /* renamed from: e */
    static int m81179e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m80112d0(intArrayList.mo65221m(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m80112d0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e0 */
    public static void m81180e0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo64851v(i, list, z);
        }
    }

    /* renamed from: f */
    static int m81181f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m80093N0(i) + CodedOutputStream.m80129u0(size * 4);
        }
        return size * CodedOutputStream.m80113e0(i, 0);
    }

    /* renamed from: g */
    static int m81182g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    static int m81183h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m80093N0(i) + CodedOutputStream.m80129u0(size * 8);
        }
        return size * CodedOutputStream.m80115g0(i, 0);
    }

    /* renamed from: i */
    static int m81184i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    static int m81185j(int i, List<MessageLite> list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m80119k0(i, list.get(i3), schema);
        }
        return i2;
    }

    /* renamed from: k */
    static int m81186k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = m81187l(list);
        if (z) {
            return CodedOutputStream.m80093N0(i) + CodedOutputStream.m80129u0(l);
        }
        return l + (size * CodedOutputStream.m80093N0(i));
    }

    /* renamed from: l */
    static int m81187l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m80123o0(intArrayList.mo65221m(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m80123o0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    static int m81188m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int n = m81189n(list);
        if (z) {
            return CodedOutputStream.m80093N0(i) + CodedOutputStream.m80129u0(n);
        }
        return n + (list.size() * CodedOutputStream.m80093N0(i));
    }

    /* renamed from: n */
    static int m81189n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m80125q0(longArrayList.mo65311m(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m80125q0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    static int m81190o(int i, Object obj, Schema schema) {
        if (obj instanceof LazyFieldLite) {
            return CodedOutputStream.m80127s0(i, (LazyFieldLite) obj);
        }
        return CodedOutputStream.m80132x0(i, (MessageLite) obj, schema);
    }

    /* renamed from: p */
    static int m81191p(int i, List<?> list, Schema schema) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int N0 = CodedOutputStream.m80093N0(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof LazyFieldLite) {
                i2 = CodedOutputStream.m80128t0((LazyFieldLite) obj);
            } else {
                i2 = CodedOutputStream.m80134z0((MessageLite) obj, schema);
            }
            N0 += i2;
        }
        return N0;
    }

    /* renamed from: q */
    static int m81192q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = m81193r(list);
        if (z) {
            return CodedOutputStream.m80093N0(i) + CodedOutputStream.m80129u0(r);
        }
        return r + (size * CodedOutputStream.m80093N0(i));
    }

    /* renamed from: r */
    static int m81193r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m80088I0(intArrayList.mo65221m(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m80088I0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    static int m81194s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = m81195t(list);
        if (z) {
            return CodedOutputStream.m80093N0(i) + CodedOutputStream.m80129u0(t);
        }
        return t + (size * CodedOutputStream.m80093N0(i));
    }

    /* renamed from: t */
    static int m81195t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m80090K0(longArrayList.mo65311m(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m80090K0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    static int m81196u(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int N0 = CodedOutputStream.m80093N0(i) * size;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i4 < size) {
                Object d2 = lazyStringList.mo65273d2(i4);
                if (d2 instanceof ByteString) {
                    i3 = CodedOutputStream.m80107Z((ByteString) d2);
                } else {
                    i3 = CodedOutputStream.m80092M0((String) d2);
                }
                N0 += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof ByteString) {
                    i2 = CodedOutputStream.m80107Z((ByteString) obj);
                } else {
                    i2 = CodedOutputStream.m80092M0((String) obj);
                }
                N0 += i2;
                i4++;
            }
        }
        return N0;
    }

    /* renamed from: v */
    static int m81197v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = m81198w(list);
        if (z) {
            return CodedOutputStream.m80093N0(i) + CodedOutputStream.m80129u0(w);
        }
        return w + (size * CodedOutputStream.m80093N0(i));
    }

    /* renamed from: w */
    static int m81198w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m80095P0(intArrayList.mo65221m(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m80095P0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    static int m81199x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = m81200y(list);
        if (z) {
            return CodedOutputStream.m80093N0(i) + CodedOutputStream.m80129u0(y);
        }
        return y + (size * CodedOutputStream.m80093N0(i));
    }

    /* renamed from: y */
    static int m81200y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m80097R0(longArrayList.mo65311m(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m80097R0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    static <UT, UB> UB m81201z(int i, List<Integer> list, Internal.EnumLiteMap<?> enumLiteMap, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumLiteMap == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (enumLiteMap.mo60053a(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m81156L(i, intValue, ub, unknownFieldSchema);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (enumLiteMap.mo60053a(intValue2) == null) {
                    ub = m81156L(i, intValue2, ub, unknownFieldSchema);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
