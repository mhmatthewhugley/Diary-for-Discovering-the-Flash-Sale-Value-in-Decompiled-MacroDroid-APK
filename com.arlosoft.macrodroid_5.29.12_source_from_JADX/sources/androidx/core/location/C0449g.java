package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;

/* renamed from: androidx.core.location.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0449g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Consumer f449a;

    /* renamed from: c */
    public final /* synthetic */ Location f450c;

    public /* synthetic */ C0449g(Consumer consumer, Location location) {
        this.f449a = consumer;
        this.f450c = location;
    }

    public final void run() {
        this.f449a.accept(this.f450c);
    }
}
