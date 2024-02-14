package p034i;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.LinkedList;

/* renamed from: i.a */
/* compiled from: ParallaxFragment */
public class C1989a extends Fragment implements C1990b {
    @Nullable

    /* renamed from: a */
    private C1990b f6070a;

    /* renamed from: U */
    public C1990b mo23999U(View view) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        while (!linkedList.isEmpty()) {
            View view2 = (View) linkedList.remove();
            if (view2 instanceof C1990b) {
                return (C1990b) view2;
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    linkedList.add(viewGroup.getChildAt(childCount));
                }
            }
        }
        return null;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.f6070a = mo23999U(view);
    }

    public void setOffset(@FloatRange(from = -1.0d, mo592to = 1.0d) float f) {
        C1990b bVar = this.f6070a;
        if (bVar != null) {
            bVar.setOffset(f);
        }
    }
}
