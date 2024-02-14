package androidx.core.content.res;

import androidx.core.content.res.ResourcesCompat;

/* renamed from: androidx.core.content.res.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0430a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ResourcesCompat.FontCallback f433a;

    /* renamed from: c */
    public final /* synthetic */ int f434c;

    public /* synthetic */ C0430a(ResourcesCompat.FontCallback fontCallback, int i) {
        this.f433a = fontCallback;
        this.f434c = i;
    }

    public final void run() {
        this.f433a.lambda$callbackFailAsync$1(this.f434c);
    }
}
