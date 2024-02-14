package org.altbeacon.beacon.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.altbeacon.beacon.Beacon;
import p097gd.C7354d;

/* renamed from: org.altbeacon.beacon.service.q */
/* compiled from: Stats */
public class C16031q {

    /* renamed from: g */
    private static final C16031q f65974g = new C16031q();

    /* renamed from: h */
    private static final SimpleDateFormat f65975h = new SimpleDateFormat("HH:mm:ss.SSS");

    /* renamed from: a */
    private ArrayList<C16032a> f65976a;

    /* renamed from: b */
    private long f65977b = 0;

    /* renamed from: c */
    private boolean f65978c;

    /* renamed from: d */
    private boolean f65979d;

    /* renamed from: e */
    private boolean f65980e;

    /* renamed from: f */
    private C16032a f65981f;

    /* renamed from: org.altbeacon.beacon.service.q$a */
    /* compiled from: Stats */
    public static class C16032a {

        /* renamed from: a */
        public long f65982a = 0;

        /* renamed from: b */
        public long f65983b;

        /* renamed from: c */
        public Date f65984c;

        /* renamed from: d */
        public Date f65985d;

        /* renamed from: e */
        public Date f65986e;

        /* renamed from: f */
        public Date f65987f;
    }

    private C16031q() {
        mo76530a();
    }

    /* renamed from: b */
    private String m96659b(Date date) {
        String str = "";
        if (date != null) {
            SimpleDateFormat simpleDateFormat = f65975h;
            synchronized (simpleDateFormat) {
                str = simpleDateFormat.format(date);
            }
        }
        return str;
    }

    /* renamed from: c */
    public static C16031q m96660c() {
        return f65974g;
    }

    /* renamed from: f */
    private void m96661f(C16032a aVar, boolean z) {
        if (z) {
            C7354d.m30376a("Stats", "sample start time, sample stop time, first detection time, last detection time, max millis between detections, detection count", new Object[0]);
        }
        C7354d.m30376a("Stats", "%s, %s, %s, %s, %s, %s", m96659b(aVar.f65986e), m96659b(aVar.f65987f), m96659b(aVar.f65984c), m96659b(aVar.f65985d), Long.valueOf(aVar.f65983b), Long.valueOf(aVar.f65982a));
    }

    /* renamed from: g */
    private void m96662g() {
        boolean z = true;
        C7354d.m30376a("Stats", "--- Stats for %s samples", Integer.valueOf(this.f65976a.size()));
        Iterator<C16032a> it = this.f65976a.iterator();
        while (it.hasNext()) {
            m96661f(it.next(), z);
            z = false;
        }
    }

    /* renamed from: i */
    private void m96663i() {
        if (this.f65981f == null || (this.f65977b > 0 && new Date().getTime() - this.f65981f.f65986e.getTime() >= this.f65977b)) {
            mo76533h();
        }
    }

    /* renamed from: a */
    public void mo76530a() {
        this.f65976a = new ArrayList<>();
        mo76533h();
    }

    /* renamed from: d */
    public boolean mo76531d() {
        return this.f65980e;
    }

    /* renamed from: e */
    public void mo76532e(Beacon beacon) {
        m96663i();
        C16032a aVar = this.f65981f;
        aVar.f65982a++;
        if (aVar.f65984c == null) {
            aVar.f65984c = new Date();
        }
        if (this.f65981f.f65985d != null) {
            long time = new Date().getTime() - this.f65981f.f65985d.getTime();
            C16032a aVar2 = this.f65981f;
            if (time > aVar2.f65983b) {
                aVar2.f65983b = time;
            }
        }
        this.f65981f.f65985d = new Date();
    }

    /* renamed from: h */
    public void mo76533h() {
        Date date = new Date();
        if (this.f65981f != null) {
            date = new Date(this.f65981f.f65986e.getTime() + this.f65977b);
            C16032a aVar = this.f65981f;
            aVar.f65987f = date;
            if (!this.f65979d && this.f65978c) {
                m96661f(aVar, true);
            }
        }
        C16032a aVar2 = new C16032a();
        this.f65981f = aVar2;
        aVar2.f65986e = date;
        this.f65976a.add(aVar2);
        if (this.f65979d) {
            m96662g();
        }
    }
}
