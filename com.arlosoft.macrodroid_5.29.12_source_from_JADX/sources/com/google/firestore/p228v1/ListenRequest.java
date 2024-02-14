package com.google.firestore.p228v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.util.Map;

/* renamed from: com.google.firestore.v1.ListenRequest */
public final class ListenRequest extends GeneratedMessageLite<ListenRequest, Builder> implements ListenRequestOrBuilder {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final ListenRequest DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile Parser<ListenRequest> PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private String database_ = "";
    private MapFieldLite<String, String> labels_ = MapFieldLite.m80865d();
    private int targetChangeCase_ = 0;
    private Object targetChange_;

    /* renamed from: com.google.firestore.v1.ListenRequest$1 */
    static /* synthetic */ class C114171 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55623a;

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
                f55623a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55623a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f55623a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f55623a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f55623a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f55623a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f55623a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firestore.p228v1.ListenRequest.C114171.<clinit>():void");
        }
    }

    /* renamed from: com.google.firestore.v1.ListenRequest$Builder */
    public static final class Builder extends GeneratedMessageLite.Builder<ListenRequest, Builder> implements ListenRequestOrBuilder {
        /* synthetic */ Builder(C114171 r1) {
            this();
        }

        /* renamed from: N */
        public Builder mo63821N(Map<String, String> map) {
            mo65189C();
            ((ListenRequest) this.f56910c).m77897Z().putAll(map);
            return this;
        }

        /* renamed from: O */
        public Builder mo63822O(Target target) {
            mo65189C();
            ((ListenRequest) this.f56910c).m77900c0(target);
            return this;
        }

        /* renamed from: P */
        public Builder mo63823P(String str) {
            mo65189C();
            ((ListenRequest) this.f56910c).m77901d0(str);
            return this;
        }

        /* renamed from: R */
        public Builder mo63824R(int i) {
            mo65189C();
            ((ListenRequest) this.f56910c).m77902e0(i);
            return this;
        }

        private Builder() {
            super(ListenRequest.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.firestore.v1.ListenRequest$LabelsDefaultEntryHolder */
    private static final class LabelsDefaultEntryHolder {

        /* renamed from: a */
        static final MapEntryLite<String, String> f55624a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f55624a = MapEntryLite.m80858d(fieldType, "", fieldType, "");
        }

        private LabelsDefaultEntryHolder() {
        }
    }

    /* renamed from: com.google.firestore.v1.ListenRequest$TargetChangeCase */
    public enum TargetChangeCase {
        ADD_TARGET(2),
        REMOVE_TARGET(3),
        TARGETCHANGE_NOT_SET(0);
        
        private final int value;

        private TargetChangeCase(int i) {
            this.value = i;
        }
    }

    static {
        ListenRequest listenRequest = new ListenRequest();
        DEFAULT_INSTANCE = listenRequest;
        GeneratedMessageLite.m80642R(ListenRequest.class, listenRequest);
    }

    private ListenRequest() {
    }

    /* renamed from: Y */
    public static ListenRequest m77896Y() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public Map<String, String> m77897Z() {
        return m77898a0();
    }

    /* renamed from: a0 */
    private MapFieldLite<String, String> m77898a0() {
        if (!this.labels_.mo65324h()) {
            this.labels_ = this.labels_.mo65328n();
        }
        return this.labels_;
    }

    /* renamed from: b0 */
    public static Builder m77899b0() {
        return (Builder) DEFAULT_INSTANCE.mo65182s();
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m77900c0(Target target) {
        target.getClass();
        this.targetChange_ = target;
        this.targetChangeCase_ = 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m77901d0(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m77902e0(int i) {
        this.targetChangeCase_ = 3;
        this.targetChange_ = Integer.valueOf(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C114171.f55623a[methodToInvoke.ordinal()]) {
            case 1:
                return new ListenRequest();
            case 2:
                return new Builder((C114171) null);
            case 3:
                return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", Target.class, "labels_", LabelsDefaultEntryHolder.f55624a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ListenRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (ListenRequest.class) {
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
