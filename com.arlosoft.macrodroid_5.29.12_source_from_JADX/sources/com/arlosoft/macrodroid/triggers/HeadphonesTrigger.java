package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.HeadphonesTriggerReceiver;
import p119k3.C7523k0;
import p148q0.C8151a;

public class HeadphonesTrigger extends Trigger {
    public static final Parcelable.Creator<HeadphonesTrigger> CREATOR = new C5657a();
    private static HeadphonesTriggerReceiver s_headphonesTriggerReceiver;
    private static int s_triggerCounter;

    /* renamed from: d */
    public int f13624d;
    private boolean m_headphonesConnected;
    private int m_micOption;

    /* renamed from: com.arlosoft.macrodroid.triggers.HeadphonesTrigger$a */
    class C5657a implements Parcelable.Creator<HeadphonesTrigger> {
        C5657a() {
        }

        /* renamed from: a */
        public HeadphonesTrigger createFromParcel(Parcel parcel) {
            return new HeadphonesTrigger(parcel, (C5657a) null);
        }

        /* renamed from: b */
        public HeadphonesTrigger[] newArray(int i) {
            return new HeadphonesTrigger[i];
        }
    }

    /* synthetic */ HeadphonesTrigger(Parcel parcel, C5657a aVar) {
        this(parcel);
    }

    /* renamed from: m3 */
    private String[] m22301m3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.any), SelectableItem.m15535j1(C17541R$string.no_microphone), SelectableItem.m15535j1(C17541R$string.with_microphone)};
    }

    /* renamed from: n3 */
    private String[] m22302n3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.trigger_headphones_inserted), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_headphones_removed)};
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m22303o3(DialogInterface dialogInterface, int i) {
        this.m_micOption = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void m22304p3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m22305q3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m22306r3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_headphonesConnected ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_headphonesConnected ? m22302n3()[0] : m22302n3()[1];
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_headphonesConnected ? m22301m3()[this.m_micOption] : "";
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_headphonesTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_headphonesTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7523k0.m31294u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_headphonesTriggerReceiver = new HeadphonesTriggerReceiver();
            MacroDroidApplication.m14845u().registerReceiver(s_headphonesTriggerReceiver, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m22302n3();
    }

    /* renamed from: k3 */
    public boolean mo31186k3() {
        return this.m_headphonesConnected;
    }

    /* renamed from: l3 */
    public int mo31187l3() {
        return this.m_micOption;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (!this.m_headphonesConnected) {
            mo24689O1();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) m22301m3(), this.m_micOption, (DialogInterface.OnClickListener) new C5956i3(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C5980k3(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5968j3(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C5944h3(this));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_headphonesConnected ? 1 : 0);
        parcel.writeInt(this.m_micOption);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_headphonesConnected = i == 0;
    }

    public HeadphonesTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public HeadphonesTrigger() {
        this.f13624d = 2;
        this.m_headphonesConnected = true;
    }

    private HeadphonesTrigger(Parcel parcel) {
        super(parcel);
        this.f13624d = 2;
        this.m_headphonesConnected = parcel.readInt() != 0;
        this.m_micOption = parcel.readInt();
    }
}
