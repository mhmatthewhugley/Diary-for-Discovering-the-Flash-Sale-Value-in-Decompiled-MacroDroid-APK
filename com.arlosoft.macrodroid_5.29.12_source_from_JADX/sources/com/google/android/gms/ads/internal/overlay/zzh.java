package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcmp;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzh {

    /* renamed from: a */
    public final int f2091a;

    /* renamed from: b */
    public final ViewGroup.LayoutParams f2092b;

    /* renamed from: c */
    public final ViewGroup f2093c;

    /* renamed from: d */
    public final Context f2094d;

    public zzh(zzcmp zzcmp) throws zzf {
        this.f2092b = zzcmp.getLayoutParams();
        ViewParent parent = zzcmp.getParent();
        this.f2094d = zzcmp.mo44017J();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzf("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f2093c = viewGroup;
        this.f2091a = viewGroup.indexOfChild(zzcmp.mo44027R());
        viewGroup.removeView(zzcmp.mo44027R());
        zzcmp.mo44030S0(true);
    }
}
