package com.google.firestore.p228v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firestore.v1.ArrayValue */
public final class ArrayValue extends GeneratedMessageLite<ArrayValue, Builder> implements ArrayValueOrBuilder {
    /* access modifiers changed from: private */
    public static final ArrayValue DEFAULT_INSTANCE;
    private static volatile Parser<ArrayValue> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Value> values_ = GeneratedMessageLite.m80628A();

    /* renamed from: com.google.firestore.v1.ArrayValue$1 */
    static /* synthetic */ class C113911 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55566a;

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
                f55566a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55566a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f55566a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f55566a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f55566a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f55566a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f55566a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firestore.p228v1.ArrayValue.C113911.<clinit>():void");
        }
    }

    /* renamed from: com.google.firestore.v1.ArrayValue$Builder */
    public static final class Builder extends GeneratedMessageLite.Builder<ArrayValue, Builder> implements ArrayValueOrBuilder {
        /* synthetic */ Builder(C113911 r1) {
            this();
        }

        /* renamed from: N */
        public Builder mo63763N(Iterable<? extends Value> iterable) {
            mo65189C();
            ((ArrayValue) this.f56910c).m77717X(iterable);
            return this;
        }

        /* renamed from: O */
        public Builder mo63764O(Value value) {
            mo65189C();
            ((ArrayValue) this.f56910c).m77718Y(value);
            return this;
        }

        /* renamed from: P */
        public Value mo63765P(int i) {
            return ((ArrayValue) this.f56910c).mo63760b0(i);
        }

        /* renamed from: R */
        public int mo63766R() {
            return ((ArrayValue) this.f56910c).mo63761c0();
        }

        /* renamed from: S */
        public Builder mo63767S(int i) {
            mo65189C();
            ((ArrayValue) this.f56910c).m77722e0(i);
            return this;
        }

        /* renamed from: l */
        public List<Value> mo63762l() {
            return Collections.unmodifiableList(((ArrayValue) this.f56910c).mo63762l());
        }

        private Builder() {
            super(ArrayValue.DEFAULT_INSTANCE);
        }
    }

    static {
        ArrayValue arrayValue = new ArrayValue();
        DEFAULT_INSTANCE = arrayValue;
        GeneratedMessageLite.m80642R(ArrayValue.class, arrayValue);
    }

    private ArrayValue() {
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m77717X(Iterable<? extends Value> iterable) {
        m77719Z();
        AbstractMessageLite.m79287i(iterable, this.values_);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m77718Y(Value value) {
        value.getClass();
        m77719Z();
        this.values_.add(value);
    }

    /* renamed from: Z */
    private void m77719Z() {
        Internal.ProtobufList<Value> protobufList = this.values_;
        if (!protobufList.mo64749c1()) {
            this.values_ = GeneratedMessageLite.m80632G(protobufList);
        }
    }

    /* renamed from: a0 */
    public static ArrayValue m77720a0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: d0 */
    public static Builder m77721d0() {
        return (Builder) DEFAULT_INSTANCE.mo65182s();
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m77722e0(int i) {
        m77719Z();
        this.values_.remove(i);
    }

    /* renamed from: b0 */
    public Value mo63760b0(int i) {
        return this.values_.get(i);
    }

    /* renamed from: c0 */
    public int mo63761c0() {
        return this.values_.size();
    }

    /* renamed from: l */
    public List<Value> mo63762l() {
        return this.values_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C113911.f55566a[methodToInvoke.ordinal()]) {
            case 1:
                return new ArrayValue();
            case 2:
                return new Builder((C113911) null);
            case 3:
                return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ArrayValue> parser = PARSER;
                if (parser == null) {
                    synchronized (ArrayValue.class) {
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
