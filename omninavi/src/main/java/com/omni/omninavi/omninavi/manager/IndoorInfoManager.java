package com.omni.omninavi.omninavi.manager;

import android.content.Context;

import com.android.volley.Request;
import com.omni.omninavi.omninavi.model.OGBuilding;
import com.omni.omninavi.omninavi.model.OGFloors;
import com.omni.omninavi.omninavi.tool.DialogTools;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wiliiamwang on 31/10/2017.
 */

public class IndoorInfoManager {

    private static IndoorInfoManager sIndoorManager;

    public static IndoorInfoManager create() {
        if (sIndoorManager == null) {
            sIndoorManager = new IndoorInfoManager();
        }
        return sIndoorManager;
    }

    private IndoorInfoManager() {

    }

    public void getBuildings(Context context, NetworkManager.NetworkManagerListener<OGBuilding[]> listener) {
        DialogTools.getInstance().showProgress(context);

        String url = NetworkManager.DOMAIN_NAME + "/locapi/get_building";

        NetworkManager.getInstance().addJsonRequestToCommonObj(context, Request.Method.GET, url, null, OGBuilding[].class, NetworkManager.DEFAULT_TIMEOUT, listener);
    }

    public void getFloors(Context context, String buildingId, NetworkManager.NetworkManagerListener<OGFloors> listener) {
        DialogTools.getInstance().showProgress(context);

        String url = NetworkManager.DOMAIN_NAME + "/locapi/get_floor";
        Map<String, String> params = new HashMap<>();
        params.put("b", buildingId);

        NetworkManager.getInstance().addJsonRequest(context, Request.Method.GET, url, params, OGFloors.class, NetworkManager.DEFAULT_TIMEOUT, listener);
    }

}
