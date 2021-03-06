/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
	public static void testKeepOnlyBlue()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.KeepOnlyBlue();
		beach.explore();
	}
	
	public static void testKeepOnlyRed()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.KeepOnlyRed();
		beach.explore();
	}
	
	public static void testNegate()
	{
		
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.Negate();
		beach.explore();
		
	}
	
	public static void testGrayscale()
	{
		
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.Grayscale();
		beach.explore();
		
	}
	
	public static void testFixUnderwater()
	{
		
		Picture underwater = new Picture("water.jpg");
		underwater.explore();
		underwater.FixUnderwater();
		underwater.explore();
		
	}
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.MirrorVertical();
    caterpillar.explore();
  }
  
	public static void testMirrorRightToLeft()
	{
		
		Picture cycle = new Picture("redMotorcycle.jpg");
		cycle.explore();
		cycle.MirrorRightToLeft();
		cycle.explore();
		
	}
	
	public static void testMirrorHorizontal()
	{
		Picture cycle = new Picture("redMotorcycle.jpg");
		cycle.explore();
		cycle.MirrorHorizontal();
		cycle.explore();
	}
	
	public static void testMirrorBottomToTop()
	{
		Picture cycle = new Picture("redMotorcycle.jpg");
		cycle.explore();
		cycle.MirrorBottomToTop();
		cycle.explore();
	}
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.MirrorTemple();
    temple.explore();
  }
  
	public static void testMirrorArms()
	{
		Picture snowman = new Picture("snowman.jpg");
		snowman.explore();
		snowman.MirrorArms();
		snowman.explore();
	}
	
	public static void testMirrorGull()
	{
		Picture gull = new Picture("seagull.jpg");
		gull.explore();
		gull.MirrorGull();
		gull.explore();
	}
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
	public static void testMyCollage()
	{
		Picture canvas = new Picture("640x480.jpg");
		canvas.MyCollage();
		canvas.explore();
		
	}
  
  /** Method to test edgeDetection */
	public static void testEdgeDetection()
	{
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}
  
	public static void testEdgeDetection2()
	{
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection2(10);
		swan.explore();
	}
	
	public static void testEdgeDetection3()
	{
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection3(10);
		swan.explore();
	}
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
	//testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorRightToLeft();
	//testMirrorHorizontal();
	//testMirrorBottomToTop();
	//testMirrorTemple();
	//testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
	//testMyCollage();
    //testCopy();
    testEdgeDetection();
    testEdgeDetection2();
	testEdgeDetection3();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}