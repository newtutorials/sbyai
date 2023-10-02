public class InstantWrapper {
   private Instant instant;

   public InstantWrapper(Instant instant) {
      this.instant = instant;
   }

   public String getInstantString() {
      // Convert Instant to String format of your choice
      //...
   }

   public static InstantWrapper fromInstantString(String instantString) {
      // Convert String to Instant format and return an InstantWrapper object
      //...
   }

   // Getters and setters for instant field
}
