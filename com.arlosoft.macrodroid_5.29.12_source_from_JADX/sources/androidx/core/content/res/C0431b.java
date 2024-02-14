package androidx.core.content.res;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;

/* renamed from: androidx.core.content.res.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0431b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ResourcesCompat.FontCallback f435a;

    /* renamed from: c */
    public final /* synthetic */ Typeface f436c;

    public /* synthetic */ C0431b(ResourcesCompat.FontCallback fontCallback, Typeface typeface) {
        this.f435a = fontCallback;
        this.f436c = typeface;
    }

    public final void run() {
        this.f435a.lambda$callbackSuccessAsync$0(this.f436c);
    }
}
