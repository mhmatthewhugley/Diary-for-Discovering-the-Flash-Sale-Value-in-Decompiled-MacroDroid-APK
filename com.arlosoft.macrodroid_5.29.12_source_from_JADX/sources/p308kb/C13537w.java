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

/* renamed from: kb.w */
/* compiled from: ProtoBuf */
public final class C13537w extends C14495h implements C14518p {

    /* renamed from: a */
    private static final C13537w f61805a;

    /* renamed from: c */
    public static C14519q<C13537w> f61806c = new C13538a();
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<C13530v> requirement_;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;

    /* renamed from: kb.w$a */
    /* compiled from: ProtoBuf */
    static class C13538a extends C14481b<C13537w> {
        C13538a() {
        }

        /* renamed from: m */
        public C13537w mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13537w(eVar, fVar);
        }
    }

    /* renamed from: kb.w$b */
    /* compiled from: ProtoBuf */
    public static final class C13539b extends C14495h.C14497b<C13537w, C13539b> implements C14518p {

        /* renamed from: c */
        private int f61807c;

        /* renamed from: d */
        private List<C13530v> f61808d = Collections.emptyList();

        private C13539b() {
            m87329x();
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public static C13539b m87327u() {
            return new C13539b();
        }

        /* renamed from: v */
        private void m87328v() {
            if ((this.f61807c & 1) != 1) {
                this.f61808d = new ArrayList(this.f61808d);
                this.f61807c |= 1;
            }
        }

        /* renamed from: x */
        private void m87329x() {
        }

        /* renamed from: r */
        public C13537w build() {
            C13537w s = mo71634s();
            if (s.mo71013a()) {
                return s;
            }
            throw C14478a.C14479a.m90815k(s);
        }

        /* renamed from: s */
        public C13537w mo71634s() {
            C13537w wVar = new C13537w((C14495h.C14497b) this);
            if ((this.f61807c & 1) == 1) {
                this.f61808d = Collections.unmodifiableList(this.f61808d);
                this.f61807c &= -2;
            }
            List unused = wVar.requirement_ = this.f61808d;
            return wVar;
        }

        /* renamed from: t */
        public C13539b mo71035l() {
            return m87327u().mo71036o(mo71634s());
        }

        /* renamed from: y */
        public C13539b mo71036o(C13537w wVar) {
            if (wVar == C13537w.m87312w()) {
                return this;
            }
            if (!wVar.requirement_.isEmpty()) {
                if (this.f61808d.isEmpty()) {
                    this.f61808d = wVar.requirement_;
                    this.f61807c &= -2;
                } else {
                    m87328v();
                    this.f61808d.addAll(wVar.requirement_);
                }
            }
            mo73388p(mo73387n().mo73309d(wVar.unknownFields));
            return this;
        }

        /* renamed from: z */
        public C13539b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13537w wVar;
            C13537w wVar2 = null;
            try {
                C13537w c = C13537w.f61806c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                wVar = (C13537w) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                wVar2 = wVar;
            }
            if (wVar2 != null) {
                mo71036o(wVar2);
            }
            throw th;
        }
    }

    static {
        C13537w wVar = new C13537w(true);
        f61805a = wVar;
        wVar.m87313z();
    }

    /* renamed from: A */
    public static C13539b m87307A() {
        return C13539b.m87327u();
    }

    /* renamed from: B */
    public static C13539b m87308B(C13537w wVar) {
        return m87307A().mo71036o(wVar);
    }

    /* renamed from: w */
    public static C13537w m87312w() {
        return f61805a;
    }

    /* renamed from: z */
    private void m87313z() {
        this.requirement_ = Collections.emptyList();
    }

    /* renamed from: C */
    public C13539b mo71016d() {
        return m87307A();
    }

    /* renamed from: D */
    public C13539b mo71014b() {
        return m87308B(this);
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
        for (int i3 = 0; i3 < this.requirement_.size(); i3++) {
            i2 += CodedOutputStream.m90751s(1, this.requirement_.get(i3));
        }
        int size = i2 + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    /* renamed from: f */
    public C14519q<C13537w> mo71017f() {
        return f61806c;
    }

    /* renamed from: g */
    public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
        mo71015c();
        for (int i = 0; i < this.requirement_.size(); i++) {
            codedOutputStream.mo73253d0(1, this.requirement_.get(i));
        }
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    /* renamed from: x */
    public int mo71630x() {
        return this.requirement_.size();
    }

    /* renamed from: y */
    public List<C13530v> mo71631y() {
        return this.requirement_;
    }

    private C13537w(C14495h.C14497b bVar) {
        super(bVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.mo73387n();
    }

    private C13537w(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    private C13537w(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        m87313z();
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
                            this.requirement_ = new ArrayList();
                            z2 |= true;
                        }
                        this.requirement_.add(eVar.mo73356u(C13530v.f61787c, fVar));
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
                    this.requirement_ = Collections.unmodifiableList(this.requirement_);
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
            this.requirement_ = Collections.unmodifiableList(this.requirement_);
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
