package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7607e1;

public class VolumeConstraint extends Constraint {
    public static final Parcelable.Creator<VolumeConstraint> CREATOR = new C4209a();
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.constraint.VolumeConstraint$a */
    class C4209a implements Parcelable.Creator<VolumeConstraint> {
        C4209a() {
        }

        /* renamed from: a */
        public VolumeConstraint createFromParcel(Parcel parcel) {
            return new VolumeConstraint(parcel, (C4209a) null);
        }

        /* renamed from: b */
        public VolumeConstraint[] newArray(int i) {
            return new VolumeConstraint[i];
        }
    }

    /* synthetic */ VolumeConstraint(Parcel parcel, C4209a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m17158g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_volume_on), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_volume_vibrate_only), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_volume_silent), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_volume_vibrate_or_silent)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m17158g3()[this.m_option];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        int i;
        int i2;
        int ringerMode = ((AudioManager) mo27827K0().getSystemService("audio")).getRingerMode();
        if (ringerMode == 2 && this.m_option == 0) {
            return true;
        }
        if (ringerMode == 1 && ((i2 = this.m_option) == 1 || i2 == 3)) {
            return true;
        }
        if (ringerMode == 0 && ((i = this.m_option) == 2 || i == 3)) {
            return true;
        }
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7607e1.m31670u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m17158g3();
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

    public VolumeConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private VolumeConstraint() {
        this.m_option = 0;
    }

    private VolumeConstraint(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
    }
}
