package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzag;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.HashMap;

@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class GmsSignatureVerifier {

    /* renamed from: a */
    private static final zzab f3055a;

    /* renamed from: b */
    private static final zzab f3056b;

    /* renamed from: c */
    private static final HashMap f3057c = new HashMap();

    static {
        zzz zzz = new zzz();
        zzz.mo21995d("com.google.android.gms");
        zzz.mo21992a(204200000);
        zzl zzl = zzn.f3988d;
        zzz.mo21994c(zzag.m55891t(zzl.mo21975g8(), zzn.f3986b.mo21975g8()));
        zzl zzl2 = zzn.f3987c;
        zzz.mo21993b(zzag.m55891t(zzl2.mo21975g8(), zzn.f3985a.mo21975g8()));
        f3055a = zzz.mo21996e();
        zzz zzz2 = new zzz();
        zzz2.mo21995d("com.android.vending");
        zzz2.mo21992a(82240000);
        zzz2.mo21994c(zzag.m55890q(zzl.mo21975g8()));
        zzz2.mo21993b(zzag.m55890q(zzl2.mo21975g8()));
        f3056b = zzz2.mo21996e();
    }
}
