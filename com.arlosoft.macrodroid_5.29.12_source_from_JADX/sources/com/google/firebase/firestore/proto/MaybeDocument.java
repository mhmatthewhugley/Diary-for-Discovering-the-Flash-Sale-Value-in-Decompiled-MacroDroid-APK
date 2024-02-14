package com.google.firebase.firestore.proto;

import com.google.firestore.p228v1.Document;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

public final class MaybeDocument extends GeneratedMessageLite<MaybeDocument, Builder> implements MaybeDocumentOrBuilder {
    /* access modifiers changed from: private */
    public static final MaybeDocument DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile Parser<MaybeDocument> PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    /* renamed from: com.google.firebase.firestore.proto.MaybeDocument$1 */
    static /* synthetic */ class C112281 {

        /* renamed from: a */
        static final /* synthetic */ int[] f54499a;

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
                f54499a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f54499a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f54499a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f54499a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f54499a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f54499a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f54499a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.proto.MaybeDocument.C112281.<clinit>():void");
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MaybeDocument, Builder> implements MaybeDocumentOrBuilder {
        /* synthetic */ Builder(C112281 r1) {
            this();
        }

        /* renamed from: N */
        public Builder mo62953N(Document document) {
            mo65189C();
            ((MaybeDocument) this.f56910c).m76020f0(document);
            return this;
        }

        /* renamed from: O */
        public Builder mo62954O(boolean z) {
            mo65189C();
            ((MaybeDocument) this.f56910c).m76021g0(z);
            return this;
        }

        /* renamed from: P */
        public Builder mo62955P(NoDocument noDocument) {
            mo65189C();
            ((MaybeDocument) this.f56910c).m76022h0(noDocument);
            return this;
        }

        /* renamed from: R */
        public Builder mo62956R(UnknownDocument unknownDocument) {
            mo65189C();
            ((MaybeDocument) this.f56910c).m76023i0(unknownDocument);
            return this;
        }

        private Builder() {
            super(MaybeDocument.DEFAULT_INSTANCE);
        }
    }

    public enum DocumentTypeCase {
        NO_DOCUMENT(1),
        DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        DOCUMENTTYPE_NOT_SET(0);
        
        private final int value;

        private DocumentTypeCase(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static DocumentTypeCase m76034b(int i) {
            if (i == 0) {
                return DOCUMENTTYPE_NOT_SET;
            }
            if (i == 1) {
                return NO_DOCUMENT;
            }
            if (i == 2) {
                return DOCUMENT;
            }
            if (i != 3) {
                return null;
            }
            return UNKNOWN_DOCUMENT;
        }
    }

    static {
        MaybeDocument maybeDocument = new MaybeDocument();
        DEFAULT_INSTANCE = maybeDocument;
        GeneratedMessageLite.m80642R(MaybeDocument.class, maybeDocument);
    }

    private MaybeDocument() {
    }

    /* renamed from: d0 */
    public static Builder m76018d0() {
        return (Builder) DEFAULT_INSTANCE.mo65182s();
    }

    /* renamed from: e0 */
    public static MaybeDocument m76019e0(byte[] bArr) throws InvalidProtocolBufferException {
        return (MaybeDocument) GeneratedMessageLite.m80638N(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m76020f0(Document document) {
        document.getClass();
        this.documentType_ = document;
        this.documentTypeCase_ = 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m76021g0(boolean z) {
        this.hasCommittedMutations_ = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m76022h0(NoDocument noDocument) {
        noDocument.getClass();
        this.documentType_ = noDocument;
        this.documentTypeCase_ = 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m76023i0(UnknownDocument unknownDocument) {
        unknownDocument.getClass();
        this.documentType_ = unknownDocument;
        this.documentTypeCase_ = 3;
    }

    /* renamed from: Y */
    public Document mo62948Y() {
        if (this.documentTypeCase_ == 2) {
            return (Document) this.documentType_;
        }
        return Document.m77785X();
    }

    /* renamed from: Z */
    public DocumentTypeCase mo62949Z() {
        return DocumentTypeCase.m76034b(this.documentTypeCase_);
    }

    /* renamed from: a0 */
    public boolean mo62950a0() {
        return this.hasCommittedMutations_;
    }

    /* renamed from: b0 */
    public NoDocument mo62951b0() {
        if (this.documentTypeCase_ == 1) {
            return (NoDocument) this.documentType_;
        }
        return NoDocument.m76040W();
    }

    /* renamed from: c0 */
    public UnknownDocument mo62952c0() {
        if (this.documentTypeCase_ == 3) {
            return (UnknownDocument) this.documentType_;
        }
        return UnknownDocument.m76091W();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C112281.f54499a[methodToInvoke.ordinal()]) {
            case 1:
                return new MaybeDocument();
            case 2:
                return new Builder((C112281) null);
            case 3:
                return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", NoDocument.class, Document.class, UnknownDocument.class, "hasCommittedMutations_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MaybeDocument> parser = PARSER;
                if (parser == null) {
                    synchronized (MaybeDocument.class) {
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
