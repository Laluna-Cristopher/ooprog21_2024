

import javax.swing.JOptionPane;

public class MovieQuoteInfo {

	public static void main(String[] args) {
		
		//declares favorite movie quote and info
		String favoriteMovieQuote = "Life was like a box of chocolates," + 
		" you never know what you're gonna get.";		
		String quoteInfo = "Movie Title: Forrest Gump || Character: Forrest Gump || Year of Movie: 1994 ";

		//displays favorite movie quote and info in dialog box
		JOptionPane.showMessageDialog(null, favoriteMovieQuote);
		JOptionPane.showMessageDialog(null, quoteInfo);
	}

}
