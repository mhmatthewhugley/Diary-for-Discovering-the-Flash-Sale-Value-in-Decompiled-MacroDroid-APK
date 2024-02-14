package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

final class CodedOutputStreamWriter implements Writer {

    /* renamed from: a */
    private final CodedOutputStream f56713a;

    /* renamed from: com.google.protobuf.CodedOutputStreamWriter$1 */
    static /* synthetic */ class C115671 {

        /* renamed from: a */
        static final /* synthetic */ int[] f56714a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56714a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f56714a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f56714a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f56714a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f56714a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f56714a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f56714a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f56714a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f56714a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f56714a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f56714a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f56714a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedOutputStreamWriter.C115671.<clinit>():void");
        }
    }

    private CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.m80733b(codedOutputStream, "output");
        this.f56713a = codedOutputStream2;
        codedOutputStream2.f56691a = this;
    }

    /* renamed from: Q */
    public static CodedOutputStreamWriter m80349Q(CodedOutputStream codedOutputStream) {
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.f56691a;
        if (codedOutputStreamWriter != null) {
            return codedOutputStreamWriter;
        }
        return new CodedOutputStreamWriter(codedOutputStream);
    }

    /* renamed from: R */
    private <V> void m80350R(int i, boolean z, V v, MapEntryLite.Metadata<Boolean, V> metadata) throws IOException {
        this.f56713a.mo65014B1(i, 2);
        this.f56713a.mo65016C1(MapEntryLite.m80857b(metadata, Boolean.valueOf(z), v));
        MapEntryLite.m80859e(this.f56713a, metadata, Boolean.valueOf(z), v);
    }

    /* renamed from: S */
    private <V> void m80351S(int i, MapEntryLite.Metadata<Integer, V> metadata, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer intValue : map.keySet()) {
            iArr[i2] = intValue.intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.f56713a.mo65014B1(i, 2);
            this.f56713a.mo65016C1(MapEntryLite.m80857b(metadata, Integer.valueOf(i4), v));
            MapEntryLite.m80859e(this.f56713a, metadata, Integer.valueOf(i4), v);
        }
    }

    /* renamed from: T */
    private <V> void m80352T(int i, MapEntryLite.Metadata<Long, V> metadata, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        int i2 = 0;
        for (Long longValue : map.keySet()) {
            jArr[i2] = longValue.longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.f56713a.mo65014B1(i, 2);
            this.f56713a.mo65016C1(MapEntryLite.m80857b(metadata, Long.valueOf(j), v));
            MapEntryLite.m80859e(this.f56713a, metadata, Long.valueOf(j), v);
        }
    }

    /* renamed from: U */
    private <K, V> void m80353U(int i, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
        switch (C115671.f56714a[metadata.f56999a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    m80350R(i, false, v, metadata);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    m80350R(i, true, v2, metadata);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m80351S(i, metadata, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m80352T(i, metadata, map);
                return;
            case 12:
                m80354V(i, metadata, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + metadata.f56999a);
        }
    }

    /* renamed from: V */
    private <V> void m80354V(int i, MapEntryLite.Metadata<String, V> metadata, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        int i2 = 0;
        for (String str : map.keySet()) {
            strArr[i2] = str;
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = strArr[i3];
            V v = map.get(str2);
            this.f56713a.mo65014B1(i, 2);
            this.f56713a.mo65016C1(MapEntryLite.m80857b(metadata, str2, v));
            MapEntryLite.m80859e(this.f56713a, metadata, str2, v);
        }
    }

    /* renamed from: W */
    private void m80355W(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f56713a.mo65031f(i, (String) obj);
        } else {
            this.f56713a.mo65037j(i, (ByteString) obj);
        }
    }

    /* renamed from: A */
    public void mo64813A(int i, long j) throws IOException {
        this.f56713a.mo65011A(i, j);
    }

    /* renamed from: B */
    public void mo64855B(int i, boolean z) throws IOException {
        this.f56713a.mo65013B(i, z);
    }

    /* renamed from: C */
    public void mo64814C(int i, int i2) throws IOException {
        this.f56713a.mo65015C(i, i2);
    }

    /* renamed from: D */
    public void mo64856D(int i) throws IOException {
        this.f56713a.mo65014B1(i, 3);
    }

    /* renamed from: E */
    public void mo64815E(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f56713a.mo65014B1(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m80116h0(list.get(i4).longValue());
            }
            this.f56713a.mo65016C1(i3);
            while (i2 < list.size()) {
                this.f56713a.mo65038j1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f56713a.mo65057x(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: F */
    public void mo64817F(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f56713a.mo65014B1(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m80084E0(list.get(i4).intValue());
            }
            this.f56713a.mo65016C1(i3);
            while (i2 < list.size()) {
                this.f56713a.mo65056w1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f56713a.mo65015C(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: G */
    public void mo64819G(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f56713a.mo65014B1(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m80102W(list.get(i4).booleanValue());
            }
            this.f56713a.mo65016C1(i3);
            while (i2 < list.size()) {
                this.f56713a.mo65027c1(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f56713a.mo65013B(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: H */
    public <K, V> void mo64820H(int i, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
        if (this.f56713a.mo65024W0()) {
            m80353U(i, metadata, map);
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            this.f56713a.mo65014B1(i, 2);
            this.f56713a.mo65016C1(MapEntryLite.m80857b(metadata, next.getKey(), next.getValue()));
            MapEntryLite.m80859e(this.f56713a, metadata, next.getKey(), next.getValue());
        }
    }

    /* renamed from: I */
    public void mo64821I(int i, float f) throws IOException {
        this.f56713a.mo65018I(i, f);
    }

    /* renamed from: J */
    public void mo64858J(int i) throws IOException {
        this.f56713a.mo65014B1(i, 4);
    }

    /* renamed from: K */
    public void mo64822K(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f56713a.mo65014B1(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m80088I0(list.get(i4).intValue());
            }
            this.f56713a.mo65016C1(i3);
            while (i2 < list.size()) {
                this.f56713a.mo65059y1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f56713a.mo65020O(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: L */
    public void mo64823L(int i, int i2) throws IOException {
        this.f56713a.mo65019L(i, i2);
    }

    /* renamed from: M */
    public void mo64824M(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f56713a.mo65014B1(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m80125q0(list.get(i4).longValue());
            }
            this.f56713a.mo65016C1(i3);
            while (i2 < list.size()) {
                this.f56713a.mo65048q1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f56713a.mo65011A(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: N */
    public void mo64825N(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f56713a.mo65014B1(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m80110b0(list.get(i4).doubleValue());
            }
            this.f56713a.mo65016C1(i3);
            while (i2 < list.size()) {
                this.f56713a.mo65034g1(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f56713a.mo65052t(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: O */
    public void mo64861O(int i, int i2) throws IOException {
        this.f56713a.mo65020O(i, i2);
    }

    /* renamed from: P */
    public void mo64826P(int i, List<ByteString> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f56713a.mo65037j(i, list.get(i2));
        }
    }

    /* renamed from: a */
    public void mo64832a(int i, List<?> list, Schema schema) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo64873w(i, list.get(i2), schema);
        }
    }

    /* renamed from: b */
    public void mo64834b(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f56713a.mo65014B1(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m80118j0(list.get(i4).floatValue());
            }
            this.f56713a.mo65016C1(i3);
            while (i2 < list.size()) {
                this.f56713a.mo65040k1(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f56713a.mo65018I(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo64836c(int i, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.f56713a.mo65055v1(i, (ByteString) obj);
        } else {
            this.f56713a.mo65054u1(i, (MessageLite) obj);
        }
    }

    /* renamed from: d */
    public void mo64865d(int i, int i2) throws IOException {
        this.f56713a.mo65028d(i, i2);
    }

    /* renamed from: e */
    public void mo64837e(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i2 < list.size()) {
                m80355W(i, lazyStringList.mo65273d2(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f56713a.mo65031f(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: f */
    public void mo64866f(int i, String str) throws IOException {
        this.f56713a.mo65031f(i, str);
    }

    /* renamed from: g */
    public void mo64867g(int i, long j) throws IOException {
        this.f56713a.mo65033g(i, j);
    }

    /* renamed from: h */
    public void mo64839h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f56713a.mo65014B1(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m80123o0(list.get(i4).intValue());
            }
            this.f56713a.mo65016C1(i3);
            while (i2 < list.size()) {
                this.f56713a.mo65047p1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f56713a.mo65039k(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public void mo64868i(int i, Object obj, Schema schema) throws IOException {
        this.f56713a.mo65043m1(i, (MessageLite) obj, schema);
    }

    /* renamed from: j */
    public void mo64869j(int i, ByteString byteString) throws IOException {
        this.f56713a.mo65037j(i, byteString);
    }

    /* renamed from: k */
    public void mo64870k(int i, int i2) throws IOException {
        this.f56713a.mo65039k(i, i2);
    }

    /* renamed from: l */
    public void mo64841l(int i, long j) throws IOException {
        this.f56713a.mo65041l(i, j);
    }

    /* renamed from: m */
    public void mo64842m(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f56713a.mo65014B1(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m80114f0(list.get(i4).intValue());
            }
            this.f56713a.mo65016C1(i3);
            while (i2 < list.size()) {
                this.f56713a.mo65036i1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f56713a.mo65028d(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public void mo64843n(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f56713a.mo65014B1(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m80095P0(list.get(i4).intValue());
            }
            this.f56713a.mo65016C1(i3);
            while (i2 < list.size()) {
                this.f56713a.mo65016C1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f56713a.mo65050s(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: o */
    public void mo64844o(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f56713a.mo65014B1(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m80090K0(list.get(i4).longValue());
            }
            this.f56713a.mo65016C1(i3);
            while (i2 < list.size()) {
                this.f56713a.mo65060z1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f56713a.mo65046p(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: p */
    public void mo64871p(int i, long j) throws IOException {
        this.f56713a.mo65046p(i, j);
    }

    /* renamed from: q */
    public void mo64846q(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f56713a.mo65014B1(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m80112d0(list.get(i4).intValue());
            }
            this.f56713a.mo65016C1(i3);
            while (i2 < list.size()) {
                this.f56713a.mo65035h1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f56713a.mo65019L(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: r */
    public void mo64847r(int i, List<?> list, Schema schema) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo64868i(i, list.get(i2), schema);
        }
    }

    /* renamed from: s */
    public void mo64872s(int i, int i2) throws IOException {
        this.f56713a.mo65050s(i, i2);
    }

    /* renamed from: t */
    public void mo64848t(int i, double d) throws IOException {
        this.f56713a.mo65052t(i, d);
    }

    /* renamed from: u */
    public void mo64850u(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f56713a.mo65014B1(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m80086G0(list.get(i4).longValue());
            }
            this.f56713a.mo65016C1(i3);
            while (i2 < list.size()) {
                this.f56713a.mo65058x1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f56713a.mo65041l(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: v */
    public void mo64851v(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f56713a.mo65014B1(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m80097R0(list.get(i4).longValue());
            }
            this.f56713a.mo65016C1(i3);
            while (i2 < list.size()) {
                this.f56713a.mo65017D1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f56713a.mo65033g(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: w */
    public void mo64873w(int i, Object obj, Schema schema) throws IOException {
        this.f56713a.mo65051s1(i, (MessageLite) obj, schema);
    }

    /* renamed from: x */
    public void mo64874x(int i, long j) throws IOException {
        this.f56713a.mo65057x(i, j);
    }

    /* renamed from: y */
    public Writer.FieldOrder mo64853y() {
        return Writer.FieldOrder.ASCENDING;
    }

    /* renamed from: z */
    public void mo64875z(int i, Object obj) throws IOException {
        this.f56713a.mo65049r1(i, (MessageLite) obj);
    }
}
