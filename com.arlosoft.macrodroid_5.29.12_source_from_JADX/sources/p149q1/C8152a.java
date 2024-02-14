package p149q1;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q1.a */
/* compiled from: DrawerConfiguration */
public class C8152a {
    public int backgroundColor;
    public List<C8153b> drawerItems = new ArrayList();
    public int headerColor;
    public boolean leftSide;
    public int swipeAreaColor;
    public int swipeAreaHeight;
    public int swipeAreaOffset;
    public int swipeAreaOpacity;
    public int swipeAreaWidth;
    public int visibleSwipeAreaWidth;

    public static C8152a getDefaultConfiguration(Context context) {
        C8152a aVar = new C8152a();
        aVar.swipeAreaWidth = 14;
        aVar.swipeAreaHeight = 20;
        aVar.swipeAreaOffset = 40;
        aVar.swipeAreaColor = -7829368;
        aVar.swipeAreaOpacity = 80;
        aVar.backgroundColor = -1;
        aVar.headerColor = ContextCompat.getColor(context, C17528R$color.primary);
        return aVar;
    }

    public C8153b getItemByGuid(long j) {
        for (C8153b next : this.drawerItems) {
            if (next.getGuid() == j) {
                return next;
            }
        }
        return null;
    }

    public int getVisibleWidth() {
        int i = this.visibleSwipeAreaWidth;
        return i != 0 ? i : this.swipeAreaWidth;
    }
}
