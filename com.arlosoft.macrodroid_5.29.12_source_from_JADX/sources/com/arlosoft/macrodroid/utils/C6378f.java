package com.arlosoft.macrodroid.utils;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.annotation.NonNull;
import com.arlosoft.macrodroid.common.C4013g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.utils.f */
/* compiled from: AppUtils */
public class C6378f {
    /* renamed from: a */
    public static List<ResolveInfo> m24624a(@NonNull PackageManager packageManager, @NonNull String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(str);
        return packageManager.queryIntentActivities(intent, 64);
    }

    /* renamed from: b */
    public static List<C4013g> m24625b(List<C4013g> list, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C4013g gVar = (C4013g) it.next();
            Iterator<String> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().equals(gVar.f10397b)) {
                        it.remove();
                        arrayList.add(gVar);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        arrayList2.addAll(0, arrayList);
        return arrayList2;
    }
}
