package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7631m0;

public class NFCStateConstraint extends Constraint {
    public static final Parcelable.Creator<NFCStateConstraint> CREATOR = new C4173a();
    private boolean m_enabled;

    /* renamed from: com.arlosoft.macrodroid.constraint.NFCStateConstraint$a */
    class C4173a implements Parcelable.Creator<NFCStateConstraint> {
        C4173a() {
        }

        /* renamed from: a */
        public NFCStateConstraint createFromParcel(Parcel parcel) {
            return new NFCStateConstraint(parcel, (C4173a) null);
        }

        /* renamed from: b */
        public NFCStateConstraint[] newArray(int i) {
            return new NFCStateConstraint[i];
        }
    }

    /* synthetic */ NFCStateConstraint(Parcel parcel, C4173a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m16845g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.enabled), MacroDroidApplication.m14845u().getString(C17541R$string.disabled)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_enabled ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        StringBuilder sb = new StringBuilder();
        sb.append(SelectableItem.m15535j1(C17541R$string.constraint_nfc_state));
        sb.append(" (");
        sb.append(this.m_enabled ? m16845g3()[0] : m16845g3()[1]);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        NfcAdapter defaultAdapter = ((NfcManager) mo27827K0().getSystemService("nfc")).getDefaultAdapter();
        return defaultAdapter != null && this.m_enabled == defaultAdapter.isEnabled();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7631m0.m31784u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16845g3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_enabled ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_enabled = i == 0;
    }

    public NFCStateConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private NFCStateConstraint() {
        this.m_enabled = true;
    }

    private NFCStateConstraint(Parcel parcel) {
        super(parcel);
        this.m_enabled = parcel.readInt() != 0;
    }
}
