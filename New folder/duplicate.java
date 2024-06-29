public class duplicate {
    public static void removeDuplicate(String str, int indx, StringBuilder newStr, boolean map[]){
        if(indx == str.length()){
            System.out.println(newStr);
            return;
        }
        char newChar = str.charAt(indx);
        if(map[newChar -'a'] == true){
            removeDuplicate(str, indx+1, newStr, map);
        } else{
            map[newChar-'a'] = true;
            removeDuplicate(str, indx+1, newStr.append(newChar), map);
        }
    } 
    public static void main(String[] args) {
        String str = "pavan";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
