package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.utils.C6420q1;
import com.arlosoft.macrodroid.utils.C6435t0;
import java.io.File;
import java.util.Collections;
import java.util.List;
import p128m0.C7763i2;
import p319lc.C15626c;

public class OpenFileAction extends FileSelectionAction {
    private static final int ANDROID_5_PICKER_ID = 1067;
    public static final Parcelable.Creator<OpenFileAction> CREATOR = new C2556a();
    private String m_appName;
    private String m_className;
    private String m_fileDisplayName;
    private String m_fileUri;
    private transient C6435t0 m_mimeTypes;
    private String m_packageName;

    /* renamed from: com.arlosoft.macrodroid.action.OpenFileAction$a */
    class C2556a implements Parcelable.Creator<OpenFileAction> {
        C2556a() {
        }

        /* renamed from: a */
        public OpenFileAction createFromParcel(Parcel parcel) {
            return new OpenFileAction(parcel, (C2556a) null);
        }

        /* renamed from: b */
        public OpenFileAction[] newArray(int i) {
            return new OpenFileAction[i];
        }
    }

    /* synthetic */ OpenFileAction(Parcel parcel, C2556a aVar) {
        this(parcel);
    }

    /* renamed from: D1 */
    private void m11642D1() {
        this.m_mimeTypes = new C6435t0();
    }

