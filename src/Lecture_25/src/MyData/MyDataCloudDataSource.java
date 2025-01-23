package Lecture_25.src.MyData;

import Lecture_25.src.Generic.DataSource;
import org.jetbrains.annotations.Nullable;

public class MyDataCloudDataSource implements DataSource<MyData> {

    @Nullable
    @Override
    public MyData getData() {
        return new MyData(1, "desc1");
    }

}
