package com.google.firestore.p228v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* renamed from: com.google.firestore.v1.TransactionOptions */
public final class TransactionOptions extends GeneratedMessageLite<TransactionOptions, Builder> implements TransactionOptionsOrBuilder {
    /* access modifiers changed from: private */
    public static final TransactionOptions DEFAULT_INSTANCE;
    private static volatile Parser<TransactionOptions> PARSER = null;
    public static final int READ_ONLY_FIELD_NUMBER = 2;
    public static final int READ_WRITE_FIELD_NUMBER = 3;
    private int modeCase_ = 0;
    private Object mode_;

    /* renamed from: com.google.firestore.v1.TransactionOptions$1 */
    static /* synthetic */ class C114321 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55723a;

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
                f55723a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55723a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f55723a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f55723a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f55723a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f55723a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f55723a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firestore.p228v1.TransactionOptions.C114321.<clinit>():void");
        }
    }

    /* renamed from: com.google.firestore.v1.TransactionOptions$Builder */
    public static final class Builder extends GeneratedMessageLite.Builder<TransactionOptions, Builder> implements TransactionOptionsOrBuilder {
        /* synthetic */ Builder(C114321 r1) {
            this();
        }

        private Builder() {
            super(TransactionOptions.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.firestore.v1.TransactionOptions$ModeCase */
    public enum ModeCase {
        READ_ONLY(2),
        READ_WRITE(3),
        MODE_NOT_SET(0);
        
        private final int value;

        private ModeCase(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.google.firestore.v1.TransactionOptions$ReadOnly */
    public static final class ReadOnly extends GeneratedMessageLite<ReadOnly, Builder> implements ReadOnlyOrBuilder {
        /* access modifiers changed from: private */
        public static final ReadOnly DEFAULT_INSTANCE;
        private static volatile Parser<ReadOnly> PARSER = null;
        public static final int READ_TIME_FIELD_NUMBER = 2;
        private int consistencySelectorCase_ = 0;
        private Object consistencySelector_;

        /* renamed from: com.google.firestore.v1.TransactionOptions$ReadOnly$Builder */
        public static final class Builder extends GeneratedMessageLite.Builder<ReadOnly, Builder> implements ReadOnlyOrBuilder {
            /* synthetic */ Builder(C114321 r1) {
                this();
            }

            private Builder() {
                super(ReadOnly.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.google.firestore.v1.TransactionOptions$ReadOnly$ConsistencySelectorCase */
        public enum ConsistencySelectorCase {
            READ_TIME(2),
            CONSISTENCYSELECTOR_NOT_SET(0);
            
            private final int value;

            private ConsistencySelectorCase(int i) {
                this.value = i;
            }
        }

        static {
            ReadOnly readOnly = new ReadOnly();
            DEFAULT_INSTANCE = readOnly;
            GeneratedMessageLite.m80642R(ReadOnly.class, readOnly);
        }

        private ReadOnly() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C114321.f55723a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ReadOnly();
                case 2:
                    return new Builder((C114321) null);
                case 3:
                    return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", Timestamp.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ReadOnly> parser = PARSER;
                    if (parser == null) {
                        synchronized (ReadOnly.class) {
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

    /* renamed from: com.google.firestore.v1.TransactionOptions$ReadOnlyOrBuilder */
    public interface ReadOnlyOrBuilder extends MessageLiteOrBuilder {
    }

    /* renamed from: com.google.firestore.v1.TransactionOptions$ReadWrite */
    public static final class ReadWrite extends GeneratedMessageLite<ReadWrite, Builder> implements ReadWriteOrBuilder {
        /* access modifiers changed from: private */
        public static final ReadWrite DEFAULT_INSTANCE;
        private static volatile Parser<ReadWrite> PARSER = null;
        public static final int RETRY_TRANSACTION_FIELD_NUMBER = 1;
        private ByteString retryTransaction_ = ByteString.f56619a;

        /* renamed from: com.google.firestore.v1.TransactionOptions$ReadWrite$Builder */
        public static final class Builder extends GeneratedMessageLite.Builder<ReadWrite, Builder> implements ReadWriteOrBuilder {
            /* synthetic */ Builder(C114321 r1) {
                this();
            }

            private Builder() {
                super(ReadWrite.DEFAULT_INSTANCE);
            }
        }

        static {
            ReadWrite readWrite = new ReadWrite();
            DEFAULT_INSTANCE = readWrite;
            GeneratedMessageLite.m80642R(ReadWrite.class, readWrite);
        }

        private ReadWrite() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C114321.f55723a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ReadWrite();
                case 2:
                    return new Builder((C114321) null);
                case 3:
                    return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"retryTransaction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ReadWrite> parser = PARSER;
                    if (parser == null) {
                        synchronized (ReadWrite.class) {
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

    /* renamed from: com.google.firestore.v1.TransactionOptions$ReadWriteOrBuilder */
    public interface ReadWriteOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        TransactionOptions transactionOptions = new TransactionOptions();
        DEFAULT_INSTANCE = transactionOptions;
        GeneratedMessageLite.m80642R(TransactionOptions.class, transactionOptions);
    }

    private TransactionOptions() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C114321.f55723a[methodToInvoke.ordinal()]) {
            case 1:
                return new TransactionOptions();
            case 2:
                return new Builder((C114321) null);
            case 3:
                return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"mode_", "modeCase_", ReadOnly.class, ReadWrite.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TransactionOptions> parser = PARSER;
                if (parser == null) {
                    synchronized (TransactionOptions.class) {
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
