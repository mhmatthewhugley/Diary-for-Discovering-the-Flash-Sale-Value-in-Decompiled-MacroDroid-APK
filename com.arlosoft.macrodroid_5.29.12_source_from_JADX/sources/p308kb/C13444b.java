package p308kb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.protobuf.C14478a;
import kotlin.reflect.jvm.internal.impl.protobuf.C14481b;
import kotlin.reflect.jvm.internal.impl.protobuf.C14485d;
import kotlin.reflect.jvm.internal.impl.protobuf.C14488e;
import kotlin.reflect.jvm.internal.impl.protobuf.C14490f;
import kotlin.reflect.jvm.internal.impl.protobuf.C14495h;
import kotlin.reflect.jvm.internal.impl.protobuf.C14503i;
import kotlin.reflect.jvm.internal.impl.protobuf.C14518p;
import kotlin.reflect.jvm.internal.impl.protobuf.C14519q;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kb.b */
/* compiled from: ProtoBuf */
public final class C13444b extends C14495h implements C14518p {

    /* renamed from: a */
    private static final C13444b f61516a;

    /* renamed from: c */
    public static C14519q<C13444b> f61517c = new C13445a();
    /* access modifiers changed from: private */
    public List<C13446b> argument_;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int id_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;

    /* renamed from: kb.b$a */
    /* compiled from: ProtoBuf */
    static class C13445a extends C14481b<C13444b> {
        C13445a() {
        }

