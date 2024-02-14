package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.billingclient.api.BillingClient;

/* compiled from: com.android.billingclient:billing@@4.0.0 */
public final class zzb extends zze implements zzd {
    zzb(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    /* renamed from: F3 */
    public final int mo53679F3(int i, String str, String str2) throws RemoteException {
        Parcel y = mo53694y();
        y.writeInt(i);
        y.writeString(str);
        y.writeString(str2);
        Parcel t1 = mo53693t1(1, y);
        int readInt = t1.readInt();
        t1.recycle();
        return readInt;
    }

    /* renamed from: H4 */
    public final Bundle mo53680H4(int i, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
        Parcel y = mo53694y();
        y.writeInt(i);
        y.writeString(str);
        y.writeString(str2);
        y.writeString(str3);
        y.writeString((String) null);
        zzg.m63924b(y, bundle);
        Parcel t1 = mo53693t1(8, y);
        Bundle bundle2 = (Bundle) zzg.m63923a(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle2;
    }

    /* renamed from: J7 */
    public final Bundle mo53681J7(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel y = mo53694y();
        y.writeInt(6);
        y.writeString(str);
        y.writeString(str2);
        y.writeString(str3);
        zzg.m63924b(y, bundle);
        Parcel t1 = mo53693t1(9, y);
        Bundle bundle2 = (Bundle) zzg.m63923a(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle2;
    }

    /* renamed from: K4 */
    public final Bundle mo53682K4(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel y = mo53694y();
        y.writeInt(3);
        y.writeString(str);
        y.writeString(str2);
        zzg.m63924b(y, bundle);
        Parcel t1 = mo53693t1(2, y);
        Bundle bundle2 = (Bundle) zzg.m63923a(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle2;
    }

    /* renamed from: S8 */
    public final Bundle mo53683S8(int i, String str, String str2, String str3, String str4) throws RemoteException {
        Parcel y = mo53694y();
        y.writeInt(3);
        y.writeString(str);
        y.writeString(str2);
        y.writeString(str3);
        y.writeString((String) null);
        Parcel t1 = mo53693t1(3, y);
        Bundle bundle = (Bundle) zzg.m63923a(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle;
    }

    /* renamed from: V1 */
    public final int mo53684V1(int i, String str, String str2) throws RemoteException {
        Parcel y = mo53694y();
        y.writeInt(3);
        y.writeString(str);
        y.writeString(str2);
        Parcel t1 = mo53693t1(5, y);
        int readInt = t1.readInt();
        t1.recycle();
        return readInt;
    }

    /* renamed from: Va */
    public final int mo53685Va(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel y = mo53694y();
        y.writeInt(7);
        y.writeString(str);
        y.writeString(str2);
        zzg.m63924b(y, bundle);
        Parcel t1 = mo53693t1(10, y);
        int readInt = t1.readInt();
        t1.recycle();
        return readInt;
    }

    /* renamed from: Z2 */
    public final Bundle mo53686Z2(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel y = mo53694y();
        y.writeInt(8);
        y.writeString(str);
        y.writeString(str2);
        y.writeString(BillingClient.SkuType.SUBS);
        zzg.m63924b(y, bundle);
        Parcel t1 = mo53693t1(801, y);
        Bundle bundle2 = (Bundle) zzg.m63923a(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle2;
    }

    /* renamed from: b6 */
    public final Bundle mo53687b6(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel y = mo53694y();
        y.writeInt(9);
        y.writeString(str);
        y.writeString(str2);
        y.writeString(str3);
        zzg.m63924b(y, bundle);
        Parcel t1 = mo53693t1(11, y);
        Bundle bundle2 = (Bundle) zzg.m63923a(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle2;
    }

    /* renamed from: c7 */
    public final Bundle mo53688c7(int i, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel y = mo53694y();
        y.writeInt(10);
        y.writeString(str);
        y.writeString(str2);
        zzg.m63924b(y, bundle);
        zzg.m63924b(y, bundle2);
        Parcel t1 = mo53693t1(TypedValues.Custom.TYPE_FLOAT, y);
        Bundle bundle3 = (Bundle) zzg.m63923a(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle3;
    }

    /* renamed from: n3 */
    public final Bundle mo53689n3(int i, String str, String str2, String str3) throws RemoteException {
        Parcel y = mo53694y();
        y.writeInt(3);
        y.writeString(str);
        y.writeString(str2);
        y.writeString(str3);
        Parcel t1 = mo53693t1(4, y);
        Bundle bundle = (Bundle) zzg.m63923a(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle;
    }

    /* renamed from: w7 */
    public final Bundle mo53690w7(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel y = mo53694y();
        y.writeInt(9);
        y.writeString(str);
        y.writeString(str2);
        zzg.m63924b(y, bundle);
        Parcel t1 = mo53693t1(12, y);
        Bundle bundle2 = (Bundle) zzg.m63923a(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle2;
    }

    /* renamed from: zb */
    public final Bundle mo53691zb(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel y = mo53694y();
        y.writeInt(9);
        y.writeString(str);
        y.writeString(str2);
        zzg.m63924b(y, bundle);
        Parcel t1 = mo53693t1(TypedValues.Custom.TYPE_COLOR, y);
        Bundle bundle2 = (Bundle) zzg.m63923a(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle2;
    }
}
