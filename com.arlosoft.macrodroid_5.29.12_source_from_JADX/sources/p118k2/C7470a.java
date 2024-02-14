package p118k2;

import com.arlosoft.macrodroid.plugins.data.AppBrainPackageInfo;
import kotlin.coroutines.C13635d;
import p458df.C17127f;
import p458df.C17132k;
import p458df.C17141t;

/* renamed from: k2.a */
/* compiled from: AppBrainApi.kt */
public interface C7470a {
    @C17127f("/v2/info/getapp")
    @C17132k({"Accept: application/json"})
    /* renamed from: a */
    Object mo37625a(@C17141t("apikey") String str, @C17141t("package") String str2, C13635d<? super AppBrainPackageInfo> dVar);
}
