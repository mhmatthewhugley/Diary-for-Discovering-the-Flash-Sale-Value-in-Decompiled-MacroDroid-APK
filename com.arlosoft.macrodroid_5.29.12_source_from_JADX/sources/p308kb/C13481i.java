package p308kb;

import java.io.IOException;
import java.io.InputStream;
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

/* renamed from: kb.i */
/* compiled from: ProtoBuf */
public final class C13481i extends C14495h.C14499d<C13481i> {

    /* renamed from: a */
    private static final C13481i f61637a;

    /* renamed from: c */
    public static C14519q<C13481i> f61638c = new C13482a();
    /* access modifiers changed from: private */
    public int bitField0_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> contextReceiverTypeId_;
    /* access modifiers changed from: private */
    public List<C13508q> contextReceiverType_;
    /* access modifiers changed from: private */
    public C13463e contract_;
    /* access modifiers changed from: private */
    public int flags_;
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
    public List<C13519s> typeParameter_;
    /* access modifiers changed from: private */
    public C13524t typeTable_;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;
    /* access modifiers changed from: private */
    public List<C13527u> valueParameter_;
    /* access modifiers changed from: private */
    public List<Integer> versionRequirement_;

    /* renamed from: kb.i$a */
    /* compiled from: ProtoBuf */
    static class C13482a extends C14481b<C13481i> {
        C13482a() {
        }

