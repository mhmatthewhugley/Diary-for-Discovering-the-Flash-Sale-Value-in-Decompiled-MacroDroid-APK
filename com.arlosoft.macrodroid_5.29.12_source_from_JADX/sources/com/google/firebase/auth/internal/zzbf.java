package com.google.firebase.auth.internal;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.safetynet.SafetyNetApi;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbf {

    /* renamed from: a */
    private static final String f4642a = "zzbf";

    private zzbf() {
    }

    /* renamed from: a */
    public static boolean m6212a(@NonNull SafetyNetApi.AttestationResponse attestationResponse) {
        if (attestationResponse == null || TextUtils.isEmpty(attestationResponse.mo56072h())) {
            Log.e(f4642a, "No SafetyNet AttestationResponse passed.");
            return false;
        }
        zzbe a = zzbe.m6209a(attestationResponse.mo56072h());
        if (a == null) {
            Log.e(f4642a, "Unable to parse SafetyNet AttestationResponse");
            return false;
        } else if (!a.mo22765c()) {
            Log.e(f4642a, "SafetyNet Attestation fails basic integrity.");
            return false;
        } else if (TextUtils.isEmpty(a.mo22764b())) {
            return true;
        } else {
            Log.e(f4642a, "SafetyNet Attestation has advice: \n".concat(String.valueOf(a.mo22764b())));
            return false;
        }
    }
}
