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

/* renamed from: kb.m */
/* compiled from: ProtoBuf */
public final class C13491m extends C14495h.C14499d<C13491m> {

    /* renamed from: a */
    private static final C13491m f61674a;

    /* renamed from: c */
    public static C14519q<C13491m> f61675c = new C13492a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public List<C13455c> class__;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public C13488l package_;
    /* access modifiers changed from: private */
    public C13497o qualifiedNames_;
    /* access modifiers changed from: private */
    public C13505p strings_;
    /* access modifiers changed from: private */
    public final C14485d unknownFields;

    /* renamed from: kb.m$a */
    /* compiled from: ProtoBuf */
    static class C13492a extends C14481b<C13491m> {
        C13492a() {
        }

        /* renamed from: m */
        public C13491m mo71021c(C14488e eVar, C14490f fVar) throws InvalidProtocolBufferException {
            return new C13491m(eVar, fVar);
        }
    }

    /* renamed from: kb.m$b */
    /* compiled from: ProtoBuf */
    public static final class C13493b extends C14495h.C14498c<C13491m, C13493b> {

        /* renamed from: f */
        private int f61676f;

        /* renamed from: g */
        private C13505p f61677g = C13505p.m86865w();

        /* renamed from: o */
        private C13497o f61678o = C13497o.m86789w();

        /* renamed from: p */
        private C13488l f61679p = C13488l.m86598N();

        /* renamed from: s */
        private List<C13455c> f61680s = Collections.emptyList();

        private C13493b() {
            m86679B();
        }

        /* renamed from: A */
        private void m86678A() {
            if ((this.f61676f & 8) != 8) {
                this.f61680s = new ArrayList(this.f61680s);
                this.f61676f |= 8;
            }
        }

