package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeso implements zzeve {

    /* renamed from: a */
    private final zzfzq f34843a;
    @Nullable

    /* renamed from: b */
    private final ViewGroup f34844b;

    /* renamed from: c */
    private final Context f34845c;

    /* renamed from: d */
    private final Set f34846d;

    public zzeso(zzfzq zzfzq, @Nullable ViewGroup viewGroup, Context context, Set set) {
        this.f34843a = zzfzq;
        this.f34846d = set;
        this.f34844b = viewGroup;
        this.f34845c = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzesp mo45457a() throws Exception {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27039X4)).booleanValue() && this.f34844b != null && this.f34846d.contains("banner")) {
            return new zzesp(Boolean.valueOf(this.f34844b.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27048Y4)).booleanValue() && this.f34846d.contains("native")) {
            Context context = this.f34845c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolean z = false;
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                return new zzesp(bool);
            }
        }
        return new zzesp((Boolean) null);
    }

    public final int zza() {
        return 22;
    }

    public final zzfzp zzb() {
        return this.f34843a.mo46579F(new zzesn(this));
    }
}