        /* renamed from: m */
        public C13444b mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13444b(eVar, fVar);
        }
    }

    /* renamed from: kb.b$b */
    /* compiled from: ProtoBuf */
    public static final class C13446b extends C14495h implements C14518p {

        /* renamed from: a */
        private static final C13446b f61518a;

        /* renamed from: c */
        public static C14519q<C13446b> f61519c = new C13447a();
        /* access modifiers changed from: private */
        public int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int nameId_;
        /* access modifiers changed from: private */
        public final C14485d unknownFields;
        /* access modifiers changed from: private */
        public C13449c value_;

        /* renamed from: kb.b$b$a */
        /* compiled from: ProtoBuf */
        static class C13447a extends C14481b<C13446b> {
            C13447a() {
            }

            /* renamed from: m */
            public C13446b mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
                return new C13446b(eVar, fVar);
            }
        }

        /* renamed from: kb.b$b$b */
        /* compiled from: ProtoBuf */
        public static final class C13448b extends C14495h.C14497b<C13446b, C13448b> implements C14518p {

            /* renamed from: c */
            private int f61520c;

            /* renamed from: d */
            private int f61521d;

            /* renamed from: f */
            private C13449c f61522f = C13449c.m86026O();

            private C13448b() {
                m86007v();
            }

            /* access modifiers changed from: private */
            /* renamed from: u */
            public static C13448b m86006u() {
                return new C13448b();
            }

            /* renamed from: v */
            private void m86007v() {
            }

            /* renamed from: A */
            public C13448b mo71030A(int i) {
                this.f61520c |= 1;
                this.f61521d = i;
                return this;
            }

            /* renamed from: r */
            public C13446b build() {
                C13446b s = mo71038s();
                if (s.mo71013a()) {
                    return s;
                }
                throw C14478a.C14479a.m90815k(s);
            }

            /* renamed from: s */
            public C13446b mo71038s() {
                C13446b bVar = new C13446b((C14495h.C14497b) this);
                int i = this.f61520c;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = bVar.nameId_ = this.f61521d;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                C13449c unused2 = bVar.value_ = this.f61522f;
                int unused3 = bVar.bitField0_ = i2;
                return bVar;
            }

            /* renamed from: t */
            public C13448b mo71035l() {
                return m86006u().mo71036o(mo71038s());
            }

            /* renamed from: x */
            public C13448b mo71036o(C13446b bVar) {
                if (bVar == C13446b.m85990x()) {
                    return this;
                }
                if (bVar.mo71023A()) {
                    mo71030A(bVar.mo71027y());
                }
                if (bVar.mo71024B()) {
                    mo71042z(bVar.mo71028z());
                }
                mo73388p(mo73387n().mo73309d(bVar.unknownFields));
                return this;
            }

            /* renamed from: y */
            public C13448b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
                C13446b bVar;
                C13446b bVar2 = null;
                try {
                    C13446b c = C13446b.f61519c.mo71021c(eVar, fVar);
                    if (c != null) {
                        mo71036o(c);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    bVar = (C13446b) e.mo73276a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                }
                if (bVar2 != null) {
                    mo71036o(bVar2);
                }
                throw th;
            }

            /* renamed from: z */
            public C13448b mo71042z(C13449c cVar) {
                if ((this.f61520c & 2) != 2 || this.f61522f == C13449c.m86026O()) {
                    this.f61522f = cVar;
                } else {
                    this.f61522f = C13449c.m86029l0(this.f61522f).mo71036o(cVar).mo71080s();
                }
                this.f61520c |= 2;
                return this;
            }
        }

        static {
            C13446b bVar = new C13446b(true);
            f61518a = bVar;
            bVar.m85983C();
        }

        /* renamed from: C */
        private void m85983C() {
            this.nameId_ = 0;
            this.value_ = C13449c.m86026O();
        }

        /* renamed from: D */
        public static C13448b m85984D() {
            return C13448b.m86006u();
        }

        /* renamed from: E */
        public static C13448b m85985E(C13446b bVar) {
            return m85984D().mo71036o(bVar);
        }

        /* renamed from: x */
        public static C13446b m85990x() {
            return f61518a;
        }

        /* renamed from: A */
        public boolean mo71023A() {
            return (this.bitField0_ & 1) == 1;
        }

        /* renamed from: B */
        public boolean mo71024B() {
            return (this.bitField0_ & 2) == 2;
        }

        /* renamed from: F */
        public C13448b mo71016d() {
            return m85984D();
        }

        /* renamed from: G */
        public C13448b mo71014b() {
            return m85985E(this);
        }

        /* renamed from: a */
        public final boolean mo71013a() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo71023A()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!mo71024B()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!mo71028z().mo71013a()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        /* renamed from: c */
        public int mo71015c() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.m90747o(1, this.nameId_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.m90751s(2, this.value_);
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        /* renamed from: f */
        public C14519q<C13446b> mo71017f() {
            return f61519c;
        }

        /* renamed from: g */
        public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
            mo71015c();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo73250a0(1, this.nameId_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo73253d0(2, this.value_);
            }
            codedOutputStream.mo73258i0(this.unknownFields);
        }

        /* renamed from: y */
        public int mo71027y() {
            return this.nameId_;
        }

        /* renamed from: z */
        public C13449c mo71028z() {
            return this.value_;
        }

        /* renamed from: kb.b$b$c */
        /* compiled from: ProtoBuf */
        public static final class C13449c extends C14495h implements C14518p {

            /* renamed from: a */
            private static final C13449c f61523a;

            /* renamed from: c */
            public static C14519q<C13449c> f61524c = new C13450a();
            /* access modifiers changed from: private */
            public C13444b annotation_;
            /* access modifiers changed from: private */
            public int arrayDimensionCount_;
            /* access modifiers changed from: private */
            public List<C13449c> arrayElement_;
            /* access modifiers changed from: private */
            public int bitField0_;
            /* access modifiers changed from: private */
            public int classId_;
            /* access modifiers changed from: private */
            public double doubleValue_;
            /* access modifiers changed from: private */
            public int enumValueId_;
            /* access modifiers changed from: private */
            public int flags_;
            /* access modifiers changed from: private */
            public float floatValue_;
            /* access modifiers changed from: private */
            public long intValue_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            /* access modifiers changed from: private */
            public int stringValue_;
            /* access modifiers changed from: private */
            public C13452c type_;
            /* access modifiers changed from: private */
            public final C14485d unknownFields;

            /* renamed from: kb.b$b$c$a */
            /* compiled from: ProtoBuf */
            static class C13450a extends C14481b<C13449c> {
                C13450a() {
                }

                /* renamed from: m */
                public C13449c mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
                    return new C13449c(eVar, fVar);
                }
            }

            /* renamed from: kb.b$b$c$b */
            /* compiled from: ProtoBuf */
            public static final class C13451b extends C14495h.C14497b<C13449c, C13451b> implements C14518p {

                /* renamed from: A */
                private C13444b f61525A = C13444b.m85959B();

                /* renamed from: B */
                private List<C13449c> f61526B = Collections.emptyList();

                /* renamed from: C */
                private int f61527C;

                /* renamed from: D */
                private int f61528D;

                /* renamed from: c */
                private int f61529c;

                /* renamed from: d */
                private C13452c f61530d = C13452c.BYTE;

                /* renamed from: f */
                private long f61531f;

                /* renamed from: g */
                private float f61532g;

                /* renamed from: o */
                private double f61533o;

                /* renamed from: p */
                private int f61534p;

                /* renamed from: s */
                private int f61535s;

                /* renamed from: z */
                private int f61536z;

                private C13451b() {
                    m86073x();
                }

                /* access modifiers changed from: private */
                /* renamed from: u */
                public static C13451b m86071u() {
                    return new C13451b();
                }

                /* renamed from: v */
                private void m86072v() {
                    if ((this.f61529c & 256) != 256) {
                        this.f61526B = new ArrayList(this.f61526B);
                        this.f61529c |= 256;
                    }
                }

                /* renamed from: x */
                private void m86073x() {
                }

                /* renamed from: A */
                public C13451b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
                    C13449c cVar;
                    C13449c cVar2 = null;
                    try {
                        C13449c c = C13449c.f61524c.mo71021c(eVar, fVar);
                        if (c != null) {
                            mo71036o(c);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        cVar = (C13449c) e.mo73276a();
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        cVar2 = cVar;
                    }
                    if (cVar2 != null) {
                        mo71036o(cVar2);
                    }
                    throw th;
                }

                /* renamed from: B */
                public C13451b mo71070B(int i) {
                    this.f61529c |= 512;
                    this.f61527C = i;
                    return this;
                }

                /* renamed from: C */
                public C13451b mo71071C(int i) {
                    this.f61529c |= 32;
                    this.f61535s = i;
                    return this;
                }

                /* renamed from: D */
                public C13451b mo71072D(double d) {
                    this.f61529c |= 8;
                    this.f61533o = d;
                    return this;
                }

                /* renamed from: E */
                public C13451b mo71073E(int i) {
                    this.f61529c |= 64;
                    this.f61536z = i;
                    return this;
                }

                /* renamed from: G */
                public C13451b mo71074G(int i) {
                    this.f61529c |= 1024;
                    this.f61528D = i;
                    return this;
                }

                /* renamed from: H */
                public C13451b mo71075H(float f) {
                    this.f61529c |= 4;
                    this.f61532g = f;
                    return this;
                }

                /* renamed from: J */
                public C13451b mo71076J(long j) {
                    this.f61529c |= 2;
                    this.f61531f = j;
                    return this;
                }

                /* renamed from: K */
                public C13451b mo71077K(int i) {
                    this.f61529c |= 16;
                    this.f61534p = i;
                    return this;
                }

                /* renamed from: L */
                public C13451b mo71078L(C13452c cVar) {
                    Objects.requireNonNull(cVar);
                    this.f61529c |= 1;
                    this.f61530d = cVar;
                    return this;
                }

                /* renamed from: r */
                public C13449c build() {
                    C13449c s = mo71080s();
                    if (s.mo71013a()) {
                        return s;
                    }
                    throw C14478a.C14479a.m90815k(s);
                }

                /* renamed from: s */
                public C13449c mo71080s() {
                    C13449c cVar = new C13449c((C14495h.C14497b) this);
                    int i = this.f61529c;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    C13452c unused = cVar.type_ = this.f61530d;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    long unused2 = cVar.intValue_ = this.f61531f;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    float unused3 = cVar.floatValue_ = this.f61532g;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    double unused4 = cVar.doubleValue_ = this.f61533o;
                    if ((i & 16) == 16) {
                        i2 |= 16;
                    }
                    int unused5 = cVar.stringValue_ = this.f61534p;
                    if ((i & 32) == 32) {
                        i2 |= 32;
                    }
                    int unused6 = cVar.classId_ = this.f61535s;
                    if ((i & 64) == 64) {
                        i2 |= 64;
                    }
                    int unused7 = cVar.enumValueId_ = this.f61536z;
                    if ((i & 128) == 128) {
                        i2 |= 128;
                    }
                    C13444b unused8 = cVar.annotation_ = this.f61525A;
                    if ((this.f61529c & 256) == 256) {
                        this.f61526B = Collections.unmodifiableList(this.f61526B);
                        this.f61529c &= -257;
                    }
                    List unused9 = cVar.arrayElement_ = this.f61526B;
                    if ((i & 512) == 512) {
                        i2 |= 256;
                    }
                    int unused10 = cVar.arrayDimensionCount_ = this.f61527C;
                    if ((i & 1024) == 1024) {
                        i2 |= 512;
                    }
                    int unused11 = cVar.flags_ = this.f61528D;
                    int unused12 = cVar.bitField0_ = i2;
                    return cVar;
                }

                /* renamed from: t */
                public C13451b mo71035l() {
                    return m86071u().mo71036o(mo71080s());
                }

                /* renamed from: y */
                public C13451b mo71082y(C13444b bVar) {
                    if ((this.f61529c & 128) != 128 || this.f61525A == C13444b.m85959B()) {
                        this.f61525A = bVar;
                    } else {
                        this.f61525A = C13444b.m85962G(this.f61525A).mo71036o(bVar).mo71089s();
                    }
                    this.f61529c |= 128;
                    return this;
                }

                /* renamed from: z */
                public C13451b mo71036o(C13449c cVar) {
                    if (cVar == C13449c.m86026O()) {
                        return this;
                    }
                    if (cVar.mo71065g0()) {
                        mo71078L(cVar.mo71055W());
                    }
                    if (cVar.mo71063e0()) {
                        mo71076J(cVar.mo71053U());
                    }
                    if (cVar.mo71062d0()) {
                        mo71075H(cVar.mo71052T());
                    }
                    if (cVar.mo71059a0()) {
                        mo71072D(cVar.mo71049P());
                    }
                    if (cVar.mo71064f0()) {
                        mo71077K(cVar.mo71054V());
                    }
                    if (cVar.mo71058Z()) {
                        mo71071C(cVar.mo71048N());
                    }
                    if (cVar.mo71060b0()) {
                        mo71073E(cVar.mo71050Q());
                    }
                    if (cVar.mo71056X()) {
                        mo71082y(cVar.mo71043H());
                    }
                    if (!cVar.arrayElement_.isEmpty()) {
                        if (this.f61526B.isEmpty()) {
                            this.f61526B = cVar.arrayElement_;
                            this.f61529c &= -257;
                        } else {
                            m86072v();
                            this.f61526B.addAll(cVar.arrayElement_);
                        }
                    }
                    if (cVar.mo71057Y()) {
                        mo71070B(cVar.mo71044I());
                    }
                    if (cVar.mo71061c0()) {
                        mo71074G(cVar.mo71051R());
                    }
                    mo73388p(mo73387n().mo73309d(cVar.unknownFields));
                    return this;
                }
            }

            /* renamed from: kb.b$b$c$c */
            /* compiled from: ProtoBuf */
            public enum C13452c implements C14503i.C14504a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);
                

                /* renamed from: E */
                private static C14503i.C14505b<C13452c> f61541E;
                private final int value;

                /* renamed from: kb.b$b$c$c$a */
                /* compiled from: ProtoBuf */
                static class C13453a implements C14503i.C14505b<C13452c> {
                    C13453a() {
                    }

                    /* renamed from: b */
                    public C13452c mo71085a(int i) {
                        return C13452c.m86093b(i);
                    }
                }

                static {
                    f61541E = new C13453a();
                }

                private C13452c(int i, int i2) {
                    this.value = i2;
                }

                /* renamed from: b */
                public static C13452c m86093b(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                /* renamed from: c */
                public final int mo71084c() {
                    return this.value;
                }
            }

            static {
                C13449c cVar = new C13449c(true);
                f61523a = cVar;
                cVar.m86027i0();
            }

            /* renamed from: O */
            public static C13449c m86026O() {
                return f61523a;
            }

            /* renamed from: i0 */
            private void m86027i0() {
                this.type_ = C13452c.BYTE;
                this.intValue_ = 0;
                this.floatValue_ = 0.0f;
                this.doubleValue_ = 0.0d;
                this.stringValue_ = 0;
                this.classId_ = 0;
                this.enumValueId_ = 0;
                this.annotation_ = C13444b.m85959B();
                this.arrayElement_ = Collections.emptyList();
                this.arrayDimensionCount_ = 0;
                this.flags_ = 0;
            }

            /* renamed from: k0 */
            public static C13451b m86028k0() {
                return C13451b.m86071u();
            }

            /* renamed from: l0 */
            public static C13451b m86029l0(C13449c cVar) {
                return m86028k0().mo71036o(cVar);
            }

            /* renamed from: H */
            public C13444b mo71043H() {
                return this.annotation_;
            }

            /* renamed from: I */
            public int mo71044I() {
                return this.arrayDimensionCount_;
            }

            /* renamed from: J */
            public C13449c mo71045J(int i) {
                return this.arrayElement_.get(i);
            }

            /* renamed from: L */
            public int mo71046L() {
                return this.arrayElement_.size();
            }

            /* renamed from: M */
            public List<C13449c> mo71047M() {
                return this.arrayElement_;
            }

            /* renamed from: N */
            public int mo71048N() {
                return this.classId_;
            }

            /* renamed from: P */
            public double mo71049P() {
                return this.doubleValue_;
            }

            /* renamed from: Q */
            public int mo71050Q() {
                return this.enumValueId_;
            }

            /* renamed from: R */
            public int mo71051R() {
                return this.flags_;
            }

            /* renamed from: T */
            public float mo71052T() {
                return this.floatValue_;
            }

            /* renamed from: U */
            public long mo71053U() {
                return this.intValue_;
            }

            /* renamed from: V */
            public int mo71054V() {
                return this.stringValue_;
            }

            /* renamed from: W */
            public C13452c mo71055W() {
                return this.type_;
            }

            /* renamed from: X */
            public boolean mo71056X() {
                return (this.bitField0_ & 128) == 128;
            }

            /* renamed from: Y */
            public boolean mo71057Y() {
                return (this.bitField0_ & 256) == 256;
            }

            /* renamed from: Z */
            public boolean mo71058Z() {
                return (this.bitField0_ & 32) == 32;
            }

            /* renamed from: a */
            public final boolean mo71013a() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!mo71056X() || mo71043H().mo71013a()) {
                    for (int i = 0; i < mo71046L(); i++) {
                        if (!mo71045J(i).mo71013a()) {
                            this.memoizedIsInitialized = 0;
                            return false;
                        }
                    }
                    this.memoizedIsInitialized = 1;
                    return true;
                }
                this.memoizedIsInitialized = 0;
                return false;
            }

            /* renamed from: a0 */
            public boolean mo71059a0() {
                return (this.bitField0_ & 8) == 8;
            }

            /* renamed from: b0 */
            public boolean mo71060b0() {
                return (this.bitField0_ & 64) == 64;
            }

            /* renamed from: c */
            public int mo71015c() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int h = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m90740h(1, this.type_.mo71084c()) + 0 : 0;
                if ((this.bitField0_ & 2) == 2) {
                    h += CodedOutputStream.m90723A(2, this.intValue_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    h += CodedOutputStream.m90744l(3, this.floatValue_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    h += CodedOutputStream.m90738f(4, this.doubleValue_);
                }
                if ((this.bitField0_ & 16) == 16) {
                    h += CodedOutputStream.m90747o(5, this.stringValue_);
                }
                if ((this.bitField0_ & 32) == 32) {
                    h += CodedOutputStream.m90747o(6, this.classId_);
                }
                if ((this.bitField0_ & 64) == 64) {
                    h += CodedOutputStream.m90747o(7, this.enumValueId_);
                }
                if ((this.bitField0_ & 128) == 128) {
                    h += CodedOutputStream.m90751s(8, this.annotation_);
                }
                for (int i2 = 0; i2 < this.arrayElement_.size(); i2++) {
                    h += CodedOutputStream.m90751s(9, this.arrayElement_.get(i2));
                }
                if ((this.bitField0_ & 512) == 512) {
                    h += CodedOutputStream.m90747o(10, this.flags_);
                }
                if ((this.bitField0_ & 256) == 256) {
                    h += CodedOutputStream.m90747o(11, this.arrayDimensionCount_);
                }
                int size = h + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            /* renamed from: c0 */
            public boolean mo71061c0() {
                return (this.bitField0_ & 512) == 512;
            }

            /* renamed from: d0 */
            public boolean mo71062d0() {
                return (this.bitField0_ & 4) == 4;
            }

            /* renamed from: e0 */
            public boolean mo71063e0() {
                return (this.bitField0_ & 2) == 2;
            }

            /* renamed from: f */
            public C14519q<C13449c> mo71017f() {
                return f61524c;
            }

            /* renamed from: f0 */
            public boolean mo71064f0() {
                return (this.bitField0_ & 16) == 16;
            }

            /* renamed from: g */
            public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
                mo71015c();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.mo73242S(1, this.type_.mo71084c());
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.mo73269t0(2, this.intValue_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.mo73246W(3, this.floatValue_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    codedOutputStream.mo73240Q(4, this.doubleValue_);
                }
                if ((this.bitField0_ & 16) == 16) {
                    codedOutputStream.mo73250a0(5, this.stringValue_);
                }
                if ((this.bitField0_ & 32) == 32) {
                    codedOutputStream.mo73250a0(6, this.classId_);
                }
                if ((this.bitField0_ & 64) == 64) {
                    codedOutputStream.mo73250a0(7, this.enumValueId_);
                }
                if ((this.bitField0_ & 128) == 128) {
                    codedOutputStream.mo73253d0(8, this.annotation_);
                }
                for (int i = 0; i < this.arrayElement_.size(); i++) {
                    codedOutputStream.mo73253d0(9, this.arrayElement_.get(i));
                }
                if ((this.bitField0_ & 512) == 512) {
                    codedOutputStream.mo73250a0(10, this.flags_);
                }
                if ((this.bitField0_ & 256) == 256) {
                    codedOutputStream.mo73250a0(11, this.arrayDimensionCount_);
                }
                codedOutputStream.mo73258i0(this.unknownFields);
            }

            /* renamed from: g0 */
            public boolean mo71065g0() {
                return (this.bitField0_ & 1) == 1;
            }

            /* renamed from: m0 */
            public C13451b mo71016d() {
                return m86028k0();
            }

            /* renamed from: n0 */
            public C13451b mo71014b() {
                return m86029l0(this);
            }

            private C13449c(C14495h.C14497b bVar) {
                super(bVar);
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = bVar.mo73387n();
            }

            private C13449c(boolean z) {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = C14485d.f63329a;
            }

            private C13449c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                m86027i0();
                C14485d.C14487b s = C14485d.m90840s();
                CodedOutputStream J = CodedOutputStream.m90731J(s, 1);
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int K = eVar.mo73335K();
                        switch (K) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                int n = eVar.mo73349n();
                                C13452c b = C13452c.m86093b(n);
                                if (b != null) {
                                    this.bitField0_ |= 1;
                                    this.type_ = b;
                                    break;
                                } else {
                                    J.mo73264o0(K);
                                    J.mo73264o0(n);
                                    break;
                                }
                            case 16:
                                this.bitField0_ |= 2;
                                this.intValue_ = eVar.mo73332H();
                                break;
                            case 29:
                                this.bitField0_ |= 4;
                                this.floatValue_ = eVar.mo73352q();
                                break;
                            case 33:
                                this.bitField0_ |= 8;
                                this.doubleValue_ = eVar.mo73348m();
                                break;
                            case 40:
                                this.bitField0_ |= 16;
                                this.stringValue_ = eVar.mo73354s();
                                break;
                            case 48:
                                this.bitField0_ |= 32;
                                this.classId_ = eVar.mo73354s();
                                break;
                            case 56:
                                this.bitField0_ |= 64;
                                this.enumValueId_ = eVar.mo73354s();
                                break;
                            case 66:
                                C13454c I = (this.bitField0_ & 128) == 128 ? this.annotation_.mo71014b() : null;
                                C13444b bVar = (C13444b) eVar.mo73356u(C13444b.f61517c, fVar);
                                this.annotation_ = bVar;
                                if (I != null) {
                                    I.mo71036o(bVar);
                                    this.annotation_ = I.mo71089s();
                                }
                                this.bitField0_ |= 128;
                                break;
                            case 74:
                                if (!(z2 & true)) {
                                    this.arrayElement_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.arrayElement_.add(eVar.mo73356u(f61524c, fVar));
                                break;
                            case 80:
                                this.bitField0_ |= 512;
                                this.flags_ = eVar.mo73354s();
                                break;
                            case 88:
                                this.bitField0_ |= 256;
                                this.arrayDimensionCount_ = eVar.mo73354s();
                                break;
                            default:
                                if (mo73386q(eVar, J, fVar, K)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.mo73277i(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).mo73277i(this);
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                        }
                        try {
                            J.mo73234I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = s.mo73322g();
                            throw th2;
                        }
                        this.unknownFields = s.mo73322g();
                        mo73385m();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                }
                try {
                    J.mo73234I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.unknownFields = s.mo73322g();
                    throw th3;
                }
                this.unknownFields = s.mo73322g();
                mo73385m();
            }
        }

        private C13446b(C14495h.C14497b bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.mo73387n();
        }

        private C13446b(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = C14485d.f63329a;
        }

        private C13446b(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            m85983C();
            C14485d.C14487b s = C14485d.m90840s();
            CodedOutputStream J = CodedOutputStream.m90731J(s, 1);
            boolean z = false;
            while (!z) {
                try {
                    int K = eVar.mo73335K();
                    if (K != 0) {
                        if (K == 8) {
                            this.bitField0_ |= 1;
                            this.nameId_ = eVar.mo73354s();
                        } else if (K == 18) {
                            C13449c.C13451b n0 = (this.bitField0_ & 2) == 2 ? this.value_.mo71014b() : null;
                            C13449c cVar = (C13449c) eVar.mo73356u(C13449c.f61524c, fVar);
                            this.value_ = cVar;
                            if (n0 != null) {
                                n0.mo71036o(cVar);
                                this.value_ = n0.mo71080s();
                            }
                            this.bitField0_ |= 2;
                        } else if (!mo73386q(eVar, J, fVar, K)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.mo73277i(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).mo73277i(this);
                } catch (Throwable th) {
                    try {
                        J.mo73234I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = s.mo73322g();
                        throw th2;
                    }
                    this.unknownFields = s.mo73322g();
                    mo73385m();
                    throw th;
                }
            }
            try {
                J.mo73234I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = s.mo73322g();
                throw th3;
            }
            this.unknownFields = s.mo73322g();
            mo73385m();
        }
    }

    /* renamed from: kb.b$c */
    /* compiled from: ProtoBuf */
    public static final class C13454c extends C14495h.C14497b<C13444b, C13454c> implements C14518p {

        /* renamed from: c */
        private int f61552c;

        /* renamed from: d */
        private int f61553d;

        /* renamed from: f */
        private List<C13446b> f61554f = Collections.emptyList();

        private C13454c() {
            m86100x();
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public static C13454c m86098u() {
            return new C13454c();
        }

        /* renamed from: v */
        private void m86099v() {
            if ((this.f61552c & 2) != 2) {
                this.f61554f = new ArrayList(this.f61554f);
                this.f61552c |= 2;
            }
        }

        /* renamed from: x */
        private void m86100x() {
        }

        /* renamed from: A */
        public C13454c mo71087A(int i) {
            this.f61552c |= 1;
            this.f61553d = i;
            return this;
        }

        /* renamed from: r */
        public C13444b build() {
            C13444b s = mo71089s();
            if (s.mo71013a()) {
                return s;
            }
            throw C14478a.C14479a.m90815k(s);
        }

        /* renamed from: s */
        public C13444b mo71089s() {
            C13444b bVar = new C13444b((C14495h.C14497b) this);
            int i = 1;
            if ((this.f61552c & 1) != 1) {
                i = 0;
            }
            int unused = bVar.id_ = this.f61553d;
            if ((this.f61552c & 2) == 2) {
                this.f61554f = Collections.unmodifiableList(this.f61554f);
                this.f61552c &= -3;
            }
            List unused2 = bVar.argument_ = this.f61554f;
            int unused3 = bVar.bitField0_ = i;
            return bVar;
        }

        /* renamed from: t */
        public C13454c mo71035l() {
            return m86098u().mo71036o(mo71089s());
        }

        /* renamed from: y */
        public C13454c mo71036o(C13444b bVar) {
            if (bVar == C13444b.m85959B()) {
                return this;
            }
            if (bVar.mo71010D()) {
                mo71087A(bVar.mo71009C());
            }
            if (!bVar.argument_.isEmpty()) {
                if (this.f61554f.isEmpty()) {
                    this.f61554f = bVar.argument_;
                    this.f61552c &= -3;
                } else {
                    m86099v();
                    this.f61554f.addAll(bVar.argument_);
                }
            }
            mo73388p(mo73387n().mo73309d(bVar.unknownFields));
            return this;
        }

        /* renamed from: z */
        public C13454c mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13444b bVar;
            C13444b bVar2 = null;
            try {
                C13444b c = C13444b.f61517c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                bVar = (C13444b) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                bVar2 = bVar;
            }
            if (bVar2 != null) {
                mo71036o(bVar2);
            }
            throw th;
        }
    }

    static {
        C13444b bVar = new C13444b(true);
        f61516a = bVar;
        bVar.m85960E();
    }

    /* renamed from: B */
    public static C13444b m85959B() {
        return f61516a;
    }

    /* renamed from: E */
    private void m85960E() {
        this.id_ = 0;
        this.argument_ = Collections.emptyList();
    }

    /* renamed from: F */
    public static C13454c m85961F() {
        return C13454c.m86098u();
    }

    /* renamed from: G */
    public static C13454c m85962G(C13444b bVar) {
        return m85961F().mo71036o(bVar);
    }

    /* renamed from: A */
    public List<C13446b> mo71008A() {
        return this.argument_;
    }

    /* renamed from: C */
    public int mo71009C() {
        return this.id_;
    }

    /* renamed from: D */
    public boolean mo71010D() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: H */
    public C13454c mo71016d() {
        return m85961F();
    }

    /* renamed from: I */
    public C13454c mo71014b() {
        return m85962G(this);
    }

    /* renamed from: a */
    public final boolean mo71013a() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!mo71010D()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (int i = 0; i < mo71020z(); i++) {
            if (!mo71019y(i).mo71013a()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    /* renamed from: c */
    public int mo71015c() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int o = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m90747o(1, this.id_) + 0 : 0;
        for (int i2 = 0; i2 < this.argument_.size(); i2++) {
            o += CodedOutputStream.m90751s(2, this.argument_.get(i2));
        }
        int size = o + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    /* renamed from: f */
    public C14519q<C13444b> mo71017f() {
        return f61517c;
    }

    /* renamed from: g */
    public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
        mo71015c();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo73250a0(1, this.id_);
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            codedOutputStream.mo73253d0(2, this.argument_.get(i));
        }
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    /* renamed from: y */
    public C13446b mo71019y(int i) {
        return this.argument_.get(i);
    }

    /* renamed from: z */
    public int mo71020z() {
        return this.argument_.size();
    }

    private C13444b(C14495h.C14497b bVar) {
        super(bVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.mo73387n();
    }

    private C13444b(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    private C13444b(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        m85960E();
        C14485d.C14487b s = C14485d.m90840s();
        CodedOutputStream J = CodedOutputStream.m90731J(s, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int K = eVar.mo73335K();
                if (K != 0) {
                    if (K == 8) {
                        this.bitField0_ |= 1;
                        this.id_ = eVar.mo73354s();
                    } else if (K == 18) {
                        if (!(z2 & true)) {
                            this.argument_ = new ArrayList();
                            z2 |= true;
                        }
                        this.argument_.add(eVar.mo73356u(C13446b.f61519c, fVar));
                    } else if (!mo73386q(eVar, J, fVar, K)) {
                    }
                }
                z = true;
            } catch (InvalidProtocolBufferException e) {
                throw e.mo73277i(this);
            } catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2.getMessage()).mo73277i(this);
            } catch (Throwable th) {
                if (z2 & true) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
                }
                try {
                    J.mo73234I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.unknownFields = s.mo73322g();
                    throw th2;
                }
                this.unknownFields = s.mo73322g();
                mo73385m();
                throw th;
            }
        }
        if (z2 & true) {
            this.argument_ = Collections.unmodifiableList(this.argument_);
        }
        try {
            J.mo73234I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = s.mo73322g();
            throw th3;
        }
        this.unknownFields = s.mo73322g();
        mo73385m();
    }
}
