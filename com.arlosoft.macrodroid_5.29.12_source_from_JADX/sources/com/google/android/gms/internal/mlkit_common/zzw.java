package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class zzw {

    /* renamed from: a */
    private final String f43080a;

    /* renamed from: b */
    private final zzv f43081b;

    /* renamed from: c */
    private zzv f43082c;

    /* synthetic */ zzw(String str, zzt zzt) {
        zzv zzv = new zzv((zzt) null);
        this.f43081b = zzv;
        this.f43082c = zzv;
        Objects.requireNonNull(str);
        this.f43080a = str;
    }

    /* renamed from: a */
    public final zzw mo52015a(String str, Object obj) {
        zzv zzv = new zzv((zzt) null);
        this.f43082c.f43079c = zzv;
        this.f43082c = zzv;
        zzv.f43078b = obj;
        zzv.f43077a = str;
        return this;
    }

    /* renamed from: b */
    public final zzw mo52016b(String str, boolean z) {
        String valueOf = String.valueOf(z);
        zzu zzu = new zzu((zzt) null);
        this.f43082c.f43079c = zzu;
        this.f43082c = zzu;
        zzu.f43078b = valueOf;
        zzu.f43077a = "isManifestFile";
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f43080a);
        sb.append('{');
        zzv zzv = this.f43081b.f43079c;
        String str = "";
        while (zzv != null) {
            Object obj = zzv.f43078b;
            sb.append(str);
            String str2 = zzv.f43077a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            zzv = zzv.f43079c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
