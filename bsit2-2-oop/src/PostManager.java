import java.util.*;

public class PostManager {

    // 1. calculateEngagement
    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) return 0;
        int total = 0;
        for (int i : interactions) {
            total += i;
        }
        return total;
    }

    // 2. getCategoryRating
    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) return "Viral";
        else if (engagementScore >= 500) return "Popular";
        else if (engagementScore >= 100) return "Good";
        else if (engagementScore >= 50) return "Low";
        else return "Poor";
    }

    // 3. displayPostStats (overloaded)
    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }

    // 4. manageHashtags
    public ArrayList<String> manageHashtags(String[] hashtags) {
        HashSet<String> uniqueSet = new HashSet<>(Arrays.asList(hashtags));
        return new ArrayList<>(uniqueSet);
    }

    // 5. findTrendingPosts
    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trending = new LinkedList<>();
        for (String post : posts) {
            if (postEngagement.containsKey(post) && postEngagement.get(post) > 500) {
                trending.add(post);
            }
        }
        return trending;
    }

    // 6. getUniqueAuthors
    public HashSet<String> getUniqueAuthors(String... authors) {
        return new HashSet<>(Arrays.asList(authors));
    }
}