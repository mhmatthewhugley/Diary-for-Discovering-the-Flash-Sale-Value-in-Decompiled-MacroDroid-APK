package com.arlosoft.macrodroid.utils;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.RawRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.fragment.app.FragmentActivity;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17540R$raw;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.C13706o;
import kotlin.text.C15147d;

/* renamed from: com.arlosoft.macrodroid.utils.w1 */
/* compiled from: VersionHistoryHelper.kt */
public final class C6453w1 {

    /* renamed from: a */
    public static final C6453w1 f15079a = new C6453w1();

    private C6453w1() {
    }

    /* renamed from: b */
    public static final void m24773b(FragmentActivity fragmentActivity, boolean z) {
        C13706o.m87929f(fragmentActivity, "activity");
        PackageManager packageManager = fragmentActivity.getPackageManager();
        String packageName = fragmentActivity.getPackageName();
        try {
            C6453w1 w1Var = f15079a;
            String d = w1Var.m24775d(fragmentActivity, C17540R$raw.version_info_new);
            String d2 = w1Var.m24775d(fragmentActivity, C17540R$raw.version_info);
            String str = "";
            if (z) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                    C13706o.m87928e(packageInfo, "packageManager.getPackageInfo(packageName, 0)");
                    str = 'V' + packageInfo.versionName + " - " + fragmentActivity.getString(C17541R$string.whats_new);
                } catch (Exception unused) {
                }
            } else {
                str = fragmentActivity.getString(C17541R$string.version_history);
                C13706o.m87928e(str, "activity.getString(R.string.version_history)");
            }
            AppCompatDialog appCompatDialog = new AppCompatDialog(fragmentActivity, C17542R$style.Theme_App_Dialog_WhatsNew);
            appCompatDialog.setContentView((int) C17535R$layout.whats_new_dialog);
            appCompatDialog.setCancelable(true);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            Window window = appCompatDialog.getWindow();
            layoutParams.copyFrom(window != null ? window.getAttributes() : null);
            layoutParams.width = -1;
            Window window2 = appCompatDialog.getWindow();
            if (window2 != null) {
                window2.setAttributes(layoutParams);
            }
            ((TextView) appCompatDialog.findViewById(C17532R$id.titleText)).setText(str);
            ((TextView) appCompatDialog.findViewById(C17532R$id.whatsNewText)).setText(d + "\n\n" + d2);
            ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C6450v1(appCompatDialog));
            appCompatDialog.show();
        } catch (IOException e) {
            FirebaseCrashlytics.m6487a().mo22936d(new RuntimeException("Error Setting up Whats New Dialog: " + e.getMessage()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m24774c(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: d */
    private final String m24775d(Activity activity, @RawRes int i) {
        InputStream openRawResource = activity.getResources().openRawResource(i);
        C13706o.m87928e(openRawResource, "activity.resources.openRawResource(resource)");
        byte[] bArr = new byte[openRawResource.available()];
        openRawResource.read(bArr);
        String str = new String(bArr, C15147d.f64349b);
        openRawResource.close();
        return str;
    }
}
