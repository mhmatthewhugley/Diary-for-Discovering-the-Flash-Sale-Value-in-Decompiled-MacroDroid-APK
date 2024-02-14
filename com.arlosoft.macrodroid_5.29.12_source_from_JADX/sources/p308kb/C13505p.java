package p308kb;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.C14478a;
import kotlin.reflect.jvm.internal.impl.protobuf.C14481b;
import kotlin.reflect.jvm.internal.impl.protobuf.C14485d;
import kotlin.reflect.jvm.internal.impl.protobuf.C14488e;
import kotlin.reflect.jvm.internal.impl.protobuf.C14490f;
import kotlin.reflect.jvm.internal.impl.protobuf.C14495h;
import kotlin.reflect.jvm.internal.impl.protobuf.C14511l;
import kotlin.reflect.jvm.internal.impl.protobuf.C14512m;
import kotlin.reflect.jvm.internal.impl.protobuf.C14518p;
import kotlin.reflect.jvm.internal.impl.protobuf.C14519q;
import kotlin.reflect.jvm.internal.impl.protobuf.C14520r;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kb.p */
/* compiled from: ProtoBuf */
public final class C13505p extends C14495h implements C14518p {

    /* renamed from: a */
    private static final C13505p f61713a;

    /* renamed from: c */
    public static C14519q<C13505p> f61714c = new C13506a();
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public C14512m string_;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;

    /* renamed from: kb.p$a */
    /* compiled from: ProtoBuf */
    static class C13506a extends C14481b<C13505p> {
        C13506a() {
        }

        /* renamed from: m */
        public C13505p mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13505p(eVar, fVar);
        }
    }

    /* renamed from: kb.p$b */
    /* compiled from: ProtoBuf */
    public static final class C13507b extends C14495h.C14497b<C13505p, C13507b> implements C14518p {

        /* renamed from: c */
        private int f61715c;

        /* renamed from: d */
        private C14512m f61716d = C14511l.f63388c;

        private C13507b() {
            m86882x();
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public static C13507b m86880u() {
            return new C13507b();
        }

        /* renamed from: v */
        private void m86881v() {
            if ((this.f61715c & 1) != 1) {
                this.f61716d = new C14511l(this.f61716d);
                this.f61715c |= 1;
            }
        }

        /* renamed from: x */
        private void m86882x() {
        }

        /* renamed from: r */
        public C13505p build() {
            C13505p s = mo71426s();
            if (s.mo71013a()) {
                return s;
            }
            throw C14478a.C14479a.m90815k(s);
        }

        /* renamed from: s */
        public C13505p mo71426s() {
            C13505p pVar = new C13505p((C14495h.C14497b) this);
            if ((this.f61715c & 1) == 1) {
                this.f61716d = this.f61716d.mo73423L();
                this.f61715c &= -2;
            }
            C14512m unused = pVar.string_ = this.f61716d;
            return pVar;
        }

        /* renamed from: t */
        public C13507b mo71035l() {
            return m86880u().mo71036o(mo71426s());
        }

        /* renamed from: y */
        public C13507b mo71036o(C13505p pVar) {
            if (pVar == C13505p.m86865w()) {
                return this;
            }
            if (!pVar.string_.isEmpty()) {
                if (this.f61716d.isEmpty()) {
                    this.f61716d = pVar.string_;
                    this.f61715c &= -2;
                } else {
                    m86881v();
                    this.f61716d.addAll(pVar.string_);
                }
            }
            mo73388p(mo73387n().mo73309d(pVar.unknownFields));
            return this;
        }

        /* renamed from: z */
        public C13507b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13505p pVar;
            C13505p pVar2 = null;
            try {
                C13505p c = C13505p.f61714c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                pVar = (C13505p) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                pVar2 = pVar;
            }
            if (pVar2 != null) {
                mo71036o(pVar2);
            }
            throw th;
        }
    }

    static {
        C13505p pVar = new C13505p(true);
        f61713a = pVar;
        pVar.m86866z();
    }

    /* renamed from: A */
    public static C13507b m86860A() {
        return C13507b.m86880u();
    }

    /* renamed from: B */
    public static C13507b m86861B(C13505p pVar) {
        return m86860A().mo71036o(pVar);
    }

    /* renamed from: w */
    public static C13505p m86865w() {
        return f61713a;
    }

    /* renamed from: z */
    private void m86866z() {
        this.string_ = C14511l.f63388c;
    }

    /* renamed from: C */
    public C13507b mo71016d() {
        return m86860A();
    }

    /* renamed from: D */
    public C13507b mo71014b() {
        return m86861B(this);
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
        for (int i3 = 0; i3 < this.string_.size(); i3++) {
            i2 += CodedOutputStream.m90737e(this.string_.mo73422G0(i3));
        }
        int size = 0 + i2 + (mo71423y().size() * 1) + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    /* renamed from: f */
    public C14519q<C13505p> mo71017f() {
        return f61714c;
    }

    /* renamed from: g */
    public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
        mo71015c();
        for (int i = 0; i < this.string_.size(); i++) {
            codedOutputStream.mo73238O(1, this.string_.mo73422G0(i));
        }
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    /* renamed from: x */
    public String mo71422x(int i) {
        return (String) this.string_.get(i);
    }

    /* renamed from: y */
    public C14520r mo71423y() {
        return this.string_;
    }

    private C13505p(C14495h.C14497b bVar) {
        super(bVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.mo73387n();
    }

    private C13505p(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    private C13505p(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        m86866z();
        C14485d.C14487b s = C14485d.m90840s();
        CodedOutputStream J = CodedOutputStream.m90731J(s, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int K = eVar.mo73335K();
                if (K != 0) {
                    if (K == 10) {
                        C14485d l = eVar.mo73347l();
                        if (!z2 || !true) {
                            this.string_ = new C14511l();
                            z2 |= true;
                        }
                        this.string_.mo73424Y0(l);
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
                    this.string_ = this.string_.mo73423L();
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
            this.string_ = this.string_.mo73423L();
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
