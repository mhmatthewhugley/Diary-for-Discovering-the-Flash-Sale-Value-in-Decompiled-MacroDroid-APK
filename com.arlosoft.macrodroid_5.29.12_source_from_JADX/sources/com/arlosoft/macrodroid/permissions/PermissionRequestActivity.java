package com.arlosoft.macrodroid.permissions;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.FloatingButtonTrigger;
import com.arlosoft.macrodroid.triggers.SwipeTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.receivers.MacroDroidDeviceAdminReceiver;
import java.util.Iterator;
import p112j2.C13248a;
import p112j2.C13250b;
import p112j2.C13252c;
import p112j2.C13254d;
import p112j2.C7439d0;
import p319lc.C15626c;

public class PermissionRequestActivity extends AppCompatActivity {
    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public /* synthetic */ void m19271P1(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public /* synthetic */ void m19272Q1(DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            intent.addFlags(131);
            startActivityForResult(intent, 0);
        } catch (ActivityNotFoundException unused) {
            C15626c.makeText(this, C17541R$string.error, 0).show();
            C4878b.m18868g("No app installed that can handle the intent: OPEN_DOCUMENT_TREE");
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public static /* synthetic */ void m19274S1(Activity activity, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            m19277V1(activity);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public static void m19276U1(Activity activity) {
        try {
            activity.startActivity(new Intent("android.settings.SETTINGS"));
            activity.finish();
        } catch (Exception unused) {
            C15626c.m94876a(activity.getApplicationContext(), activity.getString(C17541R$string.cannot_launch_settings), 1).show();
        }
    }

    /* renamed from: V1 */
    private static void m19277V1(Activity activity) {
        try {
            activity.startActivity(new Intent("android.settings.VOICE_INPUT_SETTINGS"));
            activity.finish();
        } catch (Exception unused) {
            C15626c.m94876a(activity.getApplicationContext(), activity.getString(C17541R$string.cannot_launch_settings), 1).show();
        }
    }

    /* renamed from: W1 */
    private void m19278W1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((int) C17541R$string.file_access_permission);
        builder.setMessage((int) C17541R$string.file_access_permission_detail).setCancelable(false).setNegativeButton(17039360, (DialogInterface.OnClickListener) new C13252c(this)).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C13254d(this));
        builder.show();
    }

    /* renamed from: X1 */
    private void m19279X1(int i, String str) {
        switch (i) {
            case 1:
                m19285d2();
                return;
            case 2:
                C7439d0.m30887d0(this, false, true);
                return;
            case 3:
                m19284c2();
                return;
            case 4:
                C7439d0.m30883b0(this, true, false, false, false, true);
                return;
            case 5:
                C7439d0.m30893g0(this, new ComponentName(this, MacroDroidDeviceAdminReceiver.class), true, true);
                return;
            case 6:
                m19282a2();
                return;
            case 7:
                m19283b2();
                return;
            case 8:
                C7439d0.m30883b0(this, true, true, false, false, true);
                return;
            case 9:
                C7439d0.m30883b0(this, true, false, true, false, true);
                return;
            case 10:
                C7439d0.m30883b0(this, true, false, false, true, true);
                return;
            case 11:
                m19281Z1();
                C7439d0.m30899j0(this, true, true);
                return;
            case 12:
                m19280Y1(this);
                return;
            case 13:
                setTitle(C17541R$string.helper_apk_required);
                C7439d0.m30903l0(this, true, true, str);
                return;
            case 14:
                C7439d0.m30885c0(this, (SelectableItem) null);
                finish();
                return;
            default:
                return;
        }
    }

    /* renamed from: Y1 */
    public static void m19280Y1(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.default_assist_title);
        builder.setMessage((int) C17541R$string.default_assist_description).setCancelable(false).setNegativeButton((int) C17541R$string.settings, (DialogInterface.OnClickListener) new C13250b(activity)).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C13248a(activity));
        builder.show();
    }

    /* renamed from: Z1 */
    private void m19281Z1() {
        try {
            startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } catch (ActivityNotFoundException unused) {
            C15626c.m94876a(getApplicationContext(), "DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN not supported on this device", 1).show();
        }
        finish();
    }

    /* renamed from: a2 */
    private void m19282a2() {
        try {
            startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
        } catch (Exception unused) {
            C15626c.m94876a(getApplicationContext(), getString(C17541R$string.cannot_launch_notification_settings), 1).show();
        }
        finish();
    }

    /* renamed from: b2 */
    private void m19283b2() {
        try {
            startActivity(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"));
        } catch (Exception unused) {
            C15626c.m94876a(getApplicationContext(), getString(C17541R$string.cannot_launch_notification_settings), 1).show();
        }
        finish();
    }

    /* renamed from: c2 */
    private void m19284c2() {
        Intent intent = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
        intent.addFlags(268435456);
        try {
            startActivityForResult(intent, 0);
        } catch (Exception unused) {
            C15626c.m94876a(getApplicationContext(), getString(C17541R$string.cannot_launch_accessibility_settings), 1).show();
        }
        finish();
    }

    /* renamed from: d2 */
    private void m19285d2() {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(Uri.parse("package:com.arlosoft.macrodroid"));
        intent.addFlags(268435456);
        try {
            startActivity(intent);
        } catch (Exception unused) {
            C15626c.m94876a(getApplicationContext(), getString(C17541R$string.cannot_launch_settings), 1).show();
        }
        finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            if (i2 == -1) {
                Uri data = intent.getData();
                getContentResolver().takePersistableUriPermission(data, 3);
                C4878b.m18879r("Taken file access permission: " + data);
            }
        } else if (i == 1 && Settings.canDrawOverlays(this)) {
            for (Macro next : C4934n.m18998M().mo29710z()) {
                Iterator<Trigger> it = next.getTriggerList().iterator();
                while (it.hasNext()) {
                    Trigger next2 = it.next();
                    if (((next2 instanceof FloatingButtonTrigger) || (next2 instanceof SwipeTrigger)) && next.isEnabled()) {
                        next2.mo31543T2();
                        next2.mo31544V2();
                    }
                }
            }
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("permission");
        String stringExtra2 = getIntent().getStringExtra("title");
        int intExtra = getIntent().getIntExtra("special_permission_id", 0);
        if (getIntent().getBooleanExtra("request_file_access", false)) {
            m19278W1();
        } else if (intExtra != 0) {
            m19279X1(intExtra, stringExtra2);
        } else if (stringExtra == null) {
            finish();
        } else if (ContextCompat.checkSelfPermission(this, stringExtra) != 0) {
            ActivityCompat.requestPermissions(this, new String[]{stringExtra}, 34);
        } else {
            C15626c.makeText(getApplicationContext(), C17541R$string.permission_already_enabled, 0).show();
            finish();
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i != 34) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            return;
        }
        if (iArr.length > 0 && iArr[0] != 0) {
            String B = C7439d0.m30855B(strArr[0]);
            Context applicationContext = getApplicationContext();
            C15626c.m94876a(applicationContext, B + " " + getString(C17541R$string.permission_denied), 0).show();
        }
        finish();
    }
}
