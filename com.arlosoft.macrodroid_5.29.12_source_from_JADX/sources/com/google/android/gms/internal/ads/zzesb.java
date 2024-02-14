package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzesb implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzesc f34825a;

    public /* synthetic */ zzesb(zzesc zzesc) {
        this.f34825a = zzesc;
    }

    public final Object call() {
        String str;
        String str2;
        String str3;
        zzt.m2905r();
        zzbcp f = zzt.m2904q().mo43494h().mo20367f();
        Bundle bundle = null;
        if (f != null && (!zzt.m2904q().mo43494h().mo20355T() || !zzt.m2904q().mo43494h().mo20354M())) {
            if (f.mo42475h()) {
                f.mo42474g();
            }
            zzbcf a = f.mo42468a();
            if (a != null) {
                str2 = a.mo42427d();
                str = a.mo42428e();
                str3 = a.mo42430f();
                if (str2 != null) {
                    zzt.m2904q().mo43494h().mo20387q0(str2);
                }
                if (str3 != null) {
                    zzt.m2904q().mo43494h().mo20391u0(str3);
                }
            } else {
                str2 = zzt.m2904q().mo43494h().mo20371h();
                str3 = zzt.m2904q().mo43494h().mo20373i();
                str = null;
            }
            Bundle bundle2 = new Bundle(1);
            if (!zzt.m2904q().mo43494h().mo20354M()) {
                if (str3 == null || TextUtils.isEmpty(str3)) {
                    bundle2.putString("v_fp_vertical", "no_hash");
                } else {
                    bundle2.putString("v_fp_vertical", str3);
                }
            }
            if (str2 != null && !zzt.m2904q().mo43494h().mo20355T()) {
                bundle2.putString("fingerprint", str2);
                if (!str2.equals(str)) {
                    bundle2.putString("v_fp", str);
                }
            }
            if (!bundle2.isEmpty()) {
                bundle = bundle2;
            }
        }
        return new zzesd(bundle);
    }
}
