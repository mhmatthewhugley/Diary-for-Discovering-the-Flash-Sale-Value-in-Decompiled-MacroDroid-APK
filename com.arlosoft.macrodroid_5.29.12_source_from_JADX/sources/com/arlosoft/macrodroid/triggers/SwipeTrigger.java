package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.swipe.SwipeTriggerService;
import p119k3.C7579z1;

public class SwipeTrigger extends Trigger {
    public static final Parcelable.Creator<SwipeTrigger> CREATOR = new C5754a();
    private static int s_triggerCounter;
    private transient ImageView m_arrow_left;
    private transient ImageView m_arrow_left_diagonal;
    private transient ImageView m_arrow_left_down;
    private transient ImageView m_arrow_right;
    private transient ImageView m_arrow_right_diagonal;
    private transient ImageView m_arrow_right_down;
    private boolean m_cleared;
    private transient RelativeLayout m_overlay;
    private transient RelativeLayout m_overlayFrame;
    private int m_swipeMotion;
    private int m_swipeStartArea;
    private transient View m_top_left_area;
    private transient View m_top_right_area;

    /* renamed from: com.arlosoft.macrodroid.triggers.SwipeTrigger$a */
    class C5754a implements Parcelable.Creator<SwipeTrigger> {
        C5754a() {
        }

        /* renamed from: a */
        public SwipeTrigger createFromParcel(Parcel parcel) {
            return new SwipeTrigger(parcel, (C5754a) null);
        }

        /* renamed from: b */
        public SwipeTrigger[] newArray(int i) {
            return new SwipeTrigger[i];
        }
    }

    /* synthetic */ SwipeTrigger(Parcel parcel, C5754a aVar) {
        this(parcel);
    }

    /* renamed from: k3 */
    private void m23299k3() {
        ImageView imageView = this.m_arrow_right;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.m_arrow_left;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = this.m_arrow_right_diagonal;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = this.m_arrow_left_diagonal;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
        ImageView imageView5 = this.m_arrow_right_down;
        if (imageView5 != null) {
            imageView5.setVisibility(8);
        }
        ImageView imageView6 = this.m_arrow_left_down;
        if (imageView6 != null) {
            imageView6.setVisibility(8);
        }
    }

    /* renamed from: l3 */
    private void m23300l3() {
        this.m_cleared = true;
        this.m_overlayFrame = null;
        this.m_overlay = null;
        this.m_top_left_area = null;
        this.m_top_right_area = null;
        this.m_arrow_right = null;
        this.m_arrow_left = null;
        this.m_arrow_right_diagonal = null;
        this.m_arrow_left_diagonal = null;
        this.m_arrow_right_down = null;
        this.m_arrow_left_down = null;
    }

