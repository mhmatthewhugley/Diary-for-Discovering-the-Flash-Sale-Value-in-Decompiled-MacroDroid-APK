package p308kb;

import java.io.IOException;
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

/* renamed from: kb.u */
/* compiled from: ProtoBuf */
public final class C13527u extends C14495h.C14499d<C13527u> {

    /* renamed from: a */
    private static final C13527u f61777a;

    /* renamed from: c */
    public static C14519q<C13527u> f61778c = new C13528a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public int name_;
    /* access modifiers changed from: private */
    public int typeId_;
    /* access modifiers changed from: private */
    public C13508q type_;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;
    /* access modifiers changed from: private */
    public int varargElementTypeId_;
    /* access modifiers changed from: private */
    public C13508q varargElementType_;

    /* renamed from: kb.u$a */
    /* compiled from: ProtoBuf */
    static class C13528a extends C14481b<C13527u> {
        C13528a() {
        }

        /* renamed from: m */
        public C13527u mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13527u(eVar, fVar);
        }
    }

    /* renamed from: kb.u$b */
    /* compiled from: ProtoBuf */
    public static final class C13529b extends C14495h.C14498c<C13527u, C13529b> {

        /* renamed from: A */
        private int f61779A;

        /* renamed from: f */
        private int f61780f;

        /* renamed from: g */
        private int f61781g;

        /* renamed from: o */
        private int f61782o;

        /* renamed from: p */
        private C13508q f61783p = C13508q.m86912b0();

        /* renamed from: s */
        private int f61784s;

        /* renamed from: z */
        private C13508q f61785z = C13508q.m86912b0();

        private C13529b() {
            m87229A();
        }

        /* renamed from: A */
        private void m87229A() {
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public static C13529b m87231z() {
            return new C13529b();
        }

        /* renamed from: B */
        public C13529b mo71036o(C13527u uVar) {
            if (uVar == C13527u.m87201L()) {
                return this;
            }
            if (uVar.mo71580U()) {
                mo71593G(uVar.mo71574N());
            }
            if (uVar.mo71581V()) {
                mo71594H(uVar.mo71575O());
            }
            if (uVar.mo71582W()) {
                mo71591D(uVar.mo71576P());
            }
            if (uVar.mo71583X()) {
                mo71595J(uVar.mo71577Q());
            }
            if (uVar.mo71584Y()) {
                mo71592E(uVar.mo71578R());
            }
            if (uVar.mo71585Z()) {
                mo71596K(uVar.mo71579T());
            }
            mo73389t(uVar);
            mo73388p(mo73387n().mo73309d(uVar.unknownFields));
            return this;
        }

        /* renamed from: C */
        public C13529b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13527u uVar;
            C13527u uVar2 = null;
            try {
                C13527u c = C13527u.f61778c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                uVar = (C13527u) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                uVar2 = uVar;
            }
            if (uVar2 != null) {
                mo71036o(uVar2);
            }
            throw th;
        }

        /* renamed from: D */
        public C13529b mo71591D(C13508q qVar) {
            if ((this.f61780f & 4) != 4 || this.f61783p == C13508q.m86912b0()) {
                this.f61783p = qVar;
            } else {
                this.f61783p = C13508q.m86898F0(this.f61783p).mo71036o(qVar).mo71497x();
            }
            this.f61780f |= 4;
            return this;
        }

        /* renamed from: E */
        public C13529b mo71592E(C13508q qVar) {
            if ((this.f61780f & 16) != 16 || this.f61785z == C13508q.m86912b0()) {
                this.f61785z = qVar;
            } else {
                this.f61785z = C13508q.m86898F0(this.f61785z).mo71036o(qVar).mo71497x();
            }
            this.f61780f |= 16;
            return this;
        }

        /* renamed from: G */
        public C13529b mo71593G(int i) {
            this.f61780f |= 1;
            this.f61781g = i;
            return this;
        }

        /* renamed from: H */
        public C13529b mo71594H(int i) {
            this.f61780f |= 2;
            this.f61782o = i;
            return this;
        }

        /* renamed from: J */
        public C13529b mo71595J(int i) {
            this.f61780f |= 8;
            this.f61784s = i;
            return this;
        }

        /* renamed from: K */
        public C13529b mo71596K(int i) {
            this.f61780f |= 32;
            this.f61779A = i;
            return this;
        }

        /* renamed from: v */
        public C13527u build() {
            C13527u x = mo71598x();
            if (x.mo71013a()) {
                return x;
            }
            throw C14478a.C14479a.m90815k(x);
        }

        /* renamed from: x */
        public C13527u mo71598x() {
            C13527u uVar = new C13527u((C14495h.C14498c) this);
            int i = this.f61780f;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = uVar.flags_ = this.f61781g;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = uVar.name_ = this.f61782o;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            C13508q unused3 = uVar.type_ = this.f61783p;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            int unused4 = uVar.typeId_ = this.f61784s;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            C13508q unused5 = uVar.varargElementType_ = this.f61785z;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            int unused6 = uVar.varargElementTypeId_ = this.f61779A;
            int unused7 = uVar.bitField0_ = i2;
            return uVar;
        }

        /* renamed from: y */
        public C13529b mo71035l() {
            return m87231z().mo71036o(mo71598x());
        }
    }

    static {
        C13527u uVar = new C13527u(true);
        f61777a = uVar;
        uVar.m87202a0();
    }

    /* renamed from: L */
    public static C13527u m87201L() {
        return f61777a;
    }

    /* renamed from: a0 */
    private void m87202a0() {
        this.flags_ = 0;
        this.name_ = 0;
        this.type_ = C13508q.m86912b0();
        this.typeId_ = 0;
        this.varargElementType_ = C13508q.m86912b0();
        this.varargElementTypeId_ = 0;
    }

    /* renamed from: b0 */
    public static C13529b m87203b0() {
        return C13529b.m87231z();
    }

    /* renamed from: c0 */
    public static C13529b m87204c0(C13527u uVar) {
        return m87203b0().mo71036o(uVar);
    }

    /* renamed from: M */
    public C13527u mo71124e() {
        return f61777a;
    }

    /* renamed from: N */
    public int mo71574N() {
        return this.flags_;
    }

    /* renamed from: O */
    public int mo71575O() {
        return this.name_;
    }

    /* renamed from: P */
    public C13508q mo71576P() {
        return this.type_;
    }

    /* renamed from: Q */
    public int mo71577Q() {
        return this.typeId_;
    }

    /* renamed from: R */
    public C13508q mo71578R() {
        return this.varargElementType_;
    }

    /* renamed from: T */
    public int mo71579T() {
        return this.varargElementTypeId_;
    }

    /* renamed from: U */
    public boolean mo71580U() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: V */
    public boolean mo71581V() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: W */
    public boolean mo71582W() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: X */
    public boolean mo71583X() {
        return (this.bitField0_ & 8) == 8;
    }

    /* renamed from: Y */
    public boolean mo71584Y() {
        return (this.bitField0_ & 16) == 16;
    }

    /* renamed from: Z */
    public boolean mo71585Z() {
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
        if (!mo71581V()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (mo71582W() && !mo71576P().mo71013a()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (mo71584Y() && !mo71578R().mo71013a()) {
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

    /* renamed from: c */
    public int mo71015c() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.bitField0_ & 1) == 1) {
            i2 = 0 + CodedOutputStream.m90747o(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            i2 += CodedOutputStream.m90747o(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i2 += CodedOutputStream.m90751s(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            i2 += CodedOutputStream.m90751s(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            i2 += CodedOutputStream.m90747o(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            i2 += CodedOutputStream.m90747o(6, this.varargElementTypeId_);
        }
        int v = i2 + mo73392v() + this.unknownFields.size();
        this.memoizedSerializedSize = v;
        return v;
    }

    /* renamed from: d0 */
    public C13529b mo71016d() {
        return m87203b0();
    }

    /* renamed from: e0 */
    public C13529b mo71014b() {
        return m87204c0(this);
    }

    /* renamed from: f */
    public C14519q<C13527u> mo71017f() {
        return f61778c;
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
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo73253d0(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo73253d0(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo73250a0(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.mo73250a0(6, this.varargElementTypeId_);
        }
        A.mo73397a(200, codedOutputStream);
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    private C13527u(C14495h.C14498c<C13527u, ?> cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo73387n();
    }

    private C13527u(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    private C13527u(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        m87202a0();
        C14485d.C14487b s = C14485d.m90840s();
        CodedOutputStream J = CodedOutputStream.m90731J(s, 1);
        boolean z = false;
        while (!z) {
            try {
                int K = eVar.mo73335K();
                if (K != 0) {
                    if (K == 8) {
                        this.bitField0_ |= 1;
                        this.flags_ = eVar.mo73354s();
                    } else if (K != 16) {
                        C13508q.C13515c cVar = null;
                        if (K == 26) {
                            cVar = (this.bitField0_ & 4) == 4 ? this.type_.mo71014b() : cVar;
                            C13508q qVar = (C13508q) eVar.mo73356u(C13508q.f61718c, fVar);
                            this.type_ = qVar;
                            if (cVar != null) {
                                cVar.mo71036o(qVar);
                                this.type_ = cVar.mo71497x();
                            }
                            this.bitField0_ |= 4;
                        } else if (K == 34) {
                            cVar = (this.bitField0_ & 16) == 16 ? this.varargElementType_.mo71014b() : cVar;
                            C13508q qVar2 = (C13508q) eVar.mo73356u(C13508q.f61718c, fVar);
                            this.varargElementType_ = qVar2;
                            if (cVar != null) {
                                cVar.mo71036o(qVar2);
                                this.varargElementType_ = cVar.mo71497x();
                            }
                            this.bitField0_ |= 16;
                        } else if (K == 40) {
                            this.bitField0_ |= 8;
                            this.typeId_ = eVar.mo73354s();
                        } else if (K == 48) {
                            this.bitField0_ |= 32;
                            this.varargElementTypeId_ = eVar.mo73354s();
                        } else if (!mo73386q(eVar, J, fVar, K)) {
                        }
                    } else {
                        this.bitField0_ |= 2;
                        this.name_ = eVar.mo73354s();
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
