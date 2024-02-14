package p308kb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.C14478a;
import kotlin.reflect.jvm.internal.impl.protobuf.C14481b;
import kotlin.reflect.jvm.internal.impl.protobuf.C14485d;
import kotlin.reflect.jvm.internal.impl.protobuf.C14488e;
import kotlin.reflect.jvm.internal.impl.protobuf.C14490f;
import kotlin.reflect.jvm.internal.impl.protobuf.C14495h;
import kotlin.reflect.jvm.internal.impl.protobuf.C14519q;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kb.n */
/* compiled from: ProtoBuf */
public final class C13494n extends C14495h.C14499d<C13494n> {

    /* renamed from: a */
    private static final C13494n f61681a;

    /* renamed from: c */
    public static C14519q<C13494n> f61682c = new C13495a();
    /* access modifiers changed from: private */
    public int bitField0_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> contextReceiverTypeId_;
    /* access modifiers changed from: private */
    public List<C13508q> contextReceiverType_;
    /* access modifiers changed from: private */
    public int flags_;
    /* access modifiers changed from: private */
    public int getterFlags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public int name_;
    /* access modifiers changed from: private */
    public int oldFlags_;
    /* access modifiers changed from: private */
    public int receiverTypeId_;
    /* access modifiers changed from: private */
    public C13508q receiverType_;
    /* access modifiers changed from: private */
    public int returnTypeId_;
    /* access modifiers changed from: private */
    public C13508q returnType_;
    /* access modifiers changed from: private */
    public int setterFlags_;
    /* access modifiers changed from: private */
    public C13527u setterValueParameter_;
    /* access modifiers changed from: private */
    public List<C13519s> typeParameter_;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;
    /* access modifiers changed from: private */
    public List<Integer> versionRequirement_;

    /* renamed from: kb.n$a */
    /* compiled from: ProtoBuf */
    static class C13495a extends C14481b<C13494n> {
        C13495a() {
        }

