package p136n3;

import android.os.PowerManager;
import com.arlosoft.macrodroid.triggers.receivers.BluetoothTriggerReceiver;
import java.util.ArrayList;

/* renamed from: n3.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C15753a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f65090a;

    /* renamed from: c */
    public final /* synthetic */ PowerManager.WakeLock f65091c;

    public /* synthetic */ C15753a(ArrayList arrayList, PowerManager.WakeLock wakeLock) {
        this.f65090a = arrayList;
        this.f65091c = wakeLock;
    }

    public final void run() {
        BluetoothTriggerReceiver.m24026c(this.f65090a, this.f65091c);
    }
}
