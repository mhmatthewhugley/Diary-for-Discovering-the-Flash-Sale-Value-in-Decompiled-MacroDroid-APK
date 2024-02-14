package com.twofortyfouram.locale.sdk.client.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.twofortyfouram.locale.sdk.client.p234ui.activity.IPluginActivity;
import p276h8.C12406a;
import p305k8.C13419d;

/* renamed from: com.twofortyfouram.locale.sdk.client.internal.c */
public final class C11782c<T extends Activity & IPluginActivity> {
    /* renamed from: a */
    private static boolean m82000a(@NonNull Intent intent) {
        C12406a.m83260d(intent, "intent");
        String action = intent.getAction();
        return "com.twofortyfouram.locale.intent.action.EDIT_CONDITION".equals(action) || "com.twofortyfouram.locale.intent.action.EDIT_SETTING".equals(action);
    }

    /* renamed from: b */
    public static void m82002b(@NonNull T t, @Nullable Bundle bundle) {
        C12406a.m83260d(t, "activity");
        if (m82000a(t.getIntent()) && bundle == null) {
            IPluginActivity iPluginActivity = (IPluginActivity) t;
            Bundle previousBundle = iPluginActivity.getPreviousBundle();
            String previousBlurb = iPluginActivity.getPreviousBlurb();
            if (previousBundle != null && previousBlurb != null) {
                iPluginActivity.onPostCreateWithPreviousResult(previousBundle, previousBlurb);
            }
        }
    }

    /* renamed from: a */
    public static void m81998a(@NonNull T t, @Nullable Bundle bundle) {
        C12406a.m83260d(t, "activity");
        Intent intent = t.getIntent();
        if (m82000a(intent) && !C13419d.m85855a(intent)) {
            C13419d.m85856b(((IPluginActivity) t).getPreviousBundle());
        }
    }

    @Nullable
    /* renamed from: b */
    public static Bundle m82001b(@NonNull T t) {
        C12406a.m83260d(t, "activity");
        Bundle bundleExtra = t.getIntent().getBundleExtra("com.twofortyfouram.locale.intent.extra.BUNDLE");
        if (bundleExtra == null || !((IPluginActivity) t).isBundleValid(bundleExtra)) {
            return null;
        }
        return bundleExtra;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r4 = (com.twofortyfouram.locale.sdk.client.p234ui.activity.IPluginActivity) r3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m81999a(@androidx.annotation.NonNull T r3, boolean r4) {
        /*
            android.content.Intent r0 = r3.getIntent()
            boolean r0 = m82000a((android.content.Intent) r0)
            if (r0 == 0) goto L_0x0048
            if (r4 != 0) goto L_0x0048
            r4 = r3
            com.twofortyfouram.locale.sdk.client.ui.activity.IPluginActivity r4 = (com.twofortyfouram.locale.sdk.client.p234ui.activity.IPluginActivity) r4
            android.os.Bundle r0 = r4.getResultBundle()
            if (r0 == 0) goto L_0x0048
            p276h8.C12407b.m83265d(r0)
            java.lang.String r1 = r4.getResultBlurb(r0)
            java.lang.String r2 = "blurb"
            p276h8.C12406a.m83260d(r1, r2)
            android.os.Bundle r2 = r4.getPreviousBundle()
            boolean r2 = p305k8.C13416a.m85852a(r0, r2)
            if (r2 == 0) goto L_0x0035
            java.lang.String r4 = r4.getPreviousBlurb()
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0048
        L_0x0035:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r2 = "com.twofortyfouram.locale.intent.extra.BUNDLE"
            r4.putExtra(r2, r0)
            java.lang.String r0 = "com.twofortyfouram.locale.intent.extra.BLURB"
            r4.putExtra(r0, r1)
            r0 = -1
            r3.setResult(r0, r4)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twofortyfouram.locale.sdk.client.internal.C11782c.m81999a(android.app.Activity, boolean):void");
    }

    @Nullable
    /* renamed from: a */
    public static String m81997a(@NonNull T t) {
        return t.getIntent().getStringExtra("com.twofortyfouram.locale.intent.extra.BLURB");
    }
}
