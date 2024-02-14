package androidx.room;

import androidx.sqlite.p010db.SupportSQLiteProgram;
import java.util.ArrayList;
import java.util.List;

final class QueryInterceptorProgram implements SupportSQLiteProgram {
    private List<Object> mBindArgsCache = new ArrayList();

    QueryInterceptorProgram() {
    }

    private void saveArgsToCache(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.mBindArgsCache.size()) {
            for (int size = this.mBindArgsCache.size(); size <= i2; size++) {
                this.mBindArgsCache.add((Object) null);
            }
        }
        this.mBindArgsCache.set(i2, obj);
    }

    public void bindBlob(int i, byte[] bArr) {
        saveArgsToCache(i, bArr);
    }

    public void bindDouble(int i, double d) {
        saveArgsToCache(i, Double.valueOf(d));
    }

    public void bindLong(int i, long j) {
        saveArgsToCache(i, Long.valueOf(j));
    }

    public void bindNull(int i) {
        saveArgsToCache(i, (Object) null);
    }

    public void bindString(int i, String str) {
        saveArgsToCache(i, str);
    }

    public void clearBindings() {
        this.mBindArgsCache.clear();
    }

    public void close() {
    }

    /* access modifiers changed from: package-private */
    public List<Object> getBindArgs() {
        return this.mBindArgsCache;
    }
}
