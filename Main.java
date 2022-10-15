public class Main {
  public int disc(final int a, final int b, final int c){

        final int dis = (int)Math.pow(b,2) - (4*a*c);

        return dis;

    }
    
    public String shortest(final String[] arr) {
if(arr == null || arr.length < 1){
   return null;
   }
   String shrt=arr[0];
for(int i=1; i<arr.length;i++){
   String tmp=arr[i];
if(tmp.length() < shrt.length()){
shrt=tmp;}
}

return shrt;
}
}
