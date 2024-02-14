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

/* renamed from: kb.q */
/* compiled from: ProtoBuf */
public final class C13508q extends C14495h.C14499d<C13508q> {

    /* renamed from: a */
    private static final C13508q f61717a;

    /* renamed from: c */
    public static C14519q<C13508q> f61718c = new C13509a();
    /* access modifiers changed from: private */
    public int abbreviatedTypeId_;
    /* access modifiers changed from: private */
    public C13508q abbreviatedType_;
    /* access modifiers changed from: private */
    public List<C13510b> argument_;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int className_;
    /* access modifiers changed from: private */
    public int flags_;
    /* access modifiers changed from: private */
    public int flexibleTypeCapabilitiesId_;
    /* access modifiers changed from: private */
    public int flexibleUpperBoundId_;
    /* access modifiers changed from: private */
    public C13508q flexibleUpperBound_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public boolean nullable_;
    /* access modifiers changed from: private */
    public int outerTypeId_;
    /* access modifiers changed from: private */
    public C13508q outerType_;
    /* access modifiers changed from: private */
    public int typeAliasName_;
    /* access modifiers changed from: private */
    public int typeParameterName_;
    /* access modifiers changed from: private */
    public int typeParameter_;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;

    /* renamed from: kb.q$a */
    /* compiled from: ProtoBuf */
    static class C13509a extends C14481b<C13508q> {
        C13509a() {
        }

