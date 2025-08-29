class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        int i = 0;

        if (ruleKey.equals("type")) {
            i = 0;
        } else if (ruleKey.equals("color")) {
            i = 1;
        } else if (ruleKey.equals("name")) {
            i = 2;
        }

        for (List<String> x : items) {
            if (x.get(i).equals(ruleValue)) {
                ans++;
            }
        }
        return ans;
    }
}