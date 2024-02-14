package p336nb;

import java.io.IOException;
import java.io.InputStream;
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
import kotlin.reflect.jvm.internal.impl.protobuf.C14516o;
import kotlin.reflect.jvm.internal.impl.protobuf.C14518p;
import kotlin.reflect.jvm.internal.impl.protobuf.C14519q;
import kotlin.reflect.jvm.internal.impl.protobuf.C14539w;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p308kb.C13444b;
import p308kb.C13455c;
import p308kb.C13460d;
import p308kb.C13481i;
import p308kb.C13488l;
import p308kb.C13494n;
import p308kb.C13508q;
import p308kb.C13519s;

/* renamed from: nb.a */
/* compiled from: JvmProtoBuf */
public final class C15766a {

    /* renamed from: a */
    public static final C14495h.C14502f<C13460d, C15771c> f65111a;

    /* renamed from: b */
    public static final C14495h.C14502f<C13481i, C15771c> f65112b;

    /* renamed from: c */
    public static final C14495h.C14502f<C13481i, Integer> f65113c;

    /* renamed from: d */
    public static final C14495h.C14502f<C13494n, C15774d> f65114d;

    /* renamed from: e */
    public static final C14495h.C14502f<C13494n, Integer> f65115e;

    /* renamed from: f */
    public static final C14495h.C14502f<C13508q, List<C13444b>> f65116f;

    /* renamed from: g */
    public static final C14495h.C14502f<C13508q, Boolean> f65117g = C14495h.m90950p(C13508q.m86912b0(), Boolean.FALSE, (C14516o) null, (C14503i.C14505b<?>) null, 101, C14539w.C14541b.BOOL, Boolean.class);

    /* renamed from: h */
    public static final C14495h.C14502f<C13519s, List<C13444b>> f65118h;

    /* renamed from: i */
    public static final C14495h.C14502f<C13455c, Integer> f65119i;

    /* renamed from: j */
    public static final C14495h.C14502f<C13455c, List<C13494n>> f65120j;

    /* renamed from: k */
    public static final C14495h.C14502f<C13455c, Integer> f65121k;

    /* renamed from: l */
    public static final C14495h.C14502f<C13455c, Integer> f65122l;

    /* renamed from: m */
    public static final C14495h.C14502f<C13488l, Integer> f65123m;

    /* renamed from: n */
    public static final C14495h.C14502f<C13488l, List<C13494n>> f65124n;

    /* renamed from: nb.a$e */
    /* compiled from: JvmProtoBuf */
    public static final class C15777e extends C14495h implements C14518p {

        /* renamed from: a */
        private static final C15777e f65143a;

        /* renamed from: c */
        public static C14519q<C15777e> f65144c = new C15778a();
        private int localNameMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> localName_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<C15780c> record_;
        /* access modifiers changed from: private */
        public final C14485d unknownFields;

        /* renamed from: nb.a$e$a */
        /* compiled from: JvmProtoBuf */
        static class C15778a extends C14481b<C15777e> {
            C15778a() {
            }

            /* renamed from: m */
            public C15777e mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
                return new C15777e(eVar, fVar);
            }
        }

        /* renamed from: nb.a$e$b */
        /* compiled from: JvmProtoBuf */
        public static final class C15779b extends C14495h.C14497b<C15777e, C15779b> implements C14518p {

            /* renamed from: c */
            private int f65145c;

            /* renamed from: d */
            private List<C15780c> f65146d = Collections.emptyList();

            /* renamed from: f */
            private List<Integer> f65147f = Collections.emptyList();

            private C15779b() {
                m95239y();
            }

            /* access modifiers changed from: private */
            /* renamed from: u */
            public static C15779b m95236u() {
                return new C15779b();
            }

            /* renamed from: v */
            private void m95237v() {
                if ((this.f65145c & 2) != 2) {
                    this.f65147f = new ArrayList(this.f65147f);
                    this.f65145c |= 2;
                }
            }

            /* renamed from: x */
            private void m95238x() {
                if ((this.f65145c & 1) != 1) {
                    this.f65146d = new ArrayList(this.f65146d);
                    this.f65145c |= 1;
                }
            }

            /* renamed from: y */
            private void m95239y() {
            }

            /* renamed from: A */
            public C15779b mo71036o(C15777e eVar) {
                if (eVar == C15777e.m95222y()) {
                    return this;
                }
                if (!eVar.record_.isEmpty()) {
                    if (this.f65146d.isEmpty()) {
                        this.f65146d = eVar.record_;
                        this.f65145c &= -2;
                    } else {
                        m95238x();
                        this.f65146d.addAll(eVar.record_);
                    }
                }
                if (!eVar.localName_.isEmpty()) {
                    if (this.f65147f.isEmpty()) {
                        this.f65147f = eVar.localName_;
                        this.f65145c &= -3;
                    } else {
                        m95237v();
                        this.f65147f.addAll(eVar.localName_);
                    }
                }
                mo73388p(mo73387n().mo73309d(eVar.unknownFields));
                return this;
            }

            /* renamed from: r */
            public C15777e build() {
                C15777e s = mo75473s();
                if (s.mo71013a()) {
                    return s;
                }
                throw C14478a.C14479a.m90815k(s);
            }

            /* renamed from: s */
            public C15777e mo75473s() {
                C15777e eVar = new C15777e((C14495h.C14497b) this);
                if ((this.f65145c & 1) == 1) {
                    this.f65146d = Collections.unmodifiableList(this.f65146d);
                    this.f65145c &= -2;
                }
                List unused = eVar.record_ = this.f65146d;
                if ((this.f65145c & 2) == 2) {
                    this.f65147f = Collections.unmodifiableList(this.f65147f);
                    this.f65145c &= -3;
                }
                List unused2 = eVar.localName_ = this.f65147f;
                return eVar;
            }

            /* renamed from: t */
            public C15779b mo71035l() {
                return m95236u().mo71036o(mo75473s());
            }

