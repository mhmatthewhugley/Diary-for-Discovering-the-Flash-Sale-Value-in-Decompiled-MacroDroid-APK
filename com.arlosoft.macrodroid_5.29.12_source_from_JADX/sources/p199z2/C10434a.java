package p199z2;

import com.arlosoft.macrodroid.templatestore.model.Comment;
import com.arlosoft.macrodroid.templatestore.model.MacroTemplate;
import com.arlosoft.macrodroid.templatestore.model.PostCommentBody;
import com.arlosoft.macrodroid.templatestore.model.Report;
import com.arlosoft.macrodroid.templatestore.model.UploadMacroBody;
import com.arlosoft.macrodroid.templatestore.model.User;
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

/* renamed from: z2.a */
/* compiled from: TemplateStoreApi.kt */
public interface C10434a {
    @C17123b("/v1/comments")
    /* renamed from: a */
    C16728b mo41157a(@C17130i("authorization") String str, @C17141t("commentId") int i, @C17141t("macroId") int i2);

    @C17137p("/v1/comments")
    /* renamed from: b */
    C16728b mo41158b(@C17130i("authorization") String str, @C17141t("userId") int i, @C17141t("commentId") int i2, @C17141t("text") String str2);

    @C17127f("/v1/comments")
    /* renamed from: c */
    C16747p<List<Comment>> mo41159c(@C17141t("macroId") int i, @C17141t("timestampBefore") long j, @C17141t("pageSize") int i2);

    @C17127f("/v1/macros")
    /* renamed from: d */
    C16747p<List<MacroTemplate>> mo41160d(@C17130i("authorization") String str, @C17141t("userId") int i, @C17141t("queryingUserId") int i2, @C17141t("categoryId") int i3, @C17141t("start") int i4, @C17141t("pageSize") int i5, @C17141t("orderBy") int i6, @C17141t("searchTerm") String str2, @C17141t("deviceLanguage") String str3);

    @C17137p("/v1/macros")
    /* renamed from: e */
    C16728b mo41161e(@C17130i("authorization") String str, @C17141t("macroId") int i, @C17141t("name") String str2);

    @C17127f("/v1/users")
    /* renamed from: f */
    C16747p<User> mo41162f(@C17141t("userId") int i);

    @C17136o("/v1/comments")
    /* renamed from: g */
    C16728b mo41163g(@C17130i("authorization") String str, @C17122a PostCommentBody postCommentBody);

    @C17127f("/v1/userRank")
    /* renamed from: h */
    C16747p<List<User>> mo41164h(@C17130i("authorization") String str, @C17141t("start") int i, @C17141t("pageSize") int i2);

    @C17123b("/v1/macros")
    /* renamed from: i */
    C16728b mo41165i(@C17130i("authorization") String str, @C17141t("macroId") int i, @C17141t("userId") int i2);

    @C17127f("/v1/users")
    /* renamed from: j */
    C16747p<User> mo41166j(@C17141t("personalIdentifier") String str);

    @C17137p("/v1/macros")
    /* renamed from: k */
    C16728b mo41167k(@C17130i("authorization") String str, @C17141t("macroId") int i, @C17122a UploadMacroBody uploadMacroBody);

    @C17136o("/v1/macros")
    /* renamed from: l */
    C16728b mo41168l(@C17130i("authorization") String str, @C17122a UploadMacroBody uploadMacroBody);

    @C17137p("/v1/macros")
    /* renamed from: m */
    C16728b mo41169m(@C17130i("authorization") String str, @C17141t("macroId") int i, @C17141t("description") String str2);

    @C17123b("/v1/reports")
    /* renamed from: n */
    Object mo41170n(@C17130i("authorization") String str, @C17141t("macroId") int i, @C17141t("userId") int i2, C13635d<? super C13339u> dVar);

    @C17123b("/v1/users")
    /* renamed from: o */
    C16728b mo41171o(@C17130i("authorization") String str, @C17141t("userId") int i);

    @C17127f("/v1/reports")
    /* renamed from: p */
    Object mo41172p(@C17141t("macroId") int i, C13635d<? super List<Report>> dVar);

    @C17127f("/v1/macros")
    /* renamed from: q */
    Object mo41173q(@C17130i("authorization") String str, @C17141t("userId") int i, @C17141t("queryingUserId") int i2, @C17141t("categoryId") int i3, @C17141t("start") int i4, @C17141t("pageSize") int i5, @C17141t("orderBy") int i6, @C17141t("searchTerm") String str2, @C17141t("deviceLanguage") String str3, C13635d<? super List<MacroTemplate>> dVar);

    @C17123b("/v1/macros")
    /* renamed from: r */
    Object mo41174r(@C17130i("authorization") String str, @C17141t("macroId") int i, @C17141t("userId") int i2, C13635d<? super C13339u> dVar);

    @C17136o("/v1/starMacro")
    /* renamed from: s */
    C16728b mo41175s(@C17130i("authorization") String str, @C17141t("macroId") int i, @C17141t("userId") int i2, @C17141t("addStar") boolean z);

    @C17136o("/v1/users")
    @C17133l
    /* renamed from: t */
    C16747p<User> mo41176t(@C17130i("authorization") String str, @C17141t("username") String str2, @C17141t("personalIdentifier") String str3, @C17141t("description") String str4, @C17138q C15997y.C16000c cVar);

    @C17136o("/v1/reports")
    /* renamed from: u */
    C16728b mo41177u(@C17141t("macroId") int i, @C17141t("userId") int i2, @C17141t("reasonCode") int i3, @C17141t("reasonText") String str);

    @C17136o("/v1/users")
    /* renamed from: v */
    C16747p<User> mo41178v(@C17130i("authorization") String str, @C17141t("username") String str2, @C17141t("personalIdentifier") String str3, @C17141t("description") String str4);

    @C17136o("/v1/userUpdate")
    @C17133l
    /* renamed from: w */
    C16747p<User> mo41179w(@C17130i("authorization") String str, @C17141t("userId") int i, @C17141t("description") String str2, @C17138q C15997y.C16000c cVar);

    @C17136o("/v1/userUpdate")
    /* renamed from: x */
    C16747p<User> mo41180x(@C17130i("authorization") String str, @C17141t("userId") int i, @C17141t("description") String str2);

    @C17136o("/v1/userReports")
    /* renamed from: y */
    C16728b mo41181y(@C17141t("aboutUserId") int i, @C17141t("fromUserId") int i2, @C17141t("reasonCode") int i3, @C17141t("reasonText") String str);
}
