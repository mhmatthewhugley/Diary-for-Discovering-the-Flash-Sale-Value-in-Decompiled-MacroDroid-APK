package org.altbeacon.beacon;

import android.content.Context;
import androidx.annotation.NonNull;
import p097gd.C7354d;

/* renamed from: org.altbeacon.beacon.c */
/* compiled from: BeaconLocalBroadcastProcessor */
public class C8046c {

    /* renamed from: c */
    private static C8046c f19635c;
    @NonNull

    /* renamed from: a */
    private Context f19636a;

    /* renamed from: b */
    int f19637b = 0;

    private C8046c(Context context) {
        this.f19636a = context;
    }

    /* renamed from: a */
    public static synchronized C8046c m33573a(Context context) {
        C8046c cVar;
        synchronized (C8046c.class) {
            if (f19635c == null) {
                f19635c = new C8046c(context);
            }
            cVar = f19635c;
        }
        return cVar;
    }

    /* renamed from: b */
    public void mo38047b() {
        this.f19637b++;
        C7354d.m30376a("BeaconLocalBroadcastProcessor", "Register calls: global=" + this.f19637b, new Object[0]);
        mo38048c();
    }

    /* renamed from: c */
    public void mo38048c() {
        this.f19637b--;
    }
}
