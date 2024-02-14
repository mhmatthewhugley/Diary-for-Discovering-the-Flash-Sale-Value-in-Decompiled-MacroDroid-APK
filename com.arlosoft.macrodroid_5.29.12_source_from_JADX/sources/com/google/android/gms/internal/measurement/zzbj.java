package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzbj extends zzaw {
    /* renamed from: a */
    public final zzap mo50760a(String str, zzg zzg, List list) {
        if (str == null || str.isEmpty() || !zzg.mo51061h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        zzap d = zzg.mo51057d(str);
        if (d instanceof zzai) {
            return ((zzai) d).mo50735a(zzg, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}
