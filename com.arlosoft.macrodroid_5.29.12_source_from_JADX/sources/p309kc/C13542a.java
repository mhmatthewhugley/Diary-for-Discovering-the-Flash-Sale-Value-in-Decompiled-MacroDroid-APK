package p309kc;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13321g;
import p297ja.C13339u;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u001a\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\"\u001b\u0010\n\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, mo71668d2 = {"Landroid/app/Activity;", "Lkotlin/Function0;", "Lja/u;", "block", "b", "", "hasAndroidXFragmentActivity$delegate", "Lja/g;", "a", "()Z", "hasAndroidXFragmentActivity", "plumber-android_release"}, mo71669k = 2, mo71670mv = {1, 4, 1})
/* renamed from: kc.a */
/* compiled from: FragmentExtensions.kt */
public final class C13542a {

    /* renamed from: a */
    private static final C13321g f61817a = C13323i.m85669b(C13543a.f61818a);

    @Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo71668d2 = {"<anonymous>", "", "invoke"}, mo71669k = 3, mo71670mv = {1, 4, 1})
    /* renamed from: kc.a$a */
    /* compiled from: FragmentExtensions.kt */
    static final class C13543a extends C13708q implements C16254a<Boolean> {

        /* renamed from: a */
        public static final C13543a f61818a = new C13543a();

        C13543a() {
            super(0);
        }

        public final boolean invoke() {
            try {
                int i = FragmentActivity.f542c;
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo71668d2 = {"kc/a$b", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "Landroidx/fragment/app/FragmentManager;", "fm", "Landroidx/fragment/app/Fragment;", "fragment", "Lja/u;", "onFragmentViewDestroyed", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
    /* renamed from: kc.a$b */
    /* compiled from: FragmentExtensions.kt */
    public static final class C13544b extends FragmentManager.FragmentLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ C16254a f61819a;

        C13544b(C16254a aVar) {
            this.f61819a = aVar;
        }

        public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
            C13706o.m87930g(fragmentManager, "fm");
            C13706o.m87930g(fragment, "fragment");
            this.f61819a.invoke();
        }
    }

    /* renamed from: a */
    private static final boolean m87343a() {
        return ((Boolean) f61817a.getValue()).booleanValue();
    }

    /* renamed from: b */
    public static final void m87344b(Activity activity, C16254a<C13339u> aVar) {
        C13706o.m87930g(activity, "$this$onAndroidXFragmentViewDestroyed");
        C13706o.m87930g(aVar, "block");
        if (m87343a() && (activity instanceof FragmentActivity)) {
            ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(new C13544b(aVar), true);
        }
    }
}
