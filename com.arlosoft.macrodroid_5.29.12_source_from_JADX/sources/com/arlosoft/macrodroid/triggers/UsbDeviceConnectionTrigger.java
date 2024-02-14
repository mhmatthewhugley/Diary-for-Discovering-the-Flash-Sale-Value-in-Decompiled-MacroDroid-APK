package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.UsbDeviceConnectionReceiver;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p119k3.C7481b2;

/* compiled from: UsbDeviceConnectionTrigger.kt */
public final class UsbDeviceConnectionTrigger extends Trigger {
    public static final Parcelable.Creator<UsbDeviceConnectionTrigger> CREATOR = new C5758a();

    /* renamed from: d */
    public static final C5759b f13715d = new C5759b((C13695i) null);
    private static int triggerCount;
    private static UsbDeviceConnectionReceiver usbDeviceConnectionTriggerReceiver;
    private int option;

    /* renamed from: com.arlosoft.macrodroid.triggers.UsbDeviceConnectionTrigger$a */
    /* compiled from: UsbDeviceConnectionTrigger.kt */
    public static final class C5758a implements Parcelable.Creator<UsbDeviceConnectionTrigger> {
        C5758a() {
        }

        /* renamed from: a */
        public UsbDeviceConnectionTrigger createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new UsbDeviceConnectionTrigger(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public UsbDeviceConnectionTrigger[] newArray(int i) {
            return new UsbDeviceConnectionTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.UsbDeviceConnectionTrigger$b */
    /* compiled from: UsbDeviceConnectionTrigger.kt */
    public static final class C5759b {
        private C5759b() {
        }

        public /* synthetic */ C5759b(C13695i iVar) {
            this();
        }
    }

    public UsbDeviceConnectionTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ UsbDeviceConnectionTrigger(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: h3 */
    private final String[] m23384h3() {
        String j1 = SelectableItem.m15535j1(C17541R$string.trigger_usb_device_connected);
        C13706o.m87928e(j1, "getString(R.string.trigger_usb_device_connected)");
        String j12 = SelectableItem.m15535j1(C17541R$string.trigger_usb_device_disconnected);
        C13706o.m87928e(j12, "getString(R.string.trigg…_usb_device_disconnected)");
        return new String[]{j1, j12};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m23384h3()[this.option];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = triggerCount - 1;
        triggerCount = i;
        if (i == 0) {
            try {
                MacroDroidApplication.f9883I.mo27303b().unregisterReceiver(usbDeviceConnectionTriggerReceiver);
            } catch (Exception e) {
                FirebaseCrashlytics.m6487a().mo22936d(e);
            }
            usbDeviceConnectionTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7481b2.f18336j.mo37638a();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (triggerCount == 0) {
            usbDeviceConnectionTriggerReceiver = new UsbDeviceConnectionReceiver();
            IntentFilter intentFilter = new IntentFilter("android.hardware.usb.action.USB_DEVICE_ATTACHED");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
            intentFilter.addAction("android.hardware.usb.action.USB_ACCESSORY_ATTACHED");
            intentFilter.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
            MacroDroidApplication.f9883I.mo27303b().registerReceiver(usbDeviceConnectionTriggerReceiver, intentFilter);
        }
        triggerCount++;
    }

    /* renamed from: Y2 */
    public TriggerContextInfo mo30911Y2() {
        return TriggerContextInfo.m23362c(this, "test product name", "test manufacturer name");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m23384h3();
    }

    /* renamed from: g3 */
    public final int mo31574g3() {
        return this.option;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.option = i;
    }

    public UsbDeviceConnectionTrigger() {
    }

    private UsbDeviceConnectionTrigger(Parcel parcel) {
        super(parcel);
        this.option = parcel.readInt();
    }
}
