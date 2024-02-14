package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zabo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zabp f3369a;

    zabo(zabp zabp) {
        this.f3369a = zabp;
    }

    public final void run() {
        zabq zabq = this.f3369a.f3370a;
        zabq.f3376c.mo21197e(zabq.f3376c.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
