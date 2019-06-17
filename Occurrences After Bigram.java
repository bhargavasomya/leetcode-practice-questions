//Given words first and second, consider occurrences in some text of the form "first second third", where second comes immediately after first, and third comes immediately after second.

//For each such occurrence, add "third" to the answer, and return the answer.

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
    String[] arr = text.split(" ");
    int len = arr.length;
    int pos = 0;
    StringBuilder sb = new StringBuilder();
    while (pos < len) {
        if (pos+1<len && arr[pos].equalsIgnoreCase(first) && arr[pos + 1].equalsIgnoreCase(second)) {
            if (pos + 2 < len) {
                sb.append(arr[pos + 2]);
                sb.append(",");
            }
        }
        pos++;
    }
    // System.out.println(sb.toString());
    String[] result = new String[0];
    if(sb.toString().length()>1)
        result = sb.toString().substring(0, sb.toString().length() - 1).split(",");
    return result;
}
}
