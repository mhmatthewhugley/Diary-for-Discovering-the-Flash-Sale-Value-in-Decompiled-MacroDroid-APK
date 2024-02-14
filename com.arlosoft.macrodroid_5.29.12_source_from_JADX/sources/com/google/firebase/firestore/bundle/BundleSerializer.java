package com.google.firebase.firestore.bundle;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.core.Bound;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firestore.p228v1.ArrayValue;
import com.google.firestore.p228v1.MapValue;
import com.google.firestore.p228v1.Value;
import com.google.protobuf.ByteString;
import com.google.protobuf.NullValue;
import com.google.type.LatLng;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BundleSerializer {

    /* renamed from: a */
    private final SimpleDateFormat f5792a;

    /* renamed from: b */
    private final RemoteSerializer f5793b;

    /* renamed from: A */
    private List<Filter> m7966A(@Nullable JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            m7978k(arrayList, jSONObject);
        }
        return arrayList;
    }

    /* renamed from: B */
    private static int m7967B(String str) {
        int i = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            i *= 10;
            if (i2 < str.length()) {
                if (str.charAt(i2) < '0' || str.charAt(i2) > '9') {
                    throw new IllegalArgumentException("Invalid nanoseconds: " + str);
                }
                i += str.charAt(i2) - '0';
            }
        }
        return i;
    }

    /* renamed from: C */
    private void m7968C(JSONArray jSONArray) {
        if (jSONArray.length() != 1) {
            throw new IllegalArgumentException("Only queries with a single 'from' clause are supported by the Android SDK");
        }
    }

    /* renamed from: D */
    private void m7969D(JSONObject jSONObject) {
        if (jSONObject.has(TypedValues.Cycle.S_WAVE_OFFSET)) {
            throw new IllegalArgumentException("Queries with offsets are not supported by the Android SDK");
        }
    }

    /* renamed from: E */
    private void m7970E(JSONObject jSONObject) {
        if (jSONObject.has("select")) {
            throw new IllegalArgumentException("Queries with 'select' statements are not supported by the Android SDK");
        }
    }

    /* renamed from: a */
    private void m7971a(Value.Builder builder, @Nullable JSONArray jSONArray) throws JSONException {
        ArrayValue.Builder d0 = ArrayValue.m77721d0();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                d0.mo63764O(m7992z(jSONArray.getJSONObject(i)));
            }
        }
        builder.mo63928O(d0);
    }

    /* renamed from: b */
    private Bound m7972b(@Nullable JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean optBoolean = jSONObject.optBoolean("before", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("values");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(m7992z(optJSONArray.getJSONObject(i)));
            }
        }
        return new Bound(arrayList, optBoolean);
    }

    /* renamed from: e */
    private BundledQuery m7973e(JSONObject jSONObject) throws JSONException {
        String str;
        JSONObject jSONObject2 = jSONObject.getJSONObject("structuredQuery");
        m7970E(jSONObject2);
        ResourcePath p = m7983p(jSONObject.getString("parent"));
        JSONArray jSONArray = jSONObject2.getJSONArray(TypedValues.Transition.S_FROM);
        m7968C(jSONArray);
        JSONObject jSONObject3 = jSONArray.getJSONObject(0);
        if (jSONObject3.optBoolean("allDescendants", false)) {
            str = jSONObject3.getString("collectionId");
        } else {
            p = (ResourcePath) p.mo62796d(jSONObject3.getString("collectionId"));
            str = null;
        }
        List<Filter> A = m7966A(jSONObject2.optJSONObject("where"));
        List<OrderBy> r = m7984r(jSONObject2.optJSONArray("orderBy"));
        Bound b = m7972b(jSONObject2.optJSONObject("startAt"));
        Bound b2 = m7972b(jSONObject2.optJSONObject("endAt"));
        m7969D(jSONObject2);
        int m = m7980m(jSONObject2);
        return new BundledQuery(new Target(p, str, A, r, (long) m, b, b2), m7981n(jSONObject));
    }

    /* renamed from: f */
    private void m7974f(List<Filter> list, JSONObject jSONObject) throws JSONException {
        if (jSONObject.getString("op").equals("AND")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("filters");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    m7978k(list, optJSONArray.getJSONObject(i));
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The Android SDK only supports composite filters of type 'AND'");
    }

    /* renamed from: h */
    private void m7975h(List<Filter> list, JSONObject jSONObject) throws JSONException {
        list.add(FieldFilter.m8065d(m7977j(jSONObject.getJSONObject("field")), m7976i(jSONObject.getString("op")), m7992z(jSONObject.getJSONObject("value"))));
    }

    /* renamed from: i */
    private Filter.Operator m7976i(String str) {
        return Filter.Operator.valueOf(str);
    }

    /* renamed from: j */
    private FieldPath m7977j(JSONObject jSONObject) throws JSONException {
        return FieldPath.m75864s(jSONObject.getString("fieldPath"));
    }

    /* renamed from: k */
    private void m7978k(List<Filter> list, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("compositeFilter")) {
            m7974f(list, jSONObject.getJSONObject("compositeFilter"));
        } else if (jSONObject.has("fieldFilter")) {
            m7975h(list, jSONObject.getJSONObject("fieldFilter"));
        } else if (jSONObject.has("unaryFilter")) {
            m7991y(list, jSONObject.getJSONObject("unaryFilter"));
        }
    }

    /* renamed from: l */
    private void m7979l(Value.Builder builder, JSONObject jSONObject) {
        builder.mo63932T(LatLng.m81677Z().mo65559N(jSONObject.optDouble("latitude")).mo65560O(jSONObject.optDouble("longitude")));
    }

    /* renamed from: m */
    private int m7980m(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("limit");
        if (optJSONObject != null) {
            return optJSONObject.optInt("value", -1);
        }
        return jSONObject.optInt("limit", -1);
    }

    /* renamed from: n */
    private Query.LimitType m7981n(JSONObject jSONObject) {
        String optString = jSONObject.optString("limitType", "FIRST");
        if (optString.equals("FIRST")) {
            return Query.LimitType.LIMIT_TO_FIRST;
        }
        if (optString.equals("LAST")) {
            return Query.LimitType.LIMIT_TO_LAST;
        }
        throw new IllegalArgumentException("Invalid limit type for bundle query: " + optString);
    }

    /* renamed from: o */
    private void m7982o(Value.Builder builder, @Nullable JSONObject jSONObject) throws JSONException {
        MapValue.Builder d0 = MapValue.m77924d0();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                d0.mo63837P(next, m7992z(jSONObject.getJSONObject(next)));
            }
        }
        builder.mo63934V(d0);
    }

    /* renamed from: p */
    private ResourcePath m7983p(String str) {
        ResourcePath t = ResourcePath.m75903t(str);
        if (this.f5793b.mo63066X(t)) {
            return (ResourcePath) t.mo62808o(5);
        }
        throw new IllegalArgumentException("Resource name is not valid for current instance: " + str);
    }

    /* renamed from: r */
    private List<OrderBy> m7984r(@Nullable JSONArray jSONArray) throws JSONException {
        OrderBy.Direction direction;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                FieldPath j = m7977j(jSONObject.getJSONObject("field"));
                if (jSONObject.optString("direction", "ASCENDING").equals("ASCENDING")) {
                    direction = OrderBy.Direction.ASCENDING;
                } else {
                    direction = OrderBy.Direction.DESCENDING;
                }
                arrayList.add(OrderBy.m8134d(direction, j));
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    private SnapshotVersion m7985s(Object obj) throws JSONException {
        return new SnapshotVersion(m7986t(obj));
    }

    /* renamed from: t */
    private Timestamp m7986t(Object obj) throws JSONException {
        if (obj instanceof String) {
            return m7987u((String) obj);
        }
        if (obj instanceof JSONObject) {
            return m7988v((JSONObject) obj);
        }
        throw new IllegalArgumentException("Timestamps must be either ISO 8601-formatted strings or JSON objects");
    }

    /* renamed from: u */
    private Timestamp m7987u(String str) {
        try {
            int indexOf = str.indexOf(84);
            if (indexOf != -1) {
                int indexOf2 = str.indexOf(90, indexOf);
                if (indexOf2 == -1) {
                    indexOf2 = str.indexOf(43, indexOf);
                }
                if (indexOf2 == -1) {
                    indexOf2 = str.indexOf(45, indexOf);
                }
                if (indexOf2 != -1) {
                    int i = 0;
                    String substring = str.substring(0, indexOf2);
                    String str2 = "";
                    int indexOf3 = substring.indexOf(46);
                    if (indexOf3 != -1) {
                        String substring2 = substring.substring(0, indexOf3);
                        str2 = substring.substring(indexOf3 + 1);
                        substring = substring2;
                    }
                    long time = this.f5792a.parse(substring).getTime() / 1000;
                    if (!str2.isEmpty()) {
                        i = m7967B(str2);
                    }
                    if (str.charAt(indexOf2) != 'Z') {
                        long x = m7990x(str.substring(indexOf2 + 1));
                        time = str.charAt(indexOf2) == '+' ? time - x : time + x;
                    } else if (str.length() != indexOf2 + 1) {
                        throw new IllegalArgumentException("Invalid timestamp: Invalid trailing data \"" + str.substring(indexOf2) + "\"");
                    }
                    return new Timestamp(time, i);
                }
                throw new IllegalArgumentException("Invalid timestamp: Missing valid timezone offset: " + str);
            }
            throw new IllegalArgumentException("Invalid timestamp: " + str);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Failed to parse timestamp", e);
        }
    }

    /* renamed from: v */
    private Timestamp m7988v(JSONObject jSONObject) {
        return new Timestamp(jSONObject.optLong("seconds"), jSONObject.optInt("nanos"));
    }

    /* renamed from: w */
    private void m7989w(Value.Builder builder, Object obj) throws JSONException {
        Timestamp t = m7986t(obj);
        builder.mo63939b0(com.google.protobuf.Timestamp.m81258Z().mo65440O(t.mo61973e()).mo65439N(t.mo61971d()));
    }

    /* renamed from: x */
    private static long m7990x(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            return ((Long.parseLong(str.substring(0, indexOf)) * 60) + Long.parseLong(str.substring(indexOf + 1))) * 60;
        }
        throw new IllegalArgumentException("Invalid offset value: " + str);
    }

    /* renamed from: y */
    private void m7991y(List<Filter> list, JSONObject jSONObject) throws JSONException {
        FieldPath j = m7977j(jSONObject.getJSONObject("field"));
        String string = jSONObject.getString("op");
        string.hashCode();
        char c = 65535;
        switch (string.hashCode()) {
            case -2125479834:
                if (string.equals("IS_NAN")) {
                    c = 0;
                    break;
                }
                break;
            case -1465346180:
                if (string.equals("IS_NULL")) {
                    c = 1;
                    break;
                }
                break;
            case -244195494:
                if (string.equals("IS_NOT_NAN")) {
                    c = 2;
                    break;
                }
                break;
            case 1019893512:
                if (string.equals("IS_NOT_NULL")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                list.add(FieldFilter.m8065d(j, Filter.Operator.EQUAL, Values.f54470a));
                return;
            case 1:
                list.add(FieldFilter.m8065d(j, Filter.Operator.EQUAL, Values.f54471b));
                return;
            case 2:
                list.add(FieldFilter.m8065d(j, Filter.Operator.NOT_EQUAL, Values.f54470a));
                return;
            case 3:
                list.add(FieldFilter.m8065d(j, Filter.Operator.NOT_EQUAL, Values.f54471b));
                return;
            default:
                throw new IllegalArgumentException("Unexpected unary filter: " + string);
        }
    }

    /* renamed from: z */
    private Value m7992z(JSONObject jSONObject) throws JSONException {
        Value.Builder r0 = Value.m78180r0();
        if (jSONObject.has("nullValue")) {
            r0.mo63936Y(NullValue.NULL_VALUE);
        } else if (jSONObject.has("booleanValue")) {
            r0.mo63929P(jSONObject.optBoolean("booleanValue", false));
        } else if (jSONObject.has("integerValue")) {
            r0.mo63933U(jSONObject.optLong("integerValue"));
        } else if (jSONObject.has("doubleValue")) {
            r0.mo63931S(jSONObject.optDouble("doubleValue"));
        } else if (jSONObject.has("timestampValue")) {
            m7989w(r0, jSONObject.get("timestampValue"));
        } else if (jSONObject.has("stringValue")) {
            r0.mo63938a0(jSONObject.optString("stringValue", ""));
        } else if (jSONObject.has("bytesValue")) {
            r0.mo63930R(ByteString.m79773p(Base64.decode(jSONObject.getString("bytesValue"), 0)));
        } else if (jSONObject.has("referenceValue")) {
            r0.mo63937Z(jSONObject.getString("referenceValue"));
        } else if (jSONObject.has("geoPointValue")) {
            m7979l(r0, jSONObject.getJSONObject("geoPointValue"));
        } else if (jSONObject.has("arrayValue")) {
            m7971a(r0, jSONObject.getJSONObject("arrayValue").optJSONArray("values"));
        } else if (jSONObject.has("mapValue")) {
            m7982o(r0, jSONObject.getJSONObject("mapValue").optJSONObject("fields"));
        } else {
            throw new IllegalArgumentException("Unexpected value type: " + jSONObject);
        }
        return (Value) r0.build();
    }

    /* renamed from: c */
    public BundleMetadata mo23781c(JSONObject jSONObject) throws JSONException {
        return new BundleMetadata(jSONObject.getString("id"), jSONObject.getInt(ClientCookie.VERSION_ATTR), m7985s(jSONObject.get("createTime")), jSONObject.getInt("totalDocuments"), jSONObject.getLong("totalBytes"));
    }

    /* renamed from: d */
    public BundledDocumentMetadata mo23782d(JSONObject jSONObject) throws JSONException {
        DocumentKey i = DocumentKey.m75849i(m7983p(jSONObject.getString("name")));
        SnapshotVersion s = m7985s(jSONObject.get("readTime"));
        boolean optBoolean = jSONObject.optBoolean("exists", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("queries");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList.add(optJSONArray.getString(i2));
            }
        }
        return new BundledDocumentMetadata(i, s, optBoolean, arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public BundleDocument mo23783g(JSONObject jSONObject) throws JSONException {
        DocumentKey i = DocumentKey.m75849i(m7983p(jSONObject.getString("name")));
        SnapshotVersion s = m7985s(jSONObject.get("updateTime"));
        Value.Builder r0 = Value.m78180r0();
        m7982o(r0, jSONObject.getJSONObject("fields"));
        return new BundleDocument(MutableDocument.m75871p(i, s, ObjectValue.m75893g(r0.mo63927N().mo63832X())));
    }

    /* renamed from: q */
    public NamedQuery mo23784q(JSONObject jSONObject) throws JSONException {
        return new NamedQuery(jSONObject.getString("name"), m7973e(jSONObject.getJSONObject("bundledQuery")), m7985s(jSONObject.get("readTime")));
    }
}
