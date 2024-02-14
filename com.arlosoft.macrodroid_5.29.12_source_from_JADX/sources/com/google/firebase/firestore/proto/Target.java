package com.google.firebase.firestore.proto;

import com.google.firestore.p228v1.Target;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

public final class Target extends GeneratedMessageLite<Target, Builder> implements TargetOrBuilder {
    /* access modifiers changed from: private */
    public static final Target DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile Parser<Target> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private Timestamp lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private ByteString resumeToken_ = ByteString.f56619a;
    private Timestamp snapshotVersion_;
    private int targetId_;
    private int targetTypeCase_ = 0;
    private Object targetType_;

    /* renamed from: com.google.firebase.firestore.proto.Target$1 */
    static /* synthetic */ class C112311 {

        /* renamed from: a */
        static final /* synthetic */ int[] f54507a;

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
                f54507a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f54507a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f54507a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f54507a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f54507a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f54507a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f54507a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.proto.Target.C112311.<clinit>():void");
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Target, Builder> implements TargetOrBuilder {
        /* synthetic */ Builder(C112311 r1) {
            this();
        }

        /* renamed from: N */
        public Builder mo62969N() {
            mo65189C();
            ((Target) this.f56910c).m76058c0();
            return this;
        }

        /* renamed from: O */
        public Builder mo62970O(Target.DocumentsTarget documentsTarget) {
            mo65189C();
            ((Target) this.f56910c).m76061n0(documentsTarget);
            return this;
        }

        /* renamed from: P */
        public Builder mo62971P(Timestamp timestamp) {
            mo65189C();
            ((Target) this.f56910c).m76062o0(timestamp);
            return this;
        }

        /* renamed from: R */
        public Builder mo62972R(long j) {
            mo65189C();
            ((Target) this.f56910c).m76063p0(j);
            return this;
        }

        /* renamed from: S */
        public Builder mo62973S(Target.QueryTarget queryTarget) {
            mo65189C();
            ((Target) this.f56910c).m76064q0(queryTarget);
            return this;
        }

        /* renamed from: T */
        public Builder mo62974T(ByteString byteString) {
            mo65189C();
            ((Target) this.f56910c).m76065r0(byteString);
            return this;
        }

        /* renamed from: U */
        public Builder mo62975U(Timestamp timestamp) {
            mo65189C();
            ((Target) this.f56910c).m76066s0(timestamp);
            return this;
        }

        /* renamed from: V */
        public Builder mo62976V(int i) {
            mo65189C();
            ((Target) this.f56910c).m76067t0(i);
            return this;
        }

        private Builder() {
            super(Target.DEFAULT_INSTANCE);
        }
    }

    public enum TargetTypeCase {
        QUERY(5),
        DOCUMENTS(6),
        TARGETTYPE_NOT_SET(0);
        
        private final int value;

        private TargetTypeCase(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static TargetTypeCase m76085b(int i) {
            if (i == 0) {
                return TARGETTYPE_NOT_SET;
            }
            if (i == 5) {
                return QUERY;
            }
            if (i != 6) {
                return null;
            }
            return DOCUMENTS;
        }
    }

    static {
        Target target = new Target();
        DEFAULT_INSTANCE = target;
        GeneratedMessageLite.m80642R(Target.class, target);
    }

    private Target() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m76058c0() {
        this.lastLimboFreeSnapshotVersion_ = null;
    }

    /* renamed from: l0 */
    public static Builder m76059l0() {
        return (Builder) DEFAULT_INSTANCE.mo65182s();
    }

    /* renamed from: m0 */
    public static Target m76060m0(byte[] bArr) throws InvalidProtocolBufferException {
        return (Target) GeneratedMessageLite.m80638N(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public void m76061n0(Target.DocumentsTarget documentsTarget) {
        documentsTarget.getClass();
        this.targetType_ = documentsTarget;
        this.targetTypeCase_ = 6;
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public void m76062o0(Timestamp timestamp) {
        timestamp.getClass();
        this.lastLimboFreeSnapshotVersion_ = timestamp;
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public void m76063p0(long j) {
        this.lastListenSequenceNumber_ = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public void m76064q0(Target.QueryTarget queryTarget) {
        queryTarget.getClass();
        this.targetType_ = queryTarget;
        this.targetTypeCase_ = 5;
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m76065r0(ByteString byteString) {
        byteString.getClass();
        this.resumeToken_ = byteString;
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public void m76066s0(Timestamp timestamp) {
        timestamp.getClass();
        this.snapshotVersion_ = timestamp;
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m76067t0(int i) {
        this.targetId_ = i;
    }

    /* renamed from: d0 */
    public Target.DocumentsTarget mo62961d0() {
        if (this.targetTypeCase_ == 6) {
            return (Target.DocumentsTarget) this.targetType_;
        }
        return Target.DocumentsTarget.m78123X();
    }

    /* renamed from: e0 */
    public Timestamp mo62962e0() {
        Timestamp timestamp = this.lastLimboFreeSnapshotVersion_;
        return timestamp == null ? Timestamp.m81257W() : timestamp;
    }

    /* renamed from: f0 */
    public long mo62963f0() {
        return this.lastListenSequenceNumber_;
    }

    /* renamed from: g0 */
    public Target.QueryTarget mo62964g0() {
        if (this.targetTypeCase_ == 5) {
            return (Target.QueryTarget) this.targetType_;
        }
        return Target.QueryTarget.m78132W();
    }

    /* renamed from: h0 */
    public ByteString mo62965h0() {
        return this.resumeToken_;
    }

    /* renamed from: i0 */
    public Timestamp mo62966i0() {
        Timestamp timestamp = this.snapshotVersion_;
        return timestamp == null ? Timestamp.m81257W() : timestamp;
    }

    /* renamed from: j0 */
    public int mo62967j0() {
        return this.targetId_;
    }

    /* renamed from: k0 */
    public TargetTypeCase mo62968k0() {
        return TargetTypeCase.m76085b(this.targetTypeCase_);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C112311.f54507a[methodToInvoke.ordinal()]) {
            case 1:
                return new Target();
            case 2:
                return new Builder((C112311) null);
            case 3:
                return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007\t", new Object[]{"targetType_", "targetTypeCase_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", Target.QueryTarget.class, Target.DocumentsTarget.class, "lastLimboFreeSnapshotVersion_"});
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
