package p172u1;

import android.util.SparseArray;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;

/* renamed from: u1.e */
/* compiled from: SparseArrayTypeAdapterFactory */
public class C10287e implements TypeAdapterFactory {

    /* renamed from: a */
    public static final C10287e f23443a = new C10287e();

    /* renamed from: u1.e$a */
    /* compiled from: SparseArrayTypeAdapterFactory */
    private static class C10288a<E> extends TypeAdapter<SparseArray<E>> {

        /* renamed from: a */
        private final TypeAdapter<E> f23444a;

        public C10288a(TypeAdapter<E> typeAdapter) {
            this.f23444a = typeAdapter;
        }

        /* renamed from: f */
        public SparseArray<E> mo40900c(JsonReader jsonReader) throws IOException {
            jsonReader.beginObject();
            SparseArray<E> sparseArray = new SparseArray<>();
            while (jsonReader.hasNext()) {
                sparseArray.append(Integer.parseInt(jsonReader.nextName()), this.f23444a.mo40900c(jsonReader));
            }
            jsonReader.endObject();
            return sparseArray;
        }

        /* renamed from: g */
        public void mo40901e(JsonWriter jsonWriter, SparseArray<E> sparseArray) throws IOException {
            jsonWriter.beginObject();
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                jsonWriter.name(Integer.toString(sparseArray.keyAt(i)));
                this.f23444a.mo40901e(jsonWriter, sparseArray.valueAt(i));
            }
            jsonWriter.endObject();
        }
    }

    private C10287e() {
    }

    /* renamed from: a */
    public <T> TypeAdapter<T> mo40897a(Gson gson, TypeToken<T> typeToken) {
        if (typeToken.mo64306c() != SparseArray.class) {
            return null;
        }
        return new C10288a(gson.mo63978l(TypeToken.m78731b(((ParameterizedType) typeToken.mo64307e()).getActualTypeArguments()[0]))).mo64054b();
    }
}
