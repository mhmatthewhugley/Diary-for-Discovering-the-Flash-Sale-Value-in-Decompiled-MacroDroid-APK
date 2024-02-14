package com.google.android.gms.internal.icing;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

@ShowFirstParty
@VisibleForTesting
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzr {

    /* renamed from: a */
    private final String f41040a;

    /* renamed from: b */
    private String f41041b;

    /* renamed from: c */
    private boolean f41042c;

    /* renamed from: d */
    private boolean f41043d;

    /* renamed from: e */
    private final List<zzm> f41044e = new ArrayList();
    @Nullable

    /* renamed from: f */
    private String f41045f;

    public zzr(String str) {
        this.f41040a = str;
    }

    /* renamed from: a */
    public final zzr mo50474a(String str) {
        this.f41041b = "blob";
        return this;
    }

    /* renamed from: b */
    public final zzr mo50475b(boolean z) {
        this.f41042c = true;
        return this;
    }

    /* renamed from: c */
    public final zzs mo50476c() {
        String str = this.f41040a;
        String str2 = this.f41041b;
        boolean z = this.f41042c;
        boolean z2 = this.f41043d;
        List<zzm> list = this.f41044e;
        return new zzs(str, str2, z, 1, z2, (String) null, (zzm[]) list.toArray(new zzm[list.size()]), this.f41045f, (zzu) null);
    }
}
