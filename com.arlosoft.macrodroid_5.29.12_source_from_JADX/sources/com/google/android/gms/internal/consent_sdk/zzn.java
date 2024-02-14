package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class zzn {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Application f39425a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zzb f39426b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final zzam f39427c;

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final zzbu mo48721d(Activity activity, ConsentRequestParameters consentRequestParameters) throws zzj {
        ConsentDebugSettings a = consentRequestParameters.mo60048a();
        if (a == null) {
            a = new ConsentDebugSettings.Builder(this.f39425a).mo60044a();
        }
        return zzo.m55980a(new zzo(this, activity, a, consentRequestParameters, (zzm) null));
    }
}
