package p176v0;

import android.app.Activity;
import android.content.Intent;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;
import com.arlosoft.macrodroid.C17523R$anim;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.editscreen.EditMacroActivity;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.templatestore.model.MacroTemplate;
import com.arlosoft.macrodroid.templatestore.p071ui.comments.C5295g;
import com.arlosoft.macrodroid.templatestore.p071ui.comments.TemplateCommentsActivity;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.ProfileActivity;
import com.arlosoft.macrodroid.templatestore.p071ui.search.TemplateSearchActivity;
import com.arlosoft.macrodroid.templatestore.p071ui.upload.TemplateUploadActivity;
import com.arlosoft.macrodroid.templatestore.p071ui.user.UserActivity;
import com.arlosoft.macrodroid.templatestore.reportmacro.C5247g;
import com.arlosoft.macrodroid.templatestore.reportmacro.ReportMacroActivity;
import com.arlosoft.macrodroid.upgrade.UpgradeActivity2;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: v0.a */
/* compiled from: ScreenLoader.kt */
public final class C10312a {

    /* renamed from: d */
    public static final C10313a f23475d = new C10313a((C13695i) null);

    /* renamed from: a */
    private final Activity f23476a;

    /* renamed from: b */
    private final C5247g f23477b;

    /* renamed from: c */
    public C5295g f23478c;

    /* renamed from: v0.a$a */
    /* compiled from: ScreenLoader.kt */
    public static final class C10313a {
        private C10313a() {
        }

        public /* synthetic */ C10313a(C13695i iVar) {
            this();
        }
    }

    public C10312a(Activity activity, C5247g gVar) {
        C13706o.m87929f(activity, "currentActivity");
        C13706o.m87929f(gVar, "reportMacroRepository");
        this.f23476a = activity;
        this.f23477b = gVar;
    }

    /* renamed from: l */
    public static /* synthetic */ void m40505l(C10312a aVar, String str, String str2, int i, AvatarView avatarView, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            avatarView = null;
        }
        aVar.mo40936k(str, str2, i, avatarView);
    }

    /* renamed from: a */
    public final void mo40926a() {
        this.f23476a.finish();
    }

    /* renamed from: b */
    public final C5295g mo40927b() {
        C5295g gVar = this.f23478c;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("templateCommentsDataRepository");
        return null;
    }

    /* renamed from: c */
    public final void mo40928c(Macro macro, boolean z) {
        C13706o.m87929f(macro, "macro");
        macro.setCompleted(false);
        C4934n.m18998M().mo29701s(macro, false);
        macro.setTemplateSelected();
        Intent intent = new Intent(this.f23476a, EditMacroActivity.class);
        intent.putExtra("MacroId", macro.getId());
        intent.putExtra("is_template", true);
        intent.putExtra("new_template_store", z);
        this.f23476a.startActivity(intent);
    }

    /* renamed from: d */
    public final void mo40929d(boolean z, String str, boolean z2) {
        C13706o.m87929f(str, "personalIdentifier");
        this.f23476a.startActivity(ProfileActivity.f13156G.mo30512a(this.f23476a, z, str, z2));
    }

    /* renamed from: e */
    public final void mo40930e(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        this.f23477b.mo30395b(macroTemplate);
        ReportMacroActivity.f13055C.mo30366a(this.f23476a);
    }

    /* renamed from: f */
    public final void mo40931f(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        mo40927b().mo30483b(macroTemplate.clearJsonData());
        this.f23476a.startActivityForResult(TemplateCommentsActivity.f13109N.mo30468a(this.f23476a), 101);
        this.f23476a.overridePendingTransition(C17523R$anim.up_from_bottom, 0);
    }

    /* renamed from: g */
    public final void mo40932g(int i) {
        TemplateSearchActivity.C5343a aVar = TemplateSearchActivity.f13190F;
        Activity activity = this.f23476a;
        this.f23476a.startActivity(TemplateSearchActivity.C5343a.m20731b(aVar, activity, "id=" + i, 0, 4, (Object) null));
    }

    /* renamed from: h */
    public final void mo40933h(int i, Macro macro, String str, String str2) {
        C13706o.m87929f(macro, "macro");
        C13706o.m87929f(str, "description");
        C13706o.m87929f(str2, "category");
        this.f23476a.startActivity(TemplateUploadActivity.f13428L.mo30741a(this.f23476a, Integer.valueOf(i), macro, str, str2));
    }

    /* renamed from: i */
    public final void mo40934i(int i, String str, String str2, String str3) {
        C13706o.m87929f(str, "macroName");
        C13706o.m87929f(str2, "description");
        C13706o.m87929f(str3, "category");
        this.f23476a.startActivity(TemplateUploadActivity.f13428L.mo30742b(this.f23476a, Integer.valueOf(i), str, str2, str3));
    }

    /* renamed from: j */
    public final void mo40935j() {
        this.f23476a.startActivity(new Intent(this.f23476a, UpgradeActivity2.class));
    }

    /* renamed from: k */
    public final void mo40936k(String str, String str2, int i, AvatarView avatarView) {
        C13706o.m87929f(str, "username");
        C13706o.m87929f(str2, "userImage");
        Intent a = UserActivity.f13476H.mo30778a(this.f23476a, str, str2, i);
        if (avatarView != null) {
            Pair create = Pair.create(avatarView, "avatarImage");
            C13706o.m87928e(create, "create<View, String>(avaterImage, \"avatarImage\")");
            ActivityOptionsCompat makeSceneTransitionAnimation = ActivityOptionsCompat.makeSceneTransitionAnimation(this.f23476a, create);
            C13706o.m87928e(makeSceneTransitionAnimation, "makeSceneTransitionAnima…urrentActivity, pairCard)");
            this.f23476a.startActivity(a, makeSceneTransitionAnimation.toBundle());
            return;
        }
        this.f23476a.startActivity(a);
    }
}
