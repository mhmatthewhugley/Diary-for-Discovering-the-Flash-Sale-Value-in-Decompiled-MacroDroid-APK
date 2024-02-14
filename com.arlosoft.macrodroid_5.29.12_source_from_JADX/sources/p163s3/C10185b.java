package p163s3;

import p414v9.C16728b;
import p458df.C17136o;
import p458df.C17141t;

/* renamed from: s3.b */
/* compiled from: WebTriggerApi.kt */
public interface C10185b {
    @C17136o("/v1/urlTriggerToken")
    /* renamed from: a */
    C16728b mo40786a(@C17141t("deviceId") String str, @C17141t("alias") String str2, @C17141t("pushToken") String str3, @C17141t("company") String str4);

    @C17136o("/v1/urlTriggerDeviceIdPort")
    /* renamed from: b */
    C16728b mo40787b(@C17141t("deviceId") String str, @C17141t("passwordHash") String str2, @C17141t("pushToken") String str3);

    @C17136o("/v1/urlTriggerExport")
    /* renamed from: c */
    C16728b mo40788c(@C17141t("deviceId") String str, @C17141t("passwordHash") String str2);
}
