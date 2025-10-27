class Bank {
    ArrayList<Long> list = new ArrayList<>();
    public Bank(long[] balance) {
        for(long val : balance){
            list.add(val);
        }
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(list.size()>=account1 && list.size()>=account2){
            if(list.get(account1-1)>=money){
                list.set(account2-1,(list.get(account2-1))+money);
                list.set(account1-1,(list.get(account1-1))-money);
                return true;
            }
        }
        return false;
    }
    
    public boolean deposit(int account, long money) {
        if(list.size()>=account){
            list.set(account-1,(list.get(account-1)+money));
            return true;
        }
        return false;
    }
    
    public boolean withdraw(int account, long money) {
        if(list.size()>=account && list.get(account-1)>=money){
            list.set(account-1,(list.get(account-1)-money));
            return true;
        }
        return false;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */