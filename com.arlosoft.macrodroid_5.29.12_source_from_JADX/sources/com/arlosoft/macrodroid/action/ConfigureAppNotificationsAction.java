package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.activities.ConfigureNotificationsStateActivity;
import com.arlosoft.macrodroid.common.AppNotificationState;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6374d1;
import java.util.ArrayList;
import java.util.Iterator;
import p128m0.C7872x;
import p148q0.C8151a;
import p150q2.C8164a;

public class ConfigureAppNotificationsAction extends Action {
    public static final Parcelable.Creator<ConfigureAppNotificationsAction> CREATOR = new C2373a();
    private static final int REQUEST_CODE_CONFIGURE_NOTIFICATIONS = 4422532;
    private final ArrayList<AppNotificationState> m_appList;

    /* renamed from: com.arlosoft.macrodroid.action.ConfigureAppNotificationsAction$a */
    class C2373a implements Parcelable.Creator<ConfigureAppNotificationsAction> {
        C2373a() {
        }

        /* renamed from: a */
        public ConfigureAppNotificationsAction createFromParcel(Parcel parcel) {
            return new ConfigureAppNotificationsAction(parcel, (C2373a) null);
        }

        /* renamed from: b */
        public ConfigureAppNotificationsAction[] newArray(int i) {
            return new ConfigureAppNotificationsAction[i];
        }
    }

    /* synthetic */ ConfigureAppNotificationsAction(Parcel parcel, C2373a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public /* synthetic */ void m10188R1(DialogInterface dialogInterface, int i) {
        mo24679x2(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public /* synthetic */ void m10189S1(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public /* synthetic */ void m10190T1(DialogInterface dialogInterface, int i) {
        mo24677v2();
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public /* synthetic */ void m10191U1(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        int i;
        Context context;
        if (this.m_appList.size() == 1) {
            StringBuilder sb = new StringBuilder();
            if (this.m_appList.get(0).mo27700b() == 1) {
                context = mo27827K0();
                i = C17541R$string.enable;
            } else {
                context = mo27827K0();
                i = C17541R$string.disable;
            }
            sb.append(context.getString(i));
            sb.append(" ");
            sb.append(this.m_appList.get(0).mo27699a());
            return sb.toString();
        }
        return this.m_appList.size() + " " + mo27827K0().getString(C17541R$string.action_configure_app_notifications_apps);
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7872x.m32933u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        try {
            int a = C6374d1.m24616a("android.app.INotificationManager", "setNotificationsEnabledForPackage");
            Iterator<AppNotificationState> it = this.m_appList.iterator();
            while (it.hasNext()) {
                AppNotificationState next = it.next();
                if (next.mo27700b() != 0) {
                    ApplicationInfo applicationInfo = mo27827K0().getPackageManager().getApplicationInfo(next.mo27701c(), 0);
                    String str = next.mo27700b() == 2 ? "0" : "1";
                    C4061t1.m15947B0(new String[]{"service call notification " + a + " s16 " + next.mo27701c() + " i32 " + applicationInfo.uid + " i32 " + str});
                }
            }
        } catch (Exception e) {
            if (C8164a.m33886a()) {
                C8151a.m33873n(new RuntimeException("Error invoking app notification on rooted device: " + e.toString()));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public AlertDialog mo24883h0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo27827K0().getString(C17541R$string.action_configure_app_notifications_configure));
        builder.setSingleChoiceItems((CharSequence[]) mo24676g1(), mo24671D0(), (DialogInterface.OnClickListener) new C2934b3(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C2990d3(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C2962c3(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C2806a3(this));
        return create;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        if (i == REQUEST_CODE_CONFIGURE_NOTIFICATIONS && i2 != 0) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("AppNotifications");
            this.m_appList.clear();
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                AppNotificationState appNotificationState = (AppNotificationState) ((Parcelable) it.next());
                if (appNotificationState.mo27700b() != 0) {
                    this.m_appList.add(appNotificationState);
                }
            }
            mo24689O1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        Intent intent = new Intent(j0, ConfigureNotificationsStateActivity.class);
        intent.putExtra("AppNotifications", this.m_appList);
        j0.startActivityForResult(intent, REQUEST_CODE_CONFIGURE_NOTIFICATIONS);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.m_appList);
    }

    public ConfigureAppNotificationsAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ConfigureAppNotificationsAction() {
        this.m_appList = new ArrayList<>();
    }

    private ConfigureAppNotificationsAction(Parcel parcel) {
        super(parcel);
        ArrayList<AppNotificationState> arrayList = new ArrayList<>();
        this.m_appList = arrayList;
        parcel.readTypedList(arrayList, AppNotificationState.CREATOR);
    }
}
