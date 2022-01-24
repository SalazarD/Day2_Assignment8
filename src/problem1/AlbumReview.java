package problem1;

public class AlbumReview {
	
	private int reviewId;
	private String albumName;
	private String albumArtist;
	private int rating;
	private String comments;
	
	public AlbumReview(int reviewId, String albumArtist, String albumName, int rating, String comments) {
		
		this.reviewId = reviewId; 
		this.albumName = albumName;
		this.albumArtist = albumArtist;
		this.rating = rating;
		this.comments = comments;
		
		
	}
	public AlbumReview(int reviewId, String albumArtist, String albumName, int rating) {
		
		this.reviewId = reviewId; 
		this.albumName = albumName;
		this.albumArtist = albumArtist;
		this.rating = rating;
		
		
		
	}
	public int getReviewId() {
		return reviewId;
	}
	public String getAlbumName() {
		return albumName;
	}
	public String getAlbumArtist() {
		return albumArtist;
	}
	public int getRating() {
		return rating;
	}
	public String getComments() {
		return comments;
	}
	@Override
	public String toString() {
		return "AlbumReview [reviewId=" + reviewId + ", albumName=" + albumName + ", albumArtist=" + albumArtist
				+ ", rating=" + rating + ", comments=" + comments + "]";
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
