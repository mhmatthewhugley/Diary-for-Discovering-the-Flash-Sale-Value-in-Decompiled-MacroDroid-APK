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
import p308kb.C13476h;

/* renamed from: kb.f */
/* compiled from: ProtoBuf */
public final class C13466f extends C14495h implements C14518p {

    /* renamed from: a */
    private static final C13466f f61601a;

    /* renamed from: c */
    public static C14519q<C13466f> f61602c = new C13467a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public C13476h conclusionOfConditionalEffect_;
    /* access modifiers changed from: private */
    public List<C13476h> effectConstructorArgument_;
    /* access modifiers changed from: private */
    public C13469c effectType_;
    /* access modifiers changed from: private */
    public C13471d kind_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;

    /* renamed from: kb.f$a */
    /* compiled from: ProtoBuf */
    static class C13467a extends C14481b<C13466f> {
        C13467a() {
        }

        /* renamed from: m */
        public C13466f mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13466f(eVar, fVar);
        }
    }

    /* renamed from: kb.f$b */
    /* compiled from: ProtoBuf */
    public static final class C13468b extends C14495h.C14497b<C13466f, C13468b> implements C14518p {

        /* renamed from: c */
        private int f61603c;

        /* renamed from: d */
        private C13469c f61604d = C13469c.RETURNS_CONSTANT;

        /* renamed from: f */
        private List<C13476h> f61605f = Collections.emptyList();

        /* renamed from: g */
        private C13476h f61606g = C13476h.m86429H();

        /* renamed from: o */
        private C13471d f61607o = C13471d.AT_MOST_ONCE;

        private C13468b() {
            m86370x();
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public static C13468b m86368u() {
            return new C13468b();
        }

        /* renamed from: v */
        private void m86369v() {
            if ((this.f61603c & 2) != 2) {
                this.f61605f = new ArrayList(this.f61605f);
                this.f61603c |= 2;
            }
        }

        /* renamed from: x */
        private void m86370x() {
        }

        /* renamed from: A */
        public C13468b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13466f fVar2;
            C13466f fVar3 = null;
            try {
                C13466f c = C13466f.f61602c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                fVar2 = (C13466f) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                fVar3 = fVar2;
            }
            if (fVar3 != null) {
                mo71036o(fVar3);
            }
            throw th;
        }

        /* renamed from: B */
        public C13468b mo71202B(C13469c cVar) {
            Objects.requireNonNull(cVar);
            this.f61603c |= 1;
            this.f61604d = cVar;
            return this;
        }

        /* renamed from: C */
        public C13468b mo71203C(C13471d dVar) {
            Objects.requireNonNull(dVar);
            this.f61603c |= 8;
            this.f61607o = dVar;
            return this;
        }

        /* renamed from: r */
        public C13466f build() {
            C13466f s = mo71205s();
            if (s.mo71013a()) {
                return s;
            }
            throw C14478a.C14479a.m90815k(s);
        }

        /* renamed from: s */
        public C13466f mo71205s() {
            C13466f fVar = new C13466f((C14495h.C14497b) this);
            int i = this.f61603c;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            C13469c unused = fVar.effectType_ = this.f61604d;
            if ((this.f61603c & 2) == 2) {
                this.f61605f = Collections.unmodifiableList(this.f61605f);
                this.f61603c &= -3;
            }
            List unused2 = fVar.effectConstructorArgument_ = this.f61605f;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            C13476h unused3 = fVar.conclusionOfConditionalEffect_ = this.f61606g;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            C13471d unused4 = fVar.kind_ = this.f61607o;
            int unused5 = fVar.bitField0_ = i2;
            return fVar;
        }

        /* renamed from: t */
        public C13468b mo71035l() {
            return m86368u().mo71036o(mo71205s());
        }

        /* renamed from: y */
        public C13468b mo71207y(C13476h hVar) {
            if ((this.f61603c & 4) != 4 || this.f61606g == C13476h.m86429H()) {
                this.f61606g = hVar;
            } else {
                this.f61606g = C13476h.m86432X(this.f61606g).mo71036o(hVar).mo71247s();
            }
            this.f61603c |= 4;
            return this;
        }

        /* renamed from: z */
        public C13468b mo71036o(C13466f fVar) {
            if (fVar == C13466f.m86338B()) {
                return this;
            }
            if (fVar.mo71196H()) {
                mo71202B(fVar.mo71193E());
            }
            if (!fVar.effectConstructorArgument_.isEmpty()) {
                if (this.f61605f.isEmpty()) {
                    this.f61605f = fVar.effectConstructorArgument_;
                    this.f61603c &= -3;
                } else {
                    m86369v();
                    this.f61605f.addAll(fVar.effectConstructorArgument_);
                }
            }
            if (fVar.mo71195G()) {
                mo71207y(fVar.mo71190A());
            }
            if (fVar.mo71197I()) {
                mo71203C(fVar.mo71194F());
            }
            mo73388p(mo73387n().mo73309d(fVar.unknownFields));
            return this;
        }
    }

    /* renamed from: kb.f$c */
    /* compiled from: ProtoBuf */
    public enum C13469c implements C14503i.C14504a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);
        

        /* renamed from: f */
        private static C14503i.C14505b<C13469c> f61611f;
        private final int value;

        /* renamed from: kb.f$c$a */
        /* compiled from: ProtoBuf */
        static class C13470a implements C14503i.C14505b<C13469c> {
            C13470a() {
            }

            /* renamed from: b */
            public C13469c mo71085a(int i) {
                return C13469c.m86383b(i);
            }
        }

        static {
            f61611f = new C13470a();
        }

        private C13469c(int i, int i2) {
            this.value = i2;
        }

        /* renamed from: b */
        public static C13469c m86383b(int i) {
            if (i == 0) {
                return RETURNS_CONSTANT;
            }
            if (i == 1) {
                return CALLS;
            }
            if (i != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        /* renamed from: c */
        public final int mo71084c() {
            return this.value;
        }
    }

    /* renamed from: kb.f$d */
    /* compiled from: ProtoBuf */
    public enum C13471d implements C14503i.C14504a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);
        

        /* renamed from: f */
        private static C14503i.C14505b<C13471d> f61616f;
        private final int value;

        /* renamed from: kb.f$d$a */
        /* compiled from: ProtoBuf */
        static class C13472a implements C14503i.C14505b<C13471d> {
            C13472a() {
            }

            /* renamed from: b */
            public C13471d mo71085a(int i) {
                return C13471d.m86387b(i);
            }
        }

        static {
            f61616f = new C13472a();
        }

        private C13471d(int i, int i2) {
            this.value = i2;
        }

        /* renamed from: b */
        public static C13471d m86387b(int i) {
            if (i == 0) {
                return AT_MOST_ONCE;
            }
            if (i == 1) {
                return EXACTLY_ONCE;
            }
            if (i != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        /* renamed from: c */
        public final int mo71084c() {
            return this.value;
        }
    }

    static {
        C13466f fVar = new C13466f(true);
        f61601a = fVar;
        fVar.m86339J();
    }

    /* renamed from: B */
    public static C13466f m86338B() {
        return f61601a;
    }

    /* renamed from: J */
    private void m86339J() {
        this.effectType_ = C13469c.RETURNS_CONSTANT;
        this.effectConstructorArgument_ = Collections.emptyList();
        this.conclusionOfConditionalEffect_ = C13476h.m86429H();
        this.kind_ = C13471d.AT_MOST_ONCE;
    }

    /* renamed from: L */
    public static C13468b m86340L() {
        return C13468b.m86368u();
    }

    /* renamed from: M */
    public static C13468b m86341M(C13466f fVar) {
        return m86340L().mo71036o(fVar);
    }

    /* renamed from: A */
    public C13476h mo71190A() {
        return this.conclusionOfConditionalEffect_;
    }

    /* renamed from: C */
    public C13476h mo71191C(int i) {
        return this.effectConstructorArgument_.get(i);
    }

    /* renamed from: D */
    public int mo71192D() {
        return this.effectConstructorArgument_.size();
    }

    /* renamed from: E */
    public C13469c mo71193E() {
        return this.effectType_;
    }

    /* renamed from: F */
    public C13471d mo71194F() {
        return this.kind_;
    }

    /* renamed from: G */
    public boolean mo71195G() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: H */
    public boolean mo71196H() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: I */
    public boolean mo71197I() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: N */
    public C13468b mo71016d() {
        return m86340L();
    }

    /* renamed from: O */
    public C13468b mo71014b() {
        return m86341M(this);
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
        for (int i = 0; i < mo71192D(); i++) {
            if (!mo71191C(i).mo71013a()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        if (!mo71195G() || mo71190A().mo71013a()) {
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
        int h = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m90740h(1, this.effectType_.mo71084c()) + 0 : 0;
        for (int i2 = 0; i2 < this.effectConstructorArgument_.size(); i2++) {
            h += CodedOutputStream.m90751s(2, this.effectConstructorArgument_.get(i2));
        }
        if ((this.bitField0_ & 2) == 2) {
            h += CodedOutputStream.m90751s(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            h += CodedOutputStream.m90740h(4, this.kind_.mo71084c());
        }
        int size = h + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    /* renamed from: f */
    public C14519q<C13466f> mo71017f() {
        return f61602c;
    }

    /* renamed from: g */
    public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
        mo71015c();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo73242S(1, this.effectType_.mo71084c());
        }
        for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
            codedOutputStream.mo73253d0(2, this.effectConstructorArgument_.get(i));
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo73253d0(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo73242S(4, this.kind_.mo71084c());
        }
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    private C13466f(C14495h.C14497b bVar) {
        super(bVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.mo73387n();
    }

    private C13466f(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    private C13466f(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        m86339J();
        C14485d.C14487b s = C14485d.m90840s();
        CodedOutputStream J = CodedOutputStream.m90731J(s, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int K = eVar.mo73335K();
                if (K != 0) {
                    if (K == 8) {
                        int n = eVar.mo73349n();
                        C13469c b = C13469c.m86383b(n);
                        if (b == null) {
                            J.mo73264o0(K);
                            J.mo73264o0(n);
                        } else {
                            this.bitField0_ |= 1;
                            this.effectType_ = b;
                        }
                    } else if (K == 18) {
                        if (!(z2 & true)) {
                            this.effectConstructorArgument_ = new ArrayList();
                            z2 |= true;
                        }
                        this.effectConstructorArgument_.add(eVar.mo73356u(C13476h.f61623c, fVar));
                    } else if (K == 26) {
                        C13476h.C13478b Z = (this.bitField0_ & 2) == 2 ? this.conclusionOfConditionalEffect_.mo71014b() : null;
                        C13476h hVar = (C13476h) eVar.mo73356u(C13476h.f61623c, fVar);
                        this.conclusionOfConditionalEffect_ = hVar;
                        if (Z != null) {
                            Z.mo71036o(hVar);
                            this.conclusionOfConditionalEffect_ = Z.mo71247s();
                        }
                        this.bitField0_ |= 2;
                    } else if (K == 32) {
                        int n2 = eVar.mo73349n();
                        C13471d b2 = C13471d.m86387b(n2);
                        if (b2 == null) {
                            J.mo73264o0(K);
                            J.mo73264o0(n2);
                        } else {
                            this.bitField0_ |= 4;
                            this.kind_ = b2;
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
                if (z2 & true) {
                    this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
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
            this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
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
