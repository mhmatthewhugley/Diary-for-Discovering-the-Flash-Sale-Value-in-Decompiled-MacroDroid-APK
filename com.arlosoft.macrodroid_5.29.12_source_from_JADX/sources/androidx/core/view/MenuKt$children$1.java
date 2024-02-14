package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.C15118h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002¨\u0006\u0005"}, mo71668d2 = {"androidx/core/view/MenuKt$children$1", "Lkotlin/sequences/h;", "Landroid/view/MenuItem;", "", "iterator", "core-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: Menu.kt */
public final class MenuKt$children$1 implements C15118h<MenuItem> {
    final /* synthetic */ Menu $this_children;

    MenuKt$children$1(Menu menu) {
        this.$this_children = menu;
    }

    public Iterator<MenuItem> iterator() {
        return MenuKt.iterator(this.$this_children);
    }
}
