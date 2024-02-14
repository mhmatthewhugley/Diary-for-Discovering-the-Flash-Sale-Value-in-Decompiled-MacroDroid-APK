package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class AndroidUtilsLight {
    @Nullable
    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public static byte[] m4839a(@NonNull Context context, @NonNull String str) throws PackageManager.NameNotFoundException {
        MessageDigest b;
        PackageInfo f = Wrappers.m4929a(context).mo21963f(str, 64);
        Signature[] signatureArr = f.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b = m4840b("SHA1")) == null) {
            return null;
        }
        return b.digest(f.signatures[0].toByteArray());
    }

    @Nullable
    /* renamed from: b */
    public static MessageDigest m4840b(@NonNull String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
