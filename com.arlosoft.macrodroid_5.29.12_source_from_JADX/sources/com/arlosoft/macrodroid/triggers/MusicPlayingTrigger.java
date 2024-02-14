package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.services.DetectMusicService;
import p119k3.C7475a1;

public class MusicPlayingTrigger extends Trigger {
    public static final Parcelable.Creator<MusicPlayingTrigger> CREATOR = new C5702a();
    private static int s_triggerCounter;
    private int option;

    /* renamed from: com.arlosoft.macrodroid.triggers.MusicPlayingTrigger$a */
    class C5702a implements Parcelable.Creator<MusicPlayingTrigger> {
        C5702a() {
        }

        /* renamed from: a */
        public MusicPlayingTrigger createFromParcel(Parcel parcel) {
            return new MusicPlayingTrigger(parcel, (C5702a) null);
        }

        /* renamed from: b */
        public MusicPlayingTrigger[] newArray(int i) {
            return new MusicPlayingTrigger[i];
        }
    }

    /* synthetic */ MusicPlayingTrigger(Parcel parcel, C5702a aVar) {
        this(parcel);
    }

    /* renamed from: h3 */
    private String[] m22752h3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.music_or_sound_started), SelectableItem.m15535j1(C17541R$string.music_or_sound_stopped)};
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return mo31342g3();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m22752h3()[mo31342g3()];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            mo27827K0().stopService(new Intent(mo27827K0(), DetectMusicService.class));
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7475a1.m31067u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + " (" + mo24672O0() + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            mo27827K0().startService(new Intent(mo27827K0(), DetectMusicService.class));
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m22752h3();
    }

    /* renamed from: g3 */
    public int mo31342g3() {
        int i = this.option;
        if (i > 1) {
            return 0;
        }
        return i;
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

    public MusicPlayingTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private MusicPlayingTrigger() {
    }

    private MusicPlayingTrigger(Parcel parcel) {
        super(parcel);
        this.option = parcel.readInt();
    }
}
