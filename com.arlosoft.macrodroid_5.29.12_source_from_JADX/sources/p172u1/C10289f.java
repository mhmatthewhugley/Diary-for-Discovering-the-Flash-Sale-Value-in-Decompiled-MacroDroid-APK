package p172u1;

import com.arlosoft.macrodroid.action.UiInteractionConfiguration;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C13687e0;

/* renamed from: u1.f */
/* compiled from: UIInteractionConfigurationDeserializer.kt */
public final class C10289f implements JsonDeserializer<UiInteractionConfiguration>, JsonSerializer<UiInteractionConfiguration> {
    /* renamed from: c */
    public UiInteractionConfiguration mo29657a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonElement q;
        JsonObject h = jsonElement != null ? jsonElement.mo64025h() : null;
        String k = (h == null || (q = h.mo64038q("type")) == null) ? null : q.mo64019k();
        if (jsonDeserializationContext == null) {
            return null;
        }
        return (UiInteractionConfiguration) jsonDeserializationContext.mo64023b(jsonElement, Class.forName(C13687e0.m87868b(UiInteractionConfiguration.class).mo71942g() + '$' + k));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.gson.JsonElement, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.gson.JsonElement mo40892b(com.arlosoft.macrodroid.action.UiInteractionConfiguration r3, java.lang.reflect.Type r4, com.google.gson.JsonSerializationContext r5) {
        /*
            r2 = this;
            r4 = 0
            if (r5 == 0) goto L_0x002f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<com.arlosoft.macrodroid.action.UiInteractionConfiguration> r1 = com.arlosoft.macrodroid.action.UiInteractionConfiguration.class
            xa.d r1 = kotlin.jvm.internal.C13687e0.m87868b(r1)
            java.lang.String r1 = r1.mo71942g()
            r0.append(r1)
            r1 = 36
            r0.append(r1)
            if (r3 == 0) goto L_0x0020
            java.lang.String r4 = r3.getType()
        L_0x0020:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.Class r4 = java.lang.Class.forName(r4)
            com.google.gson.JsonElement r4 = r5.mo64048a(r3, r4)
        L_0x002f:
            kotlin.jvm.internal.C13706o.m87926c(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p172u1.C10289f.mo40892b(com.arlosoft.macrodroid.action.UiInteractionConfiguration, java.lang.reflect.Type, com.google.gson.JsonSerializationContext):com.google.gson.JsonElement");
    }
}
