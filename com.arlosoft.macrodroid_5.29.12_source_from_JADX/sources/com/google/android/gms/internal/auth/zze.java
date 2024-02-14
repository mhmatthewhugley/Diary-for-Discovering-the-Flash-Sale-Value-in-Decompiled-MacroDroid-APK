package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public interface zze extends IInterface {
    /* renamed from: H6 */
    AccountChangeEventsResponse mo48563H6(AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException;

    /* renamed from: g6 */
    Bundle mo48564g6(Account account, String str, Bundle bundle) throws RemoteException;

    /* renamed from: h1 */
    Bundle mo48565h1(String str, Bundle bundle) throws RemoteException;

    /* renamed from: o */
    Bundle mo48566o(String str) throws RemoteException;

    /* renamed from: x5 */
    Bundle mo48567x5(Account account) throws RemoteException;
}
