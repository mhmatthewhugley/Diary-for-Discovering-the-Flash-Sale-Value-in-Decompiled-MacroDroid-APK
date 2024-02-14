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
import kotlin.reflect.jvm.internal.impl.protobuf.C14519q;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kb.l */
/* compiled from: ProtoBuf */
public final class C13488l extends C14495h.C14499d<C13488l> {

    /* renamed from: a */
    private static final C13488l f61666a;

    /* renamed from: c */
    public static C14519q<C13488l> f61667c = new C13489a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public List<C13481i> function_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<C13494n> property_;
    /* access modifiers changed from: private */
    public List<C13516r> typeAlias_;
    /* access modifiers changed from: private */
    public C13524t typeTable_;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;
    /* access modifiers changed from: private */
    public C13537w versionRequirementTable_;

    /* renamed from: kb.l$a */
    /* compiled from: ProtoBuf */
    static class C13489a extends C14481b<C13488l> {
        C13489a() {
        }

        /* renamed from: m */
        public C13488l mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13488l(eVar, fVar);
        }
    }

    /* renamed from: kb.l$b */
    /* compiled from: ProtoBuf */
    public static final class C13490b extends C14495h.C14498c<C13488l, C13490b> {

        /* renamed from: f */
        private int f61668f;

        /* renamed from: g */
        private List<C13481i> f61669g = Collections.emptyList();

        /* renamed from: o */
        private List<C13494n> f61670o = Collections.emptyList();

        /* renamed from: p */
        private List<C13516r> f61671p = Collections.emptyList();

        /* renamed from: s */
        private C13524t f61672s = C13524t.m87163y();

        /* renamed from: z */
        private C13537w f61673z = C13537w.m87312w();

        private C13490b() {
            m86631D();
        }

        /* renamed from: A */
        private void m86628A() {
            if ((this.f61668f & 1) != 1) {
                this.f61669g = new ArrayList(this.f61669g);
                this.f61668f |= 1;
            }
        }

        /* renamed from: B */
        private void m86629B() {
            if ((this.f61668f & 2) != 2) {
                this.f61670o = new ArrayList(this.f61670o);
                this.f61668f |= 2;
            }
        }

        /* renamed from: C */
        private void m86630C() {
            if ((this.f61668f & 4) != 4) {
                this.f61671p = new ArrayList(this.f61671p);
                this.f61668f |= 4;
            }
        }

        /* renamed from: D */
        private void m86631D() {
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public static C13490b m86633z() {
            return new C13490b();
        }

        /* renamed from: E */
        public C13490b mo71036o(C13488l lVar) {
            if (lVar == C13488l.m86598N()) {
                return this;
            }
            if (!lVar.function_.isEmpty()) {
                if (this.f61669g.isEmpty()) {
                    this.f61669g = lVar.function_;
                    this.f61668f &= -2;
                } else {
                    m86628A();
                    this.f61669g.addAll(lVar.function_);
                }
            }
            if (!lVar.property_.isEmpty()) {
                if (this.f61670o.isEmpty()) {
                    this.f61670o = lVar.property_;
                    this.f61668f &= -3;
                } else {
                    m86629B();
                    this.f61670o.addAll(lVar.property_);
                }
            }
            if (!lVar.typeAlias_.isEmpty()) {
                if (this.f61671p.isEmpty()) {
                    this.f61671p = lVar.typeAlias_;
                    this.f61668f &= -5;
                } else {
                    m86630C();
                    this.f61671p.addAll(lVar.typeAlias_);
                }
            }
            if (lVar.mo71312b0()) {
                mo71319H(lVar.mo71310Z());
            }
            if (lVar.mo71313c0()) {
                mo71320J(lVar.mo71311a0());
            }
            mo73389t(lVar);
            mo73388p(mo73387n().mo73309d(lVar.unknownFields));
            return this;
        }

        /* renamed from: G */
        public C13490b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13488l lVar;
            C13488l lVar2 = null;
            try {
                C13488l c = C13488l.f61667c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                lVar = (C13488l) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                lVar2 = lVar;
            }
            if (lVar2 != null) {
                mo71036o(lVar2);
            }
            throw th;
        }

        /* renamed from: H */
        public C13490b mo71319H(C13524t tVar) {
            if ((this.f61668f & 8) != 8 || this.f61672s == C13524t.m87163y()) {
                this.f61672s = tVar;
            } else {
                this.f61672s = C13524t.m87157G(this.f61672s).mo71036o(tVar).mo71569s();
            }
            this.f61668f |= 8;
            return this;
        }

        /* renamed from: J */
        public C13490b mo71320J(C13537w wVar) {
            if ((this.f61668f & 16) != 16 || this.f61673z == C13537w.m87312w()) {
                this.f61673z = wVar;
            } else {
                this.f61673z = C13537w.m87308B(this.f61673z).mo71036o(wVar).mo71634s();
            }
            this.f61668f |= 16;
            return this;
        }

        /* renamed from: v */
        public C13488l build() {
            C13488l x = mo71322x();
            if (x.mo71013a()) {
                return x;
            }
            throw C14478a.C14479a.m90815k(x);
        }

        /* renamed from: x */
        public C13488l mo71322x() {
            C13488l lVar = new C13488l((C14495h.C14498c) this);
            int i = this.f61668f;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f61669g = Collections.unmodifiableList(this.f61669g);
                this.f61668f &= -2;
            }
            List unused = lVar.function_ = this.f61669g;
            if ((this.f61668f & 2) == 2) {
                this.f61670o = Collections.unmodifiableList(this.f61670o);
                this.f61668f &= -3;
            }
            List unused2 = lVar.property_ = this.f61670o;
            if ((this.f61668f & 4) == 4) {
                this.f61671p = Collections.unmodifiableList(this.f61671p);
                this.f61668f &= -5;
            }
            List unused3 = lVar.typeAlias_ = this.f61671p;
            if ((i & 8) != 8) {
                i2 = 0;
            }
            C13524t unused4 = lVar.typeTable_ = this.f61672s;
            if ((i & 16) == 16) {
                i2 |= 2;
            }
            C13537w unused5 = lVar.versionRequirementTable_ = this.f61673z;
            int unused6 = lVar.bitField0_ = i2;
            return lVar;
        }

        /* renamed from: y */
        public C13490b mo71035l() {
            return m86633z().mo71036o(mo71322x());
        }
    }

    static {
        C13488l lVar = new C13488l(true);
        f61666a = lVar;
        lVar.m86599d0();
    }

    /* renamed from: N */
    public static C13488l m86598N() {
        return f61666a;
    }

    /* renamed from: d0 */
    private void m86599d0() {
        this.function_ = Collections.emptyList();
        this.property_ = Collections.emptyList();
        this.typeAlias_ = Collections.emptyList();
        this.typeTable_ = C13524t.m87163y();
        this.versionRequirementTable_ = C13537w.m87312w();
    }

    /* renamed from: e0 */
    public static C13490b m86600e0() {
        return C13490b.m86633z();
    }

    /* renamed from: f0 */
    public static C13490b m86601f0(C13488l lVar) {
        return m86600e0().mo71036o(lVar);
    }

    /* renamed from: i0 */
    public static C13488l m86602i0(InputStream inputStream, C14490f fVar) throws IOException {
        return f61667c.mo73285a(inputStream, fVar);
    }

    /* renamed from: O */
    public C13488l mo71124e() {
        return f61666a;
    }

    /* renamed from: P */
    public C13481i mo71301P(int i) {
        return this.function_.get(i);
    }

    /* renamed from: Q */
    public int mo71302Q() {
        return this.function_.size();
    }

    /* renamed from: R */
    public List<C13481i> mo71303R() {
        return this.function_;
    }

    /* renamed from: T */
    public C13494n mo71304T(int i) {
        return this.property_.get(i);
    }

    /* renamed from: U */
    public int mo71305U() {
        return this.property_.size();
    }

    /* renamed from: V */
    public List<C13494n> mo71306V() {
        return this.property_;
    }

    /* renamed from: W */
    public C13516r mo71307W(int i) {
        return this.typeAlias_.get(i);
    }

    /* renamed from: X */
    public int mo71308X() {
        return this.typeAlias_.size();
    }

    /* renamed from: Y */
    public List<C13516r> mo71309Y() {
        return this.typeAlias_;
    }

    /* renamed from: Z */
    public C13524t mo71310Z() {
        return this.typeTable_;
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
        for (int i = 0; i < mo71302Q(); i++) {
            if (!mo71301P(i).mo71013a()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < mo71305U(); i2++) {
            if (!mo71304T(i2).mo71013a()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < mo71308X(); i3++) {
            if (!mo71307W(i3).mo71013a()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        if (mo71312b0() && !mo71310Z().mo71013a()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (!mo73391u()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else {
            this.memoizedIsInitialized = 1;
            return true;
        }
    }

    /* renamed from: a0 */
    public C13537w mo71311a0() {
        return this.versionRequirementTable_;
    }

    /* renamed from: b0 */
    public boolean mo71312b0() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: c */
    public int mo71015c() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.function_.size(); i3++) {
            i2 += CodedOutputStream.m90751s(3, this.function_.get(i3));
        }
        for (int i4 = 0; i4 < this.property_.size(); i4++) {
            i2 += CodedOutputStream.m90751s(4, this.property_.get(i4));
        }
        for (int i5 = 0; i5 < this.typeAlias_.size(); i5++) {
            i2 += CodedOutputStream.m90751s(5, this.typeAlias_.get(i5));
        }
        if ((this.bitField0_ & 1) == 1) {
            i2 += CodedOutputStream.m90751s(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            i2 += CodedOutputStream.m90751s(32, this.versionRequirementTable_);
        }
        int v = i2 + mo73392v() + this.unknownFields.size();
        this.memoizedSerializedSize = v;
        return v;
    }

    /* renamed from: c0 */
    public boolean mo71313c0() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: f */
    public C14519q<C13488l> mo71017f() {
        return f61667c;
    }

    /* renamed from: g */
    public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
        mo71015c();
        C14495h.C14499d<MessageType>.a A = mo73390A();
        for (int i = 0; i < this.function_.size(); i++) {
            codedOutputStream.mo73253d0(3, this.function_.get(i));
        }
        for (int i2 = 0; i2 < this.property_.size(); i2++) {
            codedOutputStream.mo73253d0(4, this.property_.get(i2));
        }
        for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
            codedOutputStream.mo73253d0(5, this.typeAlias_.get(i3));
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo73253d0(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo73253d0(32, this.versionRequirementTable_);
        }
        A.mo73397a(200, codedOutputStream);
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    /* renamed from: g0 */
    public C13490b mo71016d() {
        return m86600e0();
    }

    /* renamed from: k0 */
    public C13490b mo71014b() {
        return m86601f0(this);
    }

    private C13488l(C14495h.C14498c<C13488l, ?> cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo73387n();
    }

    private C13488l(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: kb.t$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: kb.w$b} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C13488l(kotlin.reflect.jvm.internal.impl.protobuf.C14488e r11, kotlin.reflect.jvm.internal.impl.protobuf.C14490f r12) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r10 = this;
            r10.<init>()
            r0 = -1
            r10.memoizedIsInitialized = r0
            r10.memoizedSerializedSize = r0
            r10.m86599d0()
            kotlin.reflect.jvm.internal.impl.protobuf.d$b r0 = kotlin.reflect.jvm.internal.impl.protobuf.C14485d.m90840s()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m90731J(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0016:
            r5 = 4
            r6 = 2
            if (r3 != 0) goto L_0x012b
            int r7 = r11.mo73335K()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            if (r7 == 0) goto L_0x00d7
            r8 = 26
            if (r7 == r8) goto L_0x00bd
            r8 = 34
            if (r7 == r8) goto L_0x00a3
            r8 = 42
            if (r7 == r8) goto L_0x0089
            r8 = 242(0xf2, float:3.39E-43)
            r9 = 0
            if (r7 == r8) goto L_0x0063
            r8 = 258(0x102, float:3.62E-43)
            if (r7 == r8) goto L_0x003d
            boolean r5 = r10.mo73386q(r11, r2, r12, r7)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            if (r5 != 0) goto L_0x0016
            goto L_0x00d7
        L_0x003d:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7 = r7 & r6
            if (r7 != r6) goto L_0x0048
            kb.w r7 = r10.versionRequirementTable_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kb.w$b r9 = r7.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
        L_0x0048:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.w> r7 = p308kb.C13537w.f61806c     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.o r7 = r11.mo73356u(r7, r12)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kb.w r7 = (p308kb.C13537w) r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r10.versionRequirementTable_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            if (r9 == 0) goto L_0x005d
            r9.mo71036o(r7)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kb.w r7 = r9.mo71634s()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r10.versionRequirementTable_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
        L_0x005d:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7 = r7 | r6
            r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            goto L_0x0016
        L_0x0063:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7 = r7 & r1
            if (r7 != r1) goto L_0x006e
            kb.t r7 = r10.typeTable_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kb.t$b r9 = r7.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
        L_0x006e:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.t> r7 = p308kb.C13524t.f61773c     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.o r7 = r11.mo73356u(r7, r12)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kb.t r7 = (p308kb.C13524t) r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r10.typeTable_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            if (r9 == 0) goto L_0x0083
            r9.mo71036o(r7)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kb.t r7 = r9.mo71569s()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r10.typeTable_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
        L_0x0083:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7 = r7 | r1
            r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            goto L_0x0016
        L_0x0089:
            r7 = r4 & 4
            if (r7 == r5) goto L_0x0096
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r10.typeAlias_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r4 = r4 | 4
        L_0x0096:
            java.util.List<kb.r> r7 = r10.typeAlias_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.r> r8 = p308kb.C13516r.f61747c     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.o r8 = r11.mo73356u(r8, r12)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            goto L_0x0016
        L_0x00a3:
            r7 = r4 & 2
            if (r7 == r6) goto L_0x00b0
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r10.property_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r4 = r4 | 2
        L_0x00b0:
            java.util.List<kb.n> r7 = r10.property_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.n> r8 = p308kb.C13494n.f61682c     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.o r8 = r11.mo73356u(r8, r12)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            goto L_0x0016
        L_0x00bd:
            r7 = r4 & 1
            if (r7 == r1) goto L_0x00ca
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r10.function_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r4 = r4 | 1
        L_0x00ca:
            java.util.List<kb.i> r7 = r10.function_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.i> r8 = p308kb.C13481i.f61638c     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.o r8 = r11.mo73356u(r8, r12)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            goto L_0x0016
        L_0x00d7:
            r3 = 1
            goto L_0x0016
        L_0x00da:
            r11 = move-exception
            goto L_0x00f1
        L_0x00dc:
            r11 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r12 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x00da }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x00da }
            r12.<init>(r11)     // Catch:{ all -> 0x00da }
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r11 = r12.mo73277i(r10)     // Catch:{ all -> 0x00da }
            throw r11     // Catch:{ all -> 0x00da }
        L_0x00eb:
            r11 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r11 = r11.mo73277i(r10)     // Catch:{ all -> 0x00da }
            throw r11     // Catch:{ all -> 0x00da }
        L_0x00f1:
            r12 = r4 & 1
            if (r12 != r1) goto L_0x00fd
            java.util.List<kb.i> r12 = r10.function_
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.function_ = r12
        L_0x00fd:
            r12 = r4 & 2
            if (r12 != r6) goto L_0x0109
            java.util.List<kb.n> r12 = r10.property_
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.property_ = r12
        L_0x0109:
            r12 = r4 & 4
            if (r12 != r5) goto L_0x0115
            java.util.List<kb.r> r12 = r10.typeAlias_
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.typeAlias_ = r12
        L_0x0115:
            r2.mo73234I()     // Catch:{ IOException -> 0x0118, all -> 0x011f }
        L_0x0118:
            kotlin.reflect.jvm.internal.impl.protobuf.d r12 = r0.mo73322g()
            r10.unknownFields = r12
            goto L_0x0127
        L_0x011f:
            r11 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.d r12 = r0.mo73322g()
            r10.unknownFields = r12
            throw r11
        L_0x0127:
            r10.mo73385m()
            throw r11
        L_0x012b:
            r11 = r4 & 1
            if (r11 != r1) goto L_0x0137
            java.util.List<kb.i> r11 = r10.function_
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.function_ = r11
        L_0x0137:
            r11 = r4 & 2
            if (r11 != r6) goto L_0x0143
            java.util.List<kb.n> r11 = r10.property_
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.property_ = r11
        L_0x0143:
            r11 = r4 & 4
            if (r11 != r5) goto L_0x014f
            java.util.List<kb.r> r11 = r10.typeAlias_
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.typeAlias_ = r11
        L_0x014f:
            r2.mo73234I()     // Catch:{ IOException -> 0x0152, all -> 0x0159 }
        L_0x0152:
            kotlin.reflect.jvm.internal.impl.protobuf.d r11 = r0.mo73322g()
            r10.unknownFields = r11
            goto L_0x0161
        L_0x0159:
            r11 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.d r12 = r0.mo73322g()
            r10.unknownFields = r12
            throw r11
        L_0x0161:
            r10.mo73385m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p308kb.C13488l.<init>(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
    }
}
