package com.example.musicapp

import android.util.Log
import android.util.Log.v

class Song (songName: String, songArtist: String, songYear: Int, songDuration: String) {
    //created variables to hold song objects attributes
    var name: String = ""
    var artist: String = ""
    var year: Int = 0
    var duration: String = ""

    constructor(songName: String, songArtist: String) : this(songName, songArtist, 0, ""){}




    //initialising variables
    init{
        name = songName
        artist = songArtist
        year = songYear
        duration = songDuration
    }

    //function to play song
    fun PLay(){
        Log.v("song", "$name is playing")
    }

    //function to pause song
    fun Pause(){
        Log.v("Song", "$name is paused")
    }

    //function to stop song
    fun Stop(){
        Log.v("song", "$name has stopped")
    }

    //function to favourite song
    fun Favourite(){
        Log.v("song", "$name is favourited")
    }

    fun DisplaySong() : String{
        return "$name - $artist ($duration)"
    }
}