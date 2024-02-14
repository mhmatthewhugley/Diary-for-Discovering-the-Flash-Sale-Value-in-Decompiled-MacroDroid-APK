package p344o6;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p344o6.C15804b;

/* renamed from: o6.a */
/* compiled from: DeviceDatabase */
public class C15803a extends SQLiteOpenHelper {

    /* renamed from: a */
    private final File f65210a;

    /* renamed from: c */
    private final Context f65211c;

    public C15803a(Context context) {
        super(context, "android-devices.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f65211c = context.getApplicationContext();
        File databasePath = context.getDatabasePath("android-devices.db");
        this.f65210a = databasePath;
        if (!databasePath.exists()) {
            m95358c();
        }
    }

    /* renamed from: b */
    private void m95357b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    private void m95358c() throws SQLException {
        try {
            getReadableDatabase();
            close();
            m95359f();
        } catch (IOException e) {
            throw new SQLException("Error creating android-devices.db database", e);
        }
    }

    /* renamed from: f */
    private void m95359f() throws IOException {
        InputStream open = this.f65211c.getAssets().open("android-devices.db");
        FileOutputStream fileOutputStream = new FileOutputStream(this.f65210a);
        byte[] bArr = new byte[2048];
        while (true) {
            int read = open.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                fileOutputStream.flush();
                m95357b(fileOutputStream);
                m95357b(open);
                return;
            }
        }
    }

    /* renamed from: e */
    public C15804b.C15806b mo75571e(@Nullable String str, @Nullable String str2) {
        String[] strArr;
        String str3;
        SQLiteDatabase readableDatabase = getReadableDatabase();
        String[] strArr2 = {"name", "codename", "model"};
        C15804b.C15806b bVar = null;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            str3 = "codename LIKE ? OR model LIKE ?";
            strArr = new String[]{str, str2};
        } else if (!TextUtils.isEmpty(str)) {
            str3 = "codename LIKE ?";
            strArr = new String[]{str};
        } else {
            if (TextUtils.isEmpty(str2)) {
                strArr = new String[]{str2};
                str3 = "model LIKE ?";
            }
            return bVar;
        }
        Cursor query = readableDatabase.query("devices", strArr2, str3, strArr, (String) null, (String) null, (String) null);
        if (query.moveToFirst()) {
            bVar = new C15804b.C15806b(query.getString(query.getColumnIndexOrThrow("name")), query.getString(query.getColumnIndexOrThrow("codename")), query.getString(query.getColumnIndexOrThrow("model")));
        }
        m95357b(query);
        m95357b(readableDatabase);
        return bVar;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 <= i) {
            return;
        }
        if (this.f65211c.deleteDatabase("android-devices.db") || this.f65210a.delete() || !this.f65210a.exists()) {
            m95358c();
        }
    }
}
