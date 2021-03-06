//AsciiImage Class
import java.io.*;

public class AsciiImage {
  //Attributes
  private static final char[] shades = {'#', '$', '@', 'O', 'o', 
					'+', '-', ':', '.', '`', ' '};
  
  public char[][] pixel; //REMEMBER THAT THIS NEEDS TO BE PRIVATE
			  //I'M MAKING IT TEMPORARILY PUBLIC FOR DEBUGGING
  private int width;
  private int height;
  
  
  //Constructors
  public AsciiImage(int width, int height) {
    this.pixel = new char[width][height];
    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
	this.pixel[i][j] = this.shades[0];
	/*Debugging:*/ System.out.println("pixel[" + i + "][" + j + "]: " + this.pixel[i][j]);
      }
    }
  }
  
  public AsciiImage(Image image, int maxDimension) {
    
  }
  
  public AsciiImage(Image image) {
    
  }
  
  
  //Functions
  public int getWidth() {
    return this.width;
  }
  
  public int getHeight() {
    return this.height;
  }
  
  public char getPixel(int row, int col) {
    return this.pixel[row][col];
  }
  
  public void setPixel(int row, int col, char value) {
    //Check to ensure char value is a valid value that can be used
    for(int i = 0; i < shades.length; i++) {
      if(value == shades[i]) {
	//Check to ensure row and col are within a valid bound
	if(row < 0 || row > this.width) {
	  return;
	}
	else if(col < 0 || row > this.height) {
	  return;
	}
	//Finally, set the pixel if nothing fails
	else {
	  this.pixel[row][col] = value;
	  return;
	}
      }
    }
  }
  
  public Image getImage() {
    Image justToGetThisToCompile = new Image(this.width, this.height);
    return justToGetThisToCompile;
  }
  
  public String toString() {
    return "";
  }
  
  
  
  //Test main
  public static void main (String[] args) {
    //This is just for testing and should not be called by other processes.
    System.out.println("Debugging:");
    System.out.println("Printing contents of pixel[][] array: ");
    int height = 5;
    int width = 5;
    AsciiImage debugtest = new AsciiImage(height, width);
    /*
    for (int i = 0; i <= width; i++) {
      for (int j = 0; j <= height; j++) {
	System.out.println("[" + i + "][" + j + "]: "/*Pixels should output here);
      }
    }*/
  }

}