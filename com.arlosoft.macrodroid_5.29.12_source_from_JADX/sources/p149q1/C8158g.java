package p149q1;

import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: q1.g */
/* compiled from: DrawerItemOpenShortcut */
public class C8158g extends C8153b {
    public static final String ITEM_TYPE = "LaunchShortcut";
    private String encodedIntent;
    private String packageName;
    private String shortcutName;
    private String text;

    public C8158g() {
        super(ITEM_TYPE);
    }

    public String getIntent() {
        return this.encodedIntent;
    }

    public int getLayoutResId() {
        return C17535R$layout.drawer_item_open_shortcut;
    }

    public String getName() {
        return this.shortcutName;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getText() {
        String str = this.text;
        if (str != null) {
            return str;
        }
        return this.shortcutName;
    }

    public void setIntent(String str) {
        this.encodedIntent = str;
    }

    public void setShortcutName(String str) {
        this.shortcutName = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public C8158g(String str, String str2) {
        super(ITEM_TYPE);
        this.packageName = str;
        this.shortcutName = str2;
    }
}
