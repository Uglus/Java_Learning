package Lecture_25.src.Generic;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CachedDataSource<T> implements MutableDataSource<T> {

    private T myData;

    @Nullable
    @Override
    public T getData() {
        return myData;
    }

    @Override
    public void saveData(@NotNull T data) {
        myData = data;
    }
}
