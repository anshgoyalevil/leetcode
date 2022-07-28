public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        
        System.out.println(longUrl);
        return longUrl;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        
        System.out.println(shortUrl);
        return shortUrl;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));