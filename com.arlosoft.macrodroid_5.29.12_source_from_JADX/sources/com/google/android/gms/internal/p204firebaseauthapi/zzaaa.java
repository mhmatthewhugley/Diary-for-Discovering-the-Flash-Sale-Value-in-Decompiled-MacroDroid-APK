package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.apache.commons.p353io.FilenameUtils;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaa */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaaa {
    /* renamed from: a */
    public static long m55990a(String str) {
        Preconditions.m4484g(str);
        List d = zzaf.m56721b(FilenameUtils.EXTENSION_SEPARATOR).mo49156d(str);
        if (d.size() >= 2) {
            try {
                zzaab a = zzaab.m55991a(new String(Base64Utils.m4852b((String) d.get(1)), "UTF-8"));
                return a.mo48731b().longValue() - a.mo48732c().longValue();
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unable to decode token", e);
            }
        } else {
            throw new RuntimeException("Invalid idToken ".concat(String.valueOf(str)));
        }
    }
}