        /* renamed from: m */
        public C13481i mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13481i(eVar, fVar);
        }
    }

    /* renamed from: kb.i$b */
    /* compiled from: ProtoBuf */
    public static final class C13483b extends C14495h.C14498c<C13481i, C13483b> {

        /* renamed from: A */
        private List<C13519s> f61639A = Collections.emptyList();

        /* renamed from: B */
        private C13508q f61640B = C13508q.m86912b0();

        /* renamed from: C */
        private int f61641C;

        /* renamed from: D */
        private List<C13508q> f61642D = Collections.emptyList();

        /* renamed from: E */
        private List<Integer> f61643E = Collections.emptyList();

        /* renamed from: F */
        private List<C13527u> f61644F = Collections.emptyList();

        /* renamed from: G */
        private C13524t f61645G = C13524t.m87163y();

        /* renamed from: H */
        private List<Integer> f61646H = Collections.emptyList();

        /* renamed from: I */
        private C13463e f61647I = C13463e.m86311w();

        /* renamed from: f */
        private int f61648f;

        /* renamed from: g */
        private int f61649g = 6;

        /* renamed from: o */
        private int f61650o = 6;

        /* renamed from: p */
        private int f61651p;

        /* renamed from: s */
        private C13508q f61652s = C13508q.m86912b0();

        /* renamed from: z */
        private int f61653z;

        private C13483b() {
            m86559G();
        }

        /* renamed from: A */
        private void m86554A() {
            if ((this.f61648f & 512) != 512) {
                this.f61643E = new ArrayList(this.f61643E);
                this.f61648f |= 512;
            }
        }

        /* renamed from: B */
        private void m86555B() {
            if ((this.f61648f & 256) != 256) {
                this.f61642D = new ArrayList(this.f61642D);
                this.f61648f |= 256;
            }
        }

        /* renamed from: C */
        private void m86556C() {
            if ((this.f61648f & 32) != 32) {
                this.f61639A = new ArrayList(this.f61639A);
                this.f61648f |= 32;
            }
        }

        /* renamed from: D */
        private void m86557D() {
            if ((this.f61648f & 1024) != 1024) {
                this.f61644F = new ArrayList(this.f61644F);
                this.f61648f |= 1024;
            }
        }

        /* renamed from: E */
        private void m86558E() {
            if ((this.f61648f & 4096) != 4096) {
                this.f61646H = new ArrayList(this.f61646H);
                this.f61648f |= 4096;
            }
        }

        /* renamed from: G */
        private void m86559G() {
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public static C13483b m86561z() {
            return new C13483b();
        }

        /* renamed from: H */
        public C13483b mo71284H(C13463e eVar) {
            if ((this.f61648f & 8192) != 8192 || this.f61647I == C13463e.m86311w()) {
                this.f61647I = eVar;
            } else {
                this.f61647I = C13463e.m86307B(this.f61647I).mo71036o(eVar).mo71186s();
            }
            this.f61648f |= 8192;
            return this;
        }

        /* renamed from: J */
        public C13483b mo71036o(C13481i iVar) {
            if (iVar == C13481i.m86512e0()) {
                return this;
            }
            if (iVar.mo71282z0()) {
                mo71290O(iVar.mo71266g0());
            }
            if (iVar.mo71252B0()) {
                mo71292R(iVar.mo71268k0());
            }
            if (iVar.mo71251A0()) {
                mo71291P(iVar.mo71267i0());
            }
            if (iVar.mo71255E0()) {
                mo71288M(iVar.mo71271n0());
            }
            if (iVar.mo71256F0()) {
                mo71294T(iVar.mo71272o0());
            }
            if (!iVar.typeParameter_.isEmpty()) {
                if (this.f61639A.isEmpty()) {
                    this.f61639A = iVar.typeParameter_;
                    this.f61648f &= -33;
                } else {
                    m86556C();
                    this.f61639A.addAll(iVar.typeParameter_);
                }
            }
            if (iVar.mo71253C0()) {
                mo71287L(iVar.mo71269l0());
            }
            if (iVar.mo71254D0()) {
                mo71293S(iVar.mo71270m0());
            }
            if (!iVar.contextReceiverType_.isEmpty()) {
                if (this.f61642D.isEmpty()) {
                    this.f61642D = iVar.contextReceiverType_;
                    this.f61648f &= -257;
                } else {
                    m86555B();
                    this.f61642D.addAll(iVar.contextReceiverType_);
                }
            }
            if (!iVar.contextReceiverTypeId_.isEmpty()) {
                if (this.f61643E.isEmpty()) {
                    this.f61643E = iVar.contextReceiverTypeId_;
                    this.f61648f &= -513;
                } else {
                    m86554A();
                    this.f61643E.addAll(iVar.contextReceiverTypeId_);
                }
            }
            if (!iVar.valueParameter_.isEmpty()) {
                if (this.f61644F.isEmpty()) {
                    this.f61644F = iVar.valueParameter_;
                    this.f61648f &= -1025;
                } else {
                    m86557D();
                    this.f61644F.addAll(iVar.valueParameter_);
                }
            }
            if (iVar.mo71257G0()) {
                mo71289N(iVar.mo71276t0());
            }
            if (!iVar.versionRequirement_.isEmpty()) {
                if (this.f61646H.isEmpty()) {
                    this.f61646H = iVar.versionRequirement_;
                    this.f61648f &= -4097;
                } else {
                    m86558E();
                    this.f61646H.addAll(iVar.versionRequirement_);
                }
            }
            if (iVar.mo71281y0()) {
                mo71284H(iVar.mo71264d0());
            }
            mo73389t(iVar);
            mo73388p(mo73387n().mo73309d(iVar.unknownFields));
            return this;
        }

        /* renamed from: K */
        public C13483b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13481i iVar;
            C13481i iVar2 = null;
            try {
                C13481i c = C13481i.f61638c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                iVar = (C13481i) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                iVar2 = iVar;
            }
            if (iVar2 != null) {
                mo71036o(iVar2);
            }
            throw th;
        }

        /* renamed from: L */
        public C13483b mo71287L(C13508q qVar) {
            if ((this.f61648f & 64) != 64 || this.f61640B == C13508q.m86912b0()) {
                this.f61640B = qVar;
            } else {
                this.f61640B = C13508q.m86898F0(this.f61640B).mo71036o(qVar).mo71497x();
            }
            this.f61648f |= 64;
            return this;
        }

        /* renamed from: M */
        public C13483b mo71288M(C13508q qVar) {
            if ((this.f61648f & 8) != 8 || this.f61652s == C13508q.m86912b0()) {
                this.f61652s = qVar;
            } else {
                this.f61652s = C13508q.m86898F0(this.f61652s).mo71036o(qVar).mo71497x();
            }
            this.f61648f |= 8;
            return this;
        }

        /* renamed from: N */
        public C13483b mo71289N(C13524t tVar) {
            if ((this.f61648f & 2048) != 2048 || this.f61645G == C13524t.m87163y()) {
                this.f61645G = tVar;
            } else {
                this.f61645G = C13524t.m87157G(this.f61645G).mo71036o(tVar).mo71569s();
            }
            this.f61648f |= 2048;
            return this;
        }

        /* renamed from: O */
        public C13483b mo71290O(int i) {
            this.f61648f |= 1;
            this.f61649g = i;
            return this;
        }

        /* renamed from: P */
        public C13483b mo71291P(int i) {
            this.f61648f |= 4;
            this.f61651p = i;
            return this;
        }

        /* renamed from: R */
        public C13483b mo71292R(int i) {
            this.f61648f |= 2;
            this.f61650o = i;
            return this;
        }

        /* renamed from: S */
        public C13483b mo71293S(int i) {
            this.f61648f |= 128;
            this.f61641C = i;
            return this;
        }

        /* renamed from: T */
        public C13483b mo71294T(int i) {
            this.f61648f |= 16;
            this.f61653z = i;
            return this;
        }

        /* renamed from: v */
        public C13481i build() {
            C13481i x = mo71296x();
            if (x.mo71013a()) {
                return x;
            }
            throw C14478a.C14479a.m90815k(x);
        }

        /* renamed from: x */
        public C13481i mo71296x() {
            C13481i iVar = new C13481i((C14495h.C14498c) this);
            int i = this.f61648f;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = iVar.flags_ = this.f61649g;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = iVar.oldFlags_ = this.f61650o;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            int unused3 = iVar.name_ = this.f61651p;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            C13508q unused4 = iVar.returnType_ = this.f61652s;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            int unused5 = iVar.returnTypeId_ = this.f61653z;
            if ((this.f61648f & 32) == 32) {
                this.f61639A = Collections.unmodifiableList(this.f61639A);
                this.f61648f &= -33;
            }
            List unused6 = iVar.typeParameter_ = this.f61639A;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            C13508q unused7 = iVar.receiverType_ = this.f61640B;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            int unused8 = iVar.receiverTypeId_ = this.f61641C;
            if ((this.f61648f & 256) == 256) {
                this.f61642D = Collections.unmodifiableList(this.f61642D);
                this.f61648f &= -257;
            }
            List unused9 = iVar.contextReceiverType_ = this.f61642D;
            if ((this.f61648f & 512) == 512) {
                this.f61643E = Collections.unmodifiableList(this.f61643E);
                this.f61648f &= -513;
            }
            List unused10 = iVar.contextReceiverTypeId_ = this.f61643E;
            if ((this.f61648f & 1024) == 1024) {
                this.f61644F = Collections.unmodifiableList(this.f61644F);
                this.f61648f &= -1025;
            }
            List unused11 = iVar.valueParameter_ = this.f61644F;
            if ((i & 2048) == 2048) {
                i2 |= 128;
            }
            C13524t unused12 = iVar.typeTable_ = this.f61645G;
            if ((this.f61648f & 4096) == 4096) {
                this.f61646H = Collections.unmodifiableList(this.f61646H);
                this.f61648f &= -4097;
            }
            List unused13 = iVar.versionRequirement_ = this.f61646H;
            if ((i & 8192) == 8192) {
                i2 |= 256;
            }
            C13463e unused14 = iVar.contract_ = this.f61647I;
            int unused15 = iVar.bitField0_ = i2;
            return iVar;
        }

        /* renamed from: y */
        public C13483b mo71035l() {
            return m86561z().mo71036o(mo71296x());
        }
    }

    static {
        C13481i iVar = new C13481i(true);
        f61637a = iVar;
        iVar.m86493H0();
    }

    /* renamed from: H0 */
    private void m86493H0() {
        this.flags_ = 6;
        this.oldFlags_ = 6;
        this.name_ = 0;
        this.returnType_ = C13508q.m86912b0();
        this.returnTypeId_ = 0;
        this.typeParameter_ = Collections.emptyList();
        this.receiverType_ = C13508q.m86912b0();
        this.receiverTypeId_ = 0;
        this.contextReceiverType_ = Collections.emptyList();
        this.contextReceiverTypeId_ = Collections.emptyList();
        this.valueParameter_ = Collections.emptyList();
        this.typeTable_ = C13524t.m87163y();
        this.versionRequirement_ = Collections.emptyList();
        this.contract_ = C13463e.m86311w();
    }

    /* renamed from: I0 */
    public static C13483b m86495I0() {
        return C13483b.m86561z();
    }

    /* renamed from: J0 */
    public static C13483b m86497J0(C13481i iVar) {
        return m86495I0().mo71036o(iVar);
    }

    /* renamed from: L0 */
    public static C13481i m86499L0(InputStream inputStream, C14490f fVar) throws IOException {
        return f61638c.mo73285a(inputStream, fVar);
    }

    /* renamed from: e0 */
    public static C13481i m86512e0() {
        return f61637a;
    }

    /* renamed from: A0 */
    public boolean mo71251A0() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: B0 */
    public boolean mo71252B0() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: C0 */
    public boolean mo71253C0() {
        return (this.bitField0_ & 32) == 32;
    }

    /* renamed from: D0 */
    public boolean mo71254D0() {
        return (this.bitField0_ & 64) == 64;
    }

    /* renamed from: E0 */
    public boolean mo71255E0() {
        return (this.bitField0_ & 8) == 8;
    }

    /* renamed from: F0 */
    public boolean mo71256F0() {
        return (this.bitField0_ & 16) == 16;
    }

    /* renamed from: G0 */
    public boolean mo71257G0() {
        return (this.bitField0_ & 128) == 128;
    }

    /* renamed from: K0 */
    public C13483b mo71016d() {
        return m86495I0();
    }

    /* renamed from: M0 */
    public C13483b mo71014b() {
        return m86497J0(this);
    }

    /* renamed from: Z */
    public C13508q mo71260Z(int i) {
        return this.contextReceiverType_.get(i);
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
        if (!mo71251A0()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (!mo71255E0() || mo71271n0().mo71013a()) {
            for (int i = 0; i < mo71274r0(); i++) {
                if (!mo71273q0(i).mo71013a()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (!mo71253C0() || mo71269l0().mo71013a()) {
                for (int i2 = 0; i2 < mo71261a0(); i2++) {
                    if (!mo71260Z(i2).mo71013a()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                for (int i3 = 0; i3 < mo71278v0(); i3++) {
                    if (!mo71277u0(i3).mo71013a()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                if (mo71257G0() && !mo71276t0().mo71013a()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else if (mo71281y0() && !mo71264d0().mo71013a()) {
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
    public int mo71261a0() {
        return this.contextReceiverType_.size();
    }

    /* renamed from: b0 */
    public List<Integer> mo71262b0() {
        return this.contextReceiverTypeId_;
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
        for (int i3 = 0; i3 < this.valueParameter_.size(); i3++) {
            o += CodedOutputStream.m90751s(6, this.valueParameter_.get(i3));
        }
        if ((this.bitField0_ & 16) == 16) {
            o += CodedOutputStream.m90747o(7, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            o += CodedOutputStream.m90747o(8, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            o += CodedOutputStream.m90747o(9, this.flags_);
        }
        for (int i4 = 0; i4 < this.contextReceiverType_.size(); i4++) {
            o += CodedOutputStream.m90751s(10, this.contextReceiverType_.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.contextReceiverTypeId_.size(); i6++) {
            i5 += CodedOutputStream.m90748p(this.contextReceiverTypeId_.get(i6).intValue());
        }
        int i7 = o + i5;
        if (!mo71262b0().isEmpty()) {
            i7 = i7 + 1 + CodedOutputStream.m90748p(i5);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = i5;
        if ((this.bitField0_ & 128) == 128) {
            i7 += CodedOutputStream.m90751s(30, this.typeTable_);
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.versionRequirement_.size(); i9++) {
            i8 += CodedOutputStream.m90748p(this.versionRequirement_.get(i9).intValue());
        }
        int size = i7 + i8 + (mo71280x0().size() * 2);
        if ((this.bitField0_ & 256) == 256) {
            size += CodedOutputStream.m90751s(32, this.contract_);
        }
        int v = size + mo73392v() + this.unknownFields.size();
        this.memoizedSerializedSize = v;
        return v;
    }

    /* renamed from: c0 */
    public List<C13508q> mo71263c0() {
        return this.contextReceiverType_;
    }

    /* renamed from: d0 */
    public C13463e mo71264d0() {
        return this.contract_;
    }

    /* renamed from: f */
    public C14519q<C13481i> mo71017f() {
        return f61638c;
    }

    /* renamed from: f0 */
    public C13481i mo71124e() {
        return f61637a;
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
        for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
            codedOutputStream.mo73253d0(6, this.valueParameter_.get(i2));
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo73250a0(7, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            codedOutputStream.mo73250a0(8, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo73250a0(9, this.flags_);
        }
        for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
            codedOutputStream.mo73253d0(10, this.contextReceiverType_.get(i3));
        }
        if (mo71262b0().size() > 0) {
            codedOutputStream.mo73264o0(90);
            codedOutputStream.mo73264o0(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i4 = 0; i4 < this.contextReceiverTypeId_.size(); i4++) {
            codedOutputStream.mo73251b0(this.contextReceiverTypeId_.get(i4).intValue());
        }
        if ((this.bitField0_ & 128) == 128) {
            codedOutputStream.mo73253d0(30, this.typeTable_);
        }
        for (int i5 = 0; i5 < this.versionRequirement_.size(); i5++) {
            codedOutputStream.mo73250a0(31, this.versionRequirement_.get(i5).intValue());
        }
        if ((this.bitField0_ & 256) == 256) {
            codedOutputStream.mo73253d0(32, this.contract_);
        }
        A.mo73397a(19000, codedOutputStream);
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    /* renamed from: g0 */
    public int mo71266g0() {
        return this.flags_;
    }

    /* renamed from: i0 */
    public int mo71267i0() {
        return this.name_;
    }

    /* renamed from: k0 */
    public int mo71268k0() {
        return this.oldFlags_;
    }

    /* renamed from: l0 */
    public C13508q mo71269l0() {
        return this.receiverType_;
    }

    /* renamed from: m0 */
    public int mo71270m0() {
        return this.receiverTypeId_;
    }

    /* renamed from: n0 */
    public C13508q mo71271n0() {
        return this.returnType_;
    }

    /* renamed from: o0 */
    public int mo71272o0() {
        return this.returnTypeId_;
    }

    /* renamed from: q0 */
    public C13519s mo71273q0(int i) {
        return this.typeParameter_.get(i);
    }

    /* renamed from: r0 */
    public int mo71274r0() {
        return this.typeParameter_.size();
    }

    /* renamed from: s0 */
    public List<C13519s> mo71275s0() {
        return this.typeParameter_;
    }

    /* renamed from: t0 */
    public C13524t mo71276t0() {
        return this.typeTable_;
    }

    /* renamed from: u0 */
    public C13527u mo71277u0(int i) {
        return this.valueParameter_.get(i);
    }

    /* renamed from: v0 */
    public int mo71278v0() {
        return this.valueParameter_.size();
    }

    /* renamed from: w0 */
    public List<C13527u> mo71279w0() {
        return this.valueParameter_;
    }

    /* renamed from: x0 */
    public List<Integer> mo71280x0() {
        return this.versionRequirement_;
    }

    /* renamed from: y0 */
    public boolean mo71281y0() {
        return (this.bitField0_ & 256) == 256;
    }

    /* renamed from: z0 */
    public boolean mo71282z0() {
        return (this.bitField0_ & 1) == 1;
    }

    private C13481i(C14495h.C14498c<C13481i, ?> cVar) {
        super(cVar);
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo73387n();
    }

    private C13481i(boolean z) {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: kb.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: kb.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: kb.t$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: kb.e$b} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v29 */
    /* JADX WARNING: type inference failed for: r11v30 */
    /* JADX WARNING: type inference failed for: r11v31 */
    /* JADX WARNING: type inference failed for: r11v32 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C13481i(kotlin.reflect.jvm.internal.impl.protobuf.C14488e r14, kotlin.reflect.jvm.internal.impl.protobuf.C14490f r15) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r13 = this;
            r13.<init>()
            r0 = -1
            r13.contextReceiverTypeIdMemoizedSerializedSize = r0
            r13.memoizedIsInitialized = r0
            r13.memoizedSerializedSize = r0
            r13.m86493H0()
            kotlin.reflect.jvm.internal.impl.protobuf.d$b r0 = kotlin.reflect.jvm.internal.impl.protobuf.C14485d.m90840s()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m90731J(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0018:
            r5 = 1024(0x400, float:1.435E-42)
            r6 = 4096(0x1000, float:5.74E-42)
            r7 = 512(0x200, float:7.175E-43)
            r8 = 256(0x100, float:3.59E-43)
            r9 = 32
            if (r3 != 0) goto L_0x0272
            int r10 = r14.mo73335K()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r11 = 0
            switch(r10) {
                case 0: goto L_0x0203;
                case 8: goto L_0x01f5;
                case 16: goto L_0x01e7;
                case 26: goto L_0x01be;
                case 34: goto L_0x01a4;
                case 42: goto L_0x017d;
                case 50: goto L_0x0163;
                case 56: goto L_0x0155;
                case 64: goto L_0x0147;
                case 72: goto L_0x013a;
                case 82: goto L_0x0120;
                case 88: goto L_0x0104;
                case 90: goto L_0x00d0;
                case 242: goto L_0x00a7;
                case 248: goto L_0x008b;
                case 250: goto L_0x0058;
                case 258: goto L_0x0032;
                default: goto L_0x002c;
            }     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
        L_0x002c:
            boolean r5 = r13.mo73386q(r14, r2, r15, r10)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0206
        L_0x0032:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 & r8
            if (r10 != r8) goto L_0x003d
            kb.e r10 = r13.contract_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kb.e$b r11 = r10.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
        L_0x003d:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.e> r10 = p308kb.C13463e.f61598c     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.protobuf.o r10 = r14.mo73356u(r10, r15)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kb.e r10 = (p308kb.C13463e) r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.contract_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            if (r11 == 0) goto L_0x0052
            r11.mo71036o(r10)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kb.e r10 = r11.mo71186s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.contract_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
        L_0x0052:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 | r8
            r13.bitField0_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x0058:
            int r10 = r14.mo73326A()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r10 = r14.mo73345j(r10)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r11 = r4 & 4096(0x1000, float:5.74E-42)
            if (r11 == r6) goto L_0x0073
            int r11 = r14.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            if (r11 <= 0) goto L_0x0073
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.versionRequirement_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r4 = r4 | 4096(0x1000, float:5.74E-42)
        L_0x0073:
            int r11 = r14.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            if (r11 <= 0) goto L_0x0087
            java.util.List<java.lang.Integer> r11 = r13.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r12 = r14.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0073
        L_0x0087:
            r14.mo73344i(r10)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x008b:
            r10 = r4 & 4096(0x1000, float:5.74E-42)
            if (r10 == r6) goto L_0x0098
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.versionRequirement_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r4 = r4 | 4096(0x1000, float:5.74E-42)
        L_0x0098:
            java.util.List<java.lang.Integer> r10 = r13.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r11 = r14.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x00a7:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r12 = 128(0x80, float:1.794E-43)
            r10 = r10 & r12
            if (r10 != r12) goto L_0x00b4
            kb.t r10 = r13.typeTable_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kb.t$b r11 = r10.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
        L_0x00b4:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.t> r10 = p308kb.C13524t.f61773c     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.protobuf.o r10 = r14.mo73356u(r10, r15)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kb.t r10 = (p308kb.C13524t) r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.typeTable_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            if (r11 == 0) goto L_0x00c9
            r11.mo71036o(r10)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kb.t r10 = r11.mo71569s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.typeTable_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
        L_0x00c9:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 | r12
            r13.bitField0_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x00d0:
            int r10 = r14.mo73326A()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r10 = r14.mo73345j(r10)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r11 = r4 & 512(0x200, float:7.175E-43)
            if (r11 == r7) goto L_0x00eb
            int r11 = r14.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            if (r11 <= 0) goto L_0x00eb
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.contextReceiverTypeId_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r4 = r4 | 512(0x200, float:7.175E-43)
        L_0x00eb:
            int r11 = r14.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            if (r11 <= 0) goto L_0x00ff
            java.util.List<java.lang.Integer> r11 = r13.contextReceiverTypeId_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r12 = r14.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x00eb
        L_0x00ff:
            r14.mo73344i(r10)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x0104:
            r10 = r4 & 512(0x200, float:7.175E-43)
            if (r10 == r7) goto L_0x0111
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.contextReceiverTypeId_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r4 = r4 | 512(0x200, float:7.175E-43)
        L_0x0111:
            java.util.List<java.lang.Integer> r10 = r13.contextReceiverTypeId_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r11 = r14.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x0120:
            r10 = r4 & 256(0x100, float:3.59E-43)
            if (r10 == r8) goto L_0x012d
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.contextReceiverType_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r4 = r4 | 256(0x100, float:3.59E-43)
        L_0x012d:
            java.util.List<kb.q> r10 = r13.contextReceiverType_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.q> r11 = p308kb.C13508q.f61718c     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.protobuf.o r11 = r14.mo73356u(r11, r15)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x013a:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 | r1
            r13.bitField0_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r10 = r14.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.flags_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x0147:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 | 64
            r13.bitField0_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r10 = r14.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.receiverTypeId_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x0155:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 | 16
            r13.bitField0_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r10 = r14.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.returnTypeId_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x0163:
            r10 = r4 & 1024(0x400, float:1.435E-42)
            if (r10 == r5) goto L_0x0170
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.valueParameter_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r4 = r4 | 1024(0x400, float:1.435E-42)
        L_0x0170:
            java.util.List<kb.u> r10 = r13.valueParameter_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.u> r11 = p308kb.C13527u.f61778c     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.protobuf.o r11 = r14.mo73356u(r11, r15)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x017d:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 & r9
            if (r10 != r9) goto L_0x0188
            kb.q r10 = r13.receiverType_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kb.q$c r11 = r10.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
        L_0x0188:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.q> r10 = p308kb.C13508q.f61718c     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.protobuf.o r10 = r14.mo73356u(r10, r15)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kb.q r10 = (p308kb.C13508q) r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.receiverType_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            if (r11 == 0) goto L_0x019d
            r11.mo71036o(r10)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kb.q r10 = r11.mo71497x()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.receiverType_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
        L_0x019d:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 | r9
            r13.bitField0_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x01a4:
            r10 = r4 & 32
            if (r10 == r9) goto L_0x01b1
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.typeParameter_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r4 = r4 | 32
        L_0x01b1:
            java.util.List<kb.s> r10 = r13.typeParameter_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.s> r11 = p308kb.C13519s.f61759c     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.protobuf.o r11 = r14.mo73356u(r11, r15)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x01be:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r12 = 8
            r10 = r10 & r12
            if (r10 != r12) goto L_0x01cb
            kb.q r10 = r13.returnType_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kb.q$c r11 = r10.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
        L_0x01cb:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.q> r10 = p308kb.C13508q.f61718c     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.protobuf.o r10 = r14.mo73356u(r10, r15)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kb.q r10 = (p308kb.C13508q) r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.returnType_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            if (r11 == 0) goto L_0x01e0
            r11.mo71036o(r10)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kb.q r10 = r11.mo71497x()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.returnType_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
        L_0x01e0:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 | r12
            r13.bitField0_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x01e7:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 | 4
            r13.bitField0_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r10 = r14.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.name_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x01f5:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 | 2
            r13.bitField0_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r10 = r14.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.oldFlags_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x0203:
            r3 = 1
            goto L_0x0018
        L_0x0206:
            if (r5 != 0) goto L_0x0018
            goto L_0x0203
        L_0x0209:
            r14 = move-exception
            goto L_0x0220
        L_0x020b:
            r14 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r15 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0209 }
            java.lang.String r14 = r14.getMessage()     // Catch:{ all -> 0x0209 }
            r15.<init>(r14)     // Catch:{ all -> 0x0209 }
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r14 = r15.mo73277i(r13)     // Catch:{ all -> 0x0209 }
            throw r14     // Catch:{ all -> 0x0209 }
        L_0x021a:
            r14 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r14 = r14.mo73277i(r13)     // Catch:{ all -> 0x0209 }
            throw r14     // Catch:{ all -> 0x0209 }
        L_0x0220:
            r15 = r4 & 32
            if (r15 != r9) goto L_0x022c
            java.util.List<kb.s> r15 = r13.typeParameter_
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.typeParameter_ = r15
        L_0x022c:
            r15 = r4 & 1024(0x400, float:1.435E-42)
            if (r15 != r5) goto L_0x0238
            java.util.List<kb.u> r15 = r13.valueParameter_
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.valueParameter_ = r15
        L_0x0238:
            r15 = r4 & 256(0x100, float:3.59E-43)
            if (r15 != r8) goto L_0x0244
            java.util.List<kb.q> r15 = r13.contextReceiverType_
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.contextReceiverType_ = r15
        L_0x0244:
            r15 = r4 & 512(0x200, float:7.175E-43)
            if (r15 != r7) goto L_0x0250
            java.util.List<java.lang.Integer> r15 = r13.contextReceiverTypeId_
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.contextReceiverTypeId_ = r15
        L_0x0250:
            r15 = r4 & 4096(0x1000, float:5.74E-42)
            if (r15 != r6) goto L_0x025c
            java.util.List<java.lang.Integer> r15 = r13.versionRequirement_
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.versionRequirement_ = r15
        L_0x025c:
            r2.mo73234I()     // Catch:{ IOException -> 0x025f, all -> 0x0266 }
        L_0x025f:
            kotlin.reflect.jvm.internal.impl.protobuf.d r15 = r0.mo73322g()
            r13.unknownFields = r15
            goto L_0x026e
        L_0x0266:
            r14 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.d r15 = r0.mo73322g()
            r13.unknownFields = r15
            throw r14
        L_0x026e:
            r13.mo73385m()
            throw r14
        L_0x0272:
            r14 = r4 & 32
            if (r14 != r9) goto L_0x027e
            java.util.List<kb.s> r14 = r13.typeParameter_
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.typeParameter_ = r14
        L_0x027e:
            r14 = r4 & 1024(0x400, float:1.435E-42)
            if (r14 != r5) goto L_0x028a
            java.util.List<kb.u> r14 = r13.valueParameter_
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.valueParameter_ = r14
        L_0x028a:
            r14 = r4 & 256(0x100, float:3.59E-43)
            if (r14 != r8) goto L_0x0296
            java.util.List<kb.q> r14 = r13.contextReceiverType_
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.contextReceiverType_ = r14
        L_0x0296:
            r14 = r4 & 512(0x200, float:7.175E-43)
            if (r14 != r7) goto L_0x02a2
            java.util.List<java.lang.Integer> r14 = r13.contextReceiverTypeId_
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.contextReceiverTypeId_ = r14
        L_0x02a2:
            r14 = r4 & 4096(0x1000, float:5.74E-42)
            if (r14 != r6) goto L_0x02ae
            java.util.List<java.lang.Integer> r14 = r13.versionRequirement_
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.versionRequirement_ = r14
        L_0x02ae:
            r2.mo73234I()     // Catch:{ IOException -> 0x02b1, all -> 0x02b8 }
        L_0x02b1:
            kotlin.reflect.jvm.internal.impl.protobuf.d r14 = r0.mo73322g()
            r13.unknownFields = r14
            goto L_0x02c0
        L_0x02b8:
            r14 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.d r15 = r0.mo73322g()
            r13.unknownFields = r15
            throw r14
        L_0x02c0:
            r13.mo73385m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p308kb.C13481i.<init>(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
    }
}
