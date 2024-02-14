package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.drawer.DrawerOverlayHandleService;
import com.arlosoft.macrodroid.drawer.DrawerOverlayService;
import com.arlosoft.macrodroid.events.CloseDrawerEvent;
import com.arlosoft.macrodroid.events.DrawerHandleUpdateEvent;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.thebluealliance.spectrum.C11766a;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import p128m0.C7695a2;
import p149q1.C8152a;
import p161s1.C10180a;

public class MacroDroidDrawerAction extends Action {
    public static final Parcelable.Creator<MacroDroidDrawerAction> CREATOR = new C2529b();
    private static final int OPTION_CLOSE = 1;
    private static final int OPTION_CONFIGURE_SWIPE_AREA = 4;
    private static final int OPTION_DISABLE = 3;
    private static final int OPTION_ENABLE = 2;
    private static final int OPTION_OPEN = 0;
    private static final int OPTION_TOGGLE = 5;
    private static final int SWIPE_AREA_OPTION_COLOR = 6;
    private static final int SWIPE_AREA_OPTION_HEIGHT = 4;
    private static final int SWIPE_AREA_OPTION_LEFT = 0;
    private static final int SWIPE_AREA_OPTION_OPACITY = 7;
    private static final int SWIPE_AREA_OPTION_RIGHT = 1;
    private static final int SWIPE_AREA_OPTION_VERTICAL_OFFSET = 5;
    private static final int SWIPE_AREA_OPTION_VISIBLE_WIDTH = 3;
    private static final int SWIPE_AREA_OPTION_WIDTH = 2;
    private int m_option;
    private int swipeAreaColour;
    private int swipeAreaHeight;
    private int swipeAreaOpacity;
    private int swipeAreaOption;
    private int swipeAreaVerticalOffset;
    private int swipeAreaVisibleWidth;
    private int swipeAreaWidth;

    /* renamed from: com.arlosoft.macrodroid.action.MacroDroidDrawerAction$a */
    class C2528a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f7360a;

        /* renamed from: b */
        final /* synthetic */ int f7361b;

