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

/* renamed from: kb.g */
/* compiled from: ProtoBuf */
public final class C13473g extends C14495h.C14499d<C13473g> {

    /* renamed from: a */
    private static final C13473g f61618a;

    /* renamed from: c */
    public static C14519q<C13473g> f61619c = new C13474a();
    /* access modifiers changed from: private */
    public int bitField0_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public int name_;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;

    /* renamed from: kb.g$a */
    /* compiled from: ProtoBuf */
    static class C13474a extends C14481b<C13473g> {
        C13474a() {
        }

        /* renamed from: m */
        public C13473g mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13473g(eVar, fVar);
        }
    }

    /* renamed from: kb.g$b */
    /* compiled from: ProtoBuf */
    public static final class C13475b extends C14495h.C14498c<C13473g, C13475b> {

        /* renamed from: f */
        private int f61620f;

        /* renamed from: g */
        private int f61621g;

        private C13475b() {
            m86412A();
        }

        /* renamed from: A */
        private void m86412A() {
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public static C13475b m86414z() {
            return new C13475b();
        }

        /* renamed from: B */
        public C13475b mo71036o(C13473g gVar) {
            if (gVar == C13473g.m86394F()) {
                return this;
            }
            if (gVar.mo71213I()) {
                mo71219D(gVar.mo71212H());
            }
            mo73389t(gVar);
            mo73388p(mo73387n().mo73309d(gVar.unknownFields));
            return this;
        }

        /* renamed from: C */
        public C13475b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13473g gVar;
            C13473g gVar2 = null;
            try {
                C13473g c = C13473g.f61619c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                gVar = (C13473g) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                gVar2 = gVar;
            }
            if (gVar2 != null) {
                mo71036o(gVar2);
            }
            throw th;
        }

        /* renamed from: D */
        public C13475b mo71219D(int i) {
            this.f61620f |= 1;
            this.f61621g = i;
            return this;
        }

        /* renamed from: v */
        public C13473g build() {
            C13473g x = mo71221x();
            if (x.mo71013a()) {
                return x;
            }
            throw C14478a.C14479a.m90815k(x);
        }

        /* renamed from: x */
        public C13473g mo71221x() {
            C13473g gVar = new C13473g((C14495h.C14498c) this);
            int i = 1;
            if ((this.f61620f & 1) != 1) {
                i = 0;
            }
            int unused = gVar.name_ = this.f61621g;
            int unused2 = gVar.bitField0_ = i;
            return gVar;
        }

        /* renamed from: y */
        public C13475b mo71035l() {
            return m86414z().mo71036o(mo71221x());
        }
    }

    static {
        C13473g gVar = new C13473g(true);
        f61618a = gVar;
        gVar.m86395J();
    }

    /* renamed from: F */
    public static C13473g m86394F() {
        return f61618a;
    }

    /* renamed from: J */
    private void m86395J() {
        this.name_ = 0;
    }

    /* renamed from: L */
    public static C13475b m86396L() {
        return C13475b.m86414z();
    }

    /* renamed from: M */
    public static C13475b m86397M(C13473g gVar) {
        return m86396L().mo71036o(gVar);
    }

    /* renamed from: G */
    public C13473g mo71124e() {
        return f61618a;
    }

    /* renamed from: H */
    public int mo71212H() {
        return this.name_;
    }

    /* renamed from: I */
    public boolean mo71213I() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: N */
    public C13475b mo71016d() {
        return m86396L();
    }

    /* renamed from: O */
    public C13475b mo71014b() {
        return m86397M(this);
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
        int i2 = 0;
        if ((this.bitField0_ & 1) == 1) {
            i2 = 0 + CodedOutputStream.m90747o(1, this.name_);
        }
        int v = i2 + mo73392v() + this.unknownFields.size();
        this.memoizedSerializedSize = v;
        return v;
    }

    /* renamed from: f */
    public C14519q<C13473g> mo71017f() {
        return f61619c;
    }

    /* renamed from: g */
    public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
        mo71015c();
        C14495h.C14499d<MessageType>.a A = mo73390A();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo73250a0(1, this.name_);
        }
        A.mo73397a(200, codedOutputStream);
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    private C13473g(C14495h.C14498c<C13473g, ?> cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo73387n();
    }

    private C13473g(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    private C13473g(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        m86395J();
        C14485d.C14487b s = C14485d.m90840s();
        CodedOutputStream J = CodedOutputStream.m90731J(s, 1);
        boolean z = false;
        while (!z) {
            try {
                int K = eVar.mo73335K();
                if (K != 0) {
                    if (K == 8) {
                        this.bitField0_ |= 1;
                        this.name_ = eVar.mo73354s();
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