    /* renamed from: n3 */
    private String[] m23301n3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_swipe_across), SelectableItem.m15535j1(C17541R$string.trigger_swipe_diagonal), SelectableItem.m15535j1(C17541R$string.trigger_swipe_down)};
    }

    /* renamed from: o3 */
    private String[] m23302o3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_swipe_top_left), SelectableItem.m15535j1(C17541R$string.trigger_swipe_top_right)};
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m23303q3(DialogInterface dialogInterface, int i) {
        this.m_swipeMotion = i;
        m23307u3();
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m23304r3(DialogInterface dialogInterface, int i) {
        m23299k3();
        this.m_overlayFrame.removeView(this.m_overlay);
        m23300l3();
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public /* synthetic */ void m23305s3(DialogInterface dialogInterface, int i) {
        m23299k3();
        this.m_overlayFrame.removeView(this.m_overlay);
        m23300l3();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void m23306t3(DialogInterface dialogInterface) {
        if (!this.m_cleared) {
            m23299k3();
            this.m_overlayFrame.removeView(this.m_overlay);
            this.m_top_left_area.setVisibility(8);
            this.m_top_right_area.setVisibility(8);
            m23300l3();
        }
    }

    /* renamed from: u3 */
    private void m23307u3() {
        m23299k3();
        if (this.m_swipeStartArea == 0) {
            int i = this.m_swipeMotion;
            if (i == 0) {
                this.m_arrow_right.setVisibility(0);
            } else if (i == 1) {
                this.m_arrow_right_diagonal.setVisibility(0);
            } else if (i == 2) {
                this.m_arrow_right_down.setVisibility(0);
            }
        } else {
            int i2 = this.m_swipeMotion;
            if (i2 == 0) {
                this.m_arrow_left.setVisibility(0);
            } else if (i2 == 1) {
                this.m_arrow_left_diagonal.setVisibility(0);
            } else if (i2 == 2) {
                this.m_arrow_left_down.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_swipeStartArea;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m23302o3()[this.m_swipeStartArea] + " - " + m23301n3()[this.m_swipeMotion];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            mo27827K0().stopService(new Intent(mo27827K0(), SwipeTriggerService.class));
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7579z1.m31560u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        mo27827K0().startService(new Intent(mo27827K0(), SwipeTriggerService.class));
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m23302o3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        this.m_overlayFrame.addView(this.m_overlay);
        int i = 0;
        this.m_top_left_area.setVisibility(this.m_swipeStartArea == 0 ? 0 : 8);
        View view = this.m_top_right_area;
        if (this.m_swipeStartArea != 1) {
            i = 8;
        }
        view.setVisibility(i);
        return SelectableItem.m15535j1(C17541R$string.trigger_swipe_start_area);
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return true;
    }

    /* renamed from: m3 */
    public int mo31529m3() {
        return this.m_swipeMotion;
    }

    /* renamed from: p3 */
    public int mo31530p3() {
        return this.m_swipeStartArea;
    }

    /* renamed from: u1 */
    public void mo24714u1() {
        if (mo27836X()) {
            this.m_overlayFrame = (RelativeLayout) mo27850j0().findViewById(C17532R$id.triggerOverlay);
            RelativeLayout relativeLayout = (RelativeLayout) View.inflate(mo27827K0(), C17535R$layout.swipe_description_overlay, (ViewGroup) null);
            this.m_overlay = relativeLayout;
            this.m_top_left_area = relativeLayout.findViewById(C17532R$id.swipe_description_overlay_touch_area_top_left);
            this.m_top_right_area = this.m_overlay.findViewById(C17532R$id.swipe_description_overlay_touch_area_top_right);
            ImageView imageView = (ImageView) this.m_overlay.findViewById(C17532R$id.swipe_description_overlay_right_arrow);
            this.m_arrow_right = imageView;
            imageView.setVisibility(8);
            ImageView imageView2 = (ImageView) this.m_overlay.findViewById(C17532R$id.swipe_description_overlay_left_arrow);
            this.m_arrow_left = imageView2;
            imageView2.setVisibility(8);
            ImageView imageView3 = (ImageView) this.m_overlay.findViewById(C17532R$id.swipe_description_overlay_right_diagonal_arrow);
            this.m_arrow_right_diagonal = imageView3;
            imageView3.setVisibility(8);
            ImageView imageView4 = (ImageView) this.m_overlay.findViewById(C17532R$id.swipe_description_overlay_left_diagonal_arrow);
            this.m_arrow_left_diagonal = imageView4;
            imageView4.setVisibility(8);
            ImageView imageView5 = (ImageView) this.m_overlay.findViewById(C17532R$id.swipe_description_overlay_right_down_arrow);
            this.m_arrow_right_down = imageView5;
            imageView5.setVisibility(8);
            ImageView imageView6 = (ImageView) this.m_overlay.findViewById(C17532R$id.swipe_description_overlay_left_down_arrow);
            this.m_arrow_left_down = imageView6;
            imageView6.setVisibility(8);
            super.mo24714u1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        m23307u3();
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.trigger_swipe);
        builder.setSingleChoiceItems((CharSequence[]) m23301n3(), this.m_swipeMotion, (DialogInterface.OnClickListener) new C6213z7(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C6189x7(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6201y7(this));
        AlertDialog create = builder.create();
        WindowManager.LayoutParams attributes = create.getWindow().getAttributes();
        attributes.alpha = 1.0f;
        create.getWindow().setAttributes(attributes);
        create.show();
        this.m_cleared = false;
        create.setOnCancelListener(new C6177w7(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: w1 */
    public void mo24706w1() {
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2 = this.m_overlayFrame;
        if (!(relativeLayout2 == null || (relativeLayout = this.m_overlay) == null)) {
            relativeLayout2.removeView(relativeLayout);
        }
        m23300l3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_swipeStartArea);
        parcel.writeInt(this.m_swipeMotion);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_swipeStartArea = i;
        int i2 = 0;
        this.m_top_left_area.setVisibility(i == 0 ? 0 : 8);
        View view = this.m_top_right_area;
        if (this.m_swipeStartArea != 1) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public SwipeTrigger(Activity activity, Macro macro) {
        this();
        this.m_macro = macro;
        mo27877y2(activity);
    }

    public SwipeTrigger() {
        this.m_swipeStartArea = 0;
        this.m_swipeMotion = 0;
        this.m_cleared = true;
    }

    private SwipeTrigger(Parcel parcel) {
        super(parcel);
        this.m_swipeStartArea = 0;
        this.m_swipeMotion = 0;
        this.m_cleared = true;
        this.m_swipeStartArea = parcel.readInt();
        this.m_swipeMotion = parcel.readInt();
    }
}
