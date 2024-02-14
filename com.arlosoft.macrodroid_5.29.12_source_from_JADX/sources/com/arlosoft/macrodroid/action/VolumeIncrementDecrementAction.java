package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7727d5;

public class VolumeIncrementDecrementAction extends Action {
    public static final Parcelable.Creator<VolumeIncrementDecrementAction> CREATOR = new C2788a();
    private boolean m_volumeUp;

    /* renamed from: com.arlosoft.macrodroid.action.VolumeIncrementDecrementAction$a */
    class C2788a implements Parcelable.Creator<VolumeIncrementDecrementAction> {
        C2788a() {
        }

        /* renamed from: a */
        public VolumeIncrementDecrementAction createFromParcel(Parcel parcel) {
            return new VolumeIncrementDecrementAction(parcel, (C2788a) null);
        }

        /* renamed from: b */
        public VolumeIncrementDecrementAction[] newArray(int i) {
            return new VolumeIncrementDecrementAction[i];
        }
    }

    /* synthetic */ VolumeIncrementDecrementAction(Parcel parcel, C2788a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m13775j3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_volume_increment_decrement_volume_up), SelectableItem.m15535j1(C17541R$string.action_volume_increment_decrement_volume_down)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_volumeUp ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m13775j3()[!this.m_volumeUp];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7727d5.m32223u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        ((AudioManager) mo27827K0().getSystemService("audio")).adjustVolume(this.m_volumeUp ? 1 : -1, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m13775j3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_volumeUp ^ true ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_volumeUp = i == 0;
    }

    public VolumeIncrementDecrementAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private VolumeIncrementDecrementAction() {
        this.m_volumeUp = true;
    }

    private VolumeIncrementDecrementAction(Parcel parcel) {
        super(parcel);
        this.m_volumeUp = parcel.readInt() == 0;
    }
}
