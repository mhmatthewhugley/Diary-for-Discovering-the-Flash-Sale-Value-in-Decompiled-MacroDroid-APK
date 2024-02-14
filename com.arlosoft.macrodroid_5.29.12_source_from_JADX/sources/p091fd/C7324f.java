package p091fd;

import android.content.Context;
import android.os.AsyncTask;
import android.provider.Settings;

/* renamed from: fd.f */
/* compiled from: ModelSpecificDistanceUpdater */
public class C7324f extends AsyncTask<Void, Void, Void> {

    /* renamed from: a */
    private Exception f17920a = null;

    /* renamed from: b */
    private String f17921b = null;

    /* renamed from: c */
    private String f17922c = null;

    /* renamed from: d */
    private Context f17923d;

    /* renamed from: e */
    private C7321d f17924e;

    /* renamed from: f */
    private C7325a f17925f;

    /* renamed from: fd.f$a */
    /* compiled from: ModelSpecificDistanceUpdater */
    interface C7325a {
        /* renamed from: a */
        void mo37284a(String str, Exception exc, int i);
    }

    public C7324f(Context context, String str, C7325a aVar) {
        this.f17923d = context;
        this.f17924e = new C7321d(str, m30257e());
        this.f17925f = aVar;
    }

    /* renamed from: b */
    private String m30254b() {
        return Settings.Secure.getString(this.f17923d.getContentResolver(), "android_id");
    }

    /* renamed from: c */
    private String m30255c() {
        return C7318a.m30225a().toString();
    }

    /* renamed from: d */
    private String m30256d() {
        return this.f17923d.getPackageName();
    }

    /* renamed from: e */
    private String m30257e() {
        return "Android Beacon Library;" + m30258f() + ";" + m30256d() + ";" + m30254b() + ";" + m30255c();
    }

    /* renamed from: f */
    private String m30258f() {
        return "2.19.3";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void doInBackground(Void... voidArr) {
        this.f17924e.mo37281d();
        C7325a aVar = this.f17925f;
        if (aVar == null) {
            return null;
        }
        aVar.mo37284a(this.f17924e.mo37280c(), this.f17924e.mo37278a(), this.f17924e.mo37279b());
        return null;
    }
}
