package com.arlosoft.macrodroid.common;

import androidx.annotation.NonNull;
import java.util.Date;

/* renamed from: com.arlosoft.macrodroid.common.l */
/* compiled from: CalendarEvent */
public class C4034l implements Comparable<C4034l> {

    /* renamed from: a */
    private String f10579a;

    /* renamed from: c */
    private String f10580c;

    /* renamed from: d */
    private String f10581d;

    /* renamed from: f */
    private Date f10582f;

    /* renamed from: g */
    private Date f10583g;

    /* renamed from: o */
    private boolean f10584o;

    /* renamed from: p */
    private int f10585p;

    /* renamed from: s */
    private String f10586s;

    public C4034l(String str, String str2, Date date, Date date2, boolean z, int i, String str3, String str4) {
        m15925t(str);
        m15923o(str2);
        m15922n(date);
        m15924q(date2);
        m15920l(z);
        m15921m(i);
        mo27943s(str3);
        mo27942r(str4);
    }

    /* renamed from: b */
    private boolean m15919b(Date date, Date date2) {
        if (date == null) {
            return date2 == null;
        }
        if (date2 != null) {
            return date.equals(date2);
        }
        return false;
    }

    /* renamed from: l */
    private void m15920l(boolean z) {
        this.f10584o = z;
    }

    /* renamed from: m */
    private void m15921m(int i) {
        this.f10585p = i;
    }

    /* renamed from: n */
    private void m15922n(Date date) {
        this.f10582f = date;
    }

    /* renamed from: o */
    private void m15923o(String str) {
        this.f10580c = str;
    }

    /* renamed from: q */
    private void m15924q(Date date) {
        this.f10583g = date;
    }

    /* renamed from: t */
    private void m15925t(String str) {
        this.f10579a = str;
    }

    /* renamed from: d */
    public int compareTo(@NonNull C4034l lVar) {
        return mo27936f().compareTo(lVar.f10582f);
    }

    /* renamed from: e */
    public int mo27934e() {
        return this.f10585p;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == null || !(obj instanceof C4034l)) {
            return false;
        }
        C4034l lVar = (C4034l) obj;
        if (this.f10586s == lVar.f10586s) {
            return true;
        }
        if ((this.f10579a == null && lVar.mo27940j() != null) || ((this.f10579a != null && lVar.mo27940j() == null) || ((str = this.f10579a) != null && !str.equals(lVar.mo27940j())))) {
            return false;
        }
        if (((this.f10580c != null || lVar.mo27937g() != null) && ((this.f10580c == null && lVar.mo27937g() != null) || ((this.f10580c != null && lVar.mo27937g() == null) || ((str2 = this.f10580c) != null && !str2.equals(lVar.mo27937g()))))) || !m15919b(this.f10582f, lVar.mo27936f()) || !m15919b(this.f10583g, lVar.mo27939i()) || this.f10584o != lVar.mo27941k() || this.f10585p != lVar.f10585p) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Date mo27936f() {
        return this.f10582f;
    }

    /* renamed from: g */
    public String mo27937g() {
        return this.f10580c;
    }

    public String getLocation() {
        return this.f10581d;
    }

    /* renamed from: i */
    public Date mo27939i() {
        return this.f10583g;
    }

    /* renamed from: j */
    public String mo27940j() {
        return this.f10579a;
    }

    /* renamed from: k */
    public boolean mo27941k() {
        return this.f10584o;
    }

    /* renamed from: r */
    public void mo27942r(String str) {
        this.f10586s = str;
    }

    /* renamed from: s */
    public void mo27943s(String str) {
        this.f10581d = str;
    }

    public String toString() {
        return mo27940j() + " " + mo27936f() + " " + mo27939i() + " " + mo27941k();
    }
}
