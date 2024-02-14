package p149q1;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import java.util.UUID;

/* renamed from: q1.b */
/* compiled from: DrawerItem */
public abstract class C8153b {
    public static final String PACKAGE_FILE_URI = "FROM_FILE";
    @ColorInt
    private int color;
    private long guid;
    private boolean hideIcon;
    private String imagePackageName;
    private String imageResourceName;
    private String type;

    public C8153b() {
        this.guid = UUID.randomUUID().getLeastSignificantBits();
        this.color = Color.rgb(117, 117, 117);
    }

    public int getColor() {
        return this.color;
    }

    public long getGuid() {
        return this.guid;
    }

    public String getImagePackageName() {
        return this.imagePackageName;
    }

    public String getImageResourceName() {
        return this.imageResourceName;
    }

    public abstract int getLayoutResId();

    public abstract String getName();

    public boolean hideIcon() {
        return this.hideIcon;
    }

    public boolean isEditable() {
        return true;
    }

    public boolean isValid() {
        return true;
    }

    public void setColor(@ColorInt int i) {
        this.color = i;
    }

    public void setHideIcon(boolean z) {
        this.hideIcon = z;
    }

    public void setIcon(String str, String str2) {
        this.imagePackageName = str;
        this.imageResourceName = str2;
    }

    public void setImageFile(String str) {
        this.imagePackageName = PACKAGE_FILE_URI;
        this.imageResourceName = str;
    }

    public C8153b(String str) {
        this();
        this.type = str;
    }
}
