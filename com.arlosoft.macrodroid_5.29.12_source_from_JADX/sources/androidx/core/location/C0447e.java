package androidx.core.location;

import android.location.Location;
import java.util.function.Consumer;

/* renamed from: androidx.core.location.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0447e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ androidx.core.util.Consumer f447a;

    public /* synthetic */ C0447e(androidx.core.util.Consumer consumer) {
        this.f447a = consumer;
    }

    public final void accept(Object obj) {
        this.f447a.accept((Location) obj);
    }
}
