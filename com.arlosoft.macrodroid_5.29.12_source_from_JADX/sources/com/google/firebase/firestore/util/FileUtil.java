package com.google.firebase.firestore.util;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileUtil {

    private static class DefaultFileDeleter {
        private DefaultFileDeleter() {
        }

        /* renamed from: a */
        public static void m76505a(File file) throws IOException {
            try {
                Files.deleteIfExists(file.toPath());
            } catch (IOException e) {
                throw new IOException("Failed to delete file " + file + ": " + e);
            }
        }
    }

    private static class LegacyFileDeleter {
        private LegacyFileDeleter() {
        }

        /* renamed from: a */
        public static void m76506a(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException("Failed to delete file " + file);
            }
        }
    }

    /* renamed from: a */
    public static void m76504a(File file) throws IOException {
        if (Build.VERSION.SDK_INT >= 26) {
            DefaultFileDeleter.m76505a(file);
        } else {
            LegacyFileDeleter.m76506a(file);
        }
    }
}
