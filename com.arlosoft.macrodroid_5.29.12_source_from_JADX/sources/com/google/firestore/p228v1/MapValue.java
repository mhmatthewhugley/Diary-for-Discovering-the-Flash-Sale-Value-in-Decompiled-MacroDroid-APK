package com.google.firestore.p228v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.firestore.v1.MapValue */
public final class MapValue extends GeneratedMessageLite<MapValue, Builder> implements MapValueOrBuilder {
    /* access modifiers changed from: private */
    public static final MapValue DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser<MapValue> PARSER;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.m80865d();

    /* renamed from: com.google.firestore.v1.MapValue$1 */
    static /* synthetic */ class C114191 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55637a;

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
                f55637a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55637a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f55637a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f55637a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f55637a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f55637a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f55637a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firestore.p228v1.MapValue.C114191.<clinit>():void");
        }
    }

    /* renamed from: com.google.firestore.v1.MapValue$Builder */
    public static final class Builder extends GeneratedMessageLite.Builder<MapValue, Builder> implements MapValueOrBuilder {
        /* synthetic */ Builder(C114191 r1) {
            this();
        }

        /* renamed from: N */
        public boolean mo63835N(String str) {
            str.getClass();
            return ((MapValue) this.f56910c).mo63832X().containsKey(str);
        }

        /* renamed from: O */
        public Builder mo63836O(Map<String, Value> map) {
            mo65189C();
            ((MapValue) this.f56910c).m77921a0().putAll(map);
            return this;
        }

        /* renamed from: P */
        public Builder mo63837P(String str, Value value) {
            str.getClass();
            value.getClass();
            mo65189C();
            ((MapValue) this.f56910c).m77921a0().put(str, value);
            return this;
        }

        /* renamed from: R */
        public Builder mo63838R(String str) {
            str.getClass();
            mo65189C();
            ((MapValue) this.f56910c).m77921a0().remove(str);
            return this;
        }

        private Builder() {
            super(MapValue.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.firestore.v1.MapValue$FieldsDefaultEntryHolder */
    private static final class FieldsDefaultEntryHolder {

        /* renamed from: a */
        static final MapEntryLite<String, Value> f55638a = MapEntryLite.m80858d(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Value.m78179i0());

        private FieldsDefaultEntryHolder() {
        }
    }

    static {
        MapValue mapValue = new MapValue();
        DEFAULT_INSTANCE = mapValue;
        GeneratedMessageLite.m80642R(MapValue.class, mapValue);
    }

    private MapValue() {
    }

    /* renamed from: V */
    public static MapValue m77920V() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public Map<String, Value> m77921a0() {
        return m77923c0();
    }

    /* renamed from: b0 */
    private MapFieldLite<String, Value> m77922b0() {
        return this.fields_;
    }

    /* renamed from: c0 */
    private MapFieldLite<String, Value> m77923c0() {
        if (!this.fields_.mo65324h()) {
            this.fields_ = this.fields_.mo65328n();
        }
        return this.fields_;
    }

    /* renamed from: d0 */
    public static Builder m77924d0() {
        return (Builder) DEFAULT_INSTANCE.mo65182s();
    }

    /* renamed from: W */
    public int mo63831W() {
        return m77922b0().size();
    }

    /* renamed from: X */
    public Map<String, Value> mo63832X() {
        return Collections.unmodifiableMap(m77922b0());
    }

    /* renamed from: Y */
    public Value mo63833Y(String str, Value value) {
        str.getClass();
        MapFieldLite<String, Value> b0 = m77922b0();
        return b0.containsKey(str) ? b0.get(str) : value;
    }

    /* renamed from: Z */
    public Value mo63834Z(String str) {
        str.getClass();
        MapFieldLite<String, Value> b0 = m77922b0();
        if (b0.containsKey(str)) {
            return b0.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C114191.f55637a[methodToInvoke.ordinal()]) {
            case 1:
                return new MapValue();
            case 2:
                return new Builder((C114191) null);
            case 3:
                return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", FieldsDefaultEntryHolder.f55638a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MapValue> parser = PARSER;
                if (parser == null) {
                    synchronized (MapValue.class) {
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
