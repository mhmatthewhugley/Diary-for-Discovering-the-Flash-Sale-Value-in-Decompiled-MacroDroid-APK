package androidx.sqlite.p010db;

/* renamed from: androidx.sqlite.db.SupportSQLiteQuery */
public interface SupportSQLiteQuery {
    void bindTo(SupportSQLiteProgram supportSQLiteProgram);

    int getArgCount();

    String getSql();
}
