package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.activities.CalibrateTouchDeviceActivity;
import com.arlosoft.macrodroid.action.services.RecordInputService;
import com.arlosoft.macrodroid.action.services.ReplayTouchesService;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.selectableitemlist.AddActionActivity;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.wizard.WizardActivity;
import java.util.ArrayList;
import java.util.Iterator;
import p128m0.C7853u1;
import p149q1.C8157f;

public class LaunchAndPressAction extends LaunchActivityAction {
    public static final Parcelable.Creator<LaunchAndPressAction> CREATOR = new C2517a();
    private static final int REQUEST_CODE = 3245;
    private ArrayList<String> m_eventList;
    protected String m_secondaryClassType;

    /* renamed from: com.arlosoft.macrodroid.action.LaunchAndPressAction$a */
    class C2517a implements Parcelable.Creator<LaunchAndPressAction> {
        C2517a() {
        }

        /* renamed from: a */
        public LaunchAndPressAction createFromParcel(Parcel parcel) {
            return new LaunchAndPressAction(parcel, (C2517a) null);
        }

        /* renamed from: b */
        public LaunchAndPressAction[] newArray(int i) {
            return new LaunchAndPressAction[i];
        }
    }

    /* synthetic */ LaunchAndPressAction(Parcel parcel, C2517a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public /* synthetic */ void m11220I3(Activity activity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (C5163j2.m20201l2(mo27827K0()).equals("")) {
            C4061t1.m16015r(mo27827K0());
            activity.startActivityForResult(new Intent(mo27827K0(), CalibrateTouchDeviceActivity.class), REQUEST_CODE);
            return;
        }
        super.mo24714u1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C3 */
    public void mo25280C3() {
        Intent launchIntentForPackage = mo27827K0().getPackageManager().getLaunchIntentForPackage(this.m_packageToLaunch);
        int i = 0;
        if (launchIntentForPackage != null) {
            Intent intent = new Intent(mo27827K0(), RecordInputService.class);
            intent.putExtra("action", this);
            intent.putExtra(C8157f.ITEM_TYPE, this.m_macro);
            Activity j0 = mo27850j0();
            if (!(j0 instanceof WizardActivity)) {
                i = j0 instanceof AddActionActivity ? 1 : 2;
            }
            intent.putExtra("FromActivity", i);
            mo27827K0().startService(intent);
            launchIntentForPackage.addFlags(67108864);
            mo27827K0().startActivity(launchIntentForPackage);
            return;
        }
        String str = this.m_classType;
        Log.w(str, "Cannot launch: " + this.m_packageToLaunch);
        Context K0 = mo27827K0();
        C4061t1.m16023v(K0, "Failed to launch " + this.m_applicationName, "Has the application been removed?", false);
    }

    /* renamed from: J3 */
    public void mo25292J3(ArrayList<String> arrayList) {
        this.m_eventList = arrayList;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7853u1.m32839u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        Iterator<String> it = this.m_eventList.iterator();
        while (it.hasNext()) {
            String next = it.next();
        }
        try {
            Intent intent = new Intent(mo27827K0(), ReplayTouchesService.class);
            intent.putStringArrayListExtra("events", this.m_eventList);
            mo27827K0().startService(intent);
        } catch (Exception unused) {
            C4878b.m18869h("Failed to launch replay service, data exceeded maximum allowed length", mo27840Y0().longValue());
        }
        super.mo24675a3(triggerContextInfo);
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return true;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        if (i == REQUEST_CODE && i2 != 0) {
            super.mo27871v1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
        builder.setTitle((int) C17541R$string.action_launch_and_press);
        builder.setMessage((int) C17541R$string.action_launch_and_press_instructions);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C2967c8(this, j0));
        builder.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeStringList(this.m_eventList);
    }

    public LaunchAndPressAction(Activity activity, Macro macro) {
        super(activity, macro);
        this.m_secondaryClassType = "LaunchAndPressAction";
        this.m_eventList = new ArrayList<>();
    }

    public LaunchAndPressAction() {
        this.m_secondaryClassType = "LaunchAndPressAction";
        this.m_eventList = new ArrayList<>();
    }

    private LaunchAndPressAction(Parcel parcel) {
        super(parcel);
        this.m_secondaryClassType = "LaunchAndPressAction";
        ArrayList<String> arrayList = new ArrayList<>();
        this.m_eventList = arrayList;
        parcel.readStringList(arrayList);
    }
}
