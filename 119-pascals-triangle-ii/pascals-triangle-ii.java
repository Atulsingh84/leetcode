class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // First element is always 1

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1); // First element is always 1

            for (int j = 1; j < row.size(); j++) {
                newRow.add(row.get(j - 1) + row.get(j)); // Middle values
            }

            newRow.add(1); // Last element is always 1
            row = newRow;  // Move to next row
        }
        return row;
    }
}