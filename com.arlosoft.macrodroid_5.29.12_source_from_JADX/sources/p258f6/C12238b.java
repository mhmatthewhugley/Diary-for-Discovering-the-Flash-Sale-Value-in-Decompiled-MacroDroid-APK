package p258f6;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: f6.b */
/* compiled from: CustomRecyclerViewUtils */
public class C12238b {
    /* renamed from: a */
    public static int m82881a(int i) {
        switch (i) {
            case -1:
                return -1;
            case 0:
            case 2:
            case 4:
                return 0;
            case 1:
            case 3:
            case 5:
                return 1;
            default:
                throw new IllegalArgumentException("Unknown layout type (= " + i + ")");
        }
    }

    /* renamed from: b */
    public static RecyclerView.ViewHolder m82882b(@NonNull RecyclerView recyclerView, float f, float f2) {
        View c = m82883c(recyclerView, f, f2);
        if (c != null) {
            return recyclerView.getChildViewHolder(c);
        }
        return null;
    }

    /* renamed from: c */
    private static View m82883c(@NonNull ViewGroup viewGroup, float f, float f2) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (f >= ((float) childAt.getLeft()) && f <= ((float) childAt.getRight()) && f2 >= ((float) childAt.getTop()) && f2 <= ((float) childAt.getBottom())) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static int m82884d(@NonNull RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
        }
        return -1;
    }

    /* renamed from: e */
    public static int m82885e(@NonNull RecyclerView recyclerView, boolean z) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return -1;
        }
        if (z) {
            return m82886f((LinearLayoutManager) layoutManager);
        }
        return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
    }

    /* renamed from: f */
    private static int m82886f(LinearLayoutManager linearLayoutManager) {
        View j = m82890j(linearLayoutManager, 0, linearLayoutManager.getChildCount(), false, true);
        if (j == null) {
            return -1;
        }
        return linearLayoutManager.getPosition(j);
    }

    /* renamed from: g */
    public static int m82887g(@NonNull RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
        }
        return -1;
    }

    /* renamed from: h */
    public static int m82888h(@NonNull RecyclerView recyclerView, boolean z) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return -1;
        }
        if (z) {
            return m82889i((LinearLayoutManager) layoutManager);
        }
        return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
    }

    /* renamed from: i */
    private static int m82889i(LinearLayoutManager linearLayoutManager) {
        View j = m82890j(linearLayoutManager, linearLayoutManager.getChildCount() - 1, -1, false, true);
        if (j == null) {
            return -1;
        }
        return linearLayoutManager.getPosition(j);
    }

    /* renamed from: j */
    private static View m82890j(LinearLayoutManager linearLayoutManager, int i, int i2, boolean z, boolean z2) {
        int i3 = 1;
        boolean z3 = linearLayoutManager.getOrientation() == 1;
        int height = z3 ? linearLayoutManager.getHeight() : linearLayoutManager.getWidth();
        if (i2 <= i) {
            i3 = -1;
        }
        View view = null;
        while (i != i2) {
            View childAt = linearLayoutManager.getChildAt(i);
            int top = z3 ? childAt.getTop() : childAt.getLeft();
            int bottom = z3 ? childAt.getBottom() : childAt.getRight();
            if (top < height && bottom > 0) {
                if (!z) {
                    return childAt;
                }
                if (top >= 0 && bottom <= height) {
                    return childAt;
                }
                if (z2 && view == null) {
                    view = childAt;
                }
            }
            i += i3;
        }
        return view;
    }

    /* renamed from: k */
    public static View m82891k(@NonNull RecyclerView.LayoutManager layoutManager, int i) {
        if (i != -1) {
            return layoutManager.findViewByPosition(i);
        }
        return null;
    }

    /* renamed from: l */
    public static Rect m82892l(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view, @NonNull Rect rect) {
        rect.left = layoutManager.getLeftDecorationWidth(view);
        rect.right = layoutManager.getRightDecorationWidth(view);
        rect.top = layoutManager.getTopDecorationHeight(view);
        rect.bottom = layoutManager.getBottomDecorationHeight(view);
        return rect;
    }

    /* renamed from: m */
    private static View m82893m(@Nullable RecyclerView.ViewHolder viewHolder) {
        if (viewHolder == null) {
            return null;
        }
        View view = viewHolder.itemView;
        if (!ViewCompat.isLaidOut(view)) {
            return null;
        }
        return view;
    }

    /* renamed from: n */
    public static Rect m82894n(@NonNull View view, @NonNull Rect rect) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            rect.left = marginLayoutParams.leftMargin;
            rect.right = marginLayoutParams.rightMargin;
            rect.top = marginLayoutParams.topMargin;
            rect.bottom = marginLayoutParams.bottomMargin;
        } else {
            rect.bottom = 0;
            rect.top = 0;
            rect.right = 0;
            rect.left = 0;
        }
        return rect;
    }

    /* renamed from: o */
    public static int m82895o(@Nullable RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).getOrientation() == 0 ? 2 : 3;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).getOrientation() == 0 ? 0 : 1;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).getOrientation() == 0 ? 4 : 5;
        }
        return -1;
    }

    /* renamed from: p */
    public static int m82896p(@NonNull RecyclerView recyclerView) {
        return m82895o(recyclerView.getLayoutManager());
    }

    /* renamed from: q */
    public static int m82897q(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).getOrientation();
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).getOrientation();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).getOrientation();
        }
        return -1;
    }

    /* renamed from: r */
    public static int m82898r(@NonNull RecyclerView recyclerView) {
        return m82897q(recyclerView.getLayoutManager());
    }

    /* renamed from: s */
    public static int m82899s(@NonNull RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).getSpanCount();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
        }
        return 1;
    }

    /* renamed from: t */
    public static int m82900t(@Nullable RecyclerView.ViewHolder viewHolder) {
        View m = m82893m(viewHolder);
        if (m == null) {
            return -1;
        }
        ViewGroup.LayoutParams layoutParams = m.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            if (((StaggeredGridLayoutManager.LayoutParams) layoutParams).isFullSpan()) {
                return m82899s((RecyclerView) m.getParent());
            }
            return 1;
        } else if (layoutParams instanceof GridLayoutManager.LayoutParams) {
            return ((GridLayoutManager.LayoutParams) layoutParams).getSpanSize();
        } else {
            if (layoutParams instanceof RecyclerView.LayoutParams) {
                return 1;
            }
            return -1;
        }
    }

    /* renamed from: u */
    public static boolean m82901u(int i) {
        return i == 1 || i == 0;
    }
}
