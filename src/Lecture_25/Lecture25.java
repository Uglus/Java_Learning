package Lecture_25;

import Base.Lecture;
import Lecture_25.src.Generic.Repository;
import Lecture_25.src.GeoData.GeoData;
import Lecture_25.src.GeoData.GeoDataCloudDataSource;
import Lecture_25.src.MyData.MyData;
import Lecture_25.src.MyData.MyDataCloudDataSource;
import Lecture_25.src.Generic.CachedDataSource;
import Lecture_25.src.Generic.DataSource;

public class Lecture25 extends Lecture {

    public static void main(String[] args) {

        DataSource<MyData> myDataRepository = new Repository<MyData>(
                new MyDataCloudDataSource(),
                new CachedDataSource<MyData>()
        );

        /*DataSource<GeoData> geoDataRepository = new GeoRepository(
                new GeoDataCloudDataSource(),
                new CachedDataSource<GeoData>()
        );*/

        DataSource<GeoData> geoDataRepository = new Repository<GeoData>(
                new GeoDataCloudDataSource(),
                new CachedDataSource<GeoData>()
        );

        MyData myData = myDataRepository.getData();
        GeoData geoData = geoDataRepository.getData();
        print(myData);
        print(geoData);

    }

}
