package p149q1;

import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: q1.d */
/* compiled from: DrawerItemAppShortcut */
public class C8155d extends C8153b {
    public static final String ITEM_TYPE = "AppShortcut";
    private String appName;
    private String packageName;
    private String text;

    public C8155d() {
        super(ITEM_TYPE);
    }

    public int getLayoutResId() {
        return C17535R$layout.drawer_item_app_shortcut;
    }

    public String getName() {
        return this.appName;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getText() {
        String str = this.text;
        if (str != null) {
            return str;
        }
        return this.appName;
    }

    public void setText(String str) {
        this.text = str;
    }

    public C8155d(String str, String str2) {
        super(ITEM_TYPE);
        this.packageName = str;
        this.appName = str2;
    }
}
