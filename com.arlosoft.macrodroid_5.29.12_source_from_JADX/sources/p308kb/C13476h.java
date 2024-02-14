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
import p308kb.C13508q;

/* renamed from: kb.h */
/* compiled from: ProtoBuf */
public final class C13476h extends C14495h implements C14518p {

    /* renamed from: a */
    private static final C13476h f61622a;

    /* renamed from: c */
    public static C14519q<C13476h> f61623c = new C13477a();
    /* access modifiers changed from: private */
    public List<C13476h> andArgument_;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public C13479c constantValue_;
    /* access modifiers changed from: private */
    public int flags_;
    /* access modifiers changed from: private */
    public int isInstanceTypeId_;
    /* access modifiers changed from: private */
    public C13508q isInstanceType_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<C13476h> orArgument_;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;
    /* access modifiers changed from: private */
    public int valueParameterReference_;

    /* renamed from: kb.h$a */
    /* compiled from: ProtoBuf */
    static class C13477a extends C14481b<C13476h> {
        C13477a() {
        }

        /* renamed from: m */
        public C13476h mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13476h(eVar, fVar);
        }
    }

    /* renamed from: kb.h$b */
    /* compiled from: ProtoBuf */
    public static final class C13478b extends C14495h.C14497b<C13476h, C13478b> implements C14518p {

        /* renamed from: c */
        private int f61624c;

        /* renamed from: d */
        private int f61625d;

        /* renamed from: f */
        private int f61626f;

        /* renamed from: g */
        private C13479c f61627g = C13479c.TRUE;

        /* renamed from: o */
        private C13508q f61628o = C13508q.m86912b0();

        /* renamed from: p */
        private int f61629p;

        /* renamed from: s */
        private List<C13476h> f61630s = Collections.emptyList();

        /* renamed from: z */
        private List<C13476h> f61631z = Collections.emptyList();

        private C13478b() {
            m86468y();
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public static C13478b m86465u() {
            return new C13478b();
        }

        /* renamed from: v */
        private void m86466v() {
            if ((this.f61624c & 32) != 32) {
                this.f61630s = new ArrayList(this.f61630s);
                this.f61624c |= 32;
            }
        }

        /* renamed from: x */
        private void m86467x() {
            if ((this.f61624c & 64) != 64) {
                this.f61631z = new ArrayList(this.f61631z);
                this.f61624c |= 64;
            }
        }

        /* renamed from: y */
        private void m86468y() {
        }

        /* renamed from: A */
        public C13478b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13476h hVar;
            C13476h hVar2 = null;
            try {
                C13476h c = C13476h.f61623c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                hVar = (C13476h) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                hVar2 = hVar;
            }
            if (hVar2 != null) {
                mo71036o(hVar2);
            }
            throw th;
        }

        /* renamed from: B */
        public C13478b mo71241B(C13508q qVar) {
            if ((this.f61624c & 8) != 8 || this.f61628o == C13508q.m86912b0()) {
                this.f61628o = qVar;
            } else {
                this.f61628o = C13508q.m86898F0(this.f61628o).mo71036o(qVar).mo71497x();
            }
            this.f61624c |= 8;
            return this;
        }

        /* renamed from: C */
        public C13478b mo71242C(C13479c cVar) {
            Objects.requireNonNull(cVar);
            this.f61624c |= 4;
            this.f61627g = cVar;
            return this;
        }

        /* renamed from: D */
        public C13478b mo71243D(int i) {
            this.f61624c |= 1;
            this.f61625d = i;
            return this;
        }

        /* renamed from: E */
        public C13478b mo71244E(int i) {
            this.f61624c |= 16;
            this.f61629p = i;
            return this;
        }

        /* renamed from: G */
        public C13478b mo71245G(int i) {
            this.f61624c |= 2;
            this.f61626f = i;
            return this;
        }

        /* renamed from: r */
        public C13476h build() {
            C13476h s = mo71247s();
            if (s.mo71013a()) {
                return s;
            }
            throw C14478a.C14479a.m90815k(s);
        }

        /* renamed from: s */
        public C13476h mo71247s() {
            C13476h hVar = new C13476h((C14495h.C14497b) this);
            int i = this.f61624c;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = hVar.flags_ = this.f61625d;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = hVar.valueParameterReference_ = this.f61626f;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            C13479c unused3 = hVar.constantValue_ = this.f61627g;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            C13508q unused4 = hVar.isInstanceType_ = this.f61628o;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            int unused5 = hVar.isInstanceTypeId_ = this.f61629p;
            if ((this.f61624c & 32) == 32) {
                this.f61630s = Collections.unmodifiableList(this.f61630s);
                this.f61624c &= -33;
            }
            List unused6 = hVar.andArgument_ = this.f61630s;
            if ((this.f61624c & 64) == 64) {
                this.f61631z = Collections.unmodifiableList(this.f61631z);
                this.f61624c &= -65;
            }
            List unused7 = hVar.orArgument_ = this.f61631z;
            int unused8 = hVar.bitField0_ = i2;
            return hVar;
        }

        /* renamed from: t */
        public C13478b mo71035l() {
            return m86465u().mo71036o(mo71247s());
        }

        /* renamed from: z */
        public C13478b mo71036o(C13476h hVar) {
            if (hVar == C13476h.m86429H()) {
                return this;
            }
            if (hVar.mo71233Q()) {
                mo71243D(hVar.mo71226I());
            }
            if (hVar.mo71236U()) {
                mo71245G(hVar.mo71231O());
            }
            if (hVar.mo71232P()) {
                mo71242C(hVar.mo71225G());
            }
            if (hVar.mo71234R()) {
                mo71241B(hVar.mo71227J());
            }
            if (hVar.mo71235T()) {
                mo71244E(hVar.mo71228L());
            }
            if (!hVar.andArgument_.isEmpty()) {
                if (this.f61630s.isEmpty()) {
                    this.f61630s = hVar.andArgument_;
                    this.f61624c &= -33;
                } else {
                    m86466v();
                    this.f61630s.addAll(hVar.andArgument_);
                }
            }
            if (!hVar.orArgument_.isEmpty()) {
                if (this.f61631z.isEmpty()) {
                    this.f61631z = hVar.orArgument_;
                    this.f61624c &= -65;
                } else {
                    m86467x();
                    this.f61631z.addAll(hVar.orArgument_);
                }
            }
            mo73388p(mo73387n().mo73309d(hVar.unknownFields));
            return this;
        }
    }

    /* renamed from: kb.h$c */
    /* compiled from: ProtoBuf */
    public enum C13479c implements C14503i.C14504a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);
        

        /* renamed from: f */
        private static C14503i.C14505b<C13479c> f61635f;
        private final int value;

        /* renamed from: kb.h$c$a */
        /* compiled from: ProtoBuf */
        static class C13480a implements C14503i.C14505b<C13479c> {
            C13480a() {
            }

            /* renamed from: b */
            public C13479c mo71085a(int i) {
                return C13479c.m86483b(i);
            }
        }

        static {
            f61635f = new C13480a();
        }

        private C13479c(int i, int i2) {
            this.value = i2;
        }

        /* renamed from: b */
        public static C13479c m86483b(int i) {
            if (i == 0) {
                return TRUE;
            }
            if (i == 1) {
                return FALSE;
            }
            if (i != 2) {
                return null;
            }
            return NULL;
        }

        /* renamed from: c */
        public final int mo71084c() {
            return this.value;
        }
    }

    static {
        C13476h hVar = new C13476h(true);
        f61622a = hVar;
        hVar.m86430V();
    }

    /* renamed from: H */
    public static C13476h m86429H() {
        return f61622a;
    }

    /* renamed from: V */
    private void m86430V() {
        this.flags_ = 0;
        this.valueParameterReference_ = 0;
        this.constantValue_ = C13479c.TRUE;
        this.isInstanceType_ = C13508q.m86912b0();
        this.isInstanceTypeId_ = 0;
        this.andArgument_ = Collections.emptyList();
        this.orArgument_ = Collections.emptyList();
    }

    /* renamed from: W */
    public static C13478b m86431W() {
        return C13478b.m86465u();
    }

    /* renamed from: X */
    public static C13478b m86432X(C13476h hVar) {
        return m86431W().mo71036o(hVar);
    }

    /* renamed from: E */
    public C13476h mo71223E(int i) {
        return this.andArgument_.get(i);
    }

    /* renamed from: F */
    public int mo71224F() {
        return this.andArgument_.size();
    }

    /* renamed from: G */
    public C13479c mo71225G() {
        return this.constantValue_;
    }

    /* renamed from: I */
    public int mo71226I() {
        return this.flags_;
    }

    /* renamed from: J */
    public C13508q mo71227J() {
        return this.isInstanceType_;
    }

    /* renamed from: L */
    public int mo71228L() {
        return this.isInstanceTypeId_;
    }

    /* renamed from: M */
    public C13476h mo71229M(int i) {
        return this.orArgument_.get(i);
    }

    /* renamed from: N */
    public int mo71230N() {
        return this.orArgument_.size();
    }

    /* renamed from: O */
    public int mo71231O() {
        return this.valueParameterReference_;
    }

    /* renamed from: P */
    public boolean mo71232P() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: Q */
    public boolean mo71233Q() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: R */
    public boolean mo71234R() {
        return (this.bitField0_ & 8) == 8;
    }

    /* renamed from: T */
    public boolean mo71235T() {
        return (this.bitField0_ & 16) == 16;
    }

    /* renamed from: U */
    public boolean mo71236U() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: Y */
    public C13478b mo71016d() {
        return m86431W();
    }

    /* renamed from: Z */
    public C13478b mo71014b() {
        return m86432X(this);
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
        if (!mo71234R() || mo71227J().mo71013a()) {
            for (int i = 0; i < mo71224F(); i++) {
                if (!mo71223E(i).mo71013a()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < mo71230N(); i2++) {
                if (!mo71229M(i2).mo71013a()) {
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

    /* renamed from: c */
    public int mo71015c() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int o = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m90747o(1, this.flags_) + 0 : 0;
        if ((this.bitField0_ & 2) == 2) {
            o += CodedOutputStream.m90747o(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            o += CodedOutputStream.m90740h(3, this.constantValue_.mo71084c());
        }
        if ((this.bitField0_ & 8) == 8) {
            o += CodedOutputStream.m90751s(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            o += CodedOutputStream.m90747o(5, this.isInstanceTypeId_);
        }
        for (int i2 = 0; i2 < this.andArgument_.size(); i2++) {
            o += CodedOutputStream.m90751s(6, this.andArgument_.get(i2));
        }
        for (int i3 = 0; i3 < this.orArgument_.size(); i3++) {
            o += CodedOutputStream.m90751s(7, this.orArgument_.get(i3));
        }
        int size = o + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    /* renamed from: f */
    public C14519q<C13476h> mo71017f() {
        return f61623c;
    }

    /* renamed from: g */
    public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
        mo71015c();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo73250a0(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo73250a0(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo73242S(3, this.constantValue_.mo71084c());
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo73253d0(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo73250a0(5, this.isInstanceTypeId_);
        }
        for (int i = 0; i < this.andArgument_.size(); i++) {
            codedOutputStream.mo73253d0(6, this.andArgument_.get(i));
        }
        for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
            codedOutputStream.mo73253d0(7, this.orArgument_.get(i2));
        }
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    private C13476h(C14495h.C14497b bVar) {
        super(bVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.mo73387n();
    }

    private C13476h(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    private C13476h(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        m86430V();
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
                    } else if (K == 16) {
                        this.bitField0_ |= 2;
                        this.valueParameterReference_ = eVar.mo73354s();
                    } else if (K == 24) {
                        int n = eVar.mo73349n();
                        C13479c b = C13479c.m86483b(n);
                        if (b == null) {
                            J.mo73264o0(K);
                            J.mo73264o0(n);
                        } else {
                            this.bitField0_ |= 4;
                            this.constantValue_ = b;
                        }
                    } else if (K == 34) {
                        C13508q.C13515c H0 = (this.bitField0_ & 8) == 8 ? this.isInstanceType_.mo71014b() : null;
                        C13508q qVar = (C13508q) eVar.mo73356u(C13508q.f61718c, fVar);
                        this.isInstanceType_ = qVar;
                        if (H0 != null) {
                            H0.mo71036o(qVar);
                            this.isInstanceType_ = H0.mo71497x();
                        }
                        this.bitField0_ |= 8;
                    } else if (K == 40) {
                        this.bitField0_ |= 16;
                        this.isInstanceTypeId_ = eVar.mo73354s();
                    } else if (K == 50) {
                        if (!(z2 & true)) {
                            this.andArgument_ = new ArrayList();
                            z2 |= true;
                        }
                        this.andArgument_.add(eVar.mo73356u(f61623c, fVar));
                    } else if (K == 58) {
                        if (!(z2 & true)) {
                            this.orArgument_ = new ArrayList();
                            z2 |= true;
                        }
                        this.orArgument_.add(eVar.mo73356u(f61623c, fVar));
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
                    this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                }
                if (z2 & true) {
                    this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
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
            this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
        }
        if (z2 & true) {
            this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
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
