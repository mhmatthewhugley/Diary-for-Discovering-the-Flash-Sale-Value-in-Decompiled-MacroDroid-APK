package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdyb {

    /* renamed from: a */
    private final Clock f33370a;

    public zzdyb(Clock clock) {
        this.f33370a = clock;
    }

    /* renamed from: a */
    public final void mo45063a(List list, String str, String str2, Object... objArr) {
        if (((Boolean) zzbkv.f27469a.mo42728e()).booleanValue()) {
            long a = this.f33370a.mo21950a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(a);
                jsonWriter.name("source").value(str);
                jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str2);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj2 = objArr[i];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                zzcgp.m45227e("unable to log", e);
            }
            zzcgp.m45228f("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }
}
