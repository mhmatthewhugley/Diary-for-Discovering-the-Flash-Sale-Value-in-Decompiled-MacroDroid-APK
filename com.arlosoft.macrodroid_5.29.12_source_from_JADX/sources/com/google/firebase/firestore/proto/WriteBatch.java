package com.google.firebase.firestore.proto;

import com.google.firestore.p228v1.Write;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

public final class WriteBatch extends GeneratedMessageLite<WriteBatch, Builder> implements WriteBatchOrBuilder {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final WriteBatch DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile Parser<WriteBatch> PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private Internal.ProtobufList<Write> baseWrites_ = GeneratedMessageLite.m80628A();
    private int batchId_;
    private Timestamp localWriteTime_;
    private Internal.ProtobufList<Write> writes_ = GeneratedMessageLite.m80628A();

    /* renamed from: com.google.firebase.firestore.proto.WriteBatch$1 */
    static /* synthetic */ class C112341 {

        /* renamed from: a */
        static final /* synthetic */ int[] f54514a;

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
                f54514a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f54514a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f54514a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f54514a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f54514a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f54514a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f54514a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.proto.WriteBatch.C112341.<clinit>():void");
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<WriteBatch, Builder> implements WriteBatchOrBuilder {
        /* synthetic */ Builder(C112341 r1) {
            this();
        }

        /* renamed from: N */
        public Builder mo62987N(Write write) {
            mo65189C();
            ((WriteBatch) this.f56910c).m76105Y(write);
            return this;
        }

        /* renamed from: O */
        public Builder mo62988O(Write write) {
            mo65189C();
            ((WriteBatch) this.f56910c).m76106Z(write);
            return this;
        }

        /* renamed from: P */
        public Builder mo62989P(int i) {
            mo65189C();
            ((WriteBatch) this.f56910c).m76112l0(i);
            return this;
        }

        /* renamed from: R */
        public Builder mo62990R(Timestamp timestamp) {
            mo65189C();
            ((WriteBatch) this.f56910c).m76113m0(timestamp);
            return this;
        }

        private Builder() {
            super(WriteBatch.DEFAULT_INSTANCE);
        }
    }

    static {
        WriteBatch writeBatch = new WriteBatch();
        DEFAULT_INSTANCE = writeBatch;
        GeneratedMessageLite.m80642R(WriteBatch.class, writeBatch);
    }

    private WriteBatch() {
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m76105Y(Write write) {
        write.getClass();
        m76107a0();
        this.baseWrites_.add(write);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m76106Z(Write write) {
        write.getClass();
        m76108b0();
        this.writes_.add(write);
    }

    /* renamed from: a0 */
    private void m76107a0() {
        Internal.ProtobufList<Write> protobufList = this.baseWrites_;
        if (!protobufList.mo64749c1()) {
            this.baseWrites_ = GeneratedMessageLite.m80632G(protobufList);
        }
    }

    /* renamed from: b0 */
    private void m76108b0() {
        Internal.ProtobufList<Write> protobufList = this.writes_;
        if (!protobufList.mo64749c1()) {
            this.writes_ = GeneratedMessageLite.m80632G(protobufList);
        }
    }

    /* renamed from: i0 */
    public static Builder m76109i0() {
        return (Builder) DEFAULT_INSTANCE.mo65182s();
    }

    /* renamed from: j0 */
    public static WriteBatch m76110j0(ByteString byteString) throws InvalidProtocolBufferException {
        return (WriteBatch) GeneratedMessageLite.m80636L(DEFAULT_INSTANCE, byteString);
    }

    /* renamed from: k0 */
    public static WriteBatch m76111k0(byte[] bArr) throws InvalidProtocolBufferException {
        return (WriteBatch) GeneratedMessageLite.m80638N(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m76112l0(int i) {
        this.batchId_ = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public void m76113m0(Timestamp timestamp) {
        timestamp.getClass();
        this.localWriteTime_ = timestamp;
    }

    /* renamed from: c0 */
    public Write mo62981c0(int i) {
        return this.baseWrites_.get(i);
    }

    /* renamed from: d0 */
    public int mo62982d0() {
        return this.baseWrites_.size();
    }

    /* renamed from: e0 */
    public int mo62983e0() {
        return this.batchId_;
    }

    /* renamed from: f0 */
    public Timestamp mo62984f0() {
        Timestamp timestamp = this.localWriteTime_;
        return timestamp == null ? Timestamp.m81257W() : timestamp;
    }

    /* renamed from: g0 */
    public Write mo62985g0(int i) {
        return this.writes_.get(i);
    }

    /* renamed from: h0 */
    public int mo62986h0() {
        return this.writes_.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Class<Write> cls = Write.class;
        switch (C112341.f54514a[methodToInvoke.ordinal()]) {
            case 1:
                return new WriteBatch();
            case 2:
                return new Builder((C112341) null);
            case 3:
                return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\t\u0004\u001b", new Object[]{"batchId_", "writes_", cls, "localWriteTime_", "baseWrites_", cls});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WriteBatch> parser = PARSER;
                if (parser == null) {
                    synchronized (WriteBatch.class) {
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
