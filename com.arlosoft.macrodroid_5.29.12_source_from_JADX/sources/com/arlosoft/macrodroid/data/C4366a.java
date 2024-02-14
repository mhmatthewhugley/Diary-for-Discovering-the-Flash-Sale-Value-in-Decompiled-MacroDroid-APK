package com.arlosoft.macrodroid.data;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p148q0.C8151a;

/* renamed from: com.arlosoft.macrodroid.data.a */
/* compiled from: Weather */
public class C4366a {

    /* renamed from: a */
    public final List<C4368b> f11114a = new ArrayList();

    /* renamed from: b */
    public final C4371e f11115b = new C4371e();

    /* renamed from: c */
    public final C4372f f11116c = new C4372f();

    /* renamed from: d */
    public C4369c f11117d = new C4369c();

    /* renamed from: e */
    public C4370d f11118e = new C4370d();

    /* renamed from: f */
    private final C4367a f11119f = new C4367a();

    /* renamed from: g */
    private int f11120g;

    /* renamed from: h */
    public int f11121h;

    /* renamed from: i */
    public int f11122i;

    /* renamed from: com.arlosoft.macrodroid.data.a$a */
    /* compiled from: Weather */
    public class C4367a {

        /* renamed from: a */
        private int f11123a;

        public C4367a() {
        }

        /* renamed from: a */
        public void mo28620a(int i) {
            this.f11123a = i;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.data.a$b */
    /* compiled from: Weather */
    public static class C4368b {

        /* renamed from: a */
        private int f11125a;

        /* renamed from: b */
        private String f11126b;

        /* renamed from: c */
        private String f11127c;

        /* renamed from: d */
        private String f11128d;

        /* renamed from: a */
        public String mo28621a() {
            return this.f11127c;
        }

        /* renamed from: b */
        public int mo28622b() {
            return this.f11125a;
        }

        /* renamed from: c */
        public void mo28623c(String str) {
            this.f11126b = str;
        }

        /* renamed from: d */
        public void mo28624d(String str) {
            this.f11127c = str;
        }

        /* renamed from: e */
        public void mo28625e(String str) {
            this.f11128d = str;
        }

        /* renamed from: f */
        public void mo28626f(int i) {
            this.f11125a = i;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.data.a$c */
    /* compiled from: Weather */
    public class C4369c {
        public C4369c() {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.data.a$d */
    /* compiled from: Weather */
    public class C4370d {
        public C4370d() {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.data.a$e */
    /* compiled from: Weather */
    public class C4371e {

        /* renamed from: a */
        private double f11131a;

        /* renamed from: b */
        private double f11132b;

        /* renamed from: c */
        private double f11133c;

        public C4371e() {
        }

        /* renamed from: a */
        private double m17327a(double d) {
            return ((d * 9.0d) / 5.0d) + 32.0d;
        }

        /* renamed from: b */
        public double mo28627b(boolean z) {
            double d = this.f11131a - 273.15d;
            if (z) {
                return d;
            }
            return m17327a(d);
        }

        /* renamed from: c */
        public void mo28628c(double d) {
            this.f11133c = d;
        }

        /* renamed from: d */
        public void mo28629d(double d) {
            this.f11132b = d;
        }

        /* renamed from: e */
        public void mo28630e(double d) {
            this.f11131a = d;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.data.a$f */
    /* compiled from: Weather */
    public class C4372f {

        /* renamed from: a */
        private double f11135a;

        /* renamed from: b */
        private double f11136b;

        public C4372f() {
        }

        /* renamed from: a */
        public double mo28631a() {
            return this.f11135a;
        }

        /* renamed from: b */
        public void mo28632b(double d) {
            this.f11136b = d;
        }

        /* renamed from: c */
        public void mo28633c(double d) {
            this.f11135a = d;
        }
    }

    /* renamed from: a */
    public static C4366a m17318a(String str) {
        C4366a aVar = new C4366a();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("weather");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                C4368b bVar = new C4368b();
                bVar.mo28626f(jSONObject2.getInt("id"));
                bVar.mo28624d(jSONObject2.getString("description"));
                bVar.mo28623c(jSONObject2.getString("main"));
                bVar.mo28625e(jSONObject2.getString("icon"));
                aVar.f11114a.add(bVar);
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("main");
            aVar.f11121h = jSONObject3.getInt("humidity");
            aVar.f11120g = jSONObject3.getInt("pressure");
            aVar.f11115b.mo28628c(jSONObject3.getDouble("temp_max"));
            aVar.f11115b.mo28629d(jSONObject3.getDouble("temp_min"));
            aVar.f11115b.mo28630e(jSONObject3.getDouble("temp"));
            JSONObject jSONObject4 = jSONObject.getJSONObject("wind");
            aVar.f11116c.mo28633c(jSONObject4.getDouble("speed"));
            aVar.f11122i = jSONObject4.getInt("deg");
            if (jSONObject4.has("deg")) {
                aVar.f11116c.mo28632b(jSONObject4.getDouble("deg"));
            }
            aVar.f11119f.mo28620a(jSONObject.getJSONObject("clouds").getInt("all"));
            return aVar;
        } catch (JSONException e) {
            C8151a.m33860a("JSON = " + str);
            C8151a.m33873n(new RuntimeException("Weather parse problem: " + e.toString()));
            return null;
        }
    }

    /* renamed from: b */
    public WeatherContextInfo mo28619b() {
        return new WeatherContextInfo(this.f11115b.mo28627b(true), this.f11115b.mo28627b(false), this.f11116c.mo28631a(), this.f11121h, this.f11122i, this.f11114a);
    }
}
