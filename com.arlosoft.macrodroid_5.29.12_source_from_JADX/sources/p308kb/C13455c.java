package p308kb;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.C14478a;
import kotlin.reflect.jvm.internal.impl.protobuf.C14481b;
import kotlin.reflect.jvm.internal.impl.protobuf.C14485d;
import kotlin.reflect.jvm.internal.impl.protobuf.C14488e;
import kotlin.reflect.jvm.internal.impl.protobuf.C14490f;
import kotlin.reflect.jvm.internal.impl.protobuf.C14495h;
import kotlin.reflect.jvm.internal.impl.protobuf.C14503i;
import kotlin.reflect.jvm.internal.impl.protobuf.C14519q;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kb.c */
/* compiled from: ProtoBuf */
public final class C13455c extends C14495h.C14499d<C13455c> {

    /* renamed from: a */
    private static final C13455c f61555a;

    /* renamed from: c */
    public static C14519q<C13455c> f61556c = new C13456a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int companionObjectName_;
    /* access modifiers changed from: private */
    public List<C13460d> constructor_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> contextReceiverTypeId_;
    /* access modifiers changed from: private */
    public List<C13508q> contextReceiverType_;
    /* access modifiers changed from: private */
    public List<C13473g> enumEntry_;
    /* access modifiers changed from: private */
    public int flags_;
    /* access modifiers changed from: private */
    public int fqName_;
    /* access modifiers changed from: private */
    public List<C13481i> function_;
    /* access modifiers changed from: private */
    public int inlineClassUnderlyingPropertyName_;
    /* access modifiers changed from: private */
    public int inlineClassUnderlyingTypeId_;
    /* access modifiers changed from: private */
    public C13508q inlineClassUnderlyingType_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int multiFieldValueClassUnderlyingNameMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> multiFieldValueClassUnderlyingName_;
    private int multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> multiFieldValueClassUnderlyingTypeId_;
    /* access modifiers changed from: private */
    public List<C13508q> multiFieldValueClassUnderlyingType_;
    private int nestedClassNameMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> nestedClassName_;
    /* access modifiers changed from: private */
    public List<C13494n> property_;
    private int sealedSubclassFqNameMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> sealedSubclassFqName_;
    private int supertypeIdMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> supertypeId_;
    /* access modifiers changed from: private */
    public List<C13508q> supertype_;
    /* access modifiers changed from: private */
    public List<C13516r> typeAlias_;
    /* access modifiers changed from: private */
    public List<C13519s> typeParameter_;
    /* access modifiers changed from: private */
    public C13524t typeTable_;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;
    /* access modifiers changed from: private */
    public C13537w versionRequirementTable_;
    /* access modifiers changed from: private */
    public List<Integer> versionRequirement_;

    /* renamed from: kb.c$a */
    /* compiled from: ProtoBuf */
    static class C13456a extends C14481b<C13455c> {
        C13456a() {
        }

