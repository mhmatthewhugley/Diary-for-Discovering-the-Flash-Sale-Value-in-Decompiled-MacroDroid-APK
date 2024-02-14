package com.arlosoft.macrodroid.utils;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.arlosoft.macrodroid.triggers.receivers.MacroDroidDeviceAdminReceiver;
import kotlin.jvm.internal.C13706o;
import p319lc.C15626c;

/* renamed from: com.arlosoft.macrodroid.utils.p1 */
/* compiled from: UninstallHelper.kt */
public final class C6417p1 {

    /* renamed from: a */
    public static final C6417p1 f15038a = new C6417p1();

    private C6417p1() {
    }

    /* renamed from: a */
    public static final void m24714a(Context context) {
        C13706o.m87929f(context, "context");
        try {
            ComponentName componentName = new ComponentName(context, MacroDroidDeviceAdminReceiver.class);
            Object systemService = context.getSystemService("device_policy");
            C13706o.m87927d(systemService, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
            ((DevicePolicyManager) systemService).removeActiveAdmin(componentName);
            Intent intent = new Intent("android.intent.action.UNINSTALL_PACKAGE");
            intent.setData(Uri.parse("package:com.arlosoft.macrodroid"));
            intent.putExtra("android.intent.extra.RETURN_RESULT", true);
            context.startActivity(intent);
        } catch (Exception unused) {
            C15626c.m94876a(context.getApplicationContext(), "Device does not support ACTION_UNINSTALL_PACKAGE intent", 1).show();
        }
    }
}
