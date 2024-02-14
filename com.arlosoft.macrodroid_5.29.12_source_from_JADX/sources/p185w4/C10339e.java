package p185w4;

import androidx.annotation.NonNull;
import p174u4.C10293b;

/* renamed from: w4.e */
/* compiled from: GifDrawableResource */
public class C10339e extends C10293b<C10336c> {
    public C10339e(C10336c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public void mo37659a() {
        ((C10336c) this.f23450a).mo40967e().prepareToDraw();
    }

    @NonNull
    /* renamed from: b */
    public Class<C10336c> mo33103b() {
        return C10336c.class;
    }

    public int getSize() {
        return ((C10336c) this.f23450a).mo40974i();
    }

    public void recycle() {
        ((C10336c) this.f23450a).stop();
        ((C10336c) this.f23450a).mo40976k();
    }
}
