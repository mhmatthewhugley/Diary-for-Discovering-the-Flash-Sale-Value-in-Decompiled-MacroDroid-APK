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

/* renamed from: kb.o */
/* compiled from: ProtoBuf */
public final class C13497o extends C14495h implements C14518p {

    /* renamed from: a */
    private static final C13497o f61698a;

    /* renamed from: c */
    public static C14519q<C13497o> f61699c = new C13498a();
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<C13500c> qualifiedName_;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;

    /* renamed from: kb.o$a */
    /* compiled from: ProtoBuf */
    static class C13498a extends C14481b<C13497o> {
        C13498a() {
        }

        /* renamed from: m */
        public C13497o mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13497o(eVar, fVar);
        }
    }

    /* renamed from: kb.o$b */
    /* compiled from: ProtoBuf */
    public static final class C13499b extends C14495h.C14497b<C13497o, C13499b> implements C14518p {

        /* renamed from: c */
        private int f61700c;

        /* renamed from: d */
        private List<C13500c> f61701d = Collections.emptyList();

        private C13499b() {
            m86806x();
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public static C13499b m86804u() {
            return new C13499b();
        }

        /* renamed from: v */
        private void m86805v() {
            if ((this.f61700c & 1) != 1) {
                this.f61701d = new ArrayList(this.f61701d);
                this.f61700c |= 1;
            }
        }

        /* renamed from: x */
        private void m86806x() {
        }

        /* renamed from: r */
        public C13497o build() {
            C13497o s = mo71398s();
            if (s.mo71013a()) {
                return s;
            }
            throw C14478a.C14479a.m90815k(s);
        }

        /* renamed from: s */
        public C13497o mo71398s() {
            C13497o oVar = new C13497o((C14495h.C14497b) this);
            if ((this.f61700c & 1) == 1) {
                this.f61701d = Collections.unmodifiableList(this.f61701d);
                this.f61700c &= -2;
            }
            List unused = oVar.qualifiedName_ = this.f61701d;
            return oVar;
        }

        /* renamed from: t */
        public C13499b mo71035l() {
            return m86804u().mo71036o(mo71398s());
        }

        /* renamed from: y */
        public C13499b mo71036o(C13497o oVar) {
            if (oVar == C13497o.m86789w()) {
                return this;
            }
            if (!oVar.qualifiedName_.isEmpty()) {
                if (this.f61701d.isEmpty()) {
                    this.f61701d = oVar.qualifiedName_;
                    this.f61700c &= -2;
                } else {
                    m86805v();
                    this.f61701d.addAll(oVar.qualifiedName_);
                }
            }
            mo73388p(mo73387n().mo73309d(oVar.unknownFields));
            return this;
        }

        /* renamed from: z */
        public C13499b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13497o oVar;
            C13497o oVar2 = null;
            try {
                C13497o c = C13497o.f61699c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                oVar = (C13497o) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                oVar2 = oVar;
            }
            if (oVar2 != null) {
                mo71036o(oVar2);
            }
            throw th;
        }
    }

    static {
        C13497o oVar = new C13497o(true);
        f61698a = oVar;
        oVar.m86790z();
    }

    /* renamed from: A */
    public static C13499b m86784A() {
        return C13499b.m86804u();
    }

    /* renamed from: B */
    public static C13499b m86785B(C13497o oVar) {
        return m86784A().mo71036o(oVar);
    }

    /* renamed from: w */
    public static C13497o m86789w() {
        return f61698a;
    }

    /* renamed from: z */
    private void m86790z() {
        this.qualifiedName_ = Collections.emptyList();
    }

    /* renamed from: C */
    public C13499b mo71016d() {
        return m86784A();
    }

    /* renamed from: D */
    public C13499b mo71014b() {
        return m86785B(this);
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
        for (int i = 0; i < mo71395y(); i++) {
            if (!mo71394x(i).mo71013a()) {
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
        int i2 = 0;
        for (int i3 = 0; i3 < this.qualifiedName_.size(); i3++) {
            i2 += CodedOutputStream.m90751s(1, this.qualifiedName_.get(i3));
        }
        int size = i2 + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    /* renamed from: f */
    public C14519q<C13497o> mo71017f() {
        return f61699c;
    }

    /* renamed from: g */
    public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
        mo71015c();
        for (int i = 0; i < this.qualifiedName_.size(); i++) {
            codedOutputStream.mo73253d0(1, this.qualifiedName_.get(i));
        }
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    /* renamed from: x */
    public C13500c mo71394x(int i) {
        return this.qualifiedName_.get(i);
    }

    /* renamed from: y */
    public int mo71395y() {
        return this.qualifiedName_.size();
    }

    /* renamed from: kb.o$c */
    /* compiled from: ProtoBuf */
    public static final class C13500c extends C14495h implements C14518p {

        /* renamed from: a */
        private static final C13500c f61702a;

        /* renamed from: c */
        public static C14519q<C13500c> f61703c = new C13501a();
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public C13503c kind_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int parentQualifiedName_;
        /* access modifiers changed from: private */
        public int shortName_;
        /* access modifiers changed from: private */
        public final C14485d unknownFields;

        /* renamed from: kb.o$c$a */
        /* compiled from: ProtoBuf */
        static class C13501a extends C14481b<C13500c> {
            C13501a() {
            }

            /* renamed from: m */
            public C13500c mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
                return new C13500c(eVar, fVar);
            }
        }

        /* renamed from: kb.o$c$b */
        /* compiled from: ProtoBuf */
        public static final class C13502b extends C14495h.C14497b<C13500c, C13502b> implements C14518p {

            /* renamed from: c */
            private int f61704c;

            /* renamed from: d */
            private int f61705d = -1;

            /* renamed from: f */
            private int f61706f;

            /* renamed from: g */
            private C13503c f61707g = C13503c.PACKAGE;

            private C13502b() {
                m86843v();
            }

            /* access modifiers changed from: private */
            /* renamed from: u */
            public static C13502b m86842u() {
                return new C13502b();
            }

            /* renamed from: v */
            private void m86843v() {
            }

            /* renamed from: A */
            public C13502b mo71411A(int i) {
                this.f61704c |= 1;
                this.f61705d = i;
                return this;
            }

            /* renamed from: B */
            public C13502b mo71412B(int i) {
                this.f61704c |= 2;
                this.f61706f = i;
                return this;
            }

            /* renamed from: r */
            public C13500c build() {
                C13500c s = mo71414s();
                if (s.mo71013a()) {
                    return s;
                }
                throw C14478a.C14479a.m90815k(s);
            }

            /* renamed from: s */
            public C13500c mo71414s() {
                C13500c cVar = new C13500c((C14495h.C14497b) this);
                int i = this.f61704c;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = cVar.parentQualifiedName_ = this.f61705d;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                int unused2 = cVar.shortName_ = this.f61706f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                C13503c unused3 = cVar.kind_ = this.f61707g;
                int unused4 = cVar.bitField0_ = i2;
                return cVar;
            }

            /* renamed from: t */
            public C13502b mo71035l() {
                return m86842u().mo71036o(mo71414s());
            }

            /* renamed from: x */
            public C13502b mo71036o(C13500c cVar) {
                if (cVar == C13500c.m86824y()) {
                    return this;
                }
                if (cVar.mo71405D()) {
                    mo71411A(cVar.mo71402A());
                }
                if (cVar.mo71406E()) {
                    mo71412B(cVar.mo71403B());
                }
                if (cVar.mo71404C()) {
                    mo71418z(cVar.mo71409z());
                }
                mo73388p(mo73387n().mo73309d(cVar.unknownFields));
                return this;
            }

            /* renamed from: y */
            public C13502b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
                C13500c cVar;
                C13500c cVar2 = null;
                try {
                    C13500c c = C13500c.f61703c.mo71021c(eVar, fVar);
                    if (c != null) {
                        mo71036o(c);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    cVar = (C13500c) e.mo73276a();
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

            /* renamed from: z */
            public C13502b mo71418z(C13503c cVar) {
                Objects.requireNonNull(cVar);
                this.f61704c |= 4;
                this.f61707g = cVar;
                return this;
            }
        }

        /* renamed from: kb.o$c$c */
        /* compiled from: ProtoBuf */
        public enum C13503c implements C14503i.C14504a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);
            

            /* renamed from: f */
            private static C14503i.C14505b<C13503c> f61711f;
            private final int value;

            /* renamed from: kb.o$c$c$a */
            /* compiled from: ProtoBuf */
            static class C13504a implements C14503i.C14505b<C13503c> {
                C13504a() {
                }

                /* renamed from: b */
                public C13503c mo71085a(int i) {
                    return C13503c.m86856b(i);
                }
            }

            static {
                f61711f = new C13504a();
            }

            private C13503c(int i, int i2) {
                this.value = i2;
            }

            /* renamed from: b */
            public static C13503c m86856b(int i) {
                if (i == 0) {
                    return CLASS;
                }
                if (i == 1) {
                    return PACKAGE;
                }
                if (i != 2) {
                    return null;
                }
                return LOCAL;
            }

            /* renamed from: c */
            public final int mo71084c() {
                return this.value;
            }
        }

        static {
            C13500c cVar = new C13500c(true);
            f61702a = cVar;
            cVar.m86816F();
        }

        /* renamed from: F */
        private void m86816F() {
            this.parentQualifiedName_ = -1;
            this.shortName_ = 0;
            this.kind_ = C13503c.PACKAGE;
        }

        /* renamed from: G */
        public static C13502b m86817G() {
            return C13502b.m86842u();
        }

        /* renamed from: H */
        public static C13502b m86818H(C13500c cVar) {
            return m86817G().mo71036o(cVar);
        }

        /* renamed from: y */
        public static C13500c m86824y() {
            return f61702a;
        }

        /* renamed from: A */
        public int mo71402A() {
            return this.parentQualifiedName_;
        }

        /* renamed from: B */
        public int mo71403B() {
            return this.shortName_;
        }

        /* renamed from: C */
        public boolean mo71404C() {
            return (this.bitField0_ & 4) == 4;
        }

        /* renamed from: D */
        public boolean mo71405D() {
            return (this.bitField0_ & 1) == 1;
        }

        /* renamed from: E */
        public boolean mo71406E() {
            return (this.bitField0_ & 2) == 2;
        }

        /* renamed from: I */
        public C13502b mo71016d() {
            return m86817G();
        }

        /* renamed from: J */
        public C13502b mo71014b() {
            return m86818H(this);
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
            if (!mo71406E()) {
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
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.m90747o(1, this.parentQualifiedName_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.m90747o(2, this.shortName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.m90740h(3, this.kind_.mo71084c());
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        /* renamed from: f */
        public C14519q<C13500c> mo71017f() {
            return f61703c;
        }

        /* renamed from: g */
        public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
            mo71015c();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo73250a0(1, this.parentQualifiedName_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo73250a0(2, this.shortName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.mo73242S(3, this.kind_.mo71084c());
            }
            codedOutputStream.mo73258i0(this.unknownFields);
        }

        /* renamed from: z */
        public C13503c mo71409z() {
            return this.kind_;
        }

        private C13500c(C14495h.C14497b bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.mo73387n();
        }

        private C13500c(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = C14485d.f63329a;
        }

        private C13500c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            m86816F();
            C14485d.C14487b s = C14485d.m90840s();
            CodedOutputStream J = CodedOutputStream.m90731J(s, 1);
            boolean z = false;
            while (!z) {
                try {
                    int K = eVar.mo73335K();
                    if (K != 0) {
                        if (K == 8) {
                            this.bitField0_ |= 1;
                            this.parentQualifiedName_ = eVar.mo73354s();
                        } else if (K == 16) {
                            this.bitField0_ |= 2;
                            this.shortName_ = eVar.mo73354s();
                        } else if (K == 24) {
                            int n = eVar.mo73349n();
                            C13503c b = C13503c.m86856b(n);
                            if (b == null) {
                                J.mo73264o0(K);
                                J.mo73264o0(n);
                            } else {
                                this.bitField0_ |= 4;
                                this.kind_ = b;
                            }
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

    private C13497o(C14495h.C14497b bVar) {
        super(bVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.mo73387n();
    }

    private C13497o(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    private C13497o(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        m86790z();
        C14485d.C14487b s = C14485d.m90840s();
        CodedOutputStream J = CodedOutputStream.m90731J(s, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int K = eVar.mo73335K();
                if (K != 0) {
                    if (K == 10) {
                        if (!z2 || !true) {
                            this.qualifiedName_ = new ArrayList();
                            z2 |= true;
                        }
                        this.qualifiedName_.add(eVar.mo73356u(C13500c.f61703c, fVar));
                    } else if (!mo73386q(eVar, J, fVar, K)) {
                    }
                }
                z = true;
            } catch (InvalidProtocolBufferException e) {
                throw e.mo73277i(this);
            } catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2.getMessage()).mo73277i(this);
            } catch (Throwable th) {
                if (z2 && true) {
                    this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
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
            this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
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
