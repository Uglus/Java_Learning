package Lecture_25.src.GeoData;

import Lecture_25.src.Generic.DataSource;
import Lecture_25.src.Generic.MutableDataSource;
import Lecture_25.src.Generic.Repository;

@Deprecated
public class GeoRepository extends Repository<GeoData> {

    public GeoRepository(DataSource<GeoData> cloudDataSource, MutableDataSource<GeoData> cachedDataSource) {
        super(cloudDataSource, cachedDataSource);
    }
}
