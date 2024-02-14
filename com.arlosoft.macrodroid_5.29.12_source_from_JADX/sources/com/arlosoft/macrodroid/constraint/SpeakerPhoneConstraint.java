package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p112j2.C7439d0;
import p123l1.C7652w0;

public class SpeakerPhoneConstraint extends Constraint {
    public static final Parcelable.Creator<SpeakerPhoneConstraint> CREATOR = new C4188a();
    private boolean m_enabled;

    /* renamed from: com.arlosoft.macrodroid.constraint.SpeakerPhoneConstraint$a */
    class C4188a implements Parcelable.Creator<SpeakerPhoneConstraint> {
        C4188a() {
        }

        /* renamed from: a */
        public SpeakerPhoneConstraint createFromParcel(Parcel parcel) {
            return new SpeakerPhoneConstraint(parcel, (C4188a) null);
        }

        /* renamed from: b */
        public SpeakerPhoneConstraint[] newArray(int i) {
            return new SpeakerPhoneConstraint[i];
        }
    }

    /* synthetic */ SpeakerPhoneConstraint(Parcel parcel, C4188a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m17009g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_speaker_phone_on), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_speaker_phone_off)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_enabled ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_enabled ? m17009g3()[0] : m17009g3()[1];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        AudioManager audioManager = (AudioManager) mo27827K0().getSystemService("audio");
        try {
            if (this.m_enabled == (((TelephonyManager) mo27827K0().getSystemService("phone")).getCallState() != 0 && audioManager.isSpeakerphoneOn())) {
                return true;
            }
            return false;
        } catch (SecurityException unused) {
            C7439d0.m30909o0(mo27827K0(), "android.permission.READ_PHONE_STATE", SelectableItem.m15535j1(C17541R$string.constraint_speaker_phone), true, false);
            return false;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7652w0.m31889u();
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.READ_PHONE_STATE"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m17009g3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.select_option);
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

    public SpeakerPhoneConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SpeakerPhoneConstraint() {
        this.m_enabled = true;
    }

    private SpeakerPhoneConstraint(Parcel parcel) {
        super(parcel);
        this.m_enabled = parcel.readInt() != 0;
    }
}
