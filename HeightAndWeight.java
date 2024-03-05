public class HeightAndWeight {
  private int height;  // ins.
  private int weight;  // lbs.

  // Constructor
  public HeightAndWeight(int h, int w){
      height = h;
      weight = w;
  }

  // toString method
  public String toString() {
    return "Height: " + height + " in. " +
           "Weight: " + weight + " lbs";
  }

  // Getter Methods
  public int getheight(){
    return height; 
  }

  public int getweight(){
    return weight;
  }
  
  // HeightAndWeight Operators
  public double getBMI(){
    return convertPoundsToKgs(weight) / 
          Math.pow(convertFeetToMeters(height), 2);
  }

  public boolean healthyBMI(){
    return getBMI() >= 18.5 && getBMI() <= 24.9;

  }

  public String getDescript(){
    
    double bmi = getBMI();


	
  }

  // Private Methods
  private double convertFeetToMeters(int h){
       return h * 0.0254;
  }

  private double convertPoundsToKgs(int p){
      return p * 0.454;
  }

}