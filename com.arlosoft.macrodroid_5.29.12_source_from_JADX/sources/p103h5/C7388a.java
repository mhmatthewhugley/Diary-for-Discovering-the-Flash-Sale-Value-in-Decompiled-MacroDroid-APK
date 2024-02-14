package p103h5;

import com.fasterxml.jackson.core.C6799c;
import com.fasterxml.jackson.core.C6806h;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.util.C6826c;
import java.io.IOException;
import p109i5.C7423d;

/* renamed from: h5.a */
/* compiled from: GeneratorBase */
public abstract class C7388a extends C6799c {

    /* renamed from: c */
    protected int f18051c;

    /* renamed from: d */
    protected boolean f18052d = mo37390F(C6799c.C6800a.WRITE_NUMBERS_AS_STRINGS);

    /* renamed from: f */
    protected C7423d f18053f = C7423d.m30651j();

    /* renamed from: g */
    protected boolean f18054g;

    protected C7388a(int i, C6806h hVar) {
        this.f18051c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo37387C() {
        throw new RuntimeException("Internal error: should never end up through this code path");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo37388D(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str);
    }

    /* renamed from: E */
    public final C7423d mo37389E() {
        return this.f18053f;
    }

    /* renamed from: F */
    public final boolean mo37390F(C6799c.C6800a aVar) {
        return (aVar.mo33854e() & this.f18051c) != 0;
    }

    public void close() throws IOException {
        this.f18054g = true;
    }

    /* renamed from: e */
    public C6799c mo33835e() {
        if (mo33833b() != null) {
            return this;
        }
        return mo33834c(new C6826c());
    }
}
