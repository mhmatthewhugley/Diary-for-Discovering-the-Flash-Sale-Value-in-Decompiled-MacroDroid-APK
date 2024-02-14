package com.google.firestore.p228v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* renamed from: com.google.firestore.v1.StructuredQuery */
public final class StructuredQuery extends GeneratedMessageLite<StructuredQuery, Builder> implements StructuredQueryOrBuilder {
    /* access modifiers changed from: private */
    public static final StructuredQuery DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile Parser<StructuredQuery> PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private Cursor endAt_;
    private Internal.ProtobufList<CollectionSelector> from_ = GeneratedMessageLite.m80628A();
    private Int32Value limit_;
    private int offset_;
    private Internal.ProtobufList<Order> orderBy_ = GeneratedMessageLite.m80628A();
    private Projection select_;
    private Cursor startAt_;
    private Filter where_;

    /* renamed from: com.google.firestore.v1.StructuredQuery$1 */
    static /* synthetic */ class C114241 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55655a;

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
                f55655a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55655a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f55655a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f55655a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f55655a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f55655a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f55655a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firestore.p228v1.StructuredQuery.C114241.<clinit>():void");
        }
    }

    /* renamed from: com.google.firestore.v1.StructuredQuery$Builder */
    public static final class Builder extends GeneratedMessageLite.Builder<StructuredQuery, Builder> implements StructuredQueryOrBuilder {
        /* synthetic */ Builder(C114241 r1) {
            this();
        }

        /* renamed from: N */
        public Builder mo63856N(CollectionSelector.Builder builder) {
            mo65189C();
            ((StructuredQuery) this.f56910c).m77961a0((CollectionSelector) builder.build());
            return this;
        }

        /* renamed from: O */
        public Builder mo63857O(Order order) {
            mo65189C();
            ((StructuredQuery) this.f56910c).m77962b0(order);
            return this;
        }

        /* renamed from: P */
        public Builder mo63858P(Cursor cursor) {
            mo65189C();
            ((StructuredQuery) this.f56910c).m77967s0(cursor);
            return this;
        }

        /* renamed from: R */
        public Builder mo63859R(Int32Value.Builder builder) {
            mo65189C();
            ((StructuredQuery) this.f56910c).m77968t0((Int32Value) builder.build());
            return this;
        }

        /* renamed from: S */
        public Builder mo63860S(Cursor cursor) {
            mo65189C();
            ((StructuredQuery) this.f56910c).m77969u0(cursor);
            return this;
        }

        /* renamed from: T */
        public Builder mo63861T(Filter filter) {
            mo65189C();
            ((StructuredQuery) this.f56910c).m77970v0(filter);
            return this;
        }

        private Builder() {
            super(StructuredQuery.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.firestore.v1.StructuredQuery$CollectionSelector */
    public static final class CollectionSelector extends GeneratedMessageLite<CollectionSelector, Builder> implements CollectionSelectorOrBuilder {
        public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
        public static final int COLLECTION_ID_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final CollectionSelector DEFAULT_INSTANCE;
        private static volatile Parser<CollectionSelector> PARSER;
        private boolean allDescendants_;
        private String collectionId_ = "";

        /* renamed from: com.google.firestore.v1.StructuredQuery$CollectionSelector$Builder */
        public static final class Builder extends GeneratedMessageLite.Builder<CollectionSelector, Builder> implements CollectionSelectorOrBuilder {
            /* synthetic */ Builder(C114241 r1) {
                this();
            }

            /* renamed from: N */
            public Builder mo63864N(boolean z) {
                mo65189C();
                ((CollectionSelector) this.f56910c).m77994Z(z);
                return this;
            }

            /* renamed from: O */
            public Builder mo63865O(String str) {
                mo65189C();
                ((CollectionSelector) this.f56910c).m77995a0(str);
                return this;
            }

            private Builder() {
                super(CollectionSelector.DEFAULT_INSTANCE);
            }
        }

        static {
            CollectionSelector collectionSelector = new CollectionSelector();
            DEFAULT_INSTANCE = collectionSelector;
            GeneratedMessageLite.m80642R(CollectionSelector.class, collectionSelector);
        }

        private CollectionSelector() {
        }

        /* renamed from: Y */
        public static Builder m77993Y() {
            return (Builder) DEFAULT_INSTANCE.mo65182s();
        }

        /* access modifiers changed from: private */
        /* renamed from: Z */
        public void m77994Z(boolean z) {
            this.allDescendants_ = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a0 */
        public void m77995a0(String str) {
            str.getClass();
            this.collectionId_ = str;
        }

        /* renamed from: W */
        public boolean mo63862W() {
            return this.allDescendants_;
        }

        /* renamed from: X */
        public String mo63863X() {
            return this.collectionId_;
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C114241.f55655a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CollectionSelector();
                case 2:
                    return new Builder((C114241) null);
                case 3:
                    return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CollectionSelector> parser = PARSER;
                    if (parser == null) {
                        synchronized (CollectionSelector.class) {
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

    /* renamed from: com.google.firestore.v1.StructuredQuery$CollectionSelectorOrBuilder */
    public interface CollectionSelectorOrBuilder extends MessageLiteOrBuilder {
    }

    /* renamed from: com.google.firestore.v1.StructuredQuery$CompositeFilter */
    public static final class CompositeFilter extends GeneratedMessageLite<CompositeFilter, Builder> implements CompositeFilterOrBuilder {
        /* access modifiers changed from: private */
        public static final CompositeFilter DEFAULT_INSTANCE;
        public static final int FILTERS_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile Parser<CompositeFilter> PARSER;
        private Internal.ProtobufList<Filter> filters_ = GeneratedMessageLite.m80628A();
        private int op_;

        /* renamed from: com.google.firestore.v1.StructuredQuery$CompositeFilter$Builder */
        public static final class Builder extends GeneratedMessageLite.Builder<CompositeFilter, Builder> implements CompositeFilterOrBuilder {
            /* synthetic */ Builder(C114241 r1) {
                this();
            }

            /* renamed from: N */
            public Builder mo63868N(Iterable<? extends Filter> iterable) {
                mo65189C();
                ((CompositeFilter) this.f56910c).m78004W(iterable);
                return this;
            }

            /* renamed from: O */
            public Builder mo63869O(Operator operator) {
                mo65189C();
                ((CompositeFilter) this.f56910c).m78008c0(operator);
                return this;
            }

            private Builder() {
                super(CompositeFilter.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.google.firestore.v1.StructuredQuery$CompositeFilter$Operator */
        public enum Operator implements Internal.EnumLite {
            OPERATOR_UNSPECIFIED(0),
            AND(1),
            UNRECOGNIZED(-1);
            

            /* renamed from: f */
            private static final Internal.EnumLiteMap<Operator> f55659f = null;
            private final int value;

            /* renamed from: com.google.firestore.v1.StructuredQuery$CompositeFilter$Operator$OperatorVerifier */
            private static final class OperatorVerifier implements Internal.EnumVerifier {

                /* renamed from: a */
                static final Internal.EnumVerifier f55661a = null;

                static {
                    f55661a = new OperatorVerifier();
                }

                private OperatorVerifier() {
                }

                /* renamed from: a */
                public boolean mo60055a(int i) {
                    return Operator.m78014b(i) != null;
                }
            }

            static {
                f55659f = new Internal.EnumLiteMap<Operator>() {
                    /* renamed from: b */
                    public Operator mo60053a(int i) {
                        return Operator.m78014b(i);
                    }
                };
            }

            private Operator(int i) {
                this.value = i;
            }

            /* renamed from: b */
            public static Operator m78014b(int i) {
                if (i == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i != 1) {
                    return null;
                }
                return AND;
            }

            /* renamed from: c */
            public final int mo60052c() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            CompositeFilter compositeFilter = new CompositeFilter();
            DEFAULT_INSTANCE = compositeFilter;
            GeneratedMessageLite.m80642R(CompositeFilter.class, compositeFilter);
        }

        private CompositeFilter() {
        }

        /* access modifiers changed from: private */
        /* renamed from: W */
        public void m78004W(Iterable<? extends Filter> iterable) {
            m78005X();
            AbstractMessageLite.m79287i(iterable, this.filters_);
        }

        /* renamed from: X */
        private void m78005X() {
            Internal.ProtobufList<Filter> protobufList = this.filters_;
            if (!protobufList.mo64749c1()) {
                this.filters_ = GeneratedMessageLite.m80632G(protobufList);
            }
        }

        /* renamed from: Y */
        public static CompositeFilter m78006Y() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: b0 */
        public static Builder m78007b0() {
            return (Builder) DEFAULT_INSTANCE.mo65182s();
        }

        /* access modifiers changed from: private */
        /* renamed from: c0 */
        public void m78008c0(Operator operator) {
            this.op_ = operator.mo60052c();
        }

        /* renamed from: Z */
        public List<Filter> mo63866Z() {
            return this.filters_;
        }

        /* renamed from: a0 */
        public Operator mo63867a0() {
            Operator b = Operator.m78014b(this.op_);
            return b == null ? Operator.UNRECOGNIZED : b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C114241.f55655a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CompositeFilter();
                case 2:
                    return new Builder((C114241) null);
                case 3:
                    return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", Filter.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CompositeFilter> parser = PARSER;
                    if (parser == null) {
                        synchronized (CompositeFilter.class) {
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

    /* renamed from: com.google.firestore.v1.StructuredQuery$CompositeFilterOrBuilder */
    public interface CompositeFilterOrBuilder extends MessageLiteOrBuilder {
    }

    /* renamed from: com.google.firestore.v1.StructuredQuery$Direction */
    public enum Direction implements Internal.EnumLite {
        DIRECTION_UNSPECIFIED(0),
        ASCENDING(1),
        DESCENDING(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: g */
        private static final Internal.EnumLiteMap<Direction> f55666g = null;
        private final int value;

        /* renamed from: com.google.firestore.v1.StructuredQuery$Direction$DirectionVerifier */
        private static final class DirectionVerifier implements Internal.EnumVerifier {

            /* renamed from: a */
            static final Internal.EnumVerifier f55668a = null;

            static {
                f55668a = new DirectionVerifier();
            }

            private DirectionVerifier() {
            }

            /* renamed from: a */
            public boolean mo60055a(int i) {
                return Direction.m78019b(i) != null;
            }
        }

        static {
            f55666g = new Internal.EnumLiteMap<Direction>() {
                /* renamed from: b */
                public Direction mo60053a(int i) {
                    return Direction.m78019b(i);
                }
            };
        }

        private Direction(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static Direction m78019b(int i) {
            if (i == 0) {
                return DIRECTION_UNSPECIFIED;
            }
            if (i == 1) {
                return ASCENDING;
            }
            if (i != 2) {
                return null;
            }
            return DESCENDING;
        }

        /* renamed from: c */
        public final int mo60052c() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.google.firestore.v1.StructuredQuery$FieldFilter */
    public static final class FieldFilter extends GeneratedMessageLite<FieldFilter, Builder> implements FieldFilterOrBuilder {
        /* access modifiers changed from: private */
        public static final FieldFilter DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 2;
        private static volatile Parser<FieldFilter> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 3;
        private FieldReference field_;
        private int op_;
        private Value value_;

        /* renamed from: com.google.firestore.v1.StructuredQuery$FieldFilter$Builder */
        public static final class Builder extends GeneratedMessageLite.Builder<FieldFilter, Builder> implements FieldFilterOrBuilder {
            /* synthetic */ Builder(C114241 r1) {
                this();
            }

            /* renamed from: N */
            public Builder mo63875N(FieldReference fieldReference) {
                mo65189C();
                ((FieldFilter) this.f56910c).m78030c0(fieldReference);
                return this;
            }

            /* renamed from: O */
            public Builder mo63876O(Operator operator) {
                mo65189C();
                ((FieldFilter) this.f56910c).m78031d0(operator);
                return this;
            }

            /* renamed from: P */
            public Builder mo63877P(Value value) {
                mo65189C();
                ((FieldFilter) this.f56910c).m78032e0(value);
                return this;
            }

            private Builder() {
                super(FieldFilter.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.google.firestore.v1.StructuredQuery$FieldFilter$Operator */
        public enum Operator implements Internal.EnumLite {
            OPERATOR_UNSPECIFIED(0),
            LESS_THAN(1),
            LESS_THAN_OR_EQUAL(2),
            GREATER_THAN(3),
            GREATER_THAN_OR_EQUAL(4),
            EQUAL(5),
            NOT_EQUAL(6),
            ARRAY_CONTAINS(7),
            IN(8),
            ARRAY_CONTAINS_ANY(9),
            NOT_IN(10),
            UNRECOGNIZED(-1);
            

            /* renamed from: D */
            private static final Internal.EnumLiteMap<Operator> f55672D = null;
            private final int value;

            /* renamed from: com.google.firestore.v1.StructuredQuery$FieldFilter$Operator$OperatorVerifier */
            private static final class OperatorVerifier implements Internal.EnumVerifier {

                /* renamed from: a */
                static final Internal.EnumVerifier f55683a = null;

                static {
                    f55683a = new OperatorVerifier();
                }

                private OperatorVerifier() {
                }

                /* renamed from: a */
                public boolean mo60055a(int i) {
                    return Operator.m78040b(i) != null;
                }
            }

            static {
                f55672D = new Internal.EnumLiteMap<Operator>() {
                    /* renamed from: b */
                    public Operator mo60053a(int i) {
                        return Operator.m78040b(i);
                    }
                };
            }

            private Operator(int i) {
                this.value = i;
            }

            /* renamed from: b */
            public static Operator m78040b(int i) {
                switch (i) {
                    case 0:
                        return OPERATOR_UNSPECIFIED;
                    case 1:
                        return LESS_THAN;
                    case 2:
                        return LESS_THAN_OR_EQUAL;
                    case 3:
                        return GREATER_THAN;
                    case 4:
                        return GREATER_THAN_OR_EQUAL;
                    case 5:
                        return EQUAL;
                    case 6:
                        return NOT_EQUAL;
                    case 7:
                        return ARRAY_CONTAINS;
                    case 8:
                        return IN;
                    case 9:
                        return ARRAY_CONTAINS_ANY;
                    case 10:
                        return NOT_IN;
                    default:
                        return null;
                }
            }

            /* renamed from: c */
            public final int mo60052c() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            FieldFilter fieldFilter = new FieldFilter();
            DEFAULT_INSTANCE = fieldFilter;
            GeneratedMessageLite.m80642R(FieldFilter.class, fieldFilter);
        }

        private FieldFilter() {
        }

        /* renamed from: X */
        public static FieldFilter m78028X() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: b0 */
        public static Builder m78029b0() {
            return (Builder) DEFAULT_INSTANCE.mo65182s();
        }

        /* access modifiers changed from: private */
        /* renamed from: c0 */
        public void m78030c0(FieldReference fieldReference) {
            fieldReference.getClass();
            this.field_ = fieldReference;
        }

        /* access modifiers changed from: private */
        /* renamed from: d0 */
        public void m78031d0(Operator operator) {
            this.op_ = operator.mo60052c();
        }

        /* access modifiers changed from: private */
        /* renamed from: e0 */
        public void m78032e0(Value value) {
            value.getClass();
            this.value_ = value;
        }

        /* renamed from: Y */
        public FieldReference mo63872Y() {
            FieldReference fieldReference = this.field_;
            return fieldReference == null ? FieldReference.m78047V() : fieldReference;
        }

        /* renamed from: Z */
        public Operator mo63873Z() {
            Operator b = Operator.m78040b(this.op_);
            return b == null ? Operator.UNRECOGNIZED : b;
        }

        /* renamed from: a0 */
        public Value mo63874a0() {
            Value value = this.value_;
            return value == null ? Value.m78179i0() : value;
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C114241.f55655a[methodToInvoke.ordinal()]) {
                case 1:
                    return new FieldFilter();
                case 2:
                    return new Builder((C114241) null);
                case 3:
                    return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t", new Object[]{"field_", "op_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FieldFilter> parser = PARSER;
                    if (parser == null) {
                        synchronized (FieldFilter.class) {
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

    /* renamed from: com.google.firestore.v1.StructuredQuery$FieldFilterOrBuilder */
    public interface FieldFilterOrBuilder extends MessageLiteOrBuilder {
    }

    /* renamed from: com.google.firestore.v1.StructuredQuery$FieldReference */
    public static final class FieldReference extends GeneratedMessageLite<FieldReference, Builder> implements FieldReferenceOrBuilder {
        /* access modifiers changed from: private */
        public static final FieldReference DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 2;
        private static volatile Parser<FieldReference> PARSER;
        private String fieldPath_ = "";

        /* renamed from: com.google.firestore.v1.StructuredQuery$FieldReference$Builder */
        public static final class Builder extends GeneratedMessageLite.Builder<FieldReference, Builder> implements FieldReferenceOrBuilder {
            /* synthetic */ Builder(C114241 r1) {
                this();
            }

            /* renamed from: N */
            public Builder mo63880N(String str) {
                mo65189C();
                ((FieldReference) this.f56910c).m78049Y(str);
                return this;
            }

            private Builder() {
                super(FieldReference.DEFAULT_INSTANCE);
            }
        }

        static {
            FieldReference fieldReference = new FieldReference();
            DEFAULT_INSTANCE = fieldReference;
            GeneratedMessageLite.m80642R(FieldReference.class, fieldReference);
        }

        private FieldReference() {
        }

        /* renamed from: V */
        public static FieldReference m78047V() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: X */
        public static Builder m78048X() {
            return (Builder) DEFAULT_INSTANCE.mo65182s();
        }

        /* access modifiers changed from: private */
        /* renamed from: Y */
        public void m78049Y(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* renamed from: W */
        public String mo63879W() {
            return this.fieldPath_;
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C114241.f55655a[methodToInvoke.ordinal()]) {
                case 1:
                    return new FieldReference();
                case 2:
                    return new Builder((C114241) null);
                case 3:
                    return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FieldReference> parser = PARSER;
                    if (parser == null) {
                        synchronized (FieldReference.class) {
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

    /* renamed from: com.google.firestore.v1.StructuredQuery$FieldReferenceOrBuilder */
    public interface FieldReferenceOrBuilder extends MessageLiteOrBuilder {
    }

    /* renamed from: com.google.firestore.v1.StructuredQuery$Filter */
    public static final class Filter extends GeneratedMessageLite<Filter, Builder> implements FilterOrBuilder {
        public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Filter DEFAULT_INSTANCE;
        public static final int FIELD_FILTER_FIELD_NUMBER = 2;
        private static volatile Parser<Filter> PARSER = null;
        public static final int UNARY_FILTER_FIELD_NUMBER = 3;
        private int filterTypeCase_ = 0;
        private Object filterType_;

        /* renamed from: com.google.firestore.v1.StructuredQuery$Filter$Builder */
        public static final class Builder extends GeneratedMessageLite.Builder<Filter, Builder> implements FilterOrBuilder {
            /* synthetic */ Builder(C114241 r1) {
                this();
            }

            /* renamed from: N */
            public Builder mo63885N(CompositeFilter.Builder builder) {
                mo65189C();
                ((Filter) this.f56910c).m78059d0((CompositeFilter) builder.build());
                return this;
            }

            /* renamed from: O */
            public Builder mo63886O(FieldFilter.Builder builder) {
                mo65189C();
                ((Filter) this.f56910c).m78060e0((FieldFilter) builder.build());
                return this;
            }

            /* renamed from: P */
            public Builder mo63887P(UnaryFilter.Builder builder) {
                mo65189C();
                ((Filter) this.f56910c).m78061f0((UnaryFilter) builder.build());
                return this;
            }

            private Builder() {
                super(Filter.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.google.firestore.v1.StructuredQuery$Filter$FilterTypeCase */
        public enum FilterTypeCase {
            COMPOSITE_FILTER(1),
            FIELD_FILTER(2),
            UNARY_FILTER(3),
            FILTERTYPE_NOT_SET(0);
            
            private final int value;

            private FilterTypeCase(int i) {
                this.value = i;
            }

            /* renamed from: b */
            public static FilterTypeCase m78070b(int i) {
                if (i == 0) {
                    return FILTERTYPE_NOT_SET;
                }
                if (i == 1) {
                    return COMPOSITE_FILTER;
                }
                if (i == 2) {
                    return FIELD_FILTER;
                }
                if (i != 3) {
                    return null;
                }
                return UNARY_FILTER;
            }
        }

        static {
            Filter filter = new Filter();
            DEFAULT_INSTANCE = filter;
            GeneratedMessageLite.m80642R(Filter.class, filter);
        }

        private Filter() {
        }

        /* renamed from: Y */
        public static Filter m78057Y() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: c0 */
        public static Builder m78058c0() {
            return (Builder) DEFAULT_INSTANCE.mo65182s();
        }

        /* access modifiers changed from: private */
        /* renamed from: d0 */
        public void m78059d0(CompositeFilter compositeFilter) {
            compositeFilter.getClass();
            this.filterType_ = compositeFilter;
            this.filterTypeCase_ = 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: e0 */
        public void m78060e0(FieldFilter fieldFilter) {
            fieldFilter.getClass();
            this.filterType_ = fieldFilter;
            this.filterTypeCase_ = 2;
        }

        /* access modifiers changed from: private */
        /* renamed from: f0 */
        public void m78061f0(UnaryFilter unaryFilter) {
            unaryFilter.getClass();
            this.filterType_ = unaryFilter;
            this.filterTypeCase_ = 3;
        }

        /* renamed from: X */
        public CompositeFilter mo63881X() {
            if (this.filterTypeCase_ == 1) {
                return (CompositeFilter) this.filterType_;
            }
            return CompositeFilter.m78006Y();
        }

        /* renamed from: Z */
        public FieldFilter mo63882Z() {
            if (this.filterTypeCase_ == 2) {
                return (FieldFilter) this.filterType_;
            }
            return FieldFilter.m78028X();
        }

        /* renamed from: a0 */
        public FilterTypeCase mo63883a0() {
            return FilterTypeCase.m78070b(this.filterTypeCase_);
        }

        /* renamed from: b0 */
        public UnaryFilter mo63884b0() {
            if (this.filterTypeCase_ == 3) {
                return (UnaryFilter) this.filterType_;
            }
            return UnaryFilter.m78087W();
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C114241.f55655a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Filter();
                case 2:
                    return new Builder((C114241) null);
                case 3:
                    return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", CompositeFilter.class, FieldFilter.class, UnaryFilter.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Filter> parser = PARSER;
                    if (parser == null) {
                        synchronized (Filter.class) {
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

    /* renamed from: com.google.firestore.v1.StructuredQuery$FilterOrBuilder */
    public interface FilterOrBuilder extends MessageLiteOrBuilder {
    }

    /* renamed from: com.google.firestore.v1.StructuredQuery$Order */
    public static final class Order extends GeneratedMessageLite<Order, Builder> implements OrderOrBuilder {
        /* access modifiers changed from: private */
        public static final Order DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile Parser<Order> PARSER;
        private int direction_;
        private FieldReference field_;

        /* renamed from: com.google.firestore.v1.StructuredQuery$Order$Builder */
        public static final class Builder extends GeneratedMessageLite.Builder<Order, Builder> implements OrderOrBuilder {
            /* synthetic */ Builder(C114241 r1) {
                this();
            }

            /* renamed from: N */
            public Builder mo63890N(Direction direction) {
                mo65189C();
                ((Order) this.f56910c).m78075Z(direction);
                return this;
            }

            /* renamed from: O */
            public Builder mo63891O(FieldReference fieldReference) {
                mo65189C();
                ((Order) this.f56910c).m78076a0(fieldReference);
                return this;
            }

            private Builder() {
                super(Order.DEFAULT_INSTANCE);
            }
        }

        static {
            Order order = new Order();
            DEFAULT_INSTANCE = order;
            GeneratedMessageLite.m80642R(Order.class, order);
        }

        private Order() {
        }

        /* renamed from: Y */
        public static Builder m78074Y() {
            return (Builder) DEFAULT_INSTANCE.mo65182s();
        }

        /* access modifiers changed from: private */
        /* renamed from: Z */
        public void m78075Z(Direction direction) {
            this.direction_ = direction.mo60052c();
        }

        /* access modifiers changed from: private */
        /* renamed from: a0 */
        public void m78076a0(FieldReference fieldReference) {
            fieldReference.getClass();
            this.field_ = fieldReference;
        }

        /* renamed from: W */
        public Direction mo63888W() {
            Direction b = Direction.m78019b(this.direction_);
            return b == null ? Direction.UNRECOGNIZED : b;
        }

        /* renamed from: X */
        public FieldReference mo63889X() {
            FieldReference fieldReference = this.field_;
            return fieldReference == null ? FieldReference.m78047V() : fieldReference;
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C114241.f55655a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Order();
                case 2:
                    return new Builder((C114241) null);
                case 3:
                    return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"field_", "direction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Order> parser = PARSER;
                    if (parser == null) {
                        synchronized (Order.class) {
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

    /* renamed from: com.google.firestore.v1.StructuredQuery$OrderOrBuilder */
    public interface OrderOrBuilder extends MessageLiteOrBuilder {
    }

    /* renamed from: com.google.firestore.v1.StructuredQuery$Projection */
    public static final class Projection extends GeneratedMessageLite<Projection, Builder> implements ProjectionOrBuilder {
        /* access modifiers changed from: private */
        public static final Projection DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        private static volatile Parser<Projection> PARSER;
        private Internal.ProtobufList<FieldReference> fields_ = GeneratedMessageLite.m80628A();

        /* renamed from: com.google.firestore.v1.StructuredQuery$Projection$Builder */
        public static final class Builder extends GeneratedMessageLite.Builder<Projection, Builder> implements ProjectionOrBuilder {
            /* synthetic */ Builder(C114241 r1) {
                this();
            }

            private Builder() {
                super(Projection.DEFAULT_INSTANCE);
            }
        }

        static {
            Projection projection = new Projection();
            DEFAULT_INSTANCE = projection;
            GeneratedMessageLite.m80642R(Projection.class, projection);
        }

        private Projection() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C114241.f55655a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Projection();
                case 2:
                    return new Builder((C114241) null);
                case 3:
                    return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"fields_", FieldReference.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Projection> parser = PARSER;
                    if (parser == null) {
                        synchronized (Projection.class) {
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

    /* renamed from: com.google.firestore.v1.StructuredQuery$ProjectionOrBuilder */
    public interface ProjectionOrBuilder extends MessageLiteOrBuilder {
    }

    /* renamed from: com.google.firestore.v1.StructuredQuery$UnaryFilter */
    public static final class UnaryFilter extends GeneratedMessageLite<UnaryFilter, Builder> implements UnaryFilterOrBuilder {
        /* access modifiers changed from: private */
        public static final UnaryFilter DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile Parser<UnaryFilter> PARSER;
        private int op_;
        private int operandTypeCase_ = 0;
        private Object operandType_;

        /* renamed from: com.google.firestore.v1.StructuredQuery$UnaryFilter$Builder */
        public static final class Builder extends GeneratedMessageLite.Builder<UnaryFilter, Builder> implements UnaryFilterOrBuilder {
            /* synthetic */ Builder(C114241 r1) {
                this();
            }

            /* renamed from: N */
            public Builder mo63894N(FieldReference fieldReference) {
                mo65189C();
                ((UnaryFilter) this.f56910c).m78089a0(fieldReference);
                return this;
            }

            /* renamed from: O */
            public Builder mo63895O(Operator operator) {
                mo65189C();
                ((UnaryFilter) this.f56910c).m78090b0(operator);
                return this;
            }

            private Builder() {
                super(UnaryFilter.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.google.firestore.v1.StructuredQuery$UnaryFilter$OperandTypeCase */
        public enum OperandTypeCase {
            FIELD(2),
            OPERANDTYPE_NOT_SET(0);
            
            private final int value;

            private OperandTypeCase(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.google.firestore.v1.StructuredQuery$UnaryFilter$Operator */
        public enum Operator implements Internal.EnumLite {
            OPERATOR_UNSPECIFIED(0),
            IS_NAN(2),
            IS_NULL(3),
            IS_NOT_NAN(4),
            IS_NOT_NULL(5),
            UNRECOGNIZED(-1);
            

            /* renamed from: p */
            private static final Internal.EnumLiteMap<Operator> f55698p = null;
            private final int value;

            /* renamed from: com.google.firestore.v1.StructuredQuery$UnaryFilter$Operator$OperatorVerifier */
            private static final class OperatorVerifier implements Internal.EnumVerifier {

                /* renamed from: a */
                static final Internal.EnumVerifier f55700a = null;

                static {
                    f55700a = new OperatorVerifier();
                }

                private OperatorVerifier() {
                }

                /* renamed from: a */
                public boolean mo60055a(int i) {
                    return Operator.m78096b(i) != null;
                }
            }

            static {
                f55698p = new Internal.EnumLiteMap<Operator>() {
                    /* renamed from: b */
                    public Operator mo60053a(int i) {
                        return Operator.m78096b(i);
                    }
                };
            }

            private Operator(int i) {
                this.value = i;
            }

            /* renamed from: b */
            public static Operator m78096b(int i) {
                if (i == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i == 2) {
                    return IS_NAN;
                }
                if (i == 3) {
                    return IS_NULL;
                }
                if (i == 4) {
                    return IS_NOT_NAN;
                }
                if (i != 5) {
                    return null;
                }
                return IS_NOT_NULL;
            }

            /* renamed from: c */
            public final int mo60052c() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            UnaryFilter unaryFilter = new UnaryFilter();
            DEFAULT_INSTANCE = unaryFilter;
            GeneratedMessageLite.m80642R(UnaryFilter.class, unaryFilter);
        }

        private UnaryFilter() {
        }

        /* renamed from: W */
        public static UnaryFilter m78087W() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: Z */
        public static Builder m78088Z() {
            return (Builder) DEFAULT_INSTANCE.mo65182s();
        }

        /* access modifiers changed from: private */
        /* renamed from: a0 */
        public void m78089a0(FieldReference fieldReference) {
            fieldReference.getClass();
            this.operandType_ = fieldReference;
            this.operandTypeCase_ = 2;
        }

        /* access modifiers changed from: private */
        /* renamed from: b0 */
        public void m78090b0(Operator operator) {
            this.op_ = operator.mo60052c();
        }

        /* renamed from: X */
        public FieldReference mo63892X() {
            if (this.operandTypeCase_ == 2) {
                return (FieldReference) this.operandType_;
            }
            return FieldReference.m78047V();
        }

        /* renamed from: Y */
        public Operator mo63893Y() {
            Operator b = Operator.m78096b(this.op_);
            return b == null ? Operator.UNRECOGNIZED : b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C114241.f55655a[methodToInvoke.ordinal()]) {
                case 1:
                    return new UnaryFilter();
                case 2:
                    return new Builder((C114241) null);
                case 3:
                    return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", FieldReference.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<UnaryFilter> parser = PARSER;
                    if (parser == null) {
                        synchronized (UnaryFilter.class) {
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

    /* renamed from: com.google.firestore.v1.StructuredQuery$UnaryFilterOrBuilder */
    public interface UnaryFilterOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        StructuredQuery structuredQuery = new StructuredQuery();
        DEFAULT_INSTANCE = structuredQuery;
        GeneratedMessageLite.m80642R(StructuredQuery.class, structuredQuery);
    }

    private StructuredQuery() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m77961a0(CollectionSelector collectionSelector) {
        collectionSelector.getClass();
        m77963c0();
        this.from_.add(collectionSelector);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m77962b0(Order order) {
        order.getClass();
        m77964d0();
        this.orderBy_.add(order);
    }

    /* renamed from: c0 */
    private void m77963c0() {
        Internal.ProtobufList<CollectionSelector> protobufList = this.from_;
        if (!protobufList.mo64749c1()) {
            this.from_ = GeneratedMessageLite.m80632G(protobufList);
        }
    }

    /* renamed from: d0 */
    private void m77964d0() {
        Internal.ProtobufList<Order> protobufList = this.orderBy_;
        if (!protobufList.mo64749c1()) {
            this.orderBy_ = GeneratedMessageLite.m80632G(protobufList);
        }
    }

    /* renamed from: e0 */
    public static StructuredQuery m77965e0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: r0 */
    public static Builder m77966r0() {
        return (Builder) DEFAULT_INSTANCE.mo65182s();
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public void m77967s0(Cursor cursor) {
        cursor.getClass();
        this.endAt_ = cursor;
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m77968t0(Int32Value int32Value) {
        int32Value.getClass();
        this.limit_ = int32Value;
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public void m77969u0(Cursor cursor) {
        cursor.getClass();
        this.startAt_ = cursor;
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public void m77970v0(Filter filter) {
        filter.getClass();
        this.where_ = filter;
    }

    /* renamed from: f0 */
    public Cursor mo63844f0() {
        Cursor cursor = this.endAt_;
        return cursor == null ? Cursor.m77771Z() : cursor;
    }

    /* renamed from: g0 */
    public CollectionSelector mo63845g0(int i) {
        return this.from_.get(i);
    }

    /* renamed from: h0 */
    public int mo63846h0() {
        return this.from_.size();
    }

    /* renamed from: i0 */
    public Int32Value mo63847i0() {
        Int32Value int32Value = this.limit_;
        return int32Value == null ? Int32Value.m80710V() : int32Value;
    }

    /* renamed from: j0 */
    public Order mo63848j0(int i) {
        return this.orderBy_.get(i);
    }

    /* renamed from: k0 */
    public int mo63849k0() {
        return this.orderBy_.size();
    }

    /* renamed from: l0 */
    public Cursor mo63850l0() {
        Cursor cursor = this.startAt_;
        return cursor == null ? Cursor.m77771Z() : cursor;
    }

    /* renamed from: m0 */
    public Filter mo63851m0() {
        Filter filter = this.where_;
        return filter == null ? Filter.m78057Y() : filter;
    }

    /* renamed from: n0 */
    public boolean mo63852n0() {
        return this.endAt_ != null;
    }

    /* renamed from: o0 */
    public boolean mo63853o0() {
        return this.limit_ != null;
    }

    /* renamed from: p0 */
    public boolean mo63854p0() {
        return this.startAt_ != null;
    }

    /* renamed from: q0 */
    public boolean mo63855q0() {
        return this.where_ != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo60051w(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C114241.f55655a[methodToInvoke.ordinal()]) {
            case 1:
                return new StructuredQuery();
            case 2:
                return new Builder((C114241) null);
            case 3:
                return GeneratedMessageLite.m80633I(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0002\u0000\u0001\t\u0002\u001b\u0003\t\u0004\u001b\u0005\t\u0006\u0004\u0007\t\b\t", new Object[]{"select_", "from_", CollectionSelector.class, "where_", "orderBy_", Order.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<StructuredQuery> parser = PARSER;
                if (parser == null) {
                    synchronized (StructuredQuery.class) {
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
