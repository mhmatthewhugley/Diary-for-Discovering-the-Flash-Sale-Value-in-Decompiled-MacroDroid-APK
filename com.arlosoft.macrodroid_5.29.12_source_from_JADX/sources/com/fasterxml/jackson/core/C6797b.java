package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.C6799c;
import com.fasterxml.jackson.core.C6802e;
import com.fasterxml.jackson.core.p072io.C6810c;
import com.fasterxml.jackson.core.p072io.C6811d;
import com.fasterxml.jackson.core.p072io.C6812e;
import com.fasterxml.jackson.core.p072io.C6817j;
import com.fasterxml.jackson.core.p072io.C6820m;
import com.fasterxml.jackson.core.util.C6822a;
import com.fasterxml.jackson.core.util.C6826c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.SoftReference;
import p109i5.C7419a;
import p109i5.C7424e;
import p109i5.C7426f;
import p109i5.C7429h;
import p115j5.C7457a;
import p115j5.C7460b;

/* renamed from: com.fasterxml.jackson.core.b */
/* compiled from: JsonFactory */
public class C6797b implements Serializable {

    /* renamed from: d */
    protected static final int f15760d = C6798a.m25519b();

    /* renamed from: f */
    protected static final int f15761f = C6802e.C6803a.m25563b();

    /* renamed from: g */
    protected static final int f15762g = C6799c.C6800a.m25543b();

    /* renamed from: o */
    private static final C6821j f15763o = C6826c.f15885c;

    /* renamed from: p */
    protected static final ThreadLocal<SoftReference<C6822a>> f15764p = new ThreadLocal<>();
    private static final long serialVersionUID = 8726401676402117450L;
    protected C6810c _characterEscapes;
    protected int _factoryFeatures;
    protected int _generatorFeatures;
    protected C6812e _inputDecorator;
    protected C6806h _objectCodec;
    protected C6817j _outputDecorator;
    protected int _parserFeatures;
    protected C6821j _rootValueSeparator;

    /* renamed from: a */
    protected final transient C7460b f15765a;

    /* renamed from: c */
    protected final transient C7457a f15766c;

    /* renamed from: com.fasterxml.jackson.core.b$a */
    /* compiled from: JsonFactory */
    public enum C6798a {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true);
        
        private final boolean _defaultState;

        private C6798a(boolean z) {
            this._defaultState = z;
        }

        /* renamed from: b */
        public static int m25519b() {
            int i = 0;
            for (C6798a aVar : values()) {
                if (aVar.mo33829d()) {
                    i |= aVar.mo33830e();
                }
            }
            return i;
        }

        /* renamed from: d */
        public boolean mo33829d() {
            return this._defaultState;
        }

        /* renamed from: e */
        public int mo33830e() {
            return 1 << ordinal();
        }
    }

    public C6797b() {
        this((C6806h) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6811d mo33810a(Object obj, boolean z) {
        return new C6811d(mo33819j(), obj, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C6799c mo33811b(Writer writer, C6811d dVar) throws IOException {
        return mo33812c(writer, dVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: c */
    public C6799c mo33812c(Writer writer, C6811d dVar) throws IOException {
        C7429h hVar = new C7429h(dVar, this._generatorFeatures, (C6806h) null, writer);
        C6821j jVar = this._rootValueSeparator;
        if (jVar != f15763o) {
            hVar.mo37474H(jVar);
        }
        return hVar;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: d */
    public C6802e mo33813d(InputStream inputStream, C6811d dVar) throws IOException, JsonParseException {
        return new C7419a(dVar, inputStream).mo37469c(this._parserFeatures, (C6806h) null, this.f15766c, this.f15765a, mo33828t(C6798a.CANONICALIZE_FIELD_NAMES), mo33828t(C6798a.INTERN_FIELD_NAMES));
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: e */
    public C6802e mo33814e(Reader reader, C6811d dVar) throws IOException, JsonParseException {
        return new C7424e(dVar, this._parserFeatures, reader, (C6806h) null, this.f15765a.mo37605k(mo33828t(C6798a.CANONICALIZE_FIELD_NAMES), mo33828t(C6798a.INTERN_FIELD_NAMES)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C6802e mo33815f(InputStream inputStream, C6811d dVar) throws IOException, JsonParseException {
        return mo33813d(inputStream, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C6802e mo33816g(Reader reader, C6811d dVar) throws IOException, JsonParseException {
        return mo33814e(reader, dVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: h */
    public C6799c mo33817h(OutputStream outputStream, C6811d dVar) throws IOException {
        C7426f fVar = new C7426f(dVar, this._generatorFeatures, (C6806h) null, outputStream);
        C6821j jVar = this._rootValueSeparator;
        if (jVar != f15763o) {
            fVar.mo37474H(jVar);
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Writer mo33818i(OutputStream outputStream, C6796a aVar, C6811d dVar) throws IOException {
        if (aVar == C6796a.UTF8) {
            return new C6820m(dVar, outputStream);
        }
        return new OutputStreamWriter(outputStream, aVar.mo33808b());
    }

    /* renamed from: j */
    public C6822a mo33819j() {
        C6822a aVar;
        ThreadLocal<SoftReference<C6822a>> threadLocal = f15764p;
        SoftReference softReference = threadLocal.get();
        if (softReference == null) {
            aVar = null;
        } else {
            aVar = (C6822a) softReference.get();
        }
        if (aVar != null) {
            return aVar;
        }
        C6822a aVar2 = new C6822a();
        threadLocal.set(new SoftReference(aVar2));
        return aVar2;
    }

    /* renamed from: k */
    public final C6797b mo33820k(C6799c.C6800a aVar, boolean z) {
        return z ? mo33826r(aVar) : mo33825q(aVar);
    }

    /* renamed from: l */
    public C6799c mo33821l(OutputStream outputStream, C6796a aVar) throws IOException {
        C6811d a = mo33810a(outputStream, false);
        a.mo33913n(aVar);
        if (aVar == C6796a.UTF8) {
            return mo33817h(outputStream, a);
        }
        return mo33811b(mo33818i(outputStream, aVar, a), a);
    }

    /* renamed from: m */
    public C6802e mo33822m(InputStream inputStream) throws IOException, JsonParseException {
        return mo33815f(inputStream, mo33810a(inputStream, false));
    }

    /* renamed from: n */
    public C6802e mo33823n(Reader reader) throws IOException, JsonParseException {
        return mo33816g(reader, mo33810a(reader, false));
    }

    /* renamed from: p */
    public C6802e mo33824p(String str) throws IOException, JsonParseException {
        StringReader stringReader = new StringReader(str);
        return mo33816g(stringReader, mo33810a(stringReader, true));
    }

    /* renamed from: q */
    public C6797b mo33825q(C6799c.C6800a aVar) {
        this._generatorFeatures = (~aVar.mo33854e()) & this._generatorFeatures;
        return this;
    }

    /* renamed from: r */
    public C6797b mo33826r(C6799c.C6800a aVar) {
        this._generatorFeatures = aVar.mo33854e() | this._generatorFeatures;
        return this;
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return new C6797b((C6806h) null);
    }

    /* renamed from: t */
    public final boolean mo33828t(C6798a aVar) {
        return (aVar.mo33830e() & this._factoryFeatures) != 0;
    }

    public C6797b(C6806h hVar) {
        this.f15765a = C7460b.m30981f();
        this.f15766c = C7457a.m30953g();
        this._factoryFeatures = f15760d;
        this._parserFeatures = f15761f;
        this._generatorFeatures = f15762g;
        this._rootValueSeparator = f15763o;
    }
}
