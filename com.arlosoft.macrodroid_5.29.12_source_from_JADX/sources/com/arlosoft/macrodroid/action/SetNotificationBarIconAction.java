package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.MacroDroidService;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.NotificationButton;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectActivity;
import com.arlosoft.macrodroid.utils.C6395j0;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;
import p128m0.C7862v3;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;
import p370qa.C16270q;

/* compiled from: SetNotificationBarIconAction.kt */
public final class SetNotificationBarIconAction extends Action {
    public static final Parcelable.Creator<SetNotificationBarIconAction> CREATOR = new C2646a();

    /* renamed from: d */
    public static final C2647b f7512d = new C2647b((C13695i) null);
    /* access modifiers changed from: private */
    public int buttonNumber;
    private transient WeakReference<ImageView> iconImageRef;
    private int imageId;
    private String imageName;
    private String imagePackageName;
    private String imageUri;

    /* renamed from: com.arlosoft.macrodroid.action.SetNotificationBarIconAction$a */
    /* compiled from: SetNotificationBarIconAction.kt */
    public static final class C2646a implements Parcelable.Creator<SetNotificationBarIconAction> {
        C2646a() {
        }

        /* renamed from: a */
        public SetNotificationBarIconAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new SetNotificationBarIconAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public SetNotificationBarIconAction[] newArray(int i) {
            return new SetNotificationBarIconAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetNotificationBarIconAction$b */
    /* compiled from: SetNotificationBarIconAction.kt */
    public static final class C2647b {
        private C2647b() {
        }

        public /* synthetic */ C2647b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetNotificationBarIconAction$c */
    /* compiled from: SetNotificationBarIconAction.kt */
    public static final class C2648c implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ SetNotificationBarIconAction f7513a;

        /* renamed from: c */
        final /* synthetic */ ImageView f7514c;

        /* renamed from: d */
        final /* synthetic */ List<NotificationButton> f7515d;

        C2648c(SetNotificationBarIconAction setNotificationBarIconAction, ImageView imageView, List<NotificationButton> list) {
            this.f7513a = setNotificationBarIconAction;
            this.f7514c = imageView;
            this.f7515d = list;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C13706o.m87929f(adapterView, "parent");
            SetNotificationBarIconAction setNotificationBarIconAction = this.f7513a;
            ImageView imageView = this.f7514c;
            List<NotificationButton> list = this.f7515d;
            C13706o.m87928e(list, "notificationButtonList");
            setNotificationBarIconAction.m12544l3(imageView, i, list);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
            C13706o.m87929f(adapterView, "parent");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetNotificationBarIconAction$d */
    /* compiled from: SetNotificationBarIconAction.kt */
    static final class C2649d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Activity $activity;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2649d(Activity activity, C13635d<? super C2649d> dVar) {
            super(3, dVar);
            this.$activity = activity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2649d(this.$activity, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$activity.startActivityForResult(new Intent(this.$activity, IconSelectActivity.class), 1);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetNotificationBarIconAction$e */
    /* compiled from: SetNotificationBarIconAction.kt */
    static final class C2650e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Spinner $buttonNumberSpinner;
        final /* synthetic */ AppCompatDialog $dialog;
        int label;
        final /* synthetic */ SetNotificationBarIconAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2650e(SetNotificationBarIconAction setNotificationBarIconAction, Spinner spinner, AppCompatDialog appCompatDialog, C13635d<? super C2650e> dVar) {
            super(3, dVar);
            this.this$0 = setNotificationBarIconAction;
            this.$buttonNumberSpinner = spinner;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2650e(this.this$0, this.$buttonNumberSpinner, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.buttonNumber = this.$buttonNumberSpinner.getSelectedItemPosition() + 1;
                this.this$0.mo24689O1();
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetNotificationBarIconAction$f */
    /* compiled from: SetNotificationBarIconAction.kt */
    static final class C2651f extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2651f(AppCompatDialog appCompatDialog, C13635d<? super C2651f> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2651f(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetNotificationBarIconAction$g */
    /* compiled from: SetNotificationBarIconAction.kt */
    static final class C2652g extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ SetNotificationBarIconAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2652g(SetNotificationBarIconAction setNotificationBarIconAction, C13635d<? super C2652g> dVar) {
            super(2, dVar);
            this.this$0 = setNotificationBarIconAction;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C2652g(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C2652g) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                MacroDroidService.C2296a aVar = MacroDroidService.f7040a;
                Context K0 = this.this$0.mo27827K0();
                C13706o.m87928e(K0, "context");
                aVar.mo24644i(K0, true);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public SetNotificationBarIconAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ SetNotificationBarIconAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public final void m12544l3(ImageView imageView, int i, List<? extends NotificationButton> list) {
        if (i < list.size()) {
            NotificationButton notificationButton = (NotificationButton) list.get(i);
            if (notificationButton.mo27796e() == null && notificationButton.mo27794d() == null) {
                imageView.setImageTintList(ColorStateList.valueOf(C5163j2.m20238q(mo27827K0())));
            } else {
                imageView.setImageTintList((ColorStateList) null);
            }
            C6395j0.m24649a(mo27827K0(), imageView, notificationButton.mo27793c(), notificationButton.mo27794d(), notificationButton.mo27792b(), notificationButton.mo27796e());
            return;
        }
        imageView.setImageResource(C17530R$drawable.no_image_placeholder);
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return SelectableItem.m15535j1(C17541R$string.button) + " (" + this.buttonNumber + ')';
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        C4001c1 u = C7862v3.m32885u();
        C13706o.m87928e(u, "getInstance()");
        return u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        List<NotificationButton> b1 = C5163j2.m20120b1(mo27827K0());
        int size = b1.size();
        int i = this.buttonNumber;
        if (size >= i) {
            NotificationButton notificationButton = b1.get(i - 1);
            String str = this.imageUri;
            notificationButton.mo27800i(str != null ? Uri.parse(str) : null);
            notificationButton.mo27797f(this.imageId);
            notificationButton.mo27798g(this.imageName);
            notificationButton.mo27799h(this.imagePackageName);
            C5163j2.m20045Q4(mo27827K0(), b1);
            C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93730b(), (C15486m0) null, new C2652g(this, (C13635d<? super C2652g>) null), 2, (Object) null);
            return;
        }
        Long Y0 = mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        C4878b.m18869h("Cannot set button image as notification button " + this.buttonNumber + " is not configured", Y0.longValue());
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        C13706o.m87929f(activity, "activity");
        mo27877y2(activity);
        if (i == 1 && i2 != 0 && intent != null) {
            this.imageName = intent.getStringExtra("drawableName");
            this.imagePackageName = intent.getStringExtra("drawablePackageName");
            this.imageName = intent.getStringExtra("drawableName");
            this.imageId = intent.getIntExtra("drawableId", 0);
            Uri data = intent.getData();
            this.imageUri = data != null ? data.toString() : null;
            WeakReference<ImageView> weakReference = this.iconImageRef;
            ImageView imageView = weakReference != null ? (ImageView) weakReference.get() : null;
            if (imageView != null) {
                if (this.imageUri != null || (!C13706o.m87924a(this.imagePackageName, "com.arlosoft.macrodroid") && this.imagePackageName != null)) {
                    imageView.setImageTintList((ColorStateList) null);
                } else {
                    imageView.setImageTintList(ColorStateList.valueOf(C5163j2.m20238q(mo27827K0())));
                }
                C6395j0.m24650b(mo27827K0(), imageView, this.imageName, this.imagePackageName, this.imageId, this.imageUri);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_notification_bar_button_icon);
        appCompatDialog.setTitle((int) C17541R$string.action_set_notification_button_icon);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        ImageView imageView = (ImageView) appCompatDialog.findViewById(C17532R$id.existingImage);
        ImageView imageView2 = (ImageView) appCompatDialog.findViewById(C17532R$id.newImage);
        ImageView imageView3 = (ImageView) appCompatDialog.findViewById(C17532R$id.editImage);
        ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.newImageFrame);
        View findViewById = appCompatDialog.findViewById(C17532R$id.buttonNumberSpinner);
        C13706o.m87926c(findViewById);
        Spinner spinner = (Spinner) findViewById;
        List<NotificationButton> b1 = C5163j2.m20120b1(mo27827K0());
        this.iconImageRef = new WeakReference<>(imageView2);
        C13706o.m87926c(imageView);
        C13706o.m87928e(b1, "notificationButtonList");
        m12544l3(imageView, this.buttonNumber - 1, b1);
        boolean p = C5163j2.m20230p(mo27827K0());
        int i = ViewCompat.MEASURED_STATE_MASK;
        imageView.setBackgroundColor(p ? ViewCompat.MEASURED_STATE_MASK : 0);
        if (imageView2 != null) {
            if (!p) {
                i = 0;
            }
            imageView2.setBackgroundColor(i);
        }
        if (!p && imageView3 != null) {
            imageView3.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(mo27827K0(), C17528R$color.default_text_color)));
        }
        if (this.imageUri == null && this.imagePackageName == null) {
            int q = C5163j2.m20238q(mo27827K0());
            if (imageView2 != null) {
                imageView2.setImageTintList(ColorStateList.valueOf(q));
            }
        } else if (imageView2 != null) {
            imageView2.setImageTintList((ColorStateList) null);
        }
        Button button3 = button2;
        C6395j0.m24650b(mo27827K0(), imageView2, this.imageName, this.imagePackageName, this.imageId, this.imageUri);
        spinner.setSelection(this.buttonNumber - 1);
        spinner.setOnItemSelectedListener(new C2648c(this, imageView, b1));
        if (viewGroup != null) {
            C4666m.m18147o(viewGroup, (C13640g) null, new C2649d(j0, (C13635d<? super C2649d>) null), 1, (Object) null);
        }
        if (button != null) {
            C4666m.m18147o(button, (C13640g) null, new C2650e(this, spinner, appCompatDialog, (C13635d<? super C2650e>) null), 1, (Object) null);
        }
        if (button3 != null) {
            C4666m.m18147o(button3, (C13640g) null, new C2651f(appCompatDialog, (C13635d<? super C2651f>) null), 1, (Object) null);
        }
        C4656c.m18114c(appCompatDialog, 0);
        appCompatDialog.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.buttonNumber);
        parcel.writeInt(this.imageId);
        parcel.writeString(this.imageName);
        parcel.writeString(this.imagePackageName);
        parcel.writeString(this.imageUri);
    }

    public SetNotificationBarIconAction() {
        this.buttonNumber = 1;
    }

    private SetNotificationBarIconAction(Parcel parcel) {
        super(parcel);
        this.buttonNumber = 1;
        this.buttonNumber = parcel.readInt();
        this.imageId = parcel.readInt();
        this.imageName = parcel.readString();
        this.imagePackageName = parcel.readString();
        this.imageUri = parcel.readString();
    }
}
