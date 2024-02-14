package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ContentResolver;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7741f3;
import p148q0.C8151a;

public class SetAutoRotateAction extends Action {
    public static final Parcelable.Creator<SetAutoRotateAction> CREATOR = new C2625a();
    private int m_state;

    /* renamed from: com.arlosoft.macrodroid.action.SetAutoRotateAction$a */
    class C2625a implements Parcelable.Creator<SetAutoRotateAction> {
        C2625a() {
        }

        /* renamed from: a */
        public SetAutoRotateAction createFromParcel(Parcel parcel) {
            return new SetAutoRotateAction(parcel, (C2625a) null);
        }

        /* renamed from: b */
        public SetAutoRotateAction[] newArray(int i) {
            return new SetAutoRotateAction[i];
        }
    }

    /* synthetic */ SetAutoRotateAction(Parcel parcel, C2625a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m12295j3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_autorotate_on), SelectableItem.m15535j1(C17541R$string.action_set_autorotate_off), SelectableItem.m15535j1(C17541R$string.action_set_autorotate_toggle)};
    }

    /* renamed from: k3 */
    private static void m12296k3(ContentResolver contentResolver, boolean z) {
        Settings.System.putInt(contentResolver, "accelerometer_rotation", z ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_state;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m12295j3()[this.m_state];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7741f3.m32296u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        try {
            int i = this.m_state;
            boolean z = false;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        if (Settings.System.getInt(mo27827K0().getContentResolver(), "accelerometer_rotation") == 0) {
                        }
                    }
                }
                m12296k3(mo27827K0().getContentResolver(), z);
            }
            z = true;
            m12296k3(mo27827K0().getContentResolver(), z);
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Failed to update auto rotate setting: " + e.getMessage()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m12295j3();
    }

    /* renamed from: u2 */
    public boolean mo25103u2() {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_state);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_state = i;
    }

    public SetAutoRotateAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SetAutoRotateAction() {
        this.m_state = 0;
    }

    private SetAutoRotateAction(Parcel parcel) {
        super(parcel);
        this.m_state = parcel.readInt();
    }
}
