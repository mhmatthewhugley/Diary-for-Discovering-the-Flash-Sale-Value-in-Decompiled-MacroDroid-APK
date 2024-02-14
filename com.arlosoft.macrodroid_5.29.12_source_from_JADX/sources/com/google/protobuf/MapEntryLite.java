package com.google.protobuf;

import com.google.protobuf.WireFormat;
import java.io.IOException;

public class MapEntryLite<K, V> {

    /* renamed from: a */
    private final Metadata<K, V> f56995a;

    /* renamed from: b */
    private final K f56996b;

    /* renamed from: c */
    private final V f56997c;

    /* renamed from: com.google.protobuf.MapEntryLite$1 */
    static /* synthetic */ class C115971 {

        /* renamed from: a */
        static final /* synthetic */ int[] f56998a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56998a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f56998a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f56998a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MapEntryLite.C115971.<clinit>():void");
        }
    }

    static class Metadata<K, V> {

        /* renamed from: a */
        public final WireFormat.FieldType f56999a;

        /* renamed from: b */
        public final K f57000b;

        /* renamed from: c */
        public final WireFormat.FieldType f57001c;

        /* renamed from: d */
        public final V f57002d;

        public Metadata(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
            this.f56999a = fieldType;
            this.f57000b = k;
            this.f57001c = fieldType2;
            this.f57002d = v;
        }
    }

    private MapEntryLite(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        this.f56995a = new Metadata<>(fieldType, k, fieldType2, v);
        this.f56996b = k;
        this.f56997c = v;
    }

    /* renamed from: b */
    static <K, V> int m80857b(Metadata<K, V> metadata, K k, V v) {
        return FieldSet.m80575d(metadata.f56999a, 1, k) + FieldSet.m80575d(metadata.f57001c, 2, v);
    }

    /* renamed from: d */
    public static <K, V> MapEntryLite<K, V> m80858d(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        return new MapEntryLite<>(fieldType, k, fieldType2, v);
    }

    /* renamed from: e */
    static <K, V> void m80859e(CodedOutputStream codedOutputStream, Metadata<K, V> metadata, K k, V v) throws IOException {
        FieldSet.m80586z(codedOutputStream, metadata.f56999a, 1, k);
        FieldSet.m80586z(codedOutputStream, metadata.f57001c, 2, v);
    }

    /* renamed from: a */
    public int mo65319a(int i, K k, V v) {
        return CodedOutputStream.m80093N0(i) + CodedOutputStream.m80129u0(m80857b(this.f56995a, k, v));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Metadata<K, V> mo65320c() {
        return this.f56995a;
    }
}
