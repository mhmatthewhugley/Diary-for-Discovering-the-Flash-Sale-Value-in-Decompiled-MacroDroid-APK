package com.twofortyfouram.locale.sdk.client.p234ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.twofortyfouram.locale.sdk.client.internal.C11779a;
import com.twofortyfouram.locale.sdk.client.internal.C11781b;
import p276h8.C12406a;

/* renamed from: com.twofortyfouram.locale.sdk.client.ui.activity.InfoActivity */
public final class InfoActivity extends Activity {
    public final void onCreate(@Nullable Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        PackageManager packageManager = getPackageManager();
        String packageName = getPackageName();
        C12406a.m83260d(applicationContext, "context");
        C12406a.m83260d(packageManager, "manager");
        C12406a.m83260d(packageName, "myPackageName");
        String a = C11781b.m81996a(packageManager);
        if (a != null) {
            intent = packageManager.getLaunchIntentForPackage(a);
            intent.addFlags(268435456);
        } else {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(applicationContext.getString(C11779a.C11780a.com_twofortyfouram_locale_sdk_client_app_store_deep_link_format, new Object[]{"com.twofortyfouram.locale", packageName}))).addFlags(67108864);
        }
        try {
            startActivity(intent);
        } catch (Exception unused) {
        }
        finish();
    }
}
