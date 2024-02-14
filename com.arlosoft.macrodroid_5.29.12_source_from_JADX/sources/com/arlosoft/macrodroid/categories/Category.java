package com.arlosoft.macrodroid.categories;

import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: Category.kt */
public final class Category {
    public static final String CATEGORIES_KEY = "CategoryList";
    public static final String CATEGORY_CACHE = "Categories";
    public static final C3899a Companion = new C3899a((C13695i) null);
    private final int color;
    private final boolean isExpanded;
    private final boolean isLocked;
    private final String name;

    /* renamed from: com.arlosoft.macrodroid.categories.Category$a */
    /* compiled from: Category.kt */
    public static final class C3899a {
        private C3899a() {
        }

        public /* synthetic */ C3899a(C13695i iVar) {
            this();
        }
    }

    public Category(String str, int i, boolean z, boolean z2) {
        C13706o.m87929f(str, "name");
        this.name = str;
        this.color = i;
        this.isExpanded = z;
        this.isLocked = z2;
    }

    public static /* synthetic */ Category copy$default(Category category, String str, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = category.name;
        }
        if ((i2 & 2) != 0) {
            i = category.color;
        }
        if ((i2 & 4) != 0) {
            z = category.isExpanded;
        }
        if ((i2 & 8) != 0) {
            z2 = category.isLocked;
        }
        return category.copy(str, i, z, z2);
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.color;
    }

    public final boolean component3() {
        return this.isExpanded;
    }

    public final boolean component4() {
        return this.isLocked;
    }

    public final Category copy(String str, int i, boolean z, boolean z2) {
        C13706o.m87929f(str, "name");
        return new Category(str, i, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Category)) {
            return false;
        }
        Category category = (Category) obj;
        return C13706o.m87924a(this.name, category.name) && this.color == category.color && this.isExpanded == category.isExpanded && this.isLocked == category.isLocked;
    }

    public final int getColor() {
        return this.color;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.color) * 31;
        boolean z = this.isExpanded;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isLocked;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public String toString() {
        return "Category(name=" + this.name + ", color=" + this.color + ", isExpanded=" + this.isExpanded + ", isLocked=" + this.isLocked + ')';
    }
}
