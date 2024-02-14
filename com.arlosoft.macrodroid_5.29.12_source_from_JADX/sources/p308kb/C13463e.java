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
import kotlin.reflect.jvm.internal.impl.protobuf.C14518p;
import kotlin.reflect.jvm.internal.impl.protobuf.C14519q;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kb.e */
/* compiled from: ProtoBuf */
public final class C13463e extends C14495h implements C14518p {

    /* renamed from: a */
    private static final C13463e f61597a;

    /* renamed from: c */
    public static C14519q<C13463e> f61598c = new C13464a();
    /* access modifiers changed from: private */
    public List<C13466f> effect_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;

    /* renamed from: kb.e$a */
    /* compiled from: ProtoBuf */
    static class C13464a extends C14481b<C13463e> {
        C13464a() {
        }

        /* renamed from: m */
        public C13463e mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13463e(eVar, fVar);
        }
    }

    /* renamed from: kb.e$b */
    /* compiled from: ProtoBuf */
    public static final class C13465b extends C14495h.C14497b<C13463e, C13465b> implements C14518p {

        /* renamed from: c */
        private int f61599c;

        /* renamed from: d */
        private List<C13466f> f61600d = Collections.emptyList();

        private C13465b() {
            m86328x();
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public static C13465b m86326u() {
            return new C13465b();
        }

        /* renamed from: v */
        private void m86327v() {
            if ((this.f61599c & 1) != 1) {
                this.f61600d = new ArrayList(this.f61600d);
                this.f61599c |= 1;
            }
        }

        /* renamed from: x */
        private void m86328x() {
        }

        /* renamed from: r */
        public C13463e build() {
            C13463e s = mo71186s();
            if (s.mo71013a()) {
                return s;
            }
            throw C14478a.C14479a.m90815k(s);
        }

        /* renamed from: s */
        public C13463e mo71186s() {
            C13463e eVar = new C13463e((C14495h.C14497b) this);
            if ((this.f61599c & 1) == 1) {
                this.f61600d = Collections.unmodifiableList(this.f61600d);
                this.f61599c &= -2;
            }
            List unused = eVar.effect_ = this.f61600d;
            return eVar;
        }

        /* renamed from: t */
        public C13465b mo71035l() {
            return m86326u().mo71036o(mo71186s());
        }

        /* renamed from: y */
        public C13465b mo71036o(C13463e eVar) {
            if (eVar == C13463e.m86311w()) {
                return this;
            }
            if (!eVar.effect_.isEmpty()) {
                if (this.f61600d.isEmpty()) {
                    this.f61600d = eVar.effect_;
                    this.f61599c &= -2;
                } else {
                    m86327v();
                    this.f61600d.addAll(eVar.effect_);
                }
            }
            mo73388p(mo73387n().mo73309d(eVar.unknownFields));
            return this;
        }

        /* renamed from: z */
        public C13465b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13463e eVar2;
            C13463e eVar3 = null;
            try {
                C13463e c = C13463e.f61598c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                eVar2 = (C13463e) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                eVar3 = eVar2;
            }
            if (eVar3 != null) {
                mo71036o(eVar3);
            }
            throw th;
        }
    }

    static {
        C13463e eVar = new C13463e(true);
        f61597a = eVar;
        eVar.m86312z();
    }

    /* renamed from: A */
    public static C13465b m86306A() {
        return C13465b.m86326u();
    }

    /* renamed from: B */
    public static C13465b m86307B(C13463e eVar) {
        return m86306A().mo71036o(eVar);
    }

    /* renamed from: w */
    public static C13463e m86311w() {
        return f61597a;
    }

    /* renamed from: z */
    private void m86312z() {
        this.effect_ = Collections.emptyList();
    }

    /* renamed from: C */
    public C13465b mo71016d() {
        return m86306A();
    }

    /* renamed from: D */
    public C13465b mo71014b() {
        return m86307B(this);
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
        for (int i = 0; i < mo71183y(); i++) {
            if (!mo71182x(i).mo71013a()) {
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
        for (int i3 = 0; i3 < this.effect_.size(); i3++) {
            i2 += CodedOutputStream.m90751s(1, this.effect_.get(i3));
        }
        int size = i2 + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    /* renamed from: f */
    public C14519q<C13463e> mo71017f() {
        return f61598c;
    }

    /* renamed from: g */
    public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
        mo71015c();
        for (int i = 0; i < this.effect_.size(); i++) {
            codedOutputStream.mo73253d0(1, this.effect_.get(i));
        }
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    /* renamed from: x */
    public C13466f mo71182x(int i) {
        return this.effect_.get(i);
    }

    /* renamed from: y */
    public int mo71183y() {
        return this.effect_.size();
    }

    private C13463e(C14495h.C14497b bVar) {
        super(bVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.mo73387n();
    }

    private C13463e(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    private C13463e(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        m86312z();
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
                            this.effect_ = new ArrayList();
                            z2 |= true;
                        }
                        this.effect_.add(eVar.mo73356u(C13466f.f61602c, fVar));
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
                    this.effect_ = Collections.unmodifiableList(this.effect_);
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
            this.effect_ = Collections.unmodifiableList(this.effect_);
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
