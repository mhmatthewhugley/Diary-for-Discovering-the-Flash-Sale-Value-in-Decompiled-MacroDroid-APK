package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfdl {

    /* renamed from: a */
    public final int f35561a;

    /* renamed from: b */
    public final int f35562b;

    /* renamed from: c */
    public final boolean f35563c;

    public zzfdl(int i, int i2, boolean z) {
        this.f35561a = i;
        this.f35562b = i2;
        this.f35563c = z;
    }

    /* renamed from: a */
    static List m49944a(JsonReader jsonReader) throws IllegalStateException, IOException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new zzfdl(i, i2, z));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
