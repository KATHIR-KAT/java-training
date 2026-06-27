import java.util.*;
public class twoPointer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8, 9};
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the target: ");
		int target = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Found: " + arr[left] + " " + arr[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("No pair found");
    }
}