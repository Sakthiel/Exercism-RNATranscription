import java.util.HashMap;
class RnaTranscription {
    HashMap<String,String> map = new HashMap<String,String>();
    public RnaTranscription(){
        map.put("G","C");
        map.put("C","G");
        map.put("T","A");
        map.put("A","U");
        
    }
    String transcribe(String dnaStrand) {
      int length = dnaStrand.length();
        String rnaStrand = "";
        for(int i =0 ; i< length ; i++){
            String character = "" +dnaStrand.charAt(i);
            rnaStrand = rnaStrand + map.get(character);
        }
        return rnaStrand;
    }

}
