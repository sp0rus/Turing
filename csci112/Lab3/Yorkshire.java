// ****************************************************************
// Yorkshire.java
//
// A class derived from Dog that holds information about
// a Yorkshire terrier. Overrides Dog speak method.
//          
// ****************************************************************

public class Yorkshire extends Dog
{
	private static int breedWeight = 7;
	
   public Yorkshire(String name)
   {
      super(name);
   }

   // ------------------------------------------------------------
   // Small bark -- overrides speak method in Dog
   // ------------------------------------------------------------
   public String speak()
   {
      return "woof";
   }
   public static int avgBreedWeight()
   {
      return breedWeight;
   }

}

