package p308kb;

import androidx.recyclerview.widget.ItemTouchHelper;
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
import p308kb.C13508q;

/* renamed from: kb.r */
/* compiled from: ProtoBuf */
public final class C13516r extends C14495h.C14499d<C13516r> {

    /* renamed from: a */
    private static final C13516r f61746a;

    /* renamed from: c */
    public static C14519q<C13516r> f61747c = new C13517a();
    /* access modifiers changed from: private */
    public List<C13444b> annotation_;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int expandedTypeId_;
    /* access modifiers changed from: private */
    public C13508q expandedType_;
    /* access modifiers changed from: private */
    public int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public int name_;
    /* access modifiers changed from: private */
    public List<C13519s> typeParameter_;
    /* access modifiers changed from: private */
    public int underlyingTypeId_;
    /* access modifiers changed from: private */
    public C13508q underlyingType_;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;
    /* access modifiers changed from: private */
    public List<Integer> versionRequirement_;

    /* renamed from: kb.r$a */
    /* compiled from: ProtoBuf */
    static class C13517a extends C14481b<C13516r> {
        C13517a() {
        }

        /* renamed from: m */
        public C13516r mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13516r(eVar, fVar);
        }
    }

    /* renamed from: kb.r$b */
    /* compiled from: ProtoBuf */
    public static final class C13518b extends C14495h.C14498c<C13516r, C13518b> {

        /* renamed from: A */
        private C13508q f61748A = C13508q.m86912b0();

        /* renamed from: B */
        private int f61749B;

        /* renamed from: C */
        private List<C13444b> f61750C = Collections.emptyList();

        /* renamed from: D */
        private List<Integer> f61751D = Collections.emptyList();

        /* renamed from: f */
        private int f61752f;

        /* renamed from: g */
        private int f61753g = 6;

        /* renamed from: o */
        private int f61754o;

        /* renamed from: p */
        private List<C13519s> f61755p = Collections.emptyList();

        /* renamed from: s */
        private C13508q f61756s = C13508q.m86912b0();

        /* renamed from: z */
        private int f61757z;

        private C13518b() {
            m87077D();
        }

        /* renamed from: A */
        private void m87074A() {
            if ((this.f61752f & 128) != 128) {
                this.f61750C = new ArrayList(this.f61750C);
                this.f61752f |= 128;
            }
        }

        /* renamed from: B */
        private void m87075B() {
            if ((this.f61752f & 4) != 4) {
                this.f61755p = new ArrayList(this.f61755p);
                this.f61752f |= 4;
            }
        }

        /* renamed from: C */
        private void m87076C() {
            if ((this.f61752f & 256) != 256) {
                this.f61751D = new ArrayList(this.f61751D);
                this.f61752f |= 256;
            }
        }

        /* renamed from: D */
        private void m87077D() {
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public static C13518b m87079z() {
            return new C13518b();
        }

        /* renamed from: E */
        public C13518b mo71522E(C13508q qVar) {
            if ((this.f61752f & 32) != 32 || this.f61748A == C13508q.m86912b0()) {
                this.f61748A = qVar;
            } else {
                this.f61748A = C13508q.m86898F0(this.f61748A).mo71036o(qVar).mo71497x();
            }
            this.f61752f |= 32;
            return this;
        }

        /* renamed from: G */
        public C13518b mo71036o(C13516r rVar) {
            if (rVar == C13516r.m87038V()) {
                return this;
            }
            if (rVar.mo71515l0()) {
                mo71527L(rVar.mo71505Z());
            }
            if (rVar.mo71516m0()) {
                mo71528M(rVar.mo71506a0());
            }
            if (!rVar.typeParameter_.isEmpty()) {
                if (this.f61755p.isEmpty()) {
                    this.f61755p = rVar.typeParameter_;
                    this.f61752f &= -5;
                } else {
                    m87075B();
                    this.f61755p.addAll(rVar.typeParameter_);
                }
            }
            if (rVar.mo71517n0()) {
                mo71525J(rVar.mo71510e0());
            }
            if (rVar.mo71518o0()) {
                mo71529N(rVar.mo71511f0());
            }
            if (rVar.mo71513i0()) {
                mo71522E(rVar.mo71503X());
            }
            if (rVar.mo71514k0()) {
                mo71526K(rVar.mo71504Y());
            }
            if (!rVar.annotation_.isEmpty()) {
                if (this.f61750C.isEmpty()) {
                    this.f61750C = rVar.annotation_;
                    this.f61752f &= -129;
                } else {
                    m87074A();
                    this.f61750C.addAll(rVar.annotation_);
                }
            }
            if (!rVar.versionRequirement_.isEmpty()) {
                if (this.f61751D.isEmpty()) {
                    this.f61751D = rVar.versionRequirement_;
                    this.f61752f &= -257;
                } else {
                    m87076C();
                    this.f61751D.addAll(rVar.versionRequirement_);
                }
            }
            mo73389t(rVar);
            mo73388p(mo73387n().mo73309d(rVar.unknownFields));
            return this;
        }

        /* renamed from: H */
        public C13518b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13516r rVar;
            C13516r rVar2 = null;
            try {
                C13516r c = C13516r.f61747c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                rVar = (C13516r) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                rVar2 = rVar;
            }
            if (rVar2 != null) {
                mo71036o(rVar2);
            }
            throw th;
        }

        /* renamed from: J */
        public C13518b mo71525J(C13508q qVar) {
            if ((this.f61752f & 8) != 8 || this.f61756s == C13508q.m86912b0()) {
                this.f61756s = qVar;
            } else {
                this.f61756s = C13508q.m86898F0(this.f61756s).mo71036o(qVar).mo71497x();
            }
            this.f61752f |= 8;
            return this;
        }

        /* renamed from: K */
        public C13518b mo71526K(int i) {
            this.f61752f |= 64;
            this.f61749B = i;
            return this;
        }

        /* renamed from: L */
        public C13518b mo71527L(int i) {
            this.f61752f |= 1;
            this.f61753g = i;
            return this;
        }

        /* renamed from: M */
        public C13518b mo71528M(int i) {
            this.f61752f |= 2;
            this.f61754o = i;
            return this;
        }

        /* renamed from: N */
        public C13518b mo71529N(int i) {
            this.f61752f |= 16;
            this.f61757z = i;
            return this;
        }

        /* renamed from: v */
        public C13516r build() {
            C13516r x = mo71531x();
            if (x.mo71013a()) {
                return x;
            }
            throw C14478a.C14479a.m90815k(x);
        }

        /* renamed from: x */
        public C13516r mo71531x() {
            C13516r rVar = new C13516r((C14495h.C14498c) this);
            int i = this.f61752f;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = rVar.flags_ = this.f61753g;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = rVar.name_ = this.f61754o;
            if ((this.f61752f & 4) == 4) {
                this.f61755p = Collections.unmodifiableList(this.f61755p);
                this.f61752f &= -5;
            }
            List unused3 = rVar.typeParameter_ = this.f61755p;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            C13508q unused4 = rVar.underlyingType_ = this.f61756s;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            int unused5 = rVar.underlyingTypeId_ = this.f61757z;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            C13508q unused6 = rVar.expandedType_ = this.f61748A;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            int unused7 = rVar.expandedTypeId_ = this.f61749B;
            if ((this.f61752f & 128) == 128) {
                this.f61750C = Collections.unmodifiableList(this.f61750C);
                this.f61752f &= -129;
            }
            List unused8 = rVar.annotation_ = this.f61750C;
            if ((this.f61752f & 256) == 256) {
                this.f61751D = Collections.unmodifiableList(this.f61751D);
                this.f61752f &= -257;
            }
            List unused9 = rVar.versionRequirement_ = this.f61751D;
            int unused10 = rVar.bitField0_ = i2;
            return rVar;
        }

        /* renamed from: y */
        public C13518b mo71035l() {
            return m87079z().mo71036o(mo71531x());
        }
    }

    static {
        C13516r rVar = new C13516r(true);
        f61746a = rVar;
        rVar.m87039q0();
    }

    /* renamed from: V */
    public static C13516r m87038V() {
        return f61746a;
    }

    /* renamed from: q0 */
    private void m87039q0() {
        this.flags_ = 6;
        this.name_ = 0;
        this.typeParameter_ = Collections.emptyList();
        this.underlyingType_ = C13508q.m86912b0();
        this.underlyingTypeId_ = 0;
        this.expandedType_ = C13508q.m86912b0();
        this.expandedTypeId_ = 0;
        this.annotation_ = Collections.emptyList();
        this.versionRequirement_ = Collections.emptyList();
    }

    /* renamed from: r0 */
    public static C13518b m87040r0() {
        return C13518b.m87079z();
    }

    /* renamed from: s0 */
    public static C13518b m87041s0(C13516r rVar) {
        return m87040r0().mo71036o(rVar);
    }

    /* renamed from: u0 */
    public static C13516r m87042u0(InputStream inputStream, C14490f fVar) throws IOException {
        return f61747c.mo73287d(inputStream, fVar);
    }

    /* renamed from: R */
    public C13444b mo71499R(int i) {
        return this.annotation_.get(i);
    }

    /* renamed from: T */
    public int mo71500T() {
        return this.annotation_.size();
    }

    /* renamed from: U */
    public List<C13444b> mo71501U() {
        return this.annotation_;
    }

    /* renamed from: W */
    public C13516r mo71124e() {
        return f61746a;
    }

    /* renamed from: X */
    public C13508q mo71503X() {
        return this.expandedType_;
    }

    /* renamed from: Y */
    public int mo71504Y() {
        return this.expandedTypeId_;
    }

    /* renamed from: Z */
    public int mo71505Z() {
        return this.flags_;
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
        if (!mo71516m0()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (int i = 0; i < mo71508c0(); i++) {
            if (!mo71507b0(i).mo71013a()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        if (mo71517n0() && !mo71510e0().mo71013a()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (!mo71513i0() || mo71503X().mo71013a()) {
            for (int i2 = 0; i2 < mo71500T(); i2++) {
                if (!mo71499R(i2).mo71013a()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (!mo73391u()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        } else {
            this.memoizedIsInitialized = 0;
            return false;
        }
    }

    /* renamed from: a0 */
    public int mo71506a0() {
        return this.name_;
    }

    /* renamed from: b0 */
    public C13519s mo71507b0(int i) {
        return this.typeParameter_.get(i);
    }

    /* renamed from: c */
    public int mo71015c() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int o = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m90747o(1, this.flags_) + 0 : 0;
        if ((this.bitField0_ & 2) == 2) {
            o += CodedOutputStream.m90747o(2, this.name_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            o += CodedOutputStream.m90751s(3, this.typeParameter_.get(i2));
        }
        if ((this.bitField0_ & 4) == 4) {
            o += CodedOutputStream.m90751s(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            o += CodedOutputStream.m90747o(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            o += CodedOutputStream.m90751s(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            o += CodedOutputStream.m90747o(7, this.expandedTypeId_);
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            o += CodedOutputStream.m90751s(8, this.annotation_.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.versionRequirement_.size(); i5++) {
            i4 += CodedOutputStream.m90748p(this.versionRequirement_.get(i5).intValue());
        }
        int size = o + i4 + (mo71512g0().size() * 2) + mo73392v() + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    /* renamed from: c0 */
    public int mo71508c0() {
        return this.typeParameter_.size();
    }

    /* renamed from: d0 */
    public List<C13519s> mo71509d0() {
        return this.typeParameter_;
    }

    /* renamed from: e0 */
    public C13508q mo71510e0() {
        return this.underlyingType_;
    }

    /* renamed from: f */
    public C14519q<C13516r> mo71017f() {
        return f61747c;
    }

    /* renamed from: f0 */
    public int mo71511f0() {
        return this.underlyingTypeId_;
    }

    /* renamed from: g */
    public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
        mo71015c();
        C14495h.C14499d<MessageType>.a A = mo73390A();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo73250a0(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo73250a0(2, this.name_);
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            codedOutputStream.mo73253d0(3, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo73253d0(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo73250a0(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo73253d0(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.mo73250a0(7, this.expandedTypeId_);
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            codedOutputStream.mo73253d0(8, this.annotation_.get(i2));
        }
        for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
            codedOutputStream.mo73250a0(31, this.versionRequirement_.get(i3).intValue());
        }
        A.mo73397a(200, codedOutputStream);
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    /* renamed from: g0 */
    public List<Integer> mo71512g0() {
        return this.versionRequirement_;
    }

    /* renamed from: i0 */
    public boolean mo71513i0() {
        return (this.bitField0_ & 16) == 16;
    }

    /* renamed from: k0 */
    public boolean mo71514k0() {
        return (this.bitField0_ & 32) == 32;
    }

    /* renamed from: l0 */
    public boolean mo71515l0() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: m0 */
    public boolean mo71516m0() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: n0 */
    public boolean mo71517n0() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: o0 */
    public boolean mo71518o0() {
        return (this.bitField0_ & 8) == 8;
    }

    /* renamed from: t0 */
    public C13518b mo71016d() {
        return m87040r0();
    }

    /* renamed from: v0 */
    public C13518b mo71014b() {
        return m87041s0(this);
    }

    private C13516r(C14495h.C14498c<C13516r, ?> cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo73387n();
    }

    private C13516r(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    private C13516r(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        m87039q0();
        C14485d.C14487b s = C14485d.m90840s();
        CodedOutputStream J = CodedOutputStream.m90731J(s, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int K = eVar.mo73335K();
                C13508q.C13515c cVar = null;
                switch (K) {
                    case 0:
                        z = true;
                        break;
                    case 8:
                        this.bitField0_ |= 1;
                        this.flags_ = eVar.mo73354s();
                        break;
                    case 16:
                        this.bitField0_ |= 2;
                        this.name_ = eVar.mo73354s();
                        break;
                    case 26:
                        if (!(z2 & true)) {
                            this.typeParameter_ = new ArrayList();
                            z2 |= true;
                        }
                        this.typeParameter_.add(eVar.mo73356u(C13519s.f61759c, fVar));
                        break;
                    case 34:
                        cVar = (this.bitField0_ & 4) == 4 ? this.underlyingType_.mo71014b() : cVar;
                        C13508q qVar = (C13508q) eVar.mo73356u(C13508q.f61718c, fVar);
                        this.underlyingType_ = qVar;
                        if (cVar != null) {
                            cVar.mo71036o(qVar);
                            this.underlyingType_ = cVar.mo71497x();
                        }
                        this.bitField0_ |= 4;
                        break;
                    case 40:
                        this.bitField0_ |= 8;
                        this.underlyingTypeId_ = eVar.mo73354s();
                        break;
                    case 50:
                        cVar = (this.bitField0_ & 16) == 16 ? this.expandedType_.mo71014b() : cVar;
                        C13508q qVar2 = (C13508q) eVar.mo73356u(C13508q.f61718c, fVar);
                        this.expandedType_ = qVar2;
                        if (cVar != null) {
                            cVar.mo71036o(qVar2);
                            this.expandedType_ = cVar.mo71497x();
                        }
                        this.bitField0_ |= 16;
                        break;
                    case 56:
                        this.bitField0_ |= 32;
                        this.expandedTypeId_ = eVar.mo73354s();
                        break;
                    case 66:
                        if (!(z2 & true)) {
                            this.annotation_ = new ArrayList();
                            z2 |= true;
                        }
                        this.annotation_.add(eVar.mo73356u(C13444b.f61517c, fVar));
                        break;
                    case 248:
                        if (!(z2 & true)) {
                            this.versionRequirement_ = new ArrayList();
                            z2 |= true;
                        }
                        this.versionRequirement_.add(Integer.valueOf(eVar.mo73354s()));
                        break;
                    case ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION:
                        int j = eVar.mo73345j(eVar.mo73326A());
                        if (!(z2 & true) && eVar.mo73342e() > 0) {
                            this.versionRequirement_ = new ArrayList();
                            z2 |= true;
                        }
                        while (eVar.mo73342e() > 0) {
                            this.versionRequirement_.add(Integer.valueOf(eVar.mo73354s()));
                        }
                        eVar.mo73344i(j);
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
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if (z2 & true) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                }
                if (z2 & true) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
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
            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
        }
        if (z2 & true) {
            this.annotation_ = Collections.unmodifiableList(this.annotation_);
        }
        if (z2 & true) {
            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
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
