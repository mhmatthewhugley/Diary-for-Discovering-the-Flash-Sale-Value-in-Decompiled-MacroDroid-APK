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

/* renamed from: kb.t */
/* compiled from: ProtoBuf */
public final class C13524t extends C14495h implements C14518p {

    /* renamed from: a */
    private static final C13524t f61772a;

    /* renamed from: c */
    public static C14519q<C13524t> f61773c = new C13525a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int firstNullable_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<C13508q> type_;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;

    /* renamed from: kb.t$a */
    /* compiled from: ProtoBuf */
    static class C13525a extends C14481b<C13524t> {
        C13525a() {
        }

        /* renamed from: m */
        public C13524t mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13524t(eVar, fVar);
        }
    }

    /* renamed from: kb.t$b */
    /* compiled from: ProtoBuf */
    public static final class C13526b extends C14495h.C14497b<C13524t, C13526b> implements C14518p {

        /* renamed from: c */
        private int f61774c;

        /* renamed from: d */
        private List<C13508q> f61775d = Collections.emptyList();

        /* renamed from: f */
        private int f61776f = -1;

        private C13526b() {
            m87182x();
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public static C13526b m87180u() {
            return new C13526b();
        }

        /* renamed from: v */
        private void m87181v() {
            if ((this.f61774c & 1) != 1) {
                this.f61775d = new ArrayList(this.f61775d);
                this.f61774c |= 1;
            }
        }

        /* renamed from: x */
        private void m87182x() {
        }

        /* renamed from: A */
        public C13526b mo71567A(int i) {
            this.f61774c |= 2;
            this.f61776f = i;
            return this;
        }

        /* renamed from: r */
        public C13524t build() {
            C13524t s = mo71569s();
            if (s.mo71013a()) {
                return s;
            }
            throw C14478a.C14479a.m90815k(s);
        }

        /* renamed from: s */
        public C13524t mo71569s() {
            C13524t tVar = new C13524t((C14495h.C14497b) this);
            int i = this.f61774c;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f61775d = Collections.unmodifiableList(this.f61775d);
                this.f61774c &= -2;
            }
            List unused = tVar.type_ = this.f61775d;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            int unused2 = tVar.firstNullable_ = this.f61776f;
            int unused3 = tVar.bitField0_ = i2;
            return tVar;
        }

        /* renamed from: t */
        public C13526b mo71035l() {
            return m87180u().mo71036o(mo71569s());
        }

        /* renamed from: y */
        public C13526b mo71036o(C13524t tVar) {
            if (tVar == C13524t.m87163y()) {
                return this;
            }
            if (!tVar.type_.isEmpty()) {
                if (this.f61775d.isEmpty()) {
                    this.f61775d = tVar.type_;
                    this.f61774c &= -2;
                } else {
                    m87181v();
                    this.f61775d.addAll(tVar.type_);
                }
            }
            if (tVar.mo71562D()) {
                mo71567A(tVar.mo71565z());
            }
            mo73388p(mo73387n().mo73309d(tVar.unknownFields));
            return this;
        }

        /* renamed from: z */
        public C13526b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13524t tVar;
            C13524t tVar2 = null;
            try {
                C13524t c = C13524t.f61773c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                tVar = (C13524t) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                tVar2 = tVar;
            }
            if (tVar2 != null) {
                mo71036o(tVar2);
            }
            throw th;
        }
    }

    static {
        C13524t tVar = new C13524t(true);
        f61772a = tVar;
        tVar.m87155E();
    }

    /* renamed from: E */
    private void m87155E() {
        this.type_ = Collections.emptyList();
        this.firstNullable_ = -1;
    }

    /* renamed from: F */
    public static C13526b m87156F() {
        return C13526b.m87180u();
    }

    /* renamed from: G */
    public static C13526b m87157G(C13524t tVar) {
        return m87156F().mo71036o(tVar);
    }

    /* renamed from: y */
    public static C13524t m87163y() {
        return f61772a;
    }

    /* renamed from: A */
    public C13508q mo71559A(int i) {
        return this.type_.get(i);
    }

    /* renamed from: B */
    public int mo71560B() {
        return this.type_.size();
    }

    /* renamed from: C */
    public List<C13508q> mo71561C() {
        return this.type_;
    }

    /* renamed from: D */
    public boolean mo71562D() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: H */
    public C13526b mo71016d() {
        return m87156F();
    }

    /* renamed from: I */
    public C13526b mo71014b() {
        return m87157G(this);
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
        for (int i = 0; i < mo71560B(); i++) {
            if (!mo71559A(i).mo71013a()) {
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
        for (int i3 = 0; i3 < this.type_.size(); i3++) {
            i2 += CodedOutputStream.m90751s(1, this.type_.get(i3));
        }
        if ((this.bitField0_ & 1) == 1) {
            i2 += CodedOutputStream.m90747o(2, this.firstNullable_);
        }
        int size = i2 + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    /* renamed from: f */
    public C14519q<C13524t> mo71017f() {
        return f61773c;
    }

    /* renamed from: g */
    public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
        mo71015c();
        for (int i = 0; i < this.type_.size(); i++) {
            codedOutputStream.mo73253d0(1, this.type_.get(i));
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo73250a0(2, this.firstNullable_);
        }
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    /* renamed from: z */
    public int mo71565z() {
        return this.firstNullable_;
    }

    private C13524t(C14495h.C14497b bVar) {
        super(bVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.mo73387n();
    }

    private C13524t(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    private C13524t(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        m87155E();
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
                            this.type_ = new ArrayList();
                            z2 |= true;
                        }
                        this.type_.add(eVar.mo73356u(C13508q.f61718c, fVar));
                    } else if (K == 16) {
                        this.bitField0_ |= 1;
                        this.firstNullable_ = eVar.mo73354s();
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
                    this.type_ = Collections.unmodifiableList(this.type_);
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
            this.type_ = Collections.unmodifiableList(this.type_);
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
