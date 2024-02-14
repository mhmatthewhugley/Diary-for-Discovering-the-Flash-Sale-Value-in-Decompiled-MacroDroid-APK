package p155r1;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: r1.a */
/* compiled from: ErrorParser */
class C8185a {
    /* renamed from: a */
    static String m33945a(String str) {
        try {
            return new JSONObject(str).getJSONArray("errors").getJSONObject(0).get("message").toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return String.format("Error parsing error message: %s", new Object[]{e.getMessage()});
        }
    }
}
