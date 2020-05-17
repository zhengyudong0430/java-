/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-05-17
 * Time: 15:34
 */
public class Interview {
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int n1 = nums1.length, n2 = nums2.length;
        List<List<Integer>> result = new ArrayList<>();
        
        
        if (n1 == 0 || n2 == 0 || k == 0) return result;
        
        int[][] arr = new int[n1 * n2][2];
        int idx = 0;

        for (int i = 0; i < n1; i++) {
        	for (int j = 0; j < n2; j++) {
        		arr[idx][0] = nums1[i];
        		arr[idx][1] = nums2[j];
        		idx++;
        	}
        }

        Arrays.sort(arr, (o1, o2) -> (o1[0] + o1[1]) - (o2[0] + o2[1]));

        for (int i = 0; i < Math.min(k, arr.length); i++) {
        	List<Integer> temp = new ArrayList<>();
        	temp.add(arr[i][0]);
        	temp.add(arr[i][1]);
        	result.add(temp);
        }

        return result;
    }
}

