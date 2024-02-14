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

/* renamed from: kb.d */
/* compiled from: ProtoBuf */
public final class C13460d extends C14495h.C14499d<C13460d> {

    /* renamed from: a */
    private static final C13460d f61591a;

    /* renamed from: c */
    public static C14519q<C13460d> f61592c = new C13461a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;
    /* access modifiers changed from: private */
    public List<C13527u> valueParameter_;
    /* access modifiers changed from: private */
    public List<Integer> versionRequirement_;

    /* renamed from: kb.d$a */
    /* compiled from: ProtoBuf */
    static class C13461a extends C14481b<C13460d> {
        C13461a() {
        }

        /* renamed from: m */
        public C13460d mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13460d(eVar, fVar);
        }
    }

    /* renamed from: kb.d$b */
    /* compiled from: ProtoBuf */
    public static final class C13462b extends C14495h.C14498c<C13460d, C13462b> {

        /* renamed from: f */
        private int f61593f;

        /* renamed from: g */
        private int f61594g = 6;

        /* renamed from: o */
        private List<C13527u> f61595o = Collections.emptyList();

        /* renamed from: p */
        private List<Integer> f61596p = Collections.emptyList();

        private C13462b() {
            m86293C();
        }

        /* renamed from: A */
        private void m86291A() {
            if ((this.f61593f & 2) != 2) {
                this.f61595o = new ArrayList(this.f61595o);
                this.f61593f |= 2;
            }
        }

        /* renamed from: B */
        private void m86292B() {
            if ((this.f61593f & 4) != 4) {
                this.f61596p = new ArrayList(this.f61596p);
                this.f61593f |= 4;
            }
        }

        /* renamed from: C */
        private void m86293C() {
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public static C13462b m86295z() {
            return new C13462b();
        }

        /* renamed from: D */
        public C13462b mo71036o(C13460d dVar) {
            if (dVar == C13460d.m86269J()) {
                return this;
            }
            if (dVar.mo71170R()) {
                mo71176G(dVar.mo71165M());
            }
            if (!dVar.valueParameter_.isEmpty()) {
                if (this.f61595o.isEmpty()) {
                    this.f61595o = dVar.valueParameter_;
                    this.f61593f &= -3;
                } else {
                    m86291A();
                    this.f61595o.addAll(dVar.valueParameter_);
                }
            }
            if (!dVar.versionRequirement_.isEmpty()) {
                if (this.f61596p.isEmpty()) {
                    this.f61596p = dVar.versionRequirement_;
                    this.f61593f &= -5;
                } else {
                    m86292B();
                    this.f61596p.addAll(dVar.versionRequirement_);
                }
            }
            mo73389t(dVar);
            mo73388p(mo73387n().mo73309d(dVar.unknownFields));
            return this;
        }

        /* renamed from: E */
        public C13462b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13460d dVar;
            C13460d dVar2 = null;
            try {
                C13460d c = C13460d.f61592c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                dVar = (C13460d) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                dVar2 = dVar;
            }
            if (dVar2 != null) {
                mo71036o(dVar2);
            }
            throw th;
        }

        /* renamed from: G */
        public C13462b mo71176G(int i) {
            this.f61593f |= 1;
            this.f61594g = i;
            return this;
        }

        /* renamed from: v */
        public C13460d build() {
            C13460d x = mo71178x();
            if (x.mo71013a()) {
                return x;
            }
            throw C14478a.C14479a.m90815k(x);
        }

        /* renamed from: x */
        public C13460d mo71178x() {
            C13460d dVar = new C13460d((C14495h.C14498c) this);
            int i = 1;
            if ((this.f61593f & 1) != 1) {
                i = 0;
            }
            int unused = dVar.flags_ = this.f61594g;
            if ((this.f61593f & 2) == 2) {
                this.f61595o = Collections.unmodifiableList(this.f61595o);
                this.f61593f &= -3;
            }
            List unused2 = dVar.valueParameter_ = this.f61595o;
            if ((this.f61593f & 4) == 4) {
                this.f61596p = Collections.unmodifiableList(this.f61596p);
                this.f61593f &= -5;
            }
            List unused3 = dVar.versionRequirement_ = this.f61596p;
            int unused4 = dVar.bitField0_ = i;
            return dVar;
        }

        /* renamed from: y */
        public C13462b mo71035l() {
            return m86295z().mo71036o(mo71178x());
        }
    }

    static {
        C13460d dVar = new C13460d(true);
        f61591a = dVar;
        dVar.m86270T();
    }

    /* renamed from: J */
    public static C13460d m86269J() {
        return f61591a;
    }

    /* renamed from: T */
    private void m86270T() {
        this.flags_ = 6;
        this.valueParameter_ = Collections.emptyList();
        this.versionRequirement_ = Collections.emptyList();
    }

    /* renamed from: U */
    public static C13462b m86271U() {
        return C13462b.m86295z();
    }

    /* renamed from: V */
    public static C13462b m86272V(C13460d dVar) {
        return m86271U().mo71036o(dVar);
    }

    /* renamed from: L */
    public C13460d mo71124e() {
        return f61591a;
    }

    /* renamed from: M */
    public int mo71165M() {
        return this.flags_;
    }

    /* renamed from: N */
    public C13527u mo71166N(int i) {
        return this.valueParameter_.get(i);
    }

    /* renamed from: O */
    public int mo71167O() {
        return this.valueParameter_.size();
    }

    /* renamed from: P */
    public List<C13527u> mo71168P() {
        return this.valueParameter_;
    }

    /* renamed from: Q */
    public List<Integer> mo71169Q() {
        return this.versionRequirement_;
    }

    /* renamed from: R */
    public boolean mo71170R() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: W */
    public C13462b mo71016d() {
        return m86271U();
    }

    /* renamed from: X */
    public C13462b mo71014b() {
        return m86272V(this);
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
        for (int i = 0; i < mo71167O(); i++) {
            if (!mo71166N(i).mo71013a()) {
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
    }

    /* renamed from: c */
    public int mo71015c() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int o = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m90747o(1, this.flags_) + 0 : 0;
        for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
            o += CodedOutputStream.m90751s(2, this.valueParameter_.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
            i3 += CodedOutputStream.m90748p(this.versionRequirement_.get(i4).intValue());
        }
        int size = o + i3 + (mo71169Q().size() * 2) + mo73392v() + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    /* renamed from: f */
    public C14519q<C13460d> mo71017f() {
        return f61592c;
    }

    /* renamed from: g */
    public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
        mo71015c();
        C14495h.C14499d<MessageType>.a A = mo73390A();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo73250a0(1, this.flags_);
        }
        for (int i = 0; i < this.valueParameter_.size(); i++) {
            codedOutputStream.mo73253d0(2, this.valueParameter_.get(i));
        }
        for (int i2 = 0; i2 < this.versionRequirement_.size(); i2++) {
            codedOutputStream.mo73250a0(31, this.versionRequirement_.get(i2).intValue());
        }
        A.mo73397a(19000, codedOutputStream);
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    private C13460d(C14495h.C14498c<C13460d, ?> cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo73387n();
    }

    private C13460d(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    private C13460d(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        m86270T();
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
                        this.flags_ = eVar.mo73354s();
                    } else if (K == 18) {
                        if (!(z2 & true)) {
                            this.valueParameter_ = new ArrayList();
                            z2 |= true;
                        }
                        this.valueParameter_.add(eVar.mo73356u(C13527u.f61778c, fVar));
                    } else if (K == 248) {
                        if (!(z2 & true)) {
                            this.versionRequirement_ = new ArrayList();
                            z2 |= true;
                        }
                        this.versionRequirement_.add(Integer.valueOf(eVar.mo73354s()));
                    } else if (K == 250) {
                        int j = eVar.mo73345j(eVar.mo73326A());
                        if (!(z2 & true) && eVar.mo73342e() > 0) {
                            this.versionRequirement_ = new ArrayList();
                            z2 |= true;
                        }
                        while (eVar.mo73342e() > 0) {
                            this.versionRequirement_.add(Integer.valueOf(eVar.mo73354s()));
                        }
                        eVar.mo73344i(j);
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
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
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
            this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
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
