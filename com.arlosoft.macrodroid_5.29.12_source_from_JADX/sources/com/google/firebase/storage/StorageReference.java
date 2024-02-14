package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.StreamDownloadTask;
import com.google.firebase.storage.internal.Slashes;
import com.google.firebase.storage.internal.StorageReferenceUri;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public class StorageReference implements Comparable<StorageReference> {

    /* renamed from: a */
    private final Uri f55367a;

    /* renamed from: c */
    private final FirebaseStorage f55368c;

    /* renamed from: com.google.firebase.storage.StorageReference$1 */
    class C113621 implements OnFailureListener {

        /* renamed from: a */
        final /* synthetic */ TaskCompletionSource f55369a;

        static {
            Class<StorageReference> cls = StorageReference.class;
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            this.f55369a.mo56138b(StorageException.m77381e(exc, 0));
        }
    }

    /* renamed from: com.google.firebase.storage.StorageReference$2 */
    class C113632 implements OnSuccessListener<StreamDownloadTask.TaskSnapshot> {

        /* renamed from: a */
        final /* synthetic */ TaskCompletionSource f55370a;

        /* renamed from: a */
        public void mo22751b(StreamDownloadTask.TaskSnapshot taskSnapshot) {
            if (!this.f55370a.mo56137a().mo23718s()) {
                Log.e("StorageReference", "getBytes 'succeeded', but failed to set a Result.");
                this.f55370a.mo56138b(StorageException.m77379c(Status.f3140z));
            }
        }
    }

    /* renamed from: com.google.firebase.storage.StorageReference$3 */
    class C113643 implements StreamDownloadTask.StreamProcessor {

        /* renamed from: a */
        final /* synthetic */ long f55371a;

        /* renamed from: b */
        final /* synthetic */ TaskCompletionSource f55372b;

        /* renamed from: a */
        public void mo63644a(StreamDownloadTask.TaskSnapshot taskSnapshot, InputStream inputStream) throws IOException {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[16384];
                int i = 0;
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read != -1) {
                        i += read;
                        if (((long) i) <= this.f55371a) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            Log.e("StorageReference", "the maximum allowed buffer size was exceeded.");
                            throw new IndexOutOfBoundsException("the maximum allowed buffer size was exceeded.");
                        }
                    } else {
                        byteArrayOutputStream.flush();
                        this.f55372b.mo56139c(byteArrayOutputStream.toByteArray());
                        return;
                    }
                }
            } finally {
                inputStream.close();
            }
        }
    }

    static {
        Class<StorageReference> cls = StorageReference.class;
    }

    StorageReference(@NonNull Uri uri, @NonNull FirebaseStorage firebaseStorage) {
        boolean z = true;
        Preconditions.m4479b(uri != null, "storageUri cannot be null");
        Preconditions.m4479b(firebaseStorage == null ? false : z, "FirebaseApp cannot be null");
        this.f55367a = uri;
        this.f55368c = firebaseStorage;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public Task<ListResult> m77421o(@Nullable Integer num, @Nullable String str) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        StorageTaskScheduler.m77520b().mo63676d(new ListTask(this, num, str, taskCompletionSource));
        return taskCompletionSource.mo56137a();
    }

    @NonNull
    /* renamed from: d */
    public StorageReference mo63628d(@NonNull String str) {
        Preconditions.m4479b(!TextUtils.isEmpty(str), "childName cannot be null or empty");
        return new StorageReference(this.f55367a.buildUpon().appendEncodedPath(Slashes.m77605b(Slashes.m77604a(str))).build(), this.f55368c);
    }

    /* renamed from: e */
    public int compareTo(@NonNull StorageReference storageReference) {
        return this.f55367a.compareTo(storageReference.f55367a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StorageReference)) {
            return false;
        }
        return ((StorageReference) obj).toString().equals(toString());
    }

    @NonNull
    /* renamed from: f */
    public Task<Void> mo63631f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        StorageTaskScheduler.m77520b().mo63676d(new DeleteStorageTask(this, taskCompletionSource));
        return taskCompletionSource.mo56137a();
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: g */
    public FirebaseApp mo63632g() {
        return mo63638l().mo63590a();
    }

    @NonNull
    public String getName() {
        String path = this.f55367a.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @NonNull
    /* renamed from: i */
    public FileDownloadTask mo63635i(@NonNull Uri uri) {
        FileDownloadTask fileDownloadTask = new FileDownloadTask(this, uri);
        fileDownloadTask.mo63667p0();
        return fileDownloadTask;
    }

    @NonNull
    /* renamed from: j */
    public FileDownloadTask mo63636j(@NonNull File file) {
        return mo63635i(Uri.fromFile(file));
    }

    @Nullable
    /* renamed from: k */
    public StorageReference mo63637k() {
        String path = this.f55367a.getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        String str = "/";
        if (path.equals(str)) {
            return null;
        }
        int lastIndexOf = path.lastIndexOf(47);
        if (lastIndexOf != -1) {
            str = path.substring(0, lastIndexOf);
        }
        return new StorageReference(this.f55367a.buildUpon().path(str).build(), this.f55368c);
    }

    @NonNull
    /* renamed from: l */
    public FirebaseStorage mo63638l() {
        return this.f55368c;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: m */
    public StorageReferenceUri mo63639m() {
        return new StorageReferenceUri(this.f55367a, this.f55368c.mo63593e());
    }

    @NonNull
    /* renamed from: n */
    public Task<ListResult> mo63640n() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        Executor a = StorageTaskScheduler.m77520b().mo63674a();
        final Executor executor = a;
        final TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
        m77421o((Integer) null, (String) null).mo23713n(a, new Continuation<ListResult, Task<Void>>() {
            /* renamed from: b */
            public Task<Void> mo21119a(@NonNull Task<ListResult> task) {
                if (task.mo23719t()) {
                    ListResult p = task.mo23715p();
                    arrayList.addAll(p.mo63606d());
                    arrayList2.addAll(p.mo63604b());
                    if (p.mo63605c() != null) {
                        StorageReference.this.m77421o((Integer) null, p.mo63605c()).mo23713n(executor, this);
                    } else {
                        taskCompletionSource2.mo56139c(new ListResult(arrayList, arrayList2, (String) null));
                    }
                } else {
                    taskCompletionSource2.mo56138b(task.mo23714o());
                }
                return Tasks.m66667f(null);
            }
        });
        return taskCompletionSource.mo56137a();
    }

    @NonNull
    /* renamed from: q */
    public UploadTask mo63641q(@NonNull Uri uri) {
        Preconditions.m4479b(uri != null, "uri cannot be null");
        UploadTask uploadTask = new UploadTask(this, (StorageMetadata) null, uri, (Uri) null);
        uploadTask.mo63667p0();
        return uploadTask;
    }

    public String toString() {
        return "gs://" + this.f55367a.getAuthority() + this.f55367a.getEncodedPath();
    }
}
