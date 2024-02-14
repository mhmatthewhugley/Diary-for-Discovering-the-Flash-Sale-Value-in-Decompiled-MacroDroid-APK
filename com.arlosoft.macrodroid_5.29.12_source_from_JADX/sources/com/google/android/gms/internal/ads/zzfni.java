package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfni {

    /* renamed from: a */
    private final Context f36160a;

    /* renamed from: b */
    private final Looper f36161b;

    public zzfni(@NonNull Context context, @NonNull Looper looper) {
        this.f36160a = context;
        this.f36161b = looper;
    }

    /* renamed from: a */
    public final void mo46006a(@NonNull String str) {
        zzfnw F = zzfny.m50649F();
        F.mo46018n(this.f36160a.getPackageName());
        F.mo46020u(2);
        zzfnt F2 = zzfnu.m50640F();
        F2.mo46016n(str);
        F2.mo46017o(2);
        F.mo46019o(F2);
        new zzfnj(this.f36160a, this.f36161b, (zzfny) F.mo47341h()).mo46007a();
    }
}
