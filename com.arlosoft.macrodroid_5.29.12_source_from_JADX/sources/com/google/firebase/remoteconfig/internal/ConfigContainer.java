package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigContainer {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Date f55233f = new Date(0);

    /* renamed from: a */
    private JSONObject f55234a;

    /* renamed from: b */
    private JSONObject f55235b;

    /* renamed from: c */
    private Date f55236c;

    /* renamed from: d */
    private JSONArray f55237d;

    /* renamed from: e */
    private JSONObject f55238e;

    public static class Builder {

        /* renamed from: a */
        private JSONObject f55239a;

        /* renamed from: b */
        private Date f55240b;

        /* renamed from: c */
        private JSONArray f55241c;

        /* renamed from: d */
        private JSONObject f55242d;

        /* renamed from: a */
        public ConfigContainer mo63544a() throws JSONException {
            return new ConfigContainer(this.f55239a, this.f55240b, this.f55241c, this.f55242d);
        }

        /* renamed from: b */
        public Builder mo63545b(Map<String, String> map) {
            this.f55239a = new JSONObject(map);
            return this;
        }

        /* renamed from: c */
        public Builder mo63546c(JSONObject jSONObject) {
            try {
                this.f55239a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: d */
        public Builder mo63547d(JSONArray jSONArray) {
            try {
                this.f55241c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: e */
        public Builder mo63548e(Date date) {
            this.f55240b = date;
            return this;
        }

        /* renamed from: f */
        public Builder mo63549f(JSONObject jSONObject) {
            try {
                this.f55242d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        private Builder() {
            this.f55239a = new JSONObject();
            this.f55240b = ConfigContainer.f55233f;
            this.f55241c = new JSONArray();
            this.f55242d = new JSONObject();
        }
    }

    /* renamed from: b */
    static ConfigContainer m77250b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new ConfigContainer(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject);
    }

    /* renamed from: g */
    public static Builder m77251g() {
        return new Builder();
    }

    /* renamed from: c */
    public JSONArray mo63537c() {
        return this.f55237d;
    }

    /* renamed from: d */
    public JSONObject mo63538d() {
        return this.f55235b;
    }

    /* renamed from: e */
    public Date mo63539e() {
        return this.f55236c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigContainer)) {
            return false;
        }
        return this.f55234a.toString().equals(((ConfigContainer) obj).toString());
    }

    /* renamed from: f */
    public JSONObject mo63541f() {
        return this.f55238e;
    }

    public int hashCode() {
        return this.f55234a.hashCode();
    }

    public String toString() {
        return this.f55234a.toString();
    }

    private ConfigContainer(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.f55235b = jSONObject;
        this.f55236c = date;
        this.f55237d = jSONArray;
        this.f55238e = jSONObject2;
        this.f55234a = jSONObject3;
    }
}
