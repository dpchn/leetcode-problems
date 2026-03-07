class Logger {

    int curentTime;
    Map<String, Integer> map = new HashMap();
    public Logger() {
        curentTime = 10;
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        curentTime--;
        if(map.get(message) == null || map.get(message) <= timestamp ){
            curentTime = curentTime + timestamp;
            map.put(message, timestamp+10);
            return true;
        }
        // curentTime = curentTime - map.get(message);
        // map.put(message, timestamp);
        return false;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */