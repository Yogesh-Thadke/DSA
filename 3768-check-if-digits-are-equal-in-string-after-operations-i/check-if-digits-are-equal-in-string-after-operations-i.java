class Solution {
    public boolean hasSameDigits(String s) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            list.add(s.charAt(i)-'0');
        }

        while(list.size()>2){
            List<Integer> next = new ArrayList<>();
            for(int i=0; i<list.size()-1; i++){
                next.add((list.get(i)+list.get(i+1))%10);
            }
            list=next;
        }
        return list.get(0).equals(list.get(1));
    }
}