import java.util.Scanner;
import java.io.File;

public class RatingManager {
	LinkedList<Rating> ratings;
	// Constructor
	public RatingManager(){
		ratings=new LinkedList<Rating>();
	}
	
	// Read ratings from a file and create a RatingManager object that stores these ratings
	public static RatingManager read(String fileName){
	RatingManager rm=new RatingManager();
		
		Scanner x = null;
		//opening the file
		try{
			x=new Scanner(new File(fileName));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		//reading the file
		String userid="";
		String itemid="";
		String rating="";
	
		while(x.hasNext()){
			//String.format("%s", x.next()) << return a String 
			userid=String.format("%s", x.next());
			int ui=Integer.parseInt(userid);
			
			itemid=String.format("%s",x.next());
			int id=Integer.parseInt(itemid);
			
			rating=String.format("%s", x.next());
			int ra=Integer.parseInt(rating);
			
			x.next();//to skip the time
			
			Rating r=new Rating(ui,id,ra);
			rm.ratings.insert(r);
		}
		return rm;
	}
	
	// Add a rating
	public void addRating(Rating rating){
		ratings.insert(rating);
	}
	
	// Return all ratings given by user i. Search should be efficient. 
	public LinkedList<Rating> getUserRatings(int i){
		LinkedList<Rating> r=new LinkedList<Rating>();
		rating.findFirst();
		while(!rating.last()){
			if(ratings.retrieve().getUserId()==i)
				r.insert(ratings.retrieve());
			rating.findNext();
		}
		if(ratings.retrieve().getUserId()==i)
			r.insert(ratings.retrieve());
		return r;
	}
	
	// Return all ratings given to item j. Search should be efficient.
	public LinkedList<Rating> getItemRatings(int j){
		LinkedList<Rating> r=new LinkedList<Rating>();
		rating.findFirst();
		while(!rating.last()){
			if(ratings.retrieve().getItemId()==j)
				r.insert(ratings.retrieve());
			rating.findNext();
		}
		if(ratings.retrieve().getItemId()==j)
			r.insert(ratings.retrieve());
		return r;
	}
	
	// Return the average rating of item j. If i has no ratings, -1 is returned
	public double getAverageItemRating(int j){
		LinkedList<Rating> r=new LinkedList<Rating>();
		double sum=0;
		int count=0;
		
		rating.findFirst();
		while(!rating.last()){
			if(ratings.retrieve().getItemId()==j){
				sum+=ratings.retrieve().getValue();
				count++;
			}
				
			rating.findNext();
		}
		if(ratings.retrieve().getItemId()==j){
			sum+=ratings.retrieve().getValue();
			count++;
		}
		
		return sum/count;
		
	}
	
	// Return the average rating given by user i. If i has no ratings, -1 is returned
	public double getAverageUserRating(int i);
	
	// Return the list of all items having the highest average rating (for example if the highest average rating is 4.9, the method should return all items with average rating 4.9)
	public LinkedList<Integer> getHighestRatedItems();
}
