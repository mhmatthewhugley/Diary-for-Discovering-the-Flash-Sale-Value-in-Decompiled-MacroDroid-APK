package com.google.android.gms.internal.ads;

import android.content.Context;
import android.provider.Settings;
import android.util.JsonWriter;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcgo {

    /* renamed from: b */
    private static final Object f28437b = new Object();
    @GuardedBy("lock")

    /* renamed from: c */
    private static boolean f28438c = false;
    @GuardedBy("lock")

    /* renamed from: d */
    private static boolean f28439d = false;

    /* renamed from: e */
    private static final Clock f28440e = DefaultClock.m4871d();

    /* renamed from: f */
    private static final Set f28441f = new HashSet(Arrays.asList(new String[0]));

    /* renamed from: g */
    public static final /* synthetic */ int f28442g = 0;

    /* renamed from: a */
    private final List f28443a;

    public zzcgo() {
        this((String) null);
    }

    /* renamed from: a */
    static /* synthetic */ void m45204a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m45216s(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.m4853c(bArr));
        }
        jsonWriter.endObject();
    }

    /* renamed from: b */
    static /* synthetic */ void m45205b(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        m45216s(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* renamed from: i */
    public static void m45206i() {
        synchronized (f28437b) {
            f28438c = false;
            f28439d = false;
            zzcgp.m45229g("Ad debug logging enablement is out of date.");
        }
    }

    /* renamed from: j */
    public static void m45207j(boolean z) {
        synchronized (f28437b) {
            f28438c = true;
            f28439d = z;
        }
    }

    /* renamed from: k */
    public static boolean m45208k(Context context) {
        if (!((Boolean) zzbko.f27417a.mo42728e()).booleanValue()) {
            return false;
        }
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            zzcgp.m45230h("Fail to determine debug setting.", e);
            return false;
        }
    }

    /* renamed from: l */
    public static boolean m45209l() {
        boolean z;
        synchronized (f28437b) {
            z = false;
            if (f28438c && f28439d) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: m */
    public static boolean m45210m() {
        boolean z;
        synchronized (f28437b) {
            z = f28438c;
        }
        return z;
    }

    /* renamed from: n */
    private static synchronized void m45211n(String str) {
        synchronized (zzcgo.class) {
            zzcgp.m45228f("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                zzcgp.m45228f("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i, Math.min(i2, str.length())))));
                i = i2;
            }
            zzcgp.m45228f("GMA Debug FINISH");
        }
    }

    /* renamed from: o */
    private final void m45212o(String str, zzcgn zzcgn) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f28440e.mo21950a());
            jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f28443a) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            zzcgn.mo43555a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            zzcgp.m45227e("unable to log", e);
        }
        m45211n(stringWriter.toString());
    }

    /* renamed from: p */
    private final void m45213p(@Nullable String str) {
        m45212o("onNetworkRequestError", new zzcgk(str));
    }

    /* renamed from: q */
    private final void m45214q(String str, String str2, @Nullable Map map, @Nullable byte[] bArr) {
        m45212o("onNetworkRequest", new zzcgl(str, str2, map, bArr));
    }

    /* renamed from: r */
    private final void m45215r(@Nullable Map map, int i) {
        m45212o("onNetworkResponse", new zzcgj(i, map));
    }

    /* renamed from: s */
    private static void m45216s(JsonWriter jsonWriter, @Nullable Map map) throws IOException {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (!f28441f.contains(str)) {
                    if (!(entry.getValue() instanceof List)) {
                        if (!(entry.getValue() instanceof String)) {
                            zzcgp.m45226d("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value((String) entry.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String value : (List) entry.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name("name").value(str);
                            jsonWriter.name("value").value(value);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: c */
    public final void mo43556c(HttpURLConnection httpURLConnection, @Nullable byte[] bArr) {
        HashMap hashMap;
        if (m45209l()) {
            if (httpURLConnection.getRequestProperties() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getRequestProperties());
            }
            m45214q(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
        }
    }

    /* renamed from: d */
    public final void mo43557d(String str, String str2, @Nullable Map map, @Nullable byte[] bArr) {
        if (m45209l()) {
            m45214q(str, "GET", map, bArr);
        }
    }

    /* renamed from: e */
    public final void mo43558e(HttpURLConnection httpURLConnection, int i) {
        HashMap hashMap;
        if (m45209l()) {
            String str = null;
            if (httpURLConnection.getHeaderFields() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getHeaderFields());
            }
            m45215r(hashMap, i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    zzcgp.m45229g("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e.getMessage())));
                }
                m45213p(str);
            }
        }
    }

    /* renamed from: f */
    public final void mo43559f(@Nullable Map map, int i) {
        if (m45209l()) {
            m45215r(map, i);
            if (i < 200 || i >= 300) {
                m45213p((String) null);
            }
        }
    }

    /* renamed from: g */
    public final void mo43560g(@Nullable String str) {
        if (m45209l() && str != null) {
            mo43561h(str.getBytes());
        }
    }

    /* renamed from: h */
    public final void mo43561h(byte[] bArr) {
        m45212o("onNetworkResponseBody", new zzcgm(bArr));
    }

    public zzcgo(@Nullable String str) {
        List list;
        if (!m45209l()) {
            list = new ArrayList();
        } else {
            list = Arrays.asList(new String[]{"network_request_".concat(String.valueOf(UUID.randomUUID().toString()))});
        }
        this.f28443a = list;
    }
}