        /* renamed from: m */
        public C13494n mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13494n(eVar, fVar);
        }
    }

    /* renamed from: kb.n$b */
    /* compiled from: ProtoBuf */
    public static final class C13496b extends C14495h.C14498c<C13494n, C13496b> {

        /* renamed from: A */
        private List<C13519s> f61683A = Collections.emptyList();

        /* renamed from: B */
        private C13508q f61684B = C13508q.m86912b0();

        /* renamed from: C */
        private int f61685C;

        /* renamed from: D */
        private List<C13508q> f61686D = Collections.emptyList();

        /* renamed from: E */
        private List<Integer> f61687E = Collections.emptyList();

        /* renamed from: F */
        private C13527u f61688F = C13527u.m87201L();

        /* renamed from: G */
        private int f61689G;

        /* renamed from: H */
        private int f61690H;

        /* renamed from: I */
        private List<Integer> f61691I = Collections.emptyList();

        /* renamed from: f */
        private int f61692f;

        /* renamed from: g */
        private int f61693g = 518;

        /* renamed from: o */
        private int f61694o = 2054;

        /* renamed from: p */
        private int f61695p;

        /* renamed from: s */
        private C13508q f61696s = C13508q.m86912b0();

        /* renamed from: z */
        private int f61697z;

        private C13496b() {
            m86762E();
        }

        /* renamed from: A */
        private void m86758A() {
            if ((this.f61692f & 512) != 512) {
                this.f61687E = new ArrayList(this.f61687E);
                this.f61692f |= 512;
            }
        }

        /* renamed from: B */
        private void m86759B() {
            if ((this.f61692f & 256) != 256) {
                this.f61686D = new ArrayList(this.f61686D);
                this.f61692f |= 256;
            }
        }

        /* renamed from: C */
        private void m86760C() {
            if ((this.f61692f & 32) != 32) {
                this.f61683A = new ArrayList(this.f61683A);
                this.f61692f |= 32;
            }
        }

        /* renamed from: D */
        private void m86761D() {
            if ((this.f61692f & 8192) != 8192) {
                this.f61691I = new ArrayList(this.f61691I);
                this.f61692f |= 8192;
            }
        }

        /* renamed from: E */
        private void m86762E() {
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public static C13496b m86764z() {
            return new C13496b();
        }

        /* renamed from: G */
        public C13496b mo71036o(C13494n nVar) {
            if (nVar == C13494n.m86717c0()) {
                return this;
            }
            if (nVar.mo71371v0()) {
                mo71382M(nVar.mo71357e0());
            }
            if (nVar.mo71374y0()) {
                mo71385P(nVar.mo71360i0());
            }
            if (nVar.mo71373x0()) {
                mo71384O(nVar.mo71359g0());
            }
            if (nVar.mo71346B0()) {
                mo71380K(nVar.mo71363m0());
            }
            if (nVar.mo71347C0()) {
                mo71387S(nVar.mo71364n0());
            }
            if (!nVar.typeParameter_.isEmpty()) {
                if (this.f61683A.isEmpty()) {
                    this.f61683A = nVar.typeParameter_;
                    this.f61692f &= -33;
                } else {
                    m86760C();
                    this.f61683A.addAll(nVar.typeParameter_);
                }
            }
            if (nVar.mo71375z0()) {
                mo71379J(nVar.mo71361k0());
            }
            if (nVar.mo71345A0()) {
                mo71386R(nVar.mo71362l0());
            }
            if (!nVar.contextReceiverType_.isEmpty()) {
                if (this.f61686D.isEmpty()) {
                    this.f61686D = nVar.contextReceiverType_;
                    this.f61692f &= -257;
                } else {
                    m86759B();
                    this.f61686D.addAll(nVar.contextReceiverType_);
                }
            }
            if (!nVar.contextReceiverTypeId_.isEmpty()) {
                if (this.f61687E.isEmpty()) {
                    this.f61687E = nVar.contextReceiverTypeId_;
                    this.f61692f &= -513;
                } else {
                    m86758A();
                    this.f61687E.addAll(nVar.contextReceiverTypeId_);
                }
            }
            if (nVar.mo71349E0()) {
                mo71381L(nVar.mo71366q0());
            }
            if (nVar.mo71372w0()) {
                mo71383N(nVar.mo71358f0());
            }
            if (nVar.mo71348D0()) {
                mo71388T(nVar.mo71365o0());
            }
            if (!nVar.versionRequirement_.isEmpty()) {
                if (this.f61691I.isEmpty()) {
                    this.f61691I = nVar.versionRequirement_;
                    this.f61692f &= -8193;
                } else {
                    m86761D();
                    this.f61691I.addAll(nVar.versionRequirement_);
                }
            }
            mo73389t(nVar);
            mo73388p(mo73387n().mo73309d(nVar.unknownFields));
            return this;
        }

        /* renamed from: H */
        public C13496b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13494n nVar;
            C13494n nVar2 = null;
            try {
                C13494n c = C13494n.f61682c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                nVar = (C13494n) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                nVar2 = nVar;
            }
            if (nVar2 != null) {
                mo71036o(nVar2);
            }
            throw th;
        }

        /* renamed from: J */
        public C13496b mo71379J(C13508q qVar) {
            if ((this.f61692f & 64) != 64 || this.f61684B == C13508q.m86912b0()) {
                this.f61684B = qVar;
            } else {
                this.f61684B = C13508q.m86898F0(this.f61684B).mo71036o(qVar).mo71497x();
            }
            this.f61692f |= 64;
            return this;
        }

        /* renamed from: K */
        public C13496b mo71380K(C13508q qVar) {
            if ((this.f61692f & 8) != 8 || this.f61696s == C13508q.m86912b0()) {
                this.f61696s = qVar;
            } else {
                this.f61696s = C13508q.m86898F0(this.f61696s).mo71036o(qVar).mo71497x();
            }
            this.f61692f |= 8;
            return this;
        }

        /* renamed from: L */
        public C13496b mo71381L(C13527u uVar) {
            if ((this.f61692f & 1024) != 1024 || this.f61688F == C13527u.m87201L()) {
                this.f61688F = uVar;
            } else {
                this.f61688F = C13527u.m87204c0(this.f61688F).mo71036o(uVar).mo71598x();
            }
            this.f61692f |= 1024;
            return this;
        }

        /* renamed from: M */
        public C13496b mo71382M(int i) {
            this.f61692f |= 1;
            this.f61693g = i;
            return this;
        }

        /* renamed from: N */
        public C13496b mo71383N(int i) {
            this.f61692f |= 2048;
            this.f61689G = i;
            return this;
        }

        /* renamed from: O */
        public C13496b mo71384O(int i) {
            this.f61692f |= 4;
            this.f61695p = i;
            return this;
        }

        /* renamed from: P */
        public C13496b mo71385P(int i) {
            this.f61692f |= 2;
            this.f61694o = i;
            return this;
        }

        /* renamed from: R */
        public C13496b mo71386R(int i) {
            this.f61692f |= 128;
            this.f61685C = i;
            return this;
        }

        /* renamed from: S */
        public C13496b mo71387S(int i) {
            this.f61692f |= 16;
            this.f61697z = i;
            return this;
        }

        /* renamed from: T */
        public C13496b mo71388T(int i) {
            this.f61692f |= 4096;
            this.f61690H = i;
            return this;
        }

        /* renamed from: v */
        public C13494n build() {
            C13494n x = mo71390x();
            if (x.mo71013a()) {
                return x;
            }
            throw C14478a.C14479a.m90815k(x);
        }

        /* renamed from: x */
        public C13494n mo71390x() {
            C13494n nVar = new C13494n((C14495h.C14498c) this);
            int i = this.f61692f;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = nVar.flags_ = this.f61693g;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = nVar.oldFlags_ = this.f61694o;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            int unused3 = nVar.name_ = this.f61695p;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            C13508q unused4 = nVar.returnType_ = this.f61696s;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            int unused5 = nVar.returnTypeId_ = this.f61697z;
            if ((this.f61692f & 32) == 32) {
                this.f61683A = Collections.unmodifiableList(this.f61683A);
                this.f61692f &= -33;
            }
            List unused6 = nVar.typeParameter_ = this.f61683A;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            C13508q unused7 = nVar.receiverType_ = this.f61684B;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            int unused8 = nVar.receiverTypeId_ = this.f61685C;
            if ((this.f61692f & 256) == 256) {
                this.f61686D = Collections.unmodifiableList(this.f61686D);
                this.f61692f &= -257;
            }
            List unused9 = nVar.contextReceiverType_ = this.f61686D;
            if ((this.f61692f & 512) == 512) {
                this.f61687E = Collections.unmodifiableList(this.f61687E);
                this.f61692f &= -513;
            }
            List unused10 = nVar.contextReceiverTypeId_ = this.f61687E;
            if ((i & 1024) == 1024) {
                i2 |= 128;
            }
            C13527u unused11 = nVar.setterValueParameter_ = this.f61688F;
            if ((i & 2048) == 2048) {
                i2 |= 256;
            }
            int unused12 = nVar.getterFlags_ = this.f61689G;
            if ((i & 4096) == 4096) {
                i2 |= 512;
            }
            int unused13 = nVar.setterFlags_ = this.f61690H;
            if ((this.f61692f & 8192) == 8192) {
                this.f61691I = Collections.unmodifiableList(this.f61691I);
                this.f61692f &= -8193;
            }
            List unused14 = nVar.versionRequirement_ = this.f61691I;
            int unused15 = nVar.bitField0_ = i2;
            return nVar;
        }

        /* renamed from: y */
        public C13496b mo71035l() {
            return m86764z().mo71036o(mo71390x());
        }
    }

    static {
        C13494n nVar = new C13494n(true);
        f61681a = nVar;
        nVar.m86698F0();
    }

    /* renamed from: F0 */
    private void m86698F0() {
        this.flags_ = 518;
        this.oldFlags_ = 2054;
        this.name_ = 0;
        this.returnType_ = C13508q.m86912b0();
        this.returnTypeId_ = 0;
        this.typeParameter_ = Collections.emptyList();
        this.receiverType_ = C13508q.m86912b0();
        this.receiverTypeId_ = 0;
        this.contextReceiverType_ = Collections.emptyList();
        this.contextReceiverTypeId_ = Collections.emptyList();
        this.setterValueParameter_ = C13527u.m87201L();
        this.getterFlags_ = 0;
        this.setterFlags_ = 0;
        this.versionRequirement_ = Collections.emptyList();
    }

    /* renamed from: G0 */
    public static C13496b m86700G0() {
        return C13496b.m86764z();
    }

    /* renamed from: H0 */
    public static C13496b m86702H0(C13494n nVar) {
        return m86700G0().mo71036o(nVar);
    }

    /* renamed from: c0 */
    public static C13494n m86717c0() {
        return f61681a;
    }

    /* renamed from: A0 */
    public boolean mo71345A0() {
        return (this.bitField0_ & 64) == 64;
    }

    /* renamed from: B0 */
    public boolean mo71346B0() {
        return (this.bitField0_ & 8) == 8;
    }

    /* renamed from: C0 */
    public boolean mo71347C0() {
        return (this.bitField0_ & 16) == 16;
    }

    /* renamed from: D0 */
    public boolean mo71348D0() {
        return (this.bitField0_ & 512) == 512;
    }

    /* renamed from: E0 */
    public boolean mo71349E0() {
        return (this.bitField0_ & 128) == 128;
    }

    /* renamed from: I0 */
    public C13496b mo71016d() {
        return m86700G0();
    }

    /* renamed from: J0 */
    public C13496b mo71014b() {
        return m86702H0(this);
    }

    /* renamed from: Y */
    public C13508q mo71352Y(int i) {
        return this.contextReceiverType_.get(i);
    }

    /* renamed from: Z */
    public int mo71353Z() {
        return this.contextReceiverType_.size();
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
        if (!mo71373x0()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (!mo71346B0() || mo71363m0().mo71013a()) {
            for (int i = 0; i < mo71368s0(); i++) {
                if (!mo71367r0(i).mo71013a()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (!mo71375z0() || mo71361k0().mo71013a()) {
                for (int i2 = 0; i2 < mo71353Z(); i2++) {
                    if (!mo71352Y(i2).mo71013a()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                if (mo71349E0() && !mo71366q0().mo71013a()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else if (!mo73391u()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else {
                    this.memoizedIsInitialized = 1;
                    return true;
                }
            } else {
                this.memoizedIsInitialized = 0;
                return false;
            }
        } else {
            this.memoizedIsInitialized = 0;
            return false;
        }
    }

    /* renamed from: a0 */
    public List<Integer> mo71354a0() {
        return this.contextReceiverTypeId_;
    }

    /* renamed from: b0 */
    public List<C13508q> mo71355b0() {
        return this.contextReceiverType_;
    }

    /* renamed from: c */
    public int mo71015c() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int o = (this.bitField0_ & 2) == 2 ? CodedOutputStream.m90747o(1, this.oldFlags_) + 0 : 0;
        if ((this.bitField0_ & 4) == 4) {
            o += CodedOutputStream.m90747o(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            o += CodedOutputStream.m90751s(3, this.returnType_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            o += CodedOutputStream.m90751s(4, this.typeParameter_.get(i2));
        }
        if ((this.bitField0_ & 32) == 32) {
            o += CodedOutputStream.m90751s(5, this.receiverType_);
        }
        if ((this.bitField0_ & 128) == 128) {
            o += CodedOutputStream.m90751s(6, this.setterValueParameter_);
        }
        if ((this.bitField0_ & 256) == 256) {
            o += CodedOutputStream.m90747o(7, this.getterFlags_);
        }
        if ((this.bitField0_ & 512) == 512) {
            o += CodedOutputStream.m90747o(8, this.setterFlags_);
        }
        if ((this.bitField0_ & 16) == 16) {
            o += CodedOutputStream.m90747o(9, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            o += CodedOutputStream.m90747o(10, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            o += CodedOutputStream.m90747o(11, this.flags_);
        }
        for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
            o += CodedOutputStream.m90751s(12, this.contextReceiverType_.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.contextReceiverTypeId_.size(); i5++) {
            i4 += CodedOutputStream.m90748p(this.contextReceiverTypeId_.get(i5).intValue());
        }
        int i6 = o + i4;
        if (!mo71354a0().isEmpty()) {
            i6 = i6 + 1 + CodedOutputStream.m90748p(i4);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = i4;
        int i7 = 0;
        for (int i8 = 0; i8 < this.versionRequirement_.size(); i8++) {
            i7 += CodedOutputStream.m90748p(this.versionRequirement_.get(i8).intValue());
        }
        int size = i6 + i7 + (mo71370u0().size() * 2) + mo73392v() + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    /* renamed from: d0 */
    public C13494n mo71124e() {
        return f61681a;
    }

    /* renamed from: e0 */
    public int mo71357e0() {
        return this.flags_;
    }

    /* renamed from: f */
    public C14519q<C13494n> mo71017f() {
        return f61682c;
    }

    /* renamed from: f0 */
    public int mo71358f0() {
        return this.getterFlags_;
    }

    /* renamed from: g */
    public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
        mo71015c();
        C14495h.C14499d<MessageType>.a A = mo73390A();
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo73250a0(1, this.oldFlags_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo73250a0(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo73253d0(3, this.returnType_);
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            codedOutputStream.mo73253d0(4, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.mo73253d0(5, this.receiverType_);
        }
        if ((this.bitField0_ & 128) == 128) {
            codedOutputStream.mo73253d0(6, this.setterValueParameter_);
        }
        if ((this.bitField0_ & 256) == 256) {
            codedOutputStream.mo73250a0(7, this.getterFlags_);
        }
        if ((this.bitField0_ & 512) == 512) {
            codedOutputStream.mo73250a0(8, this.setterFlags_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo73250a0(9, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            codedOutputStream.mo73250a0(10, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo73250a0(11, this.flags_);
        }
        for (int i2 = 0; i2 < this.contextReceiverType_.size(); i2++) {
            codedOutputStream.mo73253d0(12, this.contextReceiverType_.get(i2));
        }
        if (mo71354a0().size() > 0) {
            codedOutputStream.mo73264o0(106);
            codedOutputStream.mo73264o0(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i3 = 0; i3 < this.contextReceiverTypeId_.size(); i3++) {
            codedOutputStream.mo73251b0(this.contextReceiverTypeId_.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
            codedOutputStream.mo73250a0(31, this.versionRequirement_.get(i4).intValue());
        }
        A.mo73397a(19000, codedOutputStream);
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    /* renamed from: g0 */
    public int mo71359g0() {
        return this.name_;
    }

    /* renamed from: i0 */
    public int mo71360i0() {
        return this.oldFlags_;
    }

    /* renamed from: k0 */
    public C13508q mo71361k0() {
        return this.receiverType_;
    }

    /* renamed from: l0 */
    public int mo71362l0() {
        return this.receiverTypeId_;
    }

    /* renamed from: m0 */
    public C13508q mo71363m0() {
        return this.returnType_;
    }

    /* renamed from: n0 */
    public int mo71364n0() {
        return this.returnTypeId_;
    }

    /* renamed from: o0 */
    public int mo71365o0() {
        return this.setterFlags_;
    }

    /* renamed from: q0 */
    public C13527u mo71366q0() {
        return this.setterValueParameter_;
    }

    /* renamed from: r0 */
    public C13519s mo71367r0(int i) {
        return this.typeParameter_.get(i);
    }

    /* renamed from: s0 */
    public int mo71368s0() {
        return this.typeParameter_.size();
    }

    /* renamed from: t0 */
    public List<C13519s> mo71369t0() {
        return this.typeParameter_;
    }

    /* renamed from: u0 */
    public List<Integer> mo71370u0() {
        return this.versionRequirement_;
    }

    /* renamed from: v0 */
    public boolean mo71371v0() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: w0 */
    public boolean mo71372w0() {
        return (this.bitField0_ & 256) == 256;
    }

    /* renamed from: x0 */
    public boolean mo71373x0() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: y0 */
    public boolean mo71374y0() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: z0 */
    public boolean mo71375z0() {
        return (this.bitField0_ & 32) == 32;
    }

    private C13494n(C14495h.C14498c<C13494n, ?> cVar) {
        super(cVar);
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo73387n();
    }

    private C13494n(boolean z) {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: kb.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: kb.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: kb.u$b} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v25 */
    /* JADX WARNING: type inference failed for: r10v26 */
    /* JADX WARNING: type inference failed for: r10v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C13494n(kotlin.reflect.jvm.internal.impl.protobuf.C14488e r13, kotlin.reflect.jvm.internal.impl.protobuf.C14490f r14) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r12 = this;
            r12.<init>()
            r0 = -1
            r12.contextReceiverTypeIdMemoizedSerializedSize = r0
            r12.memoizedIsInitialized = r0
            r12.memoizedSerializedSize = r0
            r12.m86698F0()
            kotlin.reflect.jvm.internal.impl.protobuf.d$b r0 = kotlin.reflect.jvm.internal.impl.protobuf.C14485d.m90840s()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m90731J(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0018:
            r5 = 256(0x100, float:3.59E-43)
            r6 = 8192(0x2000, float:1.14794E-41)
            r7 = 32
            r8 = 512(0x200, float:7.175E-43)
            if (r3 != 0) goto L_0x023d
            int r9 = r13.mo73335K()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r10 = 0
            switch(r9) {
                case 0: goto L_0x01da;
                case 8: goto L_0x01cc;
                case 16: goto L_0x01be;
                case 26: goto L_0x0195;
                case 34: goto L_0x017b;
                case 42: goto L_0x0154;
                case 50: goto L_0x012b;
                case 56: goto L_0x011e;
                case 64: goto L_0x0111;
                case 72: goto L_0x0103;
                case 80: goto L_0x00f5;
                case 88: goto L_0x00e8;
                case 98: goto L_0x00ce;
                case 104: goto L_0x00b2;
                case 106: goto L_0x007e;
                case 248: goto L_0x0063;
                case 250: goto L_0x0030;
                default: goto L_0x002a;
            }     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
        L_0x002a:
            boolean r5 = r12.mo73386q(r13, r2, r14, r9)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x01dd
        L_0x0030:
            int r9 = r13.mo73326A()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r9 = r13.mo73345j(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r10 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r10 == r6) goto L_0x004b
            int r10 = r13.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            if (r10 <= 0) goto L_0x004b
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r10.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.versionRequirement_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
        L_0x004b:
            int r10 = r13.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            if (r10 <= 0) goto L_0x005f
            java.util.List<java.lang.Integer> r10 = r12.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r11 = r13.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r10.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x004b
        L_0x005f:
            r13.mo73344i(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x0063:
            r9 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r9 == r6) goto L_0x0070
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.versionRequirement_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
        L_0x0070:
            java.util.List<java.lang.Integer> r9 = r12.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r10 = r13.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9.add(r10)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x007e:
            int r9 = r13.mo73326A()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r9 = r13.mo73345j(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r10 = r4 & 512(0x200, float:7.175E-43)
            if (r10 == r8) goto L_0x0099
            int r10 = r13.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            if (r10 <= 0) goto L_0x0099
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r10.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.contextReceiverTypeId_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r4 = r4 | 512(0x200, float:7.175E-43)
        L_0x0099:
            int r10 = r13.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            if (r10 <= 0) goto L_0x00ad
            java.util.List<java.lang.Integer> r10 = r12.contextReceiverTypeId_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r11 = r13.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r10.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0099
        L_0x00ad:
            r13.mo73344i(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x00b2:
            r9 = r4 & 512(0x200, float:7.175E-43)
            if (r9 == r8) goto L_0x00bf
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.contextReceiverTypeId_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r4 = r4 | 512(0x200, float:7.175E-43)
        L_0x00bf:
            java.util.List<java.lang.Integer> r9 = r12.contextReceiverTypeId_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r10 = r13.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9.add(r10)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x00ce:
            r9 = r4 & 256(0x100, float:3.59E-43)
            if (r9 == r5) goto L_0x00db
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.contextReceiverType_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r4 = r4 | 256(0x100, float:3.59E-43)
        L_0x00db:
            java.util.List<kb.q> r9 = r12.contextReceiverType_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.q> r10 = p308kb.C13508q.f61718c     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r10 = r13.mo73356u(r10, r14)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9.add(r10)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x00e8:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | r1
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r9 = r13.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.flags_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x00f5:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | 64
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r9 = r13.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.receiverTypeId_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x0103:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | 16
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r9 = r13.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.returnTypeId_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x0111:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | r8
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r9 = r13.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.setterFlags_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x011e:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | r5
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r9 = r13.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.getterFlags_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x012b:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r11 = 128(0x80, float:1.794E-43)
            r9 = r9 & r11
            if (r9 != r11) goto L_0x0138
            kb.u r9 = r12.setterValueParameter_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kb.u$b r10 = r9.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
        L_0x0138:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.u> r9 = p308kb.C13527u.f61778c     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r9 = r13.mo73356u(r9, r14)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kb.u r9 = (p308kb.C13527u) r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.setterValueParameter_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            if (r10 == 0) goto L_0x014d
            r10.mo71036o(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kb.u r9 = r10.mo71598x()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.setterValueParameter_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
        L_0x014d:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | r11
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x0154:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 & r7
            if (r9 != r7) goto L_0x015f
            kb.q r9 = r12.receiverType_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kb.q$c r10 = r9.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
        L_0x015f:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.q> r9 = p308kb.C13508q.f61718c     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r9 = r13.mo73356u(r9, r14)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kb.q r9 = (p308kb.C13508q) r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.receiverType_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            if (r10 == 0) goto L_0x0174
            r10.mo71036o(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kb.q r9 = r10.mo71497x()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.receiverType_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
        L_0x0174:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | r7
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x017b:
            r9 = r4 & 32
            if (r9 == r7) goto L_0x0188
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.typeParameter_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r4 = r4 | 32
        L_0x0188:
            java.util.List<kb.s> r9 = r12.typeParameter_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.s> r10 = p308kb.C13519s.f61759c     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r10 = r13.mo73356u(r10, r14)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9.add(r10)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x0195:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r11 = 8
            r9 = r9 & r11
            if (r9 != r11) goto L_0x01a2
            kb.q r9 = r12.returnType_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kb.q$c r10 = r9.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
        L_0x01a2:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.q> r9 = p308kb.C13508q.f61718c     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r9 = r13.mo73356u(r9, r14)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kb.q r9 = (p308kb.C13508q) r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.returnType_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            if (r10 == 0) goto L_0x01b7
            r10.mo71036o(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kb.q r9 = r10.mo71497x()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.returnType_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
        L_0x01b7:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | r11
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x01be:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | 4
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r9 = r13.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.name_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x01cc:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | 2
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r9 = r13.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.oldFlags_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x01da:
            r3 = 1
            goto L_0x0018
        L_0x01dd:
            if (r5 != 0) goto L_0x0018
            goto L_0x01da
        L_0x01e0:
            r13 = move-exception
            goto L_0x01f7
        L_0x01e2:
            r13 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r14 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x01e0 }
            java.lang.String r13 = r13.getMessage()     // Catch:{ all -> 0x01e0 }
            r14.<init>(r13)     // Catch:{ all -> 0x01e0 }
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r13 = r14.mo73277i(r12)     // Catch:{ all -> 0x01e0 }
            throw r13     // Catch:{ all -> 0x01e0 }
        L_0x01f1:
            r13 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r13 = r13.mo73277i(r12)     // Catch:{ all -> 0x01e0 }
            throw r13     // Catch:{ all -> 0x01e0 }
        L_0x01f7:
            r14 = r4 & 32
            if (r14 != r7) goto L_0x0203
            java.util.List<kb.s> r14 = r12.typeParameter_
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.typeParameter_ = r14
        L_0x0203:
            r14 = r4 & 256(0x100, float:3.59E-43)
            if (r14 != r5) goto L_0x020f
            java.util.List<kb.q> r14 = r12.contextReceiverType_
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.contextReceiverType_ = r14
        L_0x020f:
            r14 = r4 & 512(0x200, float:7.175E-43)
            if (r14 != r8) goto L_0x021b
            java.util.List<java.lang.Integer> r14 = r12.contextReceiverTypeId_
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.contextReceiverTypeId_ = r14
        L_0x021b:
            r14 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r14 != r6) goto L_0x0227
            java.util.List<java.lang.Integer> r14 = r12.versionRequirement_
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.versionRequirement_ = r14
        L_0x0227:
            r2.mo73234I()     // Catch:{ IOException -> 0x022a, all -> 0x0231 }
        L_0x022a:
            kotlin.reflect.jvm.internal.impl.protobuf.d r14 = r0.mo73322g()
            r12.unknownFields = r14
            goto L_0x0239
        L_0x0231:
            r13 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.d r14 = r0.mo73322g()
            r12.unknownFields = r14
            throw r13
        L_0x0239:
            r12.mo73385m()
            throw r13
        L_0x023d:
            r13 = r4 & 32
            if (r13 != r7) goto L_0x0249
            java.util.List<kb.s> r13 = r12.typeParameter_
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.typeParameter_ = r13
        L_0x0249:
            r13 = r4 & 256(0x100, float:3.59E-43)
            if (r13 != r5) goto L_0x0255
            java.util.List<kb.q> r13 = r12.contextReceiverType_
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.contextReceiverType_ = r13
        L_0x0255:
            r13 = r4 & 512(0x200, float:7.175E-43)
            if (r13 != r8) goto L_0x0261
            java.util.List<java.lang.Integer> r13 = r12.contextReceiverTypeId_
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.contextReceiverTypeId_ = r13
        L_0x0261:
            r13 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r13 != r6) goto L_0x026d
            java.util.List<java.lang.Integer> r13 = r12.versionRequirement_
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.versionRequirement_ = r13
        L_0x026d:
            r2.mo73234I()     // Catch:{ IOException -> 0x0270, all -> 0x0277 }
        L_0x0270:
            kotlin.reflect.jvm.internal.impl.protobuf.d r13 = r0.mo73322g()
            r12.unknownFields = r13
            goto L_0x027f
        L_0x0277:
            r13 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.d r14 = r0.mo73322g()
            r12.unknownFields = r14
            throw r13
        L_0x027f:
            r12.mo73385m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p308kb.C13494n.<init>(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
    }
}
