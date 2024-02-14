package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.receivers.VolumeReceiver;
import p112j2.C7439d0;
import p119k3.C7490d2;

public class VolumeButtonTrigger extends Trigger {
    public static final Parcelable.Creator<VolumeButtonTrigger> CREATOR = new C5767a();
    private static final String VOLUME_DOWN = SelectableItem.m15535j1(C17541R$string.trigger_volume_button_down);
    private static final String VOLUME_DOWN_LONG_PRESS = (SelectableItem.m15535j1(C17541R$string.trigger_volume_button_down) + " - " + SelectableItem.m15535j1(C17541R$string.trigger_media_button_pressed_long_press));
    private static final String[] VOLUME_RETAIN_OPTIONS = {SelectableItem.m15535j1(C17541R$string.trigger_volume_button_retain), SelectableItem.m15535j1(C17541R$string.trigger_volume_button_update)};
    private static final String VOLUME_UP = SelectableItem.m15535j1(C17541R$string.trigger_volume_button_up);
    private static final String VOLUME_UP_LONG_PRESS = (SelectableItem.m15535j1(C17541R$string.trigger_volume_button_up) + " - " + SelectableItem.m15535j1(C17541R$string.trigger_media_button_pressed_long_press));
    private static int s_triggerCounter = 0;
    private static final VolumeReceiver s_volumeChangeReceiver = new VolumeReceiver();
    private boolean m_dontChangeVolume;
    private int m_monitorOption;
    private boolean m_notConfigured;
    private int m_option;
    private transient int m_selectedMonitorOption;
    private transient int m_selectedOption;

    /* renamed from: com.arlosoft.macrodroid.triggers.VolumeButtonTrigger$a */
    class C5767a implements Parcelable.Creator<VolumeButtonTrigger> {
        C5767a() {
        }

        /* renamed from: a */
        public VolumeButtonTrigger createFromParcel(Parcel parcel) {
            return new VolumeButtonTrigger(parcel, (C5767a) null);
        }

        /* renamed from: b */
        public VolumeButtonTrigger[] newArray(int i) {
            return new VolumeButtonTrigger[i];
        }
    }

    /* synthetic */ VolumeButtonTrigger(Parcel parcel, C5767a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m23498A3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m23499B3(DialogInterface dialogInterface, int i) {
        this.m_dontChangeVolume = i == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m23500C3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void m23501D3(DialogInterface dialogInterface, int i) {
        this.m_monitorOption = this.m_selectedMonitorOption;
        this.m_option = this.m_selectedOption;
        this.m_notConfigured = false;
        mo24689O1();
        int i2 = this.m_monitorOption;
        if (i2 == 0) {
            if (!C4061t1.m15994g0(mo27827K0())) {
                C7439d0.m30911p0(mo27827K0(), mo25559a1(), 8);
            }
        } else if (Build.VERSION.SDK_INT >= 24 && i2 == 1 && !((NotificationManager) mo27827K0().getSystemService("notification")).isNotificationPolicyAccessGranted()) {
            C7439d0.m30911p0(mo27827K0(), mo25559a1(), 7);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void m23502E3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void m23503F3(DialogInterface dialogInterface, int i) {
        super.mo24714u1();
    }

    /* renamed from: p3 */
    private void m23513p3() {
        String[] t3 = this.m_selectedMonitorOption == 1 ? m23516t3() : m23517u3();
        this.m_selectedOption = this.m_selectedMonitorOption == 1 ? this.m_option % 2 : this.m_option;
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.select_option);
        builder.setSingleChoiceItems((CharSequence[]) t3, this.m_selectedOption, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C6154u8(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6166v8(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C6057q8(this));
    }

    /* renamed from: q3 */
    private void m23514q3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.select_option);
        builder.setSingleChoiceItems((CharSequence[]) VOLUME_RETAIN_OPTIONS, this.m_dontChangeVolume ^ true ? 1 : 0, (DialogInterface.OnClickListener) new C6090s8(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C6178w8(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6142t8(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C6069r8(this));
    }

    /* renamed from: s3 */
    private String[] m23515s3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_volume_use_accessibility_service), SelectableItem.m15535j1(C17541R$string.trigger_volume_monitor_volume_changes)};
    }

    /* renamed from: t3 */
    private String[] m23516t3() {
        return new String[]{VOLUME_UP, VOLUME_DOWN};
    }

    /* renamed from: u3 */
    private String[] m23517u3() {
        return new String[]{VOLUME_UP, VOLUME_DOWN, VOLUME_UP_LONG_PRESS, VOLUME_DOWN_LONG_PRESS};
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m23518y3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m23519z3(DialogInterface dialogInterface, int i) {
        this.m_selectedOption = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        m23514q3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_monitorOption;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m23517u3()[this.m_option];
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_dontChangeVolume ? VOLUME_RETAIN_OPTIONS[0] : VOLUME_RETAIN_OPTIONS[1];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            MacroDroidApplication.m14845u().unregisterReceiver(s_volumeChangeReceiver);
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7490d2.m31137u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            MacroDroidApplication.m14845u().registerReceiver(s_volumeChangeReceiver, intentFilter);
        }
        s_triggerCounter++;
    }

    /* renamed from: e2 */
    public boolean mo25672e2() {
        if (!C5163j2.m20223o0(mo27827K0()) && Build.VERSION.SDK_INT >= 24 && this.m_monitorOption == 1 && !this.m_notConfigured) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m23515s3();
    }

    /* renamed from: r3 */
    public int mo31592r3() {
        return this.m_monitorOption;
    }

    /* renamed from: t2 */
    public boolean mo27868t2() {
        return this.m_monitorOption == 0 && !this.m_notConfigured;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        if (C5163j2.m20098Y1(mo27827K0())) {
            super.mo24714u1();
            return;
        }
        String j1 = SelectableItem.m15535j1(C17541R$string.trigger_volume_button_help);
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.trigger_volume_button);
        builder.setMessage((CharSequence) j1);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6190x8(this));
        builder.show();
        C5163j2.m20025N5(mo27827K0(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        m23513p3();
    }

    /* renamed from: v3 */
    public boolean mo31593v3() {
        return this.m_dontChangeVolume;
    }

    /* renamed from: w3 */
    public boolean mo31594w3() {
        int i = this.m_option;
        return i == 2 || i == 3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_monitorOption);
        parcel.writeInt(this.m_option);
        parcel.writeInt(this.m_dontChangeVolume ^ true ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_selectedMonitorOption = i;
    }

    /* renamed from: x3 */
    public boolean mo31595x3() {
        int i = this.m_option;
        return i == 0 || i == 2;
    }

    public VolumeButtonTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
        this.m_notConfigured = true;
    }

    private VolumeButtonTrigger() {
        this.m_dontChangeVolume = true;
    }

    private VolumeButtonTrigger(Parcel parcel) {
        super(parcel);
        this.m_monitorOption = parcel.readInt();
        this.m_option = parcel.readInt();
        this.m_dontChangeVolume = parcel.readInt() == 0;
    }
}
