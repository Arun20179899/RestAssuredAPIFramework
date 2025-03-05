package resources;

import pojo.AddPlacePayload;
import pojo.Location;

import java.util.ArrayList;
import java.util.List;

public class TestBuildData {
    public AddPlacePayload addPlacePayload() {
        AddPlacePayload place = new AddPlacePayload();
        place.setAccuracy(50);
        place.setName("Frontline house");
        place.setPhone_number("(+91) 983 893 3937");
        place.setAddress("29, side layout, cohen 09");
        place.setWebsite("http://google.com");
        place.setLanguage("French-IN");
        Location map = new Location();
        map.setLat(-38.383494);
        map.setLng(33.427362);
        place.setLocation(map);
        List<String> myList = new ArrayList<String>();
        myList.add("shoe park");
        myList.add("shop");
        place.setTypes(myList);
        return place;
    }
}
