public class RatingManager {

	// Constructor
	public RatingManager();
	
	// Read ratings from a file and create a RatingManager object that stores these ratings
	public static RatingManager read(String fileName);
	
	// Add a rating
	public void addRating(Rating rating);
	
	// Return all ratings given by user i. Search should be efficient. 
	public LinkedList<Rating> getUserRatings(int i);
	
	// Return all ratings given to item j. Search should be efficient.
	public LinkedList<Rating> getItemRatings(int j);
	
	// Return the average rating of item j. If i has no ratings, -1 is returned
	public double getAverageItemRating(int j);
	
	// Return the average rating given by user i. If i has no ratings, -1 is returned
	public double getAverageUserRating(int i);
	
	// Return the list of all items having the highest average rating (for example if the highest average rating is 4.9, the method should return all items with average rating 4.9)
	public LinkedList<Integer> getHighestRatedItems();
}
