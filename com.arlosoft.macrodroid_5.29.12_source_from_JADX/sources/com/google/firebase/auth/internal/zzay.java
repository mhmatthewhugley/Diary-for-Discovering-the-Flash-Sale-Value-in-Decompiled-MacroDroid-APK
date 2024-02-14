package com.google.firebase.auth.internal;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p204firebaseauthapi.zzqx;
import com.google.firebase.auth.GetTokenResult;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzay {

    /* renamed from: a */
    private static final Logger f4627a = new Logger("GetTokenResultFactory", new String[0]);

    /* renamed from: a */
    public static GetTokenResult m6194a(String str) {
        Map map;
        try {
            map = zzaz.m6196b(str);
        } catch (zzqx e) {
            f4627a.mo21838b("Error parsing token claims", e, new Object[0]);
            map = new HashMap();
        }
        return new GetTokenResult(str, map);
    }
}
