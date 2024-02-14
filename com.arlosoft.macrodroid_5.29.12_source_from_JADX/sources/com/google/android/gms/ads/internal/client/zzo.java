package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zzo implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ zzo f2017a = new zzo();

    private /* synthetic */ zzo() {
    }

    public final int compare(Object obj, Object obj2) {
        List list = RequestConfiguration.f1702e;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
