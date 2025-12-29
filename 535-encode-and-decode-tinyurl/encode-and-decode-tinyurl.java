public class Codec {

    // Encodes a URL to a shortened URL.
   private Map<String, String> shortToLong;
    private int id;
    private static final String BASE_URL = "http://tinyurl.com/";

    public Codec() {
        shortToLong = new HashMap<>();
        id = 1;
    }
    public String encode(String longUrl) {
        String shortUrl = BASE_URL + id;
        shortToLong.put(shortUrl, longUrl);
        id++;
        return shortUrl;
    }
    

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
     return shortToLong.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));