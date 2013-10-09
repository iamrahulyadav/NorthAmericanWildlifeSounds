package com.example.northamericanwildlifesounds;

import java.util.HashMap;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ViewSwitcher;
import android.media.AudioManager;
import android.media.SoundPool;

public class OurSoundPlayer {
	public static final int bobcat = R.raw.bobcat;
	public static final int coyote = R.raw.coyote;
	public static final int deer = R.raw.deer;
	public static final int fox = R.raw.fox;
	public static final int mountainlion = R.raw.mountainlion;
	public static final int possum = R.raw.possum;
	public static final int rabbit = R.raw.rabbit;
	public static final int raccoon = R.raw.raccoon;
	public static final int squirrel = R.raw.squirrel;
	public static final int turkey = R.raw.turkey;
	
	private static SoundPool soundPool;
	private static HashMap soundPoolMap;

	/** Populate the SoundPool*/
	public static void initSounds(Context context) {
	    soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 100);
	soundPoolMap = new HashMap(3);     

	soundPoolMap.put( bobcat, soundPool.load(context, R.raw.bobcat, 1) );
	soundPoolMap.put( coyote, soundPool.load(context, R.raw.coyote, 2) );
	soundPoolMap.put( deer, soundPool.load(context, R.raw.deer, 3) );
	soundPoolMap.put( fox, soundPool.load(context, R.raw.fox, 4) );
	/*soundPoolMap.put( deer, soundPool.load(context, R.raw.deer, 5) );
	soundPoolMap.put( deer, soundPool.load(context, R.raw.deer, 6) );
	soundPoolMap.put( deer, soundPool.load(context, R.raw.deer, 7) );
	soundPoolMap.put( deer, soundPool.load(context, R.raw.deer, 8) );
	soundPoolMap.put( deer, soundPool.load(context, R.raw.deer, 9) );
	soundPoolMap.put( deer, soundPool.load(context, R.raw.deer, 10) );
	soundPoolMap.put( deer, soundPool.load(context, R.raw.deer, 11) );*/
	}

}

