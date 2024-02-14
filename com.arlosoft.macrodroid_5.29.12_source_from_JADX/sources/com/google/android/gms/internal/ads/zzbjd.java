package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbjd {
    /* renamed from: a */
    static List m43544a() {
        ArrayList arrayList = new ArrayList();
        m43546c(arrayList, zzbke.m43646c("gad:dynamite_module:experiment_id", ""));
        m43546c(arrayList, zzbkp.f27419a);
        m43546c(arrayList, zzbkp.f27420b);
        m43546c(arrayList, zzbkp.f27421c);
        m43546c(arrayList, zzbkp.f27422d);
        m43546c(arrayList, zzbkp.f27423e);
        m43546c(arrayList, zzbkp.f27439u);
        m43546c(arrayList, zzbkp.f27424f);
        m43546c(arrayList, zzbkp.f27431m);
        m43546c(arrayList, zzbkp.f27432n);
        m43546c(arrayList, zzbkp.f27433o);
        m43546c(arrayList, zzbkp.f27434p);
        m43546c(arrayList, zzbkp.f27435q);
        m43546c(arrayList, zzbkp.f27436r);
        m43546c(arrayList, zzbkp.f27437s);
        m43546c(arrayList, zzbkp.f27438t);
        m43546c(arrayList, zzbkp.f27425g);
        m43546c(arrayList, zzbkp.f27426h);
        m43546c(arrayList, zzbkp.f27427i);
        m43546c(arrayList, zzbkp.f27428j);
        m43546c(arrayList, zzbkp.f27429k);
        m43546c(arrayList, zzbkp.f27430l);
        return arrayList;
    }

    /* renamed from: b */
    static List m43545b() {
        ArrayList arrayList = new ArrayList();
        m43546c(arrayList, zzblc.f27493a);
        return arrayList;
    }

    /* renamed from: c */
    private static void m43546c(List list, zzbke zzbke) {
        String str = (String) zzbke.mo42728e();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
