package p099h1;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.categories.CategoryList;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.constraint.LogicConstraint;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p081e1.C7264a;
import p297ja.C13337s;
import p324m8.C15701a;
import p324m8.C15703c;

/* renamed from: h1.a */
/* compiled from: CategoriesHelper.kt */
public final class C7361a {

    /* renamed from: a */
    private final Context f18005a;

    /* renamed from: b */
    private final C15701a<String, Integer> f18006b;

    public C7361a(Context context) {
        C13706o.m87929f(context, "context");
        this.f18005a = context;
        this.f18006b = C15703c.m94960a(C13337s.m85692a(context.getString(C17541R$string.categories_auto_and_vehicles), 1), C13337s.m85692a(context.getString(C17541R$string.categories_battery_saving), 2), C13337s.m85692a(context.getString(C17541R$string.categories_call_handling), 3), C13337s.m85692a(context.getString(C17541R$string.categories_communication), 4), C13337s.m85692a(context.getString(C17541R$string.categories_device_config), 5), C13337s.m85692a(context.getString(C17541R$string.categories_entertainment), 6), C13337s.m85692a(context.getString(C17541R$string.categories_games), 7), C13337s.m85692a(context.getString(C17541R$string.categories_health_and_fitness), 8), C13337s.m85692a(context.getString(C17541R$string.categories_house_and_home), 9), C13337s.m85692a(context.getString(C17541R$string.categories_location_based), 10), C13337s.m85692a(context.getString(C17541R$string.categories_maps_and_navigation), 11), C13337s.m85692a(context.getString(C17541R$string.categories_music_and_audio), 12), C13337s.m85692a(context.getString(C17541R$string.categories_news), 13), C13337s.m85692a(context.getString(C17541R$string.categories_notifications), 14), C13337s.m85692a(context.getString(C17541R$string.categories_personalisation), 15), C13337s.m85692a(context.getString(C17541R$string.categories_photography), 16), C13337s.m85692a(context.getString(C17541R$string.categories_productivity), 17), C13337s.m85692a(context.getString(C17541R$string.categories_security), 18), C13337s.m85692a(context.getString(C17541R$string.categories_shopping), 19), C13337s.m85692a(context.getString(C17541R$string.categories_social), 20), C13337s.m85692a(context.getString(C17541R$string.categories_sport), 21), C13337s.m85692a(context.getString(C17541R$string.categories_utilities), 22), C13337s.m85692a(context.getString(C17541R$string.categories_video), 23), C13337s.m85692a(context.getString(C17541R$string.categories_weather), 24), C13337s.m85692a(context.getString(C17541R$string.categories_miscellaneous), 25), C13337s.m85692a(context.getString(C17541R$string.categories_quick_setting_tiles), 26));
    }

    /* renamed from: b */
    private final void m30406b(Constraint constraint, String str, String str2) {
        m30407c(constraint, str, str2);
        if (constraint instanceof LogicConstraint) {
            for (Constraint next : ((LogicConstraint) constraint).mo27826J0()) {
                C13706o.m87928e(next, "lc");
                m30406b(next, str, str2);
            }
        }
    }

    /* renamed from: c */
    private final void m30407c(SelectableItem selectableItem, String str, String str2) {
        if (selectableItem instanceof C7362b) {
            C7362b bVar = (C7362b) selectableItem;
            if (C13706o.m87924a(str, bVar.mo24965w())) {
                bVar.mo24964B(str2);
            }
        }
    }

    /* renamed from: a */
    public final int mo37338a(String str) {
        C13706o.m87929f(str, "categoryName");
        Integer num = this.f18006b.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: d */
    public final String mo37339d(int i) {
        String str = this.f18006b.mo75112z0().get(Integer.valueOf(i));
        if (str == null) {
            str = this.f18005a.getString(C17541R$string.uncategorized);
        }
        C13706o.m87928e(str, "bimap.inverse[id] ?: con…g(R.string.uncategorized)");
        return str;
    }

    /* renamed from: e */
    public final void mo37340e(Context context, String str, String str2) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(str, "oldCategoryName");
        C13706o.m87929f(str2, "newCategoryName");
        C4061t1.m15944A(context).indexOf(str);
        boolean z = false;
        for (Macro next : C4934n.m18998M().mo29673C()) {
            if (C13706o.m87924a(next.getCategory(), str)) {
                next.setCategory(str2);
                z = true;
            }
            Iterator<Action> it = next.getActions().iterator();
            while (it.hasNext()) {
                Action next2 = it.next();
                C13706o.m87928e(next2, "action");
                m30407c(next2, str, str2);
                for (Constraint next3 : next2.mo27826J0()) {
                    C13706o.m87928e(next3, "constraint");
                    m30406b(next3, str, str2);
                }
            }
            for (Constraint next4 : next.getConstraints()) {
                C13706o.m87928e(next4, "constraint");
                m30406b(next4, str, str2);
            }
        }
        C7264a q = MacroDroidApplication.f9883I.mo27303b().mo27293q(Category.CATEGORY_CACHE);
        CategoryList categoryList = (CategoryList) q.mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
        if (categoryList != null) {
            categoryList.renameCategory(str, str2);
        } else {
            categoryList = new CategoryList(new ArrayList());
            categoryList.setCategory(new Category(str2, ContextCompat.getColor(context, C17528R$color.default_macro_tile_color), true, false));
        }
        q.mo37132b(Category.CATEGORIES_KEY, categoryList);
        List<String> A = C4061t1.m15944A(context);
        if (A != null) {
            A.remove(str);
            A.add(str2);
            C5163j2.m20258s3(context, A);
        }
        if (z) {
            C4934n.m18998M().mo29702s0();
        }
    }
}
