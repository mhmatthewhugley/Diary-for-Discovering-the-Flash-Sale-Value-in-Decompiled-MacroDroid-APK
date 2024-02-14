package p112j2;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.events.RefreshEditMacroPageEvent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.permissions.PermissionRequestActivity;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6368b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p161s1.C10180a;
import p215b8.C11102b;
import p319lc.C15626c;
import p440y9.C16971a;

/* renamed from: j2.d0 */
/* compiled from: PermissionsHelper */
public class C7439d0 {

    /* renamed from: a */
    private static final Map<String, Integer> f18216a;

    /* renamed from: b */
    private static final Map<Integer, Integer> f18217b;

    /* renamed from: j2.d0$a */
    /* compiled from: PermissionsHelper */
    class C7440a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AppCompatDialog f18218a;

        /* renamed from: c */
        final /* synthetic */ Activity f18219c;

        /* renamed from: d */
        final /* synthetic */ ComponentName f18220d;

        /* renamed from: f */
        final /* synthetic */ boolean f18221f;

        /* renamed from: g */
        final /* synthetic */ boolean f18222g;

        C7440a(AppCompatDialog appCompatDialog, Activity activity, ComponentName componentName, boolean z, boolean z2) {
            this.f18218a = appCompatDialog;
            this.f18219c = activity;
            this.f18220d = componentName;
            this.f18221f = z;
            this.f18222g = z2;
        }

