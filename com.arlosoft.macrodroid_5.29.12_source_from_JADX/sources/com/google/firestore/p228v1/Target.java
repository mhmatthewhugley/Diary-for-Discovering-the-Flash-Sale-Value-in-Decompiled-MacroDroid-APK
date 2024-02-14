package com.google.firestore.p228v1;

import com.google.firestore.p228v1.StructuredQuery;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* renamed from: com.google.firestore.v1.Target */
public final class Target extends GeneratedMessageLite<Target, Builder> implements TargetOrBuilder {
    /* access modifiers changed from: private */
    public static final Target DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile Parser<Target> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private boolean once_;
    private int resumeTypeCase_ = 0;
    private Object resumeType_;
    private int targetId_;
    private int targetTypeCase_ = 0;
    private Object targetType_;

    /* renamed from: com.google.firestore.v1.Target$1 */
    static /* synthetic */ class C114291 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55701a;

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
                f55701a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55701a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f55701a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f55701a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f55701a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f55701a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f55701a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firestore.p228v1.Target.C114291.<clinit>():void");
        }
    }

    /* renamed from: com.google.firestore.v1.Target$Builder */
    public static final class Builder extends GeneratedMessageLite.Builder<Target, Builder> implements TargetOrBuilder {
        /* synthetic */ Builder(C114291 r1) {
            this();
        }

        /* renamed from: N */
        public Builder mo63897N(DocumentsTarget documentsTarget) {
            mo65189C();
            ((Target) this.f56910c).m78108a0(documentsTarget);
            return this;
        }

        /* renamed from: O */
        public Builder mo63898O(QueryTarget queryTarget) {
            mo65189C();
            ((Target) this.f56910c).m78109b0(queryTarget);
            return this;
        }

        /* renamed from: P */
        public Builder mo63899P(Timestamp timestamp) {
            mo65189C();
            ((Target) this.f56910c).m78110c0(timestamp);
            return this;
        }

        /* renamed from: R */
        public Builder mo63900R(ByteString byteString) {
            mo65189C();
            ((Target) this.f56910c).m78111d0(byteString);
            return this;
        }

        /* renamed from: S */
        public Builder mo63901S(int i) {
            mo65189C();
            ((Target) this.f56910c).m78112e0(i);
            return this;
        }

        private Builder() {
            super(Target.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.firestore.v1.Target$DocumentsTarget */
    public static final class DocumentsTarget extends GeneratedMessageLite<DocumentsTarget, Builder> implements DocumentsTargetOrBuilder {
        /* access modifiers changed from: private */
        public static final DocumentsTarget DEFAULT_INSTANCE;
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile Parser<DocumentsTarget> PARSER;
        private Internal.ProtobufList<String> documents_ = GeneratedMessageLite.m80628A();

        /* renamed from: com.google.firestore.v1.Target$DocumentsTarget$Builder */
        public static final class Builder extends GeneratedMessageLite.Builder<DocumentsTarget, Builder> implements DocumentsTargetOrBuilder {
            /* synthetic */ Builder(C114291 r1) {
                this();
            }

            /* renamed from: N */
            public Builder mo63904N(String str) {
                mo65189C();
                ((DocumentsTarget) this.f56910c).m78121V(str);
                return this;
            }

            private Builder() {
                super(DocumentsTarget.DEFAULT_INSTANCE);
            }
        }

        static {
            DocumentsTarget documentsTarget = new DocumentsTarget();
            DEFAULT_INSTANCE = documentsTarget;
            GeneratedMessageLite.m80642R(DocumentsTarget.class, documentsTarget);
        }

        private DocumentsTarget() {
        }

        /* access modifiers changed from: private */
        /* renamed from: V */
        public void m78121V(String str) {
            str.getClass();
            m78122W();
            this.documents_.add(str);
        }

        /* renamed from: W */
        private void m78122W() {
            Internal.ProtobufList<String> protobufList = this.documents_;
            if (!protobufList.mo64749c1()) {
                this.documents_ = GeneratedMessageLite.m80632G(protobufList);
            }
        }

        /* renamed from: X */
        public static DocumentsTarget m78123X() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: a0 */
        public static Builder m78124a0() {
            return (Builder) DEFAULT_INSTANCE.mo65182s();
        }

        /* renamed from: Y */
        public String mo63902Y(int i) {
            return this.documents_.get(i);
        }

        /* renamed from: Z */
        public int mo63903Z() {
            return this.documents_.size();
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C114291.f55701a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DocumentsTarget();
                case 2:
                    return new Builder((C114291) null);
                case 3:
                    return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DocumentsTarget> parser = PARSER;
                    if (parser == null) {
                        synchronized (DocumentsTarget.class) {
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

    /* renamed from: com.google.firestore.v1.Target$DocumentsTargetOrBuilder */
    public interface DocumentsTargetOrBuilder extends MessageLiteOrBuilder {
    }

    /* renamed from: com.google.firestore.v1.Target$QueryTarget */
    public static final class QueryTarget extends GeneratedMessageLite<QueryTarget, Builder> implements QueryTargetOrBuilder {
        /* access modifiers changed from: private */
        public static final QueryTarget DEFAULT_INSTANCE;
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile Parser<QueryTarget> PARSER = null;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private String parent_ = "";
        private int queryTypeCase_ = 0;
        private Object queryType_;

        /* renamed from: com.google.firestore.v1.Target$QueryTarget$Builder */
        public static final class Builder extends GeneratedMessageLite.Builder<QueryTarget, Builder> implements QueryTargetOrBuilder {
            /* synthetic */ Builder(C114291 r1) {
                this();
            }

            /* renamed from: N */
            public Builder mo63907N(String str) {
                mo65189C();
                ((QueryTarget) this.f56910c).m78134a0(str);
                return this;
            }

            /* renamed from: O */
            public Builder mo63908O(StructuredQuery.Builder builder) {
                mo65189C();
                ((QueryTarget) this.f56910c).m78135b0((StructuredQuery) builder.build());
                return this;
            }

            private Builder() {
                super(QueryTarget.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.google.firestore.v1.Target$QueryTarget$QueryTypeCase */
        public enum QueryTypeCase {
            STRUCTURED_QUERY(2),
            QUERYTYPE_NOT_SET(0);
            
            private final int value;

            private QueryTypeCase(int i) {
                this.value = i;
            }
        }

        static {
            QueryTarget queryTarget = new QueryTarget();
            DEFAULT_INSTANCE = queryTarget;
            GeneratedMessageLite.m80642R(QueryTarget.class, queryTarget);
        }

        private QueryTarget() {
        }

        /* renamed from: W */
        public static QueryTarget m78132W() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: Z */
        public static Builder m78133Z() {
            return (Builder) DEFAULT_INSTANCE.mo65182s();
        }

        /* access modifiers changed from: private */
        /* renamed from: a0 */
        public void m78134a0(String str) {
            str.getClass();
            this.parent_ = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: b0 */
        public void m78135b0(StructuredQuery structuredQuery) {
            structuredQuery.getClass();
            this.queryType_ = structuredQuery;
            this.queryTypeCase_ = 2;
        }

        /* renamed from: X */
        public String mo63905X() {
            return this.parent_;
        }

        /* renamed from: Y */
        public StructuredQuery mo63906Y() {
            if (this.queryTypeCase_ == 2) {
                return (StructuredQuery) this.queryType_;
            }
            return StructuredQuery.m77965e0();
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C114291.f55701a[methodToInvoke.ordinal()]) {
                case 1:
                    return new QueryTarget();
                case 2:
                    return new Builder((C114291) null);
                case 3:
                    return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", StructuredQuery.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<QueryTarget> parser = PARSER;
                    if (parser == null) {
                        synchronized (QueryTarget.class) {
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

    /* renamed from: com.google.firestore.v1.Target$QueryTargetOrBuilder */
    public interface QueryTargetOrBuilder extends MessageLiteOrBuilder {
    }

    /* renamed from: com.google.firestore.v1.Target$ResumeTypeCase */
    public enum ResumeTypeCase {
        RESUME_TOKEN(4),
        READ_TIME(11),
        RESUMETYPE_NOT_SET(0);
        
        private final int value;

        private ResumeTypeCase(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.google.firestore.v1.Target$TargetTypeCase */
    public enum TargetTypeCase {
        QUERY(2),
        DOCUMENTS(3),
        TARGETTYPE_NOT_SET(0);
        
        private final int value;

        private TargetTypeCase(int i) {
            this.value = i;
        }
    }

    static {
        Target target = new Target();
        DEFAULT_INSTANCE = target;
        GeneratedMessageLite.m80642R(Target.class, target);
    }

    private Target() {
    }

    /* renamed from: Z */
    public static Builder m78107Z() {
        return (Builder) DEFAULT_INSTANCE.mo65182s();
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m78108a0(DocumentsTarget documentsTarget) {
        documentsTarget.getClass();
        this.targetType_ = documentsTarget;
        this.targetTypeCase_ = 3;
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m78109b0(QueryTarget queryTarget) {
        queryTarget.getClass();
        this.targetType_ = queryTarget;
        this.targetTypeCase_ = 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m78110c0(Timestamp timestamp) {
        timestamp.getClass();
        this.resumeType_ = timestamp;
        this.resumeTypeCase_ = 11;
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m78111d0(ByteString byteString) {
        byteString.getClass();
        this.resumeTypeCase_ = 4;
        this.resumeType_ = byteString;
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m78112e0(int i) {
        this.targetId_ = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C114291.f55701a[methodToInvoke.ordinal()]) {
            case 1:
                return new Target();
            case 2:
                return new Builder((C114291) null);
            case 3:
                return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0006\u0002\u0000\u0002\u000b\u0006\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", QueryTarget.class, DocumentsTarget.class, "targetId_", "once_", Timestamp.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Target> parser = PARSER;
                if (parser == null) {
                    synchronized (Target.class) {
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
