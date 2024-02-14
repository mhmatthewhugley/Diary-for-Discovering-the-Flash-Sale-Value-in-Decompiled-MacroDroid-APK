package p091fd;

import android.content.Context;
import android.os.AsyncTask;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p091fd.C7324f;
import p097gd.C7354d;

/* renamed from: fd.e */
/* compiled from: ModelSpecificDistanceCalculator */
public class C7322e implements C7320c {

    /* renamed from: a */
    Map<C7318a, C7320c> f17911a;

    /* renamed from: b */
    private C7318a f17912b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C7320c f17913c;

    /* renamed from: d */
    private C7318a f17914d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C7318a f17915e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f17916f;

    /* renamed from: g */
    private Context f17917g;

    /* renamed from: h */
    private final ReentrantLock f17918h;

    /* renamed from: fd.e$a */
    /* compiled from: ModelSpecificDistanceCalculator */
    class C7323a implements C7324f.C7325a {
        C7323a() {
        }

        /* renamed from: a */
        public void mo37284a(String str, Exception exc, int i) {
            if (exc != null) {
                C7354d.m30381f("ModelSpecificDistanceCalculator", "Cannot updated distance models from online database at %s", exc, C7322e.this.f17916f);
            } else if (i != 200) {
                C7354d.m30381f("ModelSpecificDistanceCalculator", "Cannot updated distance models from online database at %s due to HTTP status code %s", C7322e.this.f17916f, Integer.valueOf(i));
            } else {
                C7354d.m30376a("ModelSpecificDistanceCalculator", "Successfully downloaded distance models from online database", new Object[0]);
                try {
                    C7322e.this.mo37282h(str);
                    if (C7322e.this.m30248o(str)) {
                        boolean unused = C7322e.this.m30246m();
                        C7322e eVar = C7322e.this;
                        C7320c unused2 = eVar.f17913c = eVar.mo37283j(eVar.f17915e);
                        C7354d.m30379d("ModelSpecificDistanceCalculator", "Successfully updated distance model with latest from online database", new Object[0]);
                    }
                } catch (JSONException e) {
                    C7354d.m30382g(e, "ModelSpecificDistanceCalculator", "Cannot parse json from downloaded distance model", new Object[0]);
                }
            }
        }
    }

    public C7322e(Context context, String str) {
        this(context, str, C7318a.m30225a());
    }