        /* renamed from: B */
        private void m86679B() {
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public static C13493b m86681z() {
            return new C13493b();
        }

        /* renamed from: C */
        public C13493b mo71036o(C13491m mVar) {
            if (mVar == C13491m.m86652N()) {
                return this;
            }
            if (mVar.mo71333V()) {
                mo71341H(mVar.mo71330R());
            }
            if (mVar.mo71332U()) {
                mo71340G(mVar.mo71329Q());
            }
            if (mVar.mo71331T()) {
                mo71339E(mVar.mo71328P());
            }
            if (!mVar.class__.isEmpty()) {
                if (this.f61680s.isEmpty()) {
                    this.f61680s = mVar.class__;
                    this.f61676f &= -9;
                } else {
                    m86678A();
                    this.f61680s.addAll(mVar.class__);
                }
            }
            mo73389t(mVar);
            mo73388p(mo73387n().mo73309d(mVar.unknownFields));
            return this;
        }

        /* renamed from: D */
        public C13493b mo71034h0(C14488e eVar, C14490f fVar) throws IOException {
            C13491m mVar;
            C13491m mVar2 = null;
            try {
                C13491m c = C13491m.f61675c.mo71021c(eVar, fVar);
                if (c != null) {
                    mo71036o(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                mVar = (C13491m) e.mo73276a();
                throw e;
            } catch (Throwable th) {
                th = th;
                mVar2 = mVar;
            }
            if (mVar2 != null) {
                mo71036o(mVar2);
            }
            throw th;
        }

        /* renamed from: E */
        public C13493b mo71339E(C13488l lVar) {
            if ((this.f61676f & 4) != 4 || this.f61679p == C13488l.m86598N()) {
                this.f61679p = lVar;
            } else {
                this.f61679p = C13488l.m86601f0(this.f61679p).mo71036o(lVar).mo71322x();
            }
            this.f61676f |= 4;
            return this;
        }

        /* renamed from: G */
        public C13493b mo71340G(C13497o oVar) {
            if ((this.f61676f & 2) != 2 || this.f61678o == C13497o.m86789w()) {
                this.f61678o = oVar;
            } else {
                this.f61678o = C13497o.m86785B(this.f61678o).mo71036o(oVar).mo71398s();
            }
            this.f61676f |= 2;
            return this;
        }

        /* renamed from: H */
        public C13493b mo71341H(C13505p pVar) {
            if ((this.f61676f & 1) != 1 || this.f61677g == C13505p.m86865w()) {
                this.f61677g = pVar;
            } else {
                this.f61677g = C13505p.m86861B(this.f61677g).mo71036o(pVar).mo71426s();
            }
            this.f61676f |= 1;
            return this;
        }

        /* renamed from: v */
        public C13491m build() {
            C13491m x = mo71343x();
            if (x.mo71013a()) {
                return x;
            }
            throw C14478a.C14479a.m90815k(x);
        }

        /* renamed from: x */
        public C13491m mo71343x() {
            C13491m mVar = new C13491m((C14495h.C14498c) this);
            int i = this.f61676f;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            C13505p unused = mVar.strings_ = this.f61677g;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            C13497o unused2 = mVar.qualifiedNames_ = this.f61678o;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            C13488l unused3 = mVar.package_ = this.f61679p;
            if ((this.f61676f & 8) == 8) {
                this.f61680s = Collections.unmodifiableList(this.f61680s);
                this.f61676f &= -9;
            }
            List unused4 = mVar.class__ = this.f61680s;
            int unused5 = mVar.bitField0_ = i2;
            return mVar;
        }

        /* renamed from: y */
        public C13493b mo71035l() {
            return m86681z().mo71036o(mo71343x());
        }
    }

    static {
        C13491m mVar = new C13491m(true);
        f61674a = mVar;
        mVar.m86653W();
    }

    /* renamed from: N */
    public static C13491m m86652N() {
        return f61674a;
    }

    /* renamed from: W */
    private void m86653W() {
        this.strings_ = C13505p.m86865w();
        this.qualifiedNames_ = C13497o.m86789w();
        this.package_ = C13488l.m86598N();
        this.class__ = Collections.emptyList();
    }

    /* renamed from: X */
    public static C13493b m86654X() {
        return C13493b.m86681z();
    }

    /* renamed from: Y */
    public static C13493b m86655Y(C13491m mVar) {
        return m86654X().mo71036o(mVar);
    }

    /* renamed from: a0 */
    public static C13491m m86656a0(InputStream inputStream, C14490f fVar) throws IOException {
        return f61675c.mo73285a(inputStream, fVar);
    }

    /* renamed from: J */
    public C13455c mo71324J(int i) {
        return this.class__.get(i);
    }

    /* renamed from: L */
    public int mo71325L() {
        return this.class__.size();
    }

    /* renamed from: M */
    public List<C13455c> mo71326M() {
        return this.class__;
    }

    /* renamed from: O */
    public C13491m mo71124e() {
        return f61674a;
    }

    /* renamed from: P */
    public C13488l mo71328P() {
        return this.package_;
    }

    /* renamed from: Q */
    public C13497o mo71329Q() {
        return this.qualifiedNames_;
    }

    /* renamed from: R */
    public C13505p mo71330R() {
        return this.strings_;
    }

    /* renamed from: T */
    public boolean mo71331T() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: U */
    public boolean mo71332U() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: V */
    public boolean mo71333V() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: Z */
    public C13493b mo71016d() {
        return m86654X();
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
        if (mo71332U() && !mo71329Q().mo71013a()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (!mo71331T() || mo71328P().mo71013a()) {
            for (int i = 0; i < mo71325L(); i++) {
                if (!mo71324J(i).mo71013a()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (!mo73391u()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        } else {
            this.memoizedIsInitialized = 0;
            return false;
        }
    }

    /* renamed from: b0 */
    public C13493b mo71014b() {
        return m86655Y(this);
    }

    /* renamed from: c */
    public int mo71015c() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int s = (this.bitField0_ & 1) == 1 ? CodedOutputStream.m90751s(1, this.strings_) + 0 : 0;
        if ((this.bitField0_ & 2) == 2) {
            s += CodedOutputStream.m90751s(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            s += CodedOutputStream.m90751s(3, this.package_);
        }
        for (int i2 = 0; i2 < this.class__.size(); i2++) {
            s += CodedOutputStream.m90751s(4, this.class__.get(i2));
        }
        int v = s + mo73392v() + this.unknownFields.size();
        this.memoizedSerializedSize = v;
        return v;
    }

    /* renamed from: f */
    public C14519q<C13491m> mo71017f() {
        return f61675c;
    }

    /* renamed from: g */
    public void mo71018g(CodedOutputStream codedOutputStream) throws IOException {
        mo71015c();
        C14495h.C14499d<MessageType>.a A = mo73390A();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo73253d0(1, this.strings_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo73253d0(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo73253d0(3, this.package_);
        }
        for (int i = 0; i < this.class__.size(); i++) {
            codedOutputStream.mo73253d0(4, this.class__.get(i));
        }
        A.mo73397a(200, codedOutputStream);
        codedOutputStream.mo73258i0(this.unknownFields);
    }

    private C13491m(C14495h.C14498c<C13491m, ?> cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo73387n();
    }

    private C13491m(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C14485d.f63329a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: kb.p$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kb.o$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kb.l$b} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C13491m(kotlin.reflect.jvm.internal.impl.protobuf.C14488e r10, kotlin.reflect.jvm.internal.impl.protobuf.C14490f r11) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.memoizedIsInitialized = r0
            r9.memoizedSerializedSize = r0
            r9.m86653W()
            kotlin.reflect.jvm.internal.impl.protobuf.d$b r0 = kotlin.reflect.jvm.internal.impl.protobuf.C14485d.m90840s()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m90731J(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0016:
            r5 = 8
            if (r3 != 0) goto L_0x0104
            int r6 = r10.mo73335K()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            if (r6 == 0) goto L_0x00c8
            r7 = 10
            r8 = 0
            if (r6 == r7) goto L_0x00a1
            r7 = 18
            if (r6 == r7) goto L_0x0079
            r7 = 26
            if (r6 == r7) goto L_0x0052
            r7 = 34
            if (r6 == r7) goto L_0x0039
            boolean r5 = r9.mo73386q(r10, r2, r11, r6)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            if (r5 != 0) goto L_0x0016
            goto L_0x00c8
        L_0x0039:
            r6 = r4 & 8
            if (r6 == r5) goto L_0x0046
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r6.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r9.class__ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r4 = r4 | 8
        L_0x0046:
            java.util.List<kb.c> r6 = r9.class__     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.c> r7 = p308kb.C13455c.f61556c     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.protobuf.o r7 = r10.mo73356u(r7, r11)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r6.add(r7)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            goto L_0x0016
        L_0x0052:
            int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r7 = 4
            r6 = r6 & r7
            if (r6 != r7) goto L_0x005e
            kb.l r6 = r9.package_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kb.l$b r8 = r6.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
        L_0x005e:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.l> r6 = p308kb.C13488l.f61667c     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.protobuf.o r6 = r10.mo73356u(r6, r11)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kb.l r6 = (p308kb.C13488l) r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r9.package_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            if (r8 == 0) goto L_0x0073
            r8.mo71036o(r6)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kb.l r6 = r8.mo71322x()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r9.package_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
        L_0x0073:
            int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r6 = r6 | r7
            r9.bitField0_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            goto L_0x0016
        L_0x0079:
            int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r7 = 2
            r6 = r6 & r7
            if (r6 != r7) goto L_0x0085
            kb.o r6 = r9.qualifiedNames_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kb.o$b r8 = r6.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
        L_0x0085:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.o> r6 = p308kb.C13497o.f61699c     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.protobuf.o r6 = r10.mo73356u(r6, r11)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kb.o r6 = (p308kb.C13497o) r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r9.qualifiedNames_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            if (r8 == 0) goto L_0x009a
            r8.mo71036o(r6)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kb.o r6 = r8.mo71398s()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r9.qualifiedNames_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
        L_0x009a:
            int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r6 = r6 | r7
            r9.bitField0_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            goto L_0x0016
        L_0x00a1:
            int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r6 = r6 & r1
            if (r6 != r1) goto L_0x00ac
            kb.p r6 = r9.strings_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kb.p$b r8 = r6.mo71014b()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
        L_0x00ac:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kb.p> r6 = p308kb.C13505p.f61714c     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.protobuf.o r6 = r10.mo73356u(r6, r11)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kb.p r6 = (p308kb.C13505p) r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r9.strings_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            if (r8 == 0) goto L_0x00c1
            r8.mo71036o(r6)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kb.p r6 = r8.mo71426s()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r9.strings_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
        L_0x00c1:
            int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r6 = r6 | r1
            r9.bitField0_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            goto L_0x0016
        L_0x00c8:
            r3 = 1
            goto L_0x0016
        L_0x00cb:
            r10 = move-exception
            goto L_0x00e2
        L_0x00cd:
            r10 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r11 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x00cb }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x00cb }
            r11.<init>(r10)     // Catch:{ all -> 0x00cb }
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r10 = r11.mo73277i(r9)     // Catch:{ all -> 0x00cb }
            throw r10     // Catch:{ all -> 0x00cb }
        L_0x00dc:
            r10 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r10 = r10.mo73277i(r9)     // Catch:{ all -> 0x00cb }
            throw r10     // Catch:{ all -> 0x00cb }
        L_0x00e2:
            r11 = r4 & 8
            if (r11 != r5) goto L_0x00ee
            java.util.List<kb.c> r11 = r9.class__
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.class__ = r11
        L_0x00ee:
            r2.mo73234I()     // Catch:{ IOException -> 0x00f1, all -> 0x00f8 }
        L_0x00f1:
            kotlin.reflect.jvm.internal.impl.protobuf.d r11 = r0.mo73322g()
            r9.unknownFields = r11
            goto L_0x0100
        L_0x00f8:
            r10 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.d r11 = r0.mo73322g()
            r9.unknownFields = r11
            throw r10
        L_0x0100:
            r9.mo73385m()
            throw r10
        L_0x0104:
            r10 = r4 & 8
            if (r10 != r5) goto L_0x0110
            java.util.List<kb.c> r10 = r9.class__
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.class__ = r10
        L_0x0110:
            r2.mo73234I()     // Catch:{ IOException -> 0x0113, all -> 0x011a }
        L_0x0113:
            kotlin.reflect.jvm.internal.impl.protobuf.d r10 = r0.mo73322g()
            r9.unknownFields = r10
            goto L_0x0122
        L_0x011a:
            r10 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.d r11 = r0.mo73322g()
            r9.unknownFields = r11
            throw r10
        L_0x0122:
            r9.mo73385m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p308kb.C13491m.<init>(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
    }
}
