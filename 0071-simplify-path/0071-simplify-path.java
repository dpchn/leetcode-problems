class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();

        String str[] = path.split("/");
        for(String s: str){
            if(s.isEmpty() || s.equals("."))
                continue;
            
            if(s.equals("..")){
                stack.pollLast();
            }else{
                stack.offerLast(s);
            }
        }

        String s = String.join("/", stack);
        return  "/"+s;

    }
}