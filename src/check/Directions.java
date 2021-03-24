package check;
public enum Directions{
  EAST ("east"), 
  WEST ("west"), 
  NORTH ("north"), 
  SOUTH ("S")
  ; 
  /* Important Note: Must have semicolon at
   * the end when there is a enum field or method
   */
  private final String shortCode;
	  
  Directions(String code) {
      this.shortCode = code;
  }
	  
  public String getDirectionCode() {
      return this.shortCode;
  }
}