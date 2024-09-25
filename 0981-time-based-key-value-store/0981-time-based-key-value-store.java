class TimeMap {

    Map<String, Value> map;
    public TimeMap() {
        map = new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key, new Value());
        }

        map.get(key).times.add(timestamp);
        map.get(key).values.add(value);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }

        Value value = map.get(key);
        List<Integer> timeList = value.times;
        List<String> valList = value.values;
        int i=0, j = timeList.size()-1;
        while(i <=j){
            int mid =  i +(j-i)/2;
            if(timeList.get(mid)== timestamp){
                return valList.get(mid);
            }

            if(timeList.get(mid) < timestamp){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }

        if (j >= 0) {
            return valList.get(j);
        }

        return ""; 
    }
}


class Value{
    List<Integer> times;
    List<String> values;

    public Value(){
        times = new ArrayList();
        values = new ArrayList();
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */