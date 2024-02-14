package com.arlosoft.macrodroid.utils;

import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.common.C4031k;

/* renamed from: com.arlosoft.macrodroid.utils.l0 */
/* compiled from: LegacySystemCommands */
public class C6401l0 {
    /* renamed from: a */
    private static boolean m24655a(Context context) {
        return C4031k.m15909i();
    }

    /* renamed from: b */
    public static void m24656b(Context context, String str, int i, String str2) {
        if (m24655a(context)) {
            Intent intent = new Intent("com.arlosoft.macrodroid.settingshelper.COMMAND");
            intent.putExtra("command", "system_put_int");
            intent.putExtra("settings_field", str);
            intent.putExtra("param", i);
            intent.putExtra("macro_name", str2);
            intent.addFlags(32);
            context.sendBroadcast(intent);
        }
    }
}
