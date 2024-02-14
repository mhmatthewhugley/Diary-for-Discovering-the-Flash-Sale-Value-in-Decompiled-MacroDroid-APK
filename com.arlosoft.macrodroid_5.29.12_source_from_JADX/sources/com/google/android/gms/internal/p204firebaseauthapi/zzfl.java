package com.google.android.gms.internal.p204firebaseauthapi;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.annotation.Nullable;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.crypto.KeyGenerator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzfl {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public zzbj f40058a = null;

    /* renamed from: b */
    private String f40059b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public zzap f40060c = null;

    /* renamed from: d */
    private zzbf f40061d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public zzbi f40062e;

    /* renamed from: f */
    private zzfq f40063f = null;

    @Nullable
    /* renamed from: h */
    private final zzap m57253h() throws GeneralSecurityException {
        if (Build.VERSION.SDK_INT >= 23) {
            zzfp zzfp = new zzfp();
            boolean a = zzfp.mo49412a(this.f40059b);
            if (!a) {
                try {
                    String str = this.f40059b;
                    if (!new zzfp().mo49412a(str)) {
                        String a2 = zzqs.m57979a("android-keystore://", str);
                        KeyGenerator instance = KeyGenerator.getInstance(KeyPropertiesCompact.KEY_ALGORITHM_AES, "AndroidKeyStore");
                        instance.init(new KeyGenParameterSpec.Builder(a2, 3).setKeySize(256).setBlockModes(new String[]{KeyPropertiesCompact.BLOCK_MODE_GCM}).setEncryptionPaddings(new String[]{KeyPropertiesCompact.ENCRYPTION_PADDING_NONE}).build());
                        instance.generateKey();
                    } else {
                        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", new Object[]{str}));
                    }
                } catch (GeneralSecurityException | ProviderException e) {
                    Log.w(zzfn.f40064d, "cannot use Android Keystore, it'll be disabled", e);
                    return null;
                }
            }
            try {
                return zzfp.mo49339o(this.f40059b);
            } catch (GeneralSecurityException | ProviderException e2) {
                if (!a) {
                    Log.w(zzfn.f40064d, "cannot use Android Keystore, it'll be disabled", e2);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.f40059b}), e2);
            }
        } else {
            Log.w(zzfn.f40064d, "Android Keystore requires at least Android M");
            return null;
        }
    }

    /* renamed from: i */
    private final zzbi m57254i() throws GeneralSecurityException, IOException {
        zzap zzap = this.f40060c;
        if (zzap != null) {
            try {
                return zzbi.m56960f(zzbh.m56951h(this.f40063f, zzap));
            } catch (zzadn | GeneralSecurityException e) {
                Log.w(zzfn.f40064d, "cannot decrypt keyset: ", e);
            }
        }
        return zzbi.m56960f(zzar.m56905b(this.f40063f));
    }

    @Deprecated
    /* renamed from: d */
    public final zzfl mo49407d(zznx zznx) {
        String H = zznx.mo49665H();
        byte[] F = zznx.mo49664G().mo48904F();
        zzoy F2 = zznx.mo49663F();
        int i = zzfn.f40065e;
        zzoy zzoy = zzoy.UNKNOWN_PREFIX;
        int ordinal = F2.ordinal();
        int i2 = 4;
        if (ordinal == 1) {
            i2 = 1;
        } else if (ordinal == 2) {
            i2 = 2;
        } else if (ordinal == 3) {
            i2 = 3;
        } else if (ordinal != 4) {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        this.f40061d = zzbf.m56944e(H, F, i2);
        return this;
    }

    /* renamed from: e */
    public final zzfl mo49408e(String str) {
        if (str.startsWith("android-keystore://")) {
            this.f40059b = str;
            return this;
        }
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    /* renamed from: f */
    public final zzfl mo49409f(Context context, String str, String str2) throws IOException {
        if (context != null) {
            this.f40063f = new zzfq(context, "GenericIdpKeyset", str2);
            this.f40058a = new zzfr(context, "GenericIdpKeyset", str2);
            return this;
        }
        throw new IllegalArgumentException("need an Android context");
    }

    /* renamed from: g */
    public final synchronized zzfn mo49410g() throws GeneralSecurityException, IOException {
        zzbi zzbi;
        if (this.f40059b != null) {
            this.f40060c = m57253h();
        }
        try {
            zzbi = m57254i();
        } catch (FileNotFoundException e) {
            if (Log.isLoggable(zzfn.f40064d, 4)) {
                Log.i(zzfn.f40064d, String.format("keyset not found, will generate a new one. %s", new Object[]{e.getMessage()}));
            }
            if (this.f40061d != null) {
                zzbi = zzbi.m56959e();
                zzbi.mo49337c(this.f40061d);
                zzbi.mo49338d(zzbi.mo49336b().mo49330d().mo49691D(0).mo49690C());
                if (this.f40060c != null) {
                    zzbi.mo49336b().mo49332f(this.f40058a, this.f40060c);
                } else {
                    zzar.m56904a(zzbi.mo49336b(), this.f40058a);
                }
            } else {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }
        this.f40062e = zzbi;
        return new zzfn(this, (zzfm) null);
    }
}
