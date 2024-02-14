package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7811o3;
import p319lc.C15626c;

public class SetKeyguardAction extends Action {
    public static final Parcelable.Creator<SetKeyguardAction> CREATOR = new C2638a();
    private static KeyguardManager.KeyguardLock s_keyguardLock;
    private boolean m_keyguardOn;

    /* renamed from: com.arlosoft.macrodroid.action.SetKeyguardAction$a */
    class C2638a implements Parcelable.Creator<SetKeyguardAction> {
        C2638a() {
        }

        /* renamed from: a */
        public SetKeyguardAction createFromParcel(Parcel parcel) {
            return new SetKeyguardAction(parcel, (C2638a) null);
        }

        /* renamed from: b */
        public SetKeyguardAction[] newArray(int i) {
            return new SetKeyguardAction[i];
        }
    }

    /* synthetic */ SetKeyguardAction(Parcel parcel, C2638a aVar) {
        this(parcel);
    }

    /* renamed from: k3 */
    private String[] m12448k3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_keyguard_lock_on), SelectableItem.m15535j1(C17541R$string.action_set_keyguard_lock_off)};
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public /* synthetic */ void m12449l3(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        mo27848g0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_keyguardOn ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_keyguardOn ? m12448k3()[0] : m12448k3()[1];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7811o3.m32637u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        try {
            if (this.m_keyguardOn) {
                s_keyguardLock.reenableKeyguard();
                C5163j2.m20171h4(mo27827K0(), 1);
                return;
            }
            s_keyguardLock.reenableKeyguard();
            s_keyguardLock.disableKeyguard();
            C5163j2.m20171h4(mo27827K0(), 2);
        } catch (SecurityException unused) {
            C15626c.m94876a(mo27827K0().getApplicationContext(), SelectableItem.m15535j1(C17541R$string.keyguard_security_exception), 0).show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m12448k3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.action_set_keyguard);
        builder.setMessage((int) C17541R$string.action_set_keyguard_warning);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3627yg(this));
        builder.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_keyguardOn ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_keyguardOn = i == 0;
    }

    public SetKeyguardAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public SetKeyguardAction() {
        this.m_keyguardOn = true;
        if (s_keyguardLock == null) {
            s_keyguardLock = ((KeyguardManager) mo27827K0().getSystemService("keyguard")).newKeyguardLock("MacroDroid");
        }
    }

    private SetKeyguardAction(Parcel parcel) {
        super(parcel);
        this.m_keyguardOn = parcel.readInt() != 0;
    }
}
