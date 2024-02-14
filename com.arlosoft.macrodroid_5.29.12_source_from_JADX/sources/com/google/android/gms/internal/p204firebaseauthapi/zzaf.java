package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.apache.commons.p353io.FilenameUtils;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaf {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzn f39819a;

    /* renamed from: b */
    private final zzae f39820b;

    private zzaf(zzae zzae) {
        zzm zzm = zzm.f40237b;
        this.f39820b = zzae;
        this.f39819a = zzm;
    }

    /* renamed from: b */
    public static zzaf m56721b(char c) {
        return new zzaf(new zzaa(new zzk(FilenameUtils.EXTENSION_SEPARATOR)));
    }

    /* renamed from: c */
    public static zzaf m56722c(String str) {
        zzq a = zzx.m58308a("[.-]");
        if (!((zzs) a.mo49716a("")).f40382a.matches()) {
            return new zzaf(new zzac(a));
        }
        throw new IllegalArgumentException(zzag.m56868b("The pattern may not match the empty string: %s", a));
    }

    /* renamed from: d */
    public final List mo49156d(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Iterator a = this.f39820b.mo48730a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (a.hasNext()) {
            arrayList.add((String) a.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