        /* renamed from: m */
        public C13455c mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13455c(eVar, fVar);
        }
    }

    /* renamed from: kb.c$b */
    /* compiled from: ProtoBuf */
    public static final class C13457b extends C14495h.C14498c<C13455c, C13457b> {

        /* renamed from: A */
        private List<Integer> f61557A = Collections.emptyList();

        /* renamed from: B */
        private List<Integer> f61558B = Collections.emptyList();

        /* renamed from: C */
        private List<C13508q> f61559C = Collections.emptyList();

        /* renamed from: D */
        private List<Integer> f61560D = Collections.emptyList();

        /* renamed from: E */
        private List<C13460d> f61561E = Collections.emptyList();

        /* renamed from: F */
        private List<C13481i> f61562F = Collections.emptyList();

        /* renamed from: G */
        private List<C13494n> f61563G = Collections.emptyList();

        /* renamed from: H */
        private List<C13516r> f61564H = Collections.emptyList();

        /* renamed from: I */
        private List<C13473g> f61565I = Collections.emptyList();

        /* renamed from: J */
        private List<Integer> f61566J = Collections.emptyList();

        /* renamed from: K */
        private int f61567K;

        /* renamed from: L */
        private C13508q f61568L = C13508q.m86912b0();

        /* renamed from: M */
        private int f61569M;

        /* renamed from: N */
        private List<Integer> f61570N = Collections.emptyList();

        /* renamed from: O */
        private List<C13508q> f61571O = Collections.emptyList();

        /* renamed from: P */
        private List<Integer> f61572P = Collections.emptyList();

        /* renamed from: Q */
        private C13524t f61573Q = C13524t.m87163y();

        /* renamed from: R */
        private List<Integer> f61574R = Collections.emptyList();

        /* renamed from: S */
        private C13537w f61575S = C13537w.m87312w();

        /* renamed from: f */
        private int f61576f;

        /* renamed from: g */
        private int f61577g = 6;

        /* renamed from: o */
        private int f61578o;

        /* renamed from: p */
        private int f61579p;

        /* renamed from: s */
        private List<C13519s> f61580s = Collections.emptyList();

        /* renamed from: z */
        private List<C13508q> f61581z = Collections.emptyList();

        private C13457b() {
            m86238T();
        }

        /* renamed from: A */
        private void m86222A() {
            if ((this.f61576f & 512) != 512) {
                this.f61561E = new ArrayList(this.f61561E);
                this.f61576f |= 512;
            }
        }

        /* renamed from: B */
        private void m86223B() {
            if ((this.f61576f & 256) != 256) {
                this.f61560D = new ArrayList(this.f61560D);
                this.f61576f |= 256;
            }
        }

        /* renamed from: C */
        private void m86224C() {
            if ((this.f61576f & 128) != 128) {
                this.f61559C = new ArrayList(this.f61559C);
                this.f61576f |= 128;
            }
        }

        /* renamed from: D */
        private void m86225D() {
            if ((this.f61576f & 8192) != 8192) {
                this.f61565I = new ArrayList(this.f61565I);
                this.f61576f |= 8192;
            }
        }

        /* renamed from: E */
        private void m86226E() {
            if ((this.f61576f & 1024) != 1024) {
                this.f61562F = new ArrayList(this.f61562F);
                this.f61576f |= 1024;
            }
        }

        /* renamed from: G */
        private void m86227G() {
            if ((this.f61576f & 262144) != 262144) {
                this.f61570N = new ArrayList(this.f61570N);
                this.f61576f |= 262144;
            }
        }

        /* renamed from: H */
        private void m86228H() {
            if ((this.f61576f & 1048576) != 1048576) {
                this.f61572P = new ArrayList(this.f61572P);
                this.f61576f |= 1048576;
            }
        }

        /* renamed from: J */
        private void m86229J() {
            if ((this.f61576f & 524288) != 524288) {
                this.f61571O = new ArrayList(this.f61571O);
                this.f61576f |= 524288;
            }
        }

        /* renamed from: K */
        private void m86230K() {
            if ((this.f61576f & 64) != 64) {
                this.f61558B = new ArrayList(this.f61558B);
                this.f61576f |= 64;
            }
        }

        /* renamed from: L */
        private void m86231L() {
            if ((this.f61576f & 2048) != 2048) {
                this.f61563G = new ArrayList(this.f61563G);
                this.f61576f |= 2048;
            }
        }

        /* renamed from: M */
        private void m86232M() {
            if ((this.f61576f & 16384) != 16384) {
                this.f61566J = new ArrayList(this.f61566J);
                this.f61576f |= 16384;
            }
        }

        /* renamed from: N */
        private void m86233N() {
            if ((this.f61576f & 32) != 32) {
                this.f61557A = new ArrayList(this.f61557A);
                this.f61576f |= 32;
            }
        }

        /* renamed from: O */
        private void m86234O() {
            if ((this.f61576f & 16) != 16) {
                this.f61581z = new ArrayList(this.f61581z);
                this.f61576f |= 16;
            }
        }

        /* renamed from: P */
        private void m86235P() {
            if ((this.f61576f & 4096) != 4096) {
                this.f61564H = new ArrayList(this.f61564H);
                this.f61576f |= 4096;
            }
        }

        /* renamed from: R */
        private void m86236R() {
            if ((this.f61576f & 8) != 8) {
                this.f61580s = new ArrayList(this.f61580s);
                this.f61576f |= 8;
            }
        }

        /* renamed from: S */
        private void m86237S() {
            if ((this.f61576f & 4194304) != 4194304) {
                this.f61574R = new ArrayList(this.f61574R);
                this.f61576f |= 4194304;
            }
        }

        /* renamed from: T */
        private void m86238T() {
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public static C13457b m86240z() {
            return new C13457b();
        }

        /* renamed from: U */
        public C13457b mo71036o(C13455c cVar) {
            if (cVar == C13455c.m86118F0()) {
                return this;
            }
            if (cVar.mo71139s1()) {
                mo71156b0(cVar.mo71104K0());
            }
            if (cVar.mo71140t1()) {
                mo71157c0(cVar.mo71105L0());
            }
            if (cVar.mo71138r1()) {
                mo71155a0(cVar.mo71144x0());
            }
            if (!cVar.typeParameter_.isEmpty()) {
                if (this.f61580s.isEmpty()) {
                    this.f61580s = cVar.typeParameter_;
                    this.f61576f &= -9;
                } else {
                    m86236R();
                    this.f61580s.addAll(cVar.typeParameter_);
                }
            }
            if (!cVar.supertype_.isEmpty()) {
                if (this.f61581z.isEmpty()) {
                    this.f61581z = cVar.supertype_;
                    this.f61576f &= -17;
                } else {
                    m86234O();
                    this.f61581z.addAll(cVar.supertype_);
                }
            }
            if (!cVar.supertypeId_.isEmpty()) {
                if (this.f61557A.isEmpty()) {
                    this.f61557A = cVar.supertypeId_;
                    this.f61576f &= -33;
                } else {
                    m86233N();
                    this.f61557A.addAll(cVar.supertypeId_);
                }
            }
            if (!cVar.nestedClassName_.isEmpty()) {
                if (this.f61558B.isEmpty()) {
                    this.f61558B = cVar.nestedClassName_;
                    this.f61576f &= -65;
                } else {
                    m86230K();
                    this.f61558B.addAll(cVar.nestedClassName_);
                }
            }
            if (!cVar.contextReceiverType_.isEmpty()) {
                if (this.f61559C.isEmpty()) {
                    this.f61559C = cVar.contextReceiverType_;
                    this.f61576f &= -129;
                } else {
                    m86224C();
                    this.f61559C.addAll(cVar.contextReceiverType_);
                }
            }
            if (!cVar.contextReceiverTypeId_.isEmpty()) {
                if (this.f61560D.isEmpty()) {
                    this.f61560D = cVar.contextReceiverTypeId_;
                    this.f61576f &= -257;
                } else {
                    m86223B();
                    this.f61560D.addAll(cVar.contextReceiverTypeId_);
                }
            }
            if (!cVar.constructor_.isEmpty()) {
                if (this.f61561E.isEmpty()) {
                    this.f61561E = cVar.constructor_;
                    this.f61576f &= -513;
                } else {
                    m86222A();
                    this.f61561E.addAll(cVar.constructor_);
                }
            }
            if (!cVar.function_.isEmpty()) {
                if (this.f61562F.isEmpty()) {
                    this.f61562F = cVar.function_;
                    this.f61576f &= -1025;
                } else {
                    m86226E();
                    this.f61562F.addAll(cVar.function_);
                }
            }
            if (!cVar.property_.isEmpty()) {
                if (this.f61563G.isEmpty()) {
                    this.f61563G = cVar.property_;
                    this.f61576f &= -2049;
                } else {
                    m86231L();
                    this.f61563G.addAll(cVar.property_);
                }
            }
            if (!cVar.typeAlias_.isEmpty()) {
                if (this.f61564H.isEmpty()) {
                    this.f61564H = cVar.typeAlias_;
                    this.f61576f &= -4097;
                } else {
                    m86235P();
                    this.f61564H.addAll(cVar.typeAlias_);
                }
            }
            if (!cVar.enumEntry_.isEmpty()) {
                if (this.f61565I.isEmpty()) {
                    this.f61565I = cVar.enumEntry_;
                    this.f61576f &= -8193;
                } else {
                    m86225D();
                    this.f61565I.addAll(cVar.enumEntry_);
                }
            }
            if (!cVar.sealedSubclassFqName_.isEmpty()) {
                if (this.f61566J.isEmpty()) {
                    this.f61566J = cVar.sealedSubclassFqName_;
                    this.f61576f &= -16385;
                } else {
                    m86232M();
                    this.f61566J.addAll(cVar.sealedSubclassFqName_);
                }
            }
            if (cVar.mo71141u1()) {
                mo71158d0(cVar.mo71109P0());
            }
            if (cVar.mo71142v1()) {
                mo71152X(cVar.mo71110Q0());
            }
            if (cVar.mo71143w1()) {
                mo71159e0(cVar.mo71111R0());
            }
            if (!cVar.multiFieldValueClassUnderlyingName_.isEmpty()) {
                if (this.f61570N.isEmpty()) {
                    this.f61570N = cVar.multiFieldValueClassUnderlyingName_;
                    this.f61576f &= -262145;
                } else {
                    m86227G();
                    this.f61570N.addAll(cVar.multiFieldValueClassUnderlyingName_);
                }
            }
            if (!cVar.multiFieldValueClassUnderlyingType_.isEmpty()) {
                if (this.f61571O.isEmpty()) {
                    this.f61571O = cVar.multiFieldValueClassUnderlyingType_;
                    this.f61576f &= -524289;
                } else {
                    m86229J();
                    this.f61571O.addAll(cVar.multiFieldValueClassUnderlyingType_);
                }
            }
            if (!cVar.multiFieldValueClassUnderlyingTypeId_.isEmpty()) {
                if (this.f61572P.isEmpty()) {
                    this.f61572P = cVar.multiFieldValueClassUnderlyingTypeId_;
                    this.f61576f &= -1048577;
                } else {
                    m86228H();
                    this.f61572P.addAll(cVar.multiFieldValueClassUnderlyingTypeId_);
                }
            }
            if (cVar.mo71145x1()) {
                mo71153Y(cVar.mo71135o1());
            }
            if (!cVar.versionRequirement_.isEmpty()) {
                if (this.f61574R.isEmpty()) {
                    this.f61574R = cVar.versionRequirement_;
                    this.f61576f &= -4194305;
                } else {
                    m86237S();
                    this.f61574R.addAll(cVar.versionRequirement_);
                }
            }
            if (cVar.mo71147y1()) {
                mo71154Z(cVar.mo71137q1());
            }
            mo73389t(cVar);
            mo73388p(mo73387n().mo73309d(cVar.unknownFields));
            return this;
        }

        /* renamed from: V */
        public C13457b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13455c cVar;
            C13455c cVar2 = null;
            try {
                C13455c c = C13455c.f61556c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                cVar = (C13455c) e.mo73276a();
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

        /* renamed from: X */
        public C13457b mo71152X(C13508q qVar) {
            if ((this.f61576f & 65536) != 65536 || this.f61568L == C13508q.m86912b0()) {
                this.f61568L = qVar;
            } else {
                this.f61568L = C13508q.m86898F0(this.f61568L).mo71036o(qVar).mo71497x();
            }
            this.f61576f |= 65536;
            return this;
        }

        /* renamed from: Y */
        public C13457b mo71153Y(C13524t tVar) {
            if ((this.f61576f & 2097152) != 2097152 || this.f61573Q == C13524t.m87163y()) {
                this.f61573Q = tVar;
            } else {
                this.f61573Q = C13524t.m87157G(this.f61573Q).mo71036o(tVar).mo71569s();
            }
            this.f61576f |= 2097152;
            return this;
        }

        /* renamed from: Z */
        public C13457b mo71154Z(C13537w wVar) {
            if ((this.f61576f & 8388608) != 8388608 || this.f61575S == C13537w.m87312w()) {
                this.f61575S = wVar;
            } else {
                this.f61575S = C13537w.m87308B(this.f61575S).mo71036o(wVar).mo71634s();
            }
            this.f61576f |= 8388608;
            return this;
        }

        /* renamed from: a0 */
        public C13457b mo71155a0(int i) {
            this.f61576f |= 4;
            this.f61579p = i;
            return this;
        }

        /* renamed from: b0 */
        public C13457b mo71156b0(int i) {
            this.f61576f |= 1;
            this.f61577g = i;
            return this;
        }

        /* renamed from: c0 */
        public C13457b mo71157c0(int i) {
            this.f61576f |= 2;
            this.f61578o = i;
            return this;
        }

        /* renamed from: d0 */
        public C13457b mo71158d0(int i) {
            this.f61576f |= 32768;
            this.f61567K = i;
            return this;
        }

        /* renamed from: e0 */
        public C13457b mo71159e0(int i) {
            this.f61576f |= 131072;
            this.f61569M = i;
            return this;
        }

        /* renamed from: v */
        public C13455c build() {
            C13455c x = mo71161x();
            if (x.mo71013a()) {
                return x;
            }
            throw C14478a.C14479a.m90815k(x);
        }

        /* renamed from: x */
        public C13455c mo71161x() {
            C13455c cVar = new C13455c((C14495h.C14498c) this);
            int i = this.f61576f;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = cVar.flags_ = this.f61577g;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = cVar.fqName_ = this.f61578o;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            int unused3 = cVar.companionObjectName_ = this.f61579p;
            if ((this.f61576f & 8) == 8) {
                this.f61580s = Collections.unmodifiableList(this.f61580s);
                this.f61576f &= -9;
            }
            List unused4 = cVar.typeParameter_ = this.f61580s;
            if ((this.f61576f & 16) == 16) {
                this.f61581z = Collections.unmodifiableList(this.f61581z);
                this.f61576f &= -17;
            }
            List unused5 = cVar.supertype_ = this.f61581z;
            if ((this.f61576f & 32) == 32) {
                this.f61557A = Collections.unmodifiableList(this.f61557A);
                this.f61576f &= -33;
            }
            List unused6 = cVar.supertypeId_ = this.f61557A;
            if ((this.f61576f & 64) == 64) {
                this.f61558B = Collections.unmodifiableList(this.f61558B);
                this.f61576f &= -65;
            }
            List unused7 = cVar.nestedClassName_ = this.f61558B;
            if ((this.f61576f & 128) == 128) {
                this.f61559C = Collections.unmodifiableList(this.f61559C);
                this.f61576f &= -129;
            }
            List unused8 = cVar.contextReceiverType_ = this.f61559C;
            if ((this.f61576f & 256) == 256) {
                this.f61560D = Collections.unmodifiableList(this.f61560D);
                this.f61576f &= -257;
            }
            List unused9 = cVar.contextReceiverTypeId_ = this.f61560D;
            if ((this.f61576f & 512) == 512) {
                this.f61561E = Collections.unmodifiableList(this.f61561E);
                this.f61576f &= -513;
            }
            List unused10 = cVar.constructor_ = this.f61561E;
            if ((this.f61576f & 1024) == 1024) {
                this.f61562F = Collections.unmodifiableList(this.f61562F);
                this.f61576f &= -1025;
            }
            List unused11 = cVar.function_ = this.f61562F;
            if ((this.f61576f & 2048) == 2048) {
                this.f61563G = Collections.unmodifiableList(this.f61563G);
                this.f61576f &= -2049;
            }
            List unused12 = cVar.property_ = this.f61563G;
            if ((this.f61576f & 4096) == 4096) {
                this.f61564H = Collections.unmodifiableList(this.f61564H);
                this.f61576f &= -4097;
            }
            List unused13 = cVar.typeAlias_ = this.f61564H;
            if ((this.f61576f & 8192) == 8192) {
                this.f61565I = Collections.unmodifiableList(this.f61565I);
                this.f61576f &= -8193;
            }
            List unused14 = cVar.enumEntry_ = this.f61565I;
            if ((this.f61576f & 16384) == 16384) {
                this.f61566J = Collections.unmodifiableList(this.f61566J);
                this.f61576f &= -16385;
            }
            List unused15 = cVar.sealedSubclassFqName_ = this.f61566J;
            if ((i & 32768) == 32768) {
                i2 |= 8;
            }
            int unused16 = cVar.inlineClassUnderlyingPropertyName_ = this.f61567K;
            if ((i & 65536) == 65536) {
                i2 |= 16;
            }
            C13508q unused17 = cVar.inlineClassUnderlyingType_ = this.f61568L;
            if ((i & 131072) == 131072) {
                i2 |= 32;
            }
            int unused18 = cVar.inlineClassUnderlyingTypeId_ = this.f61569M;
            if ((this.f61576f & 262144) == 262144) {
                this.f61570N = Collections.unmodifiableList(this.f61570N);
                this.f61576f &= -262145;
            }
            List unused19 = cVar.multiFieldValueClassUnderlyingName_ = this.f61570N;
            if ((this.f61576f & 524288) == 524288) {
                this.f61571O = Collections.unmodifiableList(this.f61571O);
                this.f61576f &= -524289;
            }
            List unused20 = cVar.multiFieldValueClassUnderlyingType_ = this.f61571O;
            if ((this.f61576f & 1048576) == 1048576) {
                this.f61572P = Collections.unmodifiableList(this.f61572P);
                this.f61576f &= -1048577;
            }
            List unused21 = cVar.multiFieldValueClassUnderlyingTypeId_ = this.f61572P;
            if ((i & 2097152) == 2097152) {
                i2 |= 64;
            }
            C13524t unused22 = cVar.typeTable_ = this.f61573Q;
            if ((this.f61576f & 4194304) == 4194304) {
                this.f61574R = Collections.unmodifiableList(this.f61574R);
                this.f61576f &= -4194305;
            }
            List unused23 = cVar.versionRequirement_ = this.f61574R;
            if ((i & 8388608) == 8388608) {
                i2 |= 128;
            }
            C13537w unused24 = cVar.versionRequirementTable_ = this.f61575S;
            int unused25 = cVar.bitField0_ = i2;
            return cVar;
        }

        /* renamed from: y */
        public C13457b mo71035l() {
            return m86240z().mo71036o(mo71161x());
        }
    }

    /* renamed from: kb.c$c */
    /* compiled from: ProtoBuf */
    public enum C13458c implements C14503i.C14504a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);
        

        /* renamed from: s */
        private static C14503i.C14505b<C13458c> f61589s;
        private final int value;

        /* renamed from: kb.c$c$a */
        /* compiled from: ProtoBuf */
        static class C13459a implements C14503i.C14505b<C13458c> {
            C13459a() {
            }

            /* renamed from: b */
            public C13458c mo71085a(int i) {
                return C13458c.m86258b(i);
            }
        }

        static {
            f61589s = new C13459a();
        }

        private C13458c(int i, int i2) {
            this.value = i2;
        }

        /* renamed from: b */
        public static C13458c m86258b(int i) {
            switch (i) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        /* renamed from: c */
        public final int mo71084c() {
            return this.value;
        }
    }

    static {
        C13455c cVar = new C13455c(true);
        f61555a = cVar;
        cVar.m86157z1();
    }

    /* renamed from: A1 */
    public static C13457b m86111A1() {
        return C13457b.m86240z();
    }

    /* renamed from: B1 */
    public static C13457b m86112B1(C13455c cVar) {
        return m86111A1().mo71036o(cVar);
    }

    /* renamed from: D1 */
    public static C13455c m86115D1(InputStream inputStream, C14490f fVar) throws IOException {
        return f61556c.mo73285a(inputStream, fVar);
    }

    /* renamed from: F0 */
    public static C13455c m86118F0() {
        return f61555a;
    }

    /* renamed from: z1 */
    private void m86157z1() {
        this.flags_ = 6;
        this.fqName_ = 0;
        this.companionObjectName_ = 0;
        this.typeParameter_ = Collections.emptyList();
        this.supertype_ = Collections.emptyList();
        this.supertypeId_ = Collections.emptyList();
        this.nestedClassName_ = Collections.emptyList();
        this.contextReceiverType_ = Collections.emptyList();
        this.contextReceiverTypeId_ = Collections.emptyList();
        this.constructor_ = Collections.emptyList();
        this.function_ = Collections.emptyList();
        this.property_ = Collections.emptyList();
        this.typeAlias_ = Collections.emptyList();
        this.enumEntry_ = Collections.emptyList();
        this.sealedSubclassFqName_ = Collections.emptyList();
        this.inlineClassUnderlyingPropertyName_ = 0;
        this.inlineClassUnderlyingType_ = C13508q.m86912b0();
        this.inlineClassUnderlyingTypeId_ = 0;
        this.multiFieldValueClassUnderlyingName_ = Collections.emptyList();
        this.multiFieldValueClassUnderlyingType_ = Collections.emptyList();
        this.multiFieldValueClassUnderlyingTypeId_ = Collections.emptyList();
        this.typeTable_ = C13524t.m87163y();
        this.versionRequirement_ = Collections.emptyList();
        this.versionRequirementTable_ = C13537w.m87312w();
    }

    /* renamed from: A0 */
    public List<C13460d> mo71093A0() {
        return this.constructor_;
    }

    /* renamed from: B0 */
    public C13508q mo71094B0(int i) {
        return this.contextReceiverType_.get(i);
    }

    /* renamed from: C0 */
    public int mo71095C0() {
        return this.contextReceiverType_.size();
    }

    /* renamed from: C1 */
    public C13457b mo71016d() {
        return m86111A1();
    }

    /* renamed from: D0 */
    public List<Integer> mo71097D0() {
        return this.contextReceiverTypeId_;
    }

    /* renamed from: E0 */
    public List<C13508q> mo71098E0() {
        return this.contextReceiverType_;
    }

    /* renamed from: E1 */
    public C13457b mo71014b() {
        return m86112B1(this);
    }

    /* renamed from: G0 */
    public C13455c mo71124e() {
        return f61555a;
    }

    /* renamed from: H0 */
    public C13473g mo71101H0(int i) {
        return this.enumEntry_.get(i);
    }

    /* renamed from: I0 */
    public int mo71102I0() {
        return this.enumEntry_.size();
    }

    /* renamed from: J0 */
    public List<C13473g> mo71103J0() {
        return this.enumEntry_;
    }

    /* renamed from: K0 */
    public int mo71104K0() {
        return this.flags_;
    }

    /* renamed from: L0 */
    public int mo71105L0() {
        return this.fqName_;
    }

    /* renamed from: M0 */
    public C13481i mo71106M0(int i) {
        return this.function_.get(i);
    }

    /* renamed from: N0 */
    public int mo71107N0() {
        return this.function_.size();
    }

    /* renamed from: O0 */
    public List<C13481i> mo71108O0() {
        return this.function_;
    }

    /* renamed from: P0 */
    public int mo71109P0() {
        return this.inlineClassUnderlyingPropertyName_;
    }

    /* renamed from: Q0 */
    public C13508q mo71110Q0() {
        return this.inlineClassUnderlyingType_;
    }

    /* renamed from: R0 */
    public int mo71111R0() {
        return this.inlineClassUnderlyingTypeId_;
    }

    /* renamed from: S0 */
    public int mo71112S0() {
        return this.multiFieldValueClassUnderlyingName_.size();
    }

    /* renamed from: T0 */
    public List<Integer> mo71113T0() {
        return this.multiFieldValueClassUnderlyingName_;
    }

    /* renamed from: U0 */
    public C13508q mo71114U0(int i) {
        return this.multiFieldValueClassUnderlyingType_.get(i);
    }

    /* renamed from: V0 */
    public int mo71115V0() {
        return this.multiFieldValueClassUnderlyingType_.size();
    }

    /* renamed from: W0 */
    public int mo71116W0() {
        return this.multiFieldValueClassUnderlyingTypeId_.size();
    }

    /* renamed from: X0 */
    public List<Integer> mo71117X0() {
        return this.multiFieldValueClassUnderlyingTypeId_;
    }

    /* renamed from: Y0 */
    public List<C13508q> mo71118Y0() {
        return this.multiFieldValueClassUnderlyingType_;
    }

    /* renamed from: Z0 */
    public List<Integer> mo71119Z0() {
        return this.nestedClassName_;
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
        if (!mo71140t1()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (int i = 0; i < mo71133m1(); i++) {
            if (!mo71132l1(i).mo71013a()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < mo71126f1(); i2++) {
            if (!mo71125e1(i2).mo71013a()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < mo71095C0(); i3++) {
            if (!mo71094B0(i3).mo71013a()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < mo71148z0(); i4++) {
            if (!mo71146y0(i4).mo71013a()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < mo71107N0(); i5++) {
            if (!mo71106M0(i5).mo71013a()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < mo71121b1(); i6++) {
            if (!mo71120a1(i6).mo71013a()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < mo71130j1(); i7++) {
            if (!mo71129i1(i7).mo71013a()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < mo71102I0(); i8++) {
            if (!mo71101H0(i8).mo71013a()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        if (!mo71142v1() || mo71110Q0().mo71013a()) {
            for (int i9 = 0; i9 < mo71115V0(); i9++) {
                if (!mo71114U0(i9).mo71013a()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (mo71145x1() && !mo71135o1().mo71013a()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!mo73391u()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        } else {
            this.memoizedIsInitialized = 0;
            return false;
        }
    }

    /* renamed from: a1 */
    public C13494n mo71120a1(int i) {
        return this.property_.get(i);
    }

    /* renamed from: b1 */
    public int mo71121b1() {
        return this.property_.size();
    }

    /* renamed from: c */
    public int mo71015c() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int o = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m90747o(1, this.flags_) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.supertypeId_.size(); i3++) {
            i2 += CodedOutputStream.m90748p(this.supertypeId_.get(i3).intValue());
        }
        int i4 = o + i2;
        if (!mo71127g1().isEmpty()) {
            i4 = i4 + 1 + CodedOutputStream.m90748p(i2);
        }
        this.supertypeIdMemoizedSerializedSize = i2;
        if ((this.bitField0_ & 2) == 2) {
            i4 += CodedOutputStream.m90747o(3, this.fqName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i4 += CodedOutputStream.m90747o(4, this.companionObjectName_);
        }
        for (int i5 = 0; i5 < this.typeParameter_.size(); i5++) {
            i4 += CodedOutputStream.m90751s(5, this.typeParameter_.get(i5));
        }
        for (int i6 = 0; i6 < this.supertype_.size(); i6++) {
            i4 += CodedOutputStream.m90751s(6, this.supertype_.get(i6));
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.nestedClassName_.size(); i8++) {
            i7 += CodedOutputStream.m90748p(this.nestedClassName_.get(i8).intValue());
        }
        int i9 = i4 + i7;
        if (!mo71119Z0().isEmpty()) {
            i9 = i9 + 1 + CodedOutputStream.m90748p(i7);
        }
        this.nestedClassNameMemoizedSerializedSize = i7;
        for (int i10 = 0; i10 < this.constructor_.size(); i10++) {
            i9 += CodedOutputStream.m90751s(8, this.constructor_.get(i10));
        }
        for (int i11 = 0; i11 < this.function_.size(); i11++) {
            i9 += CodedOutputStream.m90751s(9, this.function_.get(i11));
        }
        for (int i12 = 0; i12 < this.property_.size(); i12++) {
            i9 += CodedOutputStream.m90751s(10, this.property_.get(i12));
        }
        for (int i13 = 0; i13 < this.typeAlias_.size(); i13++) {
            i9 += CodedOutputStream.m90751s(11, this.typeAlias_.get(i13));
        }
        for (int i14 = 0; i14 < this.enumEntry_.size(); i14++) {
            i9 += CodedOutputStream.m90751s(13, this.enumEntry_.get(i14));
        }
        int i15 = 0;
        for (int i16 = 0; i16 < this.sealedSubclassFqName_.size(); i16++) {
            i15 += CodedOutputStream.m90748p(this.sealedSubclassFqName_.get(i16).intValue());
        }
        int i17 = i9 + i15;
        if (!mo71123d1().isEmpty()) {
            i17 = i17 + 2 + CodedOutputStream.m90748p(i15);
        }
        this.sealedSubclassFqNameMemoizedSerializedSize = i15;
        if ((this.bitField0_ & 8) == 8) {
            i17 += CodedOutputStream.m90747o(17, this.inlineClassUnderlyingPropertyName_);
        }
        if ((this.bitField0_ & 16) == 16) {
            i17 += CodedOutputStream.m90751s(18, this.inlineClassUnderlyingType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            i17 += CodedOutputStream.m90747o(19, this.inlineClassUnderlyingTypeId_);
        }
        for (int i18 = 0; i18 < this.contextReceiverType_.size(); i18++) {
            i17 += CodedOutputStream.m90751s(20, this.contextReceiverType_.get(i18));
        }
        int i19 = 0;
        for (int i20 = 0; i20 < this.contextReceiverTypeId_.size(); i20++) {
            i19 += CodedOutputStream.m90748p(this.contextReceiverTypeId_.get(i20).intValue());
        }
        int i21 = i17 + i19;
        if (!mo71097D0().isEmpty()) {
            i21 = i21 + 2 + CodedOutputStream.m90748p(i19);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = i19;
        int i22 = 0;
        for (int i23 = 0; i23 < this.multiFieldValueClassUnderlyingName_.size(); i23++) {
            i22 += CodedOutputStream.m90748p(this.multiFieldValueClassUnderlyingName_.get(i23).intValue());
        }
        int i24 = i21 + i22;
        if (!mo71113T0().isEmpty()) {
            i24 = i24 + 2 + CodedOutputStream.m90748p(i22);
        }
        this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = i22;
        for (int i25 = 0; i25 < this.multiFieldValueClassUnderlyingType_.size(); i25++) {
            i24 += CodedOutputStream.m90751s(23, this.multiFieldValueClassUnderlyingType_.get(i25));
        }
        int i26 = 0;
        for (int i27 = 0; i27 < this.multiFieldValueClassUnderlyingTypeId_.size(); i27++) {
            i26 += CodedOutputStream.m90748p(this.multiFieldValueClassUnderlyingTypeId_.get(i27).intValue());
        }
        int i28 = i24 + i26;
        if (!mo71117X0().isEmpty()) {
            i28 = i28 + 2 + CodedOutputStream.m90748p(i26);
        }
        this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = i26;
        if ((this.bitField0_ & 64) == 64) {
            i28 += CodedOutputStream.m90751s(30, this.typeTable_);
        }
        int i29 = 0;
        for (int i30 = 0; i30 < this.versionRequirement_.size(); i30++) {
            i29 += CodedOutputStream.m90748p(this.versionRequirement_.get(i30).intValue());
        }
        int size = i28 + i29 + (mo71136p1().size() * 2);
        if ((this.bitField0_ & 128) == 128) {
            size += CodedOutputStream.m90751s(32, this.versionRequirementTable_);
        }
        int v = size + mo73392v() + this.unknownFields.size();
        this.memoizedSerializedSize = v;
        return v;
    }

    /* renamed from: c1 */
    public List<C13494n> mo71122c1() {
        return this.property_;
    }

    /* renamed from: d1 */
    public List<Integer> mo71123d1() {
        return this.sealedSubclassFqName_;
    }

    /* renamed from: e1 */
    public C13508q mo71125e1(int i) {
        return this.supertype_.get(i);
    }

    /* renamed from: f */
    public C14519q<C13455c> mo71017f() {
        return f61556c;
    }

    /* renamed from: f1 */
    public int mo71126f1() {
        return this.supertype_.size();
    }

    /* renamed from: g */
    public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
        mo71015c();
        C14495h.C14499d<MessageType>.a A = mo73390A();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo73250a0(1, this.flags_);
        }
        if (mo71127g1().size() > 0) {
            codedOutputStream.mo73264o0(18);
            codedOutputStream.mo73264o0(this.supertypeIdMemoizedSerializedSize);
        }
        for (int i = 0; i < this.supertypeId_.size(); i++) {
            codedOutputStream.mo73251b0(this.supertypeId_.get(i).intValue());
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo73250a0(3, this.fqName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo73250a0(4, this.companionObjectName_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            codedOutputStream.mo73253d0(5, this.typeParameter_.get(i2));
        }
        for (int i3 = 0; i3 < this.supertype_.size(); i3++) {
            codedOutputStream.mo73253d0(6, this.supertype_.get(i3));
        }
        if (mo71119Z0().size() > 0) {
            codedOutputStream.mo73264o0(58);
            codedOutputStream.mo73264o0(this.nestedClassNameMemoizedSerializedSize);
        }
        for (int i4 = 0; i4 < this.nestedClassName_.size(); i4++) {
            codedOutputStream.mo73251b0(this.nestedClassName_.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.constructor_.size(); i5++) {
            codedOutputStream.mo73253d0(8, this.constructor_.get(i5));
        }
        for (int i6 = 0; i6 < this.function_.size(); i6++) {
            codedOutputStream.mo73253d0(9, this.function_.get(i6));
        }
        for (int i7 = 0; i7 < this.property_.size(); i7++) {
            codedOutputStream.mo73253d0(10, this.property_.get(i7));
        }
        for (int i8 = 0; i8 < this.typeAlias_.size(); i8++) {
            codedOutputStream.mo73253d0(11, this.typeAlias_.get(i8));
        }
        for (int i9 = 0; i9 < this.enumEntry_.size(); i9++) {
            codedOutputStream.mo73253d0(13, this.enumEntry_.get(i9));
        }
        if (mo71123d1().size() > 0) {
            codedOutputStream.mo73264o0(130);
            codedOutputStream.mo73264o0(this.sealedSubclassFqNameMemoizedSerializedSize);
        }
        for (int i10 = 0; i10 < this.sealedSubclassFqName_.size(); i10++) {
            codedOutputStream.mo73251b0(this.sealedSubclassFqName_.get(i10).intValue());
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo73250a0(17, this.inlineClassUnderlyingPropertyName_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo73253d0(18, this.inlineClassUnderlyingType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.mo73250a0(19, this.inlineClassUnderlyingTypeId_);
        }
        for (int i11 = 0; i11 < this.contextReceiverType_.size(); i11++) {
            codedOutputStream.mo73253d0(20, this.contextReceiverType_.get(i11));
        }
        if (mo71097D0().size() > 0) {
            codedOutputStream.mo73264o0(170);
            codedOutputStream.mo73264o0(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i12 = 0; i12 < this.contextReceiverTypeId_.size(); i12++) {
            codedOutputStream.mo73251b0(this.contextReceiverTypeId_.get(i12).intValue());
        }
        if (mo71113T0().size() > 0) {
            codedOutputStream.mo73264o0(178);
            codedOutputStream.mo73264o0(this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize);
        }
        for (int i13 = 0; i13 < this.multiFieldValueClassUnderlyingName_.size(); i13++) {
            codedOutputStream.mo73251b0(this.multiFieldValueClassUnderlyingName_.get(i13).intValue());
        }
        for (int i14 = 0; i14 < this.multiFieldValueClassUnderlyingType_.size(); i14++) {
            codedOutputStream.mo73253d0(23, this.multiFieldValueClassUnderlyingType_.get(i14));
        }
        if (mo71117X0().size() > 0) {
            codedOutputStream.mo73264o0(194);
            codedOutputStream.mo73264o0(this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize);
        }
        for (int i15 = 0; i15 < this.multiFieldValueClassUnderlyingTypeId_.size(); i15++) {
            codedOutputStream.mo73251b0(this.multiFieldValueClassUnderlyingTypeId_.get(i15).intValue());
        }
        if ((this.bitField0_ & 64) == 64) {
            codedOutputStream.mo73253d0(30, this.typeTable_);
        }
        for (int i16 = 0; i16 < this.versionRequirement_.size(); i16++) {
            codedOutputStream.mo73250a0(31, this.versionRequirement_.get(i16).intValue());
        }
        if ((this.bitField0_ & 128) == 128) {
            codedOutputStream.mo73253d0(32, this.versionRequirementTable_);
        }
        A.mo73397a(19000, codedOutputStream);
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    /* renamed from: g1 */
    public List<Integer> mo71127g1() {
        return this.supertypeId_;
    }

    /* renamed from: h1 */
    public List<C13508q> mo71128h1() {
        return this.supertype_;
    }

    /* renamed from: i1 */
    public C13516r mo71129i1(int i) {
        return this.typeAlias_.get(i);
    }

    /* renamed from: j1 */
    public int mo71130j1() {
        return this.typeAlias_.size();
    }

    /* renamed from: k1 */
    public List<C13516r> mo71131k1() {
        return this.typeAlias_;
    }

    /* renamed from: l1 */
    public C13519s mo71132l1(int i) {
        return this.typeParameter_.get(i);
    }

    /* renamed from: m1 */
    public int mo71133m1() {
        return this.typeParameter_.size();
    }

    /* renamed from: n1 */
    public List<C13519s> mo71134n1() {
        return this.typeParameter_;
    }

    /* renamed from: o1 */
    public C13524t mo71135o1() {
        return this.typeTable_;
    }

    /* renamed from: p1 */
    public List<Integer> mo71136p1() {
        return this.versionRequirement_;
    }

    /* renamed from: q1 */
    public C13537w mo71137q1() {
        return this.versionRequirementTable_;
    }

    /* renamed from: r1 */
    public boolean mo71138r1() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: s1 */
    public boolean mo71139s1() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: t1 */
    public boolean mo71140t1() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: u1 */
    public boolean mo71141u1() {
        return (this.bitField0_ & 8) == 8;
    }

    /* renamed from: v1 */
    public boolean mo71142v1() {
        return (this.bitField0_ & 16) == 16;
    }

    /* renamed from: w1 */
    public boolean mo71143w1() {
        return (this.bitField0_ & 32) == 32;
    }

    /* renamed from: x0 */
    public int mo71144x0() {
        return this.companionObjectName_;
    }

    /* renamed from: x1 */
    public boolean mo71145x1() {
        return (this.bitField0_ & 64) == 64;
    }

    /* renamed from: y0 */
    public C13460d mo71146y0(int i) {
        return this.constructor_.get(i);
    }

    /* renamed from: y1 */
    public boolean mo71147y1() {
        return (this.bitField0_ & 128) == 128;
    }

    /* renamed from: z0 */
    public int mo71148z0() {
        return this.constructor_.size();
    }

    private C13455c(C14495h.C14498c<C13455c, ?> cVar) {
        super(cVar);
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = -1;
        this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo73387n();
    }

    private C13455c(boolean z) {
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = -1;
        this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: kb.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: kb.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: kb.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v82, resolved type: kb.t$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: kb.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v23, resolved type: kb.w$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: kb.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: kb.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: kb.q$c} */
    /* JADX WARNING: type inference failed for: r16v4, types: [kb.t$b] */
    /* JADX WARNING: type inference failed for: r16v7, types: [kb.w$b] */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x043a, code lost:
        r7 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C13455c(kotlin.reflect.jvm.internal.impl.protobuf.C14488e r18, kotlin.reflect.jvm.internal.impl.protobuf.C14490f r19) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r17.<init>()
            r4 = -1
            r1.supertypeIdMemoizedSerializedSize = r4
            r1.nestedClassNameMemoizedSerializedSize = r4
            r1.contextReceiverTypeIdMemoizedSerializedSize = r4
            r1.sealedSubclassFqNameMemoizedSerializedSize = r4
            r1.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = r4
            r1.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = r4
            r1.memoizedIsInitialized = r4
            r1.memoizedSerializedSize = r4
            r17.m86157z1()
            kotlin.reflect.jvm.internal.impl.protobuf.d$b r4 = kotlin.reflect.jvm.internal.impl.protobuf.C14485d.m90840s()
            r5 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r6 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m90731J(r4, r5)
            r7 = 0
            r8 = 0
        L_0x0028:
            r9 = 524288(0x80000, float:7.34684E-40)
            r5 = 4194304(0x400000, float:5.877472E-39)
            r14 = 1048576(0x100000, float:1.469368E-39)
            r13 = 262144(0x40000, float:3.67342E-40)
            r11 = 128(0x80, float:1.794E-43)
            r10 = 64
            if (r7 != 0) goto L_0x0549
            int r15 = r18.mo73335K()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r16 = 0
            switch(r15) {
                case 0: goto L_0x0439;
                case 8: goto L_0x042c;
                case 16: goto L_0x040e;
                case 18: goto L_0x03d9;
                case 24: goto L_0x03cc;
                case 32: goto L_0x03bf;
                case 42: goto L_0x03a4;
                case 50: goto L_0x0388;
                case 56: goto L_0x036c;
                case 58: goto L_0x0338;
                case 66: goto L_0x031c;
                case 74: goto L_0x0300;
                case 82: goto L_0x02e4;
                case 90: goto L_0x02c8;
                case 106: goto L_0x02ac;
                case 128: goto L_0x028e;
                case 130: goto L_0x0258;
                case 136: goto L_0x0249;
                case 146: goto L_0x021c;
                case 152: goto L_0x020d;
                case 162: goto L_0x01f1;
                case 168: goto L_0x01d3;
                case 170: goto L_0x019d;
                case 176: goto L_0x0182;
                case 178: goto L_0x014f;
                case 186: goto L_0x0136;
                case 192: goto L_0x011b;
                case 194: goto L_0x00e8;
                case 242: goto L_0x00bf;
                case 248: goto L_0x00a4;
                case 250: goto L_0x006f;
                case 258: goto L_0x0046;
                default: goto L_0x003f;
            }     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
        L_0x003f:
            r12 = 1
            boolean r5 = r1.mo73386q(r2, r6, r3, r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x043c
        L_0x0046:
            int r15 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r15 = r15 & r11
            if (r15 != r11) goto L_0x0051
            kb.w r15 = r1.versionRequirementTable_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kb.w$b r16 = r15.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
        L_0x0051:
            r15 = r16
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.w> r12 = p308kb.C13537w.f61806c     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r12 = r2.mo73356u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kb.w r12 = (p308kb.C13537w) r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.versionRequirementTable_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r15 == 0) goto L_0x0068
            r15.mo71036o(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kb.w r12 = r15.mo71634s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.versionRequirementTable_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
        L_0x0068:
            int r12 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = r12 | r11
            r1.bitField0_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x006f:
            int r12 = r18.mo73326A()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r12 = r2.mo73345j(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r15 = r8 & r5
            if (r15 == r5) goto L_0x0089
            int r15 = r18.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r15 <= 0) goto L_0x0089
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r15.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.versionRequirement_ = r15     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | r5
        L_0x0089:
            int r15 = r18.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r15 <= 0) goto L_0x009f
            java.util.List<java.lang.Integer> r15 = r1.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r16 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r16)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r15.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x0089
        L_0x009f:
            r2.mo73344i(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x00a4:
            r11 = r8 & r5
            if (r11 == r5) goto L_0x00b0
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.versionRequirement_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | r5
        L_0x00b0:
            java.util.List<java.lang.Integer> r11 = r1.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r12 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x00bf:
            int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11 = r11 & r10
            if (r11 != r10) goto L_0x00ca
            kb.t r11 = r1.typeTable_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kb.t$b r16 = r11.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
        L_0x00ca:
            r11 = r16
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.t> r12 = p308kb.C13524t.f61773c     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r12 = r2.mo73356u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kb.t r12 = (p308kb.C13524t) r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.typeTable_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r11 == 0) goto L_0x00e1
            r11.mo71036o(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kb.t r11 = r11.mo71569s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.typeTable_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
        L_0x00e1:
            int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11 = r11 | r10
            r1.bitField0_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x00e8:
            int r11 = r18.mo73326A()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r2.mo73345j(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = r8 & r14
            if (r12 == r14) goto L_0x0102
            int r12 = r18.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x0102
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.multiFieldValueClassUnderlyingTypeId_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | r14
        L_0x0102:
            int r12 = r18.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x0116
            java.util.List<java.lang.Integer> r12 = r1.multiFieldValueClassUnderlyingTypeId_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r15 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.add(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x0102
        L_0x0116:
            r2.mo73344i(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x011b:
            r11 = r8 & r14
            if (r11 == r14) goto L_0x0127
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.multiFieldValueClassUnderlyingTypeId_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | r14
        L_0x0127:
            java.util.List<java.lang.Integer> r11 = r1.multiFieldValueClassUnderlyingTypeId_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r12 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x0136:
            r11 = r8 & r9
            if (r11 == r9) goto L_0x0142
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.multiFieldValueClassUnderlyingType_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | r9
        L_0x0142:
            java.util.List<kb.q> r11 = r1.multiFieldValueClassUnderlyingType_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.q> r12 = p308kb.C13508q.f61718c     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r12 = r2.mo73356u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x014f:
            int r11 = r18.mo73326A()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r2.mo73345j(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = r8 & r13
            if (r12 == r13) goto L_0x0169
            int r12 = r18.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x0169
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.multiFieldValueClassUnderlyingName_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | r13
        L_0x0169:
            int r12 = r18.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x017d
            java.util.List<java.lang.Integer> r12 = r1.multiFieldValueClassUnderlyingName_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r15 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.add(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x0169
        L_0x017d:
            r2.mo73344i(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x0182:
            r11 = r8 & r13
            if (r11 == r13) goto L_0x018e
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.multiFieldValueClassUnderlyingName_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | r13
        L_0x018e:
            java.util.List<java.lang.Integer> r11 = r1.multiFieldValueClassUnderlyingName_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r12 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x019d:
            int r11 = r18.mo73326A()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r2.mo73345j(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = r8 & 256(0x100, float:3.59E-43)
            r15 = 256(0x100, float:3.59E-43)
            if (r12 == r15) goto L_0x01ba
            int r12 = r18.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x01ba
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.contextReceiverTypeId_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 256(0x100, float:3.59E-43)
        L_0x01ba:
            int r12 = r18.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x01ce
            java.util.List<java.lang.Integer> r12 = r1.contextReceiverTypeId_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r15 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.add(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x01ba
        L_0x01ce:
            r2.mo73344i(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x01d3:
            r11 = r8 & 256(0x100, float:3.59E-43)
            r12 = 256(0x100, float:3.59E-43)
            if (r11 == r12) goto L_0x01e2
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.contextReceiverTypeId_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 256(0x100, float:3.59E-43)
        L_0x01e2:
            java.util.List<java.lang.Integer> r11 = r1.contextReceiverTypeId_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r12 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x01f1:
            r11 = r8 & 128(0x80, float:1.794E-43)
            r12 = 128(0x80, float:1.794E-43)
            if (r11 == r12) goto L_0x0200
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.contextReceiverType_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 128(0x80, float:1.794E-43)
        L_0x0200:
            java.util.List<kb.q> r11 = r1.contextReceiverType_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.q> r12 = p308kb.C13508q.f61718c     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r12 = r2.mo73356u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x020d:
            int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = 32
            r11 = r11 | r12
            r1.bitField0_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.inlineClassUnderlyingTypeId_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x021c:
            int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = 16
            r11 = r11 & r12
            if (r11 != r12) goto L_0x0229
            kb.q r11 = r1.inlineClassUnderlyingType_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kb.q$c r16 = r11.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
        L_0x0229:
            r11 = r16
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.q> r12 = p308kb.C13508q.f61718c     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r12 = r2.mo73356u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kb.q r12 = (p308kb.C13508q) r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.inlineClassUnderlyingType_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r11 == 0) goto L_0x0240
            r11.mo71036o(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kb.q r11 = r11.mo71497x()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.inlineClassUnderlyingType_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
        L_0x0240:
            int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = 16
            r11 = r11 | r12
            r1.bitField0_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x0249:
            int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = 8
            r11 = r11 | r12
            r1.bitField0_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.inlineClassUnderlyingPropertyName_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x0258:
            int r11 = r18.mo73326A()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r2.mo73345j(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = r8 & 16384(0x4000, float:2.2959E-41)
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r12 == r15) goto L_0x0275
            int r12 = r18.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x0275
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.sealedSubclassFqName_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
        L_0x0275:
            int r12 = r18.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x0289
            java.util.List<java.lang.Integer> r12 = r1.sealedSubclassFqName_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r15 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.add(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x0275
        L_0x0289:
            r2.mo73344i(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x028e:
            r11 = r8 & 16384(0x4000, float:2.2959E-41)
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r11 == r12) goto L_0x029d
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.sealedSubclassFqName_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
        L_0x029d:
            java.util.List<java.lang.Integer> r11 = r1.sealedSubclassFqName_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r12 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x02ac:
            r11 = r8 & 8192(0x2000, float:1.14794E-41)
            r12 = 8192(0x2000, float:1.14794E-41)
            if (r11 == r12) goto L_0x02bb
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.enumEntry_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
        L_0x02bb:
            java.util.List<kb.g> r11 = r1.enumEntry_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.g> r12 = p308kb.C13473g.f61619c     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r12 = r2.mo73356u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x02c8:
            r11 = r8 & 4096(0x1000, float:5.74E-42)
            r12 = 4096(0x1000, float:5.74E-42)
            if (r11 == r12) goto L_0x02d7
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.typeAlias_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 4096(0x1000, float:5.74E-42)
        L_0x02d7:
            java.util.List<kb.r> r11 = r1.typeAlias_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.r> r12 = p308kb.C13516r.f61747c     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r12 = r2.mo73356u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x02e4:
            r11 = r8 & 2048(0x800, float:2.87E-42)
            r12 = 2048(0x800, float:2.87E-42)
            if (r11 == r12) goto L_0x02f3
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.property_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 2048(0x800, float:2.87E-42)
        L_0x02f3:
            java.util.List<kb.n> r11 = r1.property_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.n> r12 = p308kb.C13494n.f61682c     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r12 = r2.mo73356u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x0300:
            r11 = r8 & 1024(0x400, float:1.435E-42)
            r12 = 1024(0x400, float:1.435E-42)
            if (r11 == r12) goto L_0x030f
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.function_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 1024(0x400, float:1.435E-42)
        L_0x030f:
            java.util.List<kb.i> r11 = r1.function_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.i> r12 = p308kb.C13481i.f61638c     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r12 = r2.mo73356u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x031c:
            r11 = r8 & 512(0x200, float:7.175E-43)
            r12 = 512(0x200, float:7.175E-43)
            if (r11 == r12) goto L_0x032b
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.constructor_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 512(0x200, float:7.175E-43)
        L_0x032b:
            java.util.List<kb.d> r11 = r1.constructor_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.d> r12 = p308kb.C13460d.f61592c     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r12 = r2.mo73356u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x0338:
            int r11 = r18.mo73326A()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r2.mo73345j(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = r8 & 64
            if (r12 == r10) goto L_0x0353
            int r12 = r18.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x0353
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.nestedClassName_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 64
        L_0x0353:
            int r12 = r18.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x0367
            java.util.List<java.lang.Integer> r12 = r1.nestedClassName_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r15 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.add(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x0353
        L_0x0367:
            r2.mo73344i(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x036c:
            r11 = r8 & 64
            if (r11 == r10) goto L_0x0379
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.nestedClassName_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 64
        L_0x0379:
            java.util.List<java.lang.Integer> r11 = r1.nestedClassName_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r12 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x0388:
            r11 = r8 & 16
            r12 = 16
            if (r11 == r12) goto L_0x0397
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.supertype_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 16
        L_0x0397:
            java.util.List<kb.q> r11 = r1.supertype_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.q> r12 = p308kb.C13508q.f61718c     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r12 = r2.mo73356u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x03a4:
            r11 = r8 & 8
            r12 = 8
            if (r11 == r12) goto L_0x03b3
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.typeParameter_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 8
        L_0x03b3:
            java.util.List<kb.s> r11 = r1.typeParameter_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.s> r12 = p308kb.C13519s.f61759c     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r12 = r2.mo73356u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x03bf:
            int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11 = r11 | 4
            r1.bitField0_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.companionObjectName_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x03cc:
            int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11 = r11 | 2
            r1.bitField0_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.fqName_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x03d9:
            int r11 = r18.mo73326A()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r2.mo73345j(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = r8 & 32
            r15 = 32
            if (r12 == r15) goto L_0x03f6
            int r12 = r18.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x03f6
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.supertypeId_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 32
        L_0x03f6:
            int r12 = r18.mo73342e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x040a
            java.util.List<java.lang.Integer> r12 = r1.supertypeId_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r15 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.add(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x03f6
        L_0x040a:
            r2.mo73344i(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x040e:
            r11 = r8 & 32
            r12 = 32
            if (r11 == r12) goto L_0x041d
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.supertypeId_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 32
        L_0x041d:
            java.util.List<java.lang.Integer> r11 = r1.supertypeId_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r12 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
        L_0x042a:
            r12 = 1
            goto L_0x043f
        L_0x042c:
            int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = 1
            r11 = r11 | r12
            r1.bitField0_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r18.mo73354s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.flags_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x043f
        L_0x0439:
            r12 = 1
        L_0x043a:
            r7 = 1
            goto L_0x043f
        L_0x043c:
            if (r5 != 0) goto L_0x043f
            goto L_0x043a
        L_0x043f:
            r5 = 1
            goto L_0x0028
        L_0x0442:
            r0 = move-exception
            r2 = r0
            goto L_0x045c
        L_0x0445:
            r0 = move-exception
            r2 = r0
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r3 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0442 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0442 }
            r3.<init>(r2)     // Catch:{ all -> 0x0442 }
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r2 = r3.mo73277i(r1)     // Catch:{ all -> 0x0442 }
            throw r2     // Catch:{ all -> 0x0442 }
        L_0x0455:
            r0 = move-exception
            r2 = r0
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r2 = r2.mo73277i(r1)     // Catch:{ all -> 0x0442 }
            throw r2     // Catch:{ all -> 0x0442 }
        L_0x045c:
            r3 = r8 & 32
            r7 = 32
            if (r3 != r7) goto L_0x046a
            java.util.List<java.lang.Integer> r3 = r1.supertypeId_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.supertypeId_ = r3
        L_0x046a:
            r3 = r8 & 8
            r7 = 8
            if (r3 != r7) goto L_0x0478
            java.util.List<kb.s> r3 = r1.typeParameter_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.typeParameter_ = r3
        L_0x0478:
            r3 = r8 & 16
            r7 = 16
            if (r3 != r7) goto L_0x0486
            java.util.List<kb.q> r3 = r1.supertype_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.supertype_ = r3
        L_0x0486:
            r3 = r8 & 64
            if (r3 != r10) goto L_0x0492
            java.util.List<java.lang.Integer> r3 = r1.nestedClassName_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.nestedClassName_ = r3
        L_0x0492:
            r3 = r8 & 512(0x200, float:7.175E-43)
            r7 = 512(0x200, float:7.175E-43)
            if (r3 != r7) goto L_0x04a0
            java.util.List<kb.d> r3 = r1.constructor_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.constructor_ = r3
        L_0x04a0:
            r3 = r8 & 1024(0x400, float:1.435E-42)
            r7 = 1024(0x400, float:1.435E-42)
            if (r3 != r7) goto L_0x04ae
            java.util.List<kb.i> r3 = r1.function_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.function_ = r3
        L_0x04ae:
            r3 = r8 & 2048(0x800, float:2.87E-42)
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 != r7) goto L_0x04bc
            java.util.List<kb.n> r3 = r1.property_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.property_ = r3
        L_0x04bc:
            r3 = r8 & 4096(0x1000, float:5.74E-42)
            r7 = 4096(0x1000, float:5.74E-42)
            if (r3 != r7) goto L_0x04ca
            java.util.List<kb.r> r3 = r1.typeAlias_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.typeAlias_ = r3
        L_0x04ca:
            r3 = r8 & 8192(0x2000, float:1.14794E-41)
            r7 = 8192(0x2000, float:1.14794E-41)
            if (r3 != r7) goto L_0x04d8
            java.util.List<kb.g> r3 = r1.enumEntry_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.enumEntry_ = r3
        L_0x04d8:
            r3 = r8 & 16384(0x4000, float:2.2959E-41)
            r7 = 16384(0x4000, float:2.2959E-41)
            if (r3 != r7) goto L_0x04e6
            java.util.List<java.lang.Integer> r3 = r1.sealedSubclassFqName_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.sealedSubclassFqName_ = r3
        L_0x04e6:
            r3 = r8 & 128(0x80, float:1.794E-43)
            r7 = 128(0x80, float:1.794E-43)
            if (r3 != r7) goto L_0x04f4
            java.util.List<kb.q> r3 = r1.contextReceiverType_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.contextReceiverType_ = r3
        L_0x04f4:
            r3 = r8 & 256(0x100, float:3.59E-43)
            r7 = 256(0x100, float:3.59E-43)
            if (r3 != r7) goto L_0x0502
            java.util.List<java.lang.Integer> r3 = r1.contextReceiverTypeId_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.contextReceiverTypeId_ = r3
        L_0x0502:
            r3 = r8 & r13
            if (r3 != r13) goto L_0x050e
            java.util.List<java.lang.Integer> r3 = r1.multiFieldValueClassUnderlyingName_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.multiFieldValueClassUnderlyingName_ = r3
        L_0x050e:
            r3 = r8 & r9
            if (r3 != r9) goto L_0x051a
            java.util.List<kb.q> r3 = r1.multiFieldValueClassUnderlyingType_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.multiFieldValueClassUnderlyingType_ = r3
        L_0x051a:
            r3 = r8 & r14
            if (r3 != r14) goto L_0x0526
            java.util.List<java.lang.Integer> r3 = r1.multiFieldValueClassUnderlyingTypeId_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.multiFieldValueClassUnderlyingTypeId_ = r3
        L_0x0526:
            r3 = r8 & r5
            if (r3 != r5) goto L_0x0532
            java.util.List<java.lang.Integer> r3 = r1.versionRequirement_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.versionRequirement_ = r3
        L_0x0532:
            r6.mo73234I()     // Catch:{ IOException -> 0x0535, all -> 0x053c }
        L_0x0535:
            kotlin.reflect.jvm.internal.impl.protobuf.d r3 = r4.mo73322g()
            r1.unknownFields = r3
            goto L_0x0545
        L_0x053c:
            r0 = move-exception
            r2 = r0
            kotlin.reflect.jvm.internal.impl.protobuf.d r3 = r4.mo73322g()
            r1.unknownFields = r3
            throw r2
        L_0x0545:
            r17.mo73385m()
            throw r2
        L_0x0549:
            r2 = r8 & 32
            r3 = 32
            if (r2 != r3) goto L_0x0557
            java.util.List<java.lang.Integer> r2 = r1.supertypeId_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.supertypeId_ = r2
        L_0x0557:
            r2 = r8 & 8
            r3 = 8
            if (r2 != r3) goto L_0x0565
            java.util.List<kb.s> r2 = r1.typeParameter_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.typeParameter_ = r2
        L_0x0565:
            r2 = r8 & 16
            r3 = 16
            if (r2 != r3) goto L_0x0573
            java.util.List<kb.q> r2 = r1.supertype_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.supertype_ = r2
        L_0x0573:
            r2 = r8 & 64
            if (r2 != r10) goto L_0x057f
            java.util.List<java.lang.Integer> r2 = r1.nestedClassName_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.nestedClassName_ = r2
        L_0x057f:
            r2 = r8 & 512(0x200, float:7.175E-43)
            r3 = 512(0x200, float:7.175E-43)
            if (r2 != r3) goto L_0x058d
            java.util.List<kb.d> r2 = r1.constructor_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.constructor_ = r2
        L_0x058d:
            r2 = r8 & 1024(0x400, float:1.435E-42)
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 != r3) goto L_0x059b
            java.util.List<kb.i> r2 = r1.function_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.function_ = r2
        L_0x059b:
            r2 = r8 & 2048(0x800, float:2.87E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 != r3) goto L_0x05a9
            java.util.List<kb.n> r2 = r1.property_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.property_ = r2
        L_0x05a9:
            r2 = r8 & 4096(0x1000, float:5.74E-42)
            r3 = 4096(0x1000, float:5.74E-42)
            if (r2 != r3) goto L_0x05b7
            java.util.List<kb.r> r2 = r1.typeAlias_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.typeAlias_ = r2
        L_0x05b7:
            r2 = r8 & 8192(0x2000, float:1.14794E-41)
            r3 = 8192(0x2000, float:1.14794E-41)
            if (r2 != r3) goto L_0x05c5
            java.util.List<kb.g> r2 = r1.enumEntry_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.enumEntry_ = r2
        L_0x05c5:
            r2 = r8 & 16384(0x4000, float:2.2959E-41)
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r2 != r3) goto L_0x05d3
            java.util.List<java.lang.Integer> r2 = r1.sealedSubclassFqName_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.sealedSubclassFqName_ = r2
        L_0x05d3:
            r2 = r8 & 128(0x80, float:1.794E-43)
            r3 = 128(0x80, float:1.794E-43)
            if (r2 != r3) goto L_0x05e1
            java.util.List<kb.q> r2 = r1.contextReceiverType_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.contextReceiverType_ = r2
        L_0x05e1:
            r2 = r8 & 256(0x100, float:3.59E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r2 != r3) goto L_0x05ef
            java.util.List<java.lang.Integer> r2 = r1.contextReceiverTypeId_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.contextReceiverTypeId_ = r2
        L_0x05ef:
            r2 = r8 & r13
            if (r2 != r13) goto L_0x05fb
            java.util.List<java.lang.Integer> r2 = r1.multiFieldValueClassUnderlyingName_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.multiFieldValueClassUnderlyingName_ = r2
        L_0x05fb:
            r2 = r8 & r9
            if (r2 != r9) goto L_0x0607
            java.util.List<kb.q> r2 = r1.multiFieldValueClassUnderlyingType_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.multiFieldValueClassUnderlyingType_ = r2
        L_0x0607:
            r2 = r8 & r14
            if (r2 != r14) goto L_0x0613
            java.util.List<java.lang.Integer> r2 = r1.multiFieldValueClassUnderlyingTypeId_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.multiFieldValueClassUnderlyingTypeId_ = r2
        L_0x0613:
            r2 = r8 & r5
            if (r2 != r5) goto L_0x061f
            java.util.List<java.lang.Integer> r2 = r1.versionRequirement_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.versionRequirement_ = r2
        L_0x061f:
            r6.mo73234I()     // Catch:{ IOException -> 0x0622, all -> 0x0629 }
        L_0x0622:
            kotlin.reflect.jvm.internal.impl.protobuf.d r2 = r4.mo73322g()
            r1.unknownFields = r2
            goto L_0x0632
        L_0x0629:
            r0 = move-exception
            r2 = r0
            kotlin.reflect.jvm.internal.impl.protobuf.d r3 = r4.mo73322g()
            r1.unknownFields = r3
            throw r2
        L_0x0632:
            r17.mo73385m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p308kb.C13455c.<init>(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
    }
}
