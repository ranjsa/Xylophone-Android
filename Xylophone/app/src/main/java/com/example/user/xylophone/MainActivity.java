package com.example.user.xylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import static com.example.user.xylophone.R.styleable.View;

public class MainActivity extends AppCompatActivity {


    // Helpfull Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS =7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;


    //TODO : ADD member variables here

    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: Create a new SoundPool
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC,0);


        //TODO: Load  and get  the  IDs to identify the Sound

        mCSoundId = mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId = mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundId = mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundId = mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundId = mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);
        mASoundId = mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundId = mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);




    }

    //TODO: Add the play method triggered by the buttons



    public void playC(android.view.View v){
        Log.d("Xylophone","Red button clicked!");
        mSoundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);


    }
    public void playD(android.view.View v){
        Log.d("Xylophone","Red button clicked!");
        mSoundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playE(android.view.View v){
        Log.d("Xylophone","Red button clicked!");
        mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playF(android.view.View v){
        Log.d("Xylophone","Red button clicked!");
        mSoundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playG(android.view.View v){
        Log.d("Xylophone","Red button clicked!");
        mSoundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playA(android.view.View v){
        Log.d("Xylophone","Red button clicked!");
        mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playB(android.view.View v){
        Log.d("Xylophone","Red button clicked!");
        mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }



}

