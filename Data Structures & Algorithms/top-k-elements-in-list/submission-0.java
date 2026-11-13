  
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Max Heap
        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        // Put all unique numbers into heap
        for(int num : map.keySet()) {
            pq.add(num);
        }

        // Take top k
        int[] arr = new int[k];

        for(int i = 0; i < k; i++) {
            arr[i] = pq.poll();
        }

        return arr;
    }
}
