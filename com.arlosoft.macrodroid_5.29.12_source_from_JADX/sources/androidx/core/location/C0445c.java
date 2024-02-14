package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;

/* renamed from: androidx.core.location.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0445c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Consumer f443a;

    /* renamed from: c */
    public final /* synthetic */ Location f444c;

    public /* synthetic */ C0445c(Consumer consumer, Location location) {
        this.f443a = consumer;
        this.f444c = location;
    }

    public final void run() {
        this.f443a.accept(this.f444c);
    }
}
