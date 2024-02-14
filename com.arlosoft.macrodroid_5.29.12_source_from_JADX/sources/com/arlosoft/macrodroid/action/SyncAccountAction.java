package com.arlosoft.macrodroid.action;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorDescription;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SyncAdapterType;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.WindowManager;
import android.widget.ListView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.util.Pair;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p080e0.C7262b;
import p128m0.C7797m4;
import p319lc.C15626c;

public class SyncAccountAction extends Action {
    public static final Parcelable.Creator<SyncAccountAction> CREATOR = new C2707a();
    private static int REQUEST_CODE_GET_ACCOUNTS = 2;
    private Account m_account;
    private String m_accountName;
    private List<String> m_authorities;

    /* renamed from: com.arlosoft.macrodroid.action.SyncAccountAction$a */
    class C2707a implements Parcelable.Creator<SyncAccountAction> {
        C2707a() {
        }

        /* renamed from: a */
        public SyncAccountAction createFromParcel(Parcel parcel) {
            return new SyncAccountAction(parcel, (C2707a) null);
        }

        /* renamed from: b */
        public SyncAccountAction[] newArray(int i) {
            return new SyncAccountAction[i];
        }
    }

    /* synthetic */ SyncAccountAction(Parcel parcel, C2707a aVar) {
        this(parcel);
    }

