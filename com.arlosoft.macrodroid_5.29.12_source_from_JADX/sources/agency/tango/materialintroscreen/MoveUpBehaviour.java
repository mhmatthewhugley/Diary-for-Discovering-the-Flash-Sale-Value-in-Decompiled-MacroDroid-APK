package agency.tango.materialintroscreen;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;

public class MoveUpBehaviour extends CoordinatorLayout.Behavior<LinearLayout> {
    public MoveUpBehaviour(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, View view) {
        return view instanceof Snackbar.SnackbarLayout;
    }

    /* renamed from: b */
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, View view) {
        linearLayout.setTranslationY(Math.min(0.0f, view.getTranslationY() - ((float) view.getHeight())));
        return true;
    }
}
