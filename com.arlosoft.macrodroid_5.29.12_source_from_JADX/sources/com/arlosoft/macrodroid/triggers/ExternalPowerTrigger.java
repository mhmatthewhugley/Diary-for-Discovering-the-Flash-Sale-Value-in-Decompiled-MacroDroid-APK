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
import com.arlosoft.macrodroid.triggers.receivers.ExternalPowerTriggerReceiver;
import p119k3.C7484c0;
import p148q0.C8151a;

public class ExternalPowerTrigger extends Trigger {
    public static final Parcelable.Creator<ExternalPowerTrigger> CREATOR = new C5642a();
    private static ExternalPowerTriggerReceiver s_externalPowerConnectionTriggerReceiver;
    private static int s_triggerCounter;
    private boolean m_hasSetNewPowerConnectedOptions;
    private boolean m_hasSetUSBOption;
    private boolean m_powerConnected;
    private boolean[] m_powerConnectedOptions;

    /* renamed from: com.arlosoft.macrodroid.triggers.ExternalPowerTrigger$a */
    class C5642a implements Parcelable.Creator<ExternalPowerTrigger> {
        C5642a() {
        }

        /* renamed from: a */
        public ExternalPowerTrigger createFromParcel(Parcel parcel) {
            return new ExternalPowerTrigger(parcel, (C5642a) null);
        }

        /* renamed from: b */
        public ExternalPowerTrigger[] newArray(int i) {
            return new ExternalPowerTrigger[i];
        }
    }

    /* synthetic */ ExternalPowerTrigger(Parcel parcel, C5642a aVar) {
        this(parcel);
    }

    /* renamed from: k3 */
    private String[] m22121k3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.wired), SelectableItem.m15535j1(C17541R$string.wireless), SelectableItem.m15535j1(C17541R$string.wired_slow)};
    }

    /* renamed from: l3 */
    private String[] m22122l3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.trigger_external_power_connected), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_external_power_disconnected)};
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m22123o3(DialogInterface dialogInterface, int i, boolean z) {
        this.m_powerConnectedOptions[i] = z;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.m_powerConnectedOptions;
            if (i2 >= zArr.length) {
                break;
            } else if (zArr[i2]) {
                z2 = true;
                break;
            } else {
                i2++;
            }
        }
        ((AlertDialog) dialogInterface).getButton(-1).setEnabled(z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void m22124p3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m22125q3(DialogInterface dialogInterface, int i) {
        this.m_hasSetNewPowerConnectedOptions = true;
        this.m_hasSetUSBOption = true;
        mo24689O1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_powerConnected ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_powerConnected ? m22122l3()[0] : m22122l3()[1];
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        boolean[] n3 = mo31111n3();
        this.m_powerConnectedOptions = n3;
        String str = "";
        if (!this.m_powerConnected) {
            return str;
        }
        if (n3[0] && n3[2] && n3[1]) {
            return SelectableItem.m15535j1(C17541R$string.any);
        }
        boolean[] n32 = mo31111n3();
        if (n32[0]) {
            str = str + m22121k3()[0];
            if (n32[1] || n32[2]) {
                str = str + " + ";
            }
        }
        if (n32[1]) {
            str = str + m22121k3()[1];
            if (n32[2]) {
                str = str + " + ";
            }
        }
        if (!n32[2]) {
            return str;
        }
        return str + m22121k3()[2];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_externalPowerConnectionTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_externalPowerConnectionTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7484c0.m31107u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_externalPowerConnectionTriggerReceiver = new ExternalPowerTriggerReceiver();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            intentFilter.setPriority(0);
            MacroDroidApplication.m14845u().registerReceiver(s_externalPowerConnectionTriggerReceiver, intentFilter);
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m22122l3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j3 */
    public void mo31109j3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        this.m_powerConnectedOptions = mo31111n3();
        builder.setMultiChoiceItems((CharSequence[]) m22121k3(), this.m_powerConnectedOptions, (DialogInterface.OnMultiChoiceClickListener) new C6039p2(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C6015n2(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6027o2(this));
        AlertDialog create = builder.create();
        create.show();
        boolean z = false;
        int i = 0;
        while (true) {
            boolean[] zArr = this.m_powerConnectedOptions;
            if (i >= zArr.length) {
                break;
            } else if (zArr[i]) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        create.getButton(-1).setEnabled(z);
    }

    /* renamed from: m3 */
    public boolean mo31110m3() {
        return this.m_powerConnected;
    }

    /* renamed from: n3 */
    public boolean[] mo31111n3() {
        if (!this.m_hasSetNewPowerConnectedOptions) {
            return new boolean[]{true, true, true};
        }
        if (this.m_hasSetUSBOption) {
            return this.m_powerConnectedOptions;
        }
        boolean[] zArr = this.m_powerConnectedOptions;
        return new boolean[]{zArr[0], zArr[1], zArr[0]};
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (this.m_powerConnected) {
            mo31109j3();
        } else {
            mo24689O1();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_powerConnected ? 1 : 0);
        parcel.writeBooleanArray(this.m_powerConnectedOptions);
        parcel.writeInt(this.m_hasSetNewPowerConnectedOptions ? 1 : 0);
        parcel.writeInt(this.m_hasSetUSBOption ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_powerConnected = i == 0;
    }

    public ExternalPowerTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ExternalPowerTrigger() {
        this.m_powerConnectedOptions = new boolean[3];
        this.m_powerConnected = true;
    }

    private ExternalPowerTrigger(Parcel parcel) {
        super(parcel);
        this.m_powerConnectedOptions = new boolean[3];
        boolean z = true;
        this.m_powerConnected = parcel.readInt() != 0;
        this.m_powerConnectedOptions = parcel.createBooleanArray();
        this.m_hasSetNewPowerConnectedOptions = parcel.readInt() != 0;
        this.m_hasSetUSBOption = parcel.readInt() == 0 ? false : z;
    }
}
