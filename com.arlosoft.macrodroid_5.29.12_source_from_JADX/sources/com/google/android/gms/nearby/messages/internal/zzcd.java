package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzcd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        IBinder iBinder = null;
        Strategy strategy = null;
        IBinder iBinder2 = null;
        MessageFilter messageFilter = null;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        IBinder iBinder3 = null;
        ClientAppContext clientAppContext = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 2:
                    iBinder = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 3:
                    strategy = (Strategy) SafeParcelReader.m4546p(parcel2, E, Strategy.CREATOR);
                    break;
                case 4:
                    iBinder2 = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 5:
                    messageFilter = (MessageFilter) SafeParcelReader.m4546p(parcel2, E, MessageFilter.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) SafeParcelReader.m4546p(parcel2, E, PendingIntent.CREATOR);
                    break;
                case 7:
                    i2 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 8:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 9:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 10:
                    bArr = SafeParcelReader.m4537g(parcel2, E);
                    break;
                case 11:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 12:
                    iBinder3 = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 13:
                    z2 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 14:
                    clientAppContext = (ClientAppContext) SafeParcelReader.m4546p(parcel2, E, ClientAppContext.CREATOR);
                    break;
                case 15:
                    z3 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 16:
                    i3 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 17:
                    i4 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new SubscribeRequest(i, iBinder, strategy, iBinder2, messageFilter, pendingIntent, i2, str, str2, bArr, z, iBinder3, z2, clientAppContext, z3, i3, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SubscribeRequest[i];
    }
}
