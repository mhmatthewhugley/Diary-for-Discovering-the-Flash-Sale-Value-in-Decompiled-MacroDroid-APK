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
import kotlin.reflect.jvm.internal.impl.protobuf.C14519q;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kb.s */
/* compiled from: ProtoBuf */
public final class C13519s extends C14495h.C14499d<C13519s> {

    /* renamed from: a */
    private static final C13519s f61758a;

    /* renamed from: c */
    public static C14519q<C13519s> f61759c = new C13520a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int id_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public int name_;
    /* access modifiers changed from: private */
    public boolean reified_;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;
    private int upperBoundIdMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> upperBoundId_;
    /* access modifiers changed from: private */
    public List<C13508q> upperBound_;
    /* access modifiers changed from: private */
    public C13522c variance_;

    /* renamed from: kb.s$a */
    /* compiled from: ProtoBuf */
    static class C13520a extends C14481b<C13519s> {
        C13520a() {
        }

        /* renamed from: m */
        public C13519s mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13519s(eVar, fVar);
        }
    }

    /* renamed from: kb.s$b */
    /* compiled from: ProtoBuf */
    public static final class C13521b extends C14495h.C14498c<C13519s, C13521b> {

        /* renamed from: A */
        private List<Integer> f61760A = Collections.emptyList();

        /* renamed from: f */
        private int f61761f;

        /* renamed from: g */
        private int f61762g;

        /* renamed from: o */
        private int f61763o;

        /* renamed from: p */
        private boolean f61764p;

        /* renamed from: s */
        private C13522c f61765s = C13522c.INV;

        /* renamed from: z */
        private List<C13508q> f61766z = Collections.emptyList();

        private C13521b() {
            m87135C();
        }

        /* renamed from: A */
        private void m87133A() {
            if ((this.f61761f & 32) != 32) {
                this.f61760A = new ArrayList(this.f61760A);
                this.f61761f |= 32;
            }
        }

        /* renamed from: B */
        private void m87134B() {
            if ((this.f61761f & 16) != 16) {
                this.f61766z = new ArrayList(this.f61766z);
                this.f61761f |= 16;
            }
        }

        /* renamed from: C */
        private void m87135C() {
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public static C13521b m87137z() {
            return new C13521b();
        }

        /* renamed from: D */
        public C13521b mo71036o(C13519s sVar) {
            if (sVar == C13519s.m87105N()) {
                return this;
            }
            if (sVar.mo71542Y()) {
                mo71551G(sVar.mo71534P());
            }
            if (sVar.mo71543Z()) {
                mo71552H(sVar.mo71535Q());
            }
            if (sVar.mo71544a0()) {
                mo71553J(sVar.mo71536R());
            }
            if (sVar.mo71545b0()) {
                mo71554K(sVar.mo71541X());
            }
            if (!sVar.upperBound_.isEmpty()) {
                if (this.f61766z.isEmpty()) {
                    this.f61766z = sVar.upperBound_;
                    this.f61761f &= -17;
                } else {
                    m87134B();
                    this.f61766z.addAll(sVar.upperBound_);
                }
            }
            if (!sVar.upperBoundId_.isEmpty()) {
                if (this.f61760A.isEmpty()) {
                    this.f61760A = sVar.upperBoundId_;
                    this.f61761f &= -33;
                } else {
                    m87133A();
                    this.f61760A.addAll(sVar.upperBoundId_);
                }
            }
            mo73389t(sVar);
            mo73388p(mo73387n().mo73309d(sVar.unknownFields));
            return this;
        }

        /* renamed from: E */
        public C13521b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13519s sVar;
            C13519s sVar2 = null;
            try {
                C13519s c = C13519s.f61759c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                sVar = (C13519s) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                sVar2 = sVar;
            }
            if (sVar2 != null) {
                mo71036o(sVar2);
            }
            throw th;
        }

        /* renamed from: G */
        public C13521b mo71551G(int i) {
            this.f61761f |= 1;
            this.f61762g = i;
            return this;
        }

        /* renamed from: H */
        public C13521b mo71552H(int i) {
            this.f61761f |= 2;
            this.f61763o = i;
            return this;
        }

        /* renamed from: J */
        public C13521b mo71553J(boolean z) {
            this.f61761f |= 4;
            this.f61764p = z;
            return this;
        }

        /* renamed from: K */
        public C13521b mo71554K(C13522c cVar) {
            Objects.requireNonNull(cVar);
            this.f61761f |= 8;
            this.f61765s = cVar;
            return this;
        }

        /* renamed from: v */
        public C13519s build() {
            C13519s x = mo71556x();
            if (x.mo71013a()) {
                return x;
            }
            throw C14478a.C14479a.m90815k(x);
        }

        /* renamed from: x */
        public C13519s mo71556x() {
            C13519s sVar = new C13519s((C14495h.C14498c) this);
            int i = this.f61761f;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = sVar.id_ = this.f61762g;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = sVar.name_ = this.f61763o;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            boolean unused3 = sVar.reified_ = this.f61764p;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            C13522c unused4 = sVar.variance_ = this.f61765s;
            if ((this.f61761f & 16) == 16) {
                this.f61766z = Collections.unmodifiableList(this.f61766z);
                this.f61761f &= -17;
            }
            List unused5 = sVar.upperBound_ = this.f61766z;
            if ((this.f61761f & 32) == 32) {
                this.f61760A = Collections.unmodifiableList(this.f61760A);
                this.f61761f &= -33;
            }
            List unused6 = sVar.upperBoundId_ = this.f61760A;
            int unused7 = sVar.bitField0_ = i2;
            return sVar;
        }

        /* renamed from: y */
        public C13521b mo71035l() {
            return m87137z().mo71036o(mo71556x());
        }
    }

    /* renamed from: kb.s$c */
    /* compiled from: ProtoBuf */
    public enum C13522c implements C14503i.C14504a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);
        

        /* renamed from: f */
        private static C14503i.C14505b<C13522c> f61770f;
        private final int value;

        /* renamed from: kb.s$c$a */
        /* compiled from: ProtoBuf */
        static class C13523a implements C14503i.C14505b<C13522c> {
            C13523a() {
            }

            /* renamed from: b */
            public C13522c mo71085a(int i) {
                return C13522c.m87151b(i);
            }
        }

        static {
            f61770f = new C13523a();
        }

        private C13522c(int i, int i2) {
            this.value = i2;
        }

        /* renamed from: b */
        public static C13522c m87151b(int i) {
            if (i == 0) {
                return IN;
            }
            if (i == 1) {
                return OUT;
            }
            if (i != 2) {
                return null;
            }
            return INV;
        }

        /* renamed from: c */
        public final int mo71084c() {
            return this.value;
        }
    }

    static {
        C13519s sVar = new C13519s(true);
        f61758a = sVar;
        sVar.m87106c0();
    }

    /* renamed from: N */
    public static C13519s m87105N() {
        return f61758a;
    }

    /* renamed from: c0 */
    private void m87106c0() {
        this.id_ = 0;
        this.name_ = 0;
        this.reified_ = false;
        this.variance_ = C13522c.INV;
        this.upperBound_ = Collections.emptyList();
        this.upperBoundId_ = Collections.emptyList();
    }

    /* renamed from: d0 */
    public static C13521b m87107d0() {
        return C13521b.m87137z();
    }

    /* renamed from: e0 */
    public static C13521b m87108e0(C13519s sVar) {
        return m87107d0().mo71036o(sVar);
    }

    /* renamed from: O */
    public C13519s mo71124e() {
        return f61758a;
    }

    /* renamed from: P */
    public int mo71534P() {
        return this.id_;
    }

    /* renamed from: Q */
    public int mo71535Q() {
        return this.name_;
    }

    /* renamed from: R */
    public boolean mo71536R() {
        return this.reified_;
    }

    /* renamed from: T */
    public C13508q mo71537T(int i) {
        return this.upperBound_.get(i);
    }

    /* renamed from: U */
    public int mo71538U() {
        return this.upperBound_.size();
    }

    /* renamed from: V */
    public List<Integer> mo71539V() {
        return this.upperBoundId_;
    }

    /* renamed from: W */
    public List<C13508q> mo71540W() {
        return this.upperBound_;
    }

    /* renamed from: X */
    public C13522c mo71541X() {
        return this.variance_;
    }

    /* renamed from: Y */
    public boolean mo71542Y() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: Z */
    public boolean mo71543Z() {
        return (this.bitField0_ & 2) == 2;
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
        if (!mo71542Y()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (!mo71543Z()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else {
            for (int i = 0; i < mo71538U(); i++) {
                if (!mo71537T(i).mo71013a()) {
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
    }

    /* renamed from: a0 */
    public boolean mo71544a0() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: b0 */
    public boolean mo71545b0() {
        return (this.bitField0_ & 8) == 8;
    }

    /* renamed from: c */
    public int mo71015c() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int o = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m90747o(1, this.id_) + 0 : 0;
        if ((this.bitField0_ & 2) == 2) {
            o += CodedOutputStream.m90747o(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            o += CodedOutputStream.m90733a(3, this.reified_);
        }
        if ((this.bitField0_ & 8) == 8) {
            o += CodedOutputStream.m90740h(4, this.variance_.mo71084c());
        }
        for (int i2 = 0; i2 < this.upperBound_.size(); i2++) {
            o += CodedOutputStream.m90751s(5, this.upperBound_.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.upperBoundId_.size(); i4++) {
            i3 += CodedOutputStream.m90748p(this.upperBoundId_.get(i4).intValue());
        }
        int i5 = o + i3;
        if (!mo71539V().isEmpty()) {
            i5 = i5 + 1 + CodedOutputStream.m90748p(i3);
        }
        this.upperBoundIdMemoizedSerializedSize = i3;
        int v = i5 + mo73392v() + this.unknownFields.size();
        this.memoizedSerializedSize = v;
        return v;
    }

    /* renamed from: f */
    public C14519q<C13519s> mo71017f() {
        return f61759c;
    }

    /* renamed from: f0 */
    public C13521b mo71016d() {
        return m87107d0();
    }

    /* renamed from: g */
    public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
        mo71015c();
        C14495h.C14499d<MessageType>.a A = mo73390A();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo73250a0(1, this.id_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo73250a0(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo73235L(3, this.reified_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo73242S(4, this.variance_.mo71084c());
        }
        for (int i = 0; i < this.upperBound_.size(); i++) {
            codedOutputStream.mo73253d0(5, this.upperBound_.get(i));
        }
        if (mo71539V().size() > 0) {
            codedOutputStream.mo73264o0(50);
            codedOutputStream.mo73264o0(this.upperBoundIdMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.upperBoundId_.size(); i2++) {
            codedOutputStream.mo73251b0(this.upperBoundId_.get(i2).intValue());
        }
        A.mo73397a(1000, codedOutputStream);
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    /* renamed from: g0 */
    public C13521b mo71014b() {
        return m87108e0(this);
    }

    private C13519s(C14495h.C14498c<C13519s, ?> cVar) {
        super(cVar);
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo73387n();
    }

    private C13519s(boolean z) {
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    private C13519s(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        m87106c0();
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
                    } else if (K == 16) {
                        this.bitField0_ |= 2;
                        this.name_ = eVar.mo73354s();
                    } else if (K == 24) {
                        this.bitField0_ |= 4;
                        this.reified_ = eVar.mo73346k();
                    } else if (K == 32) {
                        int n = eVar.mo73349n();
                        C13522c b = C13522c.m87151b(n);
                        if (b == null) {
                            J.mo73264o0(K);
                            J.mo73264o0(n);
                        } else {
                            this.bitField0_ |= 8;
                            this.variance_ = b;
                        }
                    } else if (K == 42) {
                        if (!(z2 & true)) {
                            this.upperBound_ = new ArrayList();
                            z2 |= true;
                        }
                        this.upperBound_.add(eVar.mo73356u(C13508q.f61718c, fVar));
                    } else if (K == 48) {
                        if (!(z2 & true)) {
                            this.upperBoundId_ = new ArrayList();
                            z2 |= true;
                        }
                        this.upperBoundId_.add(Integer.valueOf(eVar.mo73354s()));
                    } else if (K == 50) {
                        int j = eVar.mo73345j(eVar.mo73326A());
                        if (!(z2 & true) && eVar.mo73342e() > 0) {
                            this.upperBoundId_ = new ArrayList();
                            z2 |= true;
                        }
                        while (eVar.mo73342e() > 0) {
                            this.upperBoundId_.add(Integer.valueOf(eVar.mo73354s()));
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
                    this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                }
                if (z2 & true) {
                    this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
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
            this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
        }
        if (z2 & true) {
            this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
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
