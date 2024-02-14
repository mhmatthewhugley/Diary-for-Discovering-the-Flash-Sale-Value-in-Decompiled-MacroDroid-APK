package com.google.protobuf;

import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.List;

final class CodedInputStreamReader implements Reader {

    /* renamed from: a */
    private final CodedInputStream f56684a;

    /* renamed from: b */
    private int f56685b;

    /* renamed from: c */
    private int f56686c;

    /* renamed from: d */
    private int f56687d = 0;

    /* renamed from: com.google.protobuf.CodedInputStreamReader$1 */
    static /* synthetic */ class C115651 {

        /* renamed from: a */
        static final /* synthetic */ int[] f56688a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56688a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f56688a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f56688a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f56688a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f56688a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f56688a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f56688a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f56688a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f56688a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f56688a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f56688a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f56688a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f56688a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f56688a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f56688a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f56688a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f56688a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStreamReader.C115651.<clinit>():void");
        }
    }

    private CodedInputStreamReader(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.m80733b(codedInputStream, "input");
        this.f56684a = codedInputStream2;
        codedInputStream2.f56637d = this;
    }

    /* renamed from: Q */
    public static CodedInputStreamReader m80029Q(CodedInputStream codedInputStream) {
        CodedInputStreamReader codedInputStreamReader = codedInputStream.f56637d;
        if (codedInputStreamReader != null) {
            return codedInputStreamReader;
        }
        return new CodedInputStreamReader(codedInputStream);
    }

    /* renamed from: R */
    private Object m80030R(WireFormat.FieldType fieldType, Class<?> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        switch (C115651.f56688a[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo64790f());
            case 2:
                return mo64805s();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo64797m());
            case 5:
                return Integer.valueOf(mo64812z());
            case 6:
                return Long.valueOf(mo64784b());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo64806t());
            case 9:
                return Long.valueOf(mo64780O());
            case 10:
                return mo64811y(cls, extensionRegistryLite);
            case 11:
                return Integer.valueOf(mo64777L());
            case 12:
                return Long.valueOf(mo64792h());
            case 13:
                return Integer.valueOf(mo64798n());
            case 14:
                return Long.valueOf(mo64770E());
            case 15:
                return mo64781P();
            case 16:
                return Integer.valueOf(mo64794j());
            case 17:
                return Long.valueOf(mo64809w());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: S */
    private <T> T m80031S(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i = this.f56686c;
        this.f56686c = WireFormat.m81549c(WireFormat.m81547a(this.f56685b), 4);
        try {
            T newInstance = schema.newInstance();
            schema.mo65351h(newInstance, this, extensionRegistryLite);
            schema.mo65348e(newInstance);
            if (this.f56685b == this.f56686c) {
                return newInstance;
            }
            throw InvalidProtocolBufferException.m80764g();
        } finally {
            this.f56686c = i;
        }
    }

    /* renamed from: T */
    private <T> T m80032T(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int D = this.f56684a.mo64954D();
        CodedInputStream codedInputStream = this.f56684a;
        if (codedInputStream.f56634a < codedInputStream.f56635b) {
            int m = codedInputStream.mo64962m(D);
            T newInstance = schema.newInstance();
            this.f56684a.f56634a++;
            schema.mo65351h(newInstance, this, extensionRegistryLite);
            schema.mo65348e(newInstance);
            this.f56684a.mo64958a(0);
            CodedInputStream codedInputStream2 = this.f56684a;
            codedInputStream2.f56634a--;
            codedInputStream2.mo64961l(m);
            return newInstance;
        }
        throw InvalidProtocolBufferException.m80765h();
    }

    /* renamed from: V */
    private void m80033V(int i) throws IOException {
        if (this.f56684a.mo64959d() != i) {
            throw InvalidProtocolBufferException.m80767k();
        }
    }

    /* renamed from: W */
    private void m80034W(int i) throws IOException {
        if (WireFormat.m81548b(this.f56685b) != i) {
            throw InvalidProtocolBufferException.m80761d();
        }
    }

    /* renamed from: X */
    private void m80035X(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.m80764g();
        }
    }

    /* renamed from: Y */
    private void m80036Y(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.m80764g();
        }
    }

    /* renamed from: A */
    public <T> T mo64766A(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        m80034W(3);
        return m80031S(schema, extensionRegistryLite);
    }

    /* renamed from: B */
    public void mo64767B(List<Long> list) throws IOException {
        int C;
        int C2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int b = WireFormat.m81548b(this.f56685b);
            if (b == 1) {
                do {
                    longArrayList.mo65308i(this.f56684a.mo64973x());
                    if (!this.f56684a.mo64960e()) {
                        C2 = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C2 == this.f56685b);
                this.f56687d = C2;
            } else if (b == 2) {
                int D = this.f56684a.mo64954D();
                m80036Y(D);
                int d = this.f56684a.mo64959d() + D;
                do {
                    longArrayList.mo65308i(this.f56684a.mo64973x());
                } while (this.f56684a.mo64959d() < d);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        } else {
            int b2 = WireFormat.m81548b(this.f56685b);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f56684a.mo64973x()));
                    if (!this.f56684a.mo64960e()) {
                        C = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C == this.f56685b);
                this.f56687d = C;
            } else if (b2 == 2) {
                int D2 = this.f56684a.mo64954D();
                m80036Y(D2);
                int d2 = this.f56684a.mo64959d() + D2;
                do {
                    list.add(Long.valueOf(this.f56684a.mo64973x()));
                } while (this.f56684a.mo64959d() < d2);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        }
    }

    /* renamed from: C */
    public void mo64768C(List<Integer> list) throws IOException {
        int C;
        int C2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int b = WireFormat.m81548b(this.f56685b);
            if (b == 0) {
                do {
                    intArrayList.mo65218h(this.f56684a.mo64970u());
                    if (!this.f56684a.mo64960e()) {
                        C2 = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C2 == this.f56685b);
                this.f56687d = C2;
            } else if (b == 2) {
                int d = this.f56684a.mo64959d() + this.f56684a.mo64954D();
                do {
                    intArrayList.mo65218h(this.f56684a.mo64970u());
                } while (this.f56684a.mo64959d() < d);
                m80033V(d);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        } else {
            int b2 = WireFormat.m81548b(this.f56685b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f56684a.mo64970u()));
                    if (!this.f56684a.mo64960e()) {
                        C = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C == this.f56685b);
                this.f56687d = C;
            } else if (b2 == 2) {
                int d2 = this.f56684a.mo64959d() + this.f56684a.mo64954D();
                do {
                    list.add(Integer.valueOf(this.f56684a.mo64970u()));
                } while (this.f56684a.mo64959d() < d2);
                m80033V(d2);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        }
    }

    /* renamed from: D */
    public void mo64769D(List<Integer> list) throws IOException {
        int C;
        int C2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int b = WireFormat.m81548b(this.f56685b);
            if (b == 2) {
                int D = this.f56684a.mo64954D();
                m80035X(D);
                int d = this.f56684a.mo64959d() + D;
                do {
                    intArrayList.mo65218h(this.f56684a.mo64967r());
                } while (this.f56684a.mo64959d() < d);
            } else if (b == 5) {
                do {
                    intArrayList.mo65218h(this.f56684a.mo64967r());
                    if (!this.f56684a.mo64960e()) {
                        C2 = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C2 == this.f56685b);
                this.f56687d = C2;
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        } else {
            int b2 = WireFormat.m81548b(this.f56685b);
            if (b2 == 2) {
                int D2 = this.f56684a.mo64954D();
                m80035X(D2);
                int d2 = this.f56684a.mo64959d() + D2;
                do {
                    list.add(Integer.valueOf(this.f56684a.mo64967r()));
                } while (this.f56684a.mo64959d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f56684a.mo64967r()));
                    if (!this.f56684a.mo64960e()) {
                        C = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C == this.f56685b);
                this.f56687d = C;
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        }
    }

    /* renamed from: E */
    public long mo64770E() throws IOException {
        m80034W(0);
        return this.f56684a.mo64975z();
    }

    /* renamed from: F */
    public String mo64771F() throws IOException {
        m80034W(2);
        return this.f56684a.mo64951A();
    }

    /* renamed from: G */
    public int mo64772G() throws IOException {
        int i = this.f56687d;
        if (i != 0) {
            this.f56685b = i;
            this.f56687d = 0;
        } else {
            this.f56685b = this.f56684a.mo64953C();
        }
        int i2 = this.f56685b;
        if (i2 == 0 || i2 == this.f56686c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.m81547a(i2);
    }

    /* renamed from: H */
    public void mo64773H(List<String> list) throws IOException {
        mo65010U(list, false);
    }

    /* renamed from: I */
    public <T> T mo64774I(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        m80034W(2);
        return m80032T(schema, extensionRegistryLite);
    }

    /* renamed from: J */
    public void mo64775J(List<Float> list) throws IOException {
        int C;
        int C2;
        if (list instanceof FloatArrayList) {
            FloatArrayList floatArrayList = (FloatArrayList) list;
            int b = WireFormat.m81548b(this.f56685b);
            if (b == 2) {
                int D = this.f56684a.mo64954D();
                m80035X(D);
                int d = this.f56684a.mo64959d() + D;
                do {
                    floatArrayList.mo65156h(this.f56684a.mo64969t());
                } while (this.f56684a.mo64959d() < d);
            } else if (b == 5) {
                do {
                    floatArrayList.mo65156h(this.f56684a.mo64969t());
                    if (!this.f56684a.mo64960e()) {
                        C2 = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C2 == this.f56685b);
                this.f56687d = C2;
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        } else {
            int b2 = WireFormat.m81548b(this.f56685b);
            if (b2 == 2) {
                int D2 = this.f56684a.mo64954D();
                m80035X(D2);
                int d2 = this.f56684a.mo64959d() + D2;
                do {
                    list.add(Float.valueOf(this.f56684a.mo64969t()));
                } while (this.f56684a.mo64959d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Float.valueOf(this.f56684a.mo64969t()));
                    if (!this.f56684a.mo64960e()) {
                        C = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C == this.f56685b);
                this.f56687d = C;
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        }
    }

    /* renamed from: K */
    public boolean mo64776K() throws IOException {
        int i;
        if (this.f56684a.mo64960e() || (i = this.f56685b) == this.f56686c) {
            return false;
        }
        return this.f56684a.mo64957G(i);
    }

    /* renamed from: L */
    public int mo64777L() throws IOException {
        m80034W(5);
        return this.f56684a.mo64972w();
    }

    /* renamed from: M */
    public void mo64778M(List<ByteString> list) throws IOException {
        int C;
        if (WireFormat.m81548b(this.f56685b) == 2) {
            do {
                list.add(mo64805s());
                if (!this.f56684a.mo64960e()) {
                    C = this.f56684a.mo64953C();
                } else {
                    return;
                }
            } while (C == this.f56685b);
            this.f56687d = C;
            return;
        }
        throw InvalidProtocolBufferException.m80761d();
    }

    /* renamed from: N */
    public void mo64779N(List<Double> list) throws IOException {
        int C;
        int C2;
        if (list instanceof DoubleArrayList) {
            DoubleArrayList doubleArrayList = (DoubleArrayList) list;
            int b = WireFormat.m81548b(this.f56685b);
            if (b == 1) {
                do {
                    doubleArrayList.mo65087h(this.f56684a.mo64965p());
                    if (!this.f56684a.mo64960e()) {
                        C2 = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C2 == this.f56685b);
                this.f56687d = C2;
            } else if (b == 2) {
                int D = this.f56684a.mo64954D();
                m80036Y(D);
                int d = this.f56684a.mo64959d() + D;
                do {
                    doubleArrayList.mo65087h(this.f56684a.mo64965p());
                } while (this.f56684a.mo64959d() < d);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        } else {
            int b2 = WireFormat.m81548b(this.f56685b);
            if (b2 == 1) {
                do {
                    list.add(Double.valueOf(this.f56684a.mo64965p()));
                    if (!this.f56684a.mo64960e()) {
                        C = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C == this.f56685b);
                this.f56687d = C;
            } else if (b2 == 2) {
                int D2 = this.f56684a.mo64954D();
                m80036Y(D2);
                int d2 = this.f56684a.mo64959d() + D2;
                do {
                    list.add(Double.valueOf(this.f56684a.mo64965p()));
                } while (this.f56684a.mo64959d() < d2);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        }
    }

    /* renamed from: O */
    public long mo64780O() throws IOException {
        m80034W(0);
        return this.f56684a.mo64971v();
    }

    /* renamed from: P */
    public String mo64781P() throws IOException {
        m80034W(2);
        return this.f56684a.mo64952B();
    }

    /* renamed from: U */
    public void mo65010U(List<String> list, boolean z) throws IOException {
        int C;
        int C2;
        if (WireFormat.m81548b(this.f56685b) != 2) {
            throw InvalidProtocolBufferException.m80761d();
        } else if (!(list instanceof LazyStringList) || z) {
            do {
                list.add(z ? mo64781P() : mo64771F());
                if (!this.f56684a.mo64960e()) {
                    C = this.f56684a.mo64953C();
                } else {
                    return;
                }
            } while (C == this.f56685b);
            this.f56687d = C;
        } else {
            LazyStringList lazyStringList = (LazyStringList) list;
            do {
                lazyStringList.mo65272Z(mo64805s());
                if (!this.f56684a.mo64960e()) {
                    C2 = this.f56684a.mo64953C();
                } else {
                    return;
                }
            } while (C2 == this.f56685b);
            this.f56687d = C2;
        }
    }

    /* renamed from: a */
    public int mo64782a() {
        return this.f56685b;
    }

    /* renamed from: b */
    public long mo64784b() throws IOException {
        m80034W(1);
        return this.f56684a.mo64968s();
    }

    /* renamed from: c */
    public void mo64786c(List<Integer> list) throws IOException {
        int C;
        int C2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int b = WireFormat.m81548b(this.f56685b);
            if (b == 2) {
                int D = this.f56684a.mo64954D();
                m80035X(D);
                int d = this.f56684a.mo64959d() + D;
                do {
                    intArrayList.mo65218h(this.f56684a.mo64972w());
                } while (this.f56684a.mo64959d() < d);
            } else if (b == 5) {
                do {
                    intArrayList.mo65218h(this.f56684a.mo64972w());
                    if (!this.f56684a.mo64960e()) {
                        C2 = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C2 == this.f56685b);
                this.f56687d = C2;
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        } else {
            int b2 = WireFormat.m81548b(this.f56685b);
            if (b2 == 2) {
                int D2 = this.f56684a.mo64954D();
                m80035X(D2);
                int d2 = this.f56684a.mo64959d() + D2;
                do {
                    list.add(Integer.valueOf(this.f56684a.mo64972w()));
                } while (this.f56684a.mo64959d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f56684a.mo64972w()));
                    if (!this.f56684a.mo64960e()) {
                        C = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C == this.f56685b);
                this.f56687d = C;
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        }
    }

    /* renamed from: d */
    public void mo64787d(List<Long> list) throws IOException {
        int C;
        int C2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int b = WireFormat.m81548b(this.f56685b);
            if (b == 0) {
                do {
                    longArrayList.mo65308i(this.f56684a.mo64975z());
                    if (!this.f56684a.mo64960e()) {
                        C2 = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C2 == this.f56685b);
                this.f56687d = C2;
            } else if (b == 2) {
                int d = this.f56684a.mo64959d() + this.f56684a.mo64954D();
                do {
                    longArrayList.mo65308i(this.f56684a.mo64975z());
                } while (this.f56684a.mo64959d() < d);
                m80033V(d);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        } else {
            int b2 = WireFormat.m81548b(this.f56685b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f56684a.mo64975z()));
                    if (!this.f56684a.mo64960e()) {
                        C = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C == this.f56685b);
                this.f56687d = C;
            } else if (b2 == 2) {
                int d2 = this.f56684a.mo64959d() + this.f56684a.mo64954D();
                do {
                    list.add(Long.valueOf(this.f56684a.mo64975z()));
                } while (this.f56684a.mo64959d() < d2);
                m80033V(d2);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        }
    }

    /* renamed from: e */
    public <T> void mo64789e(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int C;
        if (WireFormat.m81548b(this.f56685b) == 3) {
            int i = this.f56685b;
            do {
                list.add(m80031S(schema, extensionRegistryLite));
                if (!this.f56684a.mo64960e() && this.f56687d == 0) {
                    C = this.f56684a.mo64953C();
                } else {
                    return;
                }
            } while (C == i);
            this.f56687d = C;
            return;
        }
        throw InvalidProtocolBufferException.m80761d();
    }

    /* renamed from: f */
    public boolean mo64790f() throws IOException {
        m80034W(0);
        return this.f56684a.mo64963n();
    }

    /* renamed from: g */
    public <T> void mo64791g(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int C;
        if (WireFormat.m81548b(this.f56685b) == 2) {
            int i = this.f56685b;
            do {
                list.add(m80032T(schema, extensionRegistryLite));
                if (!this.f56684a.mo64960e() && this.f56687d == 0) {
                    C = this.f56684a.mo64953C();
                } else {
                    return;
                }
            } while (C == i);
            this.f56687d = C;
            return;
        }
        throw InvalidProtocolBufferException.m80761d();
    }

    /* renamed from: h */
    public long mo64792h() throws IOException {
        m80034W(1);
        return this.f56684a.mo64973x();
    }

    /* renamed from: i */
    public void mo64793i(List<Long> list) throws IOException {
        int C;
        int C2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int b = WireFormat.m81548b(this.f56685b);
            if (b == 0) {
                do {
                    longArrayList.mo65308i(this.f56684a.mo64955E());
                    if (!this.f56684a.mo64960e()) {
                        C2 = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C2 == this.f56685b);
                this.f56687d = C2;
            } else if (b == 2) {
                int d = this.f56684a.mo64959d() + this.f56684a.mo64954D();
                do {
                    longArrayList.mo65308i(this.f56684a.mo64955E());
                } while (this.f56684a.mo64959d() < d);
                m80033V(d);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        } else {
            int b2 = WireFormat.m81548b(this.f56685b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f56684a.mo64955E()));
                    if (!this.f56684a.mo64960e()) {
                        C = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C == this.f56685b);
                this.f56687d = C;
            } else if (b2 == 2) {
                int d2 = this.f56684a.mo64959d() + this.f56684a.mo64954D();
                do {
                    list.add(Long.valueOf(this.f56684a.mo64955E()));
                } while (this.f56684a.mo64959d() < d2);
                m80033V(d2);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        }
    }

    /* renamed from: j */
    public int mo64794j() throws IOException {
        m80034W(0);
        return this.f56684a.mo64954D();
    }

    /* renamed from: k */
    public void mo64795k(List<Long> list) throws IOException {
        int C;
        int C2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int b = WireFormat.m81548b(this.f56685b);
            if (b == 0) {
                do {
                    longArrayList.mo65308i(this.f56684a.mo64971v());
                    if (!this.f56684a.mo64960e()) {
                        C2 = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C2 == this.f56685b);
                this.f56687d = C2;
            } else if (b == 2) {
                int d = this.f56684a.mo64959d() + this.f56684a.mo64954D();
                do {
                    longArrayList.mo65308i(this.f56684a.mo64971v());
                } while (this.f56684a.mo64959d() < d);
                m80033V(d);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        } else {
            int b2 = WireFormat.m81548b(this.f56685b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f56684a.mo64971v()));
                    if (!this.f56684a.mo64960e()) {
                        C = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C == this.f56685b);
                this.f56687d = C;
            } else if (b2 == 2) {
                int d2 = this.f56684a.mo64959d() + this.f56684a.mo64954D();
                do {
                    list.add(Long.valueOf(this.f56684a.mo64971v()));
                } while (this.f56684a.mo64959d() < d2);
                m80033V(d2);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        }
    }

    /* renamed from: l */
    public void mo64796l(List<Integer> list) throws IOException {
        int C;
        int C2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int b = WireFormat.m81548b(this.f56685b);
            if (b == 0) {
                do {
                    intArrayList.mo65218h(this.f56684a.mo64966q());
                    if (!this.f56684a.mo64960e()) {
                        C2 = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C2 == this.f56685b);
                this.f56687d = C2;
            } else if (b == 2) {
                int d = this.f56684a.mo64959d() + this.f56684a.mo64954D();
                do {
                    intArrayList.mo65218h(this.f56684a.mo64966q());
                } while (this.f56684a.mo64959d() < d);
                m80033V(d);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        } else {
            int b2 = WireFormat.m81548b(this.f56685b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f56684a.mo64966q()));
                    if (!this.f56684a.mo64960e()) {
                        C = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C == this.f56685b);
                this.f56687d = C;
            } else if (b2 == 2) {
                int d2 = this.f56684a.mo64959d() + this.f56684a.mo64954D();
                do {
                    list.add(Integer.valueOf(this.f56684a.mo64966q()));
                } while (this.f56684a.mo64959d() < d2);
                m80033V(d2);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        }
    }

    /* renamed from: m */
    public int mo64797m() throws IOException {
        m80034W(0);
        return this.f56684a.mo64966q();
    }

    /* renamed from: n */
    public int mo64798n() throws IOException {
        m80034W(0);
        return this.f56684a.mo64974y();
    }

    /* renamed from: o */
    public void mo64799o(List<Boolean> list) throws IOException {
        int C;
        int C2;
        if (list instanceof BooleanArrayList) {
            BooleanArrayList booleanArrayList = (BooleanArrayList) list;
            int b = WireFormat.m81548b(this.f56685b);
            if (b == 0) {
                do {
                    booleanArrayList.mo64893i(this.f56684a.mo64963n());
                    if (!this.f56684a.mo64960e()) {
                        C2 = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C2 == this.f56685b);
                this.f56687d = C2;
            } else if (b == 2) {
                int d = this.f56684a.mo64959d() + this.f56684a.mo64954D();
                do {
                    booleanArrayList.mo64893i(this.f56684a.mo64963n());
                } while (this.f56684a.mo64959d() < d);
                m80033V(d);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        } else {
            int b2 = WireFormat.m81548b(this.f56685b);
            if (b2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f56684a.mo64963n()));
                    if (!this.f56684a.mo64960e()) {
                        C = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C == this.f56685b);
                this.f56687d = C;
            } else if (b2 == 2) {
                int d2 = this.f56684a.mo64959d() + this.f56684a.mo64954D();
                do {
                    list.add(Boolean.valueOf(this.f56684a.mo64963n()));
                } while (this.f56684a.mo64959d() < d2);
                m80033V(d2);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        }
    }

    /* renamed from: p */
    public <T> T mo64800p(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        m80034W(3);
        return m80031S(Protobuf.m81041a().mo65366d(cls), extensionRegistryLite);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (mo64776K() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new com.google.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void mo64801q(java.util.Map<K, V> r8, com.google.protobuf.MapEntryLite.Metadata<K, V> r9, com.google.protobuf.ExtensionRegistryLite r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.m80034W(r0)
            com.google.protobuf.CodedInputStream r1 = r7.f56684a
            int r1 = r1.mo64954D()
            com.google.protobuf.CodedInputStream r2 = r7.f56684a
            int r1 = r2.mo64962m(r1)
            K r2 = r9.f57000b
            V r3 = r9.f57002d
        L_0x0014:
            int r4 = r7.mo64772G()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            com.google.protobuf.CodedInputStream r5 = r7.f56684a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.mo64960e()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.mo64776K()     // Catch:{ InvalidWireTypeException -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004f }
            r4.<init>(r6)     // Catch:{ InvalidWireTypeException -> 0x004f }
            throw r4     // Catch:{ InvalidWireTypeException -> 0x004f }
        L_0x003a:
            com.google.protobuf.WireFormat$FieldType r4 = r9.f57001c     // Catch:{ InvalidWireTypeException -> 0x004f }
            V r5 = r9.f57002d     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Object r3 = r7.m80030R(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x0047:
            com.google.protobuf.WireFormat$FieldType r4 = r9.f56999a     // Catch:{ InvalidWireTypeException -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.m80030R(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.mo64776K()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0065 }
            r8.<init>(r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            com.google.protobuf.CodedInputStream r8 = r7.f56684a
            r8.mo64961l(r1)
            return
        L_0x0065:
            r8 = move-exception
            com.google.protobuf.CodedInputStream r9 = r7.f56684a
            r9.mo64961l(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStreamReader.mo64801q(java.util.Map, com.google.protobuf.MapEntryLite$Metadata, com.google.protobuf.ExtensionRegistryLite):void");
    }

    /* renamed from: r */
    public void mo64802r(List<String> list) throws IOException {
        mo65010U(list, true);
    }

    public double readDouble() throws IOException {
        m80034W(1);
        return this.f56684a.mo64965p();
    }

    public float readFloat() throws IOException {
        m80034W(5);
        return this.f56684a.mo64969t();
    }

    /* renamed from: s */
    public ByteString mo64805s() throws IOException {
        m80034W(2);
        return this.f56684a.mo64964o();
    }

    /* renamed from: t */
    public int mo64806t() throws IOException {
        m80034W(0);
        return this.f56684a.mo64970u();
    }

    /* renamed from: u */
    public void mo64807u(List<Long> list) throws IOException {
        int C;
        int C2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int b = WireFormat.m81548b(this.f56685b);
            if (b == 1) {
                do {
                    longArrayList.mo65308i(this.f56684a.mo64968s());
                    if (!this.f56684a.mo64960e()) {
                        C2 = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C2 == this.f56685b);
                this.f56687d = C2;
            } else if (b == 2) {
                int D = this.f56684a.mo64954D();
                m80036Y(D);
                int d = this.f56684a.mo64959d() + D;
                do {
                    longArrayList.mo65308i(this.f56684a.mo64968s());
                } while (this.f56684a.mo64959d() < d);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        } else {
            int b2 = WireFormat.m81548b(this.f56685b);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f56684a.mo64968s()));
                    if (!this.f56684a.mo64960e()) {
                        C = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C == this.f56685b);
                this.f56687d = C;
            } else if (b2 == 2) {
                int D2 = this.f56684a.mo64954D();
                m80036Y(D2);
                int d2 = this.f56684a.mo64959d() + D2;
                do {
                    list.add(Long.valueOf(this.f56684a.mo64968s()));
                } while (this.f56684a.mo64959d() < d2);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        }
    }

    /* renamed from: v */
    public void mo64808v(List<Integer> list) throws IOException {
        int C;
        int C2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int b = WireFormat.m81548b(this.f56685b);
            if (b == 0) {
                do {
                    intArrayList.mo65218h(this.f56684a.mo64974y());
                    if (!this.f56684a.mo64960e()) {
                        C2 = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C2 == this.f56685b);
                this.f56687d = C2;
            } else if (b == 2) {
                int d = this.f56684a.mo64959d() + this.f56684a.mo64954D();
                do {
                    intArrayList.mo65218h(this.f56684a.mo64974y());
                } while (this.f56684a.mo64959d() < d);
                m80033V(d);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        } else {
            int b2 = WireFormat.m81548b(this.f56685b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f56684a.mo64974y()));
                    if (!this.f56684a.mo64960e()) {
                        C = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C == this.f56685b);
                this.f56687d = C;
            } else if (b2 == 2) {
                int d2 = this.f56684a.mo64959d() + this.f56684a.mo64954D();
                do {
                    list.add(Integer.valueOf(this.f56684a.mo64974y()));
                } while (this.f56684a.mo64959d() < d2);
                m80033V(d2);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        }
    }

    /* renamed from: w */
    public long mo64809w() throws IOException {
        m80034W(0);
        return this.f56684a.mo64955E();
    }

    /* renamed from: x */
    public void mo64810x(List<Integer> list) throws IOException {
        int C;
        int C2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int b = WireFormat.m81548b(this.f56685b);
            if (b == 0) {
                do {
                    intArrayList.mo65218h(this.f56684a.mo64954D());
                    if (!this.f56684a.mo64960e()) {
                        C2 = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C2 == this.f56685b);
                this.f56687d = C2;
            } else if (b == 2) {
                int d = this.f56684a.mo64959d() + this.f56684a.mo64954D();
                do {
                    intArrayList.mo65218h(this.f56684a.mo64954D());
                } while (this.f56684a.mo64959d() < d);
                m80033V(d);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        } else {
            int b2 = WireFormat.m81548b(this.f56685b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f56684a.mo64954D()));
                    if (!this.f56684a.mo64960e()) {
                        C = this.f56684a.mo64953C();
                    } else {
                        return;
                    }
                } while (C == this.f56685b);
                this.f56687d = C;
            } else if (b2 == 2) {
                int d2 = this.f56684a.mo64959d() + this.f56684a.mo64954D();
                do {
                    list.add(Integer.valueOf(this.f56684a.mo64954D()));
                } while (this.f56684a.mo64959d() < d2);
                m80033V(d2);
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        }
    }

    /* renamed from: y */
    public <T> T mo64811y(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        m80034W(2);
        return m80032T(Protobuf.m81041a().mo65366d(cls), extensionRegistryLite);
    }

    /* renamed from: z */
    public int mo64812z() throws IOException {
        m80034W(5);
        return this.f56684a.mo64967r();
    }
}
