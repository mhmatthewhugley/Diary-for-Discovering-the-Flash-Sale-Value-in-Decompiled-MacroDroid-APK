package p132m4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p090f5.C7312g;
import p102h4.C7380e;
import p120k4.C7587c;
import p132m4.C7923h;

/* renamed from: m4.g */
/* compiled from: LruResourceCache */
public class C7922g extends C7312g<C7380e, C7587c<?>> implements C7923h {

    /* renamed from: e */
    private C7923h.C7924a f19030e;

    public C7922g(long j) {
        super(j);
    }

    /* renamed from: a */
    public void mo37814a(int i) {
        if (i >= 40) {
            mo37253b();
        } else if (i >= 20 || i == 15) {
            mo37260m(mo37255h() / 2);
        }
    }

    @Nullable
    /* renamed from: c */
    public /* bridge */ /* synthetic */ C7587c mo37815c(@NonNull C7380e eVar, @Nullable C7587c cVar) {
        return (C7587c) super.mo37258k(eVar, cVar);
    }

    @Nullable
    /* renamed from: d */
    public /* bridge */ /* synthetic */ C7587c mo37816d(@NonNull C7380e eVar) {
        return (C7587c) super.mo37259l(eVar);
    }

    /* renamed from: e */
    public void mo37817e(@NonNull C7923h.C7924a aVar) {
        this.f19030e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo37256i(@Nullable C7587c<?> cVar) {
        if (cVar == null) {
            return super.mo37256i(null);
        }
        return cVar.getSize();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo37257j(@NonNull C7380e eVar, @Nullable C7587c<?> cVar) {
        C7923h.C7924a aVar = this.f19030e;
        if (aVar != null && cVar != null) {
            aVar.mo33064a(cVar);
        }
    }
}
