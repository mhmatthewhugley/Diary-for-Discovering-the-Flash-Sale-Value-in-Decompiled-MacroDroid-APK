package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import p119k3.C7492e0;

public class FingerprintGestureTrigger extends Trigger {
    public static final Parcelable.Creator<FingerprintGestureTrigger> CREATOR = new C5645a();
    private int option;

    /* renamed from: com.arlosoft.macrodroid.triggers.FingerprintGestureTrigger$a */
    class C5645a implements Parcelable.Creator<FingerprintGestureTrigger> {
        C5645a() {
        }

        /* renamed from: a */
        public FingerprintGestureTrigger createFromParcel(Parcel parcel) {
            return new FingerprintGestureTrigger(parcel, (C5645a) null);
        }

        /* renamed from: b */
        public FingerprintGestureTrigger[] newArray(int i) {
            return new FingerprintGestureTrigger[i];
        }
    }

    /* synthetic */ FingerprintGestureTrigger(Parcel parcel, C5645a aVar) {
        this(parcel);
    }

    /* renamed from: i3 */
    private String[] m22156i3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_fingerprint_swipe_up), SelectableItem.m15535j1(C17541R$string.trigger_fingerprint_swipe_down), SelectableItem.m15535j1(C17541R$string.trigger_fingerprint_swipe_left), SelectableItem.m15535j1(C17541R$string.trigger_fingerprint_swipe_right)};
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public /* synthetic */ void m22157j3(DialogInterface dialogInterface, int i) {
        super.mo25540W1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m22156i3()[this.option];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7492e0.m31147u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + " (" + m22156i3()[this.option] + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
    }

    /* renamed from: W1 */
    public void mo25540W1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.trigger_fingerprint_gesture);
        builder.setMessage((int) C17541R$string.trigger_fingerprint_gesture_help);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6084s2(this));
        builder.create().show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m22156i3();
    }

    /* renamed from: h3 */
    public boolean mo31124h3(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return i == 8 && this.option == 1;
                }
                if (this.option == 0) {
                    return true;
                }
                return false;
            } else if (this.option == 2) {
                return true;
            } else {
                return false;
            }
        } else if (this.option == 3) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: l2 */
    public boolean mo27852l2() {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.option = i;
    }

    public FingerprintGestureTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public FingerprintGestureTrigger() {
    }

    private FingerprintGestureTrigger(Parcel parcel) {
        super(parcel);
        this.option = parcel.readInt();
    }
}
