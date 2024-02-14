package com.getpebble.android.kit.util;

import android.util.Base64;
import com.getpebble.android.kit.util.PebbleTuple;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PebbleDictionary implements Iterable<PebbleTuple> {

    /* renamed from: a */
    protected final Map<Integer, PebbleTuple> f16166a = new HashMap();

    public static class PebbleDictTypeException extends RuntimeException {
        public PebbleDictTypeException(long j, PebbleTuple.C6912a aVar, PebbleTuple.C6912a aVar2) {
            super(String.format("Expected type '%s', but got '%s' for key 0x%08x", new Object[]{aVar.name(), aVar2.name(), Long.valueOf(j)}));
        }
    }

    public static class TupleOverflowException extends RuntimeException {
        public TupleOverflowException() {
            super("Too many tuples in dict");
        }
    }

    /* renamed from: com.getpebble.android.kit.util.PebbleDictionary$a */
    static /* synthetic */ class C6911a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16167a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.getpebble.android.kit.util.PebbleTuple$a[] r0 = com.getpebble.android.kit.util.PebbleTuple.C6912a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16167a = r0
                com.getpebble.android.kit.util.PebbleTuple$a r1 = com.getpebble.android.kit.util.PebbleTuple.C6912a.BYTES     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16167a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.getpebble.android.kit.util.PebbleTuple$a r1 = com.getpebble.android.kit.util.PebbleTuple.C6912a.STRING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16167a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.getpebble.android.kit.util.PebbleTuple$a r1 = com.getpebble.android.kit.util.PebbleTuple.C6912a.INT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16167a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.getpebble.android.kit.util.PebbleTuple$a r1 = com.getpebble.android.kit.util.PebbleTuple.C6912a.UINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.getpebble.android.kit.util.PebbleDictionary.C6911a.<clinit>():void");
        }
    }

    /* renamed from: o */
    public static PebbleDictionary m26101o(String str) throws JSONException {
        PebbleDictionary pebbleDictionary = new PebbleDictionary();
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            int i2 = jSONObject.getInt("key");
            PebbleTuple.C6913b bVar = PebbleTuple.f16170h.get(Integer.valueOf(jSONObject.getInt("length")));
            int i3 = C6911a.f16167a[PebbleTuple.f16169g.get(jSONObject.getString("type")).ordinal()];
            if (i3 == 1) {
                pebbleDictionary.mo34289c(i2, Base64.decode(jSONObject.getString("value"), 2));
            } else if (i3 == 2) {
                pebbleDictionary.mo34293i(i2, jSONObject.getString("value"));
            } else if (i3 != 3) {
                if (i3 == 4) {
                    if (bVar == PebbleTuple.C6913b.BYTE) {
                        pebbleDictionary.mo34298m(i2, (byte) jSONObject.getInt("value"));
                    } else if (bVar == PebbleTuple.C6913b.SHORT) {
                        pebbleDictionary.mo34296k(i2, (short) jSONObject.getInt("value"));
                    } else if (bVar == PebbleTuple.C6913b.WORD) {
                        pebbleDictionary.mo34297l(i2, jSONObject.getInt("value"));
                    }
                }
            } else if (bVar == PebbleTuple.C6913b.BYTE) {
                pebbleDictionary.mo34292h(i2, (byte) jSONObject.getInt("value"));
            } else if (bVar == PebbleTuple.C6913b.SHORT) {
                pebbleDictionary.mo34290d(i2, (short) jSONObject.getInt("value"));
            } else if (bVar == PebbleTuple.C6913b.WORD) {
                pebbleDictionary.mo34291f(i2, jSONObject.getInt("value"));
            }
        }
        return pebbleDictionary;
    }

    /* renamed from: q */
    private PebbleTuple m26102q(int i, PebbleTuple.C6912a aVar) {
        if (!this.f16166a.containsKey(Integer.valueOf(i)) || this.f16166a.get(Integer.valueOf(i)) == null) {
            return null;
        }
        PebbleTuple pebbleTuple = this.f16166a.get(Integer.valueOf(i));
        if (pebbleTuple.f16172b == aVar) {
            return pebbleTuple;
        }
        throw new PebbleDictTypeException((long) i, aVar, pebbleTuple.f16172b);
    }

    /* renamed from: s */
    private static JSONObject m26103s(PebbleTuple pebbleTuple) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", pebbleTuple.f16171a);
        jSONObject.put("type", pebbleTuple.f16172b.getName());
        jSONObject.put("length", pebbleTuple.f16173c.value);
        int i = C6911a.f16167a[pebbleTuple.f16172b.ordinal()];
        if (i == 1) {
            jSONObject.put("value", Base64.encodeToString((byte[]) pebbleTuple.f16175e, 2));
        } else if (i == 2 || i == 3 || i == 4) {
            jSONObject.put("value", pebbleTuple.f16175e);
        }
        return jSONObject;
    }

    /* renamed from: c */
    public void mo34289c(int i, byte[] bArr) {
        mo34295j(PebbleTuple.m26117b(i, PebbleTuple.C6912a.BYTES, PebbleTuple.C6913b.NONE, bArr));
    }

    /* renamed from: d */
    public void mo34290d(int i, short s) {
        mo34295j(PebbleTuple.m26116a(i, PebbleTuple.C6912a.INT, PebbleTuple.C6913b.SHORT, s));
    }

    /* renamed from: f */
    public void mo34291f(int i, int i2) {
        mo34295j(PebbleTuple.m26116a(i, PebbleTuple.C6912a.INT, PebbleTuple.C6913b.WORD, i2));
    }

    /* renamed from: h */
    public void mo34292h(int i, byte b) {
        mo34295j(PebbleTuple.m26116a(i, PebbleTuple.C6912a.INT, PebbleTuple.C6913b.BYTE, b));
    }

    /* renamed from: i */
    public void mo34293i(int i, String str) {
        mo34295j(PebbleTuple.m26117b(i, PebbleTuple.C6912a.STRING, PebbleTuple.C6913b.NONE, str));
    }

    public Iterator<PebbleTuple> iterator() {
        return this.f16166a.values().iterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo34295j(PebbleTuple pebbleTuple) {
        if (this.f16166a.size() <= 255) {
            this.f16166a.put(Integer.valueOf(pebbleTuple.f16171a), pebbleTuple);
            return;
        }
        throw new TupleOverflowException();
    }

    /* renamed from: k */
    public void mo34296k(int i, short s) {
        mo34295j(PebbleTuple.m26116a(i, PebbleTuple.C6912a.UINT, PebbleTuple.C6913b.SHORT, s));
    }

    /* renamed from: l */
    public void mo34297l(int i, int i2) {
        mo34295j(PebbleTuple.m26116a(i, PebbleTuple.C6912a.UINT, PebbleTuple.C6913b.WORD, i2));
    }

    /* renamed from: m */
    public void mo34298m(int i, byte b) {
        mo34295j(PebbleTuple.m26116a(i, PebbleTuple.C6912a.UINT, PebbleTuple.C6913b.BYTE, b));
    }

    /* renamed from: n */
    public boolean mo34299n(int i) {
        return this.f16166a.containsKey(Integer.valueOf(i));
    }

    /* renamed from: p */
    public Long mo34300p(int i) {
        PebbleTuple q = m26102q(i, PebbleTuple.C6912a.INT);
        if (q == null) {
            return null;
        }
        return (Long) q.f16175e;
    }

    public int size() {
        return this.f16166a.size();
    }

    /* renamed from: t */
    public String mo34302t() {
        try {
            JSONArray jSONArray = new JSONArray();
            for (PebbleTuple s : this.f16166a.values()) {
                jSONArray.put(m26103s(s));
            }
            return jSONArray.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
