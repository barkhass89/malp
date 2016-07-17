package andrompd.org.andrompd.mpdservice.mpdprotocol.mpddatabase;


public class MPDFile extends MPDFileEntry {
    private String pTrackTitle;
    private String pFileName;
    private String pFileURL;

    private String pTrackArtist;
    private String pTrackAlbum;
    private String pTrackAlbumArtist;

    private String pDate;

    private String pTrackArtistMBID;
    private String pTrackMBID;
    private String pTrackAlbumMBID;

    private int pLength;
    private int pTrackNumber;
    private int pAlbumTrackCount;
    private int pDiscNumber;
    private int pAlbumDiscCount;

    /**
     * Create empty MPDFile (track). Fill it with setter methods during
     * parsing of mpds output.
     */
    public MPDFile() {
        pTrackTitle = "";
        pFileName = "";
        pFileURL = "";

        pTrackArtist = "";
        pTrackAlbum = "";
        pTrackAlbumArtist = "";

        pDate = "";

        pTrackArtistMBID = "";
        pTrackMBID = "";
        pTrackAlbumMBID = "";

        pLength = 0;
    }

    public String getTrackTitle() {
        return pTrackTitle;
    }

    public void setTrackTitle(String pTrackTitle) {
        this.pTrackTitle = pTrackTitle;
    }

    public String getFileName() {
        return pFileName;
    }

    public void setFileName(String pFileName) {
        this.pFileName = pFileName;
    }

    public String getFileURL() {
        return pFileURL;
    }

    public void setFileURL(String pFileURL) {
        this.pFileURL = pFileURL;
    }

    public String getTrackArtist() {
        return pTrackArtist;
    }

    public void setTrackArtist(String pTrackArtist) {
        this.pTrackArtist = pTrackArtist;
    }

    public String getTrackAlbum() {
        return pTrackAlbum;
    }

    public void setTrackAlbum(String pTrackAlbum) {
        this.pTrackAlbum = pTrackAlbum;
    }

    public String getTrackAlbumArtist() {
        return pTrackAlbumArtist;
    }

    public void setTrackAlbumArtist(String pTrackAlbumArtist) {
        this.pTrackAlbumArtist = pTrackAlbumArtist;
    }

    public String getDate() {
        return pDate;
    }

    public void setDate(String pDate) {
        this.pDate = pDate;
    }

    public String getTrackArtistMBID() {
        return pTrackArtistMBID;
    }

    public void setTrackArtistMBID(String pTrackArtistMBID) {
        this.pTrackArtistMBID = pTrackArtistMBID;
    }

    public String getTrackMBID() {
        return pTrackMBID;
    }

    public void setTrackMBID(String pTrackMBID) {
        this.pTrackMBID = pTrackMBID;
    }

    public String getTrackAlbumMBID() {
        return pTrackAlbumMBID;
    }

    public void setTrackAlbumMBID(String pTrackAlbumMBID) {
        this.pTrackAlbumMBID = pTrackAlbumMBID;
    }

    public int getLength() {
        return pLength;
    }

    public String getLengthString() {
        String returnString = "";
        int hours = 0, minutes = 0, seconds = 0;
        hours = pLength / 3600;
        if (hours > 0) {
            minutes = (pLength - (3600 * hours)) / 60;
        } else {
            minutes = pLength/60;
        }

        seconds = pLength - (hours*3600) - (minutes*60);

        if (hours == 0) {
            returnString = (minutes < 10 ? "0" : "" ) + minutes + ":" + (seconds < 10 ? "0" : "") + seconds;
        } else {
            returnString =  (hours < 10 ? "0" : "" ) + hours + ":" + (minutes < 10 ? "0" : "" ) + minutes + ":" + (seconds < 10 ? "0" : "") + seconds;
        }
        return returnString;
    }

    public void setLength(int pLength) {
        this.pLength = pLength;
    }

    public void setTrackNumber(int trackNumber) {
        pTrackNumber = trackNumber;
    }

    public int getTrackNumber() {
        return pTrackNumber;
    }

    public void setDiscNumber(int discNumber) {
        pDiscNumber = discNumber;
    }

    public int getDiscNumber() {
        return pDiscNumber;
    }

    public int getAlbumTrackCount() {
        return pAlbumTrackCount;
    }

    public void setAlbumTrackCount(int albumTrackCount) {
        pAlbumTrackCount = albumTrackCount;
    }

    public int getAlbumDiscCount() {
        return pAlbumDiscCount;
    }

    public void psetAlbumDiscCount(int discCount) {
        pAlbumDiscCount = discCount;
    }
}
