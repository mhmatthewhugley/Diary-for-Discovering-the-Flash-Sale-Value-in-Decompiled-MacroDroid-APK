package com.google.firestore.p228v1;

import com.google.firestore.p228v1.ArrayValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* renamed from: com.google.firestore.v1.DocumentTransform */
public final class DocumentTransform extends GeneratedMessageLite<DocumentTransform, Builder> implements DocumentTransformOrBuilder {
    /* access modifiers changed from: private */
    public static final DocumentTransform DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile Parser<DocumentTransform> PARSER;
    private String document_ = "";
    private Internal.ProtobufList<FieldTransform> fieldTransforms_ = GeneratedMessageLite.m80628A();

    /* renamed from: com.google.firestore.v1.DocumentTransform$1 */
    static /* synthetic */ class C114061 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55591a;

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
                f55591a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55591a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f55591a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f55591a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f55591a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f55591a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f55591a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firestore.p228v1.DocumentTransform.C114061.<clinit>():void");
        }
    }

    /* renamed from: com.google.firestore.v1.DocumentTransform$Builder */
    public static final class Builder extends GeneratedMessageLite.Builder<DocumentTransform, Builder> implements DocumentTransformOrBuilder {
        /* synthetic */ Builder(C114061 r1) {
            this();
        }

        private Builder() {
            super(DocumentTransform.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.firestore.v1.DocumentTransform$FieldTransform */
    public static final class FieldTransform extends GeneratedMessageLite<FieldTransform, Builder> implements FieldTransformOrBuilder {
        public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final FieldTransform DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int INCREMENT_FIELD_NUMBER = 3;
        public static final int MAXIMUM_FIELD_NUMBER = 4;
        public static final int MINIMUM_FIELD_NUMBER = 5;
        private static volatile Parser<FieldTransform> PARSER = null;
        public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
        public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
        private String fieldPath_ = "";
        private int transformTypeCase_ = 0;
        private Object transformType_;

        /* renamed from: com.google.firestore.v1.DocumentTransform$FieldTransform$Builder */
        public static final class Builder extends GeneratedMessageLite.Builder<FieldTransform, Builder> implements FieldTransformOrBuilder {
            /* synthetic */ Builder(C114061 r1) {
                this();
            }

            /* renamed from: N */
            public Builder mo63805N(ArrayValue.Builder builder) {
                mo65189C();
                ((FieldTransform) this.f56910c).m77837g0((ArrayValue) builder.build());
                return this;
            }

            /* renamed from: O */
            public Builder mo63806O(String str) {
                mo65189C();
                ((FieldTransform) this.f56910c).m77838h0(str);
                return this;
            }

            /* renamed from: P */
            public Builder mo63807P(Value value) {
                mo65189C();
                ((FieldTransform) this.f56910c).m77839i0(value);
                return this;
            }

            /* renamed from: R */
            public Builder mo63808R(ArrayValue.Builder builder) {
                mo65189C();
                ((FieldTransform) this.f56910c).m77840j0((ArrayValue) builder.build());
                return this;
            }

            /* renamed from: S */
            public Builder mo63809S(ServerValue serverValue) {
                mo65189C();
                ((FieldTransform) this.f56910c).m77841k0(serverValue);
                return this;
            }

            private Builder() {
                super(FieldTransform.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.google.firestore.v1.DocumentTransform$FieldTransform$ServerValue */
        public enum ServerValue implements Internal.EnumLite {
            SERVER_VALUE_UNSPECIFIED(0),
            REQUEST_TIME(1),
            UNRECOGNIZED(-1);
            

            /* renamed from: f */
            private static final Internal.EnumLiteMap<ServerValue> f55595f = null;
            private final int value;

            /* renamed from: com.google.firestore.v1.DocumentTransform$FieldTransform$ServerValue$ServerValueVerifier */
            private static final class ServerValueVerifier implements Internal.EnumVerifier {

                /* renamed from: a */
                static final Internal.EnumVerifier f55597a = null;

                static {
                    f55597a = new ServerValueVerifier();
                }

                private ServerValueVerifier() {
                }

                /* renamed from: a */
                public boolean mo60055a(int i) {
                    return ServerValue.m77854b(i) != null;
                }
            }

            static {
                f55595f = new Internal.EnumLiteMap<ServerValue>() {
                    /* renamed from: b */
                    public ServerValue mo60053a(int i) {
                        return ServerValue.m77854b(i);
                    }
                };
            }

            private ServerValue(int i) {
                this.value = i;
            }

            /* renamed from: b */
            public static ServerValue m77854b(int i) {
                if (i == 0) {
                    return SERVER_VALUE_UNSPECIFIED;
                }
                if (i != 1) {
                    return null;
                }
                return REQUEST_TIME;
            }

            /* renamed from: c */
            public final int mo60052c() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* renamed from: com.google.firestore.v1.DocumentTransform$FieldTransform$TransformTypeCase */
        public enum TransformTypeCase {
            SET_TO_SERVER_VALUE(2),
            INCREMENT(3),
            MAXIMUM(4),
            MINIMUM(5),
            APPEND_MISSING_ELEMENTS(6),
            REMOVE_ALL_FROM_ARRAY(7),
            TRANSFORMTYPE_NOT_SET(0);
            
            private final int value;

            private TransformTypeCase(int i) {
                this.value = i;
            }

            /* renamed from: b */
            public static TransformTypeCase m77859b(int i) {
                if (i == 0) {
                    return TRANSFORMTYPE_NOT_SET;
                }
                switch (i) {
                    case 2:
                        return SET_TO_SERVER_VALUE;
                    case 3:
                        return INCREMENT;
                    case 4:
                        return MAXIMUM;
                    case 5:
                        return MINIMUM;
                    case 6:
                        return APPEND_MISSING_ELEMENTS;
                    case 7:
                        return REMOVE_ALL_FROM_ARRAY;
                    default:
                        return null;
                }
            }
        }

        static {
            FieldTransform fieldTransform = new FieldTransform();
            DEFAULT_INSTANCE = fieldTransform;
            GeneratedMessageLite.m80642R(FieldTransform.class, fieldTransform);
        }

        private FieldTransform() {
        }

        /* renamed from: f0 */
        public static Builder m77836f0() {
            return (Builder) DEFAULT_INSTANCE.mo65182s();
        }

        /* access modifiers changed from: private */
        /* renamed from: g0 */
        public void m77837g0(ArrayValue arrayValue) {
            arrayValue.getClass();
            this.transformType_ = arrayValue;
            this.transformTypeCase_ = 6;
        }

        /* access modifiers changed from: private */
        /* renamed from: h0 */
        public void m77838h0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: i0 */
        public void m77839i0(Value value) {
            value.getClass();
            this.transformType_ = value;
            this.transformTypeCase_ = 3;
        }

        /* access modifiers changed from: private */
        /* renamed from: j0 */
        public void m77840j0(ArrayValue arrayValue) {
            arrayValue.getClass();
            this.transformType_ = arrayValue;
            this.transformTypeCase_ = 7;
        }

        /* access modifiers changed from: private */
        /* renamed from: k0 */
        public void m77841k0(ServerValue serverValue) {
            this.transformType_ = Integer.valueOf(serverValue.mo60052c());
            this.transformTypeCase_ = 2;
        }

        /* renamed from: Z */
        public ArrayValue mo63799Z() {
            if (this.transformTypeCase_ == 6) {
                return (ArrayValue) this.transformType_;
            }
            return ArrayValue.m77720a0();
        }

        /* renamed from: a0 */
        public String mo63800a0() {
            return this.fieldPath_;
        }

        /* renamed from: b0 */
        public Value mo63801b0() {
            if (this.transformTypeCase_ == 3) {
                return (Value) this.transformType_;
            }
            return Value.m78179i0();
        }

        /* renamed from: c0 */
        public ArrayValue mo63802c0() {
            if (this.transformTypeCase_ == 7) {
                return (ArrayValue) this.transformType_;
            }
            return ArrayValue.m77720a0();
        }

        /* renamed from: d0 */
        public ServerValue mo63803d0() {
            if (this.transformTypeCase_ != 2) {
                return ServerValue.SERVER_VALUE_UNSPECIFIED;
            }
            ServerValue b = ServerValue.m77854b(((Integer) this.transformType_).intValue());
            return b == null ? ServerValue.UNRECOGNIZED : b;
        }

        /* renamed from: e0 */
        public TransformTypeCase mo63804e0() {
            return TransformTypeCase.m77859b(this.transformTypeCase_);
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Class<ArrayValue> cls = ArrayValue.class;
            Class<Value> cls2 = Value.class;
            switch (C114061.f55591a[methodToInvoke.ordinal()]) {
                case 1:
                    return new FieldTransform();
                case 2:
                    return new Builder((C114061) null);
                case 3:
                    return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", cls2, cls2, cls2, cls, cls});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FieldTransform> parser = PARSER;
                    if (parser == null) {
                        synchronized (FieldTransform.class) {
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

    /* renamed from: com.google.firestore.v1.DocumentTransform$FieldTransformOrBuilder */
    public interface FieldTransformOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        DocumentTransform documentTransform = new DocumentTransform();
        DEFAULT_INSTANCE = documentTransform;
        GeneratedMessageLite.m80642R(DocumentTransform.class, documentTransform);
    }

    private DocumentTransform() {
    }

    /* renamed from: U */
    public static DocumentTransform m77827U() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: V */
    public List<FieldTransform> mo63798V() {
        return this.fieldTransforms_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C114061.f55591a[methodToInvoke.ordinal()]) {
            case 1:
                return new DocumentTransform();
            case 2:
                return new Builder((C114061) null);
            case 3:
                return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", FieldTransform.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DocumentTransform> parser = PARSER;
                if (parser == null) {
                    synchronized (DocumentTransform.class) {
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
