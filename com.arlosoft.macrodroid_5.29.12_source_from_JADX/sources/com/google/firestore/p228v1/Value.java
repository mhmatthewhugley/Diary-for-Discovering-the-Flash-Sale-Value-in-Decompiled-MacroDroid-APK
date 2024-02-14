package com.google.firestore.p228v1;

import com.google.firestore.p228v1.ArrayValue;
import com.google.firestore.p228v1.MapValue;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.NullValue;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.type.LatLng;

/* renamed from: com.google.firestore.v1.Value */
public final class Value extends GeneratedMessageLite<Value, Builder> implements ValueOrBuilder {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    /* access modifiers changed from: private */
    public static final Value DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile Parser<Value> PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    /* renamed from: com.google.firestore.v1.Value$1 */
    static /* synthetic */ class C114341 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55732a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f55732a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55732a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f55732a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f55732a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f55732a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f55732a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f55732a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firestore.p228v1.Value.C114341.<clinit>():void");
        }
    }

    /* renamed from: com.google.firestore.v1.Value$Builder */
    public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
        /* synthetic */ Builder(C114341 r1) {
            this();
        }

        /* renamed from: N */
        public MapValue mo63927N() {
            return ((Value) this.f56910c).mo63922m0();
        }

        /* renamed from: O */
        public Builder mo63928O(ArrayValue.Builder builder) {
            mo65189C();
            ((Value) this.f56910c).m78181s0((ArrayValue) builder.build());
            return this;
        }

        /* renamed from: P */
        public Builder mo63929P(boolean z) {
            mo65189C();
            ((Value) this.f56910c).m78182t0(z);
            return this;
        }

        /* renamed from: R */
        public Builder mo63930R(ByteString byteString) {
            mo65189C();
            ((Value) this.f56910c).m78183u0(byteString);
            return this;
        }

        /* renamed from: S */
        public Builder mo63931S(double d) {
            mo65189C();
            ((Value) this.f56910c).m78184v0(d);
            return this;
        }

        /* renamed from: T */
        public Builder mo63932T(LatLng.Builder builder) {
            mo65189C();
            ((Value) this.f56910c).m78185w0((LatLng) builder.build());
            return this;
        }

        /* renamed from: U */
        public Builder mo63933U(long j) {
            mo65189C();
            ((Value) this.f56910c).m78186x0(j);
            return this;
        }

        /* renamed from: V */
        public Builder mo63934V(MapValue.Builder builder) {
            mo65189C();
            ((Value) this.f56910c).m78187z0((MapValue) builder.build());
            return this;
        }

        /* renamed from: X */
        public Builder mo63935X(MapValue mapValue) {
            mo65189C();
            ((Value) this.f56910c).m78187z0(mapValue);
            return this;
        }

        /* renamed from: Y */
        public Builder mo63936Y(NullValue nullValue) {
            mo65189C();
            ((Value) this.f56910c).m78163A0(nullValue);
            return this;
        }

        /* renamed from: Z */
        public Builder mo63937Z(String str) {
            mo65189C();
            ((Value) this.f56910c).m78164B0(str);
            return this;
        }

        /* renamed from: a0 */
        public Builder mo63938a0(String str) {
            mo65189C();
            ((Value) this.f56910c).m78165C0(str);
            return this;
        }

        /* renamed from: b0 */
        public Builder mo63939b0(Timestamp.Builder builder) {
            mo65189C();
            ((Value) this.f56910c).m78166D0((Timestamp) builder.build());
            return this;
        }

        private Builder() {
            super(Value.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.firestore.v1.Value$ValueTypeCase */
    public enum ValueTypeCase {
        NULL_VALUE(11),
        BOOLEAN_VALUE(1),
        INTEGER_VALUE(2),
        DOUBLE_VALUE(3),
        TIMESTAMP_VALUE(10),
        STRING_VALUE(17),
        BYTES_VALUE(18),
        REFERENCE_VALUE(5),
        GEO_POINT_VALUE(8),
        ARRAY_VALUE(9),
        MAP_VALUE(6),
        VALUETYPE_NOT_SET(0);
        
        private final int value;

        private ValueTypeCase(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static ValueTypeCase m78213b(int i) {
            if (i == 0) {
                return VALUETYPE_NOT_SET;
            }
            if (i == 1) {
                return BOOLEAN_VALUE;
            }
            if (i == 2) {
                return INTEGER_VALUE;
            }
            if (i == 3) {
                return DOUBLE_VALUE;
            }
            if (i == 5) {
                return REFERENCE_VALUE;
            }
            if (i == 6) {
                return MAP_VALUE;
            }
            if (i == 17) {
                return STRING_VALUE;
            }
            if (i == 18) {
                return BYTES_VALUE;
            }
            switch (i) {
                case 8:
                    return GEO_POINT_VALUE;
                case 9:
                    return ARRAY_VALUE;
                case 10:
                    return TIMESTAMP_VALUE;
                case 11:
                    return NULL_VALUE;
                default:
                    return null;
            }
        }
    }

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        GeneratedMessageLite.m80642R(Value.class, value);
    }

    private Value() {
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public void m78163A0(NullValue nullValue) {
        this.valueType_ = Integer.valueOf(nullValue.mo60052c());
        this.valueTypeCase_ = 11;
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public void m78164B0(String str) {
        str.getClass();
        this.valueTypeCase_ = 5;
        this.valueType_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public void m78165C0(String str) {
        str.getClass();
        this.valueTypeCase_ = 17;
        this.valueType_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public void m78166D0(Timestamp timestamp) {
        timestamp.getClass();
        this.valueType_ = timestamp;
        this.valueTypeCase_ = 10;
    }

    /* renamed from: i0 */
    public static Value m78179i0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: r0 */
    public static Builder m78180r0() {
        return (Builder) DEFAULT_INSTANCE.mo65182s();
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public void m78181s0(ArrayValue arrayValue) {
        arrayValue.getClass();
        this.valueType_ = arrayValue;
        this.valueTypeCase_ = 9;
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m78182t0(boolean z) {
        this.valueTypeCase_ = 1;
        this.valueType_ = Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public void m78183u0(ByteString byteString) {
        byteString.getClass();
        this.valueTypeCase_ = 18;
        this.valueType_ = byteString;
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public void m78184v0(double d) {
        this.valueTypeCase_ = 3;
        this.valueType_ = Double.valueOf(d);
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public void m78185w0(LatLng latLng) {
        latLng.getClass();
        this.valueType_ = latLng;
        this.valueTypeCase_ = 8;
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m78186x0(long j) {
        this.valueTypeCase_ = 2;
        this.valueType_ = Long.valueOf(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m78187z0(MapValue mapValue) {
        mapValue.getClass();
        this.valueType_ = mapValue;
        this.valueTypeCase_ = 6;
    }

    /* renamed from: f0 */
    public ArrayValue mo63916f0() {
        if (this.valueTypeCase_ == 9) {
            return (ArrayValue) this.valueType_;
        }
        return ArrayValue.m77720a0();
    }

    /* renamed from: g0 */
    public boolean mo63917g0() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    /* renamed from: h0 */
    public ByteString mo63918h0() {
        if (this.valueTypeCase_ == 18) {
            return (ByteString) this.valueType_;
        }
        return ByteString.f56619a;
    }

    /* renamed from: j0 */
    public double mo63919j0() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: k0 */
    public LatLng mo63920k0() {
        if (this.valueTypeCase_ == 8) {
            return (LatLng) this.valueType_;
        }
        return LatLng.m81676W();
    }

    /* renamed from: l0 */
    public long mo63921l0() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0;
    }

    /* renamed from: m0 */
    public MapValue mo63922m0() {
        if (this.valueTypeCase_ == 6) {
            return (MapValue) this.valueType_;
        }
        return MapValue.m77920V();
    }

    /* renamed from: n0 */
    public String mo63923n0() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    /* renamed from: o0 */
    public String mo63924o0() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }

    /* renamed from: p0 */
    public Timestamp mo63925p0() {
        if (this.valueTypeCase_ == 10) {
            return (Timestamp) this.valueType_;
        }
        return Timestamp.m81257W();
    }

    /* renamed from: q0 */
    public ValueTypeCase mo63926q0() {
        return ValueTypeCase.m78213b(this.valueTypeCase_);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C114341.f55732a[methodToInvoke.ordinal()]) {
            case 1:
                return new Value();
            case 2:
                return new Builder((C114341) null);
            case 3:
                return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", MapValue.class, LatLng.class, ArrayValue.class, Timestamp.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Value> parser = PARSER;
                if (parser == null) {
                    synchronized (Value.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
