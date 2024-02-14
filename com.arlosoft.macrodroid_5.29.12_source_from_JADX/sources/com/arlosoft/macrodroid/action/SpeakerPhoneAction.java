package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.media.AudioManager;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7783k4;

public class SpeakerPhoneAction extends Action {
    public static final Parcelable.Creator<SpeakerPhoneAction> CREATOR = new C2704b();
    private int m_state;

    /* renamed from: com.arlosoft.macrodroid.action.SpeakerPhoneAction$a */
    class C2703a extends Thread {

        /* renamed from: a */
        final /* synthetic */ AudioManager f7608a;

        /* renamed from: c */
        final /* synthetic */ boolean f7609c;

        C2703a(AudioManager audioManager, boolean z) {
            this.f7608a = audioManager;
            this.f7609c = z;
        }

        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException unused) {
            }
            this.f7608a.setMode(this.f7609c ? 2 : 0);
            this.f7608a.setSpeakerphoneOn(this.f7609c);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SpeakerPhoneAction$b */
    class C2704b implements Parcelable.Creator<SpeakerPhoneAction> {
        C2704b() {
        }

        /* renamed from: a */
        public SpeakerPhoneAction createFromParcel(Parcel parcel) {
            return new SpeakerPhoneAction(parcel, (C2703a) null);
        }

        /* renamed from: b */
        public SpeakerPhoneAction[] newArray(int i) {
            return new SpeakerPhoneAction[i];
        }
    }

    /* synthetic */ SpeakerPhoneAction(Parcel parcel, C2703a aVar) {
        this(parcel);
    }

    /* renamed from: k3 */
    private String[] m13141k3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_speaker_phone_on), SelectableItem.m15535j1(C17541R$string.action_speaker_phone_off), SelectableItem.m15535j1(C17541R$string.action_speaker_phone_toggle)};
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public /* synthetic */ void m13142l3(DialogInterface dialogInterface, int i) {
        super.mo25540W1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_state;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m13141k3()[this.m_state];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7783k4.m32497u();
    }

    /* renamed from: W1 */
    public void mo25540W1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0());
        builder.setMessage((int) C17541R$string.action_speaker_phone_android_10_warning).setTitle((int) C17541R$string.action_speaker_phone).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3405rl(this));
        builder.show();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        AudioManager audioManager = (AudioManager) mo27827K0().getSystemService("audio");
        int i = this.m_state;
        int i2 = 2;
        boolean z = true;
        if (i != 0) {
            z = (i == 1 || i != 2) ? false : true ^ audioManager.isSpeakerphoneOn();
        }
        if (!z) {
            i2 = 0;
        }
        audioManager.setMode(i2);
        audioManager.setSpeakerphoneOn(z);
        new C2703a(audioManager, z).start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m13141k3();
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

    public SpeakerPhoneAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public SpeakerPhoneAction() {
    }

    private SpeakerPhoneAction(Parcel parcel) {
        super(parcel);
        this.m_state = parcel.readInt();
    }
}
