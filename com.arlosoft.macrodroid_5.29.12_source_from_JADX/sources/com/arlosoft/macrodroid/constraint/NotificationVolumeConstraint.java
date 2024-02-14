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
import p123l1.C7635o0;

public class NotificationVolumeConstraint extends Constraint {
    public static final Parcelable.Creator<NotificationVolumeConstraint> CREATOR = new C4177a();
    private static final int OPTION_VOLUME_ON = 0;
    private static final int OPTION_VOLUME_SILENT = 1;
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.constraint.NotificationVolumeConstraint$a */
    class C4177a implements Parcelable.Creator<NotificationVolumeConstraint> {
        C4177a() {
        }

        /* renamed from: a */
        public NotificationVolumeConstraint createFromParcel(Parcel parcel) {
            return new NotificationVolumeConstraint(parcel, (C4177a) null);
        }

        /* renamed from: b */
        public NotificationVolumeConstraint[] newArray(int i) {
            return new NotificationVolumeConstraint[i];
        }
    }

    /* synthetic */ NotificationVolumeConstraint(Parcel parcel, C4177a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m16904g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_volume_on), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_volume_silent)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m16904g3()[this.m_option];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        int streamVolume = ((AudioManager) mo27827K0().getSystemService("audio")).getStreamVolume(5);
        return this.m_option == 0 ? streamVolume > 0 : streamVolume == 0;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7635o0.m31805u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16904g3();
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

    public NotificationVolumeConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private NotificationVolumeConstraint() {
        this.m_option = 0;
    }

    private NotificationVolumeConstraint(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
    }
}
