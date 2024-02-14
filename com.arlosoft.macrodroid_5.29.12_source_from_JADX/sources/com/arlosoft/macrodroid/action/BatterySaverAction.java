package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ContentResolver;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.provider.Settings;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7759i;
import p150q2.C8164a;

public class BatterySaverAction extends Action {
    public static final Parcelable.Creator<BatterySaverAction> CREATOR = new C2338a();
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.action.BatterySaverAction$a */
    class C2338a implements Parcelable.Creator<BatterySaverAction> {
        C2338a() {
        }

        /* renamed from: a */
        public BatterySaverAction createFromParcel(Parcel parcel) {
            return new BatterySaverAction(parcel, (C2338a) null);
        }

        /* renamed from: b */
        public BatterySaverAction[] newArray(int i) {
            return new BatterySaverAction[i];
        }
    }

    /* synthetic */ BatterySaverAction(Parcel parcel, C2338a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m9853j3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_battery_saver_on), SelectableItem.m15535j1(C17541R$string.action_battery_saver_off), SelectableItem.m15535j1(C17541R$string.toggle)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (this.m_option < 2) {
            return m9853j3()[this.m_option];
        }
        return SelectableItem.m15535j1(C17541R$string.action_battery_saver) + " " + SelectableItem.m15535j1(C17541R$string.toggle);
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7759i.m32383u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        boolean isPowerSaveMode = ((PowerManager) mo27827K0().getSystemService("power")).isPowerSaveMode();
        int i = this.m_option;
        boolean z = false;
        int i2 = 1;
        boolean z2 = i != 1 ? i != 2 ? true : !isPowerSaveMode : false;
        try {
            ContentResolver contentResolver = mo27827K0().getContentResolver();
            if (!z2) {
                i2 = 0;
            }
            z = Settings.Global.putInt(contentResolver, "low_power", i2);
        } catch (Exception unused) {
            if (C8164a.m33886a()) {
                if (z2) {
                    C4061t1.m15947B0(new String[]{"settings put global low_power 1"});
                    return;
                } else {
                    C4061t1.m15947B0(new String[]{"settings put global low_power 0"});
                    return;
                }
            }
        }
        if (!z) {
            C4878b.m18869h("Could not set battery saver, you need to grant permission via adb with the command: adb shell pm grant com.arlosoft.macrodroid android.permission.WRITE_SECURE_SETTINGS", mo27840Y0().longValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m9853j3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public BatterySaverAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private BatterySaverAction() {
        this.m_option = 0;
    }

    private BatterySaverAction(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
    }
}
