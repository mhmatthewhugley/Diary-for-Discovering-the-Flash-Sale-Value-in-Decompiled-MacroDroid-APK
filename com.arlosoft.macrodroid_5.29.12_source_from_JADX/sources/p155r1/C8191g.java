package p155r1;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p155r1.C8189f;

/* renamed from: r1.g */
/* compiled from: SendGridMailBody */
class C8191g {

    /* renamed from: a */
    private final JSONObject f19863a;

    private C8191g(JSONObject jSONObject) {
        this.f19863a = jSONObject;
    }

    /* renamed from: a */
    static C8191g m33979a(C8189f fVar) {
        return new C8191g(m33980b(fVar));
    }

    /* renamed from: b */
    private static JSONObject m33980b(C8189f fVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(m33990m(fVar));
            if (!fVar.mo38245i().isEmpty()) {
                jSONArray.put(m33983f(fVar));
            }
            if (!fVar.mo38244h().isEmpty()) {
                jSONArray.put(m33982d(fVar));
            }
            jSONObject.put("personalizations", jSONArray);
            jSONObject.put(TypedValues.Transition.S_FROM, m33985h(fVar));
            jSONObject.put("subject", m33988k(fVar));
            jSONObject.put("content", m33984g(fVar));
            if (fVar.mo38250n() != null) {
                jSONObject.put("template_id", m33989l(fVar));
            }
            if (!fVar.mo38247k().isEmpty()) {
                jSONObject.put("reply_to", m33986i(fVar));
            }
            if (fVar.mo38248l() != 0) {
                jSONObject.put("send_at", m33987j(fVar));
            }
            if (fVar.mo38240d().size() > 0) {
                jSONObject.put("attachments", m33981c(fVar));
            }
            if (fVar.mo38251o().size() > 0) {
                jSONObject.put("tracking_settings", m33991n(fVar));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: c */
    static JSONArray m33981c(C8189f fVar) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (C8189f.C8190a next : fVar.mo38242f()) {
            if (!next.mo38256b().isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("content", next.mo38256b());
                jSONObject.put("filename", next.mo38257c());
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    /* renamed from: d */
    static JSONObject m33982d(C8189f fVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bcc", m33992o(fVar.mo38244h()));
        return jSONObject;
    }

    /* renamed from: f */
    static JSONObject m33983f(C8189f fVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cc", m33992o(fVar.mo38245i()));
        return jSONObject;
    }

    /* renamed from: g */
    static JSONArray m33984g(C8189f fVar) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Map<String, String> e = fVar.mo38241e();
        if (e.containsKey("text/plain")) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "text/plain");
            jSONObject.put("value", e.get("text/plain"));
            jSONArray.put(jSONObject);
            e.remove("text/plain");
        }
        if (e.containsKey("text/html")) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "text/html");
            jSONObject2.put("value", e.get("text/html"));
            jSONArray.put(jSONObject2);
            e.remove("text/html");
        }
        for (Map.Entry next : e.entrySet()) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", next.getKey());
            jSONObject3.put("value", next.getValue());
            jSONArray.put(jSONObject3);
        }
        return jSONArray;
    }

    /* renamed from: h */
    static JSONObject m33985h(C8189f fVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : fVar.mo38243g().entrySet()) {
            jSONObject.put(NotificationCompat.CATEGORY_EMAIL, next.getKey());
            jSONObject.put("name", next.getValue());
        }
        return jSONObject;
    }

    /* renamed from: i */
    static JSONObject m33986i(C8189f fVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : fVar.mo38247k().entrySet()) {
            jSONObject.put(NotificationCompat.CATEGORY_EMAIL, next.getKey());
            jSONObject.put("name", next.getValue());
        }
        return jSONObject;
    }

    /* renamed from: j */
    static int m33987j(C8189f fVar) {
        return fVar.mo38248l();
    }

    /* renamed from: k */
    static String m33988k(C8189f fVar) {
        return fVar.mo38249m();
    }

    /* renamed from: l */
    static String m33989l(C8189f fVar) {
        return fVar.mo38250n();
    }

    /* renamed from: m */
    static JSONObject m33990m(C8189f fVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TypedValues.Transition.S_TO, m33992o(fVar.mo38246j()));
        return jSONObject;
    }

    /* renamed from: n */
    static JSONObject m33991n(C8189f fVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : fVar.mo38251o().entrySet()) {
            System.out.println((String) next.getKey());
            System.out.println(next.getValue());
            jSONObject.put((String) next.getKey(), next.getValue());
        }
        System.out.println(jSONObject);
        return jSONObject;
    }

    /* renamed from: o */
    private static JSONArray m33992o(Map<String, String> map) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_EMAIL, next.getKey());
            jSONObject.put("name", ((String) next.getValue()).equals("") ? null : next.getValue());
            jSONArray.put(jSONObject);
            i++;
            if (i >= 1000) {
                break;
            }
        }
        return jSONArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public JSONObject mo38258e() {
        return this.f19863a;
    }
}
