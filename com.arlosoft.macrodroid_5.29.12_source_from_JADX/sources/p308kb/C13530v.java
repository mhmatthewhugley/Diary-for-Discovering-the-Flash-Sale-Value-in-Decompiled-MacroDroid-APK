package p308kb;

import java.io.IOException;
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

/* renamed from: kb.v */
/* compiled from: ProtoBuf */
public final class C13530v extends C14495h implements C14518p {

    /* renamed from: a */
    private static final C13530v f61786a;

    /* renamed from: c */
    public static C14519q<C13530v> f61787c = new C13531a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int errorCode_;
    /* access modifiers changed from: private */
    public C13533c level_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public int message_;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;
    /* access modifiers changed from: private */
    public int versionFull_;
    /* access modifiers changed from: private */
    public C13535d versionKind_;
    /* access modifiers changed from: private */
    public int version_;

    /* renamed from: kb.v$a */
    /* compiled from: ProtoBuf */
    static class C13531a extends C14481b<C13530v> {
        C13531a() {
        }

        /* renamed from: m */
        public C13530v mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13530v(eVar, fVar);
        }
    }

    /* renamed from: kb.v$b */
    /* compiled from: ProtoBuf */
    public static final class C13532b extends C14495h.C14497b<C13530v, C13532b> implements C14518p {

        /* renamed from: c */
        private int f61788c;

        /* renamed from: d */
        private int f61789d;

        /* renamed from: f */
        private int f61790f;

        /* renamed from: g */
        private C13533c f61791g = C13533c.ERROR;

        /* renamed from: o */
        private int f61792o;

        /* renamed from: p */
        private int f61793p;

        /* renamed from: s */
        private C13535d f61794s = C13535d.LANGUAGE_VERSION;

        private C13532b() {
            m87283v();
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public static C13532b m87282u() {
            return new C13532b();
        }

        /* renamed from: v */
        private void m87283v() {
        }

        /* renamed from: A */
        public C13532b mo71615A(C13533c cVar) {
            Objects.requireNonNull(cVar);
            this.f61788c |= 4;
            this.f61791g = cVar;
            return this;
        }

        /* renamed from: B */
        public C13532b mo71616B(int i) {
            this.f61788c |= 16;
            this.f61793p = i;
            return this;
        }

        /* renamed from: C */
        public C13532b mo71617C(int i) {
            this.f61788c |= 1;
            this.f61789d = i;
            return this;
        }

        /* renamed from: D */
        public C13532b mo71618D(int i) {
            this.f61788c |= 2;
            this.f61790f = i;
            return this;
        }

        /* renamed from: E */
        public C13532b mo71619E(C13535d dVar) {
            Objects.requireNonNull(dVar);
            this.f61788c |= 32;
            this.f61794s = dVar;
            return this;
        }

        /* renamed from: r */
        public C13530v build() {
            C13530v s = mo71621s();
            if (s.mo71013a()) {
                return s;
            }
            throw C14478a.C14479a.m90815k(s);
        }

        /* renamed from: s */
        public C13530v mo71621s() {
            C13530v vVar = new C13530v((C14495h.C14497b) this);
            int i = this.f61788c;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = vVar.version_ = this.f61789d;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = vVar.versionFull_ = this.f61790f;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            C13533c unused3 = vVar.level_ = this.f61791g;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            int unused4 = vVar.errorCode_ = this.f61792o;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            int unused5 = vVar.message_ = this.f61793p;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            C13535d unused6 = vVar.versionKind_ = this.f61794s;
            int unused7 = vVar.bitField0_ = i2;
            return vVar;
        }

        /* renamed from: t */
        public C13532b mo71035l() {
            return m87282u().mo71036o(mo71621s());
        }

        /* renamed from: x */
        public C13532b mo71036o(C13530v vVar) {
            if (vVar == C13530v.m87248B()) {
                return this;
            }
            if (vVar.mo71609M()) {
                mo71617C(vVar.mo71603F());
            }
            if (vVar.mo71610N()) {
                mo71618D(vVar.mo71604G());
            }
            if (vVar.mo71607J()) {
                mo71615A(vVar.mo71601D());
            }
            if (vVar.mo71606I()) {
                mo71625z(vVar.mo71600C());
            }
            if (vVar.mo71608L()) {
                mo71616B(vVar.mo71602E());
            }
            if (vVar.mo71611O()) {
                mo71619E(vVar.mo71605H());
            }
            mo73388p(mo73387n().mo73309d(vVar.unknownFields));
            return this;
        }

        /* renamed from: y */
        public C13532b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13530v vVar;
            C13530v vVar2 = null;
            try {
                C13530v c = C13530v.f61787c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                vVar = (C13530v) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                vVar2 = vVar;
            }
            if (vVar2 != null) {
                mo71036o(vVar2);
            }
            throw th;
        }

        /* renamed from: z */
        public C13532b mo71625z(int i) {
            this.f61788c |= 8;
            this.f61792o = i;
            return this;
        }
    }

    /* renamed from: kb.v$c */
    /* compiled from: ProtoBuf */
    public enum C13533c implements C14503i.C14504a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);
        

        /* renamed from: f */
        private static C14503i.C14505b<C13533c> f61798f;
        private final int value;

        /* renamed from: kb.v$c$a */
        /* compiled from: ProtoBuf */
        static class C13534a implements C14503i.C14505b<C13533c> {
            C13534a() {
            }

            /* renamed from: b */
            public C13533c mo71085a(int i) {
                return C13533c.m87299b(i);
            }
        }

        static {
            f61798f = new C13534a();
        }

        private C13533c(int i, int i2) {
            this.value = i2;
        }

        /* renamed from: b */
        public static C13533c m87299b(int i) {
            if (i == 0) {
                return WARNING;
            }
            if (i == 1) {
                return ERROR;
            }
            if (i != 2) {
                return null;
            }
            return HIDDEN;
        }

        /* renamed from: c */
        public final int mo71084c() {
            return this.value;
        }
    }

    /* renamed from: kb.v$d */
    /* compiled from: ProtoBuf */
    public enum C13535d implements C14503i.C14504a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);
        

        /* renamed from: f */
        private static C14503i.C14505b<C13535d> f61803f;
        private final int value;

        /* renamed from: kb.v$d$a */
        /* compiled from: ProtoBuf */
        static class C13536a implements C14503i.C14505b<C13535d> {
            C13536a() {
            }

            /* renamed from: b */
            public C13535d mo71085a(int i) {
                return C13535d.m87303b(i);
            }
        }

        static {
            f61803f = new C13536a();
        }

        private C13535d(int i, int i2) {
            this.value = i2;
        }

        /* renamed from: b */
        public static C13535d m87303b(int i) {
            if (i == 0) {
                return LANGUAGE_VERSION;
            }
            if (i == 1) {
                return COMPILER_VERSION;
            }
            if (i != 2) {
                return null;
            }
            return API_VERSION;
        }

        /* renamed from: c */
        public final int mo71084c() {
            return this.value;
        }
    }

    static {
        C13530v vVar = new C13530v(true);
        f61786a = vVar;
        vVar.m87249P();
    }

    /* renamed from: B */
    public static C13530v m87248B() {
        return f61786a;
    }

    /* renamed from: P */
    private void m87249P() {
        this.version_ = 0;
        this.versionFull_ = 0;
        this.level_ = C13533c.ERROR;
        this.errorCode_ = 0;
        this.message_ = 0;
        this.versionKind_ = C13535d.LANGUAGE_VERSION;
    }

    /* renamed from: Q */
    public static C13532b m87250Q() {
        return C13532b.m87282u();
    }

    /* renamed from: R */
    public static C13532b m87251R(C13530v vVar) {
        return m87250Q().mo71036o(vVar);
    }

    /* renamed from: C */
    public int mo71600C() {
        return this.errorCode_;
    }

    /* renamed from: D */
    public C13533c mo71601D() {
        return this.level_;
    }

    /* renamed from: E */
    public int mo71602E() {
        return this.message_;
    }

    /* renamed from: F */
    public int mo71603F() {
        return this.version_;
    }

    /* renamed from: G */
    public int mo71604G() {
        return this.versionFull_;
    }

    /* renamed from: H */
    public C13535d mo71605H() {
        return this.versionKind_;
    }

    /* renamed from: I */
    public boolean mo71606I() {
        return (this.bitField0_ & 8) == 8;
    }

    /* renamed from: J */
    public boolean mo71607J() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: L */
    public boolean mo71608L() {
        return (this.bitField0_ & 16) == 16;
    }

    /* renamed from: M */
    public boolean mo71609M() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: N */
    public boolean mo71610N() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: O */
    public boolean mo71611O() {
        return (this.bitField0_ & 32) == 32;
    }

    /* renamed from: T */
    public C13532b mo71016d() {
        return m87250Q();
    }

    /* renamed from: U */
    public C13532b mo71014b() {
        return m87251R(this);
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
            i2 = 0 + CodedOutputStream.m90747o(1, this.version_);
        }
        if ((this.bitField0_ & 2) == 2) {
            i2 += CodedOutputStream.m90747o(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i2 += CodedOutputStream.m90740h(3, this.level_.mo71084c());
        }
        if ((this.bitField0_ & 8) == 8) {
            i2 += CodedOutputStream.m90747o(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            i2 += CodedOutputStream.m90747o(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            i2 += CodedOutputStream.m90740h(6, this.versionKind_.mo71084c());
        }
        int size = i2 + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    /* renamed from: f */
    public C14519q<C13530v> mo71017f() {
        return f61787c;
    }

    /* renamed from: g */
    public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
        mo71015c();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo73250a0(1, this.version_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo73250a0(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo73242S(3, this.level_.mo71084c());
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo73250a0(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo73250a0(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.mo73242S(6, this.versionKind_.mo71084c());
        }
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    private C13530v(C14495h.C14497b bVar) {
        super(bVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.mo73387n();
    }

    private C13530v(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    private C13530v(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        m87249P();
        C14485d.C14487b s = C14485d.m90840s();
        CodedOutputStream J = CodedOutputStream.m90731J(s, 1);
        boolean z = false;
        while (!z) {
            try {
                int K = eVar.mo73335K();
                if (K != 0) {
                    if (K == 8) {
                        this.bitField0_ |= 1;
                        this.version_ = eVar.mo73354s();
                    } else if (K == 16) {
                        this.bitField0_ |= 2;
                        this.versionFull_ = eVar.mo73354s();
                    } else if (K == 24) {
                        int n = eVar.mo73349n();
                        C13533c b = C13533c.m87299b(n);
                        if (b == null) {
                            J.mo73264o0(K);
                            J.mo73264o0(n);
                        } else {
                            this.bitField0_ |= 4;
                            this.level_ = b;
                        }
                    } else if (K == 32) {
                        this.bitField0_ |= 8;
                        this.errorCode_ = eVar.mo73354s();
                    } else if (K == 40) {
                        this.bitField0_ |= 16;
                        this.message_ = eVar.mo73354s();
                    } else if (K == 48) {
                        int n2 = eVar.mo73349n();
                        C13535d b2 = C13535d.m87303b(n2);
                        if (b2 == null) {
                            J.mo73264o0(K);
                            J.mo73264o0(n2);
                        } else {
                            this.bitField0_ |= 32;
                            this.versionKind_ = b2;
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
