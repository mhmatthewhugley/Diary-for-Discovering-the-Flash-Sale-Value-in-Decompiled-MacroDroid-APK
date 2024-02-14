package com.google.firebase.auth.internal;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p204firebaseauthapi.zzaq;
import com.google.android.gms.internal.p204firebaseauthapi.zzau;
import com.google.android.gms.internal.p204firebaseauthapi.zzbj;
import com.google.android.gms.internal.p204firebaseauthapi.zzei;
import com.google.android.gms.internal.p204firebaseauthapi.zzen;
import com.google.android.gms.internal.p204firebaseauthapi.zzfl;
import com.google.android.gms.internal.p204firebaseauthapi.zzfn;
import com.google.android.gms.internal.p204firebaseauthapi.zzu;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzk {

    /* renamed from: c */
    private static zzk f4669c;

    /* renamed from: a */
    private final String f4670a;
    @Nullable

    /* renamed from: b */
    private final zzfn f4671b;

    private zzk(Context context, String str, boolean z) {
        zzfn zzfn;
        this.f4670a = str;
        try {
            zzei.m57188a();
            zzfl zzfl = new zzfl();
            zzfl.mo49409f(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", new Object[]{str}));
            zzfl.mo49407d(zzen.f40003b);
            zzfl.mo49408e(String.format("android-keystore://firebear_master_key_id.%s", new Object[]{str}));
            zzfn = zzfl.mo49410g();
        } catch (IOException | GeneralSecurityException e) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n".concat(String.valueOf(e.getMessage())));
            zzfn = null;
        }
        this.f4671b = zzfn;
    }

    /* renamed from: a */
    public static zzk m6265a(Context context, String str) {
        zzk zzk = f4669c;
        if (zzk == null || !zzu.m58078a(zzk.f4670a, str)) {
            f4669c = new zzk(context, str, true);
        }
        return f4669c;
    }

    @Nullable
    /* renamed from: b */
    public final String mo22797b(String str) {
        String str2;
        zzfn zzfn = this.f4671b;
        if (zzfn != null) {
            try {
                synchronized (zzfn) {
                    str2 = new String(((zzau) this.f4671b.mo49411a().mo49331e(zzau.class)).mo49304a(Base64.decode(str, 8), (byte[]) null), "UTF-8");
                }
                return str2;
            } catch (UnsupportedEncodingException | GeneralSecurityException e) {
                Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n".concat(String.valueOf(e.getMessage())));
                return null;
            }
        } else {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    public final String mo22798c() {
        if (this.f4671b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzbj c = zzaq.m56901c(byteArrayOutputStream);
        try {
            synchronized (this.f4671b) {
                this.f4671b.mo49411a().mo49328b().mo49333g(c);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n".concat(String.valueOf(e.getMessage())));
            return null;
        }
    }
}
