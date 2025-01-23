package Lecture_25.src.Generic;

import org.jetbrains.annotations.Nullable;

public interface DataSource<T> {

    @Nullable
    T getData();
}
