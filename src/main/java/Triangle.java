public class Triangle {
  private int mSide1;
  private int mSide2;
  private int mSide3;

  public Triangle(int side1, int side2, int side3){
    mSide1 = side1;
    mSide2 = side2;
    mSide3 = side3;
  }

  public String triangleType(){
    if(((mSide1 + mSide2) < mSide3) || ((mSide2 + mSide3) < mSide1) || ((mSide1 + mSide3) < mSide2)){
      return "Not A Triangle";
    } else if(mSide1 == mSide2 && mSide2 == mSide3){
      return "Equilateral";
    } else if ((mSide1 == mSide2 && mSide2 != mSide3)|| (mSide2 == mSide3 && mSide1 != mSide2)){
      return "Isoceles";
    } else if (mSide1 != mSide2 && mSide2 != mSide3){
      return "Scalene";
    } else {
      return "error";
    }
  }

}
