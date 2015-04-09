package com.generaldevelopers.cordova.sqlitesample;

import android.app.Application;

import com.gendevs.backbone.BackBone;

public class BbSqliteSampleApplication extends Application {
	
	@Override
	public void onCreate() {
 		super.onCreate();
 		BackBone bb = new BackBone("76106eb5561cecc");
		bb.setup(this,true);
 	}

}