    /* renamed from: m3 */
    private void m13182m3(Account account, List<String> list, String str) {
        int i;
        String[] strArr = (String[]) list.toArray(new String[0]);
        boolean[] zArr = new boolean[list.size()];
        if (account.equals(this.m_account)) {
            i = 0;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                for (String equals : this.m_authorities) {
                    if (equals.equals(strArr[i2])) {
                        zArr[i2] = true;
                        i++;
                    }
                }
            }
        } else {
            i = 0;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), C17542R$style.Theme_App_Dialog_Action_SmallerText);
        builder.setTitle((CharSequence) account.name);
        builder.setMultiChoiceItems((CharSequence[]) strArr, zArr, (DialogInterface.OnMultiChoiceClickListener) C3632yl.f9652a);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3605xl(this, strArr, account, str));
        AlertDialog create = builder.create();
        create.show();
        if (i == 0) {
            create.getButton(-1).setEnabled(false);
        }
    }

    /* renamed from: n3 */
    private Pair<Map<Account, List<String>>, Map<Account, String>> m13183n3() {
        Account[] accountArr;
        AuthenticatorDescription[] authenticatorDescriptionArr;
        Iterator<ApplicationInfo> it;
        AccountManager accountManager = AccountManager.get(mo27827K0());
        List<ApplicationInfo> installedApplications = mo27827K0().getPackageManager().getInstalledApplications(128);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Account[] accounts = accountManager.getAccounts();
        AuthenticatorDescription[] authenticatorTypes = accountManager.getAuthenticatorTypes();
        SyncAdapterType[] syncAdapterTypes = ContentResolver.getSyncAdapterTypes();
        Iterator<ApplicationInfo> it2 = installedApplications.iterator();
        while (it2.hasNext()) {
            try {
                PackageInfo packageInfo = mo27827K0().getPackageManager().getPackageInfo(it2.next().packageName, 8);
                if (packageInfo.providers != null) {
                    int i = 0;
                    while (true) {
                        ProviderInfo[] providerInfoArr = packageInfo.providers;
                        if (i >= providerInfoArr.length) {
                            break;
                        }
                        ProviderInfo providerInfo = providerInfoArr[i];
                        int i2 = 0;
                        while (i2 < syncAdapterTypes.length) {
                            SyncAdapterType syncAdapterType = syncAdapterTypes[i2];
                            if (providerInfo.authority.equals(syncAdapterType.authority)) {
                                int length = accounts.length;
                                int i3 = 0;
                                while (i3 < length) {
                                    Account account = accounts[i3];
                                    if (syncAdapterType.accountType.equals(account.type)) {
                                        if (hashMap.get(account) == null) {
                                            hashMap.put(account, new ArrayList());
                                        }
                                        ((List) hashMap.get(account)).add(providerInfo.authority);
                                        int length2 = authenticatorTypes.length;
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= length2) {
                                                break;
                                            }
                                            it = it2;
                                            try {
                                                AuthenticatorDescription authenticatorDescription = authenticatorTypes[i4];
                                                authenticatorDescriptionArr = authenticatorTypes;
                                                try {
                                                    accountArr = accounts;
                                                    try {
                                                        if (!authenticatorDescription.type.equals(account.type)) {
                                                            i4++;
                                                            it2 = it;
                                                            authenticatorTypes = authenticatorDescriptionArr;
                                                            accounts = accountArr;
                                                        } else if (account.type.equals("com.google")) {
                                                            hashMap2.put(account, "com.google.android.googlequicksearchbox");
                                                        } else {
                                                            hashMap2.put(account, authenticatorDescription.packageName);
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                } catch (Exception unused2) {
                                                }
                                            } catch (Exception unused3) {
                                                authenticatorDescriptionArr = authenticatorTypes;
                                            }
                                        }
                                        i3++;
                                        it2 = it;
                                        authenticatorTypes = authenticatorDescriptionArr;
                                        accounts = accountArr;
                                    }
                                    authenticatorDescriptionArr = authenticatorTypes;
                                    it = it2;
                                    accountArr = accounts;
                                    i3++;
                                    it2 = it;
                                    authenticatorTypes = authenticatorDescriptionArr;
                                    accounts = accountArr;
                                }
                            }
                            i2++;
                            it2 = it2;
                            authenticatorTypes = authenticatorTypes;
                            accounts = accounts;
                        }
                        AuthenticatorDescription[] authenticatorDescriptionArr2 = authenticatorTypes;
                        Iterator<ApplicationInfo> it3 = it2;
                        Account[] accountArr2 = accounts;
                        i++;
                    }
                }
            } catch (Exception unused4) {
            }
            authenticatorDescriptionArr = authenticatorTypes;
            it = it2;
            accountArr = accounts;
            it2 = it;
            authenticatorTypes = authenticatorDescriptionArr;
            accounts = accountArr;
        }
        return new Pair<>(hashMap, hashMap2);
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public static /* synthetic */ void m13184o3(DialogInterface dialogInterface, int i, boolean z) {
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        alertDialog.getButton(-1).setEnabled(alertDialog.getListView().getCheckedItemPositions().size() > 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void m13185p3(String[] strArr, Account account, String str, DialogInterface dialogInterface, int i) {
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        alertDialog.getListView().getCheckedItemPositions();
        SparseBooleanArray checkedItemPositions = alertDialog.getListView().getCheckedItemPositions();
        this.m_authorities.clear();
        for (int i2 = 0; i2 < checkedItemPositions.size(); i2++) {
            if (checkedItemPositions.valueAt(i2)) {
                this.m_authorities.add(strArr[checkedItemPositions.keyAt(i2)]);
            }
        }
        this.m_account = account;
        this.m_accountName = str;
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m13186q3(AppCompatDialog appCompatDialog, Pair pair, Account account, String str) {
        appCompatDialog.dismiss();
        List<String> list = (List) ((Map) pair.first).get(account);
        if (list.size() > 1) {
            m13182m3(account, list, str);
            return;
        }
        this.m_authorities = list;
        this.m_account = account;
        this.m_accountName = str;
        mo24689O1();
    }

    /* renamed from: r3 */
    private void m13187r3(Pair<Map<Account, List<String>>, Map<Account, String>> pair) {
        if (((Map) pair.first).keySet().size() == 0) {
            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.no_accounts_found, 0).show();
            return;
        }
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_account_chooser);
        appCompatDialog.setTitle((int) C17541R$string.action_sync_account_select_account);
        ((ListView) appCompatDialog.findViewById(C17532R$id.accounts_list)).setAdapter(new C7262b(j0, (Map) pair.second, new C3659zl(this, appCompatDialog, pair)));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        appCompatDialog.show();
        appCompatDialog.getWindow().setAttributes(layoutParams);
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = this.m_accountName;
        return str != null ? str : "";
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7797m4.m32569u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo25559a1());
        if (TextUtils.isEmpty(this.m_accountName)) {
            str = "";
        } else {
            str = " (" + this.m_accountName + ")";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        for (String requestSync : this.m_authorities) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("force", true);
            bundle.putBoolean("expedited", true);
            ContentResolver.requestSync(this.m_account, requestSync, bundle);
        }
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.GET_ACCOUNTS"};
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        if (i == REQUEST_CODE_GET_ACCOUNTS && i2 == -1) {
            m13187r3(m13183n3());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        if (mo27836X()) {
            if (Build.VERSION.SDK_INT >= 26) {
                SyncAdapterType[] syncAdapterTypes = ContentResolver.getSyncAdapterTypes();
                ArrayList arrayList = new ArrayList();
                for (SyncAdapterType syncAdapterType : syncAdapterTypes) {
                    arrayList.add(syncAdapterType.accountType);
                }
                mo27850j0().startActivityForResult(AccountManager.newChooseAccountIntent((Account) null, (List) null, (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String[]) null, (Bundle) null), REQUEST_CODE_GET_ACCOUNTS);
                return;
            }
            m13187r3(m13183n3());
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.m_account, i);
        parcel.writeStringList(this.m_authorities);
        parcel.writeString(this.m_accountName);
    }

    public SyncAccountAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SyncAccountAction() {
        this.m_authorities = new ArrayList();
    }

    private SyncAccountAction(Parcel parcel) {
        super(parcel);
        this.m_account = (Account) parcel.readParcelable(Account.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.m_authorities = arrayList;
        parcel.readStringList(arrayList);
        this.m_accountName = parcel.readString();
    }
}
