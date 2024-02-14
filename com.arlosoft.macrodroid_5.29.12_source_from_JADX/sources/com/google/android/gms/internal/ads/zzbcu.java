package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import org.apache.commons.p353io.IOUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbcu {

    /* renamed from: a */
    private final int f26633a;

    /* renamed from: b */
    private final zzbcr f26634b = new zzbcw();

    public zzbcu(int i) {
        this.f26633a = i;
    }

    /* renamed from: a */
    public final String mo42486a(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append(10);
        }
        String[] split = sb.toString().split(IOUtils.LINE_SEPARATOR_UNIX);
        if (split.length == 0) {
            return "";
        }
        zzbct zzbct = new zzbct();
        PriorityQueue priorityQueue = new PriorityQueue(this.f26633a, new zzbcs(this));
        for (String b : split) {
            String[] b2 = zzbcv.m43144b(b, false);
            if (b2.length != 0) {
                zzbcz.m43149c(b2, this.f26633a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbct.f26632b.write(this.f26634b.mo42483b(((zzbcy) it.next()).f26637b));
            } catch (IOException e) {
                zzcgp.m45227e("Error while writing hash to byteStream", e);
            }
        }
        return zzbct.toString();
    }
}