        /* renamed from: m */
        public C13508q mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13508q(eVar, fVar);
        }
    }

    /* renamed from: kb.q$c */
    /* compiled from: ProtoBuf */
    public static final class C13515c extends C14495h.C14498c<C13508q, C13515c> {

        /* renamed from: A */
        private int f61731A;

        /* renamed from: B */
        private int f61732B;

        /* renamed from: C */
        private int f61733C;

        /* renamed from: D */
        private int f61734D;

        /* renamed from: E */
        private C13508q f61735E = C13508q.m86912b0();

        /* renamed from: F */
        private int f61736F;

        /* renamed from: G */
        private C13508q f61737G = C13508q.m86912b0();

        /* renamed from: H */
        private int f61738H;

        /* renamed from: I */
        private int f61739I;

        /* renamed from: f */
        private int f61740f;

        /* renamed from: g */
        private List<C13510b> f61741g = Collections.emptyList();

        /* renamed from: o */
        private boolean f61742o;

        /* renamed from: p */
        private int f61743p;

        /* renamed from: s */
        private C13508q f61744s = C13508q.m86912b0();

        /* renamed from: z */
        private int f61745z;

        private C13515c() {
            m86999B();
        }

        /* renamed from: A */
        private void m86998A() {
            if ((this.f61740f & 1) != 1) {
                this.f61741g = new ArrayList(this.f61741g);
                this.f61740f |= 1;
            }
        }

        /* renamed from: B */
        private void m86999B() {
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public static C13515c m87001z() {
            return new C13515c();
        }

        /* renamed from: C */
        public C13515c mo71481C(C13508q qVar) {
            if ((this.f61740f & 2048) != 2048 || this.f61737G == C13508q.m86912b0()) {
                this.f61737G = qVar;
            } else {
                this.f61737G = C13508q.m86898F0(this.f61737G).mo71036o(qVar).mo71497x();
            }
            this.f61740f |= 2048;
            return this;
        }

        /* renamed from: D */
        public C13515c mo71482D(C13508q qVar) {
            if ((this.f61740f & 8) != 8 || this.f61744s == C13508q.m86912b0()) {
                this.f61744s = qVar;
            } else {
                this.f61744s = C13508q.m86898F0(this.f61744s).mo71036o(qVar).mo71497x();
            }
            this.f61740f |= 8;
            return this;
        }

        /* renamed from: E */
        public C13515c mo71036o(C13508q qVar) {
            if (qVar == C13508q.m86912b0()) {
                return this;
            }
            if (!qVar.argument_.isEmpty()) {
                if (this.f61741g.isEmpty()) {
                    this.f61741g = qVar.argument_;
                    this.f61740f &= -2;
                } else {
                    m86998A();
                    this.f61741g.addAll(qVar.argument_);
                }
            }
            if (qVar.mo71459x0()) {
                mo71491O(qVar.mo71446i0());
            }
            if (qVar.mo71456u0()) {
                mo71489M(qVar.mo71443e0());
            }
            if (qVar.mo71457v0()) {
                mo71482D(qVar.mo71444f0());
            }
            if (qVar.mo71458w0()) {
                mo71490N(qVar.mo71445g0());
            }
            if (qVar.mo71454s0()) {
                mo71487K(qVar.mo71440a0());
            }
            if (qVar.mo71431B0()) {
                mo71494S(qVar.mo71450n0());
            }
            if (qVar.mo71432C0()) {
                mo71495T(qVar.mo71451o0());
            }
            if (qVar.mo71430A0()) {
                mo71493R(qVar.mo71449m0());
            }
            if (qVar.mo71460y0()) {
                mo71485H(qVar.mo71447k0());
            }
            if (qVar.mo71461z0()) {
                mo71492P(qVar.mo71448l0());
            }
            if (qVar.mo71452q0()) {
                mo71481C(qVar.mo71435V());
            }
            if (qVar.mo71453r0()) {
                mo71486J(qVar.mo71436W());
            }
            if (qVar.mo71455t0()) {
                mo71488L(qVar.mo71442d0());
            }
            mo73389t(qVar);
            mo73388p(mo73387n().mo73309d(qVar.unknownFields));
            return this;
        }

        /* renamed from: G */
        public C13515c mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13508q qVar;
            C13508q qVar2 = null;
            try {
                C13508q c = C13508q.f61718c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                qVar = (C13508q) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                qVar2 = qVar;
            }
            if (qVar2 != null) {
                mo71036o(qVar2);
            }
            throw th;
        }

        /* renamed from: H */
        public C13515c mo71485H(C13508q qVar) {
            if ((this.f61740f & 512) != 512 || this.f61735E == C13508q.m86912b0()) {
                this.f61735E = qVar;
            } else {
                this.f61735E = C13508q.m86898F0(this.f61735E).mo71036o(qVar).mo71497x();
            }
            this.f61740f |= 512;
            return this;
        }

        /* renamed from: J */
        public C13515c mo71486J(int i) {
            this.f61740f |= 4096;
            this.f61738H = i;
            return this;
        }

        /* renamed from: K */
        public C13515c mo71487K(int i) {
            this.f61740f |= 32;
            this.f61731A = i;
            return this;
        }

        /* renamed from: L */
        public C13515c mo71488L(int i) {
            this.f61740f |= 8192;
            this.f61739I = i;
            return this;
        }

        /* renamed from: M */
        public C13515c mo71489M(int i) {
            this.f61740f |= 4;
            this.f61743p = i;
            return this;
        }

        /* renamed from: N */
        public C13515c mo71490N(int i) {
            this.f61740f |= 16;
            this.f61745z = i;
            return this;
        }

        /* renamed from: O */
        public C13515c mo71491O(boolean z) {
            this.f61740f |= 2;
            this.f61742o = z;
            return this;
        }

        /* renamed from: P */
        public C13515c mo71492P(int i) {
            this.f61740f |= 1024;
            this.f61736F = i;
            return this;
        }

        /* renamed from: R */
        public C13515c mo71493R(int i) {
            this.f61740f |= 256;
            this.f61734D = i;
            return this;
        }

        /* renamed from: S */
        public C13515c mo71494S(int i) {
            this.f61740f |= 64;
            this.f61732B = i;
            return this;
        }

        /* renamed from: T */
        public C13515c mo71495T(int i) {
            this.f61740f |= 128;
            this.f61733C = i;
            return this;
        }

        /* renamed from: v */
        public C13508q build() {
            C13508q x = mo71497x();
            if (x.mo71013a()) {
                return x;
            }
            throw C14478a.C14479a.m90815k(x);
        }

        /* renamed from: x */
        public C13508q mo71497x() {
            C13508q qVar = new C13508q((C14495h.C14498c) this);
            int i = this.f61740f;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f61741g = Collections.unmodifiableList(this.f61741g);
                this.f61740f &= -2;
            }
            List unused = qVar.argument_ = this.f61741g;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            boolean unused2 = qVar.nullable_ = this.f61742o;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            int unused3 = qVar.flexibleTypeCapabilitiesId_ = this.f61743p;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            C13508q unused4 = qVar.flexibleUpperBound_ = this.f61744s;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            int unused5 = qVar.flexibleUpperBoundId_ = this.f61745z;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            int unused6 = qVar.className_ = this.f61731A;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            int unused7 = qVar.typeParameter_ = this.f61732B;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            int unused8 = qVar.typeParameterName_ = this.f61733C;
            if ((i & 256) == 256) {
                i2 |= 128;
            }
            int unused9 = qVar.typeAliasName_ = this.f61734D;
            if ((i & 512) == 512) {
                i2 |= 256;
            }
            C13508q unused10 = qVar.outerType_ = this.f61735E;
            if ((i & 1024) == 1024) {
                i2 |= 512;
            }
            int unused11 = qVar.outerTypeId_ = this.f61736F;
            if ((i & 2048) == 2048) {
                i2 |= 1024;
            }
            C13508q unused12 = qVar.abbreviatedType_ = this.f61737G;
            if ((i & 4096) == 4096) {
                i2 |= 2048;
            }
            int unused13 = qVar.abbreviatedTypeId_ = this.f61738H;
            if ((i & 8192) == 8192) {
                i2 |= 4096;
            }
            int unused14 = qVar.flags_ = this.f61739I;
            int unused15 = qVar.bitField0_ = i2;
            return qVar;
        }

        /* renamed from: y */
        public C13515c mo71035l() {
            return m87001z().mo71036o(mo71497x());
        }
    }

    static {
        C13508q qVar = new C13508q(true);
        f61717a = qVar;
        qVar.m86894D0();
    }

    /* renamed from: D0 */
    private void m86894D0() {
        this.argument_ = Collections.emptyList();
        this.nullable_ = false;
        this.flexibleTypeCapabilitiesId_ = 0;
        this.flexibleUpperBound_ = m86912b0();
        this.flexibleUpperBoundId_ = 0;
        this.className_ = 0;
        this.typeParameter_ = 0;
        this.typeParameterName_ = 0;
        this.typeAliasName_ = 0;
        this.outerType_ = m86912b0();
        this.outerTypeId_ = 0;
        this.abbreviatedType_ = m86912b0();
        this.abbreviatedTypeId_ = 0;
        this.flags_ = 0;
    }

    /* renamed from: E0 */
    public static C13515c m86896E0() {
        return C13515c.m87001z();
    }

    /* renamed from: F0 */
    public static C13515c m86898F0(C13508q qVar) {
        return m86896E0().mo71036o(qVar);
    }

    /* renamed from: b0 */
    public static C13508q m86912b0() {
        return f61717a;
    }

    /* renamed from: A0 */
    public boolean mo71430A0() {
        return (this.bitField0_ & 128) == 128;
    }

    /* renamed from: B0 */
    public boolean mo71431B0() {
        return (this.bitField0_ & 32) == 32;
    }

    /* renamed from: C0 */
    public boolean mo71432C0() {
        return (this.bitField0_ & 64) == 64;
    }

    /* renamed from: G0 */
    public C13515c mo71016d() {
        return m86896E0();
    }

    /* renamed from: H0 */
    public C13515c mo71014b() {
        return m86898F0(this);
    }

    /* renamed from: V */
    public C13508q mo71435V() {
        return this.abbreviatedType_;
    }

    /* renamed from: W */
    public int mo71436W() {
        return this.abbreviatedTypeId_;
    }

    /* renamed from: X */
    public C13510b mo71437X(int i) {
        return this.argument_.get(i);
    }

    /* renamed from: Y */
    public int mo71438Y() {
        return this.argument_.size();
    }

    /* renamed from: Z */
    public List<C13510b> mo71439Z() {
        return this.argument_;
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
        for (int i = 0; i < mo71438Y(); i++) {
            if (!mo71437X(i).mo71013a()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        if (mo71457v0() && !mo71444f0().mo71013a()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (mo71460y0() && !mo71447k0().mo71013a()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (mo71452q0() && !mo71435V().mo71013a()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (!mo73391u()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else {
            this.memoizedIsInitialized = 1;
            return true;
        }
    }

    /* renamed from: a0 */
    public int mo71440a0() {
        return this.className_;
    }

    /* renamed from: c */
    public int mo71015c() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int o = (this.bitField0_ & 4096) == 4096 ? CodedOutputStream.m90747o(1, this.flags_) + 0 : 0;
        for (int i2 = 0; i2 < this.argument_.size(); i2++) {
            o += CodedOutputStream.m90751s(2, this.argument_.get(i2));
        }
        if ((this.bitField0_ & 1) == 1) {
            o += CodedOutputStream.m90733a(3, this.nullable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            o += CodedOutputStream.m90747o(4, this.flexibleTypeCapabilitiesId_);
        }
        if ((this.bitField0_ & 4) == 4) {
            o += CodedOutputStream.m90751s(5, this.flexibleUpperBound_);
        }
        if ((this.bitField0_ & 16) == 16) {
            o += CodedOutputStream.m90747o(6, this.className_);
        }
        if ((this.bitField0_ & 32) == 32) {
            o += CodedOutputStream.m90747o(7, this.typeParameter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            o += CodedOutputStream.m90747o(8, this.flexibleUpperBoundId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            o += CodedOutputStream.m90747o(9, this.typeParameterName_);
        }
        if ((this.bitField0_ & 256) == 256) {
            o += CodedOutputStream.m90751s(10, this.outerType_);
        }
        if ((this.bitField0_ & 512) == 512) {
            o += CodedOutputStream.m90747o(11, this.outerTypeId_);
        }
        if ((this.bitField0_ & 128) == 128) {
            o += CodedOutputStream.m90747o(12, this.typeAliasName_);
        }
        if ((this.bitField0_ & 1024) == 1024) {
            o += CodedOutputStream.m90751s(13, this.abbreviatedType_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            o += CodedOutputStream.m90747o(14, this.abbreviatedTypeId_);
        }
        int v = o + mo73392v() + this.unknownFields.size();
        this.memoizedSerializedSize = v;
        return v;
    }

    /* renamed from: c0 */
    public C13508q mo71124e() {
        return f61717a;
    }

    /* renamed from: d0 */
    public int mo71442d0() {
        return this.flags_;
    }

    /* renamed from: e0 */
    public int mo71443e0() {
        return this.flexibleTypeCapabilitiesId_;
    }

    /* renamed from: f */
    public C14519q<C13508q> mo71017f() {
        return f61718c;
    }

    /* renamed from: f0 */
    public C13508q mo71444f0() {
        return this.flexibleUpperBound_;
    }

    /* renamed from: g */
    public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
        mo71015c();
        C14495h.C14499d<MessageType>.a A = mo73390A();
        if ((this.bitField0_ & 4096) == 4096) {
            codedOutputStream.mo73250a0(1, this.flags_);
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            codedOutputStream.mo73253d0(2, this.argument_.get(i));
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo73235L(3, this.nullable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo73250a0(4, this.flexibleTypeCapabilitiesId_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo73253d0(5, this.flexibleUpperBound_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo73250a0(6, this.className_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.mo73250a0(7, this.typeParameter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo73250a0(8, this.flexibleUpperBoundId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            codedOutputStream.mo73250a0(9, this.typeParameterName_);
        }
        if ((this.bitField0_ & 256) == 256) {
            codedOutputStream.mo73253d0(10, this.outerType_);
        }
        if ((this.bitField0_ & 512) == 512) {
            codedOutputStream.mo73250a0(11, this.outerTypeId_);
        }
        if ((this.bitField0_ & 128) == 128) {
            codedOutputStream.mo73250a0(12, this.typeAliasName_);
        }
        if ((this.bitField0_ & 1024) == 1024) {
            codedOutputStream.mo73253d0(13, this.abbreviatedType_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            codedOutputStream.mo73250a0(14, this.abbreviatedTypeId_);
        }
        A.mo73397a(200, codedOutputStream);
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    /* renamed from: g0 */
    public int mo71445g0() {
        return this.flexibleUpperBoundId_;
    }

    /* renamed from: i0 */
    public boolean mo71446i0() {
        return this.nullable_;
    }

    /* renamed from: k0 */
    public C13508q mo71447k0() {
        return this.outerType_;
    }

    /* renamed from: l0 */
    public int mo71448l0() {
        return this.outerTypeId_;
    }

    /* renamed from: m0 */
    public int mo71449m0() {
        return this.typeAliasName_;
    }

    /* renamed from: n0 */
    public int mo71450n0() {
        return this.typeParameter_;
    }

    /* renamed from: o0 */
    public int mo71451o0() {
        return this.typeParameterName_;
    }

    /* renamed from: q0 */
    public boolean mo71452q0() {
        return (this.bitField0_ & 1024) == 1024;
    }

    /* renamed from: r0 */
    public boolean mo71453r0() {
        return (this.bitField0_ & 2048) == 2048;
    }

    /* renamed from: s0 */
    public boolean mo71454s0() {
        return (this.bitField0_ & 16) == 16;
    }

    /* renamed from: t0 */
    public boolean mo71455t0() {
        return (this.bitField0_ & 4096) == 4096;
    }

    /* renamed from: u0 */
    public boolean mo71456u0() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: v0 */
    public boolean mo71457v0() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: w0 */
    public boolean mo71458w0() {
        return (this.bitField0_ & 8) == 8;
    }

    /* renamed from: x0 */
    public boolean mo71459x0() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: y0 */
    public boolean mo71460y0() {
        return (this.bitField0_ & 256) == 256;
    }

    /* renamed from: z0 */
    public boolean mo71461z0() {
        return (this.bitField0_ & 512) == 512;
    }

    /* renamed from: kb.q$b */
    /* compiled from: ProtoBuf */
    public static final class C13510b extends C14495h implements C14518p {

        /* renamed from: a */
        private static final C13510b f61719a;

        /* renamed from: c */
        public static C14519q<C13510b> f61720c = new C13511a();
        /* access modifiers changed from: private */
        public int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public C13513c projection_;
        /* access modifiers changed from: private */
        public int typeId_;
        /* access modifiers changed from: private */
        public C13508q type_;
        /* access modifiers changed from: private */
        public final C14485d unknownFields;

        /* renamed from: kb.q$b$a */
        /* compiled from: ProtoBuf */
        static class C13511a extends C14481b<C13510b> {
            C13511a() {
            }

            /* renamed from: m */
            public C13510b mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
                return new C13510b(eVar, fVar);
            }
        }

        /* renamed from: kb.q$b$b */
        /* compiled from: ProtoBuf */
        public static final class C13512b extends C14495h.C14497b<C13510b, C13512b> implements C14518p {

            /* renamed from: c */
            private int f61721c;

            /* renamed from: d */
            private C13513c f61722d = C13513c.INV;

            /* renamed from: f */
            private C13508q f61723f = C13508q.m86912b0();

            /* renamed from: g */
            private int f61724g;

            private C13512b() {
                m86981v();
            }

            /* access modifiers changed from: private */
            /* renamed from: u */
            public static C13512b m86980u() {
                return new C13512b();
            }

            /* renamed from: v */
            private void m86981v() {
            }

            /* renamed from: A */
            public C13512b mo71472A(C13513c cVar) {
                Objects.requireNonNull(cVar);
                this.f61721c |= 1;
                this.f61722d = cVar;
                return this;
            }

            /* renamed from: B */
            public C13512b mo71473B(int i) {
                this.f61721c |= 4;
                this.f61724g = i;
                return this;
            }

            /* renamed from: r */
            public C13510b build() {
                C13510b s = mo71475s();
                if (s.mo71013a()) {
                    return s;
                }
                throw C14478a.C14479a.m90815k(s);
            }

            /* renamed from: s */
            public C13510b mo71475s() {
                C13510b bVar = new C13510b((C14495h.C14497b) this);
                int i = this.f61721c;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                C13513c unused = bVar.projection_ = this.f61722d;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                C13508q unused2 = bVar.type_ = this.f61723f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                int unused3 = bVar.typeId_ = this.f61724g;
                int unused4 = bVar.bitField0_ = i2;
                return bVar;
            }

            /* renamed from: t */
            public C13512b mo71035l() {
                return m86980u().mo71036o(mo71475s());
            }

            /* renamed from: x */
            public C13512b mo71036o(C13510b bVar) {
                if (bVar == C13510b.m86962y()) {
                    return this;
                }
                if (bVar.mo71465C()) {
                    mo71472A(bVar.mo71470z());
                }
                if (bVar.mo71466D()) {
                    mo71479z(bVar.mo71463A());
                }
                if (bVar.mo71467E()) {
                    mo71473B(bVar.mo71464B());
                }
                mo73388p(mo73387n().mo73309d(bVar.unknownFields));
                return this;
            }

            /* renamed from: y */
            public C13512b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
                C13510b bVar;
                C13510b bVar2 = null;
                try {
                    C13510b c = C13510b.f61720c.mo71021c(eVar, fVar);
                    if (c != null) {
                        mo71036o(c);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    bVar = (C13510b) e.mo73276a();
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
            public C13512b mo71479z(C13508q qVar) {
                if ((this.f61721c & 2) != 2 || this.f61723f == C13508q.m86912b0()) {
                    this.f61723f = qVar;
                } else {
                    this.f61723f = C13508q.m86898F0(this.f61723f).mo71036o(qVar).mo71497x();
                }
                this.f61721c |= 2;
                return this;
            }
        }

        /* renamed from: kb.q$b$c */
        /* compiled from: ProtoBuf */
        public enum C13513c implements C14503i.C14504a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);
            

            /* renamed from: g */
            private static C14503i.C14505b<C13513c> f61729g;
            private final int value;

            /* renamed from: kb.q$b$c$a */
            /* compiled from: ProtoBuf */
            static class C13514a implements C14503i.C14505b<C13513c> {
                C13514a() {
                }

                /* renamed from: b */
                public C13513c mo71085a(int i) {
                    return C13513c.m86994b(i);
                }
            }

            static {
                f61729g = new C13514a();
            }

            private C13513c(int i, int i2) {
                this.value = i2;
            }

            /* renamed from: b */
            public static C13513c m86994b(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i == 2) {
                    return INV;
                }
                if (i != 3) {
                    return null;
                }
                return STAR;
            }

            /* renamed from: c */
            public final int mo71084c() {
                return this.value;
            }
        }

        static {
            C13510b bVar = new C13510b(true);
            f61719a = bVar;
            bVar.m86954F();
        }

        /* renamed from: F */
        private void m86954F() {
            this.projection_ = C13513c.INV;
            this.type_ = C13508q.m86912b0();
            this.typeId_ = 0;
        }

        /* renamed from: G */
        public static C13512b m86955G() {
            return C13512b.m86980u();
        }

        /* renamed from: H */
        public static C13512b m86956H(C13510b bVar) {
            return m86955G().mo71036o(bVar);
        }

        /* renamed from: y */
        public static C13510b m86962y() {
            return f61719a;
        }

        /* renamed from: A */
        public C13508q mo71463A() {
            return this.type_;
        }

        /* renamed from: B */
        public int mo71464B() {
            return this.typeId_;
        }

        /* renamed from: C */
        public boolean mo71465C() {
            return (this.bitField0_ & 1) == 1;
        }

        /* renamed from: D */
        public boolean mo71466D() {
            return (this.bitField0_ & 2) == 2;
        }

        /* renamed from: E */
        public boolean mo71467E() {
            return (this.bitField0_ & 4) == 4;
        }

        /* renamed from: I */
        public C13512b mo71016d() {
            return m86955G();
        }

        /* renamed from: J */
        public C13512b mo71014b() {
            return m86956H(this);
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
            if (!mo71466D() || mo71463A().mo71013a()) {
                this.memoizedIsInitialized = 1;
                return true;
            }
            this.memoizedIsInitialized = 0;
            return false;
        }

        /* renamed from: c */
        public int mo71015c() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.m90740h(1, this.projection_.mo71084c());
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.m90751s(2, this.type_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.m90747o(3, this.typeId_);
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        /* renamed from: f */
        public C14519q<C13510b> mo71017f() {
            return f61720c;
        }

        /* renamed from: g */
        public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
            mo71015c();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo73242S(1, this.projection_.mo71084c());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo73253d0(2, this.type_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.mo73250a0(3, this.typeId_);
            }
            codedOutputStream.mo73258i0(this.unknownFields);
        }

        /* renamed from: z */
        public C13513c mo71470z() {
            return this.projection_;
        }

        private C13510b(C14495h.C14497b bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.mo73387n();
        }

        private C13510b(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = C14485d.f63329a;
        }

        private C13510b(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            m86954F();
            C14485d.C14487b s = C14485d.m90840s();
            CodedOutputStream J = CodedOutputStream.m90731J(s, 1);
            boolean z = false;
            while (!z) {
                try {
                    int K = eVar.mo73335K();
                    if (K != 0) {
                        if (K == 8) {
                            int n = eVar.mo73349n();
                            C13513c b = C13513c.m86994b(n);
                            if (b == null) {
                                J.mo73264o0(K);
                                J.mo73264o0(n);
                            } else {
                                this.bitField0_ |= 1;
                                this.projection_ = b;
                            }
                        } else if (K == 18) {
                            C13515c H0 = (this.bitField0_ & 2) == 2 ? this.type_.mo71014b() : null;
                            C13508q qVar = (C13508q) eVar.mo73356u(C13508q.f61718c, fVar);
                            this.type_ = qVar;
                            if (H0 != null) {
                                H0.mo71036o(qVar);
                                this.type_ = H0.mo71497x();
                            }
                            this.bitField0_ |= 2;
                        } else if (K == 24) {
                            this.bitField0_ |= 4;
                            this.typeId_ = eVar.mo73354s();
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

    private C13508q(C14495h.C14498c<C13508q, ?> cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo73387n();
    }

    private C13508q(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    private C13508q(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        m86894D0();
        C14485d.C14487b s = C14485d.m90840s();
        CodedOutputStream J = CodedOutputStream.m90731J(s, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int K = eVar.mo73335K();
                C13515c cVar = null;
                switch (K) {
                    case 0:
                        z = true;
                        break;
                    case 8:
                        this.bitField0_ |= 4096;
                        this.flags_ = eVar.mo73354s();
                        break;
                    case 18:
                        if (!z2 || !true) {
                            this.argument_ = new ArrayList();
                            z2 |= true;
                        }
                        this.argument_.add(eVar.mo73356u(C13510b.f61720c, fVar));
                        break;
                    case 24:
                        this.bitField0_ |= 1;
                        this.nullable_ = eVar.mo73346k();
                        break;
                    case 32:
                        this.bitField0_ |= 2;
                        this.flexibleTypeCapabilitiesId_ = eVar.mo73354s();
                        break;
                    case 42:
                        cVar = (this.bitField0_ & 4) == 4 ? this.flexibleUpperBound_.mo71014b() : cVar;
                        C13508q qVar = (C13508q) eVar.mo73356u(f61718c, fVar);
                        this.flexibleUpperBound_ = qVar;
                        if (cVar != null) {
                            cVar.mo71036o(qVar);
                            this.flexibleUpperBound_ = cVar.mo71497x();
                        }
                        this.bitField0_ |= 4;
                        break;
                    case 48:
                        this.bitField0_ |= 16;
                        this.className_ = eVar.mo73354s();
                        break;
                    case 56:
                        this.bitField0_ |= 32;
                        this.typeParameter_ = eVar.mo73354s();
                        break;
                    case 64:
                        this.bitField0_ |= 8;
                        this.flexibleUpperBoundId_ = eVar.mo73354s();
                        break;
                    case 72:
                        this.bitField0_ |= 64;
                        this.typeParameterName_ = eVar.mo73354s();
                        break;
                    case 82:
                        cVar = (this.bitField0_ & 256) == 256 ? this.outerType_.mo71014b() : cVar;
                        C13508q qVar2 = (C13508q) eVar.mo73356u(f61718c, fVar);
                        this.outerType_ = qVar2;
                        if (cVar != null) {
                            cVar.mo71036o(qVar2);
                            this.outerType_ = cVar.mo71497x();
                        }
                        this.bitField0_ |= 256;
                        break;
                    case 88:
                        this.bitField0_ |= 512;
                        this.outerTypeId_ = eVar.mo73354s();
                        break;
                    case 96:
                        this.bitField0_ |= 128;
                        this.typeAliasName_ = eVar.mo73354s();
                        break;
                    case 106:
                        cVar = (this.bitField0_ & 1024) == 1024 ? this.abbreviatedType_.mo71014b() : cVar;
                        C13508q qVar3 = (C13508q) eVar.mo73356u(f61718c, fVar);
                        this.abbreviatedType_ = qVar3;
                        if (cVar != null) {
                            cVar.mo71036o(qVar3);
                            this.abbreviatedType_ = cVar.mo71497x();
                        }
                        this.bitField0_ |= 1024;
                        break;
                    case 112:
                        this.bitField0_ |= 2048;
                        this.abbreviatedTypeId_ = eVar.mo73354s();
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
                if (z2 && true) {
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
        if (z2 && true) {
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
