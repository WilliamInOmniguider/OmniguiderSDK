package com.omni.omninavi.omninavi.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by wiliiamwang on 31/10/2017.
 */

public class OGPOI implements Serializable {

    public static final int TYPE_STAIR = 1;
    public static final int TYPE_ENTRANCE = 2;
    public static final int TYPE_ELEVATOR = 3;
    //    public static final int TYPE_ROOM = 4;
    public static final int TYPE_OFFICE = 5;
    public static final int TYPE_TOILETS = 6;
    public static final int TYPE_DISABLED_TOILETS = 7;
    public static final int TYPE_FIRE_EXTINGUISHER = 8;
    public static final int TYPE_AED = 9;
    public static final int TYPE_RAMP = 10;
    public static final int TYPE_SECURITY_GUARD = 11;
    //    public static final int TYPE_KITCHEN = 12;
    public static final int TYPE_OTHER = 13;
    public static final int TYPE_EXHIBIT = 14;
    public static final int TYPE_FIRE_HYDRANT = 15;
    public static final int TYPE_INFORMATION = 16;
    public static final int TYPE_DINING = 17;
    public static final int TYPE_EMERGENCY_EXIT = 18;
    public static final int TYPE_ESCAPE_SLING = 19;
    public static final int TYPE_MEETING_ROOM = 20;
    public static final int TYPE_INTRODUCE = 21;
    public static final int TYPE_RESTROOM = 22;
    public static final int TYPE_POST_OFFICE = 23;
    public static final int TYPE_ATM = 24;

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("desc")
    private String desc;
    @SerializedName("type")
    private String type;
    @SerializedName("lat")
    private double latitude;
    @SerializedName("lng")
    private double longitude;
    @SerializedName("is_entrance")
    private String isEntrance;
    @SerializedName("is_door")
    private String isDoor;
    @SerializedName("is_exhibit")
    private String isExhibit;
//    @SerializedName("exhibit")
//    private Exhibit[] exhibits;
    @SerializedName("type_zh")
    private String typeZh;