            /* renamed from: z */
            public C15779b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
                C15777e eVar2;
                C15777e eVar3 = null;
                try {
                    C15777e c = C15777e.f65144c.mo71021c(eVar, fVar);
                    if (c != null) {
                        mo71036o(c);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    eVar2 = (C15777e) e.mo73276a();
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
            C15777e eVar = new C15777e(true);
            f65143a = eVar;
            eVar.m95213B();
        }

        /* renamed from: B */
        private void m95213B() {
            this.record_ = Collections.emptyList();
            this.localName_ = Collections.emptyList();
        }

        /* renamed from: C */
        public static C15779b m95214C() {
            return C15779b.m95236u();
        }

        /* renamed from: D */
        public static C15779b m95215D(C15777e eVar) {
            return m95214C().mo71036o(eVar);
        }

        /* renamed from: F */
        public static C15777e m95216F(InputStream inputStream, C14490f fVar) throws IOException {
            return f65144c.mo73287d(inputStream, fVar);
        }

        /* renamed from: y */
        public static C15777e m95222y() {
            return f65143a;
        }

        /* renamed from: A */
        public List<C15780c> mo75466A() {
            return this.record_;
        }

        /* renamed from: E */
        public C15779b mo71016d() {
            return m95214C();
        }

        /* renamed from: G */
        public C15779b mo71014b() {
            return m95215D(this);
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
            for (int i3 = 0; i3 < this.record_.size(); i3++) {
                i2 += CodedOutputStream.m90751s(1, this.record_.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.localName_.size(); i5++) {
                i4 += CodedOutputStream.m90748p(this.localName_.get(i5).intValue());
            }
            int i6 = i2 + i4;
            if (!mo75469z().isEmpty()) {
                i6 = i6 + 1 + CodedOutputStream.m90748p(i4);
            }
            this.localNameMemoizedSerializedSize = i4;
            int size = i6 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        /* renamed from: f */
        public C14519q<C15777e> mo71017f() {
            return f65144c;
        }

        /* renamed from: g */
        public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
            mo71015c();
            for (int i = 0; i < this.record_.size(); i++) {
                codedOutputStream.mo73253d0(1, this.record_.get(i));
            }
            if (mo75469z().size() > 0) {
                codedOutputStream.mo73264o0(42);
                codedOutputStream.mo73264o0(this.localNameMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.localName_.size(); i2++) {
                codedOutputStream.mo73251b0(this.localName_.get(i2).intValue());
            }
            codedOutputStream.mo73258i0(this.unknownFields);
        }

        /* renamed from: z */
        public List<Integer> mo75469z() {
            return this.localName_;
        }

        /* renamed from: nb.a$e$c */
        /* compiled from: JvmProtoBuf */
        public static final class C15780c extends C14495h implements C14518p {

            /* renamed from: a */
            private static final C15780c f65148a;

            /* renamed from: c */
            public static C14519q<C15780c> f65149c = new C15781a();
            /* access modifiers changed from: private */
            public int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            /* access modifiers changed from: private */
            public C15783c operation_;
            /* access modifiers changed from: private */
            public int predefinedIndex_;
            /* access modifiers changed from: private */
            public int range_;
            private int replaceCharMemoizedSerializedSize;
            /* access modifiers changed from: private */
            public List<Integer> replaceChar_;
            /* access modifiers changed from: private */
            public Object string_;
            private int substringIndexMemoizedSerializedSize;
            /* access modifiers changed from: private */
            public List<Integer> substringIndex_;
            /* access modifiers changed from: private */
            public final C14485d unknownFields;

            /* renamed from: nb.a$e$c$a */
            /* compiled from: JvmProtoBuf */
            static class C15781a extends C14481b<C15780c> {
                C15781a() {
                }

                /* renamed from: m */
                public C15780c mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
                    return new C15780c(eVar, fVar);
                }
            }

            /* renamed from: nb.a$e$c$b */
            /* compiled from: JvmProtoBuf */
            public static final class C15782b extends C14495h.C14497b<C15780c, C15782b> implements C14518p {

                /* renamed from: c */
                private int f65150c;

                /* renamed from: d */
                private int f65151d = 1;

                /* renamed from: f */
                private int f65152f;

                /* renamed from: g */
                private Object f65153g = "";

                /* renamed from: o */
                private C15783c f65154o = C15783c.f65157a;

                /* renamed from: p */
                private List<Integer> f65155p = Collections.emptyList();

                /* renamed from: s */
                private List<Integer> f65156s = Collections.emptyList();

                private C15782b() {
                    m95291y();
                }

                /* access modifiers changed from: private */
                /* renamed from: u */
                public static C15782b m95288u() {
                    return new C15782b();
                }

                /* renamed from: v */
                private void m95289v() {
                    if ((this.f65150c & 32) != 32) {
                        this.f65156s = new ArrayList(this.f65156s);
                        this.f65150c |= 32;
                    }
                }

                /* renamed from: x */
                private void m95290x() {
                    if ((this.f65150c & 16) != 16) {
                        this.f65155p = new ArrayList(this.f65155p);
                        this.f65150c |= 16;
                    }
                }

                /* renamed from: y */
                private void m95291y() {
                }

                /* renamed from: A */
                public C15782b mo71036o(C15780c cVar) {
                    if (cVar == C15780c.m95253E()) {
                        return this;
                    }
                    if (cVar.mo75487R()) {
                        mo75495D(cVar.mo75478H());
                    }
                    if (cVar.mo75486Q()) {
                        mo75494C(cVar.mo75477G());
                    }
                    if (cVar.mo75488T()) {
                        this.f65150c |= 4;
                        this.f65153g = cVar.string_;
                    }
                    if (cVar.mo75485P()) {
                        mo75493B(cVar.mo75476F());
                    }
                    if (!cVar.substringIndex_.isEmpty()) {
                        if (this.f65155p.isEmpty()) {
                            this.f65155p = cVar.substringIndex_;
                            this.f65150c &= -17;
                        } else {
                            m95290x();
                            this.f65155p.addAll(cVar.substringIndex_);
                        }
                    }
                    if (!cVar.replaceChar_.isEmpty()) {
                        if (this.f65156s.isEmpty()) {
                            this.f65156s = cVar.replaceChar_;
                            this.f65150c &= -33;
                        } else {
                            m95289v();
                            this.f65156s.addAll(cVar.replaceChar_);
                        }
                    }
                    mo73388p(mo73387n().mo73309d(cVar.unknownFields));
                    return this;
                }

                /* renamed from: B */
                public C15782b mo75493B(C15783c cVar) {
                    Objects.requireNonNull(cVar);
                    this.f65150c |= 8;
                    this.f65154o = cVar;
                    return this;
                }

                /* renamed from: C */
                public C15782b mo75494C(int i) {
                    this.f65150c |= 2;
                    this.f65152f = i;
                    return this;
                }

                /* renamed from: D */
                public C15782b mo75495D(int i) {
                    this.f65150c |= 1;
                    this.f65151d = i;
                    return this;
                }

                /* renamed from: r */
                public C15780c build() {
                    C15780c s = mo75497s();
                    if (s.mo71013a()) {
                        return s;
                    }
                    throw C14478a.C14479a.m90815k(s);
                }

                /* renamed from: s */
                public C15780c mo75497s() {
                    C15780c cVar = new C15780c((C14495h.C14497b) this);
                    int i = this.f65150c;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    int unused = cVar.range_ = this.f65151d;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    int unused2 = cVar.predefinedIndex_ = this.f65152f;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    Object unused3 = cVar.string_ = this.f65153g;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    C15783c unused4 = cVar.operation_ = this.f65154o;
                    if ((this.f65150c & 16) == 16) {
                        this.f65155p = Collections.unmodifiableList(this.f65155p);
                        this.f65150c &= -17;
                    }
                    List unused5 = cVar.substringIndex_ = this.f65155p;
                    if ((this.f65150c & 32) == 32) {
                        this.f65156s = Collections.unmodifiableList(this.f65156s);
                        this.f65150c &= -33;
                    }
                    List unused6 = cVar.replaceChar_ = this.f65156s;
                    int unused7 = cVar.bitField0_ = i2;
                    return cVar;
                }

                /* renamed from: t */
                public C15782b mo71035l() {
                    return m95288u().mo71036o(mo75497s());
                }

                /* renamed from: z */
                public C15782b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
                    C15780c cVar;
                    C15780c cVar2 = null;
                    try {
                        C15780c c = C15780c.f65149c.mo71021c(eVar, fVar);
                        if (c != null) {
                            mo71036o(c);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        cVar = (C15780c) e.mo73276a();
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
            }

            /* renamed from: nb.a$e$c$c */
            /* compiled from: JvmProtoBuf */
            public enum C15783c implements C14503i.C14504a {
                f65157a(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);
                

                /* renamed from: f */
                private static C14503i.C14505b<C15783c> f65160f;
                private final int value;

                /* renamed from: nb.a$e$c$c$a */
                /* compiled from: JvmProtoBuf */
                static class C15784a implements C14503i.C14505b<C15783c> {
                    C15784a() {
                    }

                    /* renamed from: b */
                    public C15783c mo71085a(int i) {
                        return C15783c.m95304b(i);
                    }
                }

                static {
                    f65160f = new C15784a();
                }

                private C15783c(int i, int i2) {
                    this.value = i2;
                }

                /* renamed from: b */
                public static C15783c m95304b(int i) {
                    if (i == 0) {
                        return f65157a;
                    }
                    if (i == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                /* renamed from: c */
                public final int mo71084c() {
                    return this.value;
                }
            }

            static {
                C15780c cVar = new C15780c(true);
                f65148a = cVar;
                cVar.m95254U();
            }

            /* renamed from: E */
            public static C15780c m95253E() {
                return f65148a;
            }

            /* renamed from: U */
            private void m95254U() {
                this.range_ = 1;
                this.predefinedIndex_ = 0;
                this.string_ = "";
                this.operation_ = C15783c.f65157a;
                this.substringIndex_ = Collections.emptyList();
                this.replaceChar_ = Collections.emptyList();
            }

            /* renamed from: V */
            public static C15782b m95255V() {
                return C15782b.m95288u();
            }

            /* renamed from: W */
            public static C15782b m95256W(C15780c cVar) {
                return m95255V().mo71036o(cVar);
            }

            /* renamed from: F */
            public C15783c mo75476F() {
                return this.operation_;
            }

            /* renamed from: G */
            public int mo75477G() {
                return this.predefinedIndex_;
            }

            /* renamed from: H */
            public int mo75478H() {
                return this.range_;
            }

            /* renamed from: I */
            public int mo75479I() {
                return this.replaceChar_.size();
            }

            /* renamed from: J */
            public List<Integer> mo75480J() {
                return this.replaceChar_;
            }

            /* renamed from: L */
            public String mo75481L() {
                Object obj = this.string_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C14485d dVar = (C14485d) obj;
                String D = dVar.mo73306D();
                if (dVar.mo73314o()) {
                    this.string_ = D;
                }
                return D;
            }

            /* renamed from: M */
            public C14485d mo75482M() {
                Object obj = this.string_;
                if (!(obj instanceof String)) {
                    return (C14485d) obj;
                }
                C14485d j = C14485d.m90839j((String) obj);
                this.string_ = j;
                return j;
            }

            /* renamed from: N */
            public int mo75483N() {
                return this.substringIndex_.size();
            }

            /* renamed from: O */
            public List<Integer> mo75484O() {
                return this.substringIndex_;
            }

            /* renamed from: P */
            public boolean mo75485P() {
                return (this.bitField0_ & 8) == 8;
            }

            /* renamed from: Q */
            public boolean mo75486Q() {
                return (this.bitField0_ & 2) == 2;
            }

            /* renamed from: R */
            public boolean mo75487R() {
                return (this.bitField0_ & 1) == 1;
            }

            /* renamed from: T */
            public boolean mo75488T() {
                return (this.bitField0_ & 4) == 4;
            }

            /* renamed from: X */
            public C15782b mo71016d() {
                return m95255V();
            }

            /* renamed from: Y */
            public C15782b mo71014b() {
                return m95256W(this);
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
                int o = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m90747o(1, this.range_) + 0 : 0;
                if ((this.bitField0_ & 2) == 2) {
                    o += CodedOutputStream.m90747o(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    o += CodedOutputStream.m90740h(3, this.operation_.mo71084c());
                }
                int i2 = 0;
                for (int i3 = 0; i3 < this.substringIndex_.size(); i3++) {
                    i2 += CodedOutputStream.m90748p(this.substringIndex_.get(i3).intValue());
                }
                int i4 = o + i2;
                if (!mo75484O().isEmpty()) {
                    i4 = i4 + 1 + CodedOutputStream.m90748p(i2);
                }
                this.substringIndexMemoizedSerializedSize = i2;
                int i5 = 0;
                for (int i6 = 0; i6 < this.replaceChar_.size(); i6++) {
                    i5 += CodedOutputStream.m90748p(this.replaceChar_.get(i6).intValue());
                }
                int i7 = i4 + i5;
                if (!mo75480J().isEmpty()) {
                    i7 = i7 + 1 + CodedOutputStream.m90748p(i5);
                }
                this.replaceCharMemoizedSerializedSize = i5;
                if ((this.bitField0_ & 4) == 4) {
                    i7 += CodedOutputStream.m90736d(6, mo75482M());
                }
                int size = i7 + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            /* renamed from: f */
            public C14519q<C15780c> mo71017f() {
                return f65149c;
            }

            /* renamed from: g */
            public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
                mo71015c();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.mo73250a0(1, this.range_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.mo73250a0(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    codedOutputStream.mo73242S(3, this.operation_.mo71084c());
                }
                if (mo75484O().size() > 0) {
                    codedOutputStream.mo73264o0(34);
                    codedOutputStream.mo73264o0(this.substringIndexMemoizedSerializedSize);
                }
                for (int i = 0; i < this.substringIndex_.size(); i++) {
                    codedOutputStream.mo73251b0(this.substringIndex_.get(i).intValue());
                }
                if (mo75480J().size() > 0) {
                    codedOutputStream.mo73264o0(42);
                    codedOutputStream.mo73264o0(this.replaceCharMemoizedSerializedSize);
                }
                for (int i2 = 0; i2 < this.replaceChar_.size(); i2++) {
                    codedOutputStream.mo73251b0(this.replaceChar_.get(i2).intValue());
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.mo73238O(6, mo75482M());
                }
                codedOutputStream.mo73258i0(this.unknownFields);
            }

            private C15780c(C14495h.C14497b bVar) {
                super(bVar);
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = bVar.mo73387n();
            }

            private C15780c(boolean z) {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = C14485d.f63329a;
            }

            private C15780c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                m95254U();
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
                                this.range_ = eVar.mo73354s();
                            } else if (K == 16) {
                                this.bitField0_ |= 2;
                                this.predefinedIndex_ = eVar.mo73354s();
                            } else if (K == 24) {
                                int n = eVar.mo73349n();
                                C15783c b = C15783c.m95304b(n);
                                if (b == null) {
                                    J.mo73264o0(K);
                                    J.mo73264o0(n);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.operation_ = b;
                                }
                            } else if (K == 32) {
                                if (!(z2 & true)) {
                                    this.substringIndex_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.substringIndex_.add(Integer.valueOf(eVar.mo73354s()));
                            } else if (K == 34) {
                                int j = eVar.mo73345j(eVar.mo73326A());
                                if (!(z2 & true) && eVar.mo73342e() > 0) {
                                    this.substringIndex_ = new ArrayList();
                                    z2 |= true;
                                }
                                while (eVar.mo73342e() > 0) {
                                    this.substringIndex_.add(Integer.valueOf(eVar.mo73354s()));
                                }
                                eVar.mo73344i(j);
                            } else if (K == 40) {
                                if (!(z2 & true)) {
                                    this.replaceChar_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.replaceChar_.add(Integer.valueOf(eVar.mo73354s()));
                            } else if (K == 42) {
                                int j2 = eVar.mo73345j(eVar.mo73326A());
                                if (!(z2 & true) && eVar.mo73342e() > 0) {
                                    this.replaceChar_ = new ArrayList();
                                    z2 |= true;
                                }
                                while (eVar.mo73342e() > 0) {
                                    this.replaceChar_.add(Integer.valueOf(eVar.mo73354s()));
                                }
                                eVar.mo73344i(j2);
                            } else if (K == 50) {
                                C14485d l = eVar.mo73347l();
                                this.bitField0_ |= 4;
                                this.string_ = l;
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
                            this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                        }
                        if (z2 & true) {
                            this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
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
                    this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                }
                if (z2 & true) {
                    this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
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

        private C15777e(C14495h.C14497b bVar) {
            super(bVar);
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.mo73387n();
        }

        private C15777e(boolean z) {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = C14485d.f63329a;
        }

        private C15777e(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            m95213B();
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
                                this.record_ = new ArrayList();
                                z2 |= true;
                            }
                            this.record_.add(eVar.mo73356u(C15780c.f65149c, fVar));
                        } else if (K == 40) {
                            if (!(z2 & true)) {
                                this.localName_ = new ArrayList();
                                z2 |= true;
                            }
                            this.localName_.add(Integer.valueOf(eVar.mo73354s()));
                        } else if (K == 42) {
                            int j = eVar.mo73345j(eVar.mo73326A());
                            if (!(z2 & true) && eVar.mo73342e() > 0) {
                                this.localName_ = new ArrayList();
                                z2 |= true;
                            }
                            while (eVar.mo73342e() > 0) {
                                this.localName_.add(Integer.valueOf(eVar.mo73354s()));
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
                    if (z2 && true) {
                        this.record_ = Collections.unmodifiableList(this.record_);
                    }
                    if (z2 & true) {
                        this.localName_ = Collections.unmodifiableList(this.localName_);
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
                this.record_ = Collections.unmodifiableList(this.record_);
            }
            if (z2 & true) {
                this.localName_ = Collections.unmodifiableList(this.localName_);
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

    static {
        C13460d J = C13460d.m86269J();
        C15771c x = C15771c.m95136x();
        C15771c x2 = C15771c.m95136x();
        C14539w.C14541b bVar = C14539w.C14541b.MESSAGE;
        f65111a = C14495h.m90950p(J, x, x2, (C14503i.C14505b<?>) null, 100, bVar, C15771c.class);
        C14539w.C14541b bVar2 = bVar;
        f65112b = C14495h.m90950p(C13481i.m86512e0(), C15771c.m95136x(), C15771c.m95136x(), (C14503i.C14505b<?>) null, 100, bVar2, C15771c.class);
        C13481i e0 = C13481i.m86512e0();
        C14539w.C14541b bVar3 = C14539w.C14541b.INT32;
        f65113c = C14495h.m90950p(e0, null, (C14516o) null, (C14503i.C14505b<?>) null, 101, bVar3, Integer.class);
        f65114d = C14495h.m90950p(C13494n.m86717c0(), C15774d.m95165A(), C15774d.m95165A(), (C14503i.C14505b<?>) null, 100, bVar2, C15774d.class);
        f65115e = C14495h.m90950p(C13494n.m86717c0(), null, (C14516o) null, (C14503i.C14505b<?>) null, 101, bVar3, Integer.class);
        f65116f = C14495h.m90949n(C13508q.m86912b0(), C13444b.m85959B(), (C14503i.C14505b<?>) null, 100, bVar, false, C13444b.class);
        f65118h = C14495h.m90949n(C13519s.m87105N(), C13444b.m85959B(), (C14503i.C14505b<?>) null, 100, bVar, false, C13444b.class);
        f65119i = C14495h.m90950p(C13455c.m86118F0(), null, (C14516o) null, (C14503i.C14505b<?>) null, 101, bVar3, Integer.class);
        f65120j = C14495h.m90949n(C13455c.m86118F0(), C13494n.m86717c0(), (C14503i.C14505b<?>) null, 102, bVar, false, C13494n.class);
        C14539w.C14541b bVar4 = bVar3;
        f65121k = C14495h.m90950p(C13455c.m86118F0(), null, (C14516o) null, (C14503i.C14505b<?>) null, 103, bVar4, Integer.class);
        f65122l = C14495h.m90950p(C13455c.m86118F0(), null, (C14516o) null, (C14503i.C14505b<?>) null, 104, bVar4, Integer.class);
        f65123m = C14495h.m90950p(C13488l.m86598N(), null, (C14516o) null, (C14503i.C14505b<?>) null, 101, bVar4, Integer.class);
        f65124n = C14495h.m90949n(C13488l.m86598N(), C13494n.m86717c0(), (C14503i.C14505b<?>) null, 102, bVar, false, C13494n.class);
    }

    /* renamed from: a */
    public static void m95092a(C14490f fVar) {
        fVar.mo73362a(f65111a);
        fVar.mo73362a(f65112b);
        fVar.mo73362a(f65113c);
        fVar.mo73362a(f65114d);
        fVar.mo73362a(f65115e);
        fVar.mo73362a(f65116f);
        fVar.mo73362a(f65117g);
        fVar.mo73362a(f65118h);
        fVar.mo73362a(f65119i);
        fVar.mo73362a(f65120j);
        fVar.mo73362a(f65121k);
        fVar.mo73362a(f65122l);
        fVar.mo73362a(f65123m);
        fVar.mo73362a(f65124n);
    }

    /* renamed from: nb.a$b */
    /* compiled from: JvmProtoBuf */
    public static final class C15768b extends C14495h implements C14518p {

        /* renamed from: a */
        private static final C15768b f65125a;

        /* renamed from: c */
        public static C14519q<C15768b> f65126c = new C15769a();
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int name_;
        /* access modifiers changed from: private */
        public final C14485d unknownFields;

        /* renamed from: nb.a$b$a */
        /* compiled from: JvmProtoBuf */
        static class C15769a extends C14481b<C15768b> {
            C15769a() {
            }

            /* renamed from: m */
            public C15768b mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
                return new C15768b(eVar, fVar);
            }
        }

        /* renamed from: nb.a$b$b */
        /* compiled from: JvmProtoBuf */
        public static final class C15770b extends C14495h.C14497b<C15768b, C15770b> implements C14518p {

            /* renamed from: c */
            private int f65127c;

            /* renamed from: d */
            private int f65128d;

            /* renamed from: f */
            private int f65129f;

            private C15770b() {
                m95117v();
            }

            /* access modifiers changed from: private */
            /* renamed from: u */
            public static C15770b m95116u() {
                return new C15770b();
            }

            /* renamed from: v */
            private void m95117v() {
            }

            /* renamed from: A */
            public C15770b mo75422A(int i) {
                this.f65127c |= 1;
                this.f65128d = i;
                return this;
            }

            /* renamed from: r */
            public C15768b build() {
                C15768b s = mo75424s();
                if (s.mo71013a()) {
                    return s;
                }
                throw C14478a.C14479a.m90815k(s);
            }

            /* renamed from: s */
            public C15768b mo75424s() {
                C15768b bVar = new C15768b((C14495h.C14497b) this);
                int i = this.f65127c;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = bVar.name_ = this.f65128d;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                int unused2 = bVar.desc_ = this.f65129f;
                int unused3 = bVar.bitField0_ = i2;
                return bVar;
            }

            /* renamed from: t */
            public C15770b mo71035l() {
                return m95116u().mo71036o(mo75424s());
            }

            /* renamed from: x */
            public C15770b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
                C15768b bVar;
                C15768b bVar2 = null;
                try {
                    C15768b c = C15768b.f65126c.mo71021c(eVar, fVar);
                    if (c != null) {
                        mo71036o(c);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    bVar = (C15768b) e.mo73276a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                }
                if (bVar2 != null) {
                    mo71036o(bVar2);
                }
                throw th;
            }

            /* renamed from: y */
            public C15770b mo71036o(C15768b bVar) {
                if (bVar == C15768b.m95100x()) {
                    return this;
                }
                if (bVar.mo75416B()) {
                    mo75422A(bVar.mo75420z());
                }
                if (bVar.mo75415A()) {
                    mo75428z(bVar.mo75419y());
                }
                mo73388p(mo73387n().mo73309d(bVar.unknownFields));
                return this;
            }

            /* renamed from: z */
            public C15770b mo75428z(int i) {
                this.f65127c |= 2;
                this.f65129f = i;
                return this;
            }
        }

        static {
            C15768b bVar = new C15768b(true);
            f65125a = bVar;
            bVar.m95093C();
        }

        /* renamed from: C */
        private void m95093C() {
            this.name_ = 0;
            this.desc_ = 0;
        }

        /* renamed from: D */
        public static C15770b m95094D() {
            return C15770b.m95116u();
        }

        /* renamed from: E */
        public static C15770b m95095E(C15768b bVar) {
            return m95094D().mo71036o(bVar);
        }

        /* renamed from: x */
        public static C15768b m95100x() {
            return f65125a;
        }

        /* renamed from: A */
        public boolean mo75415A() {
            return (this.bitField0_ & 2) == 2;
        }

        /* renamed from: B */
        public boolean mo75416B() {
            return (this.bitField0_ & 1) == 1;
        }

        /* renamed from: F */
        public C15770b mo71016d() {
            return m95094D();
        }

        /* renamed from: G */
        public C15770b mo71014b() {
            return m95095E(this);
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
                i2 = 0 + CodedOutputStream.m90747o(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.m90747o(2, this.desc_);
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        /* renamed from: f */
        public C14519q<C15768b> mo71017f() {
            return f65126c;
        }

        /* renamed from: g */
        public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
            mo71015c();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo73250a0(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo73250a0(2, this.desc_);
            }
            codedOutputStream.mo73258i0(this.unknownFields);
        }

        /* renamed from: y */
        public int mo75419y() {
            return this.desc_;
        }

        /* renamed from: z */
        public int mo75420z() {
            return this.name_;
        }

        private C15768b(C14495h.C14497b bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.mo73387n();
        }

        private C15768b(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = C14485d.f63329a;
        }

        private C15768b(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            m95093C();
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
                        } else if (K == 16) {
                            this.bitField0_ |= 2;
                            this.desc_ = eVar.mo73354s();
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

    /* renamed from: nb.a$c */
    /* compiled from: JvmProtoBuf */
    public static final class C15771c extends C14495h implements C14518p {

        /* renamed from: a */
        private static final C15771c f65130a;

        /* renamed from: c */
        public static C14519q<C15771c> f65131c = new C15772a();
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int name_;
        /* access modifiers changed from: private */
        public final C14485d unknownFields;

        /* renamed from: nb.a$c$a */
        /* compiled from: JvmProtoBuf */
        static class C15772a extends C14481b<C15771c> {
            C15772a() {
            }

            /* renamed from: m */
            public C15771c mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
                return new C15771c(eVar, fVar);
            }
        }

        /* renamed from: nb.a$c$b */
        /* compiled from: JvmProtoBuf */
        public static final class C15773b extends C14495h.C14497b<C15771c, C15773b> implements C14518p {

            /* renamed from: c */
            private int f65132c;

            /* renamed from: d */
            private int f65133d;

            /* renamed from: f */
            private int f65134f;

            private C15773b() {
                m95153v();
            }

            /* access modifiers changed from: private */
            /* renamed from: u */
            public static C15773b m95152u() {
                return new C15773b();
            }

            /* renamed from: v */
            private void m95153v() {
            }

            /* renamed from: A */
            public C15773b mo75436A(int i) {
                this.f65132c |= 1;
                this.f65133d = i;
                return this;
            }

            /* renamed from: r */
            public C15771c build() {
                C15771c s = mo75438s();
                if (s.mo71013a()) {
                    return s;
                }
                throw C14478a.C14479a.m90815k(s);
            }

            /* renamed from: s */
            public C15771c mo75438s() {
                C15771c cVar = new C15771c((C14495h.C14497b) this);
                int i = this.f65132c;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = cVar.name_ = this.f65133d;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                int unused2 = cVar.desc_ = this.f65134f;
                int unused3 = cVar.bitField0_ = i2;
                return cVar;
            }

            /* renamed from: t */
            public C15773b mo71035l() {
                return m95152u().mo71036o(mo75438s());
            }

            /* renamed from: x */
            public C15773b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
                C15771c cVar;
                C15771c cVar2 = null;
                try {
                    C15771c c = C15771c.f65131c.mo71021c(eVar, fVar);
                    if (c != null) {
                        mo71036o(c);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    cVar = (C15771c) e.mo73276a();
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

            /* renamed from: y */
            public C15773b mo71036o(C15771c cVar) {
                if (cVar == C15771c.m95136x()) {
                    return this;
                }
                if (cVar.mo75430B()) {
                    mo75436A(cVar.mo75434z());
                }
                if (cVar.mo75429A()) {
                    mo75442z(cVar.mo75433y());
                }
                mo73388p(mo73387n().mo73309d(cVar.unknownFields));
                return this;
            }

            /* renamed from: z */
            public C15773b mo75442z(int i) {
                this.f65132c |= 2;
                this.f65134f = i;
                return this;
            }
        }

        static {
            C15771c cVar = new C15771c(true);
            f65130a = cVar;
            cVar.m95129C();
        }

        /* renamed from: C */
        private void m95129C() {
            this.name_ = 0;
            this.desc_ = 0;
        }

        /* renamed from: D */
        public static C15773b m95130D() {
            return C15773b.m95152u();
        }

        /* renamed from: E */
        public static C15773b m95131E(C15771c cVar) {
            return m95130D().mo71036o(cVar);
        }

        /* renamed from: x */
        public static C15771c m95136x() {
            return f65130a;
        }

        /* renamed from: A */
        public boolean mo75429A() {
            return (this.bitField0_ & 2) == 2;
        }

        /* renamed from: B */
        public boolean mo75430B() {
            return (this.bitField0_ & 1) == 1;
        }

        /* renamed from: F */
        public C15773b mo71016d() {
            return m95130D();
        }

        /* renamed from: G */
        public C15773b mo71014b() {
            return m95131E(this);
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
                i2 = 0 + CodedOutputStream.m90747o(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.m90747o(2, this.desc_);
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        /* renamed from: f */
        public C14519q<C15771c> mo71017f() {
            return f65131c;
        }

        /* renamed from: g */
        public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
            mo71015c();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo73250a0(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo73250a0(2, this.desc_);
            }
            codedOutputStream.mo73258i0(this.unknownFields);
        }

        /* renamed from: y */
        public int mo75433y() {
            return this.desc_;
        }

        /* renamed from: z */
        public int mo75434z() {
            return this.name_;
        }

        private C15771c(C14495h.C14497b bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.mo73387n();
        }

        private C15771c(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = C14485d.f63329a;
        }

        private C15771c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            m95129C();
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
                        } else if (K == 16) {
                            this.bitField0_ |= 2;
                            this.desc_ = eVar.mo73354s();
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

    /* renamed from: nb.a$d */
    /* compiled from: JvmProtoBuf */
    public static final class C15774d extends C14495h implements C14518p {

        /* renamed from: a */
        private static final C15774d f65135a;

        /* renamed from: c */
        public static C14519q<C15774d> f65136c = new C15775a();
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public C15771c delegateMethod_;
        /* access modifiers changed from: private */
        public C15768b field_;
        /* access modifiers changed from: private */
        public C15771c getter_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public C15771c setter_;
        /* access modifiers changed from: private */
        public C15771c syntheticMethod_;
        /* access modifiers changed from: private */
        public final C14485d unknownFields;

        /* renamed from: nb.a$d$a */
        /* compiled from: JvmProtoBuf */
        static class C15775a extends C14481b<C15774d> {
            C15775a() {
            }

            /* renamed from: m */
            public C15774d mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
                return new C15774d(eVar, fVar);
            }
        }

        /* renamed from: nb.a$d$b */
        /* compiled from: JvmProtoBuf */
        public static final class C15776b extends C14495h.C14497b<C15774d, C15776b> implements C14518p {

            /* renamed from: c */
            private int f65137c;

            /* renamed from: d */
            private C15768b f65138d = C15768b.m95100x();

            /* renamed from: f */
            private C15771c f65139f = C15771c.m95136x();

            /* renamed from: g */
            private C15771c f65140g = C15771c.m95136x();

            /* renamed from: o */
            private C15771c f65141o = C15771c.m95136x();

            /* renamed from: p */
            private C15771c f65142p = C15771c.m95136x();

            private C15776b() {
                m95198v();
            }

            /* access modifiers changed from: private */
            /* renamed from: u */
            public static C15776b m95197u() {
                return new C15776b();
            }

            /* renamed from: v */
            private void m95198v() {
            }

            /* renamed from: A */
            public C15776b mo71036o(C15774d dVar) {
                if (dVar == C15774d.m95165A()) {
                    return this;
                }
                if (dVar.mo75449H()) {
                    mo75464y(dVar.mo75444C());
                }
                if (dVar.mo75452L()) {
                    mo75459D(dVar.mo75447F());
                }
                if (dVar.mo75450I()) {
                    mo75457B(dVar.mo75445D());
                }
                if (dVar.mo75451J()) {
                    mo75458C(dVar.mo75446E());
                }
                if (dVar.mo75448G()) {
                    mo75463x(dVar.mo75443B());
                }
                mo73388p(mo73387n().mo73309d(dVar.unknownFields));
                return this;
            }

            /* renamed from: B */
            public C15776b mo75457B(C15771c cVar) {
                if ((this.f65137c & 4) != 4 || this.f65140g == C15771c.m95136x()) {
                    this.f65140g = cVar;
                } else {
                    this.f65140g = C15771c.m95131E(this.f65140g).mo71036o(cVar).mo75438s();
                }
                this.f65137c |= 4;
                return this;
            }

            /* renamed from: C */
            public C15776b mo75458C(C15771c cVar) {
                if ((this.f65137c & 8) != 8 || this.f65141o == C15771c.m95136x()) {
                    this.f65141o = cVar;
                } else {
                    this.f65141o = C15771c.m95131E(this.f65141o).mo71036o(cVar).mo75438s();
                }
                this.f65137c |= 8;
                return this;
            }

            /* renamed from: D */
            public C15776b mo75459D(C15771c cVar) {
                if ((this.f65137c & 2) != 2 || this.f65139f == C15771c.m95136x()) {
                    this.f65139f = cVar;
                } else {
                    this.f65139f = C15771c.m95131E(this.f65139f).mo71036o(cVar).mo75438s();
                }
                this.f65137c |= 2;
                return this;
            }

            /* renamed from: r */
            public C15774d build() {
                C15774d s = mo75461s();
                if (s.mo71013a()) {
                    return s;
                }
                throw C14478a.C14479a.m90815k(s);
            }

            /* renamed from: s */
            public C15774d mo75461s() {
                C15774d dVar = new C15774d((C14495h.C14497b) this);
                int i = this.f65137c;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                C15768b unused = dVar.field_ = this.f65138d;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                C15771c unused2 = dVar.syntheticMethod_ = this.f65139f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                C15771c unused3 = dVar.getter_ = this.f65140g;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                C15771c unused4 = dVar.setter_ = this.f65141o;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                C15771c unused5 = dVar.delegateMethod_ = this.f65142p;
                int unused6 = dVar.bitField0_ = i2;
                return dVar;
            }

            /* renamed from: t */
            public C15776b mo71035l() {
                return m95197u().mo71036o(mo75461s());
            }

            /* renamed from: x */
            public C15776b mo75463x(C15771c cVar) {
                if ((this.f65137c & 16) != 16 || this.f65142p == C15771c.m95136x()) {
                    this.f65142p = cVar;
                } else {
                    this.f65142p = C15771c.m95131E(this.f65142p).mo71036o(cVar).mo75438s();
                }
                this.f65137c |= 16;
                return this;
            }

            /* renamed from: y */
            public C15776b mo75464y(C15768b bVar) {
                if ((this.f65137c & 1) != 1 || this.f65138d == C15768b.m95100x()) {
                    this.f65138d = bVar;
                } else {
                    this.f65138d = C15768b.m95095E(this.f65138d).mo71036o(bVar).mo75424s();
                }
                this.f65137c |= 1;
                return this;
            }

            /* renamed from: z */
            public C15776b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
                C15774d dVar;
                C15774d dVar2 = null;
                try {
                    C15774d c = C15774d.f65136c.mo71021c(eVar, fVar);
                    if (c != null) {
                        mo71036o(c);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    dVar = (C15774d) e.mo73276a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    dVar2 = dVar;
                }
                if (dVar2 != null) {
                    mo71036o(dVar2);
                }
                throw th;
            }
        }

        static {
            C15774d dVar = new C15774d(true);
            f65135a = dVar;
            dVar.m95166M();
        }

        /* renamed from: A */
        public static C15774d m95165A() {
            return f65135a;
        }

        /* renamed from: M */
        private void m95166M() {
            this.field_ = C15768b.m95100x();
            this.syntheticMethod_ = C15771c.m95136x();
            this.getter_ = C15771c.m95136x();
            this.setter_ = C15771c.m95136x();
            this.delegateMethod_ = C15771c.m95136x();
        }

        /* renamed from: N */
        public static C15776b m95167N() {
            return C15776b.m95197u();
        }

        /* renamed from: O */
        public static C15776b m95168O(C15774d dVar) {
            return m95167N().mo71036o(dVar);
        }

        /* renamed from: B */
        public C15771c mo75443B() {
            return this.delegateMethod_;
        }

        /* renamed from: C */
        public C15768b mo75444C() {
            return this.field_;
        }

        /* renamed from: D */
        public C15771c mo75445D() {
            return this.getter_;
        }

        /* renamed from: E */
        public C15771c mo75446E() {
            return this.setter_;
        }

        /* renamed from: F */
        public C15771c mo75447F() {
            return this.syntheticMethod_;
        }

        /* renamed from: G */
        public boolean mo75448G() {
            return (this.bitField0_ & 16) == 16;
        }

        /* renamed from: H */
        public boolean mo75449H() {
            return (this.bitField0_ & 1) == 1;
        }

        /* renamed from: I */
        public boolean mo75450I() {
            return (this.bitField0_ & 4) == 4;
        }

        /* renamed from: J */
        public boolean mo75451J() {
            return (this.bitField0_ & 8) == 8;
        }

        /* renamed from: L */
        public boolean mo75452L() {
            return (this.bitField0_ & 2) == 2;
        }

        /* renamed from: P */
        public C15776b mo71016d() {
            return m95167N();
        }

        /* renamed from: Q */
        public C15776b mo71014b() {
            return m95168O(this);
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
                i2 = 0 + CodedOutputStream.m90751s(1, this.field_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.m90751s(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.m90751s(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i2 += CodedOutputStream.m90751s(4, this.setter_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i2 += CodedOutputStream.m90751s(5, this.delegateMethod_);
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        /* renamed from: f */
        public C14519q<C15774d> mo71017f() {
            return f65136c;
        }

        /* renamed from: g */
        public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
            mo71015c();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo73253d0(1, this.field_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo73253d0(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.mo73253d0(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.mo73253d0(4, this.setter_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.mo73253d0(5, this.delegateMethod_);
            }
            codedOutputStream.mo73258i0(this.unknownFields);
        }

        private C15774d(C14495h.C14497b bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.mo73387n();
        }

        private C15774d(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = C14485d.f63329a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: nb.a$b$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: nb.a$c$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: nb.a$c$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: nb.a$c$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: nb.a$c$b} */
        /* JADX WARNING: type inference failed for: r6v0 */
        /* JADX WARNING: type inference failed for: r6v11 */
        /* JADX WARNING: type inference failed for: r6v12 */
        /* JADX WARNING: type inference failed for: r6v13 */
        /* JADX WARNING: type inference failed for: r6v14 */
        /* JADX WARNING: type inference failed for: r6v15 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C15774d(kotlin.reflect.jvm.internal.impl.protobuf.C14488e r8, kotlin.reflect.jvm.internal.impl.protobuf.C14490f r9) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /*
                r7 = this;
                r7.<init>()
                r0 = -1
                r7.memoizedIsInitialized = r0
                r7.memoizedSerializedSize = r0
                r7.m95166M()
                kotlin.reflect.jvm.internal.impl.protobuf.d$b r0 = kotlin.reflect.jvm.internal.impl.protobuf.C14485d.m90840s()
                r1 = 1
                kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m90731J(r0, r1)
                r3 = 0
            L_0x0015:
                if (r3 != 0) goto L_0x0131
                int r4 = r8.mo73335K()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                if (r4 == 0) goto L_0x0101
                r5 = 10
                r6 = 0
                if (r4 == r5) goto L_0x00da
                r5 = 18
                if (r4 == r5) goto L_0x00b2
                r5 = 26
                if (r4 == r5) goto L_0x008a
                r5 = 34
                if (r4 == r5) goto L_0x0062
                r5 = 42
                if (r4 == r5) goto L_0x003a
                boolean r4 = r7.mo73386q(r8, r2, r9, r4)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                if (r4 != 0) goto L_0x0015
                goto L_0x0101
            L_0x003a:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r5 = 16
                r4 = r4 & r5
                if (r4 != r5) goto L_0x0047
                nb.a$c r4 = r7.delegateMethod_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                nb.a$c$b r6 = r4.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x0047:
                kotlin.reflect.jvm.internal.impl.protobuf.q<nb.a$c> r4 = p336nb.C15766a.C15771c.f65131c     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r8.mo73356u(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                nb.a$c r4 = (p336nb.C15766a.C15771c) r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.delegateMethod_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                if (r6 == 0) goto L_0x005c
                r6.mo71036o(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                nb.a$c r4 = r6.mo75438s()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.delegateMethod_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x005c:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r4 = r4 | r5
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                goto L_0x0015
            L_0x0062:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r5 = 8
                r4 = r4 & r5
                if (r4 != r5) goto L_0x006f
                nb.a$c r4 = r7.setter_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                nb.a$c$b r6 = r4.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x006f:
                kotlin.reflect.jvm.internal.impl.protobuf.q<nb.a$c> r4 = p336nb.C15766a.C15771c.f65131c     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r8.mo73356u(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                nb.a$c r4 = (p336nb.C15766a.C15771c) r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.setter_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                if (r6 == 0) goto L_0x0084
                r6.mo71036o(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                nb.a$c r4 = r6.mo75438s()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.setter_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x0084:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r4 = r4 | r5
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                goto L_0x0015
            L_0x008a:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r5 = 4
                r4 = r4 & r5
                if (r4 != r5) goto L_0x0096
                nb.a$c r4 = r7.getter_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                nb.a$c$b r6 = r4.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x0096:
                kotlin.reflect.jvm.internal.impl.protobuf.q<nb.a$c> r4 = p336nb.C15766a.C15771c.f65131c     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r8.mo73356u(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                nb.a$c r4 = (p336nb.C15766a.C15771c) r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.getter_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                if (r6 == 0) goto L_0x00ab
                r6.mo71036o(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                nb.a$c r4 = r6.mo75438s()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.getter_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x00ab:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r4 = r4 | r5
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                goto L_0x0015
            L_0x00b2:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r5 = 2
                r4 = r4 & r5
                if (r4 != r5) goto L_0x00be
                nb.a$c r4 = r7.syntheticMethod_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                nb.a$c$b r6 = r4.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x00be:
                kotlin.reflect.jvm.internal.impl.protobuf.q<nb.a$c> r4 = p336nb.C15766a.C15771c.f65131c     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r8.mo73356u(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                nb.a$c r4 = (p336nb.C15766a.C15771c) r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.syntheticMethod_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                if (r6 == 0) goto L_0x00d3
                r6.mo71036o(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                nb.a$c r4 = r6.mo75438s()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.syntheticMethod_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x00d3:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r4 = r4 | r5
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                goto L_0x0015
            L_0x00da:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r4 = r4 & r1
                if (r4 != r1) goto L_0x00e5
                nb.a$b r4 = r7.field_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                nb.a$b$b r6 = r4.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x00e5:
                kotlin.reflect.jvm.internal.impl.protobuf.q<nb.a$b> r4 = p336nb.C15766a.C15768b.f65126c     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r8.mo73356u(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                nb.a$b r4 = (p336nb.C15766a.C15768b) r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.field_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                if (r6 == 0) goto L_0x00fa
                r6.mo71036o(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                nb.a$b r4 = r6.mo75424s()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.field_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x00fa:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r4 = r4 | r1
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                goto L_0x0015
            L_0x0101:
                r3 = 1
                goto L_0x0015
            L_0x0104:
                r8 = move-exception
                goto L_0x011b
            L_0x0106:
                r8 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r9 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0104 }
                java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x0104 }
                r9.<init>(r8)     // Catch:{ all -> 0x0104 }
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r8 = r9.mo73277i(r7)     // Catch:{ all -> 0x0104 }
                throw r8     // Catch:{ all -> 0x0104 }
            L_0x0115:
                r8 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r8 = r8.mo73277i(r7)     // Catch:{ all -> 0x0104 }
                throw r8     // Catch:{ all -> 0x0104 }
            L_0x011b:
                r2.mo73234I()     // Catch:{ IOException -> 0x011e, all -> 0x0125 }
            L_0x011e:
                kotlin.reflect.jvm.internal.impl.protobuf.d r9 = r0.mo73322g()
                r7.unknownFields = r9
                goto L_0x012d
            L_0x0125:
                r8 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.d r9 = r0.mo73322g()
                r7.unknownFields = r9
                throw r8
            L_0x012d:
                r7.mo73385m()
                throw r8
            L_0x0131:
                r2.mo73234I()     // Catch:{ IOException -> 0x0134, all -> 0x013b }
            L_0x0134:
                kotlin.reflect.jvm.internal.impl.protobuf.d r8 = r0.mo73322g()
                r7.unknownFields = r8
                goto L_0x0143
            L_0x013b:
                r8 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.d r9 = r0.mo73322g()
                r7.unknownFields = r9
                throw r8
            L_0x0143:
                r7.mo73385m()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p336nb.C15766a.C15774d.<init>(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
        }
    }
}
