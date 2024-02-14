package p113j3;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment;
import java.util.List;

/* renamed from: j3.j */
/* compiled from: IconSelectPagerAdapter */
public class C7449j extends FragmentStatePagerAdapter {

    /* renamed from: a */
    private final boolean f18245a;

    /* renamed from: b */
    private final List<String> f18246b;

    /* renamed from: c */
    private final List<String> f18247c;

    /* renamed from: d */
    private final String[] f18248d;

    /* renamed from: e */
    private final boolean f18249e;

    public C7449j(Context context, FragmentManager fragmentManager, boolean z, List<String> list, List<String> list2, boolean z2) {
        super(fragmentManager);
        this.f18248d = new String[]{context.getString(C17541R$string.select_icons_applications), context.getString(C17541R$string.select_icons_user), context.getString(C17541R$string.select_icons_macrodroid), context.getString(C17541R$string.select_icons_notification), context.getString(C17541R$string.select_icons_material_design)};
        this.f18245a = z;
        this.f18246b = list;
        this.f18247c = list2;
        this.f18249e = z2;
    }

    public int getCount() {
        if (this.f18245a) {
            return this.f18246b.size() + 5;
        }
        return 3;
    }

    public Fragment getItem(int i) {
        IconSelectFragment iconSelectFragment = new IconSelectFragment();
        Bundle bundle = new Bundle();
        if (this.f18245a) {
            if (i < this.f18246b.size()) {
                bundle.putString("IconPackName", this.f18246b.get(i));
            } else if (i == this.f18246b.size() + 1) {
                bundle.putInt("IconTypes", 1);
            } else {
                bundle.putInt("IconTypes", i - this.f18246b.size());
            }
        } else if (i == 0) {
            bundle.putInt("IconTypes", 2);
        } else if (i == 1) {
            bundle.putInt("IconTypes", 3);
        } else {
            bundle.putInt("IconTypes", 4);
        }
        bundle.putBoolean("ReturnResult", this.f18249e);
        iconSelectFragment.setArguments(bundle);
        return iconSelectFragment;
    }

    public CharSequence getPageTitle(int i) {
        if (!this.f18245a) {
            return this.f18248d[i + 2];
        }
        if (i < this.f18246b.size()) {
            return this.f18247c.get(i);
        }
        return this.f18248d[i - this.f18246b.size()];
    }
}
