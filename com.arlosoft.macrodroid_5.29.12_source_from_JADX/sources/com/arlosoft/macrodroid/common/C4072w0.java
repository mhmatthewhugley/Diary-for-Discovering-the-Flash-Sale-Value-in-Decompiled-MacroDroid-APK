package com.arlosoft.macrodroid.common;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import p148q0.C8151a;

/* renamed from: com.arlosoft.macrodroid.common.w0 */
/* compiled from: PebbleHelper */
public class C4072w0 {

    /* renamed from: com.arlosoft.macrodroid.common.w0$a */
    /* compiled from: PebbleHelper */
    public interface C4073a {
        /* renamed from: a */
        void mo26327a();
    }

    /* renamed from: d */
    public static void m16080d(Activity activity, C4073a aVar) {
        String string = activity.getString(C17541R$string.pebble_info_message);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle((CharSequence) activity.getString(C17541R$string.pebble_info_title));
        builder.setMessage((CharSequence) string);
        builder.setPositiveButton((CharSequence) activity.getString(C17541R$string.pebble_info_button_install), (DialogInterface.OnClickListener) new C4060t0(activity));
        builder.setNeutralButton((CharSequence) activity.getString(C17541R$string.pebble_info_button_continue), (DialogInterface.OnClickListener) new C4067u0(aVar));
        builder.setNegativeButton((CharSequence) activity.getString(17039360), (DialogInterface.OnClickListener) C4070v0.f10649a);
        builder.show();
        C5163j2.m20018M5(activity, true);
    }

    /* renamed from: e */
    public static void m16081e(Context context) {
        String str = context.getExternalFilesDir((String) null) + "/" + "macrodroid_watchface.pbw";
        try {
            InputStream open = context.getAssets().open("macrodroid_watchface.pbw");
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            open.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.setData(Uri.fromFile(new File(str)));
            if (C4031k.m15912l()) {
                intent.setClassName("com.getpebble.android.basalt", "com.getpebble.android.activity_home_screen.activity.MainActivity");
            } else {
                intent.setClassName("com.getpebble.android", "com.getpebble.android.ui.UpdateActivity");
            }
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                C4061t1.m16023v(context, "Pebble Install Failed", "Could not install watch app", false);
            }
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Failed to copy the pebble watch face app: " + e.toString()));
            C4061t1.m16023v(context, "Pebble Install Failed", "Could not install watchc app", false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m16083g(C4073a aVar, DialogInterface dialogInterface, int i) {
        if (aVar != null) {
            aVar.mo26327a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m16084h(DialogInterface dialogInterface, int i) {
    }
}
