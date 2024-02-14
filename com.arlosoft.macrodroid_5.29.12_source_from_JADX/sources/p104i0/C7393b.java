package p104i0;

import com.arlosoft.macrodroid.upgrade.model.ProUserStatus;
import com.arlosoft.macrodroid.upgrade.model.UpgradeResponse;
import kotlin.coroutines.C13635d;
import p414v9.C16747p;
import p458df.C17127f;
import p458df.C17130i;
import p458df.C17141t;

/* renamed from: i0.b */
/* compiled from: UpgradeApi.kt */
public interface C7393b {
    @C17127f("/v1/checkPro")
    /* renamed from: a */
    Object mo37423a(@C17130i("authorization") String str, @C17141t("serial") String str2, @C17141t("subscriptionId") String str3, @C17141t("token") String str4, C13635d<? super ProUserStatus> dVar);

    @C17127f("/v1/activatePro")
    /* renamed from: b */
    C16747p<UpgradeResponse> mo37424b(@C17130i("authorization") String str, @C17141t("email") String str2, @C17141t("serial") String str3);

    @C17127f("/v1/activatePro")
    /* renamed from: c */
    Object mo37425c(@C17130i("authorization") String str, @C17141t("email") String str2, @C17141t("serial") String str3, C13635d<? super UpgradeResponse> dVar);
}
