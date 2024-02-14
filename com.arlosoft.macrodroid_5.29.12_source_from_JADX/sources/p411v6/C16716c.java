package p411v6;

import p393t6.C16577d;

/* renamed from: v6.c */
/* compiled from: LruBitmapCache */
class C16716c extends C16577d<String, C16714a> {

    /* renamed from: i */
    private C16718e<String, C16714a> f67644i = new C16718e<>();

    public C16716c(int i) {
        super((long) i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo79389b(boolean z, String str, C16714a aVar, C16714a aVar2) {
        super.mo79389b(z, str, aVar, aVar2);
        if (z) {
            this.f67644i.mo79634b(str, aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public long mo79390f(String str, C16714a aVar) {
        return (long) aVar.mo79630a();
    }
}
