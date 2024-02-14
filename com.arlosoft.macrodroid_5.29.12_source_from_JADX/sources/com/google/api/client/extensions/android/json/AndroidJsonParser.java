package com.google.api.client.extensions.android.json;

import android.util.JsonReader;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonParser;
import com.google.api.client.json.JsonToken;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Beta
class AndroidJsonParser extends JsonParser {

    /* renamed from: c */
    private final JsonReader f52222c;

    /* renamed from: d */
    private final AndroidJsonFactory f52223d;

    /* renamed from: e */
    private List<String> f52224e = new ArrayList();

    /* renamed from: f */
    private JsonToken f52225f;

    /* renamed from: g */
    private String f52226g;

    /* renamed from: com.google.api.client.extensions.android.json.AndroidJsonParser$1 */
    static /* synthetic */ class C108231 {

        /* renamed from: a */
        static final /* synthetic */ int[] f52227a;

        /* renamed from: b */
        static final /* synthetic */ int[] f52228b;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23|24|(3:25|26|28)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23|24|25|26|28) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        static {
            /*
                android.util.JsonToken[] r0 = android.util.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f52228b = r0
                r1 = 1
                android.util.JsonToken r2 = android.util.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f52228b     // Catch:{ NoSuchFieldError -> 0x001d }
                android.util.JsonToken r3 = android.util.JsonToken.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f52228b     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.util.JsonToken r3 = android.util.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r2 = f52228b     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.util.JsonToken r3 = android.util.JsonToken.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r2 = f52228b     // Catch:{ NoSuchFieldError -> 0x003e }
                android.util.JsonToken r3 = android.util.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r4 = 5
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r2 = f52228b     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.util.JsonToken r3 = android.util.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r4 = 6
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r2 = f52228b     // Catch:{ NoSuchFieldError -> 0x0054 }
                android.util.JsonToken r3 = android.util.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r4 = 7
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r2 = f52228b     // Catch:{ NoSuchFieldError -> 0x0060 }
                android.util.JsonToken r3 = android.util.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r4 = 8
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r2 = f52228b     // Catch:{ NoSuchFieldError -> 0x006c }
                android.util.JsonToken r3 = android.util.JsonToken.NAME     // Catch:{ NoSuchFieldError -> 0x006c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r4 = 9
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                com.google.api.client.json.JsonToken[] r2 = com.google.api.client.json.JsonToken.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f52227a = r2
                com.google.api.client.json.JsonToken r3 = com.google.api.client.json.JsonToken.START_ARRAY     // Catch:{ NoSuchFieldError -> 0x007d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r1 = f52227a     // Catch:{ NoSuchFieldError -> 0x0087 }
                com.google.api.client.json.JsonToken r2 = com.google.api.client.json.JsonToken.START_OBJECT     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.extensions.android.json.AndroidJsonParser.C108231.<clinit>():void");
        }
    }

    AndroidJsonParser(AndroidJsonFactory androidJsonFactory, JsonReader jsonReader) {
        this.f52223d = androidJsonFactory;
        this.f52222c = jsonReader;
        jsonReader.setLenient(true);
    }

    /* renamed from: G */
    private void m71671G() {
        JsonToken jsonToken = this.f52225f;
        Preconditions.m72713a(jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT);
    }

    /* renamed from: B */
    public JsonParser mo60198B() throws IOException {
        JsonToken jsonToken = this.f52225f;
        if (jsonToken != null) {
            int i = C108231.f52227a[jsonToken.ordinal()];
            if (i == 1) {
                this.f52222c.skipValue();
                this.f52226g = "]";
                this.f52225f = JsonToken.END_ARRAY;
            } else if (i == 2) {
                this.f52222c.skipValue();
                this.f52226g = "}";
                this.f52225f = JsonToken.END_OBJECT;
            }
        }
        return this;
    }

    /* renamed from: a */
    public void mo60199a() throws IOException {
        this.f52222c.close();
    }

    /* renamed from: b */
    public BigInteger mo60200b() {
        m71671G();
        return new BigInteger(this.f52226g);
    }

    /* renamed from: c */
    public byte mo60201c() {
        m71671G();
        return Byte.valueOf(this.f52226g).byteValue();
    }

    /* renamed from: e */
    public String mo60202e() {
        if (this.f52224e.isEmpty()) {
            return null;
        }
        List<String> list = this.f52224e;
        return list.get(list.size() - 1);
    }

    /* renamed from: f */
    public JsonToken mo60203f() {
        return this.f52225f;
    }

    /* renamed from: g */
    public BigDecimal mo60204g() {
        m71671G();
        return new BigDecimal(this.f52226g);
    }

    /* renamed from: h */
    public double mo60205h() {
        m71671G();
        return Double.valueOf(this.f52226g).doubleValue();
    }

    /* renamed from: i */
    public JsonFactory mo60206i() {
        return this.f52223d;
    }

    /* renamed from: j */
    public float mo60207j() {
        m71671G();
        return Float.valueOf(this.f52226g).floatValue();
    }

    /* renamed from: k */
    public int mo60208k() {
        m71671G();
        return Integer.valueOf(this.f52226g).intValue();
    }

    /* renamed from: l */
    public long mo60209l() {
        m71671G();
        return Long.valueOf(this.f52226g).longValue();
    }

    /* renamed from: m */
    public short mo60210m() {
        m71671G();
        return Short.valueOf(this.f52226g).shortValue();
    }

    /* renamed from: n */
    public String mo60211n() {
        return this.f52226g;
    }

    /* renamed from: o */
    public JsonToken mo60212o() throws IOException {
        android.util.JsonToken jsonToken;
        JsonToken jsonToken2 = this.f52225f;
        if (jsonToken2 != null) {
            int i = C108231.f52227a[jsonToken2.ordinal()];
            if (i == 1) {
                this.f52222c.beginArray();
                this.f52224e.add((Object) null);
            } else if (i == 2) {
                this.f52222c.beginObject();
                this.f52224e.add((Object) null);
            }
        }
        try {
            jsonToken = this.f52222c.peek();
        } catch (EOFException unused) {
            jsonToken = android.util.JsonToken.END_DOCUMENT;
        }
        switch (C108231.f52228b[jsonToken.ordinal()]) {
            case 1:
                this.f52226g = "[";
                this.f52225f = JsonToken.START_ARRAY;
                break;
            case 2:
                this.f52226g = "]";
                this.f52225f = JsonToken.END_ARRAY;
                List<String> list = this.f52224e;
                list.remove(list.size() - 1);
                this.f52222c.endArray();
                break;
            case 3:
                this.f52226g = "{";
                this.f52225f = JsonToken.START_OBJECT;
                break;
            case 4:
                this.f52226g = "}";
                this.f52225f = JsonToken.END_OBJECT;
                List<String> list2 = this.f52224e;
                list2.remove(list2.size() - 1);
                this.f52222c.endObject();
                break;
            case 5:
                if (!this.f52222c.nextBoolean()) {
                    this.f52226g = "false";
                    this.f52225f = JsonToken.VALUE_FALSE;
                    break;
                } else {
                    this.f52226g = "true";
                    this.f52225f = JsonToken.VALUE_TRUE;
                    break;
                }
            case 6:
                this.f52226g = "null";
                this.f52225f = JsonToken.VALUE_NULL;
                this.f52222c.nextNull();
                break;
            case 7:
                this.f52226g = this.f52222c.nextString();
                this.f52225f = JsonToken.VALUE_STRING;
                break;
            case 8:
                String nextString = this.f52222c.nextString();
                this.f52226g = nextString;
                this.f52225f = nextString.indexOf(46) == -1 ? JsonToken.VALUE_NUMBER_INT : JsonToken.VALUE_NUMBER_FLOAT;
                break;
            case 9:
                this.f52226g = this.f52222c.nextName();
                this.f52225f = JsonToken.FIELD_NAME;
                List<String> list3 = this.f52224e;
                list3.set(list3.size() - 1, this.f52226g);
                break;
            default:
                this.f52226g = null;
                this.f52225f = null;
                break;
        }
        return this.f52225f;
    }
}
