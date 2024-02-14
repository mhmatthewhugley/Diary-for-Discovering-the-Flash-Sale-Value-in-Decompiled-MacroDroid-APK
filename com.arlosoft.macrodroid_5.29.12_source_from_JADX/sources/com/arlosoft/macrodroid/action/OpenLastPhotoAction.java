package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p128m0.C7772j2;

/* compiled from: OpenLastPhotoAction.kt */
public final class OpenLastPhotoAction extends Action {
    public static final Parcelable.Creator<OpenLastPhotoAction> CREATOR = new C2557a();

    /* renamed from: d */
    public static final C2558b f7397d = new C2558b((C13695i) null);
    private String appName;
    private String packageName;

    /* renamed from: com.arlosoft.macrodroid.action.OpenLastPhotoAction$a */
    /* compiled from: OpenLastPhotoAction.kt */
    public static final class C2557a implements Parcelable.Creator<OpenLastPhotoAction> {
        C2557a() {
        }

        /* renamed from: a */
        public OpenLastPhotoAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new OpenLastPhotoAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public OpenLastPhotoAction[] newArray(int i) {
            return new OpenLastPhotoAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.OpenLastPhotoAction$b */
    /* compiled from: OpenLastPhotoAction.kt */
    public static final class C2558b {
        private C2558b() {
        }

        public /* synthetic */ C2558b(C13695i iVar) {
            this();
        }
    }

    public OpenLastPhotoAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ OpenLastPhotoAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m11666n3(OpenLastPhotoAction openLastPhotoAction, List list, String[] strArr, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(openLastPhotoAction, "this$0");
        C13706o.m87929f(list, "$list");
        C13706o.m87929f(strArr, "$apps");
        String str = ((ResolveInfo) list.get(i)).activityInfo.packageName;
        C13706o.m87928e(str, "list[item].activityInfo.packageName");
        openLastPhotoAction.packageName = str;
        String str2 = strArr[i];
        C13706o.m87926c(str2);
        openLastPhotoAction.appName = str2;
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public static final void m11667o3(OpenLastPhotoAction openLastPhotoAction, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(openLastPhotoAction, "this$0");
        openLastPhotoAction.mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static final void m11668p3(OpenLastPhotoAction openLastPhotoAction, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(openLastPhotoAction, "this$0");
        openLastPhotoAction.mo24677v2();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static final void m11669q3(OpenLastPhotoAction openLastPhotoAction, DialogInterface dialogInterface) {
        C13706o.m87929f(openLastPhotoAction, "this$0");
        openLastPhotoAction.mo24706w1();
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.appName;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7772j2.f18774j.mo37757a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        Uri K = C4061t1.m15964K(mo27827K0());
        if (K != null) {
            Intent intent = new Intent("android.intent.action.VIEW", K);
            intent.addFlags(268435456);
            intent.setPackage(this.packageName);
            mo27827K0().startActivity(Intent.createChooser(intent, SelectableItem.m15535j1(C17541R$string.action_open_last_photo)).addFlags(268435456));
            return;
        }
        Long Y0 = mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        C4878b.m18869h("No photos found on device", Y0.longValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        String str;
        super.mo25540W1();
        PackageManager packageManager = mo27827K0().getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri K = C4061t1.m15964K(mo27827K0());
        if (K != null) {
            intent.setData(K);
        } else {
            intent.setType("image/*");
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        C13706o.m87928e(queryIntentActivities, "packageManager.queryIntentActivities(intent, 0)");
        if (queryIntentActivities.size() == 0) {
            C4061t1.m16019t(mo27850j0(), "Cannot Open File", "No applications have been found that can open the specified file.");
            return;
        }
        Collections.sort(queryIntentActivities, new ResolveInfo.DisplayNameComparator(packageManager));
        String[] strArr = new String[queryIntentActivities.size()];
        int i = 0;
        int i2 = 0;
        for (ResolveInfo next : queryIntentActivities) {
            StringBuilder sb = new StringBuilder();
            sb.append(next.loadLabel(packageManager));
            if (next.activityInfo.targetActivity != null) {
                str = " (" + next.activityInfo.targetActivity + ')';
            } else {
                str = "";
            }
            sb.append(str);
            strArr[i2] = sb.toString();
            if (C13706o.m87924a(strArr[i2], this.appName)) {
                i = i2;
            }
            i2++;
        }
        if (i == 0) {
            String str2 = queryIntentActivities.get(i).activityInfo.packageName;
            C13706o.m87928e(str2, "list[selectedIndex].activityInfo.packageName");
            this.packageName = str2;
            String str3 = strArr[0];
            C13706o.m87926c(str3);
            this.appName = str3;
        }
        Activity j0 = mo27850j0();
        C13706o.m87926c(j0);
        AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
        builder.setTitle((int) C17541R$string.select_application);
        builder.setSingleChoiceItems((CharSequence[]) strArr, i, (DialogInterface.OnClickListener) new C3394rb(this, queryIntentActivities, strArr));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C3338pb(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3366qb(this));
        AlertDialog create = builder.create();
        C13706o.m87928e(create, "builder.create()");
        create.show();
        create.setOnCancelListener(new C3308ob(this));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.packageName);
        parcel.writeString(this.appName);
    }

    public OpenLastPhotoAction() {
        this.appName = "";
        this.packageName = "";
    }

    private OpenLastPhotoAction(Parcel parcel) {
        super(parcel);
        this.appName = "";
        this.packageName = "";
        String readString = parcel.readString();
        C13706o.m87926c(readString);
        this.packageName = readString;
        String readString2 = parcel.readString();
        C13706o.m87926c(readString2);
        this.appName = readString2;
    }
}
