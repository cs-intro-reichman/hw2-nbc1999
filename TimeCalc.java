public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addmin = Integer.parseInt( args[1]);
       // System.out.println("hours" + hours);
       // System.out.println("min" + minutes);
       // System.out.println("add" + addmin);
       int totmin = hours * 60 + minutes + addmin;
       int newmin = totmin % 60;
       int newhours = ((totmin / 60) % 24);
      if (newhours < 10 && newmin < 10) {
        System.out.println("0"+ newhours + ":" + "0" + newmin);
        
      }
      else if(newhours < 10 && newmin >= 10){
        System.out.println("0"+ newhours + ":" + newmin);
      }
       else if(newhours >= 10 && newmin < 10){
        System.out.println( newhours + ":" + "0" + newmin);
      }
      else{
         System.out.println( newhours + ":" + newmin);
      }
    }
}