        public void onClick(View view) {
            this.f18218a.dismiss();
            C7439d0.m30895h0(this.f18219c, this.f18220d, this.f18221f, this.f18222g);
        }
    }

    /* renamed from: j2.d0$b */
    /* compiled from: PermissionsHelper */
    class C7441b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AppCompatDialog f18223a;

        /* renamed from: c */
        final /* synthetic */ boolean f18224c;

        /* renamed from: d */
        final /* synthetic */ Activity f18225d;

        C7441b(AppCompatDialog appCompatDialog, boolean z, Activity activity) {
            this.f18223a = appCompatDialog;
            this.f18224c = z;
            this.f18225d = activity;
        }

        public void onClick(View view) {
            this.f18223a.dismiss();
            if (this.f18224c) {
                this.f18225d.finish();
            }
        }
    }

    /* renamed from: j2.d0$c */
    /* compiled from: PermissionsHelper */
    class C7442c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ Button f18226a;

        C7442c(Button button) {
            this.f18226a = button;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f18226a.setEnabled(z);
        }
    }

    /* renamed from: j2.d0$d */
    /* compiled from: PermissionsHelper */
    class C7443d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AppCompatDialog f18227a;

        /* renamed from: c */
        final /* synthetic */ ComponentName f18228c;

        /* renamed from: d */
        final /* synthetic */ Activity f18229d;

        /* renamed from: f */
        final /* synthetic */ boolean f18230f;

        C7443d(AppCompatDialog appCompatDialog, ComponentName componentName, Activity activity, boolean z) {
            this.f18227a = appCompatDialog;
            this.f18228c = componentName;
            this.f18229d = activity;
            this.f18230f = z;
        }

        public void onClick(View view) {
            this.f18227a.dismiss();
            try {
                Intent intent = new Intent("android.app.action.ADD_DEVICE_ADMIN");
                intent.putExtra("android.app.extra.DEVICE_ADMIN", this.f18228c);
                this.f18229d.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                C15626c.m94876a(this.f18229d.getApplicationContext(), "DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN not supported on this device", 1).show();
            }
            if (this.f18230f) {
                this.f18229d.finish();
            }
        }
    }

    /* renamed from: j2.d0$e */
    /* compiled from: PermissionsHelper */
    class C7444e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AppCompatDialog f18231a;

        /* renamed from: c */
        final /* synthetic */ boolean f18232c;

        /* renamed from: d */
        final /* synthetic */ Activity f18233d;

        C7444e(AppCompatDialog appCompatDialog, boolean z, Activity activity) {
            this.f18231a = appCompatDialog;
            this.f18232c = z;
            this.f18233d = activity;
        }

        public void onClick(View view) {
            this.f18231a.dismiss();
            if (this.f18232c) {
                this.f18233d.finish();
            }
        }
    }

    /* renamed from: j2.d0$f */
    /* compiled from: PermissionsHelper */
    class C7445f implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ Button f18234a;

        C7445f(Button button) {
            this.f18234a = button;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f18234a.setEnabled(z);
        }
    }

    /* renamed from: j2.d0$g */
    /* compiled from: PermissionsHelper */
    class C7446g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f18235a;

        /* renamed from: c */
        final /* synthetic */ boolean f18236c;

        /* renamed from: d */
        final /* synthetic */ boolean f18237d;

        /* renamed from: f */
        final /* synthetic */ AppCompatDialog f18238f;

        C7446g(Activity activity, boolean z, boolean z2, AppCompatDialog appCompatDialog) {
            this.f18235a = activity;
            this.f18236c = z;
            this.f18237d = z2;
            this.f18238f = appCompatDialog;
        }

        public void onClick(View view) {
            C7439d0.m30889e0(this.f18235a, this.f18236c, this.f18237d);
            this.f18238f.dismiss();
        }
    }

    /* renamed from: j2.d0$h */
    /* compiled from: PermissionsHelper */
    class C7447h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f18239a;

        /* renamed from: c */
        final /* synthetic */ AppCompatDialog f18240c;

        /* renamed from: d */
        final /* synthetic */ boolean f18241d;

        C7447h(Activity activity, AppCompatDialog appCompatDialog, boolean z) {
            this.f18239a = activity;
            this.f18240c = appCompatDialog;
            this.f18241d = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ void m30927b(AppCompatDialog appCompatDialog, Activity activity, boolean z, Boolean bool) throws Exception {
            if (bool.booleanValue()) {
                appCompatDialog.dismiss();
                PermissionRequestActivity.m19280Y1(activity);
                if (z) {
                    activity.finish();
                }
            }
        }

        public void onClick(View view) {
            new C11102b((FragmentActivity) this.f18239a).mo62231o("android.permission.RECORD_AUDIO").mo79679I(C16971a.m100210a()).mo79685P(new C13256e0(this.f18240c, this.f18239a, this.f18241d));
        }
    }

    /* renamed from: j2.d0$i */
    /* compiled from: PermissionsHelper */
    class C7448i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AppCompatDialog f18242a;

        /* renamed from: c */
        final /* synthetic */ boolean f18243c;

        /* renamed from: d */
        final /* synthetic */ Activity f18244d;

        C7448i(AppCompatDialog appCompatDialog, boolean z, Activity activity) {
            this.f18242a = appCompatDialog;
            this.f18243c = z;
            this.f18244d = activity;
        }

        public void onClick(View view) {
            this.f18242a.dismiss();
            if (this.f18243c) {
                this.f18244d.finish();
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f18216a = hashMap;
        HashMap hashMap2 = new HashMap();
        f18217b = hashMap2;
        hashMap.put("android.permission.READ_CALENDAR", 8003001);
        hashMap.put("android.permission.WRITE_CALENDAR", 8003002);
        hashMap.put("android.permission.CAMERA", 8003003);
        hashMap.put("android.permission.READ_CONTACTS", 8003004);
        hashMap.put("android.permission.WRITE_CONTACTS", 8003005);
        hashMap.put("android.permission.GET_ACCOUNTS", 8003006);
        hashMap.put("android.permission.ACCESS_FINE_LOCATION", 8003007);
        hashMap.put("android.permission.ACCESS_COARSE_LOCATION", 8003008);
        hashMap.put("android.permission.RECORD_AUDIO", 8003009);
        hashMap.put("android.permission.READ_PHONE_STATE", 8003010);
        hashMap.put("android.permission.CALL_PHONE", 8003011);
        hashMap.put("android.permission.READ_CALL_LOG", 8003012);
        hashMap.put("android.permission.WRITE_CALL_LOG", 8003013);
        hashMap.put("android.permission.USE_SIP", 8003014);
        hashMap.put("android.permission.PROCESS_OUTGOING_CALLS", 8003015);
        hashMap.put("android.permission.BODY_SENSORS", 8003016);
        hashMap.put("android.permission.SEND_SMS", 8003017);
        hashMap.put("android.permission.RECEIVE_SMS", 8003018);
        hashMap.put("android.permission.READ_SMS", 8003019);
        hashMap.put("android.permission.RECEIVE_WAP_PUSH", 8003020);
        hashMap.put("android.permission.RECEIVE_MMS", 8003021);
        hashMap.put("android.permission.READ_EXTERNAL_STORAGE", 8003022);
        hashMap.put("android.permission.WRITE_EXTERNAL_STORAGE", 8003023);
        hashMap2.put(1, 8004001);
        hashMap2.put(2, 8004002);
        hashMap2.put(3, 8004003);
        hashMap2.put(4, 8004004);
        hashMap2.put(5, 8004005);
        hashMap2.put(6, 8004006);
        hashMap2.put(7, 8004007);
        hashMap2.put(8, 8004008);
        hashMap2.put(9, 8004009);
        hashMap2.put(10, 8004010);
        hashMap2.put(11, 8004011);
        hashMap2.put(12, 8003012);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0086  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m30854A(android.app.Activity r10, com.arlosoft.macrodroid.common.SelectableItem r11, boolean r12, boolean r13) {
        /*
            r0 = 1
            if (r10 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            r3 = 0
            if (r1 < r2) goto L_0x005b
            boolean r1 = r11.mo25103u2()
            if (r1 == 0) goto L_0x001d
            boolean r1 = android.provider.Settings.System.canWrite(r10)
            if (r1 != 0) goto L_0x001d
            if (r12 == 0) goto L_0x001c
            m30901k0(r10, r3, r13)
        L_0x001c:
            return r3
        L_0x001d:
            boolean r1 = r11.mo24893h2()
            if (r1 == 0) goto L_0x002f
            boolean r1 = android.provider.Settings.canDrawOverlays(r10)
            if (r1 != 0) goto L_0x002f
            if (r12 == 0) goto L_0x002e
            m30887d0(r10, r3, r13)
        L_0x002e:
            return r3
        L_0x002f:
            boolean r1 = r11.mo24739m2()
            if (r1 == 0) goto L_0x0043
            boolean r1 = com.arlosoft.macrodroid.common.C4031k.m15909i()
            if (r1 != 0) goto L_0x0043
            java.lang.String r11 = r11.mo24738G0()
            m30903l0(r10, r3, r13, r11)
            return r3
        L_0x0043:
            boolean r1 = r11.mo25672e2()
            if (r1 == 0) goto L_0x005b
            java.lang.String r1 = "notification"
            java.lang.Object r1 = r10.getSystemService(r1)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            boolean r1 = r1.isNotificationPolicyAccessGranted()
            if (r1 != 0) goto L_0x005b
            m30917s0(r10, r3, r13)
            return r3
        L_0x005b:
            boolean r1 = r11.mo27866s2()
            if (r1 == 0) goto L_0x008c
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0083 }
            java.lang.String r2 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x0083 }
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r2, r3)     // Catch:{ NameNotFoundException -> 0x0083 }
            java.lang.String r2 = "appops"
            java.lang.Object r2 = r10.getSystemService(r2)     // Catch:{ NameNotFoundException -> 0x0083 }
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2     // Catch:{ NameNotFoundException -> 0x0083 }
            java.lang.String r4 = "android:get_usage_stats"
            int r5 = r1.uid     // Catch:{ NameNotFoundException -> 0x0083 }
            java.lang.String r1 = r1.packageName     // Catch:{ NameNotFoundException -> 0x0083 }
            int r1 = r2.checkOpNoThrow(r4, r5, r1)     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r1 != 0) goto L_0x0083
            r1 = 1
            goto L_0x0084
        L_0x0083:
            r1 = 0
        L_0x0084:
            if (r1 != 0) goto L_0x008c
            if (r12 == 0) goto L_0x008b
            m30919t0(r10, r3, r13)
        L_0x008b:
            return r3
        L_0x008c:
            boolean r1 = r11.mo24749f2()
            if (r1 == 0) goto L_0x00a4
            boolean r1 = com.arlosoft.macrodroid.common.C4061t1.m15992f0(r10)
            if (r1 != 0) goto L_0x00a4
            if (r12 == 0) goto L_0x00a3
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r10
            r9 = r13
            m30883b0(r4, r5, r6, r7, r8, r9)
        L_0x00a3:
            return r3
        L_0x00a4:
            boolean r1 = r11.mo27868t2()
            if (r1 == 0) goto L_0x00bc
            boolean r1 = com.arlosoft.macrodroid.common.C4061t1.m15994g0(r10)
            if (r1 != 0) goto L_0x00bc
            if (r12 == 0) goto L_0x00bb
            r5 = 0
            r6 = 1
            r7 = 0
            r8 = 0
            r4 = r10
            r9 = r13
            m30883b0(r4, r5, r6, r7, r8, r9)
        L_0x00bb:
            return r3
        L_0x00bc:
            boolean r1 = r11.mo27852l2()
            if (r1 == 0) goto L_0x00d4
            boolean r1 = com.arlosoft.macrodroid.common.C4061t1.m15990e0(r10)
            if (r1 != 0) goto L_0x00d4
            if (r12 == 0) goto L_0x00d3
            r5 = 0
            r6 = 0
            r7 = 1
            r8 = 0
            r4 = r10
            r9 = r13
            m30883b0(r4, r5, r6, r7, r8, r9)
        L_0x00d3:
            return r3
        L_0x00d4:
            boolean r1 = r11.mo25499r2()
            if (r1 == 0) goto L_0x00ec
            boolean r1 = com.arlosoft.macrodroid.common.C4061t1.m15996h0(r10)
            if (r1 != 0) goto L_0x00ec
            if (r12 == 0) goto L_0x00eb
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            r4 = r10
            r9 = r13
            m30883b0(r4, r5, r6, r7, r8, r9)
        L_0x00eb:
            return r3
        L_0x00ec:
            boolean r1 = r11.mo24958j2()
            if (r1 == 0) goto L_0x010d
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<com.arlosoft.macrodroid.triggers.receivers.MacroDroidDeviceAdminReceiver> r2 = com.arlosoft.macrodroid.triggers.receivers.MacroDroidDeviceAdminReceiver.class
            r1.<init>(r10, r2)
            java.lang.String r2 = "device_policy"
            java.lang.Object r2 = r10.getSystemService(r2)
            android.app.admin.DevicePolicyManager r2 = (android.app.admin.DevicePolicyManager) r2
            boolean r2 = r2.isAdminActive(r1)
            if (r2 != 0) goto L_0x010d
            if (r12 == 0) goto L_0x010c
            m30893g0(r10, r1, r3, r13)
        L_0x010c:
            return r3
        L_0x010d:
            boolean r1 = r11.mo24773q2()
            if (r1 == 0) goto L_0x0133
            android.content.ContentResolver r1 = r10.getContentResolver()
            java.lang.String r2 = "enabled_notification_listeners"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r2)
            if (r1 == 0) goto L_0x012d
            com.arlosoft.macrodroid.app.MacroDroidApplication r2 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            java.lang.String r2 = r2.getPackageName()
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x0133
        L_0x012d:
            if (r12 == 0) goto L_0x0132
            m30915r0(r10, r3, r13)
        L_0x0132:
            return r3
        L_0x0133:
            boolean r1 = r11 instanceof com.arlosoft.macrodroid.action.FileOperationV21Action
            if (r1 == 0) goto L_0x01a9
            r1 = r11
            com.arlosoft.macrodroid.action.FileOperationV21Action r1 = (com.arlosoft.macrodroid.action.FileOperationV21Action) r1     // Catch:{ Exception -> 0x0194 }
            java.lang.String r1 = r1.mo25047A3()     // Catch:{ Exception -> 0x0194 }
            r2 = r11
            com.arlosoft.macrodroid.action.FileOperationV21Action r2 = (com.arlosoft.macrodroid.action.FileOperationV21Action) r2     // Catch:{ Exception -> 0x0194 }
            java.lang.String r2 = r2.mo25048C3()     // Catch:{ Exception -> 0x0194 }
            r4 = 0
            if (r1 == 0) goto L_0x0151
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x0194 }
            androidx.documentfile.provider.DocumentFile r1 = androidx.documentfile.provider.DocumentFile.fromTreeUri(r10, r1)     // Catch:{ Exception -> 0x0194 }
            goto L_0x0152
        L_0x0151:
            r1 = r4
        L_0x0152:
            if (r2 == 0) goto L_0x015c
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x0194 }
            androidx.documentfile.provider.DocumentFile r4 = androidx.documentfile.provider.DocumentFile.fromTreeUri(r10, r2)     // Catch:{ Exception -> 0x0194 }
        L_0x015c:
            if (r1 == 0) goto L_0x016a
            boolean r2 = r1.canRead()     // Catch:{ Exception -> 0x0194 }
            if (r2 == 0) goto L_0x0172
            boolean r1 = r1.canWrite()     // Catch:{ Exception -> 0x0194 }
            if (r1 == 0) goto L_0x0172
        L_0x016a:
            if (r4 == 0) goto L_0x01a9
            boolean r1 = r4.canWrite()     // Catch:{ Exception -> 0x0194 }
            if (r1 != 0) goto L_0x01a9
        L_0x0172:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0194 }
            r1.<init>()     // Catch:{ Exception -> 0x0194 }
            java.lang.String r2 = "File acccess issue with: "
            r1.append(r2)     // Catch:{ Exception -> 0x0194 }
            java.lang.String r2 = r11.mo25559a1()     // Catch:{ Exception -> 0x0194 }
            r1.append(r2)     // Catch:{ Exception -> 0x0194 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0194 }
            com.arlosoft.macrodroid.macro.Macro r2 = r11.mo27837X0()     // Catch:{ Exception -> 0x0194 }
            int r2 = r2.getId()     // Catch:{ Exception -> 0x0194 }
            long r4 = (long) r2     // Catch:{ Exception -> 0x0194 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r1, r4)     // Catch:{ Exception -> 0x0194 }
            goto L_0x01a9
        L_0x0194:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Error checking for file access requirement: "
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r1)
        L_0x01a9:
            boolean r1 = r11.mo25569i2()
            if (r1 == 0) goto L_0x01c1
            boolean r1 = com.arlosoft.macrodroid.settings.C5163j2.m20215n0(r10)
            if (r1 != 0) goto L_0x01c1
            boolean r1 = com.arlosoft.macrodroid.common.C4031k.m15908h(r10)
            if (r1 != 0) goto L_0x01c1
            if (r12 == 0) goto L_0x01c0
            m30891f0(r10, r3, r13)
        L_0x01c0:
            return r3
        L_0x01c1:
            int r12 = com.arlosoft.macrodroid.common.C4031k.m15904d()
            boolean r12 = r11.mo27858o2(r12)
            if (r12 == 0) goto L_0x01d9
            boolean r12 = r11.mo25765T()
            if (r12 != 0) goto L_0x01d9
            java.lang.String r11 = r11.mo24738G0()
            m30903l0(r10, r3, r13, r11)
            return r3
        L_0x01d9:
            boolean r12 = r11.mo27851k2()
            if (r12 == 0) goto L_0x01eb
            java.lang.String r12 = "android.permission.ACCESS_FINE_LOCATION"
            int r12 = androidx.core.content.ContextCompat.checkSelfPermission(r10, r12)
            if (r12 == 0) goto L_0x01eb
            m30897i0(r10, r11, r3)
            return r3
        L_0x01eb:
            boolean r12 = r11.mo27851k2()
            if (r12 == 0) goto L_0x01fd
            java.lang.String r12 = "android.permission.ACCESS_COARSE_LOCATION"
            int r12 = androidx.core.content.ContextCompat.checkSelfPermission(r10, r12)
            if (r12 == 0) goto L_0x01fd
            m30897i0(r10, r11, r3)
            return r3
        L_0x01fd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p112j2.C7439d0.m30854A(android.app.Activity, com.arlosoft.macrodroid.common.SelectableItem, boolean, boolean):boolean");
    }

    /* renamed from: B */
    public static String m30855B(String str) {
        return str.contains(".") ? str.substring(str.lastIndexOf(".") + 1) : str;
    }

    /* renamed from: C */
    public static void m30856C(SelectableItem selectableItem, String[] strArr, int[] iArr) {
        for (int i : iArr) {
            if (i != 0) {
                selectableItem.mo27838X1(strArr, iArr);
                return;
            }
        }
        selectableItem.mo27841a2();
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static /* synthetic */ void m30857D(Activity activity, boolean z, DialogInterface dialogInterface, int i) {
        try {
            activity.startActivityForResult(new Intent("android.settings.ACCESSIBILITY_SETTINGS"), 0);
        } catch (Exception unused) {
            C15626c.m94876a(activity.getApplicationContext(), activity.getString(C17541R$string.cannot_launch_accessibility_settings), 1).show();
        }
        if (z) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static /* synthetic */ void m30858E(boolean z, Activity activity, DialogInterface dialogInterface, int i) {
        if (z) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static /* synthetic */ void m30859F(SelectableItem selectableItem, Boolean bool) throws Exception {
        if (bool.booleanValue() && selectableItem != null) {
            selectableItem.mo25540W1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static /* synthetic */ void m30860G(Activity activity, boolean z, DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse("package:com.arlosoft.macrodroid"));
        try {
            activity.startActivityForResult(intent, 1);
        } catch (Exception unused) {
            C15626c.m94876a(activity.getApplicationContext(), activity.getString(C17541R$string.cannot_launch_settings), 1).show();
        }
        if (z) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static /* synthetic */ void m30861H(boolean z, Activity activity, DialogInterface dialogInterface, int i) {
        if (z) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static /* synthetic */ void m30862I(Activity activity, boolean z, DialogInterface dialogInterface, int i) {
        C5163j2.m20131c4(activity, true);
        C10180a.m40075a().mo80018i(new RefreshEditMacroPageEvent());
        if (z) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static /* synthetic */ void m30863J(boolean z, Activity activity, DialogInterface dialogInterface, int i) {
        if (z) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static /* synthetic */ void m30864K(SelectableItem selectableItem, Activity activity, Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (selectableItem != null) {
                selectableItem.mo25540W1();
            }
            m30885c0(activity, selectableItem);
        } else if (selectableItem != null) {
            selectableItem.mo25540W1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static /* synthetic */ void m30865L(SelectableItem selectableItem, Activity activity, boolean z, DialogInterface dialogInterface, int i) {
        String[] strArr = {"android.permission.ACCESS_FINE_LOCATION"};
        if (selectableItem != null) {
            strArr = selectableItem.mo24700e1();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str.equals("android.permission.ACCESS_FINE_LOCATION") || str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                arrayList.add(str);
            }
        }
        new C11102b((FragmentActivity) activity).mo62231o((String[]) arrayList.toArray(new String[0])).mo79679I(C16971a.m100210a()).mo79685P(new C13272u(selectableItem, activity));
        if (z) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static /* synthetic */ void m30866M(boolean z, Activity activity, DialogInterface dialogInterface, int i) {
        if (z) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static /* synthetic */ void m30867N(Activity activity, boolean z, DialogInterface dialogInterface, int i) {
        try {
            activity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } catch (ActivityNotFoundException unused) {
            C15626c.m94876a(activity.getApplicationContext(), "DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN not supported on this device", 1).show();
        }
        if (z) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public static /* synthetic */ void m30868O(boolean z, Activity activity, DialogInterface dialogInterface, int i) {
        if (z) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public static /* synthetic */ void m30869P(Activity activity, boolean z, DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(Uri.parse("package:com.arlosoft.macrodroid"));
        intent.addFlags(268435456);
        try {
            activity.startActivity(intent);
            if (z) {
                activity.finish();
            }
        } catch (Exception unused) {
            C15626c.m94876a(activity.getApplicationContext(), activity.getString(C17541R$string.cannot_launch_settings), 1).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public static /* synthetic */ void m30870Q(boolean z, Activity activity, DialogInterface dialogInterface, int i) {
        if (z) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public static /* synthetic */ void m30871R(Activity activity, DialogInterface dialogInterface, int i) {
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://macrodroidforum.com/index.php?threads/macrodroid-helper-apk.1/")));
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public static /* synthetic */ void m30872S(boolean z, Activity activity, DialogInterface dialogInterface, int i) {
        if (z) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public static /* synthetic */ void m30873T(Activity activity, DialogInterface dialogInterface, int i) {
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://macrodroidforum.com/index.php?threads/macrodroid-helper-apk.1/")));
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public static /* synthetic */ void m30874U(Activity activity, boolean z, DialogInterface dialogInterface, int i) {
        try {
            activity.startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
        } catch (Exception unused) {
            C15626c.m94876a(activity.getApplicationContext(), activity.getString(C17541R$string.cannot_launch_notification_settings), 1).show();
        }
        if (z) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public static /* synthetic */ void m30875V(boolean z, Activity activity, DialogInterface dialogInterface, int i) {
        if (z) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public static /* synthetic */ void m30876W(Activity activity, boolean z, DialogInterface dialogInterface, int i) {
        try {
            activity.startActivity(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"));
        } catch (Exception unused) {
            C15626c.m94876a(activity.getApplicationContext(), activity.getString(C17541R$string.cannot_launch_notification_settings), 1).show();
        }
        if (z) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public static /* synthetic */ void m30877X(boolean z, Activity activity, DialogInterface dialogInterface, int i) {
        if (z) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public static /* synthetic */ void m30878Y(Activity activity, boolean z, DialogInterface dialogInterface, int i) {
        C5163j2.m20139d4(activity, true);
        if (z) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public static /* synthetic */ void m30879Z(Activity activity, boolean z, DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
        intent.addFlags(268435456);
        try {
            activity.startActivityForResult(intent, 0);
        } catch (Exception unused) {
            C15626c.m94876a(activity.getApplicationContext(), activity.getString(C17541R$string.cannot_launch_accessibility_settings), 1).show();
        }
        if (z) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public static /* synthetic */ void m30881a0(boolean z, Activity activity, DialogInterface dialogInterface, int i) {
        if (z) {
            activity.finish();
        }
    }

    /* renamed from: b0 */
    public static void m30883b0(Activity activity, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.accessibility_required);
        if (z2) {
            String str = activity.getString(C17541R$string.accessibility_volume_description) + "\n\n" + activity.getString(C17541R$string.accessibility_service_detail_volume_button_monitor);
            if (Build.MANUFACTURER.equalsIgnoreCase("xiaomi")) {
                str = str + "\n\n" + activity.getString(C17541R$string.xiaomi_accessibility_warning);
            }
            builder.setMessage((CharSequence) str);
        } else if (z3) {
            builder.setMessage((CharSequence) activity.getString(C17541R$string.accessibility_fingerprint_description) + "\n\n" + activity.getString(C17541R$string.accessibility_service_detail_finger_print_gesture_detector));
        } else if (z4) {
            String str2 = activity.getString(C17541R$string.accessibility_ui_interaction_description) + "\n\n" + activity.getString(C17541R$string.accessibility_service_detail_ui_interaction);
            if (Build.MANUFACTURER.equalsIgnoreCase("xiaomi")) {
                str2 = str2 + "\n\n" + activity.getString(C17541R$string.xiaomi_accessibility_warning);
            }
            builder.setMessage((CharSequence) str2);
        } else {
            builder.setMessage((CharSequence) activity.getString(C17541R$string.accessibility_description) + "\n\n" + activity.getString(C17541R$string.accessibility_service_detail_main));
        }
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C13276y(activity, z));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C13266o(z5, activity));
        builder.setCancelable(false);
        AlertDialog show = builder.show();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(show.getWindow().getAttributes());
        layoutParams.width = -1;
        show.getWindow().setAttributes(layoutParams);
    }

    /* renamed from: c0 */
    public static void m30885c0(Activity activity, SelectableItem selectableItem) {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            new C11102b((FragmentActivity) activity).mo62231o("android.permission.ACCESS_BACKGROUND_LOCATION").mo79679I(C16971a.m100210a()).mo79685P(new C13271t(selectableItem));
            return;
        }
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + activity.getPackageName()));
            activity.startActivity(intent);
            C15626c.makeText(activity.getApplicationContext(), C17541R$string.navigate_to_location_permissions_and_allow_all_the_time, 1).show();
        } catch (ActivityNotFoundException unused) {
            C15626c.m94876a(activity.getApplicationContext(), "android.settings.APPLICATION_DETAILS_SETTINGS not supported on this device", 1).show();
        }
    }

    /* renamed from: d0 */
    public static void m30887d0(Activity activity, boolean z, boolean z2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.requires_draw_overlays);
        builder.setMessage((int) C17541R$string.requires_draw_overlays_details);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C13253c0(activity, z));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C13265n(z2, activity));
        builder.setCancelable(false);
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public static void m30889e0(Activity activity, boolean z, boolean z2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.are_you_sure);
        builder.setMessage((int) C17541R$string.already_enabled_default_assist_app_confirm);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C13251b0(activity, z));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C13262k(z2, activity));
        builder.setCancelable(false);
        builder.create().show();
    }

    /* renamed from: f0 */
    public static void m30891f0(Activity activity, boolean z, boolean z2) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(activity, C17542R$style.Theme_App_Dialog);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_default_assist_warning);
        appCompatDialog.setTitle((int) C17541R$string.permission_required);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.alreadyConfiguredText);
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        textView.setOnClickListener(new C7446g(activity, z, z2, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C7447h(activity, appCompatDialog, z));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C7448i(appCompatDialog, z2, activity));
        appCompatDialog.show();
    }

    /* renamed from: g0 */
    public static void m30893g0(Activity activity, ComponentName componentName, boolean z, boolean z2) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(activity, C17542R$style.Theme_App_Dialog);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_device_admin_warning);
        appCompatDialog.setTitle((int) C17541R$string.required_device_administrator);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        button.setEnabled(false);
        button.setOnClickListener(new C7440a(appCompatDialog, activity, componentName, z, z2));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C7441b(appCompatDialog, z2, activity));
        ((CheckBox) appCompatDialog.findViewById(C17532R$id.confirmReadCheckbox)).setOnCheckedChangeListener(new C7442c(button));
        appCompatDialog.show();
    }

    /* renamed from: h0 */
    public static void m30895h0(Activity activity, ComponentName componentName, boolean z, boolean z2) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(activity);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_device_admin_warning_2);
        appCompatDialog.setTitle((int) C17541R$string.required_device_administrator);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        button.setEnabled(false);
        button.setOnClickListener(new C7443d(appCompatDialog, componentName, activity, z));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C7444e(appCompatDialog, z2, activity));
        ((CheckBox) appCompatDialog.findViewById(C17532R$id.confirmReadCheckbox)).setOnCheckedChangeListener(new C7445f(button));
        appCompatDialog.show();
    }

    /* renamed from: i0 */
    public static void m30897i0(Activity activity, @Nullable SelectableItem selectableItem, boolean z) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.location_permission_required);
        builder.setMessage((int) C17541R$string.location_data_use_disclosure);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C13259h(selectableItem, activity, z));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C13267p(z, activity));
        builder.setCancelable(false);
        builder.create().show();
    }

    /* renamed from: j0 */
    public static void m30899j0(Activity activity, boolean z, boolean z2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.location_services_disabled);
        builder.setMessage((int) C17541R$string.location_service_must_be_enabled);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C13249a0(activity, z));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C13260i(z2, activity));
        builder.setCancelable(false);
        builder.create().show();
    }

    /* renamed from: k0 */
    public static void m30901k0(Activity activity, boolean z, boolean z2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.requires_write_settings);
        builder.setMessage((int) C17541R$string.requires_write_settings_details);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C13273v(activity, z));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C13261j(z2, activity));
        builder.setCancelable(false);
        builder.create().show();
    }

    /* renamed from: l0 */
    public static void m30903l0(Activity activity, boolean z, boolean z2, String str) {
        m30905m0(activity, z, z2, str, (String) null);
    }

    /* renamed from: m0 */
    public static void m30905m0(Activity activity, boolean z, boolean z2, String str, String str2) {
        if (activity != null) {
            if (!(activity instanceof MacroDroidBaseActivity) || !((MacroDroidBaseActivity) activity).mo27315N1()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(activity, C17542R$style.Theme_App_Dialog);
                builder.setTitle((CharSequence) str);
                if (str2 == null) {
                    builder.setMessage((CharSequence) String.format(activity.getString(C17541R$string.feature_requires_helper_file), new Object[]{"https://macrodroidforum.com/index.php?threads/macrodroid-helper-apk.1/"}));
                } else {
                    builder.setMessage((CharSequence) str2);
                }
                builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C13268q(activity));
                builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C13263l(z2, activity));
                builder.setCancelable(false);
                AlertDialog create = builder.create();
                create.show();
                TextView textView = (TextView) create.findViewById(16908299);
                Linkify.addLinks(textView, 15);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    /* renamed from: n0 */
    public static void m30907n0(Activity activity, String str, DialogInterface.OnClickListener onClickListener) {
        if (activity != null) {
            if (!(activity instanceof MacroDroidBaseActivity) || !((MacroDroidBaseActivity) activity).mo27315N1()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(activity, C17542R$style.Theme_App_Dialog);
                builder.setTitle((CharSequence) str);
                builder.setMessage((CharSequence) String.format(activity.getString(C17541R$string.feature_requires_helper_file_wifi_ssids), new Object[]{"https://macrodroidforum.com/index.php?threads/macrodroid-helper-apk.1/"}));
                builder.setPositiveButton((int) C17541R$string.pebble_info_button_continue, onClickListener);
                builder.setNeutralButton((int) C17541R$string.get_helper_file, (DialogInterface.OnClickListener) new C13257f(activity));
                builder.setCancelable(false);
                AlertDialog create = builder.create();
                create.show();
                TextView textView = (TextView) create.findViewById(16908299);
                Linkify.addLinks(textView, 15);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    /* renamed from: o0 */
    public static void m30909o0(Context context, String str, String str2, boolean z, boolean z2) {
        if (context != null) {
            String B = m30855B(str);
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2 == null ? context.getString(C17541R$string.macrodroid) : str2);
                sb.append(" ");
                sb.append(context.getString(C17541R$string.requires));
                sb.append(" ");
                sb.append(B);
                sb.append(" ");
                sb.append(context.getString(C17541R$string.permission));
                String sb2 = sb.toString();
                Integer num = f18216a.get(str);
                if (num == null) {
                    num = 8003000;
                }
                Intent intent = new Intent(context, PermissionRequestActivity.class);
                intent.putExtra("permission", str);
                intent.putExtra("title", str2);
                PendingIntent activity = PendingIntent.getActivity(context, num.intValue(), intent, 268435456 | C6368b1.f14959b);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
                builder.setContentTitle(context.getString(C17541R$string.macrodroid_requires_permission)).setWhen(System.currentTimeMillis()).setContentText(sb2).setContentIntent(activity).setSmallIcon((int) C17530R$drawable.ic_warning_white_24dp).setAutoCancel(true).setColor(ContextCompat.getColor(context, 2131100777)).setStyle(new NotificationCompat.BigTextStyle().bigText(sb2)).setChannelId("vital_functionality");
                ((NotificationManager) context.getSystemService("notification")).notify(num.intValue(), builder.build());
            }
        }
    }

    /* renamed from: p0 */
    public static void m30911p0(Context context, String str, int i) {
        m30913q0(context, str, i, (String) null);
    }

    /* renamed from: q0 */
    public static void m30913q0(Context context, String str, int i, @Nullable String str2) {
        if (context != null) {
            String string = context.getString(C17541R$string.macrodroid_requires_permission);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" - ");
            switch (i) {
                case 1:
                    sb.append(context.getString(C17541R$string.requires_write_settings));
                    break;
                case 2:
                    sb.append(context.getString(C17541R$string.requires_draw_overlays));
                    break;
                case 3:
                    sb.append(context.getString(C17541R$string.usage_access_required));
                    break;
                case 4:
                case 8:
                case 9:
                case 10:
                    sb.append(context.getString(C17541R$string.accessibility_required));
                    break;
                case 5:
                    sb.append(context.getString(C17541R$string.required_device_administrator));
                    break;
                case 6:
                    sb.append(context.getString(C17541R$string.notification_access_required));
                    break;
                case 7:
                    sb.append(context.getString(C17541R$string.do_not_disturb_access));
                    break;
                case 11:
                    if (C5163j2.m20014M1(context)) {
                        string = context.getString(C17541R$string.location_services_disabled);
                        sb.append(context.getString(C17541R$string.location_service_must_be_enabled));
                        break;
                    } else {
                        return;
                    }
                case 12:
                    sb.append(context.getString(C17541R$string.requires_assist_and_voice_input));
                    break;
                case 13:
                    sb.append(context.getString(C17541R$string.helper_apk_required));
                    string = context.getString(C17541R$string.helper_apk_required) + " (" + str2 + "+)";
                    break;
                case 14:
                    sb.append(context.getString(C17541R$string.background_location_access_required_detail));
                    string = context.getString(C17541R$string.background_location_access_required_title);
                    break;
            }
            Integer num = f18217b.get(Integer.valueOf(i));
            if (num == null) {
                num = 8003000;
            }
            Intent intent = new Intent(context, PermissionRequestActivity.class);
            intent.putExtra("special_permission_id", i);
            intent.putExtra("title", str);
            PendingIntent activity = PendingIntent.getActivity(context, num.intValue(), intent, 134217728 | C6368b1.f14959b);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
            String sb2 = sb.toString();
            builder.setContentTitle(string).setWhen(System.currentTimeMillis()).setContentText(sb2).setContentIntent(activity).setSmallIcon((int) C17530R$drawable.ic_warning_white_24dp).setAutoCancel(true).setColor(ContextCompat.getColor(context, 2131100777)).setStyle(new NotificationCompat.BigTextStyle().bigText(sb2)).setChannelId("vital_functionality");
            ((NotificationManager) context.getSystemService("notification")).notify(num.intValue(), builder.build());
            C4878b.m18868g(sb2);
        }
    }

    /* renamed from: r0 */
    public static void m30915r0(Activity activity, boolean z, boolean z2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.notification_access_required);
        builder.setMessage((int) C17541R$string.notification_access_description);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C13274w(activity, z));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C13270s(z2, activity));
        builder.setCancelable(false);
        builder.create().show();
    }

    /* renamed from: s0 */
    public static void m30917s0(Activity activity, boolean z, boolean z2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.permission_required);
        builder.setMessage((int) C17541R$string.do_not_disturb_access);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C13275x(activity, z));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C13269r(z2, activity));
        builder.setNeutralButton((int) C17541R$string.ignore, (DialogInterface.OnClickListener) new C13277z(activity, z2));
        builder.setCancelable(false);
        builder.create().show();
    }

    /* renamed from: t0 */
    public static void m30919t0(Activity activity, boolean z, boolean z2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.usage_access_required);
        builder.setMessage((int) C17541R$string.usage_access_required_description);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C13258g(activity, z));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C13264m(z2, activity));
        builder.setCancelable(false);
        builder.create().show();
    }

    /* renamed from: z */
    public static boolean m30925z(Context context, SelectableItem selectableItem, boolean z) {
        String[] strArr;
        if (z) {
            strArr = selectableItem.mo24826d1();
        } else {
            strArr = selectableItem.mo24700e1();
        }
        if (!(strArr == null || strArr.length == 0)) {
            for (String checkSelfPermission : strArr) {
                if (ContextCompat.checkSelfPermission(context, checkSelfPermission) != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
