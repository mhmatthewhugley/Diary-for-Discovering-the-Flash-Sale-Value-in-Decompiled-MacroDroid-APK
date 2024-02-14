package com.google.common.p206io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.graph.SuccessorsFunction;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.Files */
public final class Files {

    /* renamed from: a */
    private static final SuccessorsFunction<File> f52998a = new SuccessorsFunction<File>() {
        /* renamed from: o */
        public Iterable<File> mo36813a(File file) {
            File[] listFiles;
            if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
                return ImmutableList.m27301D();
            }
            return Collections.unmodifiableList(Arrays.asList(listFiles));
        }
    };

    /* renamed from: com.google.common.io.Files$FileByteSink */
    private static final class FileByteSink extends ByteSink {

        /* renamed from: a */
        private final File f53000a;

        /* renamed from: b */
        private final ImmutableSet<FileWriteMode> f53001b;

        public String toString() {
            String valueOf = String.valueOf(this.f53000a);
            String valueOf2 = String.valueOf(this.f53001b);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20 + valueOf2.length());
            sb.append("Files.asByteSink(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.io.Files$FileByteSource */
    private static final class FileByteSource extends ByteSource {

        /* renamed from: a */
        private final File f53002a;

        /* renamed from: b */
        public FileInputStream mo60979a() throws IOException {
            return new FileInputStream(this.f53002a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f53002a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Files.asByteSource(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.io.Files$FilePredicate */
    private enum FilePredicate implements Predicate<File> {
        IS_DIRECTORY {
            /* renamed from: d */
            public boolean apply(File file) {
                return file.isDirectory();
            }

            public String toString() {
                return "Files.isDirectory()";
            }
        },
        IS_FILE {
            /* renamed from: d */
            public boolean apply(File file) {
                return file.isFile();
            }

            public String toString() {
                return "Files.isFile()";
            }
        }
    }

    private Files() {
    }
}
