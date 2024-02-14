package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzcof extends zzasa implements zzcog {
    public zzcof() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzasb.m42225c(parcel);
                mo43021n0((Bundle) zzasb.m42223a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                zzasb.m42225c(parcel);
                Bundle g0 = mo43016g0((Bundle) zzasb.m42223a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzasb.m42228f(parcel2, g0);
                return true;
            case 3:
                zzasb.m42225c(parcel);
                mo43019ka(parcel.readString(), parcel.readString(), (Bundle) zzasb.m42223a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo43007N1(readString, readString2, t1);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean h = zzasb.m42230h(parcel);
                zzasb.m42225c(parcel);
                Map Wa = mo43008Wa(readString3, readString4, h);
                parcel2.writeNoException();
                parcel2.writeMap(Wa);
                return true;
            case 6:
                String readString5 = parcel.readString();
                zzasb.m42225c(parcel);
                int t = mo43023t(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(t);
                return true;
            case 7:
                zzasb.m42225c(parcel);
                mo43018k0((Bundle) zzasb.m42223a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zzasb.m42225c(parcel);
                mo43017hb(parcel.readString(), parcel.readString(), (Bundle) zzasb.m42223a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                zzasb.m42225c(parcel);
                List q4 = mo43022q4(readString6, readString7);
                parcel2.writeNoException();
                parcel2.writeList(q4);
                return true;
            case 10:
                String c = mo43012c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 11:
                String g = mo43015g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 12:
                long a = mo43010a();
                parcel2.writeNoException();
                parcel2.writeLong(a);
                return true;
            case 13:
                String readString8 = parcel.readString();
                zzasb.m42225c(parcel);
                mo43020m0(readString8);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString9 = parcel.readString();
                zzasb.m42225c(parcel);
                mo43009Z(readString9);
                parcel2.writeNoException();
                return true;
            case 15:
                IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                zzasb.m42225c(parcel);
                mo43024u4(t12, readString10, readString11);
                parcel2.writeNoException();
                return true;
            case 16:
                String e = mo43013e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 17:
                String f = mo43014f();
                parcel2.writeNoException();
                parcel2.writeString(f);
                return true;
            case 18:
                String b = mo43011b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 19:
                zzasb.m42225c(parcel);
                mo43025x1((Bundle) zzasb.m42223a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
