package p160s0;

import android.content.Context;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.macro.C4921g;
import com.arlosoft.macrodroid.macro.Macro;
import com.google.gson.Gson;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C13706o;
import okhttp3.C16002z;
import p059a4.C2230a;
import p104i0.C7392a;
import p104i0.C7393b;
import p107i3.C7397a;
import p117k1.C7469a;
import p118k2.C7470a;
import p118k2.C7471b;
import p163s3.C10184a;
import p163s3.C10185b;
import p172u1.C10283c;
import p199z2.C10434a;
import p454af.C17104g;
import p456bf.C17108a;
import p457cf.C17121k;
import retrofit2.C17301t;

/* renamed from: s0.f1 */
/* compiled from: NetworkingModule.kt */
public final class C10087f1 {

    /* renamed from: a */
    public static final C10087f1 f23281a = new C10087f1();

    /* renamed from: b */
    private static final X509TrustManager f23282b = new C10088a();

    /* renamed from: s0.f1$a */
    /* compiled from: NetworkingModule.kt */
    public static final class C10088a implements X509TrustManager {
        C10088a() {
        }

        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            C13706o.m87929f(x509CertificateArr, "chain");
            C13706o.m87929f(str, "authType");
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            C13706o.m87929f(x509CertificateArr, "chain");
            C13706o.m87929f(str, "authType");
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    private C10087f1() {
    }

    /* renamed from: a */
    public static final C16002z m40022a() {
        return new C16002z.C16003a().mo76376c();
    }

    /* renamed from: b */
    public static final Gson m40023b(Context context) {
        C13706o.m87929f(context, "context");
        Gson c = C10283c.m40413c().mo64006e(Macro.class, new C4921g(context, false, false, false)).mo64006e(ActionBlock.class, new C4921g(context, false, false, false)).mo64004c();
        C13706o.m87928e(c, "getGsonBuilder()\n       …e))\n            .create()");
        return c;
    }

    /* renamed from: c */
    public static final C7470a m40024c(C16002z zVar, Gson gson) {
        C13706o.m87929f(zVar, "okHttpClient");
        C13706o.m87929f(gson, "gson");
        Object b = new C17301t.C17303b().mo80610c("https://api.appbrain.com").mo80614g(zVar).mo80608a(C17104g.m100577d()).mo80609b(C17108a.m100595g(gson)).mo80612e().mo80599b(C7470a.class);
        C13706o.m87928e(b, "Builder()\n              …(AppBrainApi::class.java)");
        return (C7470a) b;
    }

    /* renamed from: d */
    public static final C7469a m40025d(C16002z zVar, Gson gson) {
        C13706o.m87929f(zVar, "okHttpClient");
        C13706o.m87929f(gson, "gson");
        Object b = new C17301t.C17303b().mo80610c("https://backend.macrodroid.com/").mo80614g(zVar).mo80608a(C17104g.m100577d()).mo80609b(C17108a.m100595g(gson)).mo80612e().mo80599b(C7469a.class);
        C13706o.m87928e(b, "Builder()\n              …ommercialApi::class.java)");
        return (C7469a) b;
    }

    /* renamed from: e */
    public static final C7392a m40026e(C16002z zVar, Gson gson) {
        C13706o.m87929f(zVar, "okHttpClient");
        C13706o.m87929f(gson, "gson");
        Object b = new C17301t.C17303b().mo80610c("https://backend.macrodroid.com/").mo80614g(zVar).mo80608a(C17104g.m100577d()).mo80609b(C17108a.m100595g(gson)).mo80612e().mo80599b(C7392a.class);
        C13706o.m87928e(b, "Builder()\n              …ate(EmailApi::class.java)");
        return (C7392a) b;
    }

