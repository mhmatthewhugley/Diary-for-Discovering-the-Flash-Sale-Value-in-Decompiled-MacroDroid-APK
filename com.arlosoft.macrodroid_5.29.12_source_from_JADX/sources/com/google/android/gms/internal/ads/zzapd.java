package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzapd extends zzapc {
    protected zzapd(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* renamed from: w */
    public static zzapd m42066w(String str, Context context, boolean z) {
        zzapc.m42054s(context, false);
        return new zzapd(context, str, false);
    }

    @Deprecated
    /* renamed from: x */
    public static zzapd m42067x(String str, Context context, boolean z, int i) {
        zzapc.m42054s(context, z);
        return new zzapd(context, str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final List mo41772q(zzaqe zzaqe, Context context, zzamk zzamk, zzamd zzamd) {
        if (zzaqe.mo41814k() == null || !this.f25242L) {
            return super.mo41772q(zzaqe, context, zzamk, (zzamd) null);
        }
        int a = zzaqe.mo41805a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo41772q(zzaqe, context, zzamk, (zzamd) null));
        arrayList.add(new zzaqw(zzaqe, "ysEnh8zkgcN8WwINs5FP7vGybZW2TtVSX36HO6emvdUrcCkVbC9hrF5Pe5ZSZx3i", "3LpdW89cIASEFv5WvS5ZDEWsiVGQitP33SL3WZgJ6zE=", zzamk, a, 24));
        return arrayList;
    }
}
