package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.widget.Button;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4022j;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.zip.GZIPInputStream;
import p128m0.C7867w1;
import p319lc.C15626c;

public class LaunchShortcutAction extends Action {
    public static final Parcelable.Creator<LaunchShortcutAction> CREATOR = new C2519a();
    private static final int PICK_SHORTCUT_REQUEST_CODE = 124;
    private String m_appName;
    protected Intent m_intent;
    private String m_intentEncoded;
    protected String m_name;
    private transient Button m_okButton;
    private transient int m_selectedIndex;
    private String m_serializedExtras;

    /* renamed from: com.arlosoft.macrodroid.action.LaunchShortcutAction$a */
    class C2519a implements Parcelable.Creator<LaunchShortcutAction> {
        C2519a() {
        }

        /* renamed from: a */
        public LaunchShortcutAction createFromParcel(Parcel parcel) {
            return new LaunchShortcutAction(parcel);
        }

        /* renamed from: b */
        public LaunchShortcutAction[] newArray(int i) {
            return new LaunchShortcutAction[i];
        }
    }

    public LaunchShortcutAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    /* renamed from: o3 */
    private Bundle m11241o3(String str) {
        Bundle bundle;
        Parcel obtain = Parcel.obtain();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
            while (true) {
                int read = gZIPInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            gZIPInputStream.close();
            obtain.unmarshall(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
            obtain.setDataPosition(0);
            bundle = obtain.readBundle();
        } catch (IOException e) {
            e.printStackTrace();
            bundle = null;
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
        obtain.recycle();
        return bundle;
    }

    /* renamed from: p3 */
    private String m11242p3() {
        try {
            String str = this.m_intentEncoded;
            return str.substring(str.indexOf("component=") + 10, this.m_intentEncoded.indexOf("/"));
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m11243q3(DialogInterface dialogInterface, int i) {
        this.m_selectedIndex = i;
        Button button = this.m_okButton;
        if (button != null) {
            button.setEnabled(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m11244r3(DialogInterface dialogInterface, int i) {
        mo24706w1();
        this.m_okButton = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public /* synthetic */ void m11245s3(List list, Activity activity, String[] strArr, DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.intent.action.CREATE_SHORTCUT");
        ActivityInfo activityInfo = ((ResolveInfo) list.get(this.m_selectedIndex)).activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        try {
            activity.startActivityForResult(intent, 124);
        } catch (Exception unused) {
            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.error, 0).show();
        }
        this.m_appName = strArr[this.m_selectedIndex];
        this.m_okButton = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void m11246t3(DialogInterface dialogInterface) {
        this.m_okButton = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m11247u3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(C17541R$string.action_launch_shortcut) + " " + this.m_appName;
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return (this.m_intent == null && this.m_intentEncoded == null) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo24938N0() {
        /*
            r6 = this;
            android.content.Intent r0 = r6.m_intent
            r1 = 0
            java.lang.String r2 = r6.m_intentEncoded     // Catch:{ Exception -> 0x004d }
            if (r2 == 0) goto L_0x000b
            android.content.Intent r0 = android.content.Intent.getIntent(r2)     // Catch:{ Exception -> 0x004d }
        L_0x000b:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0037
            java.lang.String r4 = r6.m_serializedExtras     // Catch:{ Exception -> 0x004d }
            if (r4 == 0) goto L_0x001c
            android.os.Bundle r4 = r6.m11241o3(r4)     // Catch:{ Exception -> 0x004d }
            if (r4 == 0) goto L_0x001c
            r0.putExtras(r4)     // Catch:{ Exception -> 0x004d }
        L_0x001c:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r4)     // Catch:{ Exception -> 0x004d }
            android.content.Context r4 = r6.mo27827K0()     // Catch:{ Exception -> 0x004d }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ Exception -> 0x004d }
            r5 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r4.queryIntentActivities(r0, r5)     // Catch:{ Exception -> 0x004d }
            int r0 = r0.size()     // Catch:{ Exception -> 0x004d }
            if (r0 <= 0) goto L_0x0037
            r0 = 1
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            if (r0 == 0) goto L_0x003b
            return r1
        L_0x003b:
            r0 = 2131954721(0x7f130c21, float:1.954595E38)
            java.lang.String r0 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r0)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = r6.m_appName
            r1[r3] = r2
            java.lang.String r0 = java.lang.String.format(r0, r1)
            return r0
        L_0x004d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.LaunchShortcutAction.mo24938N0():java.lang.String");
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_name;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7867w1.m32909u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        Bundle o3;
        try {
            Intent intent = this.m_intent;
            String str = this.m_intentEncoded;
            if (str != null) {
                intent = Intent.getIntent(str);
            }
            if (intent != null) {
                String str2 = this.m_serializedExtras;
                if (!(str2 == null || (o3 = m11241o3(str2)) == null)) {
                    intent.putExtras(o3);
                }
                intent.addFlags(268435456);
                mo27827K0().startActivity(intent);
                return;
            }
            Context K0 = mo27827K0();
            C4061t1.m16023v(K0, SelectableItem.m15535j1(C17541R$string.action_launch_failed_to_launch) + " " + this.m_name, SelectableItem.m15535j1(C17541R$string.action_launch_shortcut_been_removed), false);
        } catch (SecurityException e) {
            C4878b.m18869h("Failed to launch shortcut, MacroDroid may need a permission: " + e.toString(), mo27840Y0().longValue());
            C15626c.m94876a(mo27827K0().getApplicationContext(), e.toString(), 1).show();
        } catch (Exception unused) {
            Context K02 = mo27827K0();
            C4061t1.m16023v(K02, SelectableItem.m15535j1(C17541R$string.action_launch_failed_to_launch) + this.m_name, SelectableItem.m15535j1(C17541R$string.action_launch_shortcut_could_not_start), false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return SelectableItem.m15535j1(C17541R$string.action_launch_shortcut_select);
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo24738G0() + ": " + this.m_name;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i == 124 && i2 == -1) {
            Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.shortcut.INTENT");
            this.m_name = intent.getStringExtra("android.intent.extra.shortcut.NAME");
            if (intent2 != null) {
                this.m_intentEncoded = intent2.toURI();
                mo24689O1();
                return;
            }
            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.shortcut_not_compatible, 0).show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        PackageManager packageManager = j0.getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.CREATE_SHORTCUT"), 0);
        Collections.sort(queryIntentActivities, new ResolveInfo.DisplayNameComparator(packageManager));
        String[] strArr = new String[queryIntentActivities.size()];
        for (int i = 0; i < queryIntentActivities.size(); i++) {
            strArr[i] = queryIntentActivities.get(i).loadLabel(packageManager).toString();
        }
        C4022j jVar = new C4022j(new ContextThemeWrapper((Context) j0, mo24705l0()), C17535R$layout.application_item, queryIntentActivities, new C3053f8(this));
        AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((ListAdapter) jVar, 0, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C3081g8(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3109h8(this, queryIntentActivities, j0, strArr));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C3024e8(this));
        Button button = create.getButton(-1);
        this.m_okButton = button;
        button.setEnabled(false);
        create.setOnCancelListener(new C2995d8(this));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_name);
        parcel.writeString(this.m_appName);
        parcel.writeParcelable(this.m_intent, i);
        parcel.writeString(this.m_serializedExtras);
        parcel.writeString(this.m_intentEncoded);
    }

    /* renamed from: x1 */
    public void mo25283x1() {
        String p3 = m11242p3();
        if (p3 != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + p3));
                intent.addFlags(268435456);
                mo27827K0().startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + p3));
                intent2.addFlags(268435456);
                mo27827K0().startActivity(intent2);
            }
        }
    }

    LaunchShortcutAction() {
    }

    protected LaunchShortcutAction(Parcel parcel) {
        super(parcel);
        this.m_name = parcel.readString();
        this.m_appName = parcel.readString();
        this.m_intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.m_serializedExtras = parcel.readString();
        this.m_intentEncoded = parcel.readString();
    }
}
