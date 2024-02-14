package com.arlosoft.macrodroid.categories;

import com.arlosoft.macrodroid.common.DontObfuscate;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: CategoryList.kt */
public final class CategoryList {
    private final List<Category> categories;

    public CategoryList(List<Category> list) {
        this.categories = list;
    }

    public static /* synthetic */ CategoryList copy$default(CategoryList categoryList, List<Category> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = categoryList.categories;
        }
        return categoryList.copy(list);
    }

    public final List<Category> component1() {
        return this.categories;
    }

    public final CategoryList copy(List<Category> list) {
        return new CategoryList(list);
    }

    public final void deleteCategory(String str) {
        List<Category> list;
        C13706o.m87929f(str, "name");
        Category categoryByName = getCategoryByName(str);
        if (categoryByName != null && (list = this.categories) != null) {
            list.remove(categoryByName);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CategoryList) && C13706o.m87924a(this.categories, ((CategoryList) obj).categories);
    }

    public final List<Category> getCategories() {
        return this.categories;
    }

    public final Category getCategoryByName(String str) {
        C13706o.m87929f(str, "name");
        List<Category> list = this.categories;
        if (list == null) {
            return null;
        }
        for (Category next : list) {
            if (C13706o.m87924a(next.getName(), str)) {
                return next;
            }
        }
        return null;
    }

    public int hashCode() {
        List<Category> list = this.categories;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void renameCategory(String str, String str2) {
        C13706o.m87929f(str, "oldName");
        C13706o.m87929f(str2, "newName");
        Category categoryByName = getCategoryByName(str);
        if (categoryByName != null) {
            Category category = new Category(str2, categoryByName.getColor(), categoryByName.isExpanded(), categoryByName.isLocked());
            List<Category> list = this.categories;
            if (list != null) {
                list.remove(categoryByName);
            }
            List<Category> list2 = this.categories;
            if (list2 != null) {
                list2.add(category);
            }
        }
    }

    public final void setCategory(Category category) {
        C13706o.m87929f(category, "category");
        List<Category> list = this.categories;
        if (list != null) {
            Iterator<Category> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Category next = it.next();
                if (C13706o.m87924a(category.getName(), next.getName())) {
                    this.categories.remove(next);
                    break;
                }
            }
        }
        List<Category> list2 = this.categories;
        if (list2 != null) {
            list2.add(category);
        }
    }

    public String toString() {
        return "CategoryList(categories=" + this.categories + ')';
    }
}
