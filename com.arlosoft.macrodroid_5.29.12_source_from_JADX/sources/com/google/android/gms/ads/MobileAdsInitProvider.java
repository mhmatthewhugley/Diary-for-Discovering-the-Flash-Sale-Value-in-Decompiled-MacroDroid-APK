package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;

@KeepForSdkWithMembers
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class MobileAdsInitProvider extends ContentProvider {

    /* renamed from: a */
    private final zzee f1701a = new zzee();

    public void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        this.f1701a.attachInfo(context, providerInfo);
    }

    public int delete(@NonNull Uri uri, @NonNull String str, @NonNull String[] strArr) {
        return 0;
    }

    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    public Uri insert(@NonNull Uri uri, @NonNull ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return false;
    }

    @Nullable
    public Cursor query(@NonNull Uri uri, @NonNull String[] strArr, @NonNull String str, @NonNull String[] strArr2, @NonNull String str2) {
        return null;
    }

    public int update(@NonNull Uri uri, @NonNull ContentValues contentValues, @NonNull String str, @NonNull String[] strArr) {
        return 0;
    }
}
