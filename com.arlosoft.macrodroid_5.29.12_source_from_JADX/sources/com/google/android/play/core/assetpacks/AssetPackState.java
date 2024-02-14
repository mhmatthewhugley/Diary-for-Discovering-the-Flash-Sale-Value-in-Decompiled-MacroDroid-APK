package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.play.core.assetpacks.model.AssetPackErrorCode;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import com.google.android.play.core.assetpacks.model.zzb;

/* compiled from: com.google.android.play:core@@1.10.3 */
public abstract class AssetPackState {
    /* renamed from: h */
    public static AssetPackState m70457h(@NonNull String str, @AssetPackStatus int i, @AssetPackErrorCode int i2, long j, long j2, double d, int i3, String str2, String str3) {
        return new zzbn(str, i, i2, j, j2, (int) Math.rint(100.0d * d), i3, str2, str3);
    }

    /* renamed from: i */
    static AssetPackState m70458i(Bundle bundle, String str, zzco zzco, zzeb zzeb, zzbe zzbe) {
        Bundle bundle2 = bundle;
        String str2 = str;
        int a = zzbe.mo59621a(bundle2.getInt(zzb.m70477a(NotificationCompat.CATEGORY_STATUS, str2)), str2);
        int i = bundle2.getInt(zzb.m70477a("error_code", str2));
        long j = bundle2.getLong(zzb.m70477a("bytes_downloaded", str2));
        long j2 = bundle2.getLong(zzb.m70477a("total_bytes_to_download", str2));
        double a2 = zzco.mo59708a(str2);
        long j3 = bundle2.getLong(zzb.m70477a("pack_version", str2));
        long j4 = bundle2.getLong(zzb.m70477a("pack_base_version", str2));
        int i2 = 1;
        int i3 = 4;
        if (a != 4) {
            i3 = a;
        } else if (!(j4 == 0 || j4 == j3)) {
            i2 = 2;
        }
        return m70457h(str, i3, i, j, j2, a2, i2, bundle2.getString(zzb.m70477a("pack_version_tag", str2), String.valueOf(bundle2.getInt("app_version_code"))), zzeb.mo59751a(str2));
    }

    /* renamed from: a */
    public abstract long mo59576a();

    @AssetPackErrorCode
    /* renamed from: b */
    public abstract int mo59577b();

    /* renamed from: c */
    public abstract String mo59578c();

    @AssetPackStatus
    /* renamed from: d */
    public abstract int mo59579d();

    /* renamed from: e */
    public abstract long mo59580e();

    /* renamed from: f */
    public abstract int mo59581f();

    /* renamed from: g */
    public abstract int mo59582g();

    /* renamed from: j */
    public abstract String mo59583j();

    /* renamed from: k */
    public abstract String mo59584k();
}
