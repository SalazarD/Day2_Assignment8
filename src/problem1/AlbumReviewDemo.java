package problem1;

import java.util.Scanner;

public class AlbumReviewDemo {
	
	public static void main(String[] args) {
		
		AlbumReview[] reviews = new AlbumReview[5];
		reviews[0] = new AlbumReview(1, "Michael Jackson","Thriller",5);
		reviews[1] = new AlbumReview(2, "Weezer","Black Album",3);
		reviews[2] = new AlbumReview(3, "Michael Jackson","Thriller",3);
		reviews[3] = new AlbumReview(4, "Michael Jackson","Thriller",4);
		reviews[4] = new AlbumReview(5, "Pixies", "Beneath the Eyrie",5);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter in artist name:");
		String artistName = scanner.nextLine();
		
		System.out.println("Enter in artist album:");
		String artistAlbum = scanner.nextLine();
		
		double average = getAverageRating(reviews, artistName,artistAlbum);
		
		System.out.println("The average review for "+artistName+" "+artistAlbum+" is "+average);
		scanner.close();
		
		System.out.println("Here are all reviews for "+artistName+" "+artistAlbum);
		
		AlbumReview[] temp = getAllReviews(reviews, artistName, artistAlbum);
		for(int i = 0; i < temp.length; i++) {
			System.out.println(temp[i].toString());
		}
		
		// we want to use the initial review array
		// and pass in the 3rd object of the array
		changeReview(reviews[2], 2);
		// print a blank line to separate the this
		// display all from the above display all
		System.out.println();
		// display all reviews and verify the change
		for (AlbumReview review: reviews) {
		System.out.println(review);
		}
		
		scanner.close();
		
		}
	
	public static void changeReview(AlbumReview review, int rating) {
		review.setRating(rating);
	}
	
	
	public static AlbumReview[] getAllReviews(AlbumReview[] reviews, String artist, String albumName) {
		
		int matchCount = 0;
		
		for(int i = 0; i < reviews.length; i++) {
			//System.out.println(reviews[i].getAlbumArtist()+reviews[i].getAlbumName()+ "||" + artist + albumName);
			//System.out.println(reviews[i].getAlbumArtist());
			if(reviews[i].getAlbumArtist().equalsIgnoreCase(artist) && reviews[i].getAlbumName().equalsIgnoreCase(albumName)) {
				matchCount++;
				
			}
		}
		
		AlbumReview[] temp = new AlbumReview[matchCount];
		
		int pos = 0;
		for(int i = 0; i < reviews.length; i++) {
			if(reviews[i].getAlbumArtist().equalsIgnoreCase(artist) && reviews[i].getAlbumName().equalsIgnoreCase(albumName)) {
				temp[pos] = reviews[i];
				pos++;
			}
		}
		
		
		
		return temp;
		
	}
	
	
	public static double getAverageRating(AlbumReview[] reviews,  String albumArtist, String albumName){
			 double averageRating = 0;
			 int matchesFound = 0;
			// loop through the album reviews {
			 for (int i=0; i< reviews.length; i++) {
			// if we find a non-case sensitive match for the album
			// and artist {
			if (reviews[i].getAlbumArtist().equalsIgnoreCase(albumArtist) && reviews[i].getAlbumName().equalsIgnoreCase(albumName)) {
			// averageRating = averageRating + this review's rating
			averageRating = averageRating + reviews[i].getRating();
			// increment matchesFound
			matchesFound++;
			//} // end if
			}
			 //} // end loop
			 }
			 // We want to avoid division by zero
			 // if we found any matches
			 if (matchesFound > 0) {
			// averageRating = averageRating / matchesFound
			averageRating = averageRating / matchesFound;
			 }
			 return averageRating;
			}

}
