package Lecture_25.src.Generic;

import org.jetbrains.annotations.Nullable;

public class Repository<T> implements DataSource<T> {
    private final DataSource<T> cloudDataSource;
    private final MutableDataSource<T> cachedDataSource;

    public Repository(DataSource<T> cloudDataSource, MutableDataSource<T> cachedDataSource) {
        this.cloudDataSource = cloudDataSource;
        this.cachedDataSource = cachedDataSource;
    }

    @Override
    public @Nullable T getData() {
        T result = cachedDataSource.getData();
        if (result == null){
            print("no data in cache, going to cloud");
            result = cloudDataSource.getData();
            cachedDataSource.saveData(result);
        } else{
            print("getting from cache");
        }
        return result;
    }

    private void print(String text){
        System.out.println(text);
    }
}
