package resources;

import pojo.AddPlacePayload;
import pojo.Location;

import java.util.ArrayList;
import java.util.List;

public class TestBuildData {
    public AddPlacePayload addPlacePayload(String name, String language, String address) {
        AddPlacePayload place = new AddPlacePayload();
        place.setAccuracy(50);
        place.setName(name);
        place.setPhone_number("(+91) 983 893 3937");
        place.setAddress(language);
        place.setWebsite("http://google.com");
        place.setLanguage(address);
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
