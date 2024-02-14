package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7628l0;

public class MusicActiveConstraint extends Constraint {
    public static final Parcelable.Creator<MusicActiveConstraint> CREATOR = new C4172a();
    private boolean m_musicActive;

    /* renamed from: com.arlosoft.macrodroid.constraint.MusicActiveConstraint$a */
    class C4172a implements Parcelable.Creator<MusicActiveConstraint> {
        C4172a() {
        }

        /* renamed from: a */
        public MusicActiveConstraint createFromParcel(Parcel parcel) {
            return new MusicActiveConstraint(parcel, (C4172a) null);
        }

        /* renamed from: b */
        public MusicActiveConstraint[] newArray(int i) {
            return new MusicActiveConstraint[i];
        }
    }

    /* synthetic */ MusicActiveConstraint(Parcel parcel, C4172a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m16835g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_music_active_playing), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_music_active_not_playing)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_musicActive ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        int i;
        Context context;
        if (this.m_musicActive) {
            context = mo27827K0();
            i = C17541R$string.constraint_music_active_playing;
        } else {
            context = mo27827K0();
            i = C17541R$string.constraint_music_active_not_playing;
        }
        return context.getString(i);
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        return this.m_musicActive == ((AudioManager) mo27827K0().getSystemService("audio")).isMusicActive();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7628l0.m31771u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16835g3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.constraint_music_active);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_musicActive ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_musicActive = i == 0;
    }

    public MusicActiveConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private MusicActiveConstraint() {
        this.m_musicActive = true;
    }

    private MusicActiveConstraint(Parcel parcel) {
        super(parcel);
        this.m_musicActive = parcel.readInt() != 0;
    }
}
