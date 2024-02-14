package p118k2;

import com.arlosoft.macrodroid.plugins.api.UploadPluginBody;
import com.arlosoft.macrodroid.plugins.data.PluginDetail;
import com.arlosoft.macrodroid.templatestore.model.Comment;
import com.arlosoft.macrodroid.templatestore.model.PluginPostCommentBody;
import java.util.List;
import kotlin.coroutines.C13635d;
import okhttp3.C15997y;
import p297ja.C13339u;
import p414v9.C16728b;
import p414v9.C16747p;
import p458df.C17122a;
import p458df.C17123b;
import p458df.C17127f;
import p458df.C17130i;
import p458df.C17133l;
import p458df.C17136o;
import p458df.C17137p;
import p458df.C17138q;
import p458df.C17141t;

/* renamed from: k2.b */
/* compiled from: PluginListApi.kt */
public interface C7471b {
    @C17123b("/v1/plugin_comments")
    /* renamed from: a */
    C16728b mo37626a(@C17130i("authorization") String str, @C17141t("commentId") int i, @C17141t("pluginId") int i2);

    @C17137p("/v1/plugin_comments")
    /* renamed from: b */
    C16728b mo37627b(@C17130i("authorization") String str, @C17141t("userId") int i, @C17141t("commentId") int i2, @C17141t("text") String str2);

    @C17127f("/v1/plugin_comments")
    /* renamed from: c */
    C16747p<List<Comment>> mo37628c(@C17141t("pluginId") int i, @C17141t("timestampBefore") long j, @C17141t("pageSize") int i2);

    @C17136o("/v1/pluginsStarMacro")
    /* renamed from: d */
    C16728b mo37629d(@C17130i("authorization") String str, @C17141t("pluginId") int i, @C17141t("userId") int i2, @C17141t("addStar") boolean z);

    @C17136o("/v1/plugin_comments")
    /* renamed from: e */
    C16728b mo37630e(@C17130i("authorization") String str, @C17122a PluginPostCommentBody pluginPostCommentBody);

    @C17136o("/v1/pluginsIcon")
    @C17133l
    /* renamed from: f */
    Object mo37631f(@C17138q C15997y.C16000c cVar, C13635d<? super String> dVar);

    @C17136o("/v1/plugins")
    /* renamed from: g */
    Object mo37632g(@C17130i("authorization") String str, @C17122a UploadPluginBody uploadPluginBody, C13635d<? super C13339u> dVar);

    @C17136o("/v1/reportPlugin")
    /* renamed from: h */
    C16728b mo37633h(@C17141t("pluginId") int i, @C17141t("pluginName") String str, @C17141t("reasonCode") int i2);

    @C17127f("/v1/plugins")
    /* renamed from: i */
    C16747p<List<PluginDetail>> mo37634i(@C17141t("queryingUserId") int i, @C17141t("start") int i2, @C17141t("pageSize") int i3, @C17141t("orderBy") int i4, @C17141t("deviceLanguage") String str);

    @C17127f("/v1/checkPlugin")
    /* renamed from: j */
    Object mo37635j(@C17141t("packageName") String str, C13635d<? super C13339u> dVar);
}
