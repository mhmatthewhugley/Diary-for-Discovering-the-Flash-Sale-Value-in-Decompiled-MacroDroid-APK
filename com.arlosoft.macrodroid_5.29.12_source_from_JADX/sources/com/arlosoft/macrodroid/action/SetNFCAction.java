package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.lang.reflect.Method;
import p128m0.C7855u3;
import p150q2.C8164a;

public class SetNFCAction extends Action {
    public static final Parcelable.Creator<SetNFCAction> CREATOR = new C2645a();
    private int m_state;

    /* renamed from: com.arlosoft.macrodroid.action.SetNFCAction$a */
    class C2645a implements Parcelable.Creator<SetNFCAction> {
        C2645a() {
        }

        /* renamed from: a */
        public SetNFCAction createFromParcel(Parcel parcel) {
            return new SetNFCAction(parcel, (C2645a) null);
        }

        /* renamed from: b */
        public SetNFCAction[] newArray(int i) {
            return new SetNFCAction[i];
        }
    }

    /* synthetic */ SetNFCAction(Parcel parcel, C2645a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m12533j3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_nfc_on), SelectableItem.m15535j1(C17541R$string.action_set_nfc_off), SelectableItem.m15535j1(C17541R$string.action_set_nfc_toggle)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_state;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m12533j3()[this.m_state];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7855u3.m32851u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (C8164a.m33886a()) {
            C4061t1.m15947B0(new String[]{"pm grant com.arlosoft.macrodroid android.permission.WRITE_SECURE_SETTINGS"});
        }
        NfcAdapter defaultAdapter = ((NfcManager) mo27827K0().getSystemService("nfc")).getDefaultAdapter();
        if (defaultAdapter != null) {
            boolean isEnabled = defaultAdapter.isEnabled();
            int i = this.m_state;
            boolean z = i != 0 ? (i == 1 || i != 2) ? false : !isEnabled : true;
            if (z != isEnabled) {
                try {
                    Class<?> cls = Class.forName(defaultAdapter.getClass().getName());
                    Method declaredMethod = z ? cls.getDeclaredMethod("enable", new Class[0]) : cls.getDeclaredMethod("disable", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(defaultAdapter, new Object[0]);
                } catch (Exception unused) {
                }
            }
        } else {
            C4878b.m18868g("NFC Adapter is null - NFC Action failed");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m12533j3();
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

    public SetNFCAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SetNFCAction() {
        this.m_state = 0;
    }

    private SetNFCAction(Parcel parcel) {
        super(parcel);
        this.m_state = parcel.readInt();
    }
}
