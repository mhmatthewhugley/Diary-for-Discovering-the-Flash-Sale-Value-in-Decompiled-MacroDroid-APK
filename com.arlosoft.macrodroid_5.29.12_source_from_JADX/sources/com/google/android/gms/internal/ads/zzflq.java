package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzflq implements zzflo {

    /* renamed from: a */
    private final zzflo f36071a;

    public zzflq(zzflo zzflo) {
        this.f36071a = zzflo;
    }

    /* renamed from: a */
    public final void mo45927a(View view, JSONObject jSONObject, zzfln zzfln, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        zzflg a = zzflg.m50458a();
        if (a != null) {
            Collection<zzfkv> b = a.mo45892b();
            int size = b.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (zzfkv f : b) {
                View f2 = f.mo45879f();
                if (f2 != null && f2.isAttachedToWindow() && f2.isShown()) {
                    View view2 = f2;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() == 0.0f) {
                                break;
                            }
                            ViewParent parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        } else {
                            View rootView = f2.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float a2 = zzflz.m50529a(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (zzflz.m50529a((View) arrayList.get(i)) <= a2) {
                                        break;
                                    }
                                    size2 = i;
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzfln.mo45926a((View) arrayList.get(i2), this.f36071a, jSONObject, z2);
        }
    }

    /* renamed from: b */
    public final JSONObject mo45928b(View view) {
        throw null;
    }
}
