package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p204firebaseauthapi.zzaac;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzba {
    /* renamed from: a */
    public static MultiFactorInfo m6200a(zzaac zzaac) {
        if (zzaac != null && !TextUtils.isEmpty(zzaac.mo48736p2())) {
            return new PhoneMultiFactorInfo(zzaac.mo48735o2(), zzaac.mo48734n2(), zzaac.mo48733l2(), Preconditions.m4484g(zzaac.mo48736p2()));
        }
        return null;
    }

    /* renamed from: b */
    public static List m6201b(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo a = m6200a((zzaac) it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}
