package com.mg153.RapidWinesList;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseWrapper extends SQLiteOpenHelper {

	public static final String RapidWinesList = "RapidWinesList";
	public static final String RapidWinesList_ID = "_id";
	public static final String RapidWinesList_NOM = "_nom";
	public static final String RapidWinesList_MAISON ="_maison";
	public static final String RapidWinesList_PAYS = "_pays";
	public static final String RapidWinesList_REGION = "_region";
	public static final String RapidWinesList_COULEUR = "_couleur";
	public static final String RapidWinesList_MILLE = "_mille";
	public static final String RapidWinesList_ALCOOL = "_alcool";
	public static final String RapidWinesList_PRIX = "_prix";
	public static final String RapidWinesList_CODE = "_code";
	public static final String RapidWinesList_NOTE = "_note";
	public static final String RapidWinesList_APPREC = "_apprec";
	public static final String RapidWinesList_IMAGEID = "_imageid";
        public static final String RapidWinesList_IMAGEPATH = "_imagepath";


	private static final String DATABASE_NAME = "RapidWinesList.db";
	private static final int DATABASE_VERSION = 1;

	// creation SQLite statement
	private static final String DATABASE_CREATE = "create table " + RapidWinesList
			+ "(" + RapidWinesList_ID + " integer primary key autoincrement, "
			+ RapidWinesList_NOM  + " text not null, "
			+ RapidWinesList_MAISON  + " text not null, "
			+ RapidWinesList_PAYS  + " text not null, "
			+ RapidWinesList_REGION  + " text not null, "
			+ RapidWinesList_COULEUR  + " text not null, "
			+ RapidWinesList_MILLE  + " text not null, "
			+ RapidWinesList_ALCOOL  + " text not null, "
			+ RapidWinesList_PRIX  + " text not null, "
			+ RapidWinesList_CODE  + " text not null, "
			+ RapidWinesList_NOTE  + " text not null, "
			+ RapidWinesList_APPREC  + " text not null, "
			+ RapidWinesList_IMAGEID  + " integer, "
			+ RapidWinesList_IMAGEPATH  + " text not null);";
	
	
	public DataBaseWrapper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DATABASE_CREATE);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// you should do some logging in here
		// ..

		db.execSQL("DROP TABLE IF EXISTS " + RapidWinesList);
		onCreate(db);
	}

}
