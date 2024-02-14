package com.google.android.gms.internal.nearby;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzlf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        BluetoothDevice bluetoothDevice = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 2) {
                str2 = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 3) {
                str3 = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 4) {
                bluetoothDevice = (BluetoothDevice) SafeParcelReader.m4546p(parcel, E, BluetoothDevice.CREATOR);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                bArr = SafeParcelReader.m4537g(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzle(str, str2, str3, bluetoothDevice, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzle[i];
    }
}
