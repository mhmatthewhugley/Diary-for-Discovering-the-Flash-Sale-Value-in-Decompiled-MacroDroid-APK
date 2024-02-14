package com.google.firestore.p228v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* renamed from: com.google.firestore.v1.ListenResponse */
public final class ListenResponse extends GeneratedMessageLite<ListenResponse, Builder> implements ListenResponseOrBuilder {
    /* access modifiers changed from: private */
    public static final ListenResponse DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile Parser<ListenResponse> PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    /* renamed from: com.google.firestore.v1.ListenResponse$1 */
    static /* synthetic */ class C114181 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55629a;

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
                f55629a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55629a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f55629a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f55629a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f55629a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f55629a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f55629a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firestore.p228v1.ListenResponse.C114181.<clinit>():void");
        }
    }

    /* renamed from: com.google.firestore.v1.ListenResponse$Builder */
    public static final class Builder extends GeneratedMessageLite.Builder<ListenResponse, Builder> implements ListenResponseOrBuilder {
        /* synthetic */ Builder(C114181 r1) {
            this();
        }

        private Builder() {
            super(ListenResponse.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.firestore.v1.ListenResponse$ResponseTypeCase */
    public enum ResponseTypeCase {
        TARGET_CHANGE(2),
        DOCUMENT_CHANGE(3),
        DOCUMENT_DELETE(4),
        DOCUMENT_REMOVE(6),
        FILTER(5),
        RESPONSETYPE_NOT_SET(0);
        
        private final int value;

        private ResponseTypeCase(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static ResponseTypeCase m77917b(int i) {
            if (i == 0) {
                return RESPONSETYPE_NOT_SET;
            }
            if (i == 2) {
                return TARGET_CHANGE;
            }
            if (i == 3) {
                return DOCUMENT_CHANGE;
            }
            if (i == 4) {
                return DOCUMENT_DELETE;
            }
            if (i == 5) {
                return FILTER;
            }
            if (i != 6) {
                return null;
            }
            return DOCUMENT_REMOVE;
        }
    }

    static {
        ListenResponse listenResponse = new ListenResponse();
        DEFAULT_INSTANCE = listenResponse;
        GeneratedMessageLite.m80642R(ListenResponse.class, listenResponse);
    }

    private ListenResponse() {
    }

    /* renamed from: U */
    public static ListenResponse m77909U() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: V */
    public DocumentChange mo63825V() {
        if (this.responseTypeCase_ == 3) {
            return (DocumentChange) this.responseType_;
        }
        return DocumentChange.m77800U();
    }

    /* renamed from: W */
    public DocumentDelete mo63826W() {
        if (this.responseTypeCase_ == 4) {
            return (DocumentDelete) this.responseType_;
        }
        return DocumentDelete.m77806U();
    }

    /* renamed from: X */
    public DocumentRemove mo63827X() {
        if (this.responseTypeCase_ == 6) {
            return (DocumentRemove) this.responseType_;
        }
        return DocumentRemove.m77822U();
    }

    /* renamed from: Y */
    public ExistenceFilter mo63828Y() {
        if (this.responseTypeCase_ == 5) {
            return (ExistenceFilter) this.responseType_;
        }
        return ExistenceFilter.m77861V();
    }

    /* renamed from: Z */
    public ResponseTypeCase mo63829Z() {
        return ResponseTypeCase.m77917b(this.responseTypeCase_);
    }

    /* renamed from: a0 */
    public TargetChange mo63830a0() {
        if (this.responseTypeCase_ == 2) {
            return (TargetChange) this.responseType_;
        }
        return TargetChange.m78142V();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C114181.f55629a[methodToInvoke.ordinal()]) {
            case 1:
                return new ListenResponse();
            case 2:
                return new Builder((C114181) null);
            case 3:
                return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", TargetChange.class, DocumentChange.class, DocumentDelete.class, ExistenceFilter.class, DocumentRemove.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ListenResponse> parser = PARSER;
                if (parser == null) {
                    synchronized (ListenResponse.class) {
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
