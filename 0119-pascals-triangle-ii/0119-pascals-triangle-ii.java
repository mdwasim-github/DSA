class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); 
        long curr = 1;

        for (int i = 0; i < rowIndex; i++) {
            curr = curr * (rowIndex - i) / (i + 1);
            row.add((int) curr);
        }
        return row;
    }
}