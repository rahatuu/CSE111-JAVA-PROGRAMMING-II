//Task01
public class Song{
  public String title;
  public String artist;
  public int length;
  public Song next;
  public Song(String title,String artist, int length){
    this.title=title;
    this.artist=artist;
    this.length=length;
    this.next=null;}
  public void songInfo(){
    System.out.println("Title: "+title+"\nArtist: "+artist+"\nLength: "+length+" minutes");}}

//Task02
public class Playlist {
    public String name;
    public Song songloca; 
    public int songCount;
    public Playlist(String name) {
        this.name = name;
        this.songloca = null; 
        this.songCount = 0;
        System.out.println(name + " created.");}}
  
//Task03 & 04
    public void addSong(Song newSong) {
        if (songloca == null) {
          songloca = newSong;}
        else {
            Song presSong = songloca;
            while (presSong.next != null) {
              presSong = presSong.next; }
            presSong.next = newSong; }
        songCount++;
        System.out.println(newSong.title + " added to " + name + ".");}
    public void info() {
      System.out.println(name + " has the following songs:");
      if (songloca == null) {
        System.out.println("No songs in " + name + ".");
        return;}
      Song current = songloca;
      for (int count = 1; current != null; count++) {
        System.out.println("Song-" + count);
        current.songInfo();
        current = current.next;}}

//Task05 
    public void addSong(Song newSong, int index) {
      if (index < 0 || index > songCount) {
        System.out.println("Cannot add song to Index " + index + ".");
        return;}
      Song current = songloca;
      if (index == 0) {
        newSong.next = current;
        songloca = newSong;}
      else {
        for (int i = 1; i < index; i++) {
          current = current.next;}
        newSong.next = current.next;
        current.next = newSong;}
        songCount++;
        System.out.println(newSong.title + " added to " + name + ".");}
//Task06
     public void playSong(String title) {
      Song presSong = songloca;
      while (presSong != null) {
        if (presSong.title.equals(title)) {
          System.out.println("Playing " + presSong.title + " by " + presSong.artist + ".");
          break;}
        presSong = presSong.next;}
      if (presSong == null) {
        System.out.println(title + " not found in playlist " + name + ".");}}
     


//Task7
     public void playSong(int index) {
       if (index < 0 || index >= songCount) {
         System.out.println("Song at Index " + index + " not found in " + name + ".");
         return;}
       Song presSong = songloca;
       for (int i = 0; i < index; i++) {
         presSong = presSong.next;}
       System.out.println("Playing " + presSong.title + " by " + presSong.artist + ".");}

//Task08
 public void deleteSong(String title) {
    if (songloca == null) {
      System.out.println(title + " not found in " + name + ".");}
    else if (songloca.title.equals(title)) {
        songloca = songloca.next;
        songCount--;
        System.out.println(title + " deleted from " + name + ".");}
    else{
        Song current = songloca;
        while (current.next != null) {
            if (current.next.title.equals(title)) {
                current.next = current.next.next;
                songCount--;
                System.out.println(title + " deleted from " + name + ".");
                return;}
            current = current.next;}
        System.out.println(title + " not found in " + name + ".");}}

//Task09
  public int totalSong() {
      return songCount;}

//Task10
public void merge(Playlist otherPlaylist) {
      if (this.songloca == null) {
        this.songloca = otherPlaylist.songloca;}
      else {
        Song presSong = this.songloca;
        while (presSong.next != null) {
          presSong = presSong.next;}
        presSong.next = otherPlaylist.songloca;}
      this.songCount += otherPlaylist.songCount;
      System.out.println("Merge Completed!");}
