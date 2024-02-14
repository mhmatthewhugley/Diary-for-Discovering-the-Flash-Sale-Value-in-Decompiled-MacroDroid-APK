package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.zzfj;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzcx extends zzdu {

    /* renamed from: g */
    final /* synthetic */ String f41339g;

    /* renamed from: o */
    final /* synthetic */ String f41340o;

    /* renamed from: p */
    final /* synthetic */ Context f41341p;

    /* renamed from: s */
    final /* synthetic */ Bundle f41342s;

    /* renamed from: z */
    final /* synthetic */ zzef f41343z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcx(zzef zzef, String str, String str2, Context context, Bundle bundle) {
        super(zzef, true);
        this.f41343z = zzef;
        this.f41339g = str;
        this.f41340o = str2;
        this.f41341p = context;
        this.f41342s = bundle;
    }

    /* renamed from: a */
    public final void mo50838a() {
        String str;
        String str2;
        String str3;
        try {
            if (this.f41343z.m59628n(this.f41339g, this.f41340o)) {
                String str4 = this.f41340o;
                str2 = this.f41339g;
                str = str4;
                str3 = this.f41343z.f41427a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            Preconditions.m4488k(this.f41341p);
            zzef zzef = this.f41343z;
            zzef.f41435i = zzef.mo50872t(this.f41341p, true);
            if (this.f41343z.f41435i == null) {
                Log.w(this.f41343z.f41427a, "Failed to connect to measurement client.");
                return;
            }
            int a = DynamiteModule.m5094a(this.f41341p, ModuleDescriptor.MODULE_ID);
            int c = DynamiteModule.m5095c(this.f41341p, ModuleDescriptor.MODULE_ID);
            ((zzcc) Preconditions.m4488k(this.f41343z.f41435i)).initialize(ObjectWrapper.m5051g8(this.f41341p), new zzcl(74029, (long) Math.max(a, c), c < a, str3, str2, str, this.f41342s, zzfj.m65653a(this.f41341p)), this.f41402a);
        } catch (Exception e) {
            this.f41343z.m59625k(e, true, false);
        }
    }
}
