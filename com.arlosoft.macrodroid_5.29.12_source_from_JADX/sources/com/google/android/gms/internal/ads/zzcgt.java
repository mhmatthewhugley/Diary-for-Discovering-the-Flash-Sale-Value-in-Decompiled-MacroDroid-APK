package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcgt {
    /* renamed from: a */
    public static Context m45235a(Context context) throws zzcgs {
        return m45237c(context).mo22053b();
    }

    /* renamed from: b */
    public static Object m45236b(Context context, String str, zzcgr zzcgr) throws zzcgs {
        try {
            return zzcgr.mo19874a(m45237c(context).mo22054d(str));
        } catch (Exception e) {
            throw new zzcgs(e);
        }
    }

    /* renamed from: c */
    private static DynamiteModule m45237c(Context context) throws zzcgs {
        try {
            return DynamiteModule.m5096e(context, DynamiteModule.f4040b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new zzcgs(e);
        }
    }
}
