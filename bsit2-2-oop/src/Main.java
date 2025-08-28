import java.util.*;

public class Main {
    public static void main(String[] args) {
        PostManager manager = new PostManager();


        String postTitle = "Java Programming Tips";
        int engagementScore = manager.calculateEngagement(150, 75, 25);
        String category = manager.getCategoryRating(engagementScore);

        String[] hashtags = {"#Java", "#Coding", "#Programming", "#Tips"};
        ArrayList<String> uniqueHashtags = manager.manageHashtags(hashtags);

        ArrayList<String> posts = new ArrayList<>(Arrays.asList("Advanced Java Tutorial", "Spring Boot Guide", "Java Basics"));
        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Advanced Java Tutorial", 800);
        postEngagement.put("Spring Boot Guide", 600);
        postEngagement.put("Java Basics", 300);

        LinkedList<String> trendingPosts = manager.findTrendingPosts(posts, postEngagement);

        HashSet<String> uniqueAuthors = manager.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");


        System.out.println("═══ Social Media Post Manager ═══");
        manager.displayPostStats(postTitle, engagementScore, category);
        System.out.println();
        System.out.println("Unique Hashtags: " + uniqueHashtags);
        System.out.println("Trending Posts: " + trendingPosts);
        System.out.println("Unique Authors: " + uniqueAuthors);
    }
}