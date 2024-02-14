package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzcxj {

    /* renamed from: a */
    private final zzczc f31796a;

    /* renamed from: b */
    private final View f31797b;

    /* renamed from: c */
    private final zzfdl f31798c;

    /* renamed from: d */
    private final zzcmp f31799d;

    public zzcxj(View view, @Nullable zzcmp zzcmp, zzczc zzczc, zzfdl zzfdl) {
        this.f31797b = view;
        this.f31799d = zzcmp;
        this.f31796a = zzczc;
        this.f31798c = zzfdl;
    }

    /* renamed from: f */
    public static final zzdkg m46990f(Context context, zzcgv zzcgv, zzfdk zzfdk, zzfef zzfef) {
        return new zzdkg(new zzcxh(context, zzcgv, zzfdk, zzfef), zzchc.f28461f);
    }

    /* renamed from: g */
    public static final Set m46991g(zzcyt zzcyt) {
        return Collections.singleton(new zzdkg(zzcyt, zzchc.f28461f));
    }

    /* renamed from: h */
    public static final zzdkg m46992h(zzcyr zzcyr) {
        return new zzdkg(zzcyr, zzchc.f28460e);
    }

    /* renamed from: a */
    public final View mo44464a() {
        return this.f31797b;
    }

    @Nullable
    /* renamed from: b */
    public final zzcmp mo44465b() {
        return this.f31799d;
    }

    /* renamed from: c */
    public final zzczc mo44466c() {
        return this.f31796a;
    }

    /* renamed from: d */
    public zzdem mo44467d(Set set) {
        return new zzdem(set);
    }

    /* renamed from: e */
    public final zzfdl mo44468e() {
        return this.f31798c;
    }
}
