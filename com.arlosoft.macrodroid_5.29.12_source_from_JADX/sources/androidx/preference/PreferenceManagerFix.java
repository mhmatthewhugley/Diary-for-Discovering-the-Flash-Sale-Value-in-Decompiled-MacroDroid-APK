package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.collection.ArraySet;
import java.lang.reflect.Field;
import java.util.Set;

public class PreferenceManagerFix extends PreferenceManager {
    private static Field editorField;
    private static Set<String> packages = new ArraySet();
    private boolean inflateInProgress;
    private boolean noCommit;

    static {
        Field[] declaredFields = PreferenceManager.class.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Field field = declaredFields[i];
            if (field.getType() == SharedPreferences.Editor.class) {
                editorField = field;
                field.setAccessible(true);
                break;
            }
            i++;
        }
        registerPreferencePackage("com.takisoft.preferencex");
    }

    public PreferenceManagerFix(Context context) {
        super(context);
    }

    public static int getDefaultSharedPreferencesMode() {
        return 0;
    }

    public static String getDefaultSharedPreferencesName(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public static void registerPreferencePackage(@NonNull Class<Preference> cls) {
        registerPreferencePackage(cls.getPackage().getName());
    }

    public static void setDefaultValues(Context context, int i, boolean z) {
        setDefaultValues(context, getDefaultSharedPreferencesName(context), getDefaultSharedPreferencesMode(), i, z);
    }

    private void setNoCommitFix(boolean z) throws IllegalAccessException {
        SharedPreferences.Editor editor = (SharedPreferences.Editor) editorField.get(this);
        if (!z && editor != null) {
            editor.apply();
        }
        this.noCommit = z;
    }

    /* access modifiers changed from: package-private */
    public SharedPreferences.Editor getEditor() {
        Field field;
        if (!this.inflateInProgress || (field = editorField) == null) {
            return super.getEditor();
        }
        if (!this.noCommit) {
            return getSharedPreferences().edit();
        }
        SharedPreferences.Editor editor = null;
        try {
            SharedPreferences.Editor editor2 = (SharedPreferences.Editor) field.get(this);
            if (editor2 != null) {
                return editor2;
            }
            try {
                editor = getSharedPreferences().edit();
                editorField.set(this, editor);
            } catch (IllegalAccessException unused) {
                editor = editor2;
            }
            return editor;
        } catch (IllegalAccessException unused2) {
        }
    }

    /* JADX INFO: finally extract failed */
    public PreferenceScreen inflateFromResource(Context context, int i, PreferenceScreen preferenceScreen) {
        Throwable th;
        PreferenceScreen preferenceScreen2;
        try {
            this.inflateInProgress = true;
            setNoCommitFix(true);
            PreferenceInflater preferenceInflater = new PreferenceInflater(context, this);
            String[] defaultPackages = preferenceInflater.getDefaultPackages();
            String[] strArr = new String[(defaultPackages.length + packages.size())];
            packages.toArray(strArr);
            System.arraycopy(defaultPackages, 0, strArr, packages.size(), defaultPackages.length);
            preferenceInflater.setDefaultPackages(strArr);
            preferenceScreen2 = (PreferenceScreen) preferenceInflater.inflate(i, (PreferenceGroup) preferenceScreen);
            try {
                preferenceScreen2.onAttachedToHierarchy(this);
                setNoCommitFix(false);
                this.inflateInProgress = false;
                return preferenceScreen2;
            } catch (Throwable th2) {
                th = th2;
                try {
                    th.printStackTrace();
                    this.inflateInProgress = false;
                    return super.inflateFromResource(context, i, preferenceScreen2);
                } catch (Throwable th3) {
                    this.inflateInProgress = false;
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Throwable th5 = th4;
            preferenceScreen2 = preferenceScreen;
            th = th5;
            th.printStackTrace();
            this.inflateInProgress = false;
            return super.inflateFromResource(context, i, preferenceScreen2);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean shouldCommit() {
        if (!this.inflateInProgress) {
            return super.shouldCommit();
        }
        return this.noCommit;
    }

    public static void registerPreferencePackage(@NonNull String str) {
        Set<String> set = packages;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".";
        if (str.endsWith(str2)) {
            str2 = "";
        }
        sb.append(str2);
        set.add(sb.toString());
    }

    public static void setDefaultValues(Context context, String str, int i, int i2, boolean z) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PreferenceManager.KEY_HAS_SET_DEFAULT_VALUES, 0);
        if (z || !sharedPreferences.getBoolean(PreferenceManager.KEY_HAS_SET_DEFAULT_VALUES, false)) {
            PreferenceManagerFix preferenceManagerFix = new PreferenceManagerFix(context);
            preferenceManagerFix.setSharedPreferencesName(str);
            preferenceManagerFix.setSharedPreferencesMode(i);
            preferenceManagerFix.inflateFromResource(context, i2, (PreferenceScreen) null);
            sharedPreferences.edit().putBoolean(PreferenceManager.KEY_HAS_SET_DEFAULT_VALUES, true).apply();
        }
    }
}
