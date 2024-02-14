package com.google.firebase.storage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class StorageMetadata {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f55347a;

    /* renamed from: b */
    private FirebaseStorage f55348b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public StorageReference f55349c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f55350d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f55351e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public MetadataValue<String> f55352f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f55353g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f55354h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f55355i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f55356j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f55357k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public MetadataValue<String> f55358l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public MetadataValue<String> f55359m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public MetadataValue<String> f55360n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public MetadataValue<String> f55361o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public MetadataValue<Map<String, String>> f55362p;

    private static class MetadataValue<T> {

        /* renamed from: a */
        private final boolean f55365a;
        @Nullable

        /* renamed from: b */
        private final T f55366b;

        MetadataValue(@Nullable T t, boolean z) {
            this.f55365a = z;
            this.f55366b = t;
        }

        /* renamed from: c */
        static <T> MetadataValue<T> m77416c(T t) {
            return new MetadataValue<>(t, false);
        }

        /* renamed from: d */
        static <T> MetadataValue<T> m77417d(@Nullable T t) {
            return new MetadataValue<>(t, true);
        }

        /* access modifiers changed from: package-private */
        @Nullable
        /* renamed from: a */
        public T mo63625a() {
            return this.f55366b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo63626b() {
            return this.f55365a;
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: q */
    public JSONObject mo63612q() {
        HashMap hashMap = new HashMap();
        if (this.f55352f.mo63626b()) {
            hashMap.put("contentType", mo63617v());
        }
        if (this.f55362p.mo63626b()) {
            hashMap.put("metadata", new JSONObject(this.f55362p.mo63625a()));
        }
        if (this.f55358l.mo63626b()) {
            hashMap.put("cacheControl", mo63613r());
        }
        if (this.f55359m.mo63626b()) {
            hashMap.put("contentDisposition", mo63614s());
        }
        if (this.f55360n.mo63626b()) {
            hashMap.put("contentEncoding", mo63615t());
        }
        if (this.f55361o.mo63626b()) {
            hashMap.put("contentLanguage", mo63616u());
        }
        return new JSONObject(hashMap);
    }

    @Nullable
    /* renamed from: r */
    public String mo63613r() {
        return this.f55358l.mo63625a();
    }

    @Nullable
    /* renamed from: s */
    public String mo63614s() {
        return this.f55359m.mo63625a();
    }

    @Nullable
    /* renamed from: t */
    public String mo63615t() {
        return this.f55360n.mo63625a();
    }

    @Nullable
    /* renamed from: u */
    public String mo63616u() {
        return this.f55361o.mo63625a();
    }

    @Nullable
    /* renamed from: v */
    public String mo63617v() {
        return this.f55352f.mo63625a();
    }

    public static class Builder {

        /* renamed from: a */
        StorageMetadata f55363a;

        /* renamed from: b */
        boolean f55364b;

        public Builder() {
            this.f55363a = new StorageMetadata();
        }

        @Nullable
        /* renamed from: b */
        private String m77407b(JSONObject jSONObject, String str) throws JSONException {
            if (!jSONObject.has(str) || jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str);
        }

        /* renamed from: c */
        private void m77408c(JSONObject jSONObject) throws JSONException {
            String unused = this.f55363a.f55351e = jSONObject.optString("generation");
            String unused2 = this.f55363a.f55347a = jSONObject.optString("name");
            String unused3 = this.f55363a.f55350d = jSONObject.optString("bucket");
            String unused4 = this.f55363a.f55353g = jSONObject.optString("metageneration");
            String unused5 = this.f55363a.f55354h = jSONObject.optString("timeCreated");
            String unused6 = this.f55363a.f55355i = jSONObject.optString("updated");
            long unused7 = this.f55363a.f55356j = jSONObject.optLong("size");
            String unused8 = this.f55363a.f55357k = jSONObject.optString("md5Hash");
            if (jSONObject.has("metadata") && !jSONObject.isNull("metadata")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    mo63624i(next, jSONObject2.getString(next));
                }
            }
            String b = m77407b(jSONObject, "contentType");
            if (b != null) {
                mo63623h(b);
            }
            String b2 = m77407b(jSONObject, "cacheControl");
            if (b2 != null) {
                mo63619d(b2);
            }
            String b3 = m77407b(jSONObject, "contentDisposition");
            if (b3 != null) {
                mo63620e(b3);
            }
            String b4 = m77407b(jSONObject, "contentEncoding");
            if (b4 != null) {
                mo63621f(b4);
            }
            String b5 = m77407b(jSONObject, "contentLanguage");
            if (b5 != null) {
                mo63622g(b5);
            }
        }

        @NonNull
        /* renamed from: a */
        public StorageMetadata mo63618a() {
            return new StorageMetadata(this.f55364b);
        }

        @NonNull
        /* renamed from: d */
        public Builder mo63619d(@Nullable String str) {
            MetadataValue unused = this.f55363a.f55358l = MetadataValue.m77417d(str);
            return this;
        }

        @NonNull
        /* renamed from: e */
        public Builder mo63620e(@Nullable String str) {
            MetadataValue unused = this.f55363a.f55359m = MetadataValue.m77417d(str);
            return this;
        }

        @NonNull
        /* renamed from: f */
        public Builder mo63621f(@Nullable String str) {
            MetadataValue unused = this.f55363a.f55360n = MetadataValue.m77417d(str);
            return this;
        }

        @NonNull
        /* renamed from: g */
        public Builder mo63622g(@Nullable String str) {
            MetadataValue unused = this.f55363a.f55361o = MetadataValue.m77417d(str);
            return this;
        }

        @NonNull
        /* renamed from: h */
        public Builder mo63623h(@Nullable String str) {
            MetadataValue unused = this.f55363a.f55352f = MetadataValue.m77417d(str);
            return this;
        }

        @NonNull
        /* renamed from: i */
        public Builder mo63624i(@NonNull String str, @Nullable String str2) {
            if (!this.f55363a.f55362p.mo63626b()) {
                MetadataValue unused = this.f55363a.f55362p = MetadataValue.m77417d(new HashMap());
            }
            ((Map) this.f55363a.f55362p.mo63625a()).put(str, str2);
            return this;
        }

        Builder(JSONObject jSONObject, StorageReference storageReference) throws JSONException {
            this(jSONObject);
            StorageReference unused = this.f55363a.f55349c = storageReference;
        }

        Builder(JSONObject jSONObject) throws JSONException {
            this.f55363a = new StorageMetadata();
            if (jSONObject != null) {
                m77408c(jSONObject);
                this.f55364b = true;
            }
        }
    }

    public StorageMetadata() {
        this.f55347a = null;
        this.f55348b = null;
        this.f55349c = null;
        this.f55350d = null;
        this.f55351e = null;
        this.f55352f = MetadataValue.m77416c("");
        this.f55353g = null;
        this.f55354h = null;
        this.f55355i = null;
        this.f55357k = null;
        this.f55358l = MetadataValue.m77416c("");
        this.f55359m = MetadataValue.m77416c("");
        this.f55360n = MetadataValue.m77416c("");
        this.f55361o = MetadataValue.m77416c("");
        this.f55362p = MetadataValue.m77416c(Collections.emptyMap());
    }

    private StorageMetadata(@NonNull StorageMetadata storageMetadata, boolean z) {
        this.f55347a = null;
        this.f55348b = null;
        this.f55349c = null;
        this.f55350d = null;
        this.f55351e = null;
        this.f55352f = MetadataValue.m77416c("");
        this.f55353g = null;
        this.f55354h = null;
        this.f55355i = null;
        this.f55357k = null;
        this.f55358l = MetadataValue.m77416c("");
        this.f55359m = MetadataValue.m77416c("");
        this.f55360n = MetadataValue.m77416c("");
        this.f55361o = MetadataValue.m77416c("");
        this.f55362p = MetadataValue.m77416c(Collections.emptyMap());
        Preconditions.m4488k(storageMetadata);
        this.f55347a = storageMetadata.f55347a;
        this.f55348b = storageMetadata.f55348b;
        this.f55349c = storageMetadata.f55349c;
        this.f55350d = storageMetadata.f55350d;
        this.f55352f = storageMetadata.f55352f;
        this.f55358l = storageMetadata.f55358l;
        this.f55359m = storageMetadata.f55359m;
        this.f55360n = storageMetadata.f55360n;
        this.f55361o = storageMetadata.f55361o;
        this.f55362p = storageMetadata.f55362p;
        if (z) {
            this.f55357k = storageMetadata.f55357k;
            this.f55356j = storageMetadata.f55356j;
            this.f55355i = storageMetadata.f55355i;
            this.f55354h = storageMetadata.f55354h;
            this.f55353g = storageMetadata.f55353g;
            this.f55351e = storageMetadata.f55351e;
        }
    }
}
