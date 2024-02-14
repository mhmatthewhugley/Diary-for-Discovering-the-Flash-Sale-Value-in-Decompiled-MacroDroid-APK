package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzbo;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public abstract class zzdw extends zzbn implements zzdx {
    public zzdw() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo50775y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzbo.m59532c(parcel);
                mo55039D3((zzaw) zzbo.m59530a(parcel, zzaw.CREATOR), (zzq) zzbo.m59530a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                zzbo.m59532c(parcel);
                mo55049h4((zzkw) zzbo.m59530a(parcel, zzkw.CREATOR), (zzq) zzbo.m59530a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                zzbo.m59532c(parcel);
                mo55041M3((zzq) zzbo.m59530a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbo.m59532c(parcel);
                mo55055S9((zzaw) zzbo.m59530a(parcel, zzaw.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbo.m59532c(parcel);
                mo55046Z6((zzq) zzbo.m59530a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                boolean g = zzbo.m59536g(parcel);
                zzbo.m59532c(parcel);
                List n2 = mo55051n2((zzq) zzbo.m59530a(parcel, zzq.CREATOR), g);
                parcel2.writeNoException();
                parcel2.writeTypedList(n2);
                return true;
            case 9:
                String readString3 = parcel.readString();
                zzbo.m59532c(parcel);
                byte[] F7 = mo55040F7((zzaw) zzbo.m59530a(parcel, zzaw.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(F7);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                zzbo.m59532c(parcel);
                mo55047a4(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbo.m59532c(parcel);
                String O7 = mo55044O7((zzq) zzbo.m59530a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(O7);
                return true;
            case 12:
                zzbo.m59532c(parcel);
                mo55042Na((zzac) zzbo.m59530a(parcel, zzac.CREATOR), (zzq) zzbo.m59530a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzbo.m59532c(parcel);
                mo55056i2((zzac) zzbo.m59530a(parcel, zzac.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzbo.m59532c(parcel);
                List S4 = mo55045S4(parcel.readString(), parcel.readString(), zzbo.m59536g(parcel), (zzq) zzbo.m59530a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(S4);
                return true;
            case 15:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean g2 = zzbo.m59536g(parcel);
                zzbo.m59532c(parcel);
                List t7 = mo55053t7(readString7, readString8, readString9, g2);
                parcel2.writeNoException();
                parcel2.writeTypedList(t7);
                return true;
            case 16:
                zzbo.m59532c(parcel);
                List t9 = mo55054t9(parcel.readString(), parcel.readString(), (zzq) zzbo.m59530a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(t9);
                return true;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                zzbo.m59532c(parcel);
                List c8 = mo55048c8(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(c8);
                return true;
            case 18:
                zzbo.m59532c(parcel);
                mo55052t5((zzq) zzbo.m59530a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                zzbo.m59532c(parcel);
                mo55050k7((Bundle) zzbo.m59530a(parcel, Bundle.CREATOR), (zzq) zzbo.m59530a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                zzbo.m59532c(parcel);
                mo55043O4((zzq) zzbo.m59530a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
