package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.3 */
public abstract class AssetPackStates {
    /* renamed from: c */
    public static AssetPackStates m70468c(Bundle bundle, zzco zzco, zzeb zzeb) {
        return m70471f(bundle, zzco, zzeb, new ArrayList(), zzbf.f51274a);
    }

    /* renamed from: d */
    public static AssetPackStates m70469d(Bundle bundle, zzco zzco, zzeb zzeb, zzbe zzbe) {
        return m70471f(bundle, zzco, zzeb, new ArrayList(), zzbe);
    }

    /* renamed from: e */
    public static AssetPackStates m70470e(Bundle bundle, zzco zzco, zzeb zzeb, List list) {
        return m70471f(bundle, zzco, zzeb, list, zzbf.f51274a);
    }

    /* renamed from: f */
    private static AssetPackStates m70471f(Bundle bundle, zzco zzco, zzeb zzeb, List list, zzbe zzbe) {
        Bundle bundle2 = bundle;
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, AssetPackState.m70458i(bundle2, str, zzco, zzeb, zzbe));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            hashMap.put(str2, AssetPackState.m70457h(str2, 4, 0, 0, 0, 0.0d, 1, "", ""));
        }
        return new zzbo(bundle2.getLong("total_bytes_to_download"), hashMap);
    }

    /* renamed from: a */
    public abstract Map<String, AssetPackState> mo59585a();

    /* renamed from: b */
    public abstract long mo59586b();
}
