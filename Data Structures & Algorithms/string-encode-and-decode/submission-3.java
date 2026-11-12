class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for(String str : strs){
            int len = str.length();


            encoded.append(String.format("%03d", len));
            encoded.append(str);
        }

        //System.out.println(encoded.toString());

        return encoded.toString();
    }

    public List<String> decode(String str) {

        List<String> decoded = new ArrayList<>();

        char[] encoded = str.toCharArray();

        int ptr = 0;

        while(ptr < str.length()){
            int len = Integer.parseInt(str.substring(ptr, ptr + 3));
            ptr += 3;

            String s = "";

            for(int i = ptr; i < len + ptr; i ++){
                s += encoded[i];
            }

            decoded.add(s);
            ptr += len;
        }
        
        return decoded;
    }
}
