package org.altbeacon.beacon.service;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p097gd.C7354d;

/* renamed from: org.altbeacon.beacon.service.l */
/* compiled from: RunningAverageRssiFilter */
public class C16021l implements C16020k {

    /* renamed from: b */
    private static long f65936b = 20000;

    /* renamed from: a */
    private ArrayList<C16023b> f65937a = new ArrayList<>();

    /* renamed from: org.altbeacon.beacon.service.l$b */
    /* compiled from: RunningAverageRssiFilter */
    private class C16023b implements Comparable<C16023b> {

        /* renamed from: a */
        Integer f65938a;

        /* renamed from: c */
        long f65939c;

        private C16023b() {
        }

        /* renamed from: b */
        public int compareTo(C16023b bVar) {
            return this.f65938a.compareTo(bVar.f65938a);
        }
    }

    /* renamed from: e */
    private synchronized void m96592e() {
        ArrayList<C16023b> arrayList = new ArrayList<>();
        Iterator<C16023b> it = this.f65937a.iterator();
        while (it.hasNext()) {
            C16023b next = it.next();
            if (SystemClock.elapsedRealtime() - next.f65939c < f65936b) {
                arrayList.add(next);
            }
        }
        this.f65937a = arrayList;
        Collections.sort(arrayList);
    }

    /* renamed from: a */
    public double mo76477a() {
        int i;
        m96592e();
        int size = this.f65937a.size();
        int i2 = size - 1;
        if (size > 2) {
            int i3 = size / 10;
            i = i3 + 1;
            i2 = (size - i3) - 2;
        } else {
            i = 0;
        }
        double d = 0.0d;
        for (int i4 = i; i4 <= i2; i4++) {
            d += (double) this.f65937a.get(i4).f65938a.intValue();
        }
        double d2 = d / ((double) ((i2 - i) + 1));
        C7354d.m30376a("RunningAverageRssiFilter", "Running average mRssi based on %s measurements: %s", Integer.valueOf(size), Double.valueOf(d2));
        return d2;
    }

    /* renamed from: b */
    public void mo76478b(Integer num) {
        C16023b bVar = new C16023b();
        bVar.f65938a = num;
        bVar.f65939c = SystemClock.elapsedRealtime();
        this.f65937a.add(bVar);
    }

    /* renamed from: c */
    public int mo76479c() {
        return this.f65937a.size();
    }

    /* renamed from: d */
    public boolean mo76480d() {
        return this.f65937a.size() == 0;
    }
}
