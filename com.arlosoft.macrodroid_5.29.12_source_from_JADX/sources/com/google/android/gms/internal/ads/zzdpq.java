package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.formats.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdpq {

    /* renamed from: a */
    private final zzg f32734a;

    /* renamed from: b */
    private final zzfef f32735b;

    /* renamed from: c */
    private final zzdov f32736c;

    /* renamed from: d */
    private final zzdoq f32737d;
    @Nullable

    /* renamed from: e */
    private final zzdqb f32738e;
    @Nullable

    /* renamed from: f */
    private final zzdqj f32739f;

    /* renamed from: g */
    private final Executor f32740g;

    /* renamed from: h */
    private final Executor f32741h;

    /* renamed from: i */
    private final zzbls f32742i;

    /* renamed from: j */
    private final zzdon f32743j;

    public zzdpq(zzg zzg, zzfef zzfef, zzdov zzdov, zzdoq zzdoq, @Nullable zzdqb zzdqb, @Nullable zzdqj zzdqj, Executor executor, Executor executor2, zzdon zzdon) {
        this.f32734a = zzg;
        this.f32735b = zzfef;
        this.f32742i = zzfef.f35634i;
        this.f32736c = zzdov;
        this.f32737d = zzdoq;
        this.f32738e = zzdqb;
        this.f32739f = zzdqj;
        this.f32740g = executor;
        this.f32741h = executor2;
        this.f32743j = zzdon;
    }

    /* renamed from: g */
    private static void m47875g(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    /* renamed from: h */
    private final boolean m47876h(@NonNull ViewGroup viewGroup, boolean z) {
        View view;
        FrameLayout.LayoutParams layoutParams;
        if (z) {
            view = this.f32737d.mo44801N();
        } else {
            view = this.f32737d.mo44802O();
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27037X2)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(view, layoutParams);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo44898a(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        zzdoq zzdoq = this.f32737d;
        if (zzdoq.mo44801N() == null) {
            return;
        }
        if (zzdoq.mo44798K() == 2 || zzdoq.mo44798K() == 1) {
            this.f32734a.mo20392v0(this.f32735b.f35631f, String.valueOf(zzdoq.mo44798K()), z);
        } else if (zzdoq.mo44798K() == 6) {
            this.f32734a.mo20392v0(this.f32735b.f35631f, ExifInterface.GPS_MEASUREMENT_2D, z);
            this.f32734a.mo20392v0(this.f32735b.f35631f, "1", z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo44899b(zzdql zzdql) {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        zzbmb a;
        Drawable drawable;
        Context context = null;
        if (this.f32736c.mo44852f() || this.f32736c.mo44851e()) {
            String[] strArr = {"1098", "3011"};
            int i = 0;
            while (true) {
                if (i >= 2) {
                    break;
                }
                View z0 = zzdql.mo44889z0(strArr[i]);
                if (z0 != null && (z0 instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) z0;
                    break;
                }
                i++;
            }
        }
        viewGroup = null;
        Context context2 = zzdql.mo44874c().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdoq zzdoq = this.f32737d;
        if (zzdoq.mo44800M() != null) {
            view = zzdoq.mo44800M();
            zzbls zzbls = this.f32742i;
            if (zzbls != null && viewGroup == null) {
                m47875g(layoutParams, zzbls.f27530g);
                view.setLayoutParams(layoutParams);
            }
        } else if (!(zzdoq.mo44807T() instanceof zzbln)) {
            view = null;
        } else {
            zzbln zzbln = (zzbln) zzdoq.mo44807T();
            if (viewGroup == null) {
                m47875g(layoutParams, zzbln.mo42734a());
            }
            zzblo zzblo = new zzblo(context2, zzbln, layoutParams);
            zzblo.setContentDescription((CharSequence) zzay.m1924c().mo42663b(zzbjc.f27019V2));
            view = zzblo;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                zza zza = new zza(zzdql.mo44874c().getContext());
                zza.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zza.addView(view);
                FrameLayout e = zzdql.mo44875e();
                if (e != null) {
                    e.addView(zza);
                }
            }
            zzdql.mo44877g8(zzdql.mo44879i(), view, true);
        }
        zzfvn zzfvn = zzdpm.f32714E;
        int size = zzfvn.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View z02 = zzdql.mo44889z0((String) zzfvn.get(i2));
            i2++;
            if (z02 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) z02;
                break;
            }
        }
        this.f32741h.execute(new zzdpn(this, viewGroup2));
        if (viewGroup2 != null) {
            if (m47876h(viewGroup2, true)) {
                zzdoq zzdoq2 = this.f32737d;
                if (zzdoq2.mo44813Z() != null) {
                    zzdoq2.mo44813Z().mo44018K0(new zzdpp(zzdql, viewGroup2));
                    return;
                }
                return;
            }
            if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27170k8)).booleanValue() || !m47876h(viewGroup2, false)) {
                viewGroup2.removeAllViews();
                View c = zzdql.mo44874c();
                if (c != null) {
                    context = c.getContext();
                }
                if (context != null && (a = this.f32743j.mo44793a()) != null) {
                    try {
                        IObjectWrapper g = a.mo42753g();
                        if (g != null && (drawable = (Drawable) ObjectWrapper.m5050A1(g)) != null) {
                            ImageView imageView = new ImageView(context);
                            imageView.setImageDrawable(drawable);
                            IObjectWrapper h = zzdql.mo44878h();
                            if (h != null) {
                                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27177l5)).booleanValue()) {
                                    imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.m5050A1(h));
                                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    viewGroup2.addView(imageView);
                                }
                            }
                            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            viewGroup2.addView(imageView);
                        }
                    } catch (RemoteException unused) {
                        zzcgp.m45229g("Could not get main image drawable");
                    }
                }
            } else {
                zzdoq zzdoq3 = this.f32737d;
                if (zzdoq3.mo44811X() != null) {
                    zzdoq3.mo44811X().mo44018K0(new zzdpp(zzdql, viewGroup2));
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo44900c(@Nullable zzdql zzdql) {
        if (zzdql != null && this.f32738e != null && zzdql.mo44875e() != null && this.f32736c.mo44853g()) {
            try {
                zzdql.mo44875e().addView(this.f32738e.mo44910a());
            } catch (zzcna e) {
                zze.m2646l("web view can not be obtained", e);
            }
        }
    }

    /* renamed from: d */
    public final void mo44901d(@Nullable zzdql zzdql) {
        if (zzdql != null) {
            Context context = zzdql.mo44874c().getContext();
            if (zzbx.m2615h(context, this.f32736c.f32675a)) {
                if (!(context instanceof Activity)) {
                    zzcgp.m45224b("Activity context is needed for policy validator.");
                } else if (this.f32739f != null && zzdql.mo44875e() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(this.f32739f.mo44917a(zzdql.mo44875e(), windowManager), zzbx.m2609b());
                    } catch (zzcna e) {
                        zze.m2646l("web view can not be obtained", e);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo44902e(zzdql zzdql) {
        this.f32740g.execute(new zzdpo(this, zzdql));
    }

    /* renamed from: f */
    public final boolean mo44903f(@NonNull ViewGroup viewGroup) {
        return m47876h(viewGroup, true);
    }
}
