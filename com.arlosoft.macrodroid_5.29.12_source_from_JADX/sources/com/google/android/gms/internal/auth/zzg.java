package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public final class zzg extends zza implements zze {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    /* renamed from: H6 */
    public final AccountChangeEventsResponse mo48563H6(AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException {
        Parcel y = mo48537y();
        zzc.m55794d(y, accountChangeEventsRequest);
        Parcel t1 = mo48536t1(3, y);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) zzc.m55792b(t1, AccountChangeEventsResponse.CREATOR);
        t1.recycle();
        return accountChangeEventsResponse;
    }

    /* renamed from: g6 */
    public final Bundle mo48564g6(Account account, String str, Bundle bundle) throws RemoteException {
        Parcel y = mo48537y();
        zzc.m55794d(y, account);
        y.writeString(str);
        zzc.m55794d(y, bundle);
        Parcel t1 = mo48536t1(5, y);
        Bundle bundle2 = (Bundle) zzc.m55792b(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle2;
    }

    /* renamed from: h1 */
    public final Bundle mo48565h1(String str, Bundle bundle) throws RemoteException {
        Parcel y = mo48537y();
        y.writeString(str);
        zzc.m55794d(y, bundle);
        Parcel t1 = mo48536t1(2, y);
        Bundle bundle2 = (Bundle) zzc.m55792b(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle2;
    }

    /* renamed from: o */
    public final Bundle mo48566o(String str) throws RemoteException {
        Parcel y = mo48537y();
        y.writeString(str);
        Parcel t1 = mo48536t1(8, y);
        Bundle bundle = (Bundle) zzc.m55792b(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle;
    }

    /* renamed from: x5 */
    public final Bundle mo48567x5(Account account) throws RemoteException {
        Parcel y = mo48537y();
        zzc.m55794d(y, account);
        Parcel t1 = mo48536t1(7, y);
        Bundle bundle = (Bundle) zzc.m55792b(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle;
    }
}