    /* renamed from: f */
    public static final C7471b m40027f(C16002z zVar, Gson gson) {
        C13706o.m87929f(zVar, "okHttpClient");
        C13706o.m87929f(gson, "gson");
        Object b = new C17301t.C17303b().mo80610c("https://backend.macrodroid.com/").mo80614g(zVar).mo80608a(C17104g.m100577d()).mo80609b(C17108a.m100595g(gson)).mo80612e().mo80599b(C7471b.class);
        C13706o.m87928e(b, "Builder()\n              …luginListApi::class.java)");
        return (C7471b) b;
    }

    /* renamed from: g */
    public static final C10434a m40028g(C16002z zVar, Gson gson) {
        C13706o.m87929f(zVar, "okHttpClient");
        C13706o.m87929f(gson, "gson");
        Object b = new C17301t.C17303b().mo80610c("https://backend.macrodroid.com/").mo80614g(zVar).mo80608a(C17104g.m100577d()).mo80609b(C17108a.m100595g(gson)).mo80612e().mo80599b(C10434a.class);
        C13706o.m87928e(b, "Builder()\n              …lateStoreApi::class.java)");
        return (C10434a) b;
    }

    /* renamed from: h */
    public static final C10184a m40029h(C16002z zVar) {
        C13706o.m87929f(zVar, "okHttpClient");
        Object b = new C17301t.C17303b().mo80610c("https://tinyurl.com/").mo80614g(zVar).mo80608a(C17104g.m100577d()).mo80609b(C17121k.m100622f()).mo80612e().mo80599b(C10184a.class);
        C13706o.m87928e(b, "Builder()\n              …e(TinyUrlApi::class.java)");
        return (C10184a) b;
    }

    /* renamed from: i */
    public static final C7397a m40030i(C16002z zVar, Gson gson) {
        C13706o.m87929f(zVar, "okHttpClient");
        C13706o.m87929f(gson, "gson");
        Object b = new C17301t.C17303b().mo80610c("https://platform.api.onesky.io").mo80614g(zVar).mo80608a(C17104g.m100577d()).mo80609b(C17108a.m100595g(gson)).mo80612e().mo80599b(C7397a.class);
        C13706o.m87928e(b, "Builder()\n              …OneSkyAppApi::class.java)");
        return (C7397a) b;
    }

    /* renamed from: j */
    public static final C7393b m40031j(C16002z zVar, Gson gson) {
        C13706o.m87929f(zVar, "okHttpClient");
        C13706o.m87929f(gson, "gson");
        Object b = new C17301t.C17303b().mo80610c("https://backend.macrodroid.com/").mo80614g(zVar).mo80608a(C17104g.m100577d()).mo80609b(C17108a.m100595g(gson)).mo80612e().mo80599b(C7393b.class);
        C13706o.m87928e(b, "Builder()\n              …e(UpgradeApi::class.java)");
        return (C7393b) b;
    }

    /* renamed from: k */
    public static final C2230a m40032k(C16002z zVar, Gson gson) {
        C13706o.m87929f(zVar, "okHttpClient");
        C13706o.m87929f(gson, "gson");
        Object b = new C17301t.C17303b().mo80610c("https://macrodroid-production.web.app/videos.json/").mo80614g(zVar).mo80608a(C17104g.m100577d()).mo80609b(C17108a.m100595g(gson)).mo80612e().mo80599b(C2230a.class);
        C13706o.m87928e(b, "Builder()\n              …te(VideosApi::class.java)");
        return (C2230a) b;
    }

    /* renamed from: l */
    public static final C10185b m40033l(C16002z zVar, Gson gson) {
        C13706o.m87929f(zVar, "okHttpClient");
        C13706o.m87929f(gson, "gson");
        Object b = new C17301t.C17303b().mo80610c("https://backend.macrodroid.com/").mo80614g(zVar).mo80608a(C17104g.m100577d()).mo80609b(C17108a.m100595g(gson)).mo80612e().mo80599b(C10185b.class);
        C13706o.m87928e(b, "Builder()\n              …ebTriggerApi::class.java)");
        return (C10185b) b;
    }
}
