package com.google.firestore.p228v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.protobuf.WireFormat;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.firestore.v1.Document */
public final class Document extends GeneratedMessageLite<Document, Builder> implements DocumentOrBuilder {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final Document DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Document> PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private Timestamp createTime_;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.m80865d();
    private String name_ = "";
    private Timestamp updateTime_;

    /* renamed from: com.google.firestore.v1.Document$1 */
    static /* synthetic */ class C114011 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55585a;

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
                f55585a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55585a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f55585a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f55585a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f55585a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f55585a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f55585a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firestore.p228v1.Document.C114011.<clinit>():void");
        }
    }

    /* renamed from: com.google.firestore.v1.Document$Builder */
    public static final class Builder extends GeneratedMessageLite.Builder<Document, Builder> implements DocumentOrBuilder {
        /* synthetic */ Builder(C114011 r1) {
            this();
        }

        /* renamed from: N */
        public Builder mo63784N(Map<String, Value> map) {
            mo65189C();
            ((Document) this.f56910c).m77786Z().putAll(map);
            return this;
        }

        /* renamed from: O */
        public Builder mo63785O(String str) {
            mo65189C();
            ((Document) this.f56910c).m77790f0(str);
            return this;
        }

        /* renamed from: P */
        public Builder mo63786P(Timestamp timestamp) {
            mo65189C();
            ((Document) this.f56910c).m77791g0(timestamp);
            return this;
        }

        private Builder() {
            super(Document.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.firestore.v1.Document$FieldsDefaultEntryHolder */
    private static final class FieldsDefaultEntryHolder {

        /* renamed from: a */
        static final MapEntryLite<String, Value> f55586a = MapEntryLite.m80858d(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Value.m78179i0());

        private FieldsDefaultEntryHolder() {
        }
    }

    static {
        Document document = new Document();
        DEFAULT_INSTANCE = document;
        GeneratedMessageLite.m80642R(Document.class, document);
    }

    private Document() {
    }

    /* renamed from: X */
    public static Document m77785X() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public Map<String, Value> m77786Z() {
        return m77788d0();
    }

    /* renamed from: c0 */
    private MapFieldLite<String, Value> m77787c0() {
        return this.fields_;
    }

    /* renamed from: d0 */
    private MapFieldLite<String, Value> m77788d0() {
        if (!this.fields_.mo65324h()) {
            this.fields_ = this.fields_.mo65328n();
        }
        return this.fields_;
    }

    /* renamed from: e0 */
    public static Builder m77789e0() {
        return (Builder) DEFAULT_INSTANCE.mo65182s();
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m77790f0(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m77791g0(Timestamp timestamp) {
        timestamp.getClass();
        this.updateTime_ = timestamp;
    }

    /* renamed from: Y */
    public Map<String, Value> mo63781Y() {
        return Collections.unmodifiableMap(m77787c0());
    }

    /* renamed from: a0 */
    public String mo63782a0() {
        return this.name_;
    }

    /* renamed from: b0 */
    public Timestamp mo63783b0() {
        Timestamp timestamp = this.updateTime_;
        return timestamp == null ? Timestamp.m81257W() : timestamp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C114011.f55585a[methodToInvoke.ordinal()]) {
            case 1:
                return new Document();
            case 2:
                return new Builder((C114011) null);
            case 3:
                return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003\t\u0004\t", new Object[]{"name_", "fields_", FieldsDefaultEntryHolder.f55586a, "createTime_", "updateTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Document> parser = PARSER;
                if (parser == null) {
                    synchronized (Document.class) {
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
