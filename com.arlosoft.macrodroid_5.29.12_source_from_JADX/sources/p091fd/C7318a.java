package p091fd;

import android.os.Build;
import p097gd.C7354d;

/* renamed from: fd.a */
/* compiled from: AndroidModel */
public class C7318a {

    /* renamed from: a */
    String f17899a;

    /* renamed from: b */
    String f17900b;

    /* renamed from: c */
    String f17901c;

    /* renamed from: d */
    String f17902d;

    public C7318a(String str, String str2, String str3, String str4) {
        this.f17899a = str;
        this.f17900b = str2;
        this.f17901c = str3;
        this.f17902d = str4;
    }

    /* renamed from: a */
    public static C7318a m30225a() {
        return new C7318a(Build.VERSION.RELEASE, Build.ID, Build.MODEL, Build.MANUFACTURER);
    }

    /* renamed from: b */
    public String mo37271b() {
        return this.f17900b;
    }

    /* renamed from: c */
    public String mo37272c() {
        return this.f17902d;
    }

    /* renamed from: d */
    public String mo37273d() {
        return this.f17901c;
    }

    /* renamed from: e */
    public String mo37274e() {
        return this.f17899a;
    }

    /* renamed from: f */
    public int mo37275f(C7318a aVar) {
        int equalsIgnoreCase = this.f17902d.equalsIgnoreCase(aVar.f17902d);
        if (equalsIgnoreCase == 1 && this.f17901c.equals(aVar.f17901c)) {
            equalsIgnoreCase = 2;
        }
        if (equalsIgnoreCase == 2 && this.f17900b.equals(aVar.f17900b)) {
            equalsIgnoreCase = 3;
        }
        if (equalsIgnoreCase == 3 && this.f17899a.equals(aVar.f17899a)) {
            equalsIgnoreCase = 4;
        }
        C7354d.m30376a("AndroidModel", "Score is %s for %s compared to %s", Integer.valueOf(equalsIgnoreCase), toString(), aVar);
        return equalsIgnoreCase;
    }

    public String toString() {
        return "" + this.f17902d + ";" + this.f17901c + ";" + this.f17900b + ";" + this.f17899a;
    }
}