    /* renamed from: n3 */
    private Intent m11647n3(boolean z) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(268435456);
        if (z) {
            intent.setClassName(this.m_packageName, this.m_className);
        } else {
            intent.setPackage(this.m_packageName);
        }
        if (this.m_filePath != null) {
            File file = new File(this.m_filePath);
            intent.setDataAndType(Uri.fromFile(file), this.m_mimeTypes.mo32493a(this.m_filePath));
        } else {
            intent.setDataAndType(Uri.parse(this.m_fileUri), this.m_mimeTypes.mo32493a(this.m_fileUri));
            intent.setData(Uri.parse(this.m_fileUri));
            intent.addFlags(1);
        }
        return intent;
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m11648o3(List list, String[] strArr, DialogInterface dialogInterface, int i) {
        this.m_packageName = ((ResolveInfo) list.get(i)).activityInfo.packageName;
        this.m_className = ((ResolveInfo) list.get(i)).activityInfo.name;
        this.m_appName = strArr[i];
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void m11649p3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m11650q3(DialogInterface dialogInterface, int i) {
        mo24677v2();
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m11651r3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (!TextUtils.isEmpty(this.m_fileDisplayName)) {
            return SelectableItem.m15535j1(C17541R$string.action_open_file) + ": " + this.m_fileDisplayName;
        } else if (this.m_fileUri != null) {
            return SelectableItem.m15535j1(C17541R$string.action_open_file) + ": " + this.m_fileUri;
        } else {
            String str = this.m_filePath;
            if (str == null) {
                return SelectableItem.m15535j1(C17541R$string.error);
            }
            if (str.contains("/")) {
                StringBuilder sb = new StringBuilder();
                sb.append(SelectableItem.m15535j1(C17541R$string.action_open_file));
                sb.append(": ");
                String str2 = this.m_filePath;
                sb.append(str2.substring(str2.lastIndexOf(47) + 1));
                return sb.toString();
            }
            return SelectableItem.m15535j1(C17541R$string.action_open_file) + ": " + this.m_filePath;
        }
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return (this.m_fileUri == null && (this.m_packageName == null || this.m_className == null || this.m_appName == null)) ? false : true;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_appName;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7763i2.m32409u();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|6|7|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        com.arlosoft.macrodroid.logging.systemlog.C4878b.m18871j("Open File Failed", "Could not launch " + r4.m_appName + ": " + r5.toString());
        r5 = mo27827K0();
        r3 = new java.lang.StringBuilder();
        r3.append("Could not launch ");
        r3.append(r4.m_appName);
        com.arlosoft.macrodroid.common.C4061t1.m16023v(r5, "Open File Failed", r3.toString(), false);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0026 */
    /* renamed from: a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo r5) {
        /*
            r4 = this;
            android.content.Context r5 = r4.mo27827K0()
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            int r5 = androidx.core.content.ContextCompat.checkSelfPermission(r5, r0)
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L_0x001a
            android.content.Context r5 = r4.mo27827K0()
            java.lang.String r3 = r4.mo25559a1()
            p112j2.C7439d0.m30909o0(r5, r0, r3, r1, r2)
            return
        L_0x001a:
            android.content.Intent r5 = r4.m11647n3(r1)     // Catch:{ Exception -> 0x0026 }
            android.content.Context r0 = r4.mo27827K0()     // Catch:{ Exception -> 0x0026 }
            r0.startActivity(r5)     // Catch:{ Exception -> 0x0026 }
            goto L_0x006f
        L_0x0026:
            android.content.Intent r5 = r4.m11647n3(r2)     // Catch:{ Exception -> 0x0032 }
            android.content.Context r0 = r4.mo27827K0()     // Catch:{ Exception -> 0x0032 }
            r0.startActivity(r5)     // Catch:{ Exception -> 0x0032 }
            goto L_0x006f
        L_0x0032:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not launch "
            r0.append(r1)
            java.lang.String r3 = r4.m_appName
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            java.lang.String r5 = r5.toString()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "Open File Failed"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18871j(r0, r5)
            android.content.Context r5 = r4.mo27827K0()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = r4.m_appName
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.arlosoft.macrodroid.common.C4061t1.m16023v(r5, r0, r1, r2)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.OpenFileAction.mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo):void");
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        String str;
        mo27877y2(activity);
        if (i == ANDROID_5_PICKER_ID && i2 == -1) {
            PackageManager packageManager = mo27827K0().getPackageManager();
            Intent intent2 = new Intent("android.intent.action.VIEW");
            Uri data = intent.getData();
            try {
                mo27827K0().getContentResolver().takePersistableUriPermission(data, 3);
            } catch (Throwable unused) {
            }
            this.m_fileUri = data.toString();
            this.m_filePath = null;
            this.m_fileDisplayName = C6420q1.m24719a(mo27827K0(), data);
            intent2.setDataAndType(Uri.parse(this.m_fileUri), this.m_mimeTypes.mo32493a(this.m_fileUri));
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
            if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
                C4061t1.m16019t(activity, "Cannot Open File", "No applications have been found that can open the specified file.");
                return;
            }
            Collections.sort(queryIntentActivities, new ResolveInfo.DisplayNameComparator(packageManager));
            String[] strArr = new String[queryIntentActivities.size()];
            int i3 = 0;
            int i4 = 0;
            for (ResolveInfo next : queryIntentActivities) {
                StringBuilder sb = new StringBuilder();
                sb.append(next.loadLabel(packageManager));
                if (next.activityInfo.targetActivity != null) {
                    str = " (" + next.activityInfo.targetActivity + ")";
                } else {
                    str = "";
                }
                sb.append(str);
                strArr[i4] = sb.toString();
                if (strArr[i4].equals(this.m_appName)) {
                    i3 = i4;
                }
                i4++;
            }
            if (i3 == 0) {
                this.m_packageName = queryIntentActivities.get(i3).activityInfo.packageName;
                this.m_className = queryIntentActivities.get(0).activityInfo.applicationInfo.className;
                this.m_appName = strArr[0];
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity, mo24705l0());
            builder.setTitle((int) C17541R$string.select_application);
            builder.setSingleChoiceItems((CharSequence[]) strArr, i3, (DialogInterface.OnClickListener) new C3280nb(this, queryIntentActivities, strArr));
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C3252mb(this));
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3224lb(this));
            AlertDialog create = builder.create();
            create.show();
            create.setOnCancelListener(new C3196kb(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        try {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            j0.startActivityForResult(intent, ANDROID_5_PICKER_ID);
        } catch (Exception unused) {
            Context applicationContext = mo27827K0().getApplicationContext();
            C15626c.m94876a(applicationContext, "ACTION_OPEN_DOCUMENT " + SelectableItem.m15535j1(C17541R$string.not_supported), 0).show();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_filePath);
        parcel.writeString(this.m_packageName);
        parcel.writeString(this.m_className);
        parcel.writeString(this.m_appName);
        parcel.writeString(this.m_fileUri);
        parcel.writeString(this.m_fileDisplayName);
    }

    public OpenFileAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private OpenFileAction() {
        m11642D1();
    }

    private OpenFileAction(Parcel parcel) {
        super(parcel);
        m11642D1();
        this.m_filePath = parcel.readString();
        this.m_packageName = parcel.readString();
        this.m_className = parcel.readString();
        this.m_appName = parcel.readString();
        this.m_fileUri = parcel.readString();
        this.m_fileDisplayName = parcel.readString();
    }
}
