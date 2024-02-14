package com.arlosoft.macrodroid.templatestore.model;

import android.content.Context;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.DontObfuscate;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: TemplateCategory.kt */
public final class TemplateCategory {
    public static final C5224a Companion = new C5224a((C13695i) null);

    /* renamed from: id */
    private final int f13054id;
    private final String name;

    /* renamed from: com.arlosoft.macrodroid.templatestore.model.TemplateCategory$a */
    /* compiled from: TemplateCategory.kt */
    public static final class C5224a {

        /* renamed from: com.arlosoft.macrodroid.templatestore.model.TemplateCategory$a$a */
        /* compiled from: Comparisons.kt */
        public static final class C5225a<T> implements Comparator {
            public final int compare(T t, T t2) {
                return C15612b.m94865a(((TemplateCategory) t).getName(), ((TemplateCategory) t2).getName());
            }
        }

        private C5224a() {
        }

        public /* synthetic */ C5224a(C13695i iVar) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ List m20398b(C5224a aVar, Context context, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            return aVar.mo30314a(context, z);
        }

        /* renamed from: a */
        public final List<TemplateCategory> mo30314a(Context context, boolean z) {
            C13706o.m87929f(context, "context");
            String string = context.getString(C17541R$string.all_categories);
            C13706o.m87928e(string, "context.getString(R.string.all_categories)");
            String string2 = context.getString(C17541R$string.categories_auto_and_vehicles);
            C13706o.m87928e(string2, "context.getString(R.stri…gories_auto_and_vehicles)");
            String string3 = context.getString(C17541R$string.categories_battery_saving);
            C13706o.m87928e(string3, "context.getString(R.stri…ategories_battery_saving)");
            String string4 = context.getString(C17541R$string.categories_call_handling);
            C13706o.m87928e(string4, "context.getString(R.stri…categories_call_handling)");
            String string5 = context.getString(C17541R$string.categories_communication);
            C13706o.m87928e(string5, "context.getString(R.stri…categories_communication)");
            String string6 = context.getString(C17541R$string.categories_device_config);
            C13706o.m87928e(string6, "context.getString(R.stri…categories_device_config)");
            String string7 = context.getString(C17541R$string.categories_entertainment);
            C13706o.m87928e(string7, "context.getString(R.stri…categories_entertainment)");
            String string8 = context.getString(C17541R$string.categories_games);
            C13706o.m87928e(string8, "context.getString(R.string.categories_games)");
            String string9 = context.getString(C17541R$string.categories_health_and_fitness);
            C13706o.m87928e(string9, "context.getString(R.stri…ories_health_and_fitness)");
            String string10 = context.getString(C17541R$string.categories_house_and_home);
            C13706o.m87928e(string10, "context.getString(R.stri…ategories_house_and_home)");
            String string11 = context.getString(C17541R$string.categories_location_based);
            C13706o.m87928e(string11, "context.getString(R.stri…ategories_location_based)");
            String string12 = context.getString(C17541R$string.categories_maps_and_navigation);
            C13706o.m87928e(string12, "context.getString(R.stri…ries_maps_and_navigation)");
            String string13 = context.getString(C17541R$string.categories_music_and_audio);
            C13706o.m87928e(string13, "context.getString(R.stri…tegories_music_and_audio)");
            String string14 = context.getString(C17541R$string.categories_news);
            C13706o.m87928e(string14, "context.getString(R.string.categories_news)");
            String string15 = context.getString(C17541R$string.categories_notifications);
            C13706o.m87928e(string15, "context.getString(R.stri…categories_notifications)");
            String string16 = context.getString(C17541R$string.categories_personalisation);
            C13706o.m87928e(string16, "context.getString(R.stri…tegories_personalisation)");
            String string17 = context.getString(C17541R$string.categories_photography);
            C13706o.m87928e(string17, "context.getString(R.string.categories_photography)");
            String string18 = context.getString(C17541R$string.categories_productivity);
            C13706o.m87928e(string18, "context.getString(R.stri….categories_productivity)");
            String string19 = context.getString(C17541R$string.categories_security);
            C13706o.m87928e(string19, "context.getString(R.string.categories_security)");
            String string20 = context.getString(C17541R$string.categories_shopping);
            C13706o.m87928e(string20, "context.getString(R.string.categories_shopping)");
            String string21 = context.getString(C17541R$string.categories_social);
            C13706o.m87928e(string21, "context.getString(R.string.categories_social)");
            String string22 = context.getString(C17541R$string.categories_sport);
            C13706o.m87928e(string22, "context.getString(R.string.categories_sport)");
            String string23 = context.getString(C17541R$string.categories_utilities);
            C13706o.m87928e(string23, "context.getString(R.string.categories_utilities)");
            String string24 = context.getString(C17541R$string.categories_video);
            C13706o.m87928e(string24, "context.getString(R.string.categories_video)");
            String string25 = context.getString(C17541R$string.categories_weather);
            C13706o.m87928e(string25, "context.getString(R.string.categories_weather)");
            String string26 = context.getString(C17541R$string.categories_miscellaneous);
            C13706o.m87928e(string26, "context.getString(R.stri…categories_miscellaneous)");
            String string27 = context.getString(C17541R$string.categories_quick_setting_tiles);
            C13706o.m87928e(string27, "context.getString(R.stri…ries_quick_setting_tiles)");
            List m = C13614t.m87751m(new TemplateCategory(string, 0), new TemplateCategory(string2, 1), new TemplateCategory(string3, 2), new TemplateCategory(string4, 3), new TemplateCategory(string5, 4), new TemplateCategory(string6, 5), new TemplateCategory(string7, 6), new TemplateCategory(string8, 7), new TemplateCategory(string9, 8), new TemplateCategory(string10, 9), new TemplateCategory(string11, 10), new TemplateCategory(string12, 11), new TemplateCategory(string13, 12), new TemplateCategory(string14, 13), new TemplateCategory(string15, 14), new TemplateCategory(string16, 15), new TemplateCategory(string17, 16), new TemplateCategory(string18, 17), new TemplateCategory(string19, 18), new TemplateCategory(string20, 19), new TemplateCategory(string21, 20), new TemplateCategory(string22, 21), new TemplateCategory(string23, 22), new TemplateCategory(string24, 23), new TemplateCategory(string25, 24), new TemplateCategory(string26, 25), new TemplateCategory(string27, 26));
            if (!z) {
                m = m.subList(1, m.size());
            }
            return C13566b0.m87450y0(m, new C5225a());
        }
    }

    public TemplateCategory(String str, int i) {
        C13706o.m87929f(str, "name");
        this.name = str;
        this.f13054id = i;
    }

    public static /* synthetic */ TemplateCategory copy$default(TemplateCategory templateCategory, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = templateCategory.name;
        }
        if ((i2 & 2) != 0) {
            i = templateCategory.f13054id;
        }
        return templateCategory.copy(str, i);
    }

    public static final List<TemplateCategory> getAllCategories(Context context, boolean z) {
        return Companion.mo30314a(context, z);
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.f13054id;
    }

    public final TemplateCategory copy(String str, int i) {
        C13706o.m87929f(str, "name");
        return new TemplateCategory(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateCategory)) {
            return false;
        }
        TemplateCategory templateCategory = (TemplateCategory) obj;
        return C13706o.m87924a(this.name, templateCategory.name) && this.f13054id == templateCategory.f13054id;
    }

    public final int getId() {
        return this.f13054id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.f13054id;
    }

    public String toString() {
        return "TemplateCategory(name=" + this.name + ", id=" + this.f13054id + ')';
    }
}