        C2528a(TextView textView, int i) {
            this.f7360a = textView;
            this.f7361b = i;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            TextView textView = this.f7360a;
            textView.setText(((int) (((double) i) * (100.0d / ((double) this.f7361b)))) + TaskerPlugin.VARIABLE_PREFIX);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.MacroDroidDrawerAction$b */
    class C2529b implements Parcelable.Creator<MacroDroidDrawerAction> {
        C2529b() {
        }

        /* renamed from: a */
        public MacroDroidDrawerAction createFromParcel(Parcel parcel) {
            return new MacroDroidDrawerAction(parcel, (C2528a) null);
        }

        /* renamed from: b */
        public MacroDroidDrawerAction[] newArray(int i) {
            return new MacroDroidDrawerAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.MacroDroidDrawerAction$c */
    interface C2530c {
        /* renamed from: a */
        void mo25342a(int i);
    }

    /* synthetic */ MacroDroidDrawerAction(Parcel parcel, C2528a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m11358A3(int i) {
        this.swipeAreaVerticalOffset = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m11359B3(int i) {
        this.swipeAreaVisibleWidth = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m11360C3(int i) {
        this.swipeAreaWidth = i;
    }

    /* renamed from: D3 */
    private void m11361D3() {
        new C11766a.C11769c(mo27827K0()).mo66987g(C17541R$string.select_color).mo66982b(C17525R$array.notification_colors).mo66983c(true).mo66985e(1).mo66984d(new C3054f9(this)).mo66981a().show(((AppCompatActivity) mo27850j0()).getSupportFragmentManager(), "");
    }

    /* renamed from: E3 */
    private void m11362E3() {
        m11377s3(SelectableItem.m15535j1(C17541R$string.height), this.swipeAreaHeight, 90, new C2940b9(this)).show();
    }

    /* renamed from: F3 */
    private void m11363F3() {
        m11377s3(SelectableItem.m15535j1(C17541R$string.opacity), this.swipeAreaOpacity, 100, new C3025e9(this)).show();
    }

    /* renamed from: G3 */
    private void m11364G3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.action_macrodroid_drawer_configure_swipe_area);
        builder.setSingleChoiceItems((CharSequence[]) m11379u3(), this.swipeAreaOption, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3619y8(this));
        builder.create().show();
    }

    /* renamed from: H3 */
    private void m11365H3() {
        m11377s3(SelectableItem.m15535j1(C17541R$string.vertical_offset), this.swipeAreaVerticalOffset, 90, new C2812a9(this)).show();
    }

    /* renamed from: I3 */
    private void m11366I3() {
        m11377s3(SelectableItem.m15535j1(C17541R$string.visible_width), this.swipeAreaVisibleWidth, 20, new C2996d9(this)).show();
    }

    /* renamed from: J3 */
    private void m11367J3() {
        m11377s3(SelectableItem.m15535j1(C17541R$string.width), this.swipeAreaWidth, 20, new C2968c9(this)).show();
    }

    /* renamed from: r3 */
    private void m11376r3(int i) {
        C8152a M = C5163j2.m20012M(mo27827K0());
        switch (i) {
            case 0:
                M.leftSide = true;
                break;
            case 1:
                M.leftSide = false;
                break;
            case 2:
                M.swipeAreaWidth = this.swipeAreaWidth;
                break;
            case 3:
                M.visibleSwipeAreaWidth = this.swipeAreaVisibleWidth;
                break;
            case 4:
                M.swipeAreaHeight = this.swipeAreaHeight;
                break;
            case 5:
                M.swipeAreaOffset = this.swipeAreaVerticalOffset;
                break;
            case 6:
                M.swipeAreaColor = this.swipeAreaColour;
                break;
            case 7:
                M.swipeAreaOpacity = (int) ((((double) this.swipeAreaOpacity) / 100.0d) * 255.0d);
                break;
        }
        C5163j2.m19974G3(mo27827K0(), M);
        C10180a.m40075a().mo80018i(new DrawerHandleUpdateEvent(M));
    }

    /* renamed from: s3 */
    private AlertDialog.Builder m11377s3(String str, int i, int i2, C2530c cVar) {
        View inflate = LayoutInflater.from(new ContextThemeWrapper(mo27850j0(), mo24705l0())).inflate(C17535R$layout.dialog_seek_bar, (ViewGroup) null);
        SeekBar seekBar = (SeekBar) inflate.findViewById(C17532R$id.seekBar);
        TextView textView = (TextView) inflate.findViewById(C17532R$id.valueLabel);
        seekBar.setProgress(i);
        seekBar.setMax(i2);
        textView.setText(((int) (((double) i) * (100.0d / ((double) i2)))) + TaskerPlugin.VARIABLE_PREFIX);
        seekBar.setOnSeekBarChangeListener(new C2528a(textView, i2));
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) str);
        builder.setView(inflate);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3646z8(this, cVar, seekBar));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        return builder;
    }

    /* renamed from: t3 */
    private String[] m11378t3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.open), SelectableItem.m15535j1(C17541R$string.close), SelectableItem.m15535j1(C17541R$string.enable), SelectableItem.m15535j1(C17541R$string.disable), SelectableItem.m15535j1(C17541R$string.action_macrodroid_drawer_configure_swipe_area), SelectableItem.m15535j1(C17541R$string.toggle)};
    }

    /* renamed from: u3 */
    private String[] m11379u3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.left), SelectableItem.m15535j1(C17541R$string.right), SelectableItem.m15535j1(C17541R$string.width), SelectableItem.m15535j1(C17541R$string.visible_width), SelectableItem.m15535j1(C17541R$string.height), SelectableItem.m15535j1(C17541R$string.vertical_offset), SelectableItem.m15535j1(C17541R$string.color), SelectableItem.m15535j1(C17541R$string.opacity)};
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m11380v3(C2530c cVar, SeekBar seekBar, DialogInterface dialogInterface, int i) {
        cVar.mo25342a(seekBar.getProgress());
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m11381w3(boolean z, int i) {
        if (z) {
            this.swipeAreaColour = i;
            mo24689O1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m11382x3(int i) {
        this.swipeAreaHeight = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m11383y3(int i) {
        this.swipeAreaOpacity = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m11384z3(DialogInterface dialogInterface, int i) {
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        this.swipeAreaOption = checkedItemPosition;
        switch (checkedItemPosition) {
            case 2:
                m11367J3();
                return;
            case 3:
                m11366I3();
                return;
            case 4:
                m11362E3();
                return;
            case 5:
                m11365H3();
                return;
            case 6:
                m11361D3();
                return;
            case 7:
                m11363F3();
                return;
            default:
                mo24689O1();
                return;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m11378t3()[this.m_option];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7695a2.m32087u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + " (" + mo24672O0() + ")";
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        int i = this.m_option;
        if (i == 0 || (i == 5 && !DrawerOverlayService.f11317A)) {
            mo27827K0().startService(new Intent(mo27827K0(), DrawerOverlayService.class));
        } else if (i == 1 || (i == 5 && DrawerOverlayService.f11317A)) {
            C10180a.m40075a().mo80018i(new CloseDrawerEvent());
        } else if (i == 2) {
            if (!C5163j2.m20085W2(mo27827K0())) {
                C5163j2.m19981H3(mo27827K0(), true);
                mo27827K0().stopService(new Intent(mo27827K0(), DrawerOverlayHandleService.class));
                mo27827K0().startService(new Intent(mo27827K0(), DrawerOverlayHandleService.class));
            }
        } else if (i == 3) {
            if (C5163j2.m20085W2(mo27827K0())) {
                C5163j2.m19981H3(mo27827K0(), false);
                mo27827K0().stopService(new Intent(mo27827K0(), DrawerOverlayHandleService.class));
            }
        } else if (i == 4) {
            m11376r3(this.swipeAreaOption);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m11378t3();
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (this.m_option == 4) {
            m11364G3();
        } else {
            super.mo24677v2();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeInt(this.swipeAreaOption);
        parcel.writeInt(this.swipeAreaColour);
        parcel.writeInt(this.swipeAreaHeight);
        parcel.writeInt(this.swipeAreaWidth);
        parcel.writeInt(this.swipeAreaVisibleWidth);
        parcel.writeInt(this.swipeAreaVerticalOffset);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public MacroDroidDrawerAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public MacroDroidDrawerAction() {
        this.swipeAreaOpacity = 50;
        this.swipeAreaHeight = 45;
        this.swipeAreaWidth = 10;
        this.swipeAreaVisibleWidth = 10;
        this.swipeAreaVerticalOffset = 50;
        this.m_option = 0;
    }

    private MacroDroidDrawerAction(Parcel parcel) {
        super(parcel);
        this.swipeAreaOpacity = 50;
        this.swipeAreaHeight = 45;
        this.swipeAreaWidth = 10;
        this.swipeAreaVisibleWidth = 10;
        this.swipeAreaVerticalOffset = 50;
        this.m_option = parcel.readInt();
        this.swipeAreaOption = parcel.readInt();
        this.swipeAreaColour = parcel.readInt();
        this.swipeAreaHeight = parcel.readInt();
        this.swipeAreaWidth = parcel.readInt();
        this.swipeAreaVisibleWidth = parcel.readInt();
        this.swipeAreaVerticalOffset = parcel.readInt();
    }
}
