package com.google.firestore.bundle;

import com.google.firestore.p228v1.StructuredQuery;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

public final class BundledQuery extends GeneratedMessageLite<BundledQuery, Builder> implements BundledQueryOrBuilder {
    /* access modifiers changed from: private */
    public static final BundledQuery DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<BundledQuery> PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private String parent_ = "";
    private int queryTypeCase_ = 0;
    private Object queryType_;

    /* renamed from: com.google.firestore.bundle.BundledQuery$1 */
    static /* synthetic */ class C113881 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55555a;

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
                f55555a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55555a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f55555a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f55555a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f55555a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f55555a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f55555a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firestore.bundle.BundledQuery.C113881.<clinit>():void");
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BundledQuery, Builder> implements BundledQueryOrBuilder {
        /* synthetic */ Builder(C113881 r1) {
            this();
        }

        /* renamed from: N */
        public Builder mo63756N(LimitType limitType) {
            mo65189C();
            ((BundledQuery) this.f56910c).m77696c0(limitType);
            return this;
        }

        /* renamed from: O */
        public Builder mo63757O(String str) {
            mo65189C();
            ((BundledQuery) this.f56910c).m77697d0(str);
            return this;
        }

        /* renamed from: P */
        public Builder mo63758P(StructuredQuery structuredQuery) {
            mo65189C();
            ((BundledQuery) this.f56910c).m77698e0(structuredQuery);
            return this;
        }

        private Builder() {
            super(BundledQuery.DEFAULT_INSTANCE);
        }
    }

    public enum LimitType implements Internal.EnumLite {
        FIRST(0),
        LAST(1),
        UNRECOGNIZED(-1);
        

        /* renamed from: f */
        private static final Internal.EnumLiteMap<LimitType> f55559f = null;
        private final int value;

        private static final class LimitTypeVerifier implements Internal.EnumVerifier {

            /* renamed from: a */
            static final Internal.EnumVerifier f55561a = null;

            static {
                f55561a = new LimitTypeVerifier();
            }

            private LimitTypeVerifier() {
            }

            /* renamed from: a */
            public boolean mo60055a(int i) {
                return LimitType.m77706b(i) != null;
            }
        }

        static {
            f55559f = new Internal.EnumLiteMap<LimitType>() {
                /* renamed from: b */
                public LimitType mo60053a(int i) {
                    return LimitType.m77706b(i);
                }
            };
        }

        private LimitType(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static LimitType m77706b(int i) {
            if (i == 0) {
                return FIRST;
            }
            if (i != 1) {
                return null;
            }
            return LAST;
        }

        /* renamed from: c */
        public final int mo60052c() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum QueryTypeCase {
        STRUCTURED_QUERY(2),
        QUERYTYPE_NOT_SET(0);
        
        private final int value;

        private QueryTypeCase(int i) {
            this.value = i;
        }
    }

    static {
        BundledQuery bundledQuery = new BundledQuery();
        DEFAULT_INSTANCE = bundledQuery;
        GeneratedMessageLite.m80642R(BundledQuery.class, bundledQuery);
    }

    private BundledQuery() {
    }

    /* renamed from: a0 */
    public static Builder m77694a0() {
        return (Builder) DEFAULT_INSTANCE.mo65182s();
    }

    /* renamed from: b0 */
    public static BundledQuery m77695b0(byte[] bArr) throws InvalidProtocolBufferException {
        return (BundledQuery) GeneratedMessageLite.m80638N(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m77696c0(LimitType limitType) {
        this.limitType_ = limitType.mo60052c();
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m77697d0(String str) {
        str.getClass();
        this.parent_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m77698e0(StructuredQuery structuredQuery) {
        structuredQuery.getClass();
        this.queryType_ = structuredQuery;
        this.queryTypeCase_ = 2;
    }

    /* renamed from: X */
    public LimitType mo63753X() {
        LimitType b = LimitType.m77706b(this.limitType_);
        return b == null ? LimitType.UNRECOGNIZED : b;
    }

    /* renamed from: Y */
    public String mo63754Y() {
        return this.parent_;
    }

    /* renamed from: Z */
    public StructuredQuery mo63755Z() {
        if (this.queryTypeCase_ == 2) {
            return (StructuredQuery) this.queryType_;
        }
        return StructuredQuery.m77965e0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C113881.f55555a[methodToInvoke.ordinal()]) {
            case 1:
                return new BundledQuery();
            case 2:
                return new Builder((C113881) null);
            case 3:
                return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003\f", new Object[]{"queryType_", "queryTypeCase_", "parent_", StructuredQuery.class, "limitType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BundledQuery> parser = PARSER;
                if (parser == null) {
                    synchronized (BundledQuery.class) {
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
