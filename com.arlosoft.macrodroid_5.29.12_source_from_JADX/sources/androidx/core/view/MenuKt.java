package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.sequences.C15118h;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\n\u001a\r\u0010\n\u001a\u00020\u0006*\u00020\u0000H\b\u001a\r\u0010\u000b\u001a\u00020\u0006*\u00020\u0000H\b\u001a$\u0010\u000e\u001a\u00020\b*\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\fH\bø\u0001\u0000\u001a*\u0010\u0010\u001a\u00020\b*\u00020\u00002\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u000fH\bø\u0001\u0000\u001a\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011*\u00020\u0000H\u0002\u001a\u0015\u0010\u0013\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\b\"\u0016\u0010\u0016\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001b"}, mo71668d2 = {"Landroid/view/Menu;", "", "index", "Landroid/view/MenuItem;", "get", "item", "", "contains", "Lja/u;", "minusAssign", "isEmpty", "isNotEmpty", "Lkotlin/Function1;", "action", "forEach", "Lkotlin/Function2;", "forEachIndexed", "", "iterator", "removeItemAt", "getSize", "(Landroid/view/Menu;)I", "size", "Lkotlin/sequences/h;", "getChildren", "(Landroid/view/Menu;)Lkotlin/sequences/h;", "children", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: Menu.kt */
public final class MenuKt {
    public static final boolean contains(Menu menu, MenuItem menuItem) {
        C13706o.m87929f(menu, "<this>");
        C13706o.m87929f(menuItem, "item");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (C13706o.m87924a(menu.getItem(i), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(Menu menu, C16265l<? super MenuItem, C13339u> lVar) {
        C13706o.m87929f(menu, "<this>");
        C13706o.m87929f(lVar, "action");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            C13706o.m87928e(item, "getItem(index)");
            lVar.invoke(item);
        }
    }

    public static final void forEachIndexed(Menu menu, C16269p<? super Integer, ? super MenuItem, C13339u> pVar) {
        C13706o.m87929f(menu, "<this>");
        C13706o.m87929f(pVar, "action");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            Integer valueOf = Integer.valueOf(i);
            MenuItem item = menu.getItem(i);
            C13706o.m87928e(item, "getItem(index)");
            pVar.invoke(valueOf, item);
        }
    }

    public static final MenuItem get(Menu menu, int i) {
        C13706o.m87929f(menu, "<this>");
        MenuItem item = menu.getItem(i);
        C13706o.m87928e(item, "getItem(index)");
        return item;
    }

    public static final C15118h<MenuItem> getChildren(Menu menu) {
        C13706o.m87929f(menu, "<this>");
        return new MenuKt$children$1(menu);
    }

    public static final int getSize(Menu menu) {
        C13706o.m87929f(menu, "<this>");
        return menu.size();
    }

    public static final boolean isEmpty(Menu menu) {
        C13706o.m87929f(menu, "<this>");
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(Menu menu) {
        C13706o.m87929f(menu, "<this>");
        return menu.size() != 0;
    }

    public static final Iterator<MenuItem> iterator(Menu menu) {
        C13706o.m87929f(menu, "<this>");
        return new MenuKt$iterator$1(menu);
    }

    public static final void minusAssign(Menu menu, MenuItem menuItem) {
        C13706o.m87929f(menu, "<this>");
        C13706o.m87929f(menuItem, "item");
        menu.removeItem(menuItem.getItemId());
    }

    public static final void removeItemAt(Menu menu, int i) {
        C13339u uVar;
        C13706o.m87929f(menu, "<this>");
        MenuItem item = menu.getItem(i);
        if (item != null) {
            menu.removeItem(item.getItemId());
            uVar = C13339u.f61331a;
        } else {
            uVar = null;
        }
        if (uVar == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
