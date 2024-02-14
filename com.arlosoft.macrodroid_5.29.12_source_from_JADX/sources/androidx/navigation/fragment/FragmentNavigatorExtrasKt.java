package androidx.navigation.fragment;

import android.view.View;
import androidx.navigation.fragment.FragmentNavigator;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13328m;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0006\u001a\u00020\u00052*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo71668d2 = {"", "Lja/m;", "Landroid/view/View;", "", "sharedElements", "Landroidx/navigation/fragment/FragmentNavigator$Extras;", "FragmentNavigatorExtras", "([Lja/m;)Landroidx/navigation/fragment/FragmentNavigator$Extras;", "navigation-fragment-ktx_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* compiled from: FragmentNavigatorExtras.kt */
public final class FragmentNavigatorExtrasKt {
    public static final FragmentNavigator.Extras FragmentNavigatorExtras(C13328m<? extends View, String>... mVarArr) {
        C13706o.m87930g(mVarArr, "sharedElements");
        FragmentNavigator.Extras.Builder builder = new FragmentNavigator.Extras.Builder();
        for (C13328m<? extends View, String> mVar : mVarArr) {
            builder.addSharedElement((View) mVar.mo70152a(), mVar.mo70153b());
        }
        FragmentNavigator.Extras build = builder.build();
        C13706o.m87925b(build, "FragmentNavigator.Extras…      }\n        }.build()");
        return build;
    }
}