    /**
     * image & url key not exist in json
     */
    @SerializedName("image")
    private String urlToPoisImage;
    @SerializedName("url")
    private String url;
    private int poiType = -1;
    private boolean isOriginalPOI = false;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPOIType() {
        if (type != null) {
            switch (type) {
                case "Stair":
                    poiType = TYPE_STAIR;
                    break;

//                case "Entrance":
//                    poiType = TYPE_ENTRANCE;
//                    break;
//
                case "Elevator":
                    poiType = TYPE_ELEVATOR;
                    break;

                case "Restroom":
                    poiType = TYPE_RESTROOM;
                    break;

                case "Restroom or the Disabled":
                    poiType = TYPE_DISABLED_TOILETS;
                    break;

                case "AED":
                    poiType = TYPE_AED;
                    break;

                case "Entrance\\/Exit":
                    poiType = TYPE_ENTRANCE;
                    break;

                case "Post Office":
                    poiType = TYPE_POST_OFFICE;
                    break;

                case "ATM":
                    poiType = TYPE_ATM;
                    break;

                case "Convenience Store":
                    break;

                case "Division":
                    break;

                case "Hydrant":
                    poiType = TYPE_FIRE_HYDRANT;
                    break;

                case "Restaurant":
                    break;

                case "Bank":
                    break;

                case "Escalator":
                    break;

                case "Information":
                    break;

                case "Drinking fountains":
                    break;

////                case "Room":
////                    poiType = TYPE_ROOM;
////                    break;
//
//                case "Office":
//                    poiType = TYPE_OFFICE;
//                    break;
//
//                case "Toilets":
//                case "友善廁所":
//                    poiType = TYPE_TOILETS;
//                    break;
//
//                case "Disabled Toilets":
//                    poiType = TYPE_DISABLED_TOILETS;
//                    break;
//
//                case "Fire Extinguisher":
//                    poiType = TYPE_FIRE_EXTINGUISHER;
//                    break;
//
//                case "First Aid/AED":
//                    poiType = TYPE_AED;
//                    break;
//
//                case "Ramp":
//                    poiType = TYPE_RAMP;
//                    break;
//
//                case "Security/Guard":
//                    poiType = TYPE_SECURITY_GUARD;
//                    break;
//
////                case "Kitchen":
////                    poiType = TYPE_KITCHEN;
////                    break;
//
//                case "Other":
//                    poiType = TYPE_OTHER;
//                    break;
//
//                case "exhibits":
//                    poiType = TYPE_EXHIBIT;
//                    break;
//
//                case "firehydrant":
//                    poiType = TYPE_FIRE_HYDRANT;
//                    break;
//
//                case "information":
//                    poiType = TYPE_INFORMATION;
//                    break;
//
//                case "dining":
//                    poiType = TYPE_DINING;
//                    break;
//
//                case "emergency_exit":
//                    poiType = TYPE_EMERGENCY_EXIT;
//                    break;
//
//                case "escapesling":
//                    poiType = TYPE_ESCAPE_SLING;
//                    break;
//
//                case "meetingroom":
//                    poiType = TYPE_MEETING_ROOM;
//                    break;
//
//                case "introduce":
//                    poiType = TYPE_INTRODUCE;
//                    break;
            }
        }

        return poiType;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getUrlToPoisImage() {
        return urlToPoisImage;
    }

    public void setUrlToPoisImage(String urlToPoisImage) {
        this.urlToPoisImage = urlToPoisImage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIsEntrance() {
        return isEntrance;
    }

    public void setIsEntrance(String isEntrance) {
        this.isEntrance = isEntrance;
    }

    public String getIsDoor() {
        return isDoor;
    }

    public void setIsDoor(String isDoor) {
        this.isDoor = isDoor;
    }

    public String getIsExhibit() {
        return isExhibit;
    }

    public void setIsExhibit(String isExhibit) {
        this.isExhibit = isExhibit;
    }

//    public Exhibit[] getExhibits() {
//        return exhibits;
//    }
//
//    public void setExhibits(Exhibit[] exhibits) {
//        this.exhibits = exhibits;
//    }

    public String getTypeZh() {
        return typeZh;
    }

    public void setTypeZh(String typeZh) {
        this.typeZh = typeZh;
    }

//    public int getPOIIconRes(boolean isSelected) {
//        int resId;
//        switch (getPOIType()) {
//            case OGPOI.TYPE_OTHER:
//                resId = isSelected ? R.mipmap.icon_select : R.mipmap.poi_icon_other;
//                break;
//
////            case OGPOI.TYPE_KITCHEN:
////                resId = isSelected ? R.mipmap.icon_select : R.mipmap.icon_dining;
////                break;
//
//            case OGPOI.TYPE_OFFICE:
//                resId = isSelected ? R.mipmap.icon_select : R.mipmap.icon_office;
//                break;
//
//            case OGPOI.TYPE_TOILETS:
//                resId = isSelected ? R.mipmap.icon_select : R.mipmap.icon_toilet;
//                break;
//
//            case OGPOI.TYPE_DISABLED_TOILETS:
//                resId = isSelected ? R.mipmap.icon_select : R.mipmap.icon_toilet;
//                break;
//
//            case OGPOI.TYPE_ELEVATOR:
//                resId = isSelected ? R.mipmap.icon_select : R.mipmap.icon_elevator;
//                break;
//
//            case OGPOI.TYPE_ENTRANCE:
//                resId = isSelected ? R.mipmap.icon_select : R.mipmap.icon_emergency_exit;
//                break;
//
//            case OGPOI.TYPE_STAIR:
//                resId = isSelected ? R.mipmap.icon_select : R.mipmap.icon_stairs;
//                break;
//
//            case OGPOI.TYPE_EXHIBIT:
//                resId = isSelected ? R.mipmap.icon_select : R.mipmap.icon_expo;
//                break;
//
//            case OGPOI.TYPE_FIRE_EXTINGUISHER:
//                resId = isSelected ? R.mipmap.icon_select : R.mipmap.icon_extinguisher;
//                break;
//
//            case OGPOI.TYPE_AED:
//                resId = isSelected ? R.mipmap.icon_select : R.mipmap.icon_aed;
//                break;
//
//            case OGPOI.TYPE_FIRE_HYDRANT:
//                resId = isSelected ? R.mipmap.icon_select : R.mipmap.icon_hydrant;
//                break;
//
//            case OGPOI.TYPE_INFORMATION:
//                resId = isSelected ? R.mipmap.icon_select : R.mipmap.icon_info;
//                break;
//
//            case OGPOI.TYPE_DINING:
//                resId = isSelected ? R.mipmap.icon_select : R.mipmap.icon_dining;
//                break;
//
//            case OGPOI.TYPE_EMERGENCY_EXIT:
//                resId = isSelected ? R.mipmap.icon_select : R.mipmap.icon_emergency_exit;
//                break;
//
//            case OGPOI.TYPE_ESCAPE_SLING:
//                resId = isSelected ? R.mipmap.icon_select : R.mipmap.icon_escape_sling;
//                break;
//
//            case OGPOI.TYPE_MEETING_ROOM:
//                resId = isSelected ? R.mipmap.icon_select : R.mipmap.icon_meeting_room;
//                break;
//
//            case OGPOI.TYPE_INTRODUCE:
//                resId = isSelected ? R.mipmap.icon_select : R.mipmap.icon_introduce;
//                break;
//
//            default:
//                resId = isSelected ? R.mipmap.poi_icon_other_highlight : R.mipmap.poi_icon_other;
//                break;
//        }
//        return resId;
//    }

    public boolean isOriginalPOI() {
        return isOriginalPOI;
    }

    public void setIsOriginalPOI(boolean originalPOI) {
        isOriginalPOI = originalPOI;
    }

    public boolean isExhibitPOI() {
        return getPOIType() == OGPOI.TYPE_EXHIBIT;
    }

    public boolean isUtilityPOI() {
        return getPOIType() == OGPOI.TYPE_STAIR ||
                getPOIType() == OGPOI.TYPE_ELEVATOR ||
//                getPOIType() == OGPOI.TYPE_ROOM ||
                getPOIType() == OGPOI.TYPE_OFFICE ||
                getPOIType() == OGPOI.TYPE_TOILETS ||
                getPOIType() == OGPOI.TYPE_DISABLED_TOILETS ||
                getPOIType() == OGPOI.TYPE_RAMP ||
//                getPOIType() == OGPOI.TYPE_KITCHEN ||
                getPOIType() == OGPOI.TYPE_MEETING_ROOM ||
                getPOIType() == OGPOI.TYPE_INFORMATION ||
                getPOIType() == OGPOI.TYPE_INTRODUCE ||
                getPOIType() == OGPOI.TYPE_DINING ||
                getPOIType() == OGPOI.TYPE_OTHER;
    }

    public boolean isEmergencyPOI() {
        return getPOIType() == OGPOI.TYPE_AED ||
                getPOIType() == OGPOI.TYPE_FIRE_EXTINGUISHER ||
                getPOIType() == OGPOI.TYPE_SECURITY_GUARD ||
                getPOIType() == OGPOI.TYPE_EMERGENCY_EXIT ||
                getPOIType() == OGPOI.TYPE_FIRE_HYDRANT ||
                getPOIType() == OGPOI.TYPE_ESCAPE_SLING ||
                getPOIType() == OGPOI.TYPE_ENTRANCE;
    }
}
