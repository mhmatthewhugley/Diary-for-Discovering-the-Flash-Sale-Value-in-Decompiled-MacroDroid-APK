package com.google.android.gms.internal.p204firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzfq {

    /* renamed from: a */
    private final SharedPreferences f40073a;

    /* renamed from: b */
    private final String f40074b = "GenericIdpKeyset";

    public zzfq(Context context, String str, String str2) throws IOException {
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f40073a = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        } else {
            this.f40073a = applicationContext.getSharedPreferences(str2, 0);
        }
    }

    /* renamed from: c */
    private final byte[] m57269c() throws IOException {
        try {
            String string = this.f40073a.getString(this.f40074b, (String) null);
            if (string == null) {
                throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{this.f40074b}));
            } else if (string.length() % 2 == 0) {
                int length = string.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i + i;
                    int digit = Character.digit(string.charAt(i2), 16);
                    int digit2 = Character.digit(string.charAt(i2 + 1), 16);
                    if (digit == -1 || digit2 == -1) {
                        throw new IllegalArgumentException("input is not hexadecimal");
                    }
                    bArr[i] = (byte) ((digit * 16) + digit2);
                }
                return bArr;
            } else {
                throw new IllegalArgumentException("Expected a string of even length");
            }
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{this.f40074b}));
        }
    }

    /* renamed from: a */
    public final zzmo mo49413a() throws IOException {
        return zzmo.m57684E(m57269c(), zzacs.m56379a());
    }

    /* renamed from: b */
    public final zzof mo49414b() throws IOException {
        return zzof.m57829H(m57269c(), zzacs.m56379a());
    }
}
