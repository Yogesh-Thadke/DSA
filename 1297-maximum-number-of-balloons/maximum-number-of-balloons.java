class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> freq = new HashMap<>();
        char[] sample = {'b','a','l','o','n'};

        for(char s : sample){
            freq.put(s,0);
        }
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);

            if(freq.containsKey(ch)){
                freq.put(ch, freq.get(ch) + 1);
            }
        }
        freq.put('l',freq.get('l')/2);
        freq.put('o',freq.get('o')/2);

        return Math.min(
            Math.min(freq.get('b'), freq.get('a')),
            Math.min(
                Math.min(freq.get('l'), freq.get('o')),
                freq.get('n')
            )
        );

    }
}