    /* renamed from: g */
    private void m30242g(String str) throws JSONException {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONObject(str).getJSONArray("models");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            boolean z = jSONObject.has("default") ? jSONObject.getBoolean("default") : false;
            Double valueOf = Double.valueOf(jSONObject.getDouble("coefficient1"));
            Double valueOf2 = Double.valueOf(jSONObject.getDouble("coefficient2"));
            Double valueOf3 = Double.valueOf(jSONObject.getDouble("coefficient3"));
            String string = jSONObject.getString(ClientCookie.VERSION_ATTR);
            String string2 = jSONObject.getString("build_number");
            String string3 = jSONObject.getString("model");
            String string4 = jSONObject.getString("manufacturer");
            double doubleValue = valueOf.doubleValue();
            double doubleValue2 = valueOf2.doubleValue();
            double doubleValue3 = valueOf3.doubleValue();
            C7319b bVar = r13;
            C7319b bVar2 = new C7319b(doubleValue, doubleValue2, doubleValue3);
            C7318a aVar = new C7318a(string, string2, string3, string4);
            hashMap.put(aVar, bVar);
            if (z) {
                this.f17912b = aVar;
            }
        }
        this.f17911a = hashMap;
    }

    /* renamed from: i */
    private C7320c m30243i(C7318a aVar) {
        C7354d.m30376a("ModelSpecificDistanceCalculator", "Finding best distance calculator for %s, %s, %s, %s", aVar.mo37274e(), aVar.mo37271b(), aVar.mo37273d(), aVar.mo37272c());
        Map<C7318a, C7320c> map = this.f17911a;
        C7318a aVar2 = null;
        if (map == null) {
            C7354d.m30376a("ModelSpecificDistanceCalculator", "Cannot get distance calculator because modelMap was never initialized", new Object[0]);
            return null;
        }
        int i = 0;
        for (C7318a next : map.keySet()) {
            if (next.mo37275f(aVar) > i) {
                i = next.mo37275f(aVar);
                aVar2 = next;
            }
        }
        if (aVar2 != null) {
            C7354d.m30376a("ModelSpecificDistanceCalculator", "found a match with score %s", Integer.valueOf(i));
            C7354d.m30376a("ModelSpecificDistanceCalculator", "Finding best distance calculator for %s, %s, %s, %s", aVar2.mo37274e(), aVar2.mo37271b(), aVar2.mo37273d(), aVar2.mo37272c());
            this.f17914d = aVar2;
        } else {
            this.f17914d = this.f17912b;
            C7354d.m30381f("ModelSpecificDistanceCalculator", "Cannot find match for this device.  Using default", new Object[0]);
        }
        return this.f17911a.get(this.f17914d);
    }

    /* renamed from: k */
    private void m30244k() {
        try {
            m30242g(m30249p("model-distance-calculations.json"));
        } catch (Exception e) {
            this.f17911a = new HashMap();
            C7354d.m30378c(e, "ModelSpecificDistanceCalculator", "Cannot build model distance calculations", new Object[0]);
        }
    }

    /* renamed from: l */
    private void m30245l() {
        boolean z;
        if (this.f17916f != null) {
            z = m30246m();
            if (!z) {
                m30247n();
            }
        } else {
            z = false;
        }
        if (!z) {
            m30244k();
        }
        this.f17913c = mo37283j(this.f17915e);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        p097gd.C7354d.m30378c(r1, "ModelSpecificDistanceCalculator", "Cannot update distance models from online database at %s with JSON: %s", r9.f17916f, r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0038 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003b */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075 A[SYNTHETIC, Splitter:B:36:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007c A[SYNTHETIC, Splitter:B:40:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0082 A[SYNTHETIC, Splitter:B:45:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0089 A[SYNTHETIC, Splitter:B:49:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0090 A[SYNTHETIC, Splitter:B:56:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0097 A[SYNTHETIC, Splitter:B:60:0x0097] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m30246m() {
        /*
            r9 = this;
            java.lang.String r0 = "ModelSpecificDistanceCalculator"
            java.io.File r1 = new java.io.File
            android.content.Context r2 = r9.f17917g
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r3 = "model-distance-calculations.json"
            r1.<init>(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            r4 = 1
            r5 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0068, all -> 0x0065 }
            r6.<init>(r1)     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0068, all -> 0x0065 }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0061 }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0061 }
            r8.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0061 }
            r7.<init>(r8)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0061 }
        L_0x0026:
            java.lang.String r3 = r7.readLine()     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x005a, all -> 0x0057 }
            if (r3 == 0) goto L_0x0035
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x005a, all -> 0x0057 }
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x005a, all -> 0x0057 }
            goto L_0x0026
        L_0x0035:
            r7.close()     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            r6.close()     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            java.lang.String r1 = r2.toString()     // Catch:{ JSONException -> 0x0043 }
            r9.mo37282h(r1)     // Catch:{ JSONException -> 0x0043 }
            return r4
        L_0x0043:
            r1 = move-exception
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r6 = r9.f17916f
            r3[r5] = r6
            java.lang.String r2 = r2.toString()
            r3[r4] = r2
            java.lang.String r2 = "Cannot update distance models from online database at %s with JSON: %s"
            p097gd.C7354d.m30378c(r1, r0, r2, r3)
            return r5
        L_0x0057:
            r0 = move-exception
            r3 = r7
            goto L_0x0080
        L_0x005a:
            r2 = move-exception
            r3 = r7
            goto L_0x006a
        L_0x005d:
            r3 = r7
            goto L_0x008e
        L_0x005f:
            r0 = move-exception
            goto L_0x0080
        L_0x0061:
            r2 = move-exception
            goto L_0x006a
        L_0x0063:
            goto L_0x008e
        L_0x0065:
            r0 = move-exception
            r6 = r3
            goto L_0x0080
        L_0x0068:
            r2 = move-exception
            r6 = r3
        L_0x006a:
            java.lang.String r7 = "Cannot open distance model file %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x005f }
            r4[r5] = r1     // Catch:{ all -> 0x005f }
            p097gd.C7354d.m30378c(r2, r0, r7, r4)     // Catch:{ all -> 0x005f }
            if (r3 == 0) goto L_0x007a
            r3.close()     // Catch:{ Exception -> 0x0079 }
            goto L_0x007a
        L_0x0079:
        L_0x007a:
            if (r6 == 0) goto L_0x007f
            r6.close()     // Catch:{ Exception -> 0x007f }
        L_0x007f:
            return r5
        L_0x0080:
            if (r3 == 0) goto L_0x0087
            r3.close()     // Catch:{ Exception -> 0x0086 }
            goto L_0x0087
        L_0x0086:
        L_0x0087:
            if (r6 == 0) goto L_0x008c
            r6.close()     // Catch:{ Exception -> 0x008c }
        L_0x008c:
            throw r0
        L_0x008d:
            r6 = r3
        L_0x008e:
            if (r3 == 0) goto L_0x0095
            r3.close()     // Catch:{ Exception -> 0x0094 }
            goto L_0x0095
        L_0x0094:
        L_0x0095:
            if (r6 == 0) goto L_0x009a
            r6.close()     // Catch:{ Exception -> 0x009a }
        L_0x009a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p091fd.C7322e.m30246m():boolean");
    }

    /* renamed from: n */
    private void m30247n() {
        if (this.f17917g.checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
            C7354d.m30381f("ModelSpecificDistanceCalculator", "App has no android.permission.INTERNET permission.  Cannot check for distance model updates", new Object[0]);
        } else {
            new C7324f(this.f17917g, this.f17916f, new C7323a()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public boolean m30248o(String str) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = this.f17917g.openFileOutput("model-distance-calculations.json", 0);
            fileOutputStream.write(str.getBytes());
            fileOutputStream.close();
            try {
                fileOutputStream.close();
            } catch (Exception unused) {
            }
            C7354d.m30379d("ModelSpecificDistanceCalculator", "Successfully saved new distance model file", new Object[0]);
            return true;
        } catch (Exception e) {
            C7354d.m30382g(e, "ModelSpecificDistanceCalculator", "Cannot write updated distance model to local storage", new Object[0]);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception unused2) {
                }
            }
            return false;
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008d  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m30249p(java.lang.String r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            java.lang.Class<fd.e> r3 = p091fd.C7322e.class
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r4.<init>()     // Catch:{ all -> 0x0084 }
            r4.append(r0)     // Catch:{ all -> 0x0084 }
            r4.append(r7)     // Catch:{ all -> 0x0084 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0084 }
            java.io.InputStream r3 = r3.getResourceAsStream(r4)     // Catch:{ all -> 0x0084 }
            if (r3 != 0) goto L_0x003d
            java.lang.Class r4 = r6.getClass()     // Catch:{ all -> 0x003b }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ all -> 0x003b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x003b }
            r5.<init>()     // Catch:{ all -> 0x003b }
            r5.append(r0)     // Catch:{ all -> 0x003b }
            r5.append(r7)     // Catch:{ all -> 0x003b }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x003b }
            java.io.InputStream r3 = r4.getResourceAsStream(r0)     // Catch:{ all -> 0x003b }
            goto L_0x003d
        L_0x003b:
            r7 = move-exception
            goto L_0x0086
        L_0x003d:
            if (r3 == 0) goto L_0x006d
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x003b }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x003b }
            java.lang.String r4 = "UTF-8"
            r0.<init>(r3, r4)     // Catch:{ all -> 0x003b }
            r7.<init>(r0)     // Catch:{ all -> 0x003b }
            java.lang.String r0 = r7.readLine()     // Catch:{ all -> 0x0069 }
        L_0x004f:
            if (r0 == 0) goto L_0x005e
            r1.append(r0)     // Catch:{ all -> 0x0069 }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = r7.readLine()     // Catch:{ all -> 0x0069 }
            goto L_0x004f
        L_0x005e:
            r7.close()
            r3.close()
            java.lang.String r7 = r1.toString()
            return r7
        L_0x0069:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L_0x0086
        L_0x006d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x003b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003b }
            r1.<init>()     // Catch:{ all -> 0x003b }
            java.lang.String r4 = "Cannot load resource at "
            r1.append(r4)     // Catch:{ all -> 0x003b }
            r1.append(r7)     // Catch:{ all -> 0x003b }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x003b }
            r0.<init>(r7)     // Catch:{ all -> 0x003b }
            throw r0     // Catch:{ all -> 0x003b }
        L_0x0084:
            r7 = move-exception
            r3 = r2
        L_0x0086:
            if (r2 == 0) goto L_0x008b
            r2.close()
        L_0x008b:
            if (r3 == 0) goto L_0x0090
            r3.close()
        L_0x0090:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p091fd.C7322e.m30249p(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public double mo37277a(int i, double d) {
        C7320c cVar = this.f17913c;
        if (cVar != null) {
            return cVar.mo37277a(i, d);
        }
        C7354d.m30381f("ModelSpecificDistanceCalculator", "distance calculator has not been set", new Object[0]);
        return -1.0d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo37282h(String str) throws JSONException {
        this.f17918h.lock();
        try {
            m30242g(str);
        } finally {
            this.f17918h.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C7320c mo37283j(C7318a aVar) {
        this.f17918h.lock();
        try {
            return m30243i(aVar);
        } finally {
            this.f17918h.unlock();
        }
    }

    public C7322e(Context context, String str, C7318a aVar) {
        this.f17916f = null;
        this.f17918h = new ReentrantLock();
        this.f17915e = aVar;
        this.f17916f = str;
        this.f17917g = context;
        m30245l();
        this.f17913c = mo37283j(aVar);
    }
}
