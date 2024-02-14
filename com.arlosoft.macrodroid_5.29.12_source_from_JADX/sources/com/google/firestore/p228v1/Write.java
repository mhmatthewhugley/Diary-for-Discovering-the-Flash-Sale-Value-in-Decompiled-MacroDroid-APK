package com.google.firestore.p228v1;

import com.google.firestore.p228v1.DocumentTransform;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import java.util.List;

/* renamed from: com.google.firestore.v1.Write */
public final class Write extends GeneratedMessageLite<Write, Builder> implements WriteOrBuilder {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final Write DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile Parser<Write> PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private Precondition currentDocument_;
    private int operationCase_ = 0;
    private Object operation_;
    private DocumentMask updateMask_;
    private Internal.ProtobufList<DocumentTransform.FieldTransform> updateTransforms_ = GeneratedMessageLite.m80628A();

    /* renamed from: com.google.firestore.v1.Write$1 */
    static /* synthetic */ class C114351 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55746a;

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
                f55746a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55746a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f55746a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f55746a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f55746a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f55746a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f55746a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firestore.p228v1.Write.C114351.<clinit>():void");
        }
    }

    /* renamed from: com.google.firestore.v1.Write$Builder */
    public static final class Builder extends GeneratedMessageLite.Builder<Write, Builder> implements WriteOrBuilder {
        /* synthetic */ Builder(C114351 r1) {
            this();
        }

        /* renamed from: N */
        public Builder mo63952N(DocumentTransform.FieldTransform fieldTransform) {
            mo65189C();
            ((Write) this.f56910c).m78221a0(fieldTransform);
            return this;
        }

        /* renamed from: O */
        public Builder mo63953O(Precondition precondition) {
            mo65189C();
            ((Write) this.f56910c).m78225q0(precondition);
            return this;
        }

        /* renamed from: P */
        public Builder mo63954P(String str) {
            mo65189C();
            ((Write) this.f56910c).m78226r0(str);
            return this;
        }

        /* renamed from: R */
        public Builder mo63955R(Document document) {
            mo65189C();
            ((Write) this.f56910c).m78227s0(document);
            return this;
        }

        /* renamed from: S */
        public Builder mo63956S(DocumentMask documentMask) {
            mo65189C();
            ((Write) this.f56910c).m78228t0(documentMask);
            return this;
        }

        /* renamed from: T */
        public Builder mo63957T(String str) {
            mo65189C();
            ((Write) this.f56910c).m78229u0(str);
            return this;
        }

        private Builder() {
            super(Write.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.firestore.v1.Write$OperationCase */
    public enum OperationCase {
        UPDATE(1),
        DELETE(2),
        VERIFY(5),
        TRANSFORM(6),
        OPERATION_NOT_SET(0);
        
        private final int value;

        private OperationCase(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static OperationCase m78249b(int i) {
            if (i == 0) {
                return OPERATION_NOT_SET;
            }
            if (i == 1) {
                return UPDATE;
            }
            if (i == 2) {
                return DELETE;
            }
            if (i == 5) {
                return VERIFY;
            }
            if (i != 6) {
                return null;
            }
            return TRANSFORM;
        }
    }

    static {
        Write write = new Write();
        DEFAULT_INSTANCE = write;
        GeneratedMessageLite.m80642R(Write.class, write);
    }

    private Write() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m78221a0(DocumentTransform.FieldTransform fieldTransform) {
        fieldTransform.getClass();
        m78222b0();
        this.updateTransforms_.add(fieldTransform);
    }

    /* renamed from: b0 */
    private void m78222b0() {
        Internal.ProtobufList<DocumentTransform.FieldTransform> protobufList = this.updateTransforms_;
        if (!protobufList.mo64749c1()) {
            this.updateTransforms_ = GeneratedMessageLite.m80632G(protobufList);
        }
    }

    /* renamed from: o0 */
    public static Builder m78223o0() {
        return (Builder) DEFAULT_INSTANCE.mo65182s();
    }

    /* renamed from: p0 */
    public static Builder m78224p0(Write write) {
        return (Builder) DEFAULT_INSTANCE.mo65183t(write);
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public void m78225q0(Precondition precondition) {
        precondition.getClass();
        this.currentDocument_ = precondition;
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m78226r0(String str) {
        str.getClass();
        this.operationCase_ = 2;
        this.operation_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public void m78227s0(Document document) {
        document.getClass();
        this.operation_ = document;
        this.operationCase_ = 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m78228t0(DocumentMask documentMask) {
        documentMask.getClass();
        this.updateMask_ = documentMask;
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public void m78229u0(String str) {
        str.getClass();
        this.operationCase_ = 5;
        this.operation_ = str;
    }

    /* renamed from: c0 */
    public Precondition mo63940c0() {
        Precondition precondition = this.currentDocument_;
        return precondition == null ? Precondition.m77937X() : precondition;
    }

    /* renamed from: d0 */
    public String mo63941d0() {
        return this.operationCase_ == 2 ? (String) this.operation_ : "";
    }

    /* renamed from: e0 */
    public OperationCase mo63942e0() {
        return OperationCase.m78249b(this.operationCase_);
    }

    /* renamed from: f0 */
    public DocumentTransform mo63943f0() {
        if (this.operationCase_ == 6) {
            return (DocumentTransform) this.operation_;
        }
        return DocumentTransform.m77827U();
    }

    /* renamed from: g0 */
    public Document mo63944g0() {
        if (this.operationCase_ == 1) {
            return (Document) this.operation_;
        }
        return Document.m77785X();
    }

    /* renamed from: h0 */
    public DocumentMask mo63945h0() {
        DocumentMask documentMask = this.updateMask_;
        return documentMask == null ? DocumentMask.m77815X() : documentMask;
    }

    /* renamed from: i0 */
    public List<DocumentTransform.FieldTransform> mo63946i0() {
        return this.updateTransforms_;
    }

    /* renamed from: j0 */
    public String mo63947j0() {
        return this.operationCase_ == 5 ? (String) this.operation_ : "";
    }

    /* renamed from: k0 */
    public boolean mo63948k0() {
        return this.currentDocument_ != null;
    }

    /* renamed from: l0 */
    public boolean mo63949l0() {
        return this.operationCase_ == 6;
    }

    /* renamed from: m0 */
    public boolean mo63950m0() {
        return this.operationCase_ == 1;
    }

    /* renamed from: n0 */
    public boolean mo63951n0() {
        return this.updateMask_ != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C114351.f55746a[methodToInvoke.ordinal()]) {
            case 1:
                return new Write();
            case 2:
                return new Builder((C114351) null);
            case 3:
                return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\t\u0004\t\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", Document.class, "updateMask_", "currentDocument_", DocumentTransform.class, "updateTransforms_", DocumentTransform.FieldTransform.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Write> parser = PARSER;
                if (parser == null) {
                    synchronized (Write.class) {
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